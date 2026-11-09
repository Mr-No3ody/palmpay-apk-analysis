package okhttp3;

import com.adjust.sdk.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okhttp3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1921a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dns f40694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f40695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f40696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f40697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1945m f40698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1922b f40699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Proxy f40700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProxySelector f40701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J f40702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f40703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f40704k;

    public C1921a(String uriHost, int i7, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C1945m c1945m, C1922b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f40694a = dns;
        this.f40695b = socketFactory;
        this.f40696c = sSLSocketFactory;
        this.f40697d = hostnameVerifier;
        this.f40698e = c1945m;
        this.f40699f = proxyAuthenticator;
        this.f40700g = proxy;
        this.f40701h = proxySelector;
        H h7 = new H();
        h7.h(sSLSocketFactory != null ? Constants.SCHEME : "http");
        h7.d(uriHost);
        h7.f(i7);
        this.f40702i = h7.b();
        this.f40703j = Dg.c.y(protocols);
        this.f40704k = Dg.c.y(connectionSpecs);
    }

    public final boolean a(C1921a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.c(this.f40694a, that.f40694a) && Intrinsics.c(this.f40699f, that.f40699f) && Intrinsics.c(this.f40703j, that.f40703j) && Intrinsics.c(this.f40704k, that.f40704k) && Intrinsics.c(this.f40701h, that.f40701h) && Intrinsics.c(this.f40700g, that.f40700g) && Intrinsics.c(this.f40696c, that.f40696c) && Intrinsics.c(this.f40697d, that.f40697d) && Intrinsics.c(this.f40698e, that.f40698e) && this.f40702i.f40583e == that.f40702i.f40583e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1921a)) {
            return false;
        }
        C1921a c1921a = (C1921a) obj;
        return Intrinsics.c(this.f40702i, c1921a.f40702i) && a(c1921a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f40698e) + ((Objects.hashCode(this.f40697d) + ((Objects.hashCode(this.f40696c) + ((Objects.hashCode(this.f40700g) + ((this.f40701h.hashCode() + ((this.f40704k.hashCode() + ((this.f40703j.hashCode() + ((this.f40699f.hashCode() + ((this.f40694a.hashCode() + C0.G.c(527, 31, this.f40702i.f40587i)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Address{");
        J j6 = this.f40702i;
        sb2.append(j6.f40582d);
        sb2.append(':');
        sb2.append(j6.f40583e);
        sb2.append(", ");
        Proxy proxy = this.f40700g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f40701h;
        }
        return androidx.camera.video.u.p(sb2, str, '}');
    }
}
