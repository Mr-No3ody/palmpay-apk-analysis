package p282s9;

import Pd.c;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.transsnet.palmpay.betting.ui.activity.BettingAutoRenewOverlayActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements MotionLayout.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BettingAutoRenewOverlayActivity f42066a;

    public b(BettingAutoRenewOverlayActivity bettingAutoRenewOverlayActivity) {
        this.f42066a = bettingAutoRenewOverlayActivity;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public final void onTransitionCompleted(MotionLayout motionLayout, int i7) {
        if (i7 == c.start) {
            this.f42066a.finish();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public final void onTransitionStarted(MotionLayout motionLayout, int i7, int i10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public final void onTransitionChange(MotionLayout motionLayout, int i7, int i10, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public final void onTransitionTrigger(MotionLayout motionLayout, int i7, boolean z3, float f10) {
    }
}
