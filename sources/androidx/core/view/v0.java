package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends u0 {
    @Override // androidx.core.view.u0, org.chromium.support_lib_boundary.util.b
    public final boolean N() {
        return (this.f16292p.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // androidx.core.view.u0, org.chromium.support_lib_boundary.util.b
    public final void h0() {
        this.f16292p.setSystemBarsBehavior(2);
    }
}
