package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.C1847n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okhttp3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1953v implements Dns {
    @Override // okhttp3.Dns
    public final List lookup(String hostname) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
            return C1847n.y(allByName);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException(C0.G.o("Broken system behaviour for dns lookup of ", hostname));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }
}
