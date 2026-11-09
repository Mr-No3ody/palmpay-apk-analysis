package I5;

import android.animation.Animator;
import com.mikepenz.iconics.animation.IconicsAnimationListener;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IconicsAnimationProcessor f4018a;

    public c(IconicsAnimationProcessor iconicsAnimationProcessor) {
        this.f4018a = iconicsAnimationProcessor;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        IconicsAnimationProcessor iconicsAnimationProcessor = this.f4018a;
        List list = iconicsAnimationProcessor.listeners;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((IconicsAnimationListener) it.next()).onAnimationCancel(iconicsAnimationProcessor);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation, boolean z3) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        IconicsAnimationProcessor iconicsAnimationProcessor = this.f4018a;
        List list = iconicsAnimationProcessor.listeners;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((IconicsAnimationListener) it.next()).onAnimationEnd(iconicsAnimationProcessor, z3);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        IconicsAnimationProcessor iconicsAnimationProcessor = this.f4018a;
        List list = iconicsAnimationProcessor.listeners;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((IconicsAnimationListener) it.next()).onAnimationRepeat(iconicsAnimationProcessor);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation, boolean z3) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        IconicsAnimationProcessor iconicsAnimationProcessor = this.f4018a;
        List list = iconicsAnimationProcessor.listeners;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((IconicsAnimationListener) it.next()).onAnimationStart(iconicsAnimationProcessor, z3);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        IconicsAnimationProcessor iconicsAnimationProcessor = this.f4018a;
        List list = iconicsAnimationProcessor.listeners;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((IconicsAnimationListener) it.next()).onAnimationEnd(iconicsAnimationProcessor);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        IconicsAnimationProcessor iconicsAnimationProcessor = this.f4018a;
        List list = iconicsAnimationProcessor.listeners;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((IconicsAnimationListener) it.next()).onAnimationStart(iconicsAnimationProcessor);
            }
        }
    }
}
