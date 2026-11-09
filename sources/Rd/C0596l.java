package Rd;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelBillNoticeItem;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;

/* JADX INFO: renamed from: Rd.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0596l implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BannerAdView f8382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModelBillNoticeItem f8383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ModelAvailableCouponItem f8384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IconicsCheckBox f8385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f8386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PpAmountEditText f8387g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ModelItemSelection f8388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ModelItemSelection f8389j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinearLayout f8390o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ModelNumberInputLayout f8391p;
    public final TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final PpButton f8392v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final PpTitleBar f8393w;

    public C0596l(LinearLayout linearLayout, BannerAdView bannerAdView, ModelBillNoticeItem modelBillNoticeItem, ModelAvailableCouponItem modelAvailableCouponItem, IconicsCheckBox iconicsCheckBox, ConstraintLayout constraintLayout, PpAmountEditText ppAmountEditText, ModelItemSelection modelItemSelection, ModelItemSelection modelItemSelection2, LinearLayout linearLayout2, ModelNumberInputLayout modelNumberInputLayout, TextView textView, PpButton ppButton, PpTitleBar ppTitleBar) {
        this.f8381a = linearLayout;
        this.f8382b = bannerAdView;
        this.f8383c = modelBillNoticeItem;
        this.f8384d = modelAvailableCouponItem;
        this.f8385e = iconicsCheckBox;
        this.f8386f = constraintLayout;
        this.f8387g = ppAmountEditText;
        this.f8388i = modelItemSelection;
        this.f8389j = modelItemSelection2;
        this.f8390o = linearLayout2;
        this.f8391p = modelNumberInputLayout;
        this.t = textView;
        this.f8392v = ppButton;
        this.f8393w = ppTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8381a;
    }
}
