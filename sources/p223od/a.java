package p223od;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import p159kd.e;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final TextView f40278A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final TextView f40279B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final TextView f40280C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final TextView f40281H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final TextView f40282L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final TextView f40283M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final TextView f40284Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f40285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f40286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpAmountEditText f40287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f40288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EditText f40289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IconicsImageView f40290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f40291g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f40292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f40293j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IconicsImageView f40294o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DigitalKeyboardView f40295p;
    public final LinearLayout t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RecyclerView f40296v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f40297w;

    public a(RelativeLayout relativeLayout, TextView textView, PpAmountEditText ppAmountEditText, View view, EditText editText, IconicsImageView iconicsImageView, ImageView imageView, ImageView imageView2, ImageView imageView3, IconicsImageView iconicsImageView2, DigitalKeyboardView digitalKeyboardView, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.f40285a = relativeLayout;
        this.f40286b = textView;
        this.f40287c = ppAmountEditText;
        this.f40288d = view;
        this.f40289e = editText;
        this.f40290f = iconicsImageView;
        this.f40291g = imageView;
        this.f40292i = imageView2;
        this.f40293j = imageView3;
        this.f40294o = iconicsImageView2;
        this.f40295p = digitalKeyboardView;
        this.t = linearLayout;
        this.f40296v = recyclerView;
        this.f40297w = textView2;
        this.f40278A = textView3;
        this.f40279B = textView4;
        this.f40280C = textView5;
        this.f40281H = textView6;
        this.f40282L = textView7;
        this.f40283M = textView8;
        this.f40284Q = textView9;
    }

    public static a a(LayoutInflater layoutInflater) {
        View viewM;
        View viewInflate = layoutInflater.inflate(f.sm_activity_merchant_input_amount, (ViewGroup) null, false);
        int i7 = e.balance_tv;
        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
        if (textView != null) {
            i7 = e.cl_amount_input;
            if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = e.cl_input;
                if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = e.clNote;
                    if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = e.etAmount;
                        PpAmountEditText ppAmountEditText = (PpAmountEditText) p059e1.a.m(i7, viewInflate);
                        if (ppAmountEditText != null && (viewM = p059e1.a.m((i7 = e.etAmountErrorSpace), viewInflate)) != null) {
                            i7 = e.et_note;
                            EditText editText = (EditText) p059e1.a.m(i7, viewInflate);
                            if (editText != null) {
                                i7 = e.iiv_clear;
                                IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                                if (iconicsImageView != null) {
                                    i7 = e.iv_discount;
                                    ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                                    if (imageView != null) {
                                        i7 = e.ivRecentlyBank;
                                        ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                                        if (imageView2 != null) {
                                            i7 = e.ivTag;
                                            ImageView imageView3 = (ImageView) p059e1.a.m(i7, viewInflate);
                                            if (imageView3 != null) {
                                                i7 = e.iv_transfer_safe_arrow;
                                                IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                                                if (iconicsImageView2 != null) {
                                                    i7 = e.keyboardView;
                                                    DigitalKeyboardView digitalKeyboardView = (DigitalKeyboardView) p059e1.a.m(i7, viewInflate);
                                                    if (digitalKeyboardView != null) {
                                                        i7 = e.ll_transfer_safe;
                                                        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                        if (linearLayout != null) {
                                                            i7 = e.recipient_info_bottom_barrier;
                                                            if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
                                                                i7 = e.rvMoneyList;
                                                                RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                                                                if (recyclerView != null) {
                                                                    i7 = e.titleBar;
                                                                    if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                                                                        i7 = e.tvAmountTitle;
                                                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                        if (textView2 != null) {
                                                                            i7 = e.tv_next;
                                                                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                            if (textView3 != null) {
                                                                                i7 = e.tvNoteTitle;
                                                                                TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                if (textView4 != null) {
                                                                                    i7 = e.tvReceiptName;
                                                                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                    if (textView5 != null) {
                                                                                        i7 = e.tvRecentlyBankName;
                                                                                        TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                        if (textView6 != null) {
                                                                                            i7 = e.tvRecentlyShopName;
                                                                                            TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                            if (textView7 != null) {
                                                                                                i7 = e.tvTips;
                                                                                                TextView textView8 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                if (textView8 != null) {
                                                                                                    i7 = e.tv_transfer_safe_content;
                                                                                                    TextView textView9 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                    if (textView9 != null) {
                                                                                                        i7 = e.viewContainer;
                                                                                                        if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                                            return new a((RelativeLayout) viewInflate, textView, ppAmountEditText, viewM, editText, iconicsImageView, imageView, imageView2, imageView3, iconicsImageView2, digitalKeyboardView, linearLayout, recyclerView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40285a;
    }
}
