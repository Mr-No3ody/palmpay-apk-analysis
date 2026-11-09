package androidx.core.view;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16183c;

    public /* synthetic */ T(int i7, Object obj, Object obj2) {
        this.f16181a = i7;
        this.f16182b = obj;
        this.f16183c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16181a) {
            case 0:
                ((androidx.appcompat.app.y) this.f16182b).onAnimationUpdate((View) this.f16183c);
                break;
            case 1:
                ((AppBarLayout) this.f16182b).lambda$initializeLiftOnScrollWithElevation$1((MaterialShapeDrawable) this.f16183c, valueAnimator);
                break;
            case 2:
                ((ExpandCollapseAnimationHelper) this.f16182b).lambda$getExpandCollapseAnimator$0((Rect) this.f16183c, valueAnimator);
                break;
            default:
                ((DeterminateDrawable) this.f16182b).lambda$new$0((BaseProgressIndicatorSpec) this.f16183c, valueAnimator);
                break;
        }
    }
}
