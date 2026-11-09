package T;

import androidx.constraintlayout.core.motion.utils.StopEngine;

/* JADX INFO: loaded from: classes.dex */
public final class a extends androidx.constraintlayout.motion.widget.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O.k f8910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O.i f8911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StopEngine f8912c;

    public a() {
        O.k kVar = new O.k();
        kVar.f6521l = false;
        this.f8910a = kVar;
        this.f8912c = kVar;
    }

    @Override // androidx.constraintlayout.motion.widget.n
    public final float a() {
        return this.f8912c.getVelocity();
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        O.k kVar = this.f8910a;
        this.f8912c = kVar;
        kVar.f6522m = f10;
        boolean z3 = f10 > f11;
        kVar.f6521l = z3;
        if (z3) {
            kVar.a(-f12, f10 - f11, f14, f15, f13);
        } else {
            kVar.a(f12, f11 - f10, f14, f15, f13);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return this.f8912c.getInterpolation(f10);
    }
}
