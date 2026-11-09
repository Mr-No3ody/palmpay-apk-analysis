package Bc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.viewmodel.ActivityWebView;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;

/* JADX INFO: renamed from: Bc.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0107d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f683e;

    public /* synthetic */ C0107d(View view, Object obj, Object obj2, View view2, int i7) {
        this.f679a = i7;
        this.f680b = view;
        this.f681c = obj;
        this.f682d = obj2;
        this.f683e = view2;
    }

    public static C0107d a(View view) {
        int i7 = Ac.e.tvExpireTime;
        TextView textView = (TextView) p059e1.a.m(i7, view);
        if (textView != null) {
            i7 = Ac.e.tvPointAmount;
            IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, view);
            if (iconicsTextView != null) {
                i7 = Ac.e.tvPointTitle;
                TextView textView2 = (TextView) p059e1.a.m(i7, view);
                if (textView2 != null) {
                    return new C0107d((ConstraintLayout) view, textView, iconicsTextView, textView2, 6);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    public static C0107d b(View view) {
        int i7 = F8.d.cbOption;
        IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) p059e1.a.m(i7, view);
        if (iconicsCheckBox != null) {
            i7 = F8.d.tvSubtitle;
            TextView textView = (TextView) p059e1.a.m(i7, view);
            if (textView != null) {
                i7 = F8.d.tvTitle;
                TextView textView2 = (TextView) p059e1.a.m(i7, view);
                if (textView2 != null) {
                    return new C0107d((ConstraintLayout) view, iconicsCheckBox, textView, textView2, 14);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    public static C0107d c(View view) {
        int i7 = F8.d.ivBack;
        IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, view);
        if (iconicsImageView != null) {
            i7 = F8.d.ivContactUs;
            IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, view);
            if (iconicsImageView2 != null) {
                i7 = F8.d.tvTitle;
                TextView textView = (TextView) p059e1.a.m(i7, view);
                if (textView != null) {
                    return new C0107d((ConstraintLayout) view, iconicsImageView, iconicsImageView2, textView, 15);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f679a) {
            case 0:
                return (LinearLayout) this.f680b;
            case 1:
                return (ConstraintLayout) this.f681c;
            case 2:
                return (LinearLayout) this.f680b;
            case 3:
                return (LinearLayout) this.f680b;
            case 4:
                return (LinearLayout) this.f680b;
            case 5:
                return (ConstraintLayout) this.f680b;
            case 6:
                return (ConstraintLayout) this.f680b;
            case 7:
                return (ConstraintLayout) this.f681c;
            case 8:
                return (LinearLayout) this.f680b;
            case 9:
                return (LinearLayout) this.f680b;
            case 10:
                return (LinearLayout) this.f680b;
            case 11:
                return (RelativeLayout) this.f680b;
            case 12:
                return (ConstraintLayout) this.f680b;
            case 13:
                return (LinearLayout) this.f680b;
            case 14:
                return (ConstraintLayout) this.f680b;
            case 15:
                return (ConstraintLayout) this.f680b;
            case 16:
                return this.f680b;
            case 17:
                return (LinearLayout) this.f680b;
            case 18:
                return (ConstraintLayout) this.f680b;
            case 19:
                return (ConstraintLayout) this.f680b;
            default:
                return (ConstraintLayout) this.f680b;
        }
    }

    public /* synthetic */ C0107d(ViewGroup viewGroup, PpTitleBar ppTitleBar, View view, View view2, int i7) {
        this.f679a = i7;
        this.f680b = viewGroup;
        this.f683e = ppTitleBar;
        this.f681c = view;
        this.f682d = view2;
    }

    public C0107d(ConstraintLayout constraintLayout, PpButton ppButton, LinearLayout linearLayout, PpTitleBar ppTitleBar) {
        this.f679a = 7;
        this.f681c = constraintLayout;
        this.f682d = ppButton;
        this.f680b = linearLayout;
        this.f683e = ppTitleBar;
    }

    public C0107d(ConstraintLayout constraintLayout, PpButton ppButton, PpTitleBar ppTitleBar, ActivityWebView activityWebView) {
        this.f679a = 12;
        this.f680b = constraintLayout;
        this.f681c = ppButton;
        this.f683e = ppTitleBar;
        this.f682d = activityWebView;
    }

    public C0107d(ConstraintLayout constraintLayout, LinearLayout linearLayout, OrderResultCustomerServiceModel orderResultCustomerServiceModel, OrderResultHeaderModel orderResultHeaderModel) {
        this.f679a = 1;
        this.f681c = constraintLayout;
        this.f680b = linearLayout;
        this.f682d = orderResultCustomerServiceModel;
        this.f683e = orderResultHeaderModel;
    }
}
