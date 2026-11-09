package G7;

import Bc.C0106c;
import Pa.i0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.constraintlayout.widget.Group;
import androidx.transition.Transition;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.palmpay.lib.ui.calendar.CalendarLayout;
import com.palmpay.lib.ui.calendar.CalendarView;
import com.rollingtextview.RollingTextView;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import com.transsnet.palmpay.custom_view.CoinRainNewView;
import com.transsnet.palmpay.custom_view.ReboundScrollView;
import com.transsnet.palmpay.ui.activity.CoinRainActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3118b;

    public /* synthetic */ j(Object obj, int i7) {
        this.f3117a = i7;
        this.f3118b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3117a) {
            case 1:
                super.onAnimationCancel(animator);
                ((He.a) this.f3118b).f3865c = null;
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f3118b;
                actionBarOverlayLayout.f12563p0 = null;
                actionBarOverlayLayout.f12561o = false;
                break;
            case 9:
                super.onAnimationCancel(animator);
                ReboundScrollView reboundScrollView = (ReboundScrollView) this.f3118b;
                View view = reboundScrollView.f31107z0;
                Rect rect = reboundScrollView.f31102F0;
                view.layout(rect.left, rect.top, rect.right, rect.bottom);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        C0106c c0106c;
        C0106c c0106c2;
        CoinRainNewView coinRainNewView;
        ValueAnimator valueAnimator;
        Object obj = this.f3118b;
        switch (this.f3117a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                ((i) obj).invoke();
                break;
            case 1:
                super.onAnimationEnd(animation);
                ((He.a) obj).f3865c = null;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animation");
                SheetDelegate sheetDelegate = (SheetDelegate) obj;
                sheetDelegate.f25397d = false;
                sheetDelegate.f25394a.e();
                break;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((View) obj).setVisibility(8);
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f12563p0 = null;
                actionBarOverlayLayout.f12561o = false;
                break;
            case 5:
                ((Transition) obj).end();
                animation.removeListener(this);
                break;
            case 6:
                androidx.vectordrawable.graphics.drawable.g gVar = (androidx.vectordrawable.graphics.drawable.g) obj;
                ArrayList arrayList = new ArrayList(gVar.f18155e);
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((androidx.vectordrawable.graphics.drawable.c) arrayList.get(i7)).onAnimationEnd(gVar);
                }
                break;
            case 7:
                super.onAnimationEnd(animation);
                CalendarLayout calendarLayout = (CalendarLayout) obj;
                calendarLayout.f24095B = false;
                CalendarLayout.a(calendarLayout);
                calendarLayout.f24103c = true;
                break;
            case 8:
                super.onAnimationEnd(animation);
                ((CalendarView) obj).f24119f.setVisibility(0);
                break;
            case 9:
                super.onAnimationEnd(animation);
                ReboundScrollView reboundScrollView = (ReboundScrollView) obj;
                View view = reboundScrollView.f31107z0;
                Rect rect = reboundScrollView.f31102F0;
                view.layout(rect.left, rect.top, rect.right, rect.bottom);
                break;
            case 10:
                Intrinsics.checkNotNullParameter(animation, "animation");
                CoinRainActivity coinRainActivity = (CoinRainActivity) obj;
                if (i0.W(coinRainActivity)) {
                    CoinRainActivity.a aVar = CoinRainActivity.f34450i;
                    coinRainActivity.o();
                    C0106c c0106c3 = coinRainActivity.f34457g;
                    if (c0106c3 == null) {
                        c0106c = coinRainActivity.f34457g;
                        if (c0106c != null && (valueAnimator = (coinRainNewView = (CoinRainNewView) c0106c.t).t) != null) {
                            valueAnimator.setDuration(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
                            coinRainNewView.t.start();
                        }
                        c0106c2 = coinRainActivity.f34457g;
                        if (c0106c2 != null) {
                            p220oa.h.c((Group) c0106c2.f676j);
                        }
                    } else {
                        ValueAnimator valueAnimator2 = ((CoinRainNewView) c0106c3.t).t;
                        if (!(valueAnimator2 == null ? false : valueAnimator2.isRunning())) {
                            c0106c = coinRainActivity.f34457g;
                            if (c0106c != null) {
                                valueAnimator.setDuration(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
                                coinRainNewView.t.start();
                            }
                            c0106c2 = coinRainActivity.f34457g;
                            if (c0106c2 != null) {
                                p220oa.h.c((Group) c0106c2.f676j);
                            }
                        }
                    }
                    coinRainActivity.f34455e = false;
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((RollingTextView) obj).f25003e.d();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        TextView textView;
        switch (this.f3117a) {
            case 10:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationRepeat(animation);
                CoinRainActivity coinRainActivity = (CoinRainActivity) this.f3118b;
                int i7 = coinRainActivity.f34454d == 3 ? 2 : 1;
                coinRainActivity.f34454d = i7;
                C0106c c0106c = coinRainActivity.f34457g;
                if (c0106c != null && (textView = (TextView) c0106c.f673f) != null) {
                    textView.setText(String.valueOf(i7));
                    break;
                }
                break;
            default:
                super.onAnimationRepeat(animation);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        TextView textView;
        switch (this.f3117a) {
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((SheetDelegate) this.f3118b).f25397d = true;
                break;
            case 6:
                androidx.vectordrawable.graphics.drawable.g gVar = (androidx.vectordrawable.graphics.drawable.g) this.f3118b;
                ArrayList arrayList = new ArrayList(gVar.f18155e);
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((androidx.vectordrawable.graphics.drawable.c) arrayList.get(i7)).onAnimationStart(gVar);
                }
                break;
            case 10:
                Intrinsics.checkNotNullParameter(animation, "animation");
                CoinRainActivity coinRainActivity = (CoinRainActivity) this.f3118b;
                C0106c c0106c = coinRainActivity.f34457g;
                if (c0106c != null && (textView = (TextView) c0106c.f673f) != null) {
                    textView.setText(String.valueOf(coinRainActivity.f34454d));
                    break;
                }
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }
}
