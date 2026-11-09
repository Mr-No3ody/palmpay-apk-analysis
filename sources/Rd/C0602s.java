package Rd;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;

/* JADX INFO: renamed from: Rd.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0602s implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BannerAdView f8473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f8474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PpAmountEditText f8475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ModelItemSelection f8476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ModelNumberInputLayout f8477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ModelNumberInputLayout f8478g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f8479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f8480j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final PpTitleBar f8481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f8482p;

    public C0602s(LinearLayout linearLayout, BannerAdView bannerAdView, ConstraintLayout constraintLayout, PpAmountEditText ppAmountEditText, ModelItemSelection modelItemSelection, ModelNumberInputLayout modelNumberInputLayout, ModelNumberInputLayout modelNumberInputLayout2, TextView textView, TextView textView2, PpTitleBar ppTitleBar, TextView textView3) {
        this.f8472a = linearLayout;
        this.f8473b = bannerAdView;
        this.f8474c = constraintLayout;
        this.f8475d = ppAmountEditText;
        this.f8476e = modelItemSelection;
        this.f8477f = modelNumberInputLayout;
        this.f8478g = modelNumberInputLayout2;
        this.f8479i = textView;
        this.f8480j = textView2;
        this.f8481o = ppTitleBar;
        this.f8482p = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8472a;
    }
}
