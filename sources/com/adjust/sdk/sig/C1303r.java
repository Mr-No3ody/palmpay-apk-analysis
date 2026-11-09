package com.adjust.sdk.sig;

/* JADX INFO: renamed from: com.adjust.sdk.sig.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1303r implements g0, r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2 f19503b;

    public /* synthetic */ C1303r(d2 d2Var, int i7) {
        this.f19502a = i7;
        this.f19503b = d2Var;
    }

    @Override // com.adjust.sdk.sig.g0
    public Object a() {
        switch (this.f19502a) {
            case 0:
                return d2.b(this.f19503b);
            case 1:
                return d2.c(this.f19503b);
            default:
                return Integer.valueOf(d2.a(this.f19503b));
        }
    }

    @Override // com.adjust.sdk.sig.r0
    public Object a(Object obj) {
        return e2.a(this.f19503b, ((Integer) obj).intValue());
    }
}
