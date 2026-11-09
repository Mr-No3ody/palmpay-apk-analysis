package p223od;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.ui.widget.DragView;
import com.transsnet.palmpay.send_money.ui.view.TransferHomeEntranceView;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayAccountView;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final TabLayout f40471A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final PpTitleBar f40472B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final TransferHomeEntranceView f40473C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final TextView f40474H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final IconicsImageView f40475L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ViewFlipper f40476M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ViewPager2 f40477Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final ViewStub f40478X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f40479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SingleAdView f40480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MarqueeViewV2 f40481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppBarLayout f40482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f40483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DragView f40484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f40485g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IconicsImageView f40486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f40487j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinearLayout f40488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinearLayout f40489p;
    public final TransferToPalmPayAccountView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SingleAdView f40490v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SingleAdView f40491w;

    public r(CoordinatorLayout coordinatorLayout, SingleAdView singleAdView, MarqueeViewV2 marqueeViewV2, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, DragView dragView, FrameLayout frameLayout, IconicsImageView iconicsImageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TransferToPalmPayAccountView transferToPalmPayAccountView, SingleAdView singleAdView2, SingleAdView singleAdView3, TabLayout tabLayout, PpTitleBar ppTitleBar, TransferHomeEntranceView transferHomeEntranceView, TextView textView, IconicsImageView iconicsImageView2, ViewFlipper viewFlipper, ViewPager2 viewPager2, ViewStub viewStub) {
        this.f40479a = coordinatorLayout;
        this.f40480b = singleAdView;
        this.f40481c = marqueeViewV2;
        this.f40482d = appBarLayout;
        this.f40483e = constraintLayout;
        this.f40484f = dragView;
        this.f40485g = frameLayout;
        this.f40486i = iconicsImageView;
        this.f40487j = linearLayout;
        this.f40488o = linearLayout2;
        this.f40489p = linearLayout3;
        this.t = transferToPalmPayAccountView;
        this.f40490v = singleAdView2;
        this.f40491w = singleAdView3;
        this.f40471A = tabLayout;
        this.f40472B = ppTitleBar;
        this.f40473C = transferHomeEntranceView;
        this.f40474H = textView;
        this.f40475L = iconicsImageView2;
        this.f40476M = viewFlipper;
        this.f40477Q = viewPager2;
        this.f40478X = viewStub;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40479a;
    }
}
