package com.transsnet.palmpay.send_money.ui.view;

import C0.G;
import Rd.k0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.CycleInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import androidx.transition.X;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.custom_view.model.BaseFrameLayout;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.d;
import p159kd.e;
import p159kd.f;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/SearchRecipientAccountToPalmPayView;", "Lcom/transsnet/palmpay/custom_view/model/BaseFrameLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getPhoneAccount", "()Ljava/lang/String;", "formatWithAccount", "", "setAccount", "(Ljava/lang/String;)V", "Lcom/transsnet/palmpay/send_money/ui/view/SearchRecipientAccountToPalmPayView$OnSearchRecipientAccountToPalmPayListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/transsnet/palmpay/send_money/ui/view/SearchRecipientAccountToPalmPayView$OnSearchRecipientAccountToPalmPayListener;)V", "OnSearchRecipientAccountToPalmPayListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SearchRecipientAccountToPalmPayView extends BaseFrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f33838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OnSearchRecipientAccountToPalmPayListener f33839d;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/SearchRecipientAccountToPalmPayView$OnSearchRecipientAccountToPalmPayListener;", "", "onContactSelectClick", "", "view", "Landroid/view/View;", "afterAccountEdit", "account", "", "onCleanAccountInfo", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnSearchRecipientAccountToPalmPayListener {
        void afterAccountEdit(@Nullable String account);

        void onCleanAccountInfo();

        void onContactSelectClick(@Nullable View view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchRecipientAccountToPalmPayView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        k0 k0Var = this.f33838c;
        try {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.f(new Fade(1));
            transitionSet.f(new ChangeBounds());
            if (k0Var != null) {
                X.a((LinearLayout) k0Var.t, transitionSet);
            }
        } catch (Exception unused) {
        }
        if (k0Var != null) {
            h.c((LinearLayout) k0Var.f8377o);
        }
        if (k0Var != null) {
            h.c((LinearLayout) k0Var.f8378p);
        }
    }

    public final void b(String errorMsg) {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        a();
        k0 k0Var = this.f33838c;
        if (k0Var != null) {
            h.C((LinearLayout) k0Var.f8378p);
        }
        d(errorMsg, true);
    }

    public final void c(String str, String str2) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        ModelErrorDivider modelErrorDivider;
        a();
        k0 k0Var = this.f33838c;
        if (k0Var != null && (modelErrorDivider = (ModelErrorDivider) k0Var.f8379v) != null) {
            modelErrorDivider.setErrorMessage("");
        }
        if (TextUtils.isEmpty(str)) {
            if (k0Var != null && (linearLayout = (LinearLayout) k0Var.f8378p) != null) {
                h.C(linearLayout);
            }
            d(str2, true);
            return;
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (k0Var != null && (linearLayout2 = (LinearLayout) k0Var.f8378p) != null) {
            h.C(linearLayout2);
        }
        d(str, false);
    }

    public final void d(String str, boolean z3) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        k0 k0Var = this.f33838c;
        if (zIsEmpty) {
            if (k0Var != null) {
                h.c((LinearLayout) k0Var.f8378p);
                return;
            }
            return;
        }
        if (k0Var != null) {
            h.C((LinearLayout) k0Var.f8378p);
        }
        if (k0Var != null) {
            k0Var.f8373f.setText(str);
        }
        if (!z3) {
            if (k0Var != null) {
                ((ImageView) k0Var.f8376j).setImageResource(d.sm_icon_query_recipient_bank_succ);
            }
            if (k0Var != null) {
                k0Var.f8373f.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext()));
            }
            if (k0Var != null) {
                k0Var.f8373f.setTypeface(Typeface.create("sans-serif-medium", 0));
                return;
            }
            return;
        }
        if (k0Var != null) {
            ((ImageView) k0Var.f8376j).setImageResource(d.sm_icon_query_recipient_bank_fail);
        }
        if (k0Var != null) {
            k0Var.f8373f.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorError, getContext()));
        }
        if (k0Var != null) {
            k0Var.f8373f.setTypeface(Typeface.create("sans-serif", 0));
        }
        LinearLayout linearLayout = k0Var != null ? (LinearLayout) k0Var.f8378p : null;
        if (linearLayout != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, View.TRANSLATION_X.getName(), 0.0f, 8.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(4.0f));
            objectAnimatorOfFloat.start();
        }
    }

    @NotNull
    public final String getPhoneAccount() {
        k0 k0Var = this.f33838c;
        return y.k(String.valueOf(k0Var != null ? ((EditText) k0Var.f8375i).getText() : null), " ", "");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OnSearchRecipientAccountToPalmPayListener onSearchRecipientAccountToPalmPayListener;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = e.iivContacts;
        if (numValueOf == null || numValueOf.intValue() != i7 || (onSearchRecipientAccountToPalmPayListener = this.f33839d) == null) {
            return;
        }
        onSearchRecipientAccountToPalmPayListener.onContactSelectClick(view);
    }

    public final void setAccount(@Nullable String formatWithAccount) {
        EditText editText;
        k0 k0Var = this.f33838c;
        if (k0Var == null || (editText = (EditText) k0Var.f8375i) == null) {
            return;
        }
        editText.setText(formatWithAccount);
    }

    public final void setListener(@NotNull OnSearchRecipientAccountToPalmPayListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f33839d = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchRecipientAccountToPalmPayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SearchRecipientAccountToPalmPayView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchRecipientAccountToPalmPayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(f.sm_layout_seach_recipient_account_to_palmpay, (ViewGroup) this, false);
        addView(viewInflate);
        k0 k0VarB = k0.b(viewInflate);
        this.f33838c = k0VarB;
        EditText editText = (EditText) k0VarB.f8375i;
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(12)});
        editText.setHint(G.i("").append(CommonViewExtKt.string(p159kd.h.sm_enter_10_digit_account_number, context)).setFontFamily("sans-serif").create());
        editText.setInputType(2);
        h.r(editText, new b(this), null);
        ((RelativeLayout) k0VarB.f8380w).setOnClickListener(this);
        k0VarB.f8371d.setOnClickListener(this);
    }
}
