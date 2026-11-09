package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f17902c;

    public e(SwipeRefreshLayout swipeRefreshLayout, int i7, int i10) {
        this.f17902c = swipeRefreshLayout;
        this.f17900a = i7;
        this.f17901b = i10;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        c cVar = this.f17902c.mProgress;
        int i7 = this.f17900a;
        cVar.setAlpha((int) (((this.f17901b - i7) * f10) + i7));
    }
}
