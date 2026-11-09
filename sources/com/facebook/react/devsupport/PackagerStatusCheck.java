package com.facebook.react.devsupport;

import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.S;
import okhttp3.U;
import okhttp3.X;
import okhttp3.e0;
import okhttp3.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/devsupport/PackagerStatusCheck;", "", "<init>", "()V", "Lokhttp3/U;", "client", "(Lokhttp3/U;)V", "", "host", "Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;", "callback", "", "run", "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V", "Lokhttp3/U;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PackagerStatusCheck {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int HTTP_CONNECT_TIMEOUT_MS = 5000;

    @NotNull
    private static final String PACKAGER_OK_STATUS = "packager-status:running";

    @NotNull
    private static final String PACKAGER_STATUS_URL_TEMPLATE = "http://%s/status";

    @NotNull
    private final U client;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/devsupport/PackagerStatusCheck$Companion;", "", "<init>", "()V", "PACKAGER_OK_STATUS", "", "HTTP_CONNECT_TIMEOUT_MS", "", "PACKAGER_STATUS_URL_TEMPLATE", "createPackagerStatusURL", "host", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createPackagerStatusURL(String host) {
            return com.airbnb.lottie.model.layer.d.o(new Object[]{host}, 1, Locale.US, PackagerStatusCheck.PACKAGER_STATUS_URL_TEMPLATE, "format(...)");
        }

        private Companion() {
        }
    }

    public PackagerStatusCheck() {
        S s3 = new S();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        s3.b(5000L, timeUnit);
        s3.e(0L, timeUnit);
        s3.f(0L, timeUnit);
        this.client = new U(s3);
    }

    public final void run(@NotNull String host, @NotNull final PackagerStatusCallback callback) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strCreatePackagerStatusURL = Companion.createPackagerStatusURL(host);
        X x3 = new X();
        x3.k(strCreatePackagerStatusURL);
        FirebasePerfOkHttpClient.enqueue(this.client.newCall(x3.b()), new Callback() { // from class: com.facebook.react.devsupport.PackagerStatusCheck.run.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e10) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e10, "e");
                p229p2.a.v("ReactNative", "The packager does not seem to be running as we got an IOException requesting its status: " + e10.getMessage());
                callback.onPackagerStatusFetched(false);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, e0 response) throws IOException {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!response.isSuccessful()) {
                    p229p2.a.h("ReactNative", "Got non-success http code from packager when requesting status: " + response.f40731d);
                    callback.onPackagerStatusFetched(false);
                    return;
                }
                h0 h0Var = response.f40734g;
                if (h0Var == null) {
                    p229p2.a.h("ReactNative", "Got null body response from packager when requesting status");
                    callback.onPackagerStatusFetched(false);
                    return;
                }
                String strString = h0Var.string();
                if (PackagerStatusCheck.PACKAGER_OK_STATUS.equals(strString)) {
                    callback.onPackagerStatusFetched(true);
                    return;
                }
                p229p2.a.h("ReactNative", "Got unexpected response from packager when requesting status: " + strString);
                callback.onPackagerStatusFetched(false);
            }
        });
    }

    public PackagerStatusCheck(@NotNull U client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }
}
