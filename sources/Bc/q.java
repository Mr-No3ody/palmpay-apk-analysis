package Bc;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.custom_view.CircleProgressView;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.async.AsyncViewStub;
import com.transsnet.palmpay.custom_view.image.RoundImageView;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f814a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f820g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f822j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f823o;

    public q(ConstraintLayout constraintLayout, SingleAdView singleAdView, SingleAdView singleAdView2, ImageView imageView, ImageView imageView2, TextView textView, PpButton ppButton, TextView textView2, TextView textView3) {
        this.f817d = constraintLayout;
        this.f815b = singleAdView;
        this.f818e = singleAdView2;
        this.f819f = imageView;
        this.f820g = imageView2;
        this.f816c = textView;
        this.f821i = ppButton;
        this.f822j = textView2;
        this.f823o = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f814a) {
            case 0:
                return (RelativeLayout) this.f817d;
            case 1:
                return (ConstraintLayout) this.f817d;
            case 2:
                return (ConstraintLayout) this.f817d;
            case 3:
                return (LinearLayout) this.f818e;
            case 4:
                return (ConstraintLayout) this.f817d;
            case 5:
                return (ConstraintLayout) this.f817d;
            case 6:
                return (ConstraintLayout) this.f817d;
            case 7:
                return (LinearLayout) this.f818e;
            case 8:
                return (View) this.f821i;
            default:
                return (ConstraintLayout) this.f817d;
        }
    }

    public q(View view, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f821i = view;
        this.f817d = imageView;
        this.f815b = imageView2;
        this.f818e = imageView3;
        this.f816c = textView;
        this.f822j = textView2;
        this.f819f = textView3;
        this.f820g = textView4;
        this.f823o = textView5;
    }

    public q(LinearLayout linearLayout, ViewStub viewStub, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AsyncViewStub asyncViewStub, PpButton ppButton, TextView textView, TextView textView2, C0107d c0107d) {
        this.f818e = linearLayout;
        this.f817d = viewStub;
        this.f815b = appCompatImageView;
        this.f819f = appCompatImageView2;
        this.f820g = asyncViewStub;
        this.f821i = ppButton;
        this.f816c = textView;
        this.f822j = textView2;
        this.f823o = c0107d;
    }

    public q(ConstraintLayout constraintLayout, ImageView imageView, AppCompatImageView appCompatImageView, ImageView imageView2, IconicsImageView iconicsImageView, IconicsImageView iconicsImageView2, IconicsTextView iconicsTextView, TextView textView, IconicsTextView iconicsTextView2) {
        this.f817d = constraintLayout;
        this.f818e = imageView;
        this.f819f = appCompatImageView;
        this.f820g = imageView2;
        this.f815b = iconicsImageView;
        this.f821i = iconicsImageView2;
        this.f822j = iconicsTextView;
        this.f816c = textView;
        this.f823o = iconicsTextView2;
    }

    public q(ConstraintLayout constraintLayout, IconicsImageView iconicsImageView, IconicsImageView iconicsImageView2, IconicsImageView iconicsImageView3, TextView textView, TextView textView2, IconicsTextView iconicsTextView, TextView textView3, TextView textView4, TextView textView5) {
        this.f817d = constraintLayout;
        this.f815b = iconicsImageView;
        this.f818e = iconicsImageView2;
        this.f816c = textView;
        this.f822j = textView2;
        this.f819f = iconicsTextView;
        this.f820g = textView3;
        this.f821i = textView4;
        this.f823o = textView5;
    }

    public q(ConstraintLayout constraintLayout, FrameLayout frameLayout, CircleProgressView circleProgressView, p pVar, p pVar2, p pVar3, TextView textView, TextView textView2, TextView textView3) {
        this.f817d = constraintLayout;
        this.f815b = frameLayout;
        this.f818e = circleProgressView;
        this.f819f = pVar;
        this.f820g = pVar2;
        this.f821i = pVar3;
        this.f816c = textView;
        this.f822j = textView2;
        this.f823o = textView3;
    }

    public q(ConstraintLayout constraintLayout, IconicsImageView iconicsImageView, PinEntryView pinEntryView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view, ConstraintLayout constraintLayout2) {
        this.f817d = constraintLayout;
        this.f815b = iconicsImageView;
        this.f818e = pinEntryView;
        this.f816c = textView;
        this.f822j = textView2;
        this.f819f = textView3;
        this.f820g = textView4;
        this.f821i = view;
        this.f823o = constraintLayout2;
    }

    public q(RelativeLayout relativeLayout, IconicsImageView iconicsImageView, LinearLayout linearLayout, PpTitleBar ppTitleBar, View view, TextView textView, TextView textView2, LinearLayout linearLayout2, TransactionResultHeaderModel transactionResultHeaderModel) {
        this.f817d = relativeLayout;
        this.f815b = iconicsImageView;
        this.f818e = linearLayout;
        this.f820g = ppTitleBar;
        this.f821i = view;
        this.f816c = textView;
        this.f822j = textView2;
        this.f819f = linearLayout2;
        this.f823o = transactionResultHeaderModel;
    }

    public q(LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, View view, View view2, ViewPager2 viewPager2, CircleProgressView circleProgressView) {
        this.f818e = linearLayout;
        this.f816c = textView;
        this.f822j = textView2;
        this.f817d = imageView;
        this.f815b = textView3;
        this.f821i = view;
        this.f819f = view2;
        this.f820g = viewPager2;
        this.f823o = circleProgressView;
    }

    public q(ConstraintLayout constraintLayout, PpFormVertical ppFormVertical, PpFormVertical ppFormVertical2, PpFormVertical ppFormVertical3, PpFormVertical ppFormVertical4, RoundImageView roundImageView, PpTitleBar ppTitleBar, TextView textView, TextView textView2) {
        this.f817d = constraintLayout;
        this.f815b = ppFormVertical;
        this.f818e = ppFormVertical2;
        this.f819f = ppFormVertical3;
        this.f821i = ppFormVertical4;
        this.f823o = roundImageView;
        this.f820g = ppTitleBar;
        this.f816c = textView;
        this.f822j = textView2;
    }
}
