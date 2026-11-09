package Wf;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends AbstractC0761e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f10853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f10854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0768l f10855g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f10856i;

    public g0(n0 n0Var, h0 h0Var, C0768l c0768l, Object obj) {
        this.f10853e = n0Var;
        this.f10854f = h0Var;
        this.f10855g = c0768l;
        this.f10856i = obj;
    }

    @Override // Wf.AbstractC0761e0
    public final boolean g() {
        return false;
    }

    @Override // Wf.AbstractC0761e0
    public final void h(Throwable th) {
        C0768l c0768l = this.f10855g;
        n0 n0Var = this.f10853e;
        n0Var.getClass();
        C0768l c0768lY = n0.y(c0768l);
        h0 h0Var = this.f10854f;
        Object obj = this.f10856i;
        if (c0768lY == null || !n0Var.I(h0Var, c0768lY, obj)) {
            h0Var.f10862a.a(new p015ag.h(2), 2);
            C0768l c0768lY2 = n0.y(c0768l);
            if (c0768lY2 == null || !n0Var.I(h0Var, c0768lY2, obj)) {
                n0Var.a(n0Var.k(h0Var, obj));
            }
        }
    }
}
