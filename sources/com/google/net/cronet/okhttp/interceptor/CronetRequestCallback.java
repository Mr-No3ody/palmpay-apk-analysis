package com.google.net.cronet.okhttp.interceptor;

import F1.b;
import android.os.ConditionVariable;
import com.adjust.sdk.Constants;
import com.google.common.net.HttpHeaders;
import com.google.net.cronet.okhttptransport.CronetLogHelper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.v;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.E;
import okhttp3.F;
import okhttp3.K;
import okhttp3.L;
import okhttp3.W;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.h0;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 22\u00020\u0001:\u00012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0013J+\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00100\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/google/net/cronet/okhttp/interceptor/CronetRequestCallback;", "Lorg/chromium/net/UrlRequest$Callback;", "Lokhttp3/Y;", "originRequest", "<init>", "(Lokhttp3/Y;)V", "Lokhttp3/e0;", "blockForResponse", "()Lokhttp3/e0;", "Lorg/chromium/net/UrlRequest;", "request", "Lorg/chromium/net/UrlResponseInfo;", "responseInfo", "", "newLocationUrl", "", "onRedirectReceived", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Ljava/lang/String;)V", "onResponseStarted", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;)V", "Ljava/nio/ByteBuffer;", "byteBuffer", "onReadCompleted", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Ljava/nio/ByteBuffer;)V", "onSucceeded", Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, "Lorg/chromium/net/CronetException;", "error", "onFailed", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Lorg/chromium/net/CronetException;)V", "onCanceled", "Lokhttp3/Y;", "", "redirectCount", "I", "response", "Lokhttp3/e0;", "Ljava/io/IOException;", "iOException", "Ljava/io/IOException;", "Landroid/os/ConditionVariable;", "responseLock", "Landroid/os/ConditionVariable;", "Ljava/io/ByteArrayOutputStream;", "receivedByteArrayOutputStream", "Ljava/io/ByteArrayOutputStream;", "Ljava/nio/channels/WritableByteChannel;", "kotlin.jvm.PlatformType", "receiveChannel", "Ljava/nio/channels/WritableByteChannel;", "Companion", "lib_cronet_okhttp_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CronetRequestCallback extends UrlRequest.Callback {

    @NotNull
    private static final String CONTENT_ENCODING_HEADER_NAME = "Content-Encoding";

    @NotNull
    private static final String CONTENT_LENGTH_HEADER_NAME = "Content-Length";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Set<String> ENCODINGS_HANDLED_BY_CRONET;

    @Nullable
    private IOException iOException;

    @NotNull
    private final Y originRequest;
    private final WritableByteChannel receiveChannel;

    @NotNull
    private final ByteArrayOutputStream receivedByteArrayOutputStream;
    private int redirectCount;

    @NotNull
    private e0 response;

    @NotNull
    private final ConditionVariable responseLock;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/google/net/cronet/okhttp/interceptor/CronetRequestCallback$Companion;", "", "<init>", "()V", "Lokhttp3/e0;", "response", "Lorg/chromium/net/UrlResponseInfo;", "responseInfo", "toOkResponse", "(Lokhttp3/e0;Lorg/chromium/net/UrlResponseInfo;)Lokhttp3/e0;", "", "key", "contentLengthHeaderName", "", "equalsIgnoreCase", "(Ljava/lang/String;Ljava/lang/String;)Z", "K", "V", "", "map", "defaultValue", "getOrDefault", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "CONTENT_ENCODING_HEADER_NAME", "Ljava/lang/String;", "CONTENT_LENGTH_HEADER_NAME", "", "ENCODINGS_HANDLED_BY_CRONET", "Ljava/util/Set;", "lib_cronet_okhttp_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean equalsIgnoreCase(String key, String contentLengthHeaderName) {
            if (key != null) {
                return key.equalsIgnoreCase(contentLengthHeaderName);
            }
            return false;
        }

        private final <K, V> V getOrDefault(Map<K, ? extends V> map, K key, V defaultValue) {
            V v3 = map.get(key);
            return v3 == null ? defaultValue : v3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final e0 toOkResponse(e0 response, UrlResponseInfo responseInfo) {
            List arrayList;
            CronetLogHelper cronetLogHelper = CronetLogHelper.INSTANCE;
            String negotiatedProtocol = responseInfo.getNegotiatedProtocol();
            Intrinsics.checkNotNullExpressionValue(negotiatedProtocol, "responseInfo.negotiatedProtocol");
            W protocol = cronetLogHelper.protocolFromCronet(negotiatedProtocol);
            ArrayList arrayList2 = new ArrayList(20);
            List<String> list = responseInfo.getAllHeaders().get("Content-Encoding");
            if (list != null) {
                arrayList = new ArrayList();
                for (String it : list) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    v.n(arrayList, StringsKt__StringsKt.split$default(it, new String[]{","}, false, 0, 6, null));
                }
            } else {
                arrayList = z.f38935a;
            }
            boolean z3 = arrayList.isEmpty() || !CronetRequestCallback.ENCODINGS_HANDLED_BY_CRONET.containsAll(arrayList);
            for (Map.Entry<String, String> entry : responseInfo.getAllHeadersAsList()) {
                Intrinsics.checkNotNullExpressionValue(entry, "responseInfo.allHeadersAsList");
                String name = entry.getKey();
                String value = entry.getValue();
                if (z3 || (!equalsIgnoreCase(name, "Content-Length") && !equalsIgnoreCase(name, "Content-Encoding"))) {
                    Intrinsics.checkNotNullExpressionValue(name, "key");
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(value, "value");
                    E e10 = F.f40566b;
                    e10.checkName(name);
                    e10.checkValue(value, name);
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(value, "value");
                    arrayList2.add(name);
                    arrayList2.add(StringsKt.V(value).toString());
                }
            }
            d0 d0VarC = response.c();
            d0VarC.f40726l = System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            d0VarC.f40716b = protocol;
            d0VarC.f40717c = responseInfo.getHttpStatusCode();
            String message = responseInfo.getHttpStatusText();
            Intrinsics.checkNotNullExpressionValue(message, "responseInfo.httpStatusText");
            Intrinsics.checkNotNullParameter(message, "message");
            d0VarC.f40718d = message;
            d0VarC.c(new F((String[]) arrayList2.toArray(new String[0])));
            return d0VarC.a();
        }

        private Companion() {
        }
    }

    static {
        String[] elements = {"br", "deflate", "gzip", "x-gzip"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet destination = new LinkedHashSet(kotlin.collections.F.a(4));
        Intrinsics.checkNotNullParameter(elements, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i7 = 0; i7 < 4; i7++) {
            destination.add(elements[i7]);
        }
        ENCODINGS_HANDLED_BY_CRONET = destination;
    }

    public CronetRequestCallback(@NotNull Y request) {
        Intrinsics.checkNotNullParameter(request, "originRequest");
        this.originRequest = request;
        this.responseLock = new ConditionVariable();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.receivedByteArrayOutputStream = byteArrayOutputStream;
        this.receiveChannel = Channels.newChannel(byteArrayOutputStream);
        b bVar = new b(3);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter("", "message");
        W protocol = W.HTTP_2;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        if (request == null) {
            throw new IllegalStateException("request == null");
        }
        this.response = new e0(request, protocol, "", 0, null, bVar.h(), null, null, null, null, jCurrentTimeMillis, 0L, null);
    }

    @NotNull
    public final e0 blockForResponse() throws IOException {
        this.responseLock.block();
        IOException iOException = this.iOException;
        if (iOException == null) {
            return this.response;
        }
        Intrinsics.f(iOException, "null cannot be cast to non-null type java.io.IOException");
        throw iOException;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onCanceled(@NotNull UrlRequest request, @Nullable UrlResponseInfo info) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.iOException == null) {
            this.iOException = new IOException("The request was canceled!");
        }
        this.responseLock.open();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(@NotNull UrlRequest request, @Nullable UrlResponseInfo info, @Nullable CronetException error) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.iOException = error;
        this.responseLock.open();
        if (error != null) {
            error.printStackTrace();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(@NotNull UrlRequest request, @NotNull UrlResponseInfo responseInfo, @NotNull ByteBuffer byteBuffer) throws Exception {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(responseInfo, "responseInfo");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        byteBuffer.flip();
        try {
            this.receiveChannel.write(byteBuffer);
        } catch (IOException e10) {
            this.iOException = e10;
        }
        byteBuffer.clear();
        request.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(@NotNull UrlRequest request, @NotNull UrlResponseInfo responseInfo, @NotNull String newLocationUrl) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(responseInfo, "responseInfo");
        Intrinsics.checkNotNullParameter(newLocationUrl, "newLocationUrl");
        int i7 = this.redirectCount;
        if (i7 <= 20) {
            this.redirectCount = i7 + 1;
            request.followRedirect();
        } else {
            request.cancel();
            this.iOException = new ProtocolException("Too many follow-up requests: " + this.redirectCount);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onResponseStarted(@NotNull UrlRequest request, @NotNull UrlResponseInfo responseInfo) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(responseInfo, "responseInfo");
        this.response = INSTANCE.toOkResponse(this.response, responseInfo);
        request.read(ByteBuffer.allocateDirect(32768));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onSucceeded(@NotNull UrlRequest request, @NotNull UrlResponseInfo responseInfo) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(responseInfo, "responseInfo");
        Thread.currentThread().getName();
        String strB = this.response.b(HttpHeaders.CONTENT_TYPE, "application/json");
        K k2 = L.f40589e;
        if (strB == null) {
            strB = "text/plain; charset=\"utf-8\"";
        }
        L l5 = k2.parse(strB);
        g0 g0Var = h0.Companion;
        byte[] byteArray = this.receivedByteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "receivedByteArrayOutputStream.toByteArray()");
        h0 h0VarCreate = g0Var.create(byteArray, l5);
        int httpStatusCode = responseInfo.getHttpStatusCode();
        if ((httpStatusCode == 204 || httpStatusCode == 205) && h0VarCreate.contentLength() > 0) {
            StringBuilder sbE = androidx.camera.camera2.internal.F.e(httpStatusCode, "HTTP ", " had non-zero Content-Length: ");
            sbE.append(h0VarCreate.contentLength());
            this.iOException = new ProtocolException(sbE.toString());
        }
        X xB = this.originRequest.b();
        String url = responseInfo.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "responseInfo.url");
        xB.k(url);
        Y request2 = xB.b();
        d0 d0VarC = this.response.c();
        d0VarC.f40721g = h0VarCreate;
        Intrinsics.checkNotNullParameter(request2, "request");
        d0VarC.f40715a = request2;
        this.response = d0VarC.a();
        this.responseLock.open();
    }
}
