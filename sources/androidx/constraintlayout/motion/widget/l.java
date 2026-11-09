package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O.e f15373b;

    public /* synthetic */ l(O.e eVar, int i7) {
        this.f15372a = i7;
        this.f15373b = eVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.f15372a) {
            case 0:
                break;
            case 1:
                break;
        }
        return (float) this.f15373b.a(f10);
    }
}
