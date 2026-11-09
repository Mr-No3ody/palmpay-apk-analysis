package B7;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f555b;

    public o(SmartRefreshLayout smartRefreshLayout, boolean z3) {
        this.f555b = smartRefreshLayout;
        this.f554a = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        RefreshHeader refreshHeader;
        SmartRefreshLayout smartRefreshLayout = this.f555b;
        if (smartRefreshLayout.f25070p1 != RefreshState.Refreshing || smartRefreshLayout.f25059i1 == null || smartRefreshLayout.f25062k1 == null) {
            return;
        }
        smartRefreshLayout.g(RefreshState.RefreshFinish);
        RefreshHeader refreshHeader2 = smartRefreshLayout.f25059i1;
        boolean z3 = this.f554a;
        int iOnFinish = refreshHeader2.onFinish(smartRefreshLayout, z3);
        OnMultiPurposeListener onMultiPurposeListener = smartRefreshLayout.f25038R0;
        if (onMultiPurposeListener != null && (refreshHeader = smartRefreshLayout.f25059i1) != null) {
            onMultiPurposeListener.onHeaderFinish(refreshHeader, z3);
        }
        if (iOnFinish < Integer.MAX_VALUE) {
            boolean z8 = smartRefreshLayout.f25083w;
            if (z8 || smartRefreshLayout.f25040U0) {
                if (z8) {
                    smartRefreshLayout.f25060j = smartRefreshLayout.f25068p;
                    smartRefreshLayout.f25051d = 0;
                    smartRefreshLayout.f25083w = false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout.f25066o, (smartRefreshLayout.f25068p + smartRefreshLayout.f25047b) - (smartRefreshLayout.f25045a * 2), 0));
                super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout.f25066o, smartRefreshLayout.f25068p + smartRefreshLayout.f25047b, 0));
                if (smartRefreshLayout.f25040U0) {
                    smartRefreshLayout.T0 = 0;
                }
            }
            int i7 = smartRefreshLayout.f25047b;
            if (i7 <= 0) {
                if (i7 < 0) {
                    smartRefreshLayout.e(0, iOnFinish, smartRefreshLayout.f25073r0, smartRefreshLayout.f25054f);
                    return;
                } else {
                    smartRefreshLayout.f25065n1.moveSpinner(0, false);
                    smartRefreshLayout.i();
                    return;
                }
            }
            ValueAnimator valueAnimatorE = smartRefreshLayout.e(0, iOnFinish, smartRefreshLayout.f25073r0, smartRefreshLayout.f25054f);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListenerScrollContentWhenFinished = smartRefreshLayout.f25023G0 ? smartRefreshLayout.f25062k1.scrollContentWhenFinished(smartRefreshLayout.f25047b) : null;
            if (valueAnimatorE == null || animatorUpdateListenerScrollContentWhenFinished == null) {
                return;
            }
            valueAnimatorE.addUpdateListener(animatorUpdateListenerScrollContentWhenFinished);
        }
    }
}
