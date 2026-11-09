package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes4.dex */
public final class C {
    public /* synthetic */ C(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
        return certificateArr != null ? Dg.c.l(Arrays.copyOf(certificateArr, certificateArr.length)) : kotlin.collections.z.f38935a;
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "sslSession.handshake()", imports = {}))
    @JvmName(name = "-deprecated_get")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
    public final D m127deprecated_get(@NotNull SSLSession sslSession) throws IOException {
        Intrinsics.checkNotNullParameter(sslSession, "sslSession");
        return get(sslSession);
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    public final D get(@NotNull SSLSession sSLSession) throws IOException {
        List<Certificate> immutableList;
        Intrinsics.checkNotNullParameter(sSLSession, "<this>");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        C1947o c1947oForJavaName = C1947o.f40951b.forJavaName(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        k0 k0VarForJavaName = k0.f40939b.forJavaName(protocol);
        try {
            immutableList = toImmutableList(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            immutableList = kotlin.collections.z.f38935a;
        }
        return new D(k0VarForJavaName, c1947oForJavaName, toImmutableList(sSLSession.getLocalCertificates()), new B(immutableList, 1));
    }

    private C() {
    }

    @JvmStatic
    @NotNull
    public final D get(@NotNull k0 tlsVersion, @NotNull C1947o cipherSuite, @NotNull List<? extends Certificate> peerCertificates, @NotNull List<? extends Certificate> localCertificates) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        return new D(tlsVersion, cipherSuite, Dg.c.y(localCertificates), new B(Dg.c.y(peerCertificates), 0));
    }
}
