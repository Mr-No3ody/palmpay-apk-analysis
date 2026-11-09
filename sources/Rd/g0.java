package Rd;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.viewmodel.ModelAvailablePointItem;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.teller.ui.view.ModelBillerTipsInfo;
import com.transsnet.palmpay.teller.ui.view.ModelTvRenewItem;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ModelBillerTipsInfo f8307A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ViewStub f8308B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final SingleAdView f8309C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ModelItemSelection f8310H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final PpTitleBar f8311L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final TextView f8312M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ViewPager2 f8313Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TabLayout f8315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppBarLayout f8316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatCheckBox f8317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f8318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CircularProgressIndicator f8319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f8320g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f8321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f8322j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinearLayout f8323o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinearLayout f8324p;
    public final ModelAvailablePointItem t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ModelNumberInputLayout f8325v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ModelTvRenewItem f8326w;

    public g0(LinearLayout linearLayout, TabLayout tabLayout, AppBarLayout appBarLayout, AppCompatCheckBox appCompatCheckBox, ConstraintLayout constraintLayout, CircularProgressIndicator circularProgressIndicator, View view, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ModelAvailablePointItem modelAvailablePointItem, ModelNumberInputLayout modelNumberInputLayout, ModelTvRenewItem modelTvRenewItem, ModelBillerTipsInfo modelBillerTipsInfo, ViewStub viewStub, SingleAdView singleAdView, ModelItemSelection modelItemSelection, PpTitleBar ppTitleBar, TextView textView, ViewPager2 viewPager2) {
        this.f8314a = linearLayout;
        this.f8315b = tabLayout;
        this.f8316c = appBarLayout;
        this.f8317d = appCompatCheckBox;
        this.f8318e = constraintLayout;
        this.f8319f = circularProgressIndicator;
        this.f8320g = view;
        this.f8321i = imageView;
        this.f8322j = linearLayout2;
        this.f8323o = linearLayout3;
        this.f8324p = linearLayout4;
        this.t = modelAvailablePointItem;
        this.f8325v = modelNumberInputLayout;
        this.f8326w = modelTvRenewItem;
        this.f8307A = modelBillerTipsInfo;
        this.f8308B = viewStub;
        this.f8309C = singleAdView;
        this.f8310H = modelItemSelection;
        this.f8311L = ppTitleBar;
        this.f8312M = textView;
        this.f8313Q = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8314a;
    }
}
