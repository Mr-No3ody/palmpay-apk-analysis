package H0;

import android.view.Choreographer;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.modules.core.ReactChoreographer;
import com.swmansion.rnscreens.gamma.tabs.TabsHost;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3568b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f3567a = i7;
        this.f3568b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        switch (this.f3567a) {
            case 0:
                ((Runnable) this.f3568b).run();
                break;
            case 1:
                TabsHost tabsHost = (TabsHost) this.f3568b;
                tabsHost.f25457p = false;
                tabsHost.measure(View.MeasureSpec.makeMeasureSpec(tabsHost.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(tabsHost.getHeight(), 1073741824));
                tabsHost.layout(tabsHost.getLeft(), tabsHost.getTop(), tabsHost.getRight(), tabsHost.getBottom());
                break;
            case 2:
                ReactChoreographer.frameCallback$lambda$1((ReactChoreographer) this.f3568b, j6);
                break;
            default:
                ViewPager2 viewPager2 = (ViewPager2) this.f3568b;
                viewPager2.post(new com.transsnet.adsdk.widgets.banner.bannerview.b(viewPager2, 26));
                p293t7.c.f42350a = null;
                break;
        }
    }
}
