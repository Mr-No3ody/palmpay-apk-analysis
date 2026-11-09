package Rd;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.viewmodel.ModelAvailablePointItem;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.teller.ui.view.ModelBillerTipsInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ModelBillerTipsInfo f8281A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RecyclerView f8282B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ModelItemSelection f8283C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ModelItemSelection f8284H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final PpTitleBar f8285L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final TextView f8286M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final TextView f8287Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final TextView f8288X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final TextView f8289Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final ViewStub f8290Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SingleAdView f8292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SingleAdView f8293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SingleAdView f8294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatCheckBox f8295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f8296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PpAmountEditText f8297g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f8298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f8299j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinearLayout f8300o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinearLayout f8301p;
    public final LinearLayout t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ModelAvailablePointItem f8302v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ModelNumberInputLayout f8303w;

    public f0(LinearLayout linearLayout, SingleAdView singleAdView, SingleAdView singleAdView2, SingleAdView singleAdView3, AppCompatCheckBox appCompatCheckBox, FrameLayout frameLayout, PpAmountEditText ppAmountEditText, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ModelAvailablePointItem modelAvailablePointItem, ModelNumberInputLayout modelNumberInputLayout, ModelBillerTipsInfo modelBillerTipsInfo, RecyclerView recyclerView, ModelItemSelection modelItemSelection, ModelItemSelection modelItemSelection2, PpTitleBar ppTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, ViewStub viewStub) {
        this.f8291a = linearLayout;
        this.f8292b = singleAdView;
        this.f8293c = singleAdView2;
        this.f8294d = singleAdView3;
        this.f8295e = appCompatCheckBox;
        this.f8296f = frameLayout;
        this.f8297g = ppAmountEditText;
        this.f8298i = imageView;
        this.f8299j = linearLayout2;
        this.f8300o = linearLayout3;
        this.f8301p = linearLayout4;
        this.t = linearLayout5;
        this.f8302v = modelAvailablePointItem;
        this.f8303w = modelNumberInputLayout;
        this.f8281A = modelBillerTipsInfo;
        this.f8282B = recyclerView;
        this.f8283C = modelItemSelection;
        this.f8284H = modelItemSelection2;
        this.f8285L = ppTitleBar;
        this.f8286M = textView;
        this.f8287Q = textView2;
        this.f8288X = textView3;
        this.f8289Y = textView4;
        this.f8290Z = viewStub;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8291a;
    }
}
