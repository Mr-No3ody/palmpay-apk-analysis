package p354xe;

import Ac.e;
import Kb.b;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.C1314f;
import com.airbnb.lottie.D;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.p;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.util.SizeUtils;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f43925i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LottieAnimationView f43926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LottieAnimationView f43927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AppCompatTextView f43928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f43929g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, View view) {
        super(gVar, view);
        this.f43929g = gVar;
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(e.tvTitle);
        this.f43928f = appCompatTextView;
        if (gVar.f43935o == 1) {
            appCompatTextView.setTextSize(12.0f);
            h.j(appCompatTextView, Integer.valueOf(SizeUtils.dp2px(34.0f)), 0, 0, 0);
        } else {
            appCompatTextView.setTextSize(12.0f);
            h.j(appCompatTextView, Integer.valueOf(SizeUtils.dp2px(34.0f)), 0, 0, 0);
        }
        a(view);
    }

    public final LottieAnimationView d(Context context) {
        LottieAnimationView lottieAnimationView = this.f43927e;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        LottieAnimationView lottieAnimationView2 = new LottieAnimationView(context);
        int i7 = this.f43929g.f43935o;
        int iDp2px = SizeUtils.dp2px(30.0f);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iDp2px, iDp2px);
        layoutParams.t = 0;
        layoutParams.f15670v = 0;
        layoutParams.f15650i = 0;
        lottieAnimationView2.setLayoutParams(layoutParams);
        lottieAnimationView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        lottieAnimationView2.setRepeatCount(5);
        View view = this.itemView;
        if (view instanceof ConstraintLayout) {
            ((ConstraintLayout) view).addView(lottieAnimationView2, layoutParams);
        }
        this.f43927e = lottieAnimationView2;
        return lottieAnimationView2;
    }

    public final LottieAnimationView e() {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(this.f43929g.f4984a);
        lottieAnimationView.setAdjustViewBounds(true);
        int iDp2px = SizeUtils.dp2px(10.0f);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, iDp2px);
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = iDp2px;
        layoutParams.f15650i = 0;
        layoutParams.f15668s = e.barrier;
        View view = this.itemView;
        if (view instanceof ConstraintLayout) {
            ((ConstraintLayout) view).addView(lottieAnimationView, layoutParams);
        }
        return lottieAnimationView;
    }

    public final void f(HomePageMenuData homePageMenuData) {
        if (this.f43926d == null) {
            return;
        }
        if (TextUtils.isEmpty(homePageMenuData.cornerLottieUrl) || BaseApplication.get().isOldAndroidDevice() || !this.f43929g.f43936p) {
            if (TextUtils.isEmpty(homePageMenuData.cornerImgUrl)) {
                return;
            }
            r0.l1(homePageMenuData.cornerImgUrl, this.f43926d);
            return;
        }
        this.f43926d.setRepeatCount(5);
        D dH = p.h(this.f43927e.getContext(), homePageMenuData.cornerLottieUrl);
        dH.b(new d(this, 1));
        dH.a(new C1314f(1));
    }
}
