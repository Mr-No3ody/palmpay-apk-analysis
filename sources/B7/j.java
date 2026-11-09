package B7;

import android.view.View;
import androidx.core.view.NestedScrollingParent;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f549a;

    public j(SmartRefreshLayout smartRefreshLayout) {
        this.f549a = smartRefreshLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        SmartRefreshLayout smartRefreshLayout = this.f549a;
        for (Object parent = smartRefreshLayout.getParent(); parent != null; parent = ((View) parent).getParent()) {
            if ((parent instanceof NestedScrollingParent) && ((NestedScrollingParent) parent).onStartNestedScroll(smartRefreshLayout, smartRefreshLayout, 2)) {
                smartRefreshLayout.setNestedScrollingEnabled(true);
                smartRefreshLayout.f25032M0 = false;
                return;
            } else {
                if (!(parent instanceof View)) {
                    return;
                }
            }
        }
    }
}
