package com.transsnet.palmpay.ui.fragment;

import Ac.h;
import C9.C0158z;
import Ce.m0;
import L6.b;
import Pa.i0;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.t0;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import com.transsnet.adsdk.widgets.splash.SplashAdView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.MainAdUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/SplashFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSplashFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashFragment.kt\ncom/transsnet/palmpay/ui/fragment/SplashFragment\n+ 2 Trace.kt\nandroidx/core/os/TraceKt\n*L\n1#1,189:1\n31#2,5:190\n*S KotlinDebug\n*F\n+ 1 SplashFragment.kt\ncom/transsnet/palmpay/ui/fragment/SplashFragment\n*L\n45#1:190,5\n*E\n"})
public final class SplashFragment extends Fragment implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f35244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FrameLayout f35245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SplashAdView f35246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t0 f35247d;

    public final FrameLayout f(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, context));
        this.f35244a = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        ImageView imageView = this.f35244a;
        if (imageView != null) {
            imageView.setAdjustViewBounds(true);
        }
        ImageView imageView2 = this.f35244a;
        if (imageView2 != null) {
            imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        int screenHeight = ScreenUtils.getScreenHeight();
        int dp = CommonViewExtKt.getDp(288.0f);
        layoutParams.height = dp;
        layoutParams.topMargin = (screenHeight - dp) / 2;
        ImageView imageView3 = this.f35244a;
        if (imageView3 != null) {
            imageView3.setImageResource(r.cv_splash_logo_4);
        }
        frameLayout.addView(this.f35244a, layoutParams);
        return frameLayout;
    }

    public final void g() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        SplashAdView splashAdView = new SplashAdView(context, null);
        splashAdView.setSlotId(MainAdUtils.getAdSlotId(h.main_ad_splash_slot_id), false);
        splashAdView.enableVirtualButton(true);
        FrameLayout frameLayout = this.f35245b;
        if (frameLayout != null) {
            frameLayout.addView(splashAdView, new FrameLayout.LayoutParams(-1, -2));
        }
        splashAdView.showSplashImg();
        splashAdView.setAdListener(new C0158z(this, 6));
        this.f35246c = splashAdView;
        splashAdView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Trace.beginSection("SplashFragment");
        try {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            this.f35245b = f(contextRequireContext);
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getBoolean("showAd", true) && SplashAdView.isSplashImageExist()) {
                g();
            }
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(viewLifecycleOwner);
            f fVar = I.f10809a;
            this.f35247d = AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new m0(this, null), 2);
            Unit unit = Unit.f38893a;
            return this.f35245b;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        SplashAdView splashAdView = this.f35246c;
        if (splashAdView == null || (viewTreeObserver = splashAdView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        super.onDestroyView();
        t0 t0Var = this.f35247d;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
        this.f35247d = null;
        SplashAdView splashAdView = this.f35246c;
        if (splashAdView != null && (viewTreeObserver = splashAdView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        this.f35246c = null;
        this.f35244a = null;
        this.f35245b = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        int height;
        Context context;
        if (!isAdded() || !i0.W(getActivity())) {
            SplashAdView splashAdView = this.f35246c;
            if (splashAdView == null || (viewTreeObserver = splashAdView.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            return;
        }
        SplashAdView splashAdView2 = this.f35246c;
        if (splashAdView2 == null || (height = splashAdView2.getHeight()) <= 0) {
            return;
        }
        ImageView imageView = this.f35244a;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        splashAdView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int appUsableScreenHeight = ScreenUtils.getAppUsableScreenHeight();
        if (appUsableScreenHeight - height > SizeUtils.dp2px(60.0f) && (context = getContext()) != null) {
            ImageView imageView2 = new ImageView(context, null);
            imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView2.setImageResource(r.cv_palmpay_text_and_logo_purple);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            layoutParams.topMargin = ((appUsableScreenHeight + height) - SizeUtils.dp2px(25.0f)) / 2;
            FrameLayout frameLayout = this.f35245b;
            if (frameLayout != null) {
                frameLayout.addView(imageView2, layoutParams);
            }
        }
    }
}
