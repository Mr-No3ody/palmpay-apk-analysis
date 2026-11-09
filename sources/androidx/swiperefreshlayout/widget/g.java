package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f17905b;

    public /* synthetic */ g(SwipeRefreshLayout swipeRefreshLayout, int i7) {
        this.f17904a = i7;
        this.f17905b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f17904a) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = this.f17905b;
                int iAbs = !swipeRefreshLayout.mUsingCustomStart ? swipeRefreshLayout.mSpinnerOffsetEnd - Math.abs(swipeRefreshLayout.mOriginalOffsetTop) : swipeRefreshLayout.mSpinnerOffsetEnd;
                int i7 = swipeRefreshLayout.mFrom;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((i7 + ((int) ((iAbs - i7) * f10))) - swipeRefreshLayout.mCircleView.getTop());
                c cVar = swipeRefreshLayout.mProgress;
                float f11 = 1.0f - f10;
                b bVar = cVar.f17893a;
                if (f11 != bVar.f17885p) {
                    bVar.f17885p = f11;
                }
                cVar.invalidateSelf();
                break;
            case 1:
                SwipeRefreshLayout swipeRefreshLayout2 = this.f17905b;
                float f12 = swipeRefreshLayout2.mStartingScale;
                swipeRefreshLayout2.setAnimationProgress(((-f12) * f10) + f12);
                swipeRefreshLayout2.moveToStart(f10);
                break;
            case 2:
                this.f17905b.setAnimationProgress(f10);
                break;
            case 3:
                this.f17905b.setAnimationProgress(1.0f - f10);
                break;
            default:
                this.f17905b.moveToStart(f10);
                break;
        }
    }
}
