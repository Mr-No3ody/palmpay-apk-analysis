package I8;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.adsdk.widgets.SingleAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final TextView f4208A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final TextView f4209B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final TextView f4210C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ConstraintLayout f4211H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f4212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewStub f4213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsCheckBox f4214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IconicsCheckBox f4215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IconicsCheckBox f4216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IconicsCheckBox f4217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SingleAdView f4218g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PpFormVertical f4219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PpFormVertical f4220j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final PpFormVertical f4221o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PpFormVertical f4222p;
    public final PpFormVertical t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final NestedScrollView f4223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final PpButton f4224w;

    public t(LinearLayout linearLayout, ViewStub viewStub, IconicsCheckBox iconicsCheckBox, IconicsCheckBox iconicsCheckBox2, IconicsCheckBox iconicsCheckBox3, IconicsCheckBox iconicsCheckBox4, SingleAdView singleAdView, PpFormVertical ppFormVertical, PpFormVertical ppFormVertical2, PpFormVertical ppFormVertical3, PpFormVertical ppFormVertical4, PpFormVertical ppFormVertical5, NestedScrollView nestedScrollView, PpButton ppButton, TextView textView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout) {
        this.f4212a = linearLayout;
        this.f4213b = viewStub;
        this.f4214c = iconicsCheckBox;
        this.f4215d = iconicsCheckBox2;
        this.f4216e = iconicsCheckBox3;
        this.f4217f = iconicsCheckBox4;
        this.f4218g = singleAdView;
        this.f4219i = ppFormVertical;
        this.f4220j = ppFormVertical2;
        this.f4221o = ppFormVertical3;
        this.f4222p = ppFormVertical4;
        this.t = ppFormVertical5;
        this.f4223v = nestedScrollView;
        this.f4224w = ppButton;
        this.f4208A = textView;
        this.f4209B = textView2;
        this.f4210C = textView3;
        this.f4211H = constraintLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4212a;
    }
}
