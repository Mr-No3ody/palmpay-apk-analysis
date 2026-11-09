package Bc;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.EmptyView;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.send_money.ui.view.kkcar.KkCarQrView;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final View f731A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final View f732B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final View f733C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f734a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f740g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f742j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f743o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f744p;
    public final View t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f745v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f746w;

    public j(FrameLayout frameLayout, ViewStub viewStub, ViewStub viewStub2, FrameLayout frameLayout2, ViewStub viewStub3, ImageView imageView, AppCompatImageView appCompatImageView, ViewStub viewStub4, ViewStub viewStub5, FrameLayout frameLayout3, View view, PpButton ppButton, C0107d c0107d, ViewStub viewStub6, ViewStub viewStub7, ViewStub viewStub8) {
        this.f736c = frameLayout;
        this.f737d = viewStub;
        this.f738e = viewStub2;
        this.f739f = frameLayout2;
        this.f740g = viewStub3;
        this.f741i = imageView;
        this.f742j = appCompatImageView;
        this.f743o = viewStub4;
        this.f744p = viewStub5;
        this.t = frameLayout3;
        this.f735b = view;
        this.f745v = ppButton;
        this.f746w = c0107d;
        this.f731A = viewStub6;
        this.f732B = viewStub7;
        this.f733C = viewStub8;
    }

    public static j a(View view) {
        int i7 = p159kd.e.account_bank_icon;
        ImageView imageView = (ImageView) p059e1.a.m(i7, view);
        if (imageView != null) {
            i7 = p159kd.e.account_select_bank;
            TextView textView = (TextView) p059e1.a.m(i7, view);
            if (textView != null) {
                i7 = p159kd.e.et_bank_account;
                EditText editText = (EditText) p059e1.a.m(i7, view);
                if (editText != null) {
                    i7 = p159kd.e.iivContacts;
                    IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, view);
                    if (iconicsImageView != null) {
                        i7 = p159kd.e.indicatorView;
                        if (((CircularProgressIndicator) p059e1.a.m(i7, view)) != null) {
                            i7 = p159kd.e.iv_arrow_right;
                            if (((IconicsImageView) p059e1.a.m(i7, view)) != null) {
                                i7 = p159kd.e.iv_query_status;
                                IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, view);
                                if (iconicsImageView2 != null) {
                                    i7 = p159kd.e.ll_recipient_loading;
                                    LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, view);
                                    if (linearLayout != null) {
                                        i7 = p159kd.e.ll_recipient_name;
                                        LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, view);
                                        if (linearLayout2 != null) {
                                            i7 = p159kd.e.ll_status;
                                            LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i7, view);
                                            if (linearLayout3 != null) {
                                                i7 = p159kd.e.med_account;
                                                ModelErrorDivider modelErrorDivider = (ModelErrorDivider) p059e1.a.m(i7, view);
                                                if (modelErrorDivider != null) {
                                                    i7 = p159kd.e.med_bank;
                                                    ModelErrorDivider modelErrorDivider2 = (ModelErrorDivider) p059e1.a.m(i7, view);
                                                    if (modelErrorDivider2 != null) {
                                                        i7 = p159kd.e.rlSelectBank;
                                                        RelativeLayout relativeLayout = (RelativeLayout) p059e1.a.m(i7, view);
                                                        if (relativeLayout != null) {
                                                            i7 = p159kd.e.rv_matched_bank;
                                                            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, view);
                                                            if (recyclerView != null) {
                                                                i7 = p159kd.e.tv_loading_text;
                                                                TextView textView2 = (TextView) p059e1.a.m(i7, view);
                                                                if (textView2 != null) {
                                                                    i7 = p159kd.e.tv_recipient_name;
                                                                    TextView textView3 = (TextView) p059e1.a.m(i7, view);
                                                                    if (textView3 != null) {
                                                                        i7 = p159kd.e.tvSelectBank;
                                                                        TextView textView4 = (TextView) p059e1.a.m(i7, view);
                                                                        if (textView4 != null) {
                                                                            return new j((LinearLayout) view, imageView, textView, editText, iconicsImageView, iconicsImageView2, linearLayout, linearLayout2, linearLayout3, modelErrorDivider, modelErrorDivider2, relativeLayout, recyclerView, textView2, textView3, textView4);
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
        switch (this.f734a) {
            case 0:
                return (LinearLayout) this.f736c;
            case 1:
                return (FrameLayout) this.f736c;
            case 2:
                return (KkCarQrView) this.f737d;
            default:
                return (LinearLayout) this.f736c;
        }
    }

    public j(LinearLayout linearLayout, C0106c c0106c, View view, View view2, View view3, EmptyView emptyView, Group group, VerticalSwipeRefreshLayout verticalSwipeRefreshLayout, RecyclerView recyclerView, PpTitleBar ppTitleBar, IconicsTextView iconicsTextView, TextView textView, IconicsTextView iconicsTextView2, IconicsTextView iconicsTextView3, IconicsTextView iconicsTextView4, View view4) {
        this.f736c = linearLayout;
        this.f737d = c0106c;
        this.f735b = view;
        this.f738e = view2;
        this.f739f = view3;
        this.f741i = emptyView;
        this.f742j = group;
        this.f743o = verticalSwipeRefreshLayout;
        this.f744p = recyclerView;
        this.t = ppTitleBar;
        this.f745v = iconicsTextView;
        this.f733C = textView;
        this.f746w = iconicsTextView2;
        this.f731A = iconicsTextView3;
        this.f732B = iconicsTextView4;
        this.f740g = view4;
    }

    public j(KkCarQrView kkCarQrView, ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, IconicsImageView iconicsImageView, LinearLayout linearLayout, LinearLayout linearLayout2, CircularProgressIndicator circularProgressIndicator, ViewStub viewStub, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f737d = kkCarQrView;
        this.f735b = constraintLayout;
        this.f738e = frameLayout;
        this.f739f = frameLayout2;
        this.f740g = imageView;
        this.f741i = iconicsImageView;
        this.f736c = linearLayout;
        this.f742j = linearLayout2;
        this.f743o = circularProgressIndicator;
        this.f744p = viewStub;
        this.f733C = textView;
        this.t = textView2;
        this.f745v = textView3;
        this.f746w = textView4;
        this.f731A = textView5;
        this.f732B = textView6;
    }

    public j(LinearLayout linearLayout, ImageView imageView, TextView textView, EditText editText, IconicsImageView iconicsImageView, IconicsImageView iconicsImageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ModelErrorDivider modelErrorDivider, ModelErrorDivider modelErrorDivider2, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView2, TextView textView3, TextView textView4) {
        this.f736c = linearLayout;
        this.f737d = imageView;
        this.f733C = textView;
        this.f735b = editText;
        this.f738e = iconicsImageView;
        this.f739f = iconicsImageView2;
        this.f740g = linearLayout2;
        this.f741i = linearLayout3;
        this.f742j = linearLayout4;
        this.f743o = modelErrorDivider;
        this.t = modelErrorDivider2;
        this.f745v = relativeLayout;
        this.f744p = recyclerView;
        this.f746w = textView2;
        this.f731A = textView3;
        this.f732B = textView4;
    }
}
