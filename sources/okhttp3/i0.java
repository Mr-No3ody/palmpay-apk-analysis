package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1921a f40761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f40762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f40763c;

    public i0(C1921a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f40761a = address;
        this.f40762b = proxy;
        this.f40763c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.c(i0Var.f40761a, this.f40761a) && Intrinsics.c(i0Var.f40762b, this.f40762b) && Intrinsics.c(i0Var.f40763c, this.f40763c);
    }

    public final int hashCode() {
        return this.f40763c.hashCode() + ((this.f40762b.hashCode() + ((this.f40761a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f40763c + '}';
    }
}
