package Xb;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccelerateInterpolator f11108c = new AccelerateInterpolator(3.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DecelerateInterpolator f11109d = new DecelerateInterpolator(3.0f);

    @Override // Xb.c
    public final float a(float f10) {
        return this.f11108c.getInterpolation(f10);
    }

    @Override // Xb.c
    public final float b(float f10) {
        return this.f11109d.getInterpolation(f10);
    }

    @Override // Xb.c
    public final float c(float f10) {
        return 1.0f / (this.f11109d.getInterpolation(f10) + (1.0f - this.f11108c.getInterpolation(f10)));
    }
}
