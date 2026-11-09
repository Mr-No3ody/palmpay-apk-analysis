package p141j9;

import Pd.c;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.transsnet.palmpay.airtime.ui.AutoTopupOverlayActivity;

/* JADX INFO: renamed from: j9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1801i implements MotionLayout.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AutoTopupOverlayActivity f38407a;

    public C1801i(AutoTopupOverlayActivity autoTopupOverlayActivity) {
        this.f38407a = autoTopupOverlayActivity;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public final void onTransitionCompleted(MotionLayout motionLayout, int i7) {
        if (i7 == c.start) {
            this.f38407a.finish();
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
