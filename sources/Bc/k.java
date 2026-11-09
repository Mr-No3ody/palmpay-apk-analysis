package Bc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV3View;
import com.transsnet.palmpay.custom_view.PatternLockView;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f752f;

    public /* synthetic */ k(LinearLayout linearLayout, View view, View view2, View view3, View view4, int i7) {
        this.f747a = i7;
        this.f748b = linearLayout;
        this.f751e = view;
        this.f752f = view2;
        this.f750d = view3;
        this.f749c = view4;
    }

    public static k a(View view) {
        View viewM;
        View viewM2;
        int i7 = L6.f.tv_negative;
        TextView textView = (TextView) p059e1.a.m(i7, view);
        if (textView != null) {
            i7 = L6.f.tv_positive;
            TextView textView2 = (TextView) p059e1.a.m(i7, view);
            if (textView2 != null && (viewM = p059e1.a.m((i7 = L6.f.v_divider), view)) != null && (viewM2 = p059e1.a.m((i7 = L6.f.v_divider_vertical), view)) != null) {
                return new k((ConstraintLayout) view, textView, textView2, viewM, viewM2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    public static k b(View view) {
        int i7 = Pd.c.mls_ok;
        TextView textView = (TextView) p059e1.a.m(i7, view);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i7 = Pd.c.mls_tv1;
            TextView textView2 = (TextView) p059e1.a.m(i7, view);
            if (textView2 != null) {
                i7 = Pd.c.mls_tv2;
                TextView textView3 = (TextView) p059e1.a.m(i7, view);
                if (textView3 != null) {
                    return new k(linearLayout, textView, linearLayout, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    public static k c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(Ac.f.main_activity_minor_account_list, (ViewGroup) null, false);
        int i7 = Ac.e.cslEmpty;
        ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
        if (constraintLayout != null) {
            i7 = Ac.e.ivTemp;
            if (((AppCompatImageView) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = Ac.e.srvList;
                SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) p059e1.a.m(i7, viewInflate);
                if (swipeRecyclerView != null) {
                    i7 = Ac.e.titleBar;
                    PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                    if (ppTitleBar != null) {
                        i7 = Ac.e.tvHistory;
                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView != null) {
                            return new k((LinearLayout) viewInflate, constraintLayout, swipeRecyclerView, ppTitleBar, textView, 0);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f747a) {
            case 0:
                return (LinearLayout) this.f748b;
            case 1:
                return (LinearLayout) this.f748b;
            case 2:
                return (ConstraintLayout) this.f751e;
            case 3:
                return (ConstraintLayout) this.f751e;
            case 4:
                return (ConstraintLayout) this.f751e;
            case 5:
                return (ConstraintLayout) this.f751e;
            case 6:
                return (ConstraintLayout) this.f751e;
            case 7:
                return (LinearLayout) this.f748b;
            case 8:
                return (ConstraintLayout) this.f751e;
            case 9:
                return (ConstraintLayout) this.f751e;
            case 10:
                return (ConstraintLayout) this.f751e;
            case 11:
                return (ConstraintLayout) this.f751e;
            case 12:
                return (ConstraintLayout) this.f751e;
            case 13:
                return (LinearLayout) this.f748b;
            case 14:
                return (LinearLayout) this.f748b;
            case 15:
                return this.f748b;
            case 16:
                return (LinearLayout) this.f748b;
            case 17:
                return (LinearLayout) this.f748b;
            default:
                return (ConstraintLayout) this.f751e;
        }
    }

    public /* synthetic */ k(ConstraintLayout constraintLayout, View view, Object obj, Object obj2, Object obj3, int i7) {
        this.f747a = i7;
        this.f751e = constraintLayout;
        this.f748b = view;
        this.f752f = obj;
        this.f750d = obj2;
        this.f749c = obj3;
    }

    public /* synthetic */ k(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, View view, ViewGroup viewGroup, TextView textView, TextView textView2, int i7) {
        this.f747a = i7;
        this.f751e = constraintLayout;
        this.f748b = appCompatImageView;
        this.f752f = view;
        this.f749c = textView;
        this.f750d = textView2;
    }

    public /* synthetic */ k(ConstraintLayout constraintLayout, PpTitleBar ppTitleBar, TextView textView, TextView textView2, ViewGroup viewGroup, int i7) {
        this.f747a = i7;
        this.f751e = constraintLayout;
        this.f750d = ppTitleBar;
        this.f749c = textView;
        this.f748b = textView2;
        this.f752f = viewGroup;
    }

    public k(View view, PpButton ppButton, TextView textView, TextView textView2, TextView textView3) {
        this.f747a = 15;
        this.f748b = view;
        this.f751e = ppButton;
        this.f749c = textView;
        this.f752f = textView2;
        this.f750d = textView3;
    }

    public k(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, TextView textView3) {
        this.f747a = 13;
        this.f748b = linearLayout;
        this.f749c = textView;
        this.f751e = linearLayout2;
        this.f752f = textView2;
        this.f750d = textView3;
    }

    public k(ConstraintLayout constraintLayout, TextView textView, TextView textView2, View view, View view2) {
        this.f747a = 12;
        this.f751e = constraintLayout;
        this.f749c = textView;
        this.f748b = textView2;
        this.f752f = view;
        this.f750d = view2;
    }

    public k(LinearLayout linearLayout, IconicsImageView iconicsImageView, LinearLayout linearLayout2, TextView textView, LinearLayout linearLayout3) {
        this.f747a = 14;
        this.f748b = linearLayout;
        this.f751e = iconicsImageView;
        this.f752f = linearLayout2;
        this.f749c = textView;
        this.f750d = linearLayout3;
    }

    public k(ConstraintLayout constraintLayout, View view, PatternLockView patternLockView, TextView textView, TextView textView2) {
        this.f747a = 9;
        this.f751e = constraintLayout;
        this.f748b = view;
        this.f752f = patternLockView;
        this.f749c = textView;
        this.f750d = textView2;
    }

    public k(LinearLayout linearLayout, TextView textView, PpTitleBar ppTitleBar, TextView textView2, OneTimeCodeV3View oneTimeCodeV3View) {
        this.f747a = 7;
        this.f748b = linearLayout;
        this.f749c = textView;
        this.f750d = ppTitleBar;
        this.f751e = textView2;
        this.f752f = oneTimeCodeV3View;
    }

    public k(ConstraintLayout constraintLayout, FrameLayout frameLayout, IconicsImageView iconicsImageView, IconicsImageView iconicsImageView2, LinearLayout linearLayout) {
        this.f747a = 11;
        this.f751e = constraintLayout;
        this.f752f = frameLayout;
        this.f750d = iconicsImageView;
        this.f749c = iconicsImageView2;
        this.f748b = linearLayout;
    }

    public k(LinearLayout linearLayout, TextView textView, TextView textView2, PpTitleBar ppTitleBar, TextView textView3) {
        this.f747a = 1;
        this.f748b = linearLayout;
        this.f749c = textView;
        this.f751e = textView2;
        this.f750d = ppTitleBar;
        this.f752f = textView3;
    }

    public k(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, IconicsTextView iconicsTextView, TextView textView2) {
        this.f747a = 10;
        this.f751e = constraintLayout;
        this.f748b = appCompatImageView;
        this.f749c = textView;
        this.f752f = iconicsTextView;
        this.f750d = textView2;
    }

    public k(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, IconicsImageView iconicsImageView, IconicsImageView iconicsImageView2, ImageView imageView, TextView textView, TextView textView2) {
        this.f747a = 5;
        this.f751e = constraintLayout;
        this.f748b = appCompatImageView;
        this.f752f = imageView;
        this.f749c = textView;
        this.f750d = textView2;
    }
}
