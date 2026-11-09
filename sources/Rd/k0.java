package Rd;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.wang.avi.AVLoadingIndicatorView;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8368a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f8369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f8370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IconicsImageView f8371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f8372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f8374g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f8375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f8376j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f8377o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f8378p;
    public final View t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f8379v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f8380w;

    public k0(LinearLayout linearLayout, ImageView imageView, TextView textView, EditText editText, IconicsImageView iconicsImageView, ImageView imageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ModelErrorDivider modelErrorDivider, RelativeLayout relativeLayout, TextView textView2, TextView textView3) {
        this.f8369b = linearLayout;
        this.f8374g = imageView;
        this.f8370c = textView;
        this.f8375i = editText;
        this.f8371d = iconicsImageView;
        this.f8376j = imageView2;
        this.f8377o = linearLayout2;
        this.f8378p = linearLayout3;
        this.t = linearLayout4;
        this.f8379v = modelErrorDivider;
        this.f8380w = relativeLayout;
        this.f8372e = textView2;
        this.f8373f = textView3;
    }

    public static k0 a(View view) {
        int i7 = Pd.c.btnClose;
        IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, view);
        if (iconicsImageView != null) {
            i7 = Pd.c.btnTurnOn;
            PpButton ppButton = (PpButton) p059e1.a.m(i7, view);
            if (ppButton != null) {
                i7 = Pd.c.buttonContainer;
                if (((LinearLayout) p059e1.a.m(i7, view)) != null) {
                    i7 = Pd.c.cardPlan;
                    if (((LinearLayout) p059e1.a.m(i7, view)) != null) {
                        i7 = Pd.c.cbAgreement;
                        IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) p059e1.a.m(i7, view);
                        if (iconicsCheckBox != null) {
                            i7 = Pd.c.confirmationContainer;
                            if (((LinearLayout) p059e1.a.m(i7, view)) != null) {
                                i7 = Pd.c.llFirstTopupRow;
                                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, view);
                                if (linearLayout != null) {
                                    i7 = Pd.c.tvAgreement;
                                    TextView textView = (TextView) p059e1.a.m(i7, view);
                                    if (textView != null) {
                                        i7 = Pd.c.tvDontRemind;
                                        TextView textView2 = (TextView) p059e1.a.m(i7, view);
                                        if (textView2 != null) {
                                            i7 = Pd.c.tvFirstTopupDiscount;
                                            TextView textView3 = (TextView) p059e1.a.m(i7, view);
                                            if (textView3 != null) {
                                                i7 = Pd.c.tvFirstTopupLabel;
                                                TextView textView4 = (TextView) p059e1.a.m(i7, view);
                                                if (textView4 != null) {
                                                    i7 = Pd.c.tvFirstTopupOriginal;
                                                    TextView textView5 = (TextView) p059e1.a.m(i7, view);
                                                    if (textView5 != null) {
                                                        i7 = Pd.c.tvPlanAmount;
                                                        TextView textView6 = (TextView) p059e1.a.m(i7, view);
                                                        if (textView6 != null) {
                                                            i7 = Pd.c.tvPlanLabel;
                                                            TextView textView7 = (TextView) p059e1.a.m(i7, view);
                                                            if (textView7 != null) {
                                                                i7 = Pd.c.tvTitle;
                                                                TextView textView8 = (TextView) p059e1.a.m(i7, view);
                                                                if (textView8 != null) {
                                                                    return new k0((ConstraintLayout) view, iconicsImageView, ppButton, iconicsCheckBox, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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

    public static k0 b(View view) {
        int i7 = p159kd.e.account_bank_icon;
        ImageView imageView = (ImageView) p059e1.a.m(i7, view);
        if (imageView != null) {
            i7 = p159kd.e.account_select_bank;
            TextView textView = (TextView) p059e1.a.m(i7, view);
            if (textView != null) {
                i7 = p159kd.e.etPhoneAccount;
                EditText editText = (EditText) p059e1.a.m(i7, view);
                if (editText != null) {
                    i7 = p159kd.e.iivContacts;
                    IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, view);
                    if (iconicsImageView != null) {
                        i7 = p159kd.e.indicatorView;
                        if (((AVLoadingIndicatorView) p059e1.a.m(i7, view)) != null) {
                            i7 = p159kd.e.iv_query_status;
                            ImageView imageView2 = (ImageView) p059e1.a.m(i7, view);
                            if (imageView2 != null) {
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
                                                i7 = p159kd.e.rlSelectBank;
                                                RelativeLayout relativeLayout = (RelativeLayout) p059e1.a.m(i7, view);
                                                if (relativeLayout != null) {
                                                    i7 = p159kd.e.tv_loading_text;
                                                    TextView textView2 = (TextView) p059e1.a.m(i7, view);
                                                    if (textView2 != null) {
                                                        i7 = p159kd.e.tv_recipient_name;
                                                        TextView textView3 = (TextView) p059e1.a.m(i7, view);
                                                        if (textView3 != null) {
                                                            return new k0((LinearLayout) view, imageView, textView, editText, iconicsImageView, imageView2, linearLayout, linearLayout2, linearLayout3, modelErrorDivider, relativeLayout, textView2, textView3);
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
        switch (this.f8368a) {
            case 0:
                return (ConstraintLayout) this.f8374g;
            default:
                return this.f8369b;
        }
    }

    public k0(ConstraintLayout constraintLayout, IconicsImageView iconicsImageView, PpButton ppButton, IconicsCheckBox iconicsCheckBox, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f8374g = constraintLayout;
        this.f8371d = iconicsImageView;
        this.f8375i = ppButton;
        this.f8376j = iconicsCheckBox;
        this.f8369b = linearLayout;
        this.f8370c = textView;
        this.f8372e = textView2;
        this.f8373f = textView3;
        this.f8377o = textView4;
        this.f8378p = textView5;
        this.t = textView6;
        this.f8379v = textView7;
        this.f8380w = textView8;
    }
}
