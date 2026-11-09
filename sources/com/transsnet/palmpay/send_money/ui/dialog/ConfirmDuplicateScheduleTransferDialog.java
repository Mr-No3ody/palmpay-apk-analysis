package com.transsnet.palmpay.send_money.ui.dialog;

import C0.G;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableOrderResp;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateScheduleTransferDialog;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00017B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\fR\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001b\u0010$\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001b\u0010'\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u001b\u0010*\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u001b\u0010-\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010\u001dR\u001b\u00100\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u001dR\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001b\u001a\u0004\b3\u00104R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00106¨\u00068"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateScheduleTransferDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "", "negative", "setNegativeText", "(Ljava/lang/CharSequence;)V", "positive", "setPositiveText", "Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateScheduleTransferDialog$OnConfirmDuplicateScheduleTransferListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnConfirmDuplicateScheduleTransferListener", "(Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateScheduleTransferDialog$OnConfirmDuplicateScheduleTransferListener;)Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateScheduleTransferDialog;", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableOrderResp;", "bookTransferDetail", "setData", "(Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferForBankUnstableOrderResp;)Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateScheduleTransferDialog;", ReactTextInputShadowNode.PROP_TEXT, "setConfirmText", "Landroid/widget/TextView;", "tv_cancel$delegate", "Lkotlin/Lazy;", "getTv_cancel", "()Landroid/widget/TextView;", "tv_cancel", "tv_confirm$delegate", "getTv_confirm", "tv_confirm", "tv_payment$delegate", "getTv_payment", "tv_payment", "tv_bank_account$delegate", "getTv_bank_account", "tv_bank_account", "tv_bank_name$delegate", "getTv_bank_name", "tv_bank_name", "tv_user_name$delegate", "getTv_user_name", "tv_user_name", "tv_amount$delegate", "getTv_amount", "tv_amount", "Lcom/mikepenz/iconics/view/IconicsImageView;", "iv_close$delegate", "getIv_close", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "iv_close", "Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateScheduleTransferDialog$OnConfirmDuplicateScheduleTransferListener;", "OnConfirmDuplicateScheduleTransferListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConfirmDuplicateScheduleTransferDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmDuplicateScheduleTransferDialog.kt\ncom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateScheduleTransferDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
public final class ConfirmDuplicateScheduleTransferDialog extends b {

    /* JADX INFO: renamed from: iv_close$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iv_close;

    @Nullable
    private OnConfirmDuplicateScheduleTransferListener listener;

    /* JADX INFO: renamed from: tv_amount$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_amount;

    /* JADX INFO: renamed from: tv_bank_account$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_bank_account;

    /* JADX INFO: renamed from: tv_bank_name$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_bank_name;

    /* JADX INFO: renamed from: tv_cancel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_cancel;

    /* JADX INFO: renamed from: tv_confirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_confirm;

    /* JADX INFO: renamed from: tv_payment$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_payment;

    /* JADX INFO: renamed from: tv_user_name$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_user_name;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateScheduleTransferDialog$OnConfirmDuplicateScheduleTransferListener;", "", "onPositiveClick", "", "view", "Landroid/view/View;", "onNegativeClick", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnConfirmDuplicateScheduleTransferListener {
        void onNegativeClick(@NotNull View view);

        void onPositiveClick(@NotNull View view);
    }

    public ConfirmDuplicateScheduleTransferDialog(@Nullable Context context) {
        super(context);
        final int i7 = 1;
        this.tv_cancel = C2131j.b(new Function0(this) { // from class: Ad.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateScheduleTransferDialog f245b;

            {
                this.f245b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return ConfirmDuplicateScheduleTransferDialog.iv_close_delegate$lambda$7(this.f245b);
                    case 1:
                        return ConfirmDuplicateScheduleTransferDialog.tv_cancel_delegate$lambda$0(this.f245b);
                    case 2:
                        return ConfirmDuplicateScheduleTransferDialog.tv_confirm_delegate$lambda$1(this.f245b);
                    case 3:
                        return ConfirmDuplicateScheduleTransferDialog.tv_payment_delegate$lambda$2(this.f245b);
                    case 4:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_account_delegate$lambda$3(this.f245b);
                    case 5:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_name_delegate$lambda$4(this.f245b);
                    case 6:
                        return ConfirmDuplicateScheduleTransferDialog.tv_user_name_delegate$lambda$5(this.f245b);
                    default:
                        return ConfirmDuplicateScheduleTransferDialog.tv_amount_delegate$lambda$6(this.f245b);
                }
            }
        });
        final int i10 = 2;
        this.tv_confirm = C2131j.b(new Function0(this) { // from class: Ad.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateScheduleTransferDialog f245b;

            {
                this.f245b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ConfirmDuplicateScheduleTransferDialog.iv_close_delegate$lambda$7(this.f245b);
                    case 1:
                        return ConfirmDuplicateScheduleTransferDialog.tv_cancel_delegate$lambda$0(this.f245b);
                    case 2:
                        return ConfirmDuplicateScheduleTransferDialog.tv_confirm_delegate$lambda$1(this.f245b);
                    case 3:
                        return ConfirmDuplicateScheduleTransferDialog.tv_payment_delegate$lambda$2(this.f245b);
                    case 4:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_account_delegate$lambda$3(this.f245b);
                    case 5:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_name_delegate$lambda$4(this.f245b);
                    case 6:
                        return ConfirmDuplicateScheduleTransferDialog.tv_user_name_delegate$lambda$5(this.f245b);
                    default:
                        return ConfirmDuplicateScheduleTransferDialog.tv_amount_delegate$lambda$6(this.f245b);
                }
            }
        });
        final int i11 = 3;
        this.tv_payment = C2131j.b(new Function0(this) { // from class: Ad.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateScheduleTransferDialog f245b;

            {
                this.f245b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ConfirmDuplicateScheduleTransferDialog.iv_close_delegate$lambda$7(this.f245b);
                    case 1:
                        return ConfirmDuplicateScheduleTransferDialog.tv_cancel_delegate$lambda$0(this.f245b);
                    case 2:
                        return ConfirmDuplicateScheduleTransferDialog.tv_confirm_delegate$lambda$1(this.f245b);
                    case 3:
                        return ConfirmDuplicateScheduleTransferDialog.tv_payment_delegate$lambda$2(this.f245b);
                    case 4:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_account_delegate$lambda$3(this.f245b);
                    case 5:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_name_delegate$lambda$4(this.f245b);
                    case 6:
                        return ConfirmDuplicateScheduleTransferDialog.tv_user_name_delegate$lambda$5(this.f245b);
                    default:
                        return ConfirmDuplicateScheduleTransferDialog.tv_amount_delegate$lambda$6(this.f245b);
                }
            }
        });
        final int i12 = 4;
        this.tv_bank_account = C2131j.b(new Function0(this) { // from class: Ad.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateScheduleTransferDialog f245b;

            {
                this.f245b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return ConfirmDuplicateScheduleTransferDialog.iv_close_delegate$lambda$7(this.f245b);
                    case 1:
                        return ConfirmDuplicateScheduleTransferDialog.tv_cancel_delegate$lambda$0(this.f245b);
                    case 2:
                        return ConfirmDuplicateScheduleTransferDialog.tv_confirm_delegate$lambda$1(this.f245b);
                    case 3:
                        return ConfirmDuplicateScheduleTransferDialog.tv_payment_delegate$lambda$2(this.f245b);
                    case 4:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_account_delegate$lambda$3(this.f245b);
                    case 5:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_name_delegate$lambda$4(this.f245b);
                    case 6:
                        return ConfirmDuplicateScheduleTransferDialog.tv_user_name_delegate$lambda$5(this.f245b);
                    default:
                        return ConfirmDuplicateScheduleTransferDialog.tv_amount_delegate$lambda$6(this.f245b);
                }
            }
        });
        final int i13 = 5;
        this.tv_bank_name = C2131j.b(new Function0(this) { // from class: Ad.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateScheduleTransferDialog f245b;

            {
                this.f245b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ConfirmDuplicateScheduleTransferDialog.iv_close_delegate$lambda$7(this.f245b);
                    case 1:
                        return ConfirmDuplicateScheduleTransferDialog.tv_cancel_delegate$lambda$0(this.f245b);
                    case 2:
                        return ConfirmDuplicateScheduleTransferDialog.tv_confirm_delegate$lambda$1(this.f245b);
                    case 3:
                        return ConfirmDuplicateScheduleTransferDialog.tv_payment_delegate$lambda$2(this.f245b);
                    case 4:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_account_delegate$lambda$3(this.f245b);
                    case 5:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_name_delegate$lambda$4(this.f245b);
                    case 6:
                        return ConfirmDuplicateScheduleTransferDialog.tv_user_name_delegate$lambda$5(this.f245b);
                    default:
                        return ConfirmDuplicateScheduleTransferDialog.tv_amount_delegate$lambda$6(this.f245b);
                }
            }
        });
        final int i14 = 6;
        this.tv_user_name = C2131j.b(new Function0(this) { // from class: Ad.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateScheduleTransferDialog f245b;

            {
                this.f245b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ConfirmDuplicateScheduleTransferDialog.iv_close_delegate$lambda$7(this.f245b);
                    case 1:
                        return ConfirmDuplicateScheduleTransferDialog.tv_cancel_delegate$lambda$0(this.f245b);
                    case 2:
                        return ConfirmDuplicateScheduleTransferDialog.tv_confirm_delegate$lambda$1(this.f245b);
                    case 3:
                        return ConfirmDuplicateScheduleTransferDialog.tv_payment_delegate$lambda$2(this.f245b);
                    case 4:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_account_delegate$lambda$3(this.f245b);
                    case 5:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_name_delegate$lambda$4(this.f245b);
                    case 6:
                        return ConfirmDuplicateScheduleTransferDialog.tv_user_name_delegate$lambda$5(this.f245b);
                    default:
                        return ConfirmDuplicateScheduleTransferDialog.tv_amount_delegate$lambda$6(this.f245b);
                }
            }
        });
        final int i15 = 7;
        this.tv_amount = C2131j.b(new Function0(this) { // from class: Ad.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateScheduleTransferDialog f245b;

            {
                this.f245b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return ConfirmDuplicateScheduleTransferDialog.iv_close_delegate$lambda$7(this.f245b);
                    case 1:
                        return ConfirmDuplicateScheduleTransferDialog.tv_cancel_delegate$lambda$0(this.f245b);
                    case 2:
                        return ConfirmDuplicateScheduleTransferDialog.tv_confirm_delegate$lambda$1(this.f245b);
                    case 3:
                        return ConfirmDuplicateScheduleTransferDialog.tv_payment_delegate$lambda$2(this.f245b);
                    case 4:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_account_delegate$lambda$3(this.f245b);
                    case 5:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_name_delegate$lambda$4(this.f245b);
                    case 6:
                        return ConfirmDuplicateScheduleTransferDialog.tv_user_name_delegate$lambda$5(this.f245b);
                    default:
                        return ConfirmDuplicateScheduleTransferDialog.tv_amount_delegate$lambda$6(this.f245b);
                }
            }
        });
        final int i16 = 0;
        this.iv_close = C2131j.b(new Function0(this) { // from class: Ad.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateScheduleTransferDialog f245b;

            {
                this.f245b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return ConfirmDuplicateScheduleTransferDialog.iv_close_delegate$lambda$7(this.f245b);
                    case 1:
                        return ConfirmDuplicateScheduleTransferDialog.tv_cancel_delegate$lambda$0(this.f245b);
                    case 2:
                        return ConfirmDuplicateScheduleTransferDialog.tv_confirm_delegate$lambda$1(this.f245b);
                    case 3:
                        return ConfirmDuplicateScheduleTransferDialog.tv_payment_delegate$lambda$2(this.f245b);
                    case 4:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_account_delegate$lambda$3(this.f245b);
                    case 5:
                        return ConfirmDuplicateScheduleTransferDialog.tv_bank_name_delegate$lambda$4(this.f245b);
                    case 6:
                        return ConfirmDuplicateScheduleTransferDialog.tv_user_name_delegate$lambda$5(this.f245b);
                    default:
                        return ConfirmDuplicateScheduleTransferDialog.tv_amount_delegate$lambda$6(this.f245b);
                }
            }
        });
    }

    private final IconicsImageView getIv_close() {
        Object value = this.iv_close.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }

    private final TextView getTv_amount() {
        Object value = this.tv_amount.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_bank_account() {
        Object value = this.tv_bank_account.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_bank_name() {
        Object value = this.tv_bank_name.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_cancel() {
        Object value = this.tv_cancel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_confirm() {
        Object value = this.tv_confirm.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_payment() {
        Object value = this.tv_payment.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_user_name() {
        Object value = this.tv_user_name.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$10(ConfirmDuplicateScheduleTransferDialog confirmDuplicateScheduleTransferDialog, View view) {
        OnConfirmDuplicateScheduleTransferListener onConfirmDuplicateScheduleTransferListener = confirmDuplicateScheduleTransferDialog.listener;
        if (onConfirmDuplicateScheduleTransferListener != null) {
            Intrinsics.e(view);
            onConfirmDuplicateScheduleTransferListener.onPositiveClick(view);
        }
        confirmDuplicateScheduleTransferDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$9(ConfirmDuplicateScheduleTransferDialog confirmDuplicateScheduleTransferDialog, View view) {
        OnConfirmDuplicateScheduleTransferListener onConfirmDuplicateScheduleTransferListener = confirmDuplicateScheduleTransferDialog.listener;
        if (onConfirmDuplicateScheduleTransferListener != null) {
            Intrinsics.e(view);
            onConfirmDuplicateScheduleTransferListener.onNegativeClick(view);
        }
        confirmDuplicateScheduleTransferDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconicsImageView iv_close_delegate$lambda$7(ConfirmDuplicateScheduleTransferDialog confirmDuplicateScheduleTransferDialog) {
        return (IconicsImageView) confirmDuplicateScheduleTransferDialog.findViewById(e.iv_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_amount_delegate$lambda$6(ConfirmDuplicateScheduleTransferDialog confirmDuplicateScheduleTransferDialog) {
        return (TextView) confirmDuplicateScheduleTransferDialog.findViewById(e.tv_amount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_bank_account_delegate$lambda$3(ConfirmDuplicateScheduleTransferDialog confirmDuplicateScheduleTransferDialog) {
        return (TextView) confirmDuplicateScheduleTransferDialog.findViewById(e.tv_bank_account);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_bank_name_delegate$lambda$4(ConfirmDuplicateScheduleTransferDialog confirmDuplicateScheduleTransferDialog) {
        return (TextView) confirmDuplicateScheduleTransferDialog.findViewById(e.tv_bank_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_cancel_delegate$lambda$0(ConfirmDuplicateScheduleTransferDialog confirmDuplicateScheduleTransferDialog) {
        return (TextView) confirmDuplicateScheduleTransferDialog.findViewById(e.tv_cancel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_confirm_delegate$lambda$1(ConfirmDuplicateScheduleTransferDialog confirmDuplicateScheduleTransferDialog) {
        return (TextView) confirmDuplicateScheduleTransferDialog.findViewById(e.tv_confirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_payment_delegate$lambda$2(ConfirmDuplicateScheduleTransferDialog confirmDuplicateScheduleTransferDialog) {
        return (TextView) confirmDuplicateScheduleTransferDialog.findViewById(e.tv_payment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_user_name_delegate$lambda$5(ConfirmDuplicateScheduleTransferDialog confirmDuplicateScheduleTransferDialog) {
        return (TextView) confirmDuplicateScheduleTransferDialog.findViewById(e.tv_user_name);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.sm_dialog_confirm_duplicate_schedule_transfer);
        final int i7 = 0;
        getIv_close().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateScheduleTransferDialog f243b;

            {
                this.f243b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f243b.dismiss();
                        break;
                    case 1:
                        ConfirmDuplicateScheduleTransferDialog.initViews$lambda$9(this.f243b, view);
                        break;
                    default:
                        ConfirmDuplicateScheduleTransferDialog.initViews$lambda$10(this.f243b, view);
                        break;
                }
            }
        });
        final int i10 = 1;
        getTv_cancel().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateScheduleTransferDialog f243b;

            {
                this.f243b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f243b.dismiss();
                        break;
                    case 1:
                        ConfirmDuplicateScheduleTransferDialog.initViews$lambda$9(this.f243b, view);
                        break;
                    default:
                        ConfirmDuplicateScheduleTransferDialog.initViews$lambda$10(this.f243b, view);
                        break;
                }
            }
        });
        final int i11 = 2;
        getTv_confirm().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateScheduleTransferDialog f243b;

            {
                this.f243b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f243b.dismiss();
                        break;
                    case 1:
                        ConfirmDuplicateScheduleTransferDialog.initViews$lambda$9(this.f243b, view);
                        break;
                    default:
                        ConfirmDuplicateScheduleTransferDialog.initViews$lambda$10(this.f243b, view);
                        break;
                }
            }
        });
    }

    public final void setConfirmText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        getTv_confirm().setText(text);
    }

    @NotNull
    public final ConfirmDuplicateScheduleTransferDialog setData(@Nullable ScheduleTransferForBankUnstableOrderResp bookTransferDetail) {
        if (bookTransferDetail != null) {
            TextView tv_amount = getTv_amount();
            Long amount = bookTransferDetail.getAmount();
            tv_amount.setText(r0.B(amount != null ? amount.longValue() : 0L, false));
            getTv_user_name().setText(bookTransferDetail.getPayeeFullName());
            getTv_bank_name().setText(bookTransferDetail.getPayeeBankName());
            G.x(" | ", i0.o(bookTransferDetail.getPayeeBankCardNo()), getTv_bank_account());
            getTv_payment().setText(bookTransferDetail.getPaymentMethodDesc());
        }
        return this;
    }

    public final void setNegativeText(@Nullable CharSequence negative) {
        if (negative != null) {
            if (negative.length() <= 0) {
                negative = null;
            }
            if (negative != null) {
                getTv_cancel().setText(negative);
            }
        }
    }

    @NotNull
    public final ConfirmDuplicateScheduleTransferDialog setOnConfirmDuplicateScheduleTransferListener(@NotNull OnConfirmDuplicateScheduleTransferListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        return this;
    }

    public final void setPositiveText(@Nullable CharSequence positive) {
        if (positive != null) {
            if (positive.length() <= 0) {
                positive = null;
            }
            if (positive != null) {
                getTv_confirm().setText(positive);
            }
        }
    }
}
