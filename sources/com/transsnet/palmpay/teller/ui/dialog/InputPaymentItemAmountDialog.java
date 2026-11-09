package com.transsnet.palmpay.teller.ui.dialog;

import Pa.r0;
import Pd.d;
import Rd.j0;
import V9.q;
import Wd.G;
import X6.c;
import Yd.l;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.KeyboardUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p059e1.a;
import p220oa.h;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\bJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0017¢\u0006\u0004\b)\u0010'J0\u0010.\u001a\u00020\u00002!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060*¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\bR\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R1\u00104\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010%\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00106R\u0018\u0010(\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00106R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00107R\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00108R\u0016\u0010\u001c\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0010098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/InputPaymentItemAmountDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "confirmAmount", "()V", "", FirebaseAnalytics.Param.INDEX, "", "amount", "Landroid/view/View;", "createItemView", "(IJ)Landroid/view/View;", "Landroid/widget/TextView;", "selectedView", "setSelectedState", "(Landroid/widget/TextView;)V", "", "checkAmount", "(J)Z", "", "error", "showAmountError", "(Ljava/lang/String;)V", "initViews", "maxAmount", "setMaxAmount", "(J)Lcom/transsnet/palmpay/teller/ui/dialog/InputPaymentItemAmountDialog;", "minAmount", "setMinAmount", "", "list", "setItemAmountList", "([J)Lcom/transsnet/palmpay/teller/ui/dialog/InputPaymentItemAmountDialog;", "cashback", "setCashback", "(Ljava/lang/String;)Lcom/transsnet/palmpay/teller/ui/dialog/InputPaymentItemAmountDialog;", "itemName", "setPaymentItemName", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "function", "setCallback", "(Lkotlin/jvm/functions/Function1;)Lcom/transsnet/palmpay/teller/ui/dialog/InputPaymentItemAmountDialog;", "show", "LRd/j0;", "binding", "LRd/j0;", "callback", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/String;", "[J", "J", "", "tagViewList", "Ljava/util/List;", "Landroid/view/View$OnClickListener;", "mAmountItemClickListener$delegate", "Lkotlin/Lazy;", "getMAmountItemClickListener", "()Landroid/view/View$OnClickListener;", "mAmountItemClickListener", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInputPaymentItemAmountDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputPaymentItemAmountDialog.kt\ncom/transsnet/palmpay/teller/ui/dialog/InputPaymentItemAmountDialog\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,189:1\n13577#2,3:190\n1869#3,2:193\n*S KotlinDebug\n*F\n+ 1 InputPaymentItemAmountDialog.kt\ncom/transsnet/palmpay/teller/ui/dialog/InputPaymentItemAmountDialog\n*L\n121#1:190,3\n149#1:193,2\n*E\n"})
public final class InputPaymentItemAmountDialog extends b {

    @Nullable
    private j0 binding;

    @NotNull
    private Function1<? super Long, Unit> callback;

    @Nullable
    private String cashback;

    @Nullable
    private String itemName;

    @Nullable
    private long[] list;

    /* JADX INFO: renamed from: mAmountItemClickListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAmountItemClickListener;
    private long maxAmount;
    private long minAmount;

    @NotNull
    private final List<TextView> tagViewList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputPaymentItemAmountDialog(@NotNull Context context) {
        super(context, d.qt_input_payment_item_amount_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        this.callback = new G(12);
        this.tagViewList = new ArrayList();
        this.mAmountItemClickListener = C2131j.b(new c(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit callback$lambda$0(long j6) {
        return Unit.f38893a;
    }

    private final boolean checkAmount(long amount) {
        if (amount < this.minAmount) {
            String string = getContext().getString(k.core_msg_amount_above_desc, r0.B(this.minAmount, true));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            showAmountError(string);
            return false;
        }
        if (amount <= this.maxAmount) {
            showAmountError("");
            return true;
        }
        String string2 = getContext().getString(k.core_msg_amount_below_desc, r0.B(this.maxAmount, true));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        showAmountError(string2);
        return false;
    }

    private final void confirmAmount() {
        PpAmountEditText ppAmountEditText;
        j0 j0Var = this.binding;
        long longAmount = (j0Var == null || (ppAmountEditText = j0Var.f8360c) == null) ? 0L : ppAmountEditText.getLongAmount();
        if (checkAmount(longAmount)) {
            this.callback.invoke(Long.valueOf(longAmount));
            dismiss();
        }
    }

    private final View createItemView(int index, long amount) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(d.qt_input_payment_amount_item, (ViewGroup) null);
        Intrinsics.f(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewInflate;
        textView.setTag(Long.valueOf(amount));
        textView.setText(r0.E(amount));
        textView.setOnClickListener(getMAmountItemClickListener());
        this.tagViewList.add((TextView) viewInflate);
        return viewInflate;
    }

    private final View.OnClickListener getMAmountItemClickListener() {
        return (View.OnClickListener) this.mAmountItemClickListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4(InputPaymentItemAmountDialog inputPaymentItemAmountDialog, View view) {
        j0 j0Var = inputPaymentItemAmountDialog.binding;
        KeyboardUtils.hideSoftInput(j0Var != null ? j0Var.f8360c : null);
        inputPaymentItemAmountDialog.confirmAmount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$5(InputPaymentItemAmountDialog inputPaymentItemAmountDialog, String str) {
        Button button;
        Intrinsics.e(str);
        Long lU = StringsKt.U(str);
        long jLongValue = lU != null ? lU.longValue() : 0L;
        j0 j0Var = inputPaymentItemAmountDialog.binding;
        if (j0Var != null && (button = j0Var.f8359b) != null) {
            button.setEnabled(jLongValue > 0);
        }
        inputPaymentItemAmountDialog.showAmountError("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View.OnClickListener mAmountItemClickListener_delegate$lambda$2(InputPaymentItemAmountDialog inputPaymentItemAmountDialog) {
        return new l(inputPaymentItemAmountDialog, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mAmountItemClickListener_delegate$lambda$2$lambda$1(InputPaymentItemAmountDialog inputPaymentItemAmountDialog, View view) {
        PpAmountEditText ppAmountEditText;
        Object tag = view.getTag();
        Intrinsics.f(tag, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) tag).longValue();
        j0 j0Var = inputPaymentItemAmountDialog.binding;
        if (j0Var != null && (ppAmountEditText = j0Var.f8360c) != null) {
            ppAmountEditText.setAmount(r0.m0(jLongValue));
        }
        if (view instanceof TextView) {
            inputPaymentItemAmountDialog.setSelectedState((TextView) view);
        }
    }

    private final void setSelectedState(TextView selectedView) {
        List<TextView> list = this.tagViewList;
        if (list != null) {
            for (TextView textView : list) {
                textView.setSelected(Intrinsics.c(textView, selectedView));
            }
        }
    }

    private final void showAmountError(String error) {
        j0 j0Var;
        PpAmountEditText ppAmountEditText;
        if (TextUtils.isEmpty(error) || (j0Var = this.binding) == null || (ppAmountEditText = j0Var.f8360c) == null) {
            return;
        }
        KeyboardUtils.hideSoftInput(ppAmountEditText);
        ppAmountEditText.setError(error);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewFindViewById = findViewById(Pd.c.viewRoot);
        int i7 = Pd.c.bt_confirm;
        Button button = (Button) a.m(i7, viewFindViewById);
        if (button != null) {
            i7 = Pd.c.et_amount_input;
            PpAmountEditText ppAmountEditText = (PpAmountEditText) a.m(i7, viewFindViewById);
            if (ppAmountEditText != null) {
                i7 = Pd.c.flexbox_payment_amount;
                FlexboxLayout flexboxLayout = (FlexboxLayout) a.m(i7, viewFindViewById);
                if (flexboxLayout != null) {
                    i7 = Pd.c.iv_close;
                    IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
                    if (iconicsImageView != null) {
                        i7 = Pd.c.tv_cashback;
                        TextView textView = (TextView) a.m(i7, viewFindViewById);
                        if (textView != null) {
                            i7 = Pd.c.tv_item_name;
                            TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                            if (textView2 != null) {
                                i7 = Pd.c.tv_tips_enter_amount;
                                TextView textView3 = (TextView) a.m(i7, viewFindViewById);
                                if (textView3 != null) {
                                    this.binding = new j0((ConstraintLayout) viewFindViewById, button, ppAmountEditText, flexboxLayout, iconicsImageView, textView, textView2, textView3);
                                    setCancelable(false);
                                    setCanceledOnTouchOutside(false);
                                    j0 j0Var = this.binding;
                                    if (j0Var != null) {
                                        j0Var.f8360c.setCurrencySymbol(BaseApplication.getCurrencySymbol());
                                    }
                                    j0 j0Var2 = this.binding;
                                    if (j0Var2 != null) {
                                        j0Var2.f8362e.setOnClickListener(new l(this, 0));
                                    }
                                    j0 j0Var3 = this.binding;
                                    if (j0Var3 != null) {
                                        j0Var3.f8359b.setOnClickListener(new l(this, 1));
                                    }
                                    j0 j0Var4 = this.binding;
                                    if (j0Var4 != null) {
                                        j0Var4.f8360c.setTextInputListener(new q(this, 21));
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @NotNull
    public final InputPaymentItemAmountDialog setCallback(@NotNull Function1<? super Long, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.callback = function;
        return this;
    }

    @NotNull
    public final InputPaymentItemAmountDialog setCashback(@NotNull String cashback) {
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        this.cashback = cashback;
        return this;
    }

    @NotNull
    public final InputPaymentItemAmountDialog setItemAmountList(@Nullable long[] list) {
        this.list = list;
        return this;
    }

    @NotNull
    public final InputPaymentItemAmountDialog setMaxAmount(long maxAmount) {
        this.maxAmount = maxAmount;
        return this;
    }

    @NotNull
    public final InputPaymentItemAmountDialog setMinAmount(long minAmount) {
        this.minAmount = minAmount;
        return this;
    }

    @NotNull
    public final InputPaymentItemAmountDialog setPaymentItemName(@NotNull String itemName) {
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        this.itemName = itemName;
        return this;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        TextView textView;
        FlexboxLayout flexboxLayout;
        FlexboxLayout flexboxLayout2;
        PpAmountEditText ppAmountEditText;
        TextView textView2;
        TextView textView3;
        j0 j0Var;
        TextView textView4;
        if (isShowing()) {
            return;
        }
        super.show();
        if (!TextUtils.isEmpty(this.itemName) && (j0Var = this.binding) != null && (textView4 = j0Var.f8364g) != null) {
            textView4.setText(this.itemName);
        }
        if (TextUtils.isEmpty(this.cashback)) {
            j0 j0Var2 = this.binding;
            if (j0Var2 != null && (textView = j0Var2.f8363f) != null) {
                h.s(textView, false);
            }
        } else {
            j0 j0Var3 = this.binding;
            if (j0Var3 != null && (textView3 = j0Var3.f8363f) != null) {
                textView3.setText(this.cashback);
            }
            j0 j0Var4 = this.binding;
            if (j0Var4 != null && (textView2 = j0Var4.f8363f) != null) {
                h.s(textView2, true);
            }
        }
        j0 j0Var5 = this.binding;
        if (j0Var5 != null && (ppAmountEditText = j0Var5.f8360c) != null) {
            ppAmountEditText.setAmount("");
        }
        this.tagViewList.clear();
        j0 j0Var6 = this.binding;
        if (j0Var6 != null && (flexboxLayout2 = j0Var6.f8361d) != null) {
            flexboxLayout2.removeAllViews();
        }
        long[] jArr = this.list;
        if (jArr != null) {
            int length = jArr.length;
            int i7 = 0;
            int i10 = 0;
            while (i7 < length) {
                long j6 = jArr[i7];
                int i11 = i10 + 1;
                FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
                if (i10 == 0) {
                    layoutParams.setMargins(0, 0, 0, 0);
                } else {
                    layoutParams.setMargins(CommonViewExtKt.getDp(16), 0, 0, 0);
                }
                j0 j0Var7 = this.binding;
                if (j0Var7 != null && (flexboxLayout = j0Var7.f8361d) != null) {
                    flexboxLayout.addView(createItemView(i10, j6), layoutParams);
                }
                i7++;
                i10 = i11;
            }
        }
    }
}
