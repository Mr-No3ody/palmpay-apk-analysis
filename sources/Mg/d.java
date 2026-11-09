package Mg;

import Jg.t;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final e get(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return t.f4869a.get().b(trustManager);
    }

    private d() {
    }

    @NotNull
    public final e get(@NotNull X509Certificate... caCerts) {
        Intrinsics.checkNotNullParameter(caCerts, "caCerts");
        return new b(new c((X509Certificate[]) Arrays.copyOf(caCerts, caCerts.length)));
    }
}
