package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17167g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f17169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f17171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f17173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f17174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f17175o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f17177q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17161a = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17168h = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17176p = false;

    public final void a(Fragment fragment, int i7) {
        d(i7, fragment, null, 1);
    }

    public final void b(j0 j0Var) {
        this.f17161a.add(j0Var);
        j0Var.f17155d = this.f17162b;
        j0Var.f17156e = this.f17163c;
        j0Var.f17157f = this.f17164d;
        j0Var.f17158g = this.f17165e;
    }

    public final void c(String str) {
        if (!this.f17168h) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f17167g = true;
        this.f17169i = str;
    }

    public abstract void d(int i7, Fragment fragment, String str, int i10);

    public final void e(int i7, Fragment fragment, String str) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        d(i7, fragment, str, 2);
    }

    public final void f(int i7, int i10, int i11, int i12) {
        this.f17162b = i7;
        this.f17163c = i10;
        this.f17164d = i11;
        this.f17165e = i12;
    }
}
