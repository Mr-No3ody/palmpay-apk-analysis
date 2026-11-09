package Bc;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentEarnLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.text.ImageTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.StateImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final View f588A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final View f589B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f590a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f596g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AppCompatImageView f598j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f599o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f600p;
    public final View t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f601v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f602w;

    public B(ConstraintLayout constraintLayout, ViewStub viewStub, PpButton ppButton, PpButton ppButton2, Group group, ConstraintLayout constraintLayout2, IconicsImageView iconicsImageView, ImageView imageView, ImageView imageView2, PpTitleBar ppTitleBar, TextView textView, TextView textView2, TextView textView3, IconicsTextView iconicsTextView, TextView textView4) {
        this.f593d = constraintLayout;
        this.f596g = viewStub;
        this.f597i = ppButton;
        this.f599o = ppButton2;
        this.f595f = group;
        this.f591b = constraintLayout2;
        this.f598j = iconicsImageView;
        this.f592c = imageView;
        this.f600p = imageView2;
        this.f588A = ppTitleBar;
        this.f594e = textView;
        this.t = textView2;
        this.f601v = textView3;
        this.f589B = iconicsTextView;
        this.f602w = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f590a) {
            case 0:
                return (ConstraintLayout) this.f593d;
            case 1:
                return (LinearLayout) this.f591b;
            case 2:
                return (ConstraintLayout) this.f593d;
            case 3:
                return (ConstraintLayout) this.f593d;
            default:
                return (LinearLayout) this.f591b;
        }
    }

    public B(LinearLayout linearLayout, LinearLayout linearLayout2, IconicsTextView iconicsTextView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, AppCompatImageView appCompatImageView6, AppCompatImageView appCompatImageView7, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, TextView textView, PpButton ppButton) {
        this.f591b = linearLayout;
        this.f592c = linearLayout2;
        this.f595f = iconicsTextView;
        this.f596g = appCompatImageView;
        this.f597i = appCompatImageView2;
        this.f598j = appCompatImageView3;
        this.f599o = appCompatImageView4;
        this.f600p = appCompatImageView5;
        this.t = appCompatImageView6;
        this.f601v = appCompatImageView7;
        this.f593d = constraintLayout;
        this.f602w = constraintLayout2;
        this.f588A = recyclerView;
        this.f594e = textView;
        this.f589B = ppButton;
    }

    public B(ConstraintLayout constraintLayout, ViewStub viewStub, PpButton ppButton, View view, IconicsImageView iconicsImageView, FrameLayout frameLayout, RecyclerView recyclerView, LinearLayout linearLayout, LinearLayout linearLayout2, PpTitleBar ppTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f593d = constraintLayout;
        this.f595f = viewStub;
        this.f596g = ppButton;
        this.f597i = view;
        this.f598j = iconicsImageView;
        this.f599o = frameLayout;
        this.f600p = recyclerView;
        this.f591b = linearLayout;
        this.f592c = linearLayout2;
        this.f589B = ppTitleBar;
        this.f594e = textView;
        this.t = textView2;
        this.f601v = textView3;
        this.f602w = textView4;
        this.f588A = textView5;
    }

    public B(LinearLayout linearLayout, IconicsImageView iconicsImageView, C0107d c0107d, ViewStub viewStub, LinearLayout linearLayout2, FlexiBankModelPaymentEarnLayout flexiBankModelPaymentEarnLayout, NestedScrollView nestedScrollView, ViewStub viewStub2, ViewStub viewStub3, ViewStub viewStub4, ViewStub viewStub5, ViewStub viewStub6, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.f591b = linearLayout;
        this.f598j = iconicsImageView;
        this.f593d = c0107d;
        this.f595f = viewStub;
        this.f592c = linearLayout2;
        this.f596g = flexiBankModelPaymentEarnLayout;
        this.f597i = nestedScrollView;
        this.f599o = viewStub2;
        this.f600p = viewStub3;
        this.f601v = viewStub4;
        this.f602w = viewStub5;
        this.f588A = viewStub6;
        this.f589B = recyclerView;
        this.f594e = textView;
        this.t = textView2;
    }

    public B(ConstraintLayout constraintLayout, Group group, View view, Group group2, IconicsImageView iconicsImageView, IconicsImageView iconicsImageView2, StateImageView stateImageView, ConstraintLayout constraintLayout2, LinearLayout linearLayout, ViewStub viewStub, LinearLayout linearLayout2, ContentLoadingProgressBar contentLoadingProgressBar, ViewStub viewStub2, ViewStub viewStub3, TextView textView, ImageTextView imageTextView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f593d = constraintLayout;
        this.f595f = group;
        this.f597i = view;
        this.f596g = group2;
        this.f598j = iconicsImageView;
        this.f599o = stateImageView;
        this.f591b = linearLayout;
        this.f592c = linearLayout2;
        this.f600p = contentLoadingProgressBar;
        this.f594e = textView;
        this.f589B = imageTextView;
        this.t = textView2;
        this.f601v = textView3;
        this.f602w = textView4;
        this.f588A = textView5;
    }
}
