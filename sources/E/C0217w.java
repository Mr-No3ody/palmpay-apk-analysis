package E;

import java.util.ArrayList;

/* JADX INFO: renamed from: E.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0217w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2133d;

    public C0217w(X x3) {
        this.f2130a = new ArrayList();
        this.f2131b = new ArrayList();
        this.f2132c = new ArrayList();
        this.f2133d = 5000L;
        a(x3, 1);
    }

    public final void a(X x3, int i7) {
        p118hf.a.g(i7 >= 1 && i7 <= 7, "Invalid metering mode " + i7);
        if ((i7 & 1) != 0) {
            this.f2130a.add(x3);
        }
        if ((i7 & 2) != 0) {
            this.f2131b.add(x3);
        }
    }

    public final void b(int i7) {
        if ((i7 & 1) != 0) {
            this.f2130a.clear();
        }
        if ((i7 & 2) != 0) {
            this.f2131b.clear();
        }
        if ((i7 & 4) != 0) {
            this.f2132c.clear();
        }
    }

    public C0217w(C0218x c0218x) {
        ArrayList arrayList = new ArrayList();
        this.f2130a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f2131b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f2132c = arrayList3;
        this.f2133d = 5000L;
        arrayList.addAll(c0218x.f2134a);
        arrayList2.addAll(c0218x.f2135b);
        arrayList3.addAll(c0218x.f2136c);
        this.f2133d = c0218x.f2137d;
    }
}
