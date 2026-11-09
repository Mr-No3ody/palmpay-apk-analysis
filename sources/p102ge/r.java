package p102ge;

import Pa.AbstractC0520q;
import Pa.i0;
import Ub.b;
import android.content.Intent;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.transsnet.adsdk.widgets.snackbar.SnackBarRecycle;
import com.transsnet.palmpay.core.init.PpPerfTrace;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.ui.widget.HomeFragmentContainer;
import com.transsnet.palmpay.util.PerfTimer;
import java.util.concurrent.LinkedBlockingQueue;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f37229b;

    public /* synthetic */ r(HomeActivity homeActivity, int i7) {
        this.f37228a = i7;
        this.f37229b = homeActivity;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ca A[Catch: all -> 0x009f, TryCatch #1 {all -> 0x009f, blocks: (B:29:0x0068, B:32:0x007d, B:34:0x0082, B:36:0x0086, B:42:0x0096, B:44:0x009a, B:47:0x00a1, B:49:0x00c2, B:50:0x00c6, B:52:0x00ca, B:53:0x00cd), top: B:60:0x0068 }] */
    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        HomeActivity homeActivity = this.f37229b;
        switch (this.f37228a) {
            case 0:
                HomeActivity.a aVar = HomeActivity.f34463H;
                PpPerfTrace.begin("Home.hideSplash.run");
                try {
                    ((PerfTimer) homeActivity.f34467C.getValue()).mark(2);
                    if (i0.W(homeActivity)) {
                        if (AbstractC0520q.f7145k) {
                            frameLayout = homeActivity.f34475i;
                            if (frameLayout != null) {
                                h.s(frameLayout, true);
                            }
                            homeActivity.u();
                        } else {
                            if (AbstractC0520q.f7139e && "TECNO KL5".equalsIgnoreCase(AbstractC0520q.f7136b)) {
                                frameLayout = homeActivity.f34475i;
                                if (frameLayout != null) {
                                    h.s(frameLayout, true);
                                }
                                homeActivity.u();
                            } else {
                                FrameLayout frameLayout2 = homeActivity.f34475i;
                                if (frameLayout2 != null) {
                                    frameLayout2.setVisibility(4);
                                }
                                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                                alphaAnimation.setDuration(300L);
                                alphaAnimation.setInterpolator(new DecelerateInterpolator());
                                alphaAnimation.setAnimationListener(new b(homeActivity, 2));
                                FrameLayout frameLayout3 = homeActivity.f34474g;
                                if (frameLayout3 != null) {
                                    frameLayout3.startAnimation(alphaAnimation);
                                }
                            }
                        }
                    }
                    return;
                } finally {
                    PpPerfTrace.end();
                }
            case 1:
                HomeActivity.a aVar2 = HomeActivity.f34463H;
                try {
                    r rVar = homeActivity.t;
                    if (rVar != null) {
                        LinkedBlockingQueue linkedBlockingQueue = homeActivity.f34477o;
                        if (linkedBlockingQueue.isEmpty()) {
                            return;
                        }
                        ((SnackBarRecycle) linkedBlockingQueue.remove()).show(homeActivity, homeActivity.f34465A, homeActivity.getResources().getDimensionPixelSize(q.dp42));
                        if (linkedBlockingQueue.isEmpty()) {
                            return;
                        }
                        homeActivity.f34478p.postDelayed(rVar, 6000L);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            default:
                HomeActivity.a aVar3 = HomeActivity.f34463H;
                HomeFragment homeFragmentQ = homeActivity.q();
                if (homeFragmentQ != null) {
                    HomeFragmentContainer homeFragmentContainer = homeFragmentQ.f35081B;
                    homeFragmentQ.H(homeFragmentContainer != null ? homeFragmentContainer.c("home") : -1);
                }
                Intent intent = homeActivity.getIntent();
                if (intent != null) {
                    intent.putExtra("tab", "home");
                    return;
                }
                return;
        }
    }
}
