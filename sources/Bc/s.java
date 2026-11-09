package Bc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.credit.view.InnerRecyclerView;
import com.transsnet.palmpay.credit.view.PhoneInstallmentLoanWaitPayView;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final View f828A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final View f829B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ViewGroup f830C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final View f831H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final View f832L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f833a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f839g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f841j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f842o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f843p;
    public final LinearLayout t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f844v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ViewGroup f845w;

    public s(LinearLayout linearLayout, IconicsCheckBox iconicsCheckBox, LinearLayout linearLayout2, PpTitleBar ppTitleBar, TextView textView, PpButton ppButton, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        this.t = linearLayout;
        this.f829B = iconicsCheckBox;
        this.f844v = linearLayout2;
        this.f830C = ppTitleBar;
        this.f834b = textView;
        this.f832L = ppButton;
        this.f835c = textView2;
        this.f836d = textView3;
        this.f837e = textView4;
        this.f838f = textView5;
        this.f839g = textView6;
        this.f840i = textView7;
        this.f841j = textView8;
        this.f842o = textView9;
        this.f843p = textView10;
        this.f831H = textView11;
        this.f845w = linearLayout3;
        this.f828A = linearLayout4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f833a) {
            case 0:
                return this.t;
            default:
                return (PhoneInstallmentLoanWaitPayView) this.t;
        }
    }

    public s(PhoneInstallmentLoanWaitPayView phoneInstallmentLoanWaitPayView, TextView textView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, InnerRecyclerView innerRecyclerView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, View view, View view2) {
        this.t = phoneInstallmentLoanWaitPayView;
        this.f834b = textView;
        this.f844v = constraintLayout;
        this.f845w = constraintLayout2;
        this.f828A = imageView;
        this.f829B = imageView2;
        this.f830C = innerRecyclerView;
        this.f835c = textView2;
        this.f836d = textView3;
        this.f837e = textView4;
        this.f838f = textView5;
        this.f839g = textView6;
        this.f840i = textView7;
        this.f841j = textView8;
        this.f842o = textView9;
        this.f843p = textView10;
        this.f831H = view;
        this.f832L = view2;
    }
}
