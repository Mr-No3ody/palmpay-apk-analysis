package com.google.net.cronet.okhttptransport;

import Pg.AbstractC0555b;
import androidx.annotation.NonNull;
import com.airbnb.lottie.model.layer.d;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Uninterruptibles;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.L;
import okhttp3.W;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.h0;
import okio.Source;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes3.dex */
final class ResponseConverter {
    private static final String CONTENT_ENCODING_HEADER_NAME = "Content-Encoding";
    private static final String CONTENT_LENGTH_HEADER_NAME = "Content-Length";
    private static final String CONTENT_TYPE_HEADER_NAME = "Content-Type";
    private static final ImmutableSet<String> ENCODINGS_HANDLED_BY_CRONET = ImmutableSet.of("br", "deflate", "gzip", "x-gzip");
    private static final Splitter COMMA_SPLITTER = Splitter.on(',').trimResults().omitEmptyStrings();

    private static W convertProtocol(String str) {
        if (str.contains("quic")) {
            return W.QUIC;
        }
        if (str.contains("h3")) {
            return W.QUIC;
        }
        if (str.contains("spdy")) {
            return W.HTTP_2;
        }
        if (str.contains("h2")) {
            return W.HTTP_2;
        }
        return str.contains("http/1.1") ? W.HTTP_1_1 : W.HTTP_1_0;
    }

    private static d0 createResponse(Y request, UrlResponseInfo urlResponseInfo, @Nullable Source source) throws IOException {
        d0 d0Var = new d0();
        String lastHeaderValue = getLastHeaderValue("Content-Type", urlResponseInfo);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) getOrDefault(urlResponseInfo.getAllHeaders(), "Content-Encoding", Collections.EMPTY_LIST)).iterator();
        while (it.hasNext()) {
            Iterables.addAll(arrayList, COMMA_SPLITTER.split((String) it.next()));
        }
        boolean z3 = arrayList.isEmpty() || !ENCODINGS_HANDLED_BY_CRONET.containsAll(arrayList);
        h0 h0VarCreateResponseBody = source != null ? createResponseBody(request, urlResponseInfo.getHttpStatusCode(), lastHeaderValue, z3 ? getLastHeaderValue("Content-Length", urlResponseInfo) : null, source) : null;
        Intrinsics.checkNotNullParameter(request, "request");
        d0Var.f40715a = request;
        d0Var.f40717c = urlResponseInfo.getHttpStatusCode();
        String message = urlResponseInfo.getHttpStatusText();
        Intrinsics.checkNotNullParameter(message, "message");
        d0Var.f40718d = message;
        W protocol = convertProtocol(urlResponseInfo.getNegotiatedProtocol());
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        d0Var.f40716b = protocol;
        d0Var.f40721g = h0VarCreateResponseBody;
        for (Map.Entry<String, String> entry : urlResponseInfo.getAllHeadersAsList()) {
            if (z3 || (!Ascii.equalsIgnoreCase(entry.getKey(), "Content-Length") && !Ascii.equalsIgnoreCase(entry.getKey(), "Content-Encoding"))) {
                String name = entry.getKey();
                String value = entry.getValue();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                d0Var.f40720f.b(name, value);
            }
        }
        return d0Var;
    }

    private static h0 createResponseBody(Y y8, int i7, @Nullable String str, @Nullable String str2, Source source) throws IOException {
        long j6;
        if (y8.f40686b.equals("HEAD")) {
            j6 = 0;
        } else {
            j6 = -1;
            if (str2 != null) {
                try {
                    j6 = Long.parseLong(str2);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if ((i7 == 204 || i7 == 205) && j6 > 0) {
            throw new ProtocolException(d.j("HTTP ", i7, " had non-zero Content-Length: ", str2));
        }
        return h0.create(str != null ? L.f40589e.parse(str) : null, j6, AbstractC0555b.c(source));
    }

    private static <T> T getFutureValue(Future<T> future) throws IOException {
        try {
            return (T) Uninterruptibles.getUninterruptibly(future);
        } catch (ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    @Nullable
    private static String getLastHeaderValue(String str, UrlResponseInfo urlResponseInfo) {
        List<String> list = urlResponseInfo.getAllHeaders().get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) Iterables.getLast(list);
    }

    private static <K, V> V getOrDefault(Map<K, V> map, K k2, @NonNull V v3) {
        V v4 = map.get(k2);
        return v4 == null ? (V) Preconditions.checkNotNull(v3) : v4;
    }

    /* JADX INFO: renamed from: toResponse, reason: merged with bridge method [inline-methods] */
    public e0 lambda$toResponseAsync$0(Y y8, OkHttpBridgeRequestCallback okHttpBridgeRequestCallback) throws IOException {
        UrlResponseInfo urlResponseInfo = (UrlResponseInfo) getFutureValue(okHttpBridgeRequestCallback.getUrlResponseInfo());
        d0 d0VarCreateResponse = createResponse(y8, urlResponseInfo, (Source) getFutureValue(okHttpBridgeRequestCallback.getBodySource()));
        List<UrlResponseInfo> urlResponseInfoChain = okHttpBridgeRequestCallback.getUrlResponseInfoChain();
        List<String> urlChain = urlResponseInfo.getUrlChain();
        if (!urlResponseInfoChain.isEmpty()) {
            Preconditions.checkArgument(urlChain.size() == urlResponseInfoChain.size() + 1, "The number of redirects should be consistent across URLs and headers!");
            e0 e0VarA = null;
            for (int i7 = 0; i7 < urlResponseInfoChain.size(); i7++) {
                X xB = y8.b();
                xB.k(urlChain.get(i7));
                d0 d0VarCreateResponse2 = createResponse(xB.b(), urlResponseInfoChain.get(i7), null);
                if (e0VarA != null) {
                    d0VarCreateResponse2.getClass();
                    if (e0VarA.f40734g != null) {
                        throw new IllegalArgumentException("priorResponse.body != null");
                    }
                }
                d0VarCreateResponse2.f40724j = e0VarA;
                e0VarA = d0VarCreateResponse2.a();
            }
            X xB2 = y8.b();
            xB2.k((String) Iterables.getLast(urlChain));
            Y request = xB2.b();
            d0VarCreateResponse.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            d0VarCreateResponse.f40715a = request;
            if (e0VarA != null && e0VarA.f40734g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
            d0VarCreateResponse.f40724j = e0VarA;
        }
        return d0VarCreateResponse.a();
    }

    public ListenableFuture<e0> toResponseAsync(final Y y8, final OkHttpBridgeRequestCallback okHttpBridgeRequestCallback) {
        return Futures.whenAllComplete(okHttpBridgeRequestCallback.getUrlResponseInfo(), okHttpBridgeRequestCallback.getBodySource()).call(new Callable() { // from class: com.google.net.cronet.okhttptransport.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f23097a.lambda$toResponseAsync$0(y8, okHttpBridgeRequestCallback);
            }
        }, MoreExecutors.directExecutor());
    }
}
