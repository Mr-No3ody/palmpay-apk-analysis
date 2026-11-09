package N1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.chad.library.adapter.base.animation.BaseAnimation;
import com.facebook.react.uimanager.ViewProps;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements BaseAnimation {
    static {
        new c(null);
    }

    @Override // com.chad.library.adapter.base.animation.BaseAnimation
    public final Animator[] animators(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(view, ViewProps.SCALE_X, 0.5f, 1.0f);
        scaleX.setDuration(300L);
        scaleX.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator scaleY = ObjectAnimator.ofFloat(view, ViewProps.SCALE_Y, 0.5f, 1.0f);
        scaleY.setDuration(300L);
        scaleY.setInterpolator(new DecelerateInterpolator());
        Intrinsics.checkNotNullExpressionValue(scaleX, "scaleX");
        Intrinsics.checkNotNullExpressionValue(scaleY, "scaleY");
        return new Animator[]{scaleX, scaleY};
    }
}
