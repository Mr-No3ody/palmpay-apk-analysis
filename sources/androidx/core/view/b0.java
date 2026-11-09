package androidx.core.view;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f16202e;

    public b0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f16202e = windowInsetsAnimation;
    }

    @Override // androidx.core.view.c0
    public final long a() {
        return this.f16202e.getDurationMillis();
    }

    @Override // androidx.core.view.c0
    public final float b() {
        return this.f16202e.getInterpolatedFraction();
    }

    @Override // androidx.core.view.c0
    public final int c() {
        return this.f16202e.getTypeMask();
    }

    @Override // androidx.core.view.c0
    public final void d(float f10) {
        this.f16202e.setFraction(f10);
    }
}
