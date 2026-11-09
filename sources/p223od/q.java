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
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.ui.widget.DragView;
import com.transsnet.palmpay.send_money.ui.view.TransferHomeEntranceView;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankAccountView;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final TabLayout f40449A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final PpTitleBar f40450B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final TransferHomeEntranceView f40451C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final IconicsTextView f40452H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final TextView f40453L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final IconicsImageView f40454M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ViewFlipper f40455Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final ViewPager f40456X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ViewStub f40457Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f40458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MarqueeViewV2 f40459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SingleAdView f40460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SingleAdView f40461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoordinatorLayout f40462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f40463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DragView f40464g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TransferToBankAccountView f40465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FrameLayout f40466j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IconicsImageView f40467o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinearLayout f40468p;
    public final LinearLayout t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewStub f40469v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SingleAdView f40470w;

    public q(CoordinatorLayout coordinatorLayout, MarqueeViewV2 marqueeViewV2, SingleAdView singleAdView, SingleAdView singleAdView2, CoordinatorLayout coordinatorLayout2, ConstraintLayout constraintLayout, DragView dragView, TransferToBankAccountView transferToBankAccountView, FrameLayout frameLayout, IconicsImageView iconicsImageView, LinearLayout linearLayout, LinearLayout linearLayout2, ViewStub viewStub, SingleAdView singleAdView3, TabLayout tabLayout, PpTitleBar ppTitleBar, TransferHomeEntranceView transferHomeEntranceView, IconicsTextView iconicsTextView, TextView textView, IconicsImageView iconicsImageView2, ViewFlipper viewFlipper, ViewPager viewPager, ViewStub viewStub2) {
        this.f40458a = coordinatorLayout;
        this.f40459b = marqueeViewV2;
        this.f40460c = singleAdView;
        this.f40461d = singleAdView2;
        this.f40462e = coordinatorLayout2;
        this.f40463f = constraintLayout;
        this.f40464g = dragView;
        this.f40465i = transferToBankAccountView;
        this.f40466j = frameLayout;
        this.f40467o = iconicsImageView;
        this.f40468p = linearLayout;
        this.t = linearLayout2;
        this.f40469v = viewStub;
        this.f40470w = singleAdView3;
        this.f40449A = tabLayout;
        this.f40450B = ppTitleBar;
        this.f40451C = transferHomeEntranceView;
        this.f40452H = iconicsTextView;
        this.f40453L = textView;
        this.f40454M = iconicsImageView2;
        this.f40455Q = viewFlipper;
        this.f40456X = viewPager;
        this.f40457Y = viewStub2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40458a;
    }
}
