package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okhttp3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1944l {
    public /* synthetic */ C1944l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final String pin(@NotNull Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + sha256Hash((X509Certificate) certificate).a();
    }

    @JvmStatic
    @NotNull
    public final Pg.m sha1Hash(@NotNull X509Certificate x509Certificate) {
        Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
        Pg.l lVar = Pg.m.f7359d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
        return Pg.l.of$default(lVar, encoded, 0, 0, 3, null).c("SHA-1");
    }

    @JvmStatic
    @NotNull
    public final Pg.m sha256Hash(@NotNull X509Certificate x509Certificate) {
        Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
        Pg.l lVar = Pg.m.f7359d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
        return Pg.l.of$default(lVar, encoded, 0, 0, 3, null).c("SHA-256");
    }

    private C1944l() {
    }
}
