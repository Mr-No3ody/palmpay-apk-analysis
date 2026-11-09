package Cg;

import C0.G;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Dns {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1553c;

    public a(String dnsHostname, List dnsServers) {
        Intrinsics.checkNotNullParameter(dnsHostname, "dnsHostname");
        Intrinsics.checkNotNullParameter(dnsServers, "dnsServers");
        this.f1552b = dnsHostname;
        this.f1553c = dnsServers;
    }

    @Override // okhttp3.Dns
    public final List lookup(String hostname) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        String str = this.f1552b;
        if (Intrinsics.c(str, hostname)) {
            return this.f1553c;
        }
        throw new UnknownHostException(G.p("BootstrapDns called for ", hostname, " instead of ", str));
    }
}
