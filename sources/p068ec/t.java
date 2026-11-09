package p068ec;

import Pd.c;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.transsnet.palmpay.databundle.ui.activity.DataBundleAutoTopupOverlayActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements MotionLayout.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataBundleAutoTopupOverlayActivity f36283a;

    public t(DataBundleAutoTopupOverlayActivity dataBundleAutoTopupOverlayActivity) {
        this.f36283a = dataBundleAutoTopupOverlayActivity;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public final void onTransitionCompleted(MotionLayout motionLayout, int i7) {
        if (i7 == c.start) {
            this.f36283a.finish();
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
