package B7;

import android.view.MotionEvent;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f561c;

    public r(SmartRefreshLayout smartRefreshLayout, boolean z3, boolean z8) {
        this.f561c = smartRefreshLayout;
        this.f559a = z3;
        this.f560b = z8;
    }

    @Override // java.lang.Runnable
    public void run() {
        RefreshFooter refreshFooter;
        SmartRefreshLayout smartRefreshLayout = this.f561c;
        RefreshState refreshState = smartRefreshLayout.f25070p1;
        RefreshState refreshState2 = RefreshState.Loading;
        boolean z3 = this.f560b;
        if (refreshState != refreshState2 || smartRefreshLayout.j1 == null || smartRefreshLayout.f25062k1 == null) {
            if (z3) {
                smartRefreshLayout.setNoMoreData(true);
                return;
            }
            return;
        }
        smartRefreshLayout.g(RefreshState.LoadFinish);
        RefreshFooter refreshFooter2 = smartRefreshLayout.j1;
        boolean z8 = this.f559a;
        int iOnFinish = refreshFooter2.onFinish(smartRefreshLayout, z8);
        OnMultiPurposeListener onMultiPurposeListener = smartRefreshLayout.f25038R0;
        if (onMultiPurposeListener != null && (refreshFooter = smartRefreshLayout.j1) != null) {
            onMultiPurposeListener.onFooterFinish(refreshFooter, z8);
        }
        if (iOnFinish < Integer.MAX_VALUE) {
            boolean z10 = z3 && smartRefreshLayout.f25090z0 && smartRefreshLayout.f25047b < 0 && smartRefreshLayout.f25062k1.canLoadMore();
            int i7 = smartRefreshLayout.f25047b;
            int iMax = i7 - (z10 ? Math.max(i7, -smartRefreshLayout.f25046a1) : 0);
            boolean z11 = smartRefreshLayout.f25083w;
            if (z11 || smartRefreshLayout.f25040U0) {
                if (z11) {
                    smartRefreshLayout.f25060j = smartRefreshLayout.f25068p;
                    smartRefreshLayout.f25083w = false;
                    smartRefreshLayout.f25051d = smartRefreshLayout.f25047b - iMax;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                float f10 = iMax;
                super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout.f25066o, smartRefreshLayout.f25068p + f10 + (smartRefreshLayout.f25045a * 2), 0));
                super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout.f25066o, smartRefreshLayout.f25068p + f10, 0));
                if (smartRefreshLayout.f25040U0) {
                    smartRefreshLayout.T0 = 0;
                }
            }
            smartRefreshLayout.postDelayed(new q(this, iMax), smartRefreshLayout.f25047b < 0 ? iOnFinish : 0L);
        }
    }
}
