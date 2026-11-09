package Cg;

import java.util.List;
import okhttp3.C1953v;
import okhttp3.Dns;
import okhttp3.J;
import okhttp3.S;
import okhttp3.U;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U f1554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J f1555b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1557d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f1559f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1556c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1953v f1558e = Dns.f40565a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1560g = true;

    public final d a() {
        U u6 = this.f1554a;
        if (u6 == null) {
            throw new NullPointerException("client not set");
        }
        S sA = u6.a();
        sA.c(d.f1561g.buildBootstrapClient(this));
        U u10 = new U(sA);
        J j6 = this.f1555b;
        if (j6 != null) {
            return new d(u10, j6, this.f1556c, this.f1557d, this.f1560g);
        }
        throw new IllegalStateException("url not set");
    }
}
