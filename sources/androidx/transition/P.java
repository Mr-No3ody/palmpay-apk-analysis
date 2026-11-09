package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    @DoNotInline
    public static long a(Animator animator) {
        return animator.getTotalDuration();
    }

    @DoNotInline
    public static void b(Animator animator, long j6) {
        ((AnimatorSet) animator).setCurrentPlayTime(j6);
    }
}
