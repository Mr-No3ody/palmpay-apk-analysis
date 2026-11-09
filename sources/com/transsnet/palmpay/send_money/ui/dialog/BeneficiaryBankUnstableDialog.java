package com.transsnet.palmpay.send_money.ui.dialog;

import Pa.n0;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.send_money.ui.dialog.BeneficiaryBankUnstableDialog;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/BeneficiaryBankUnstableDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "show", "Lcom/transsnet/palmpay/send_money/ui/dialog/BeneficiaryBankUnstableDialog$OnContinueClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnContinueClickListener", "(Lcom/transsnet/palmpay/send_money/ui/dialog/BeneficiaryBankUnstableDialog$OnContinueClickListener;)Lcom/transsnet/palmpay/send_money/ui/dialog/BeneficiaryBankUnstableDialog;", "Lcom/palmpay/lib/ui/button/PpButton;", "btnCancel$delegate", "Lkotlin/Lazy;", "getBtnCancel", "()Lcom/palmpay/lib/ui/button/PpButton;", "btnCancel", "btnContinue$delegate", "getBtnContinue", "btnContinue", "Lcom/mikepenz/iconics/view/IconicsImageView;", "ivClose$delegate", "getIvClose", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "ivClose", "continueClickListener", "Lcom/transsnet/palmpay/send_money/ui/dialog/BeneficiaryBankUnstableDialog$OnContinueClickListener;", "OnContinueClickListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BeneficiaryBankUnstableDialog extends b {

    /* JADX INFO: renamed from: btnCancel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnCancel;

    /* JADX INFO: renamed from: btnContinue$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnContinue;

    @Nullable
    private OnContinueClickListener continueClickListener;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/BeneficiaryBankUnstableDialog$OnContinueClickListener;", "", "onContinueClick", "", "view", "Landroid/view/View;", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnContinueClickListener {
        void onContinueClick(@NotNull View view);
    }

    public BeneficiaryBankUnstableDialog(@Nullable Context context) {
        super(context);
        final int i7 = 0;
        this.btnCancel = C2131j.b(new Function0(this) { // from class: Ad.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BeneficiaryBankUnstableDialog f241b;

            {
                this.f241b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return BeneficiaryBankUnstableDialog.btnCancel_delegate$lambda$0(this.f241b);
                    case 1:
                        return BeneficiaryBankUnstableDialog.btnContinue_delegate$lambda$1(this.f241b);
                    default:
                        return BeneficiaryBankUnstableDialog.ivClose_delegate$lambda$2(this.f241b);
                }
            }
        });
        final int i10 = 1;
        this.btnContinue = C2131j.b(new Function0(this) { // from class: Ad.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BeneficiaryBankUnstableDialog f241b;

            {
                this.f241b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return BeneficiaryBankUnstableDialog.btnCancel_delegate$lambda$0(this.f241b);
                    case 1:
                        return BeneficiaryBankUnstableDialog.btnContinue_delegate$lambda$1(this.f241b);
                    default:
                        return BeneficiaryBankUnstableDialog.ivClose_delegate$lambda$2(this.f241b);
                }
            }
        });
        final int i11 = 2;
        this.ivClose = C2131j.b(new Function0(this) { // from class: Ad.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BeneficiaryBankUnstableDialog f241b;

            {
                this.f241b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return BeneficiaryBankUnstableDialog.btnCancel_delegate$lambda$0(this.f241b);
                    case 1:
                        return BeneficiaryBankUnstableDialog.btnContinue_delegate$lambda$1(this.f241b);
                    default:
                        return BeneficiaryBankUnstableDialog.ivClose_delegate$lambda$2(this.f241b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PpButton btnCancel_delegate$lambda$0(BeneficiaryBankUnstableDialog beneficiaryBankUnstableDialog) {
        return (PpButton) beneficiaryBankUnstableDialog.findViewById(e.btnCancel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PpButton btnContinue_delegate$lambda$1(BeneficiaryBankUnstableDialog beneficiaryBankUnstableDialog) {
        return (PpButton) beneficiaryBankUnstableDialog.findViewById(e.btnContinue);
    }

    private final PpButton getBtnCancel() {
        Object value = this.btnCancel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpButton) value;
    }

    private final PpButton getBtnContinue() {
        Object value = this.btnContinue.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpButton) value;
    }

    private final IconicsImageView getIvClose() {
        Object value = this.ivClose.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(BeneficiaryBankUnstableDialog beneficiaryBankUnstableDialog, View view) {
        n0.g().l("Transfer_ToBank_BankUnstable_Close_Click");
        beneficiaryBankUnstableDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4(BeneficiaryBankUnstableDialog beneficiaryBankUnstableDialog, View view) {
        n0.g().l("Transfer_ToBank_BankUnstable_Cancel_Click");
        beneficiaryBankUnstableDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$5(BeneficiaryBankUnstableDialog beneficiaryBankUnstableDialog, View view) {
        n0.g().l("Transfer_ToBank_BankUnstable_Continue_Click");
        OnContinueClickListener onContinueClickListener = beneficiaryBankUnstableDialog.continueClickListener;
        if (onContinueClickListener != null) {
            Intrinsics.e(view);
            onContinueClickListener.onContinueClick(view);
        }
        beneficiaryBankUnstableDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconicsImageView ivClose_delegate$lambda$2(BeneficiaryBankUnstableDialog beneficiaryBankUnstableDialog) {
        return (IconicsImageView) beneficiaryBankUnstableDialog.findViewById(e.ivClose);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.sm_dialog_beneficiary_bank_unstable);
        final int i7 = 0;
        getIvClose().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BeneficiaryBankUnstableDialog f239b;

            {
                this.f239b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        BeneficiaryBankUnstableDialog.initViews$lambda$3(this.f239b, view);
                        break;
                    case 1:
                        BeneficiaryBankUnstableDialog.initViews$lambda$4(this.f239b, view);
                        break;
                    default:
                        BeneficiaryBankUnstableDialog.initViews$lambda$5(this.f239b, view);
                        break;
                }
            }
        });
        final int i10 = 1;
        getBtnCancel().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BeneficiaryBankUnstableDialog f239b;

            {
                this.f239b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        BeneficiaryBankUnstableDialog.initViews$lambda$3(this.f239b, view);
                        break;
                    case 1:
                        BeneficiaryBankUnstableDialog.initViews$lambda$4(this.f239b, view);
                        break;
                    default:
                        BeneficiaryBankUnstableDialog.initViews$lambda$5(this.f239b, view);
                        break;
                }
            }
        });
        final int i11 = 2;
        getBtnContinue().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BeneficiaryBankUnstableDialog f239b;

            {
                this.f239b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        BeneficiaryBankUnstableDialog.initViews$lambda$3(this.f239b, view);
                        break;
                    case 1:
                        BeneficiaryBankUnstableDialog.initViews$lambda$4(this.f239b, view);
                        break;
                    default:
                        BeneficiaryBankUnstableDialog.initViews$lambda$5(this.f239b, view);
                        break;
                }
            }
        });
    }

    @NotNull
    public final BeneficiaryBankUnstableDialog setOnContinueClickListener(@NotNull OnContinueClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.continueClickListener = listener;
        return this;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        n0.g().v("Transfer_ToBank_BankUnstable_View");
    }
}
