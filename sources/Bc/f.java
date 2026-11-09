package Bc;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.async.AsyncViewStub;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f701g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f703j;

    public /* synthetic */ f(ViewGroup viewGroup, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i7) {
        this.f695a = i7;
        this.f697c = viewGroup;
        this.f698d = view;
        this.f699e = view2;
        this.f700f = view3;
        this.f701g = view4;
        this.f702i = view5;
        this.f703j = view6;
        this.f696b = view7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f695a) {
            case 0:
                return (LinearLayout) this.f697c;
            case 1:
                return (ConstraintLayout) this.f697c;
            case 2:
                return (RelativeLayout) this.f697c;
            case 3:
                return (LinearLayout) this.f697c;
            case 4:
                return (LinearLayout) this.f697c;
            case 5:
                return (ConstraintLayout) this.f697c;
            case 6:
                return (ConstraintLayout) this.f697c;
            case 7:
                return (ConstraintLayout) this.f698d;
            case 8:
                return (ConstraintLayout) this.f699e;
            case 9:
                return (LinearLayout) this.f697c;
            case 10:
                return (LinearLayout) this.f697c;
            case 11:
                return (LinearLayout) this.f697c;
            case 12:
                return (ModelItemSelection) this.f697c;
            case 13:
                return (ConstraintLayout) this.f697c;
            case 14:
                return (ConstraintLayout) this.f697c;
            case 15:
                return (ConstraintLayout) this.f697c;
            case 16:
                return (LinearLayout) this.f697c;
            default:
                return (ConstraintLayout) this.f698d;
        }
    }

    public f(LinearLayout linearLayout, PinEntryView pinEntryView, PinEntryView pinEntryView2, PpButton ppButton, PpTitleBar ppTitleBar, TextView textView, TextView textView2, TextView textView3) {
        this.f695a = 10;
        this.f697c = linearLayout;
        this.f698d = pinEntryView;
        this.f699e = pinEntryView2;
        this.f700f = ppButton;
        this.f703j = ppTitleBar;
        this.f701g = textView;
        this.f702i = textView2;
        this.f696b = textView3;
    }

    public f(LinearLayout linearLayout, ViewStub viewStub, PinEntryView pinEntryView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view) {
        this.f695a = 9;
        this.f697c = linearLayout;
        this.f696b = viewStub;
        this.f698d = pinEntryView;
        this.f699e = textView;
        this.f700f = textView2;
        this.f701g = textView3;
        this.f702i = textView4;
        this.f703j = view;
    }

    public f(LinearLayout linearLayout, AsyncViewStub asyncViewStub, LinearLayout linearLayout2, Button button, Button button2, LinearLayout linearLayout3, PpTitleBar ppTitleBar, ViewStub viewStub) {
        this.f695a = 0;
        this.f697c = linearLayout;
        this.f700f = asyncViewStub;
        this.f698d = linearLayout2;
        this.f701g = button;
        this.f702i = button2;
        this.f699e = linearLayout3;
        this.f703j = ppTitleBar;
        this.f696b = viewStub;
    }

    public f(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, PpButton ppButton, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f695a = 8;
        this.f699e = constraintLayout;
        this.f697c = linearLayout;
        this.f698d = linearLayout2;
        this.f700f = ppButton;
        this.f701g = textView;
        this.f702i = textView2;
        this.f703j = textView3;
        this.f696b = textView4;
    }

    public f(LinearLayout linearLayout, BannerAdView bannerAdView, f fVar, RecyclerView recyclerView, PpTitleBar ppTitleBar, MarqueeView marqueeView, ViewStub viewStub, ViewStub viewStub2) {
        this.f695a = 16;
        this.f697c = linearLayout;
        this.f698d = bannerAdView;
        this.f699e = fVar;
        this.f700f = recyclerView;
        this.f703j = ppTitleBar;
        this.f701g = marqueeView;
        this.f696b = viewStub;
        this.f702i = viewStub2;
    }

    public f(ConstraintLayout constraintLayout, ViewStub viewStub, PpButton ppButton, PpFormVertical ppFormVertical, PpFormVertical ppFormVertical2, PpTitleBar ppTitleBar, TextView textView, TextView textView2) {
        this.f695a = 6;
        this.f697c = constraintLayout;
        this.f696b = viewStub;
        this.f698d = ppButton;
        this.f699e = ppFormVertical;
        this.f700f = ppFormVertical2;
        this.f703j = ppTitleBar;
        this.f701g = textView;
        this.f702i = textView2;
    }

    public f(ConstraintLayout constraintLayout, SingleAdView singleAdView, ViewStub viewStub, PpButton ppButton, PpTitleBar ppTitleBar, TextView textView, TextView textView2, LinearLayout linearLayout) {
        this.f695a = 7;
        this.f698d = constraintLayout;
        this.f699e = singleAdView;
        this.f696b = viewStub;
        this.f700f = ppButton;
        this.f703j = ppTitleBar;
        this.f701g = textView;
        this.f702i = textView2;
        this.f697c = linearLayout;
    }

    public f(ConstraintLayout constraintLayout, Group group, AppCompatImageView appCompatImageView, ViewStub viewStub, TextView textView, TextView textView2, TextView textView3, IconicsTextView iconicsTextView) {
        this.f695a = 1;
        this.f697c = constraintLayout;
        this.f698d = group;
        this.f699e = appCompatImageView;
        this.f696b = viewStub;
        this.f700f = textView;
        this.f701g = textView2;
        this.f702i = textView3;
        this.f703j = iconicsTextView;
    }

    public f(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f695a = 17;
        this.f698d = constraintLayout;
        this.f699e = appCompatImageView;
        this.f697c = linearLayout;
        this.f700f = textView;
        this.f701g = textView2;
        this.f702i = textView3;
        this.f703j = textView4;
        this.f696b = textView5;
    }
}
