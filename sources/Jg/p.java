package Jg;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f4864d = new o(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f4865e;

    static {
        String property = System.getProperty("java.specification.version");
        Integer intOrNull = property != null ? StringsKt.toIntOrNull(property) : null;
        boolean z3 = true;
        if (intOrNull == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
                z3 = false;
            }
        } else if (intOrNull.intValue() < 9) {
            z3 = false;
        }
        f4865e = z3;
    }

    @Override // Jg.t
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) t.f4869a.alpnProtocolNames(protocols).toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // Jg.t
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
