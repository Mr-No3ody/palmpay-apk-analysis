package com.facebook.react.devsupport.inspector;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.F;
import okhttp3.S;
import okhttp3.U;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.e0;
import okhttp3.h0;
import org.chromium.support_lib_boundary.util.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/devsupport/inspector/InspectorNetworkHelper;", "", "<init>", "()V", "", "url", "Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "loadNetworkResource", "(Ljava/lang/String;Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;)V", "Lokhttp3/U;", "client", "Lokhttp3/U;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InspectorNetworkHelper {

    @NotNull
    public static final InspectorNetworkHelper INSTANCE = new InspectorNetworkHelper();
    private static U client;

    private InspectorNetworkHelper() {
    }

    @JvmStatic
    public static final void loadNetworkResource(@NotNull String url, @NotNull final InspectorNetworkRequestListener listener) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (client == null) {
            S s3 = new S();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            s3.b(10L, timeUnit);
            s3.f(10L, timeUnit);
            s3.e(0L, TimeUnit.MINUTES);
            client = new U(s3);
        }
        try {
            X x3 = new X();
            x3.k(url);
            Y yB = x3.b();
            U u6 = client;
            if (u6 != null) {
                FirebasePerfOkHttpClient.enqueue(u6.newCall(yB), new Callback() { // from class: com.facebook.react.devsupport.inspector.InspectorNetworkHelper.loadNetworkResource.1
                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException e10) {
                        Intrinsics.checkNotNullParameter(call, "call");
                        Intrinsics.checkNotNullParameter(e10, "e");
                        if (call.isCanceled()) {
                            return;
                        }
                        listener.onError(e10.getMessage());
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, e0 response) {
                        Intrinsics.checkNotNullParameter(call, "call");
                        Intrinsics.checkNotNullParameter(response, "response");
                        F f10 = response.f40733f;
                        HashMap map = new HashMap();
                        for (String str : f10.c()) {
                            map.put(str, f10.a(str));
                        }
                        listener.onHeaders(response.f40731d, map);
                        try {
                            h0 h0Var = response.f40734g;
                            InspectorNetworkRequestListener inspectorNetworkRequestListener = listener;
                            if (h0Var != null) {
                                try {
                                    InputStream inputStreamByteStream = h0Var.byteStream();
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        try {
                                            int i7 = inputStreamByteStream.read(bArr);
                                            if (i7 == -1) {
                                                break;
                                            } else {
                                                inspectorNetworkRequestListener.onData(new String(bArr, 0, i7, Charsets.UTF_8));
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                b.o(inputStreamByteStream, th);
                                                throw th2;
                                            }
                                        }
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            b.o(h0Var, th);
                                            throw th3;
                                        }
                                    }
                                    Unit unit = Unit.f38893a;
                                    b.o(inputStreamByteStream, null);
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                            inspectorNetworkRequestListener.onCompletion();
                            Unit unit2 = Unit.f38893a;
                            b.o(h0Var, null);
                        } catch (IOException e10) {
                            listener.onError(e10.getMessage());
                        }
                    }
                });
            } else {
                Intrinsics.n("client");
                throw null;
            }
        } catch (IllegalArgumentException unused) {
            listener.onError("Not a valid URL: " + url);
        }
    }
}
