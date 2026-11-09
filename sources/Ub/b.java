package Ub;

import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.swmansion.rnscreens.stack.views.ScreensCoordinatorLayout;
import com.transsnet.palmpay.custom_view.marqueeview.IMarqueeItemChanged;
import com.transsnet.palmpay.custom_view.marqueeview.MarqueeView;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f9523b;

    public /* synthetic */ b(KeyEvent.Callback callback, int i7) {
        this.f9522a = i7;
        this.f9523b = callback;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        KeyEvent.Callback callback = this.f9523b;
        switch (this.f9522a) {
            case 0:
                MarqueeView marqueeView = (MarqueeView) callback;
                int i7 = marqueeView.f31391A + 1;
                marqueeView.f31391A = i7;
                if (i7 >= marqueeView.f31392B.size()) {
                    marqueeView.f31391A = 0;
                }
                LinearLayout linearLayoutA = marqueeView.a(marqueeView.f31392B.get(marqueeView.f31391A));
                IMarqueeItemChanged iMarqueeItemChanged = marqueeView.f31394H;
                if (iMarqueeItemChanged != null) {
                    iMarqueeItemChanged.onItemChanged(marqueeView.f31391A);
                }
                if (linearLayoutA.getParent() == null) {
                    marqueeView.addView(linearLayoutA);
                }
                marqueeView.f31396M = false;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((ScreensCoordinatorLayout) callback).getFragment$react_native_screens_release().onViewAnimationEnd();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animation");
                HomeActivity.a aVar = HomeActivity.f34463H;
                ((HomeActivity) callback).u();
                break;
            default:
                ((View) callback).setVisibility(8);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.f9522a) {
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.f9522a) {
            case 0:
                MarqueeView marqueeView = (MarqueeView) this.f9523b;
                if (marqueeView.f31396M) {
                    animation.cancel();
                }
                marqueeView.f31396M = true;
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((ScreensCoordinatorLayout) this.f9523b).getFragment$react_native_screens_release().f(false);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animation");
                FrameLayout frameLayout = ((HomeActivity) this.f9523b).f34475i;
                if (frameLayout != null) {
                    h.s(frameLayout, true);
                }
                break;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }
}
