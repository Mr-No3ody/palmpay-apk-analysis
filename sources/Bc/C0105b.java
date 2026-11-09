package Bc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel;
import com.transsnet.palmpay.custom_view.FaceRecognitionGuideView;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.custom_view.autoheightviewpager.AutoHeightViewPager;

/* JADX INFO: renamed from: Bc.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0105b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f667g;

    public /* synthetic */ C0105b(ViewGroup viewGroup, View view, View view2, View view3, View view4, View view5, int i7) {
        this.f661a = i7;
        this.f662b = viewGroup;
        this.f663c = view;
        this.f664d = view2;
        this.f665e = view3;
        this.f666f = view4;
        this.f667g = view5;
    }

    public static C0105b a(View view) {
        int i7 = Ac.e.ivBg;
        ImageView imageView = (ImageView) p059e1.a.m(i7, view);
        if (imageView != null) {
            i7 = Ac.e.tvAmount;
            TextView textView = (TextView) p059e1.a.m(i7, view);
            if (textView != null) {
                i7 = Ac.e.tvTitle;
                TextView textView2 = (TextView) p059e1.a.m(i7, view);
                if (textView2 != null) {
                    i7 = Ac.e.tvUse;
                    TextView textView3 = (TextView) p059e1.a.m(i7, view);
                    if (textView3 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        return new C0105b(constraintLayout, imageView, textView, textView2, textView3, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    public static C0105b b(View view) {
        int i7 = p159kd.e.btnView;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, view);
        if (ppButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i7 = p159kd.e.ivClose;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, view);
            if (iconicsImageView != null) {
                i7 = p159kd.e.tvTips;
                AppCompatTextView appCompatTextView = (AppCompatTextView) p059e1.a.m(i7, view);
                if (appCompatTextView != null) {
                    i7 = p159kd.e.tvTitle;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) p059e1.a.m(i7, view);
                    if (appCompatTextView2 != null) {
                        return new C0105b(constraintLayout, ppButton, constraintLayout, iconicsImageView, appCompatTextView, appCompatTextView2, 20);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f661a) {
            case 0:
                return (LinearLayout) this.f662b;
            case 1:
                return (LinearLayout) this.f662b;
            case 2:
                return (ConstraintLayout) this.f662b;
            case 3:
                return (LinearLayout) this.f662b;
            case 4:
                return (NestedScrollView) this.f663c;
            case 5:
                return (ConstraintLayout) this.f662b;
            case 6:
                return (LinearLayout) this.f662b;
            case 7:
                return (ConstraintLayout) this.f662b;
            case 8:
                return (ConstraintLayout) this.f662b;
            case 9:
                return (RelativeLayout) this.f662b;
            case 10:
                return (RelativeLayout) this.f662b;
            case 11:
                return (FrameLayout) this.f662b;
            case 12:
                return (LinearLayout) this.f662b;
            case 13:
                return (ConstraintLayout) this.f662b;
            case 14:
                return (ConstraintLayout) this.f662b;
            case 15:
                return (FaceRecognitionGuideView) this.f666f;
            case 16:
                return (ConstraintLayout) this.f662b;
            case 17:
                return this.f664d;
            case 18:
                return (ConstraintLayout) this.f662b;
            case 19:
                return (OrderResultRewardModel) this.f664d;
            default:
                return (ConstraintLayout) this.f662b;
        }
    }

    public /* synthetic */ C0105b(ViewGroup viewGroup, View view, View view2, TextView textView, TextView textView2, TextView textView3, int i7) {
        this.f661a = i7;
        this.f662b = viewGroup;
        this.f666f = view;
        this.f667g = view2;
        this.f663c = textView;
        this.f664d = textView2;
        this.f665e = textView3;
    }

    public /* synthetic */ C0105b(ViewGroup viewGroup, Object obj, View view, TextView textView, TextView textView2, View view2, int i7) {
        this.f661a = i7;
        this.f662b = viewGroup;
        this.f665e = obj;
        this.f666f = view;
        this.f663c = textView;
        this.f664d = textView2;
        this.f667g = view2;
    }

    public C0105b(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout2) {
        this.f661a = 5;
        this.f662b = constraintLayout;
        this.f666f = imageView;
        this.f663c = textView;
        this.f664d = textView2;
        this.f665e = textView3;
        this.f667g = constraintLayout2;
    }

    public C0105b(RelativeLayout relativeLayout, TitleEditView titleEditView, TitleEditView titleEditView2, TitleEditView titleEditView3, TextView textView, TextView textView2) {
        this.f661a = 9;
        this.f662b = relativeLayout;
        this.f665e = titleEditView;
        this.f666f = titleEditView2;
        this.f667g = titleEditView3;
        this.f663c = textView;
        this.f664d = textView2;
    }

    public C0105b(OrderResultRewardModel orderResultRewardModel, AutoHeightViewPager autoHeightViewPager, LottieAnimationView lottieAnimationView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView) {
        this.f661a = 19;
        this.f664d = orderResultRewardModel;
        this.f665e = autoHeightViewPager;
        this.f666f = lottieAnimationView;
        this.f662b = linearLayout;
        this.f667g = linearLayout2;
        this.f663c = textView;
    }

    public C0105b(LinearLayout linearLayout, PpFormVertical ppFormVertical, PpTitleBar ppTitleBar, TextView textView, PpButton ppButton, TextView textView2) {
        this.f661a = 12;
        this.f662b = linearLayout;
        this.f665e = ppFormVertical;
        this.f666f = ppTitleBar;
        this.f663c = textView;
        this.f667g = ppButton;
        this.f664d = textView2;
    }

    public C0105b(FaceRecognitionGuideView faceRecognitionGuideView, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f661a = 15;
        this.f666f = faceRecognitionGuideView;
        this.f667g = imageView;
        this.f662b = linearLayout;
        this.f663c = textView;
        this.f664d = textView2;
        this.f665e = textView3;
    }

    public C0105b(LinearLayout linearLayout, TextView textView, TextView textView2, IconicsTextView iconicsTextView, IconicsTextView iconicsTextView2, TextView textView3) {
        this.f661a = 0;
        this.f662b = linearLayout;
        this.f663c = textView;
        this.f664d = textView2;
        this.f666f = iconicsTextView;
        this.f667g = iconicsTextView2;
        this.f665e = textView3;
    }

    public C0105b(View view, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, TextView textView) {
        this.f661a = 17;
        this.f664d = view;
        this.f665e = imageView;
        this.f666f = imageView2;
        this.f667g = imageView3;
        this.f662b = linearLayout;
        this.f663c = textView;
    }

    public C0105b(NestedScrollView nestedScrollView, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, RecyclerView recyclerView) {
        this.f661a = 4;
        this.f663c = nestedScrollView;
        this.f662b = linearLayout;
        this.f664d = imageView;
        this.f665e = imageView2;
        this.f666f = linearLayout2;
        this.f667g = recyclerView;
    }
}
