package K6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.palmpay.lib.scanplus.view.ScanLineView;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScanLineView f4944b;

    public /* synthetic */ d(ScanLineView scanLineView, int i7) {
        this.f4943a = i7;
        this.f4944b = scanLineView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i7 = this.f4943a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4943a) {
            case 0:
                ScanLineView scanLineView = this.f4944b;
                scanLineView.f24039p = false;
                AnimatorSet animatorSet = scanLineView.f24038o;
                if (animatorSet != null) {
                    animatorSet.start();
                }
                break;
            default:
                ScanLineView scanLineView2 = this.f4944b;
                scanLineView2.f24039p = true;
                AnimatorSet animatorSet2 = scanLineView2.f24037j;
                if (animatorSet2 != null) {
                    animatorSet2.start();
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i7 = this.f4943a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i7 = this.f4943a;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }
}
