package Rd;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.databundle.ui.view.ModelDataBundleHighlyRecommendItem;
import com.transsnet.palmpay.teller.ui.view.ModelBillerBottomMenu;
import com.transsnet.palmpay.teller.ui.view.WrapContentViewPager2;

/* JADX INFO: renamed from: Rd.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0599o implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final PpTitleBar f8423A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final TextView f8424B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final TextView f8425C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewStub f8427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModelBillerBottomMenu f8428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ModelMobileWithIconInputLayout f8429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TabLayout f8430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WrapContentViewPager2 f8431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CircularProgressIndicator f8432g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f8433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f8434j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f8435o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ModelDataBundleHighlyRecommendItem f8436p;
    public final NestedScrollView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewStub f8437v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SingleAdView f8438w;

    public C0599o(ConstraintLayout constraintLayout, ViewStub viewStub, ModelBillerBottomMenu modelBillerBottomMenu, ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, TabLayout tabLayout, WrapContentViewPager2 wrapContentViewPager2, CircularProgressIndicator circularProgressIndicator, View view, ImageView imageView, ImageView imageView2, ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem, NestedScrollView nestedScrollView, ViewStub viewStub2, SingleAdView singleAdView, PpTitleBar ppTitleBar, TextView textView, TextView textView2) {
        this.f8426a = constraintLayout;
        this.f8427b = viewStub;
        this.f8428c = modelBillerBottomMenu;
        this.f8429d = modelMobileWithIconInputLayout;
        this.f8430e = tabLayout;
        this.f8431f = wrapContentViewPager2;
        this.f8432g = circularProgressIndicator;
        this.f8433i = view;
        this.f8434j = imageView;
        this.f8435o = imageView2;
        this.f8436p = modelDataBundleHighlyRecommendItem;
        this.t = nestedScrollView;
        this.f8437v = viewStub2;
        this.f8438w = singleAdView;
        this.f8423A = ppTitleBar;
        this.f8424B = textView;
        this.f8425C = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8426a;
    }
}
