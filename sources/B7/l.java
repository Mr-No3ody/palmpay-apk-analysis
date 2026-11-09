package B7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f551a;

    public l(SmartRefreshLayout smartRefreshLayout) {
        this.f551a = smartRefreshLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SmartRefreshLayout smartRefreshLayout = this.f551a;
        smartRefreshLayout.f25074r1 = jCurrentTimeMillis;
        smartRefreshLayout.g(RefreshState.Refreshing);
        OnRefreshListener onRefreshListener = smartRefreshLayout.f25035P0;
        if (onRefreshListener != null) {
            onRefreshListener.onRefresh(smartRefreshLayout);
        } else if (smartRefreshLayout.f25038R0 == null) {
            smartRefreshLayout.finishRefresh(3000);
        }
        RefreshHeader refreshHeader = smartRefreshLayout.f25059i1;
        if (refreshHeader != null) {
            int i7 = smartRefreshLayout.f25044Y0;
            refreshHeader.onStartAnimator(smartRefreshLayout, i7, (int) (smartRefreshLayout.f25053e1 * i7));
        }
        OnMultiPurposeListener onMultiPurposeListener = smartRefreshLayout.f25038R0;
        if (onMultiPurposeListener == null || smartRefreshLayout.f25059i1 == null) {
            return;
        }
        onMultiPurposeListener.onRefresh(smartRefreshLayout);
        OnMultiPurposeListener onMultiPurposeListener2 = smartRefreshLayout.f25038R0;
        RefreshHeader refreshHeader2 = smartRefreshLayout.f25059i1;
        int i10 = smartRefreshLayout.f25044Y0;
        onMultiPurposeListener2.onHeaderStartAnimator(refreshHeader2, i10, (int) (smartRefreshLayout.f25053e1 * i10));
    }
}
