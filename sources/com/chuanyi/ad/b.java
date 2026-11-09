package com.chuanyi.ad;

import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.EnumC1317i;
import com.airbnb.lottie.LottieAnimationView;
import com.transsnet.adsdk.widgets.SingleAdView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21087c;

    public /* synthetic */ b(Object obj, int i7) {
        this.f21085a = i7;
        this.f21087c = obj;
        this.f21086b = false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v3) {
        switch (this.f21085a) {
            case 0:
                if (this.f21086b) {
                    if (v3 instanceof ViewGroup) {
                        ((AdBannerManager) this.f21087c).getAdView((ViewGroup) v3).refreshData(true);
                    }
                    this.f21086b = false;
                }
                break;
            case 1:
                if (this.f21086b) {
                    int i7 = e.single_ad_view;
                    ViewGroup viewGroup = (ViewGroup) this.f21087c;
                    SingleAdView singleAdView = (SingleAdView) viewGroup.findViewById(i7);
                    if (singleAdView != null) {
                        Objects.toString(viewGroup);
                        singleAdView.toString();
                        singleAdView.refreshData();
                    }
                    this.f21086b = false;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(v3, "v");
                LottieAnimationView lottieAnimationView = (LottieAnimationView) v3;
                boolean z3 = this.f21086b;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f21087c;
                if (z3) {
                    lottieAnimationView2.e();
                } else {
                    lottieAnimationView2.f19585p.add(EnumC1317i.f19870f);
                    lottieAnimationView2.f19579e.o();
                }
                lottieAnimationView.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v3) {
        switch (this.f21085a) {
            case 0:
                this.f21086b = true;
                break;
            case 1:
                this.f21086b = true;
                break;
            default:
                Intrinsics.checkNotNullParameter(v3, "v");
                ((LottieAnimationView) v3).removeOnAttachStateChangeListener(this);
                break;
        }
    }

    public b(LottieAnimationView lottieAnimationView, boolean z3) {
        this.f21085a = 2;
        this.f21086b = z3;
        this.f21087c = lottieAnimationView;
    }
}
