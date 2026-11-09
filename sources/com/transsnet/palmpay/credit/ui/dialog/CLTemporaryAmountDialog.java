package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0013\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u001e¨\u0006\""}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLTemporaryAmountDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "", "tempAmount", "", "tempDays", "fillData", "(Ljava/lang/Long;Ljava/lang/Integer;)V", "Landroid/widget/TextView;", "confirm$delegate", "Lkotlin/Lazy;", "getConfirm", "()Landroid/widget/TextView;", "confirm", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "amount", "Landroid/widget/TextView;", "getAmount", "setAmount", "(Landroid/widget/TextView;)V", "day", "getDay", "setDay", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLTemporaryAmountDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private TextView amount;

    /* JADX INFO: renamed from: confirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy confirm;

    @Nullable
    private TextView day;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @JvmOverloads
    public CLTemporaryAmountDialog(@Nullable Context context) {
        super(context, Ya.f.cs_cl_temporary_amount_dialog_layout);
        final int i7 = 0;
        this.confirm = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTemporaryAmountDialog f30084b;

            {
                this.f30084b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CLTemporaryAmountDialog.confirm_delegate$lambda$0(this.f30084b);
                    default:
                        return CLTemporaryAmountDialog.ivClose_delegate$lambda$1(this.f30084b);
                }
            }
        });
        final int i10 = 1;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTemporaryAmountDialog f30084b;

            {
                this.f30084b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLTemporaryAmountDialog.confirm_delegate$lambda$0(this.f30084b);
                    default:
                        return CLTemporaryAmountDialog.ivClose_delegate$lambda$1(this.f30084b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView confirm_delegate$lambda$0(CLTemporaryAmountDialog cLTemporaryAmountDialog) {
        return (TextView) cLTemporaryAmountDialog.findViewById(Ya.e.confirm);
    }

    private final TextView getConfirm() {
        return (TextView) this.confirm.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(CLTemporaryAmountDialog cLTemporaryAmountDialog, View view) {
        int id2 = view.getId();
        if (id2 == Ya.e.ivClose || id2 == Ya.e.confirm) {
            cLTemporaryAmountDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$1(CLTemporaryAmountDialog cLTemporaryAmountDialog) {
        return (ImageView) cLTemporaryAmountDialog.findViewById(Ya.e.ivClose);
    }

    public final void fillData(@Nullable Long tempAmount, @Nullable Integer tempDays) {
        Object obj;
        TextView textView = this.amount;
        if (textView != null) {
            String strF = Pa.r0.F(tempAmount != null ? tempAmount.longValue() : 0L);
            Intrinsics.checkNotNullExpressionValue(strF, "getAmountThousandNoPointWithCurrency(...)");
            textView.setText(p220oa.h.B(strF, null, null, null, null, null, null, 927));
        }
        TextView textView2 = this.day;
        if (textView2 != null) {
            Context context = getContext();
            int i7 = Ya.g.cs_limited_time_s_days;
            if (tempDays == null) {
                obj = tempDays;
                obj = "";
            }
            obj = tempDays;
            textView2.setText(context.getString(i7, obj));
        }
    }

    @Nullable
    public final TextView getAmount() {
        return this.amount;
    }

    @Nullable
    public final TextView getDay() {
        return this.day;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(17);
        window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth() - SizeUtils.dp2px(32.0f);
        attributes.height = -2;
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        this.amount = (TextView) findViewById(Ya.e.temp_amount);
        this.day = (TextView) findViewById(Ya.e.temp_days);
        p220oa.h.q(new ViewOnClickListenerC1533v(this, 4), getIvClose(), getConfirm());
    }

    public final void setAmount(@Nullable TextView textView) {
        this.amount = textView;
    }

    public final void setDay(@Nullable TextView textView) {
        this.day = textView;
    }
}
