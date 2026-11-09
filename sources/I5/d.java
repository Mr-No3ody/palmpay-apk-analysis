package I5;

import android.animation.Animator;
import com.mikepenz.iconics.animation.IconicsAnimationPauseListener;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Animator.AnimatorPauseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IconicsAnimationProcessor f4019a;

    public d(IconicsAnimationProcessor iconicsAnimationProcessor) {
        this.f4019a = iconicsAnimationProcessor;
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        IconicsAnimationProcessor iconicsAnimationProcessor = this.f4019a;
        List list = iconicsAnimationProcessor.pauseListeners;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((IconicsAnimationPauseListener) it.next()).onAnimationPause(iconicsAnimationProcessor);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        IconicsAnimationProcessor iconicsAnimationProcessor = this.f4019a;
        List list = iconicsAnimationProcessor.pauseListeners;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((IconicsAnimationPauseListener) it.next()).onAnimationResume(iconicsAnimationProcessor);
            }
        }
    }
}
