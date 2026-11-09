package Bc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.core.viewmodel.ModelPaymentResultProgress;
import com.transsnet.palmpay.custom_view.model.ModelPreviewItem;

/* JADX INFO: renamed from: Bc.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0108e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f690g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f692j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f693o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f694p;

    public /* synthetic */ C0108e(ViewGroup viewGroup, View view, View view2, Object obj, ViewGroup viewGroup2, ViewGroup viewGroup3, View view3, TextView textView, TextView textView2, TextView textView3, int i7) {
        this.f684a = i7;
        this.f687d = viewGroup;
        this.f688e = view;
        this.f689f = view2;
        this.f690g = obj;
        this.f691i = viewGroup2;
        this.f692j = viewGroup3;
        this.f693o = view3;
        this.f685b = textView;
        this.f686c = textView2;
        this.f694p = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f684a) {
            case 0:
                return (RelativeLayout) this.f687d;
            case 1:
                return (LinearLayout) this.f687d;
            case 2:
                return (FrameLayout) this.f687d;
            case 3:
                return (ConstraintLayout) this.f687d;
            default:
                return (NetworkNotConnectView) this.f687d;
        }
    }

    public /* synthetic */ C0108e(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, View view, ViewGroup viewGroup, View view2, TextView textView, TextView textView2, View view3, TextView textView3, View view4, int i7) {
        this.f684a = i7;
        this.f687d = constraintLayout;
        this.f688e = appCompatImageView;
        this.f689f = view;
        this.f690g = viewGroup;
        this.f691i = view2;
        this.f685b = textView;
        this.f686c = textView2;
        this.f692j = view3;
        this.f693o = textView3;
        this.f694p = view4;
    }

    public C0108e(RelativeLayout relativeLayout, SingleAdView singleAdView, ModelPreviewItem modelPreviewItem, ModelPreviewItem modelPreviewItem2, ModelPreviewItem modelPreviewItem3, ModelPreviewItem modelPreviewItem4, ModelPreviewItem modelPreviewItem5, ModelPaymentResultProgress modelPaymentResultProgress, TextView textView, TextView textView2) {
        this.f684a = 0;
        this.f687d = relativeLayout;
        this.f688e = singleAdView;
        this.f689f = modelPreviewItem;
        this.f690g = modelPreviewItem2;
        this.f691i = modelPreviewItem3;
        this.f692j = modelPreviewItem4;
        this.f693o = modelPreviewItem5;
        this.f694p = modelPaymentResultProgress;
        this.f685b = textView;
        this.f686c = textView2;
    }
}
