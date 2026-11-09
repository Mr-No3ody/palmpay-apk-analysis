package Bc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.viewmodel.ReportTransactionItem;
import com.transsnet.palmpay.custom_view.CoinRainNewView;
import com.transsnet.palmpay.custom_view.model.ModelAmountList;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelCopyableText;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.wang.avi.AVLoadingIndicatorView;

/* JADX INFO: renamed from: Bc.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0106c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f668a = 6;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f674g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewGroup f675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f676j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f678p;
    public final View t;

    public C0106c(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ImageView imageView, ImageView imageView2, FrameLayout frameLayout, ImageView imageView3, View view, View view2, View view3, View view4, TextView textView) {
        this.f675i = constraintLayout;
        this.f672e = appCompatImageView;
        this.f670c = imageView;
        this.f671d = imageView2;
        this.f673f = frameLayout;
        this.f674g = imageView3;
        this.f677o = view;
        this.f678p = view2;
        this.t = view3;
        this.f676j = view4;
        this.f669b = textView;
    }

    public static C0106c a(View view) {
        View viewM;
        int i7 = Ac.e.group1;
        Group group = (Group) p059e1.a.m(i7, view);
        if (group != null) {
            i7 = Ac.e.iv_avatar;
            ImageView imageView = (ImageView) p059e1.a.m(i7, view);
            if (imageView != null) {
                i7 = Ac.e.opLayout;
                FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, view);
                if (frameLayout != null) {
                    i7 = Ac.e.space;
                    if (((Space) p059e1.a.m(i7, view)) != null) {
                        i7 = Ac.e.tvAccount;
                        TextView textView = (TextView) p059e1.a.m(i7, view);
                        if (textView != null) {
                            i7 = Ac.e.tvApplicationTime;
                            TextView textView2 = (TextView) p059e1.a.m(i7, view);
                            if (textView2 != null) {
                                i7 = Ac.e.tvApplicationTitle;
                                TextView textView3 = (TextView) p059e1.a.m(i7, view);
                                if (textView3 != null) {
                                    i7 = Ac.e.tvName;
                                    TextView textView4 = (TextView) p059e1.a.m(i7, view);
                                    if (textView4 != null) {
                                        i7 = Ac.e.tvOperate;
                                        IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, view);
                                        if (iconicsTextView != null) {
                                            i7 = Ac.e.tvStatus;
                                            TextView textView5 = (TextView) p059e1.a.m(i7, view);
                                            if (textView5 != null && (viewM = p059e1.a.m((i7 = Ac.e.viewDivider), view)) != null) {
                                                return new C0106c((ConstraintLayout) view, group, imageView, frameLayout, textView, textView2, textView3, textView4, iconicsTextView, textView5, viewM);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f668a) {
            case 0:
                return (LinearLayout) this.f675i;
            case 1:
                return (ConstraintLayout) this.f675i;
            case 2:
                return (ConstraintLayout) this.f675i;
            case 3:
                return (ConstraintLayout) this.f675i;
            case 4:
                return (ConstraintLayout) this.f675i;
            case 5:
                return (RelativeLayout) this.f675i;
            default:
                return this.f677o;
        }
    }

    public C0106c(ConstraintLayout constraintLayout, Group group, ImageView imageView, FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, IconicsTextView iconicsTextView, TextView textView5, View view) {
        this.f675i = constraintLayout;
        this.f671d = group;
        this.f670c = imageView;
        this.f678p = frameLayout;
        this.f669b = textView;
        this.f672e = textView2;
        this.f673f = textView3;
        this.f674g = textView4;
        this.t = iconicsTextView;
        this.f676j = textView5;
        this.f677o = view;
    }

    public C0106c(ConstraintLayout constraintLayout, Group group, TextView textView, AppCompatImageView appCompatImageView, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView2, TextView textView3, TextView textView4, CoinRainNewView coinRainNewView) {
        this.f675i = constraintLayout;
        this.f676j = group;
        this.f669b = textView;
        this.f677o = appCompatImageView;
        this.f670c = imageView;
        this.f671d = imageView2;
        this.f678p = imageView3;
        this.f672e = textView2;
        this.f673f = textView3;
        this.f674g = textView4;
        this.t = coinRainNewView;
    }

    public C0106c(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, View view, View view2, View view3, TextView textView3, TextView textView4, TextView textView5) {
        this.f675i = linearLayout;
        this.f670c = imageView;
        this.f669b = textView;
        this.f672e = textView2;
        this.f671d = imageView2;
        this.f677o = view;
        this.f678p = view2;
        this.t = view3;
        this.f673f = textView3;
        this.f674g = textView4;
        this.f676j = textView5;
    }

    public C0106c(RelativeLayout relativeLayout, ModelAmountList modelAmountList, ReportTransactionItem reportTransactionItem, ModelTitleContentImg modelTitleContentImg, ModelTitleContentImg modelTitleContentImg2, ScrollView scrollView, ModelBillDetailTitle modelBillDetailTitle, ModelCopyableText modelCopyableText, TextView textView, TextView textView2, View view) {
        this.f675i = relativeLayout;
        this.f670c = modelAmountList;
        this.f671d = reportTransactionItem;
        this.f673f = modelTitleContentImg;
        this.f674g = modelTitleContentImg2;
        this.f676j = scrollView;
        this.f678p = modelBillDetailTitle;
        this.t = modelCopyableText;
        this.f669b = textView;
        this.f672e = textView2;
        this.f677o = view;
    }

    public C0106c(View view, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2, LinearLayout linearLayout, LottieAnimationView lottieAnimationView, RecyclerView recyclerView, TextView textView, TextView textView2, AVLoadingIndicatorView aVLoadingIndicatorView) {
        this.f677o = view;
        this.f673f = constraintLayout;
        this.f670c = imageView;
        this.f671d = imageView2;
        this.f674g = imageView3;
        this.f676j = constraintLayout2;
        this.f675i = linearLayout;
        this.f678p = lottieAnimationView;
        this.f669b = textView;
        this.f672e = textView2;
        this.t = aVLoadingIndicatorView;
    }

    public C0106c(ConstraintLayout constraintLayout, View view, FrameLayout frameLayout, View view2, View view3, IconicsImageView iconicsImageView, IconicsImageView iconicsImageView2, TextView textView, TextView textView2, PpTitleBar ppTitleBar, TextView textView3) {
        this.f675i = constraintLayout;
        this.f677o = view;
        this.f670c = frameLayout;
        this.f678p = view2;
        this.t = view3;
        this.f671d = iconicsImageView;
        this.f674g = iconicsImageView2;
        this.f669b = textView;
        this.f672e = textView2;
        this.f676j = ppTitleBar;
        this.f673f = textView3;
    }
}
