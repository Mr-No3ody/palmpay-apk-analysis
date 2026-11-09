package Rd;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.airtime.ui.view.DailyFlashSalesView;
import com.transsnet.palmpay.custom_view.async.AsyncViewStub;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.teller.ui.view.ModelBillerBottomMenu;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final TextView f8056A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final DailyFlashSalesView f8057B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ViewStub f8058C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ViewStub f8059H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SingleAdView f8061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f8062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AsyncViewStub f8063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AsyncViewStub f8064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AsyncViewStub f8065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ModelMobileWithIconInputLayout f8066g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final NestedScrollView f8067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PpTitleBar f8068j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ViewStub f8069o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ModelBillerBottomMenu f8070p;
    public final ViewStub t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SingleAdView f8071v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f8072w;

    public H(ConstraintLayout constraintLayout, SingleAdView singleAdView, ConstraintLayout constraintLayout2, AsyncViewStub asyncViewStub, AsyncViewStub asyncViewStub2, AsyncViewStub asyncViewStub3, ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, NestedScrollView nestedScrollView, PpTitleBar ppTitleBar, ViewStub viewStub, ModelBillerBottomMenu modelBillerBottomMenu, ConstraintLayout constraintLayout3, ViewStub viewStub2, SingleAdView singleAdView2, TextView textView, TextView textView2, DailyFlashSalesView dailyFlashSalesView, ViewStub viewStub3, ViewStub viewStub4) {
        this.f8060a = constraintLayout;
        this.f8061b = singleAdView;
        this.f8062c = constraintLayout2;
        this.f8063d = asyncViewStub;
        this.f8064e = asyncViewStub2;
        this.f8065f = asyncViewStub3;
        this.f8066g = modelMobileWithIconInputLayout;
        this.f8067i = nestedScrollView;
        this.f8068j = ppTitleBar;
        this.f8069o = viewStub;
        this.f8070p = modelBillerBottomMenu;
        this.t = viewStub2;
        this.f8071v = singleAdView2;
        this.f8072w = textView;
        this.f8056A = textView2;
        this.f8057B = dailyFlashSalesView;
        this.f8058C = viewStub3;
        this.f8059H = viewStub4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8060a;
    }
}
