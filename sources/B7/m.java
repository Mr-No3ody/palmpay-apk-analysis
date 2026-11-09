package B7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f552a;

    public m(SmartRefreshLayout smartRefreshLayout) {
        this.f552a = smartRefreshLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        super.onAnimationEnd(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        SmartRefreshLayout smartRefreshLayout = this.f552a;
        smartRefreshLayout.f25015A1 = null;
        if (smartRefreshLayout.f25047b != 0) {
            RefreshState refreshState = smartRefreshLayout.f25070p1;
            if (refreshState != smartRefreshLayout.f25072q1) {
                smartRefreshLayout.setViceState(refreshState);
                return;
            }
            return;
        }
        RefreshState refreshState2 = smartRefreshLayout.f25070p1;
        RefreshState refreshState3 = RefreshState.None;
        if (refreshState2 == refreshState3 || refreshState2.isOpening) {
            return;
        }
        smartRefreshLayout.g(refreshState3);
    }
}
