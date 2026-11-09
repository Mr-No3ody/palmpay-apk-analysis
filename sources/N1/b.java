package N1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.chad.library.adapter.base.animation.BaseAnimation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements BaseAnimation {
    static {
        new a(null);
    }

    @Override // com.chad.library.adapter.base.animation.BaseAnimation
    public final Animator[] animators(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        animator.setDuration(300L);
        animator.setInterpolator(new LinearInterpolator());
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        return new Animator[]{animator};
    }
}
