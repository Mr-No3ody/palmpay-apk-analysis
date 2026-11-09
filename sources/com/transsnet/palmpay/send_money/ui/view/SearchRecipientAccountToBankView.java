package com.transsnet.palmpay.send_money.ui.view;

import Bc.j;
import C0.G;
import Ce.O;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
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
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import androidx.transition.X;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.model.BaseFrameLayout;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p173ld.w;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/SearchRecipientAccountToBankView;", "Lcom/transsnet/palmpay/custom_view/model/BaseFrameLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getBankAccount", "()Ljava/lang/String;", "formatWithAccount", "", "setAccount", "(Ljava/lang/String;)V", "", "Lcom/transsnet/palmpay/core/bean/BankInfo;", "bankInfos", "setMatchBankList", "(Ljava/util/List;)V", "Lcom/transsnet/palmpay/send_money/ui/view/SearchRecipientAccountToBankView$OnSearchRecipientAccountToBankListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/transsnet/palmpay/send_money/ui/view/SearchRecipientAccountToBankView$OnSearchRecipientAccountToBankListener;)V", "Lld/w;", "d", "Lkotlin/Lazy;", "getAdapter", "()Lld/w;", "adapter", "OnSearchRecipientAccountToBankListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SearchRecipientAccountToBankView extends BaseFrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f33834f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f33835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnSearchRecipientAccountToBankListener f33837e;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/SearchRecipientAccountToBankView$OnSearchRecipientAccountToBankListener;", "", "onContactSelectClick", "", "view", "Landroid/view/View;", "onBankSelectClick", "afterAccountEdit", "account", "", "onChooseBankClick", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/core/bean/BankInfo;", "onCleanAccountInfo", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnSearchRecipientAccountToBankListener {
        void afterAccountEdit(@Nullable String account);

        void onBankSelectClick(@Nullable View view);

        void onChooseBankClick(@Nullable BankInfo data);

        void onCleanAccountInfo();

        void onContactSelectClick(@Nullable View view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchRecipientAccountToBankView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(SearchRecipientAccountToBankView searchRecipientAccountToBankView, M1.j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        searchRecipientAccountToBankView.c((BankInfo) searchRecipientAccountToBankView.getAdapter().getItem(i7));
    }

    private final w getAdapter() {
        return (w) this.f33836d.getValue();
    }

    public final void b() {
        j jVar = this.f33835c;
        try {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.f(new Fade(1));
            transitionSet.f(new ChangeBounds());
            if (jVar != null) {
                X.a((LinearLayout) jVar.f742j, transitionSet);
            }
        } catch (Exception unused) {
        }
        if (jVar != null) {
            h.c((LinearLayout) jVar.f740g);
        }
        if (jVar != null) {
            h.c((LinearLayout) jVar.f741i);
        }
        if (jVar != null) {
            h.c((RecyclerView) jVar.f744p);
        }
    }

    public final void c(BankInfo bankInfo) {
        if (bankInfo == null) {
            return;
        }
        j jVar = this.f33835c;
        if (jVar != null) {
            ((TextView) jVar.f732B).setVisibility(8);
        }
        if (jVar != null) {
            ((ImageView) jVar.f737d).setVisibility(0);
        }
        if (jVar != null) {
            ((TextView) jVar.f733C).setVisibility(0);
        }
        if (jVar != null) {
            ((TextView) jVar.f733C).setText(bankInfo.bankName);
        }
        getContext();
        p002a.a.r(bankInfo.bankUrl, jVar != null ? (ImageView) jVar.f737d : null);
        OnSearchRecipientAccountToBankListener onSearchRecipientAccountToBankListener = this.f33837e;
        if (onSearchRecipientAccountToBankListener != null) {
            onSearchRecipientAccountToBankListener.onChooseBankClick(bankInfo);
        }
    }

    public final void d(String str, String str2) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        ModelErrorDivider modelErrorDivider;
        ModelErrorDivider modelErrorDivider2;
        b();
        j jVar = this.f33835c;
        if (jVar != null && (modelErrorDivider2 = (ModelErrorDivider) jVar.f743o) != null) {
            modelErrorDivider2.setErrorMessage("");
        }
        if (jVar != null && (modelErrorDivider = (ModelErrorDivider) jVar.t) != null) {
            modelErrorDivider.setErrorMessage("");
        }
        if (TextUtils.isEmpty(str)) {
            if (jVar != null && (linearLayout = (LinearLayout) jVar.f741i) != null) {
                h.C(linearLayout);
            }
            e(str2, true);
            return;
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (jVar != null && (linearLayout2 = (LinearLayout) jVar.f741i) != null) {
            h.C(linearLayout2);
        }
        e(str, false);
    }

    public final void e(String str, boolean z3) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        j jVar = this.f33835c;
        if (zIsEmpty) {
            if (jVar != null) {
                h.c((LinearLayout) jVar.f741i);
                return;
            }
            return;
        }
        if (jVar != null) {
            h.C((LinearLayout) jVar.f741i);
        }
        if (jVar != null) {
            ((TextView) jVar.f731A).setText(str);
        }
        if (!z3) {
            int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorSuccess, getContext());
            if (jVar != null) {
                ((LinearLayout) jVar.f741i).setBackgroundTintList(ColorStateList.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorSuccessBackground, getContext())));
            }
            if (jVar != null) {
                IconicsImageView iconicsImageView = (IconicsImageView) jVar.f739f;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                IconicsDrawable iconicsDrawable = new IconicsDrawable(context, S6.a.pay_SelectedFill);
                iconicsDrawable.a(new O(iColorInt, 6));
                iconicsImageView.setIcon(iconicsDrawable);
            }
            if (jVar != null) {
                ((TextView) jVar.f731A).setTextColor(iColorInt);
            }
            if (jVar != null) {
                ((TextView) jVar.f731A).setTypeface(Typeface.create("sans-serif-medium", 0));
                return;
            }
            return;
        }
        int iColorInt2 = CommonViewExtKt.colorInt(L6.b.ppColorError, getContext());
        if (jVar != null) {
            ((LinearLayout) jVar.f741i).setBackgroundTintList(ColorStateList.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorErrorBackground, getContext())));
        }
        if (jVar != null) {
            IconicsImageView iconicsImageView2 = (IconicsImageView) jVar.f739f;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            IconicsDrawable iconicsDrawable2 = new IconicsDrawable(context2, S6.a.pay_WarningFill);
            iconicsDrawable2.a(new O(iColorInt2, 5));
            iconicsImageView2.setIcon(iconicsDrawable2);
        }
        if (jVar != null) {
            ((TextView) jVar.f731A).setTextColor(iColorInt2);
        }
        if (jVar != null) {
            ((TextView) jVar.f731A).setTypeface(Typeface.create("sans-serif", 0));
        }
        LinearLayout linearLayout = jVar != null ? (LinearLayout) jVar.f741i : null;
        if (linearLayout != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, View.TRANSLATION_X.getName(), 0.0f, 8.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(4.0f));
            objectAnimatorOfFloat.start();
        }
    }

    public final void f(String str) {
        RecyclerView recyclerView;
        LinearLayout linearLayout;
        TextView textView;
        LinearLayout linearLayout2;
        j jVar = this.f33835c;
        if (jVar != null && (linearLayout2 = (LinearLayout) jVar.f740g) != null) {
            h.C(linearLayout2);
        }
        if (jVar != null && (textView = (TextView) jVar.f746w) != null) {
            textView.setText(str);
        }
        if (jVar != null && (linearLayout = (LinearLayout) jVar.f741i) != null) {
            h.c(linearLayout);
        }
        if (jVar == null || (recyclerView = (RecyclerView) jVar.f744p) == null) {
            return;
        }
        h.c(recyclerView);
    }

    @NotNull
    public final String getBankAccount() {
        j jVar = this.f33835c;
        return y.k(String.valueOf(jVar != null ? ((EditText) jVar.f735b).getText() : null), " ", "");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OnSearchRecipientAccountToBankListener onSearchRecipientAccountToBankListener;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = e.iivContacts;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            OnSearchRecipientAccountToBankListener onSearchRecipientAccountToBankListener2 = this.f33837e;
            if (onSearchRecipientAccountToBankListener2 != null) {
                onSearchRecipientAccountToBankListener2.onContactSelectClick(view);
                return;
            }
            return;
        }
        int i10 = e.rlSelectBank;
        if (numValueOf == null || numValueOf.intValue() != i10 || (onSearchRecipientAccountToBankListener = this.f33837e) == null) {
            return;
        }
        onSearchRecipientAccountToBankListener.onBankSelectClick(view);
    }

    public final void setAccount(@Nullable String formatWithAccount) {
        EditText editText;
        j jVar = this.f33835c;
        if (jVar == null || (editText = (EditText) jVar.f735b) == null) {
            return;
        }
        editText.setText(formatWithAccount);
    }

    public final void setListener(@NotNull OnSearchRecipientAccountToBankListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f33837e = listener;
    }

    public final void setMatchBankList(@Nullable List<? extends BankInfo> bankInfos) {
        RecyclerView recyclerView;
        if (bankInfos != null) {
            j jVar = this.f33835c;
            if (jVar != null && (recyclerView = (RecyclerView) jVar.f744p) != null) {
                h.C(recyclerView);
            }
            getAdapter().setList(bankInfos);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchRecipientAccountToBankView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SearchRecipientAccountToBankView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchRecipientAccountToBankView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33836d = C2131j.b(new Ae.j(this, 19));
        View viewInflate = LayoutInflater.from(context).inflate(f.sm_layout_seach_recipient_account_to_bank, (ViewGroup) this, false);
        addView(viewInflate);
        j jVarA = j.a(viewInflate);
        this.f33835c = jVarA;
        ((TextView) jVarA.f732B).setHint(G.i("").append(CommonViewExtKt.string(p159kd.h.sm_select_your_bank, context)).setFontFamily("sans-serif").create());
        EditText editText = (EditText) jVarA.f735b;
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(12)});
        editText.setHint(G.i("").append(CommonViewExtKt.string(p159kd.h.sm_enter_10_digit_account_number, context)).setFontFamily("sans-serif").create());
        editText.setInputType(2);
        h.r(editText, new a(this), null);
        RecyclerView recyclerView = (RecyclerView) jVarA.f744p;
        recyclerView.setAdapter(getAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        getAdapter().setOnItemClickListener(new Dg.a(this, 15));
        ((RelativeLayout) jVarA.f745v).setOnClickListener(this);
        ((IconicsImageView) jVarA.f738e).setOnClickListener(this);
    }
}
