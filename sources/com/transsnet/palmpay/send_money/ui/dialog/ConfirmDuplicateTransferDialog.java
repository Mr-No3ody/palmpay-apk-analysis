package com.transsnet.palmpay.send_money.ui.dialog;

import N8.q0;
import Pa.n0;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateTransferDialog;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001+B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateTransferDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "eventBase", "eventSuffix", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "action", "buildEventName", "(Ljava/lang/String;)Ljava/lang/String;", "", "initViews", "()V", "show", "", "title", "setDuplicateTitle", "(Ljava/lang/CharSequence;)Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateTransferDialog;", "Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateTransferDialog$OnContinueClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnContinueClickListener", "(Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateTransferDialog$OnContinueClickListener;)Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateTransferDialog;", "Ljava/lang/String;", "Landroid/widget/TextView;", "tvTitle$delegate", "Lkotlin/Lazy;", "getTvTitle", "()Landroid/widget/TextView;", "tvTitle", "Lcom/palmpay/lib/ui/button/PpButton;", "btnContinue$delegate", "getBtnContinue", "()Lcom/palmpay/lib/ui/button/PpButton;", "btnContinue", "Lcom/mikepenz/iconics/view/IconicsImageView;", "ivClose$delegate", "getIvClose", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "ivClose", "continueClickListener", "Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateTransferDialog$OnContinueClickListener;", "OnContinueClickListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfirmDuplicateTransferDialog extends b {

    /* JADX INFO: renamed from: btnContinue$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnContinue;

    @Nullable
    private OnContinueClickListener continueClickListener;

    @NotNull
    private final String eventBase;

    @NotNull
    private final String eventSuffix;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    /* JADX INFO: renamed from: tvTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvTitle;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/ConfirmDuplicateTransferDialog$OnContinueClickListener;", "", "onContinueClick", "", "view", "Landroid/view/View;", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnContinueClickListener {
        void onContinueClick(@NotNull View view);
    }

    public /* synthetic */ ConfirmDuplicateTransferDialog(Context context, String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i7 & 4) != 0 ? "" : str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PpButton btnContinue_delegate$lambda$1(ConfirmDuplicateTransferDialog confirmDuplicateTransferDialog) {
        return (PpButton) confirmDuplicateTransferDialog.findViewById(e.btnContinue);
    }

    private final String buildEventName(String action) {
        return q0.l(this.eventBase, "_", action, this.eventSuffix);
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

    private final TextView getTvTitle() {
        Object value = this.tvTitle.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(ConfirmDuplicateTransferDialog confirmDuplicateTransferDialog, View view) {
        n0.g().l(confirmDuplicateTransferDialog.buildEventName("Close_Click"));
        confirmDuplicateTransferDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4(ConfirmDuplicateTransferDialog confirmDuplicateTransferDialog, View view) {
        n0.g().l(confirmDuplicateTransferDialog.buildEventName("Continue_Click"));
        OnContinueClickListener onContinueClickListener = confirmDuplicateTransferDialog.continueClickListener;
        if (onContinueClickListener != null) {
            Intrinsics.e(view);
            onContinueClickListener.onContinueClick(view);
        }
        confirmDuplicateTransferDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconicsImageView ivClose_delegate$lambda$2(ConfirmDuplicateTransferDialog confirmDuplicateTransferDialog) {
        return (IconicsImageView) confirmDuplicateTransferDialog.findViewById(e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTitle_delegate$lambda$0(ConfirmDuplicateTransferDialog confirmDuplicateTransferDialog) {
        return (TextView) confirmDuplicateTransferDialog.findViewById(e.tvTitle);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.sm_dialog_confirm_duplicate_transfer);
        final int i7 = 0;
        getIvClose().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateTransferDialog f247b;

            {
                this.f247b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        ConfirmDuplicateTransferDialog.initViews$lambda$3(this.f247b, view);
                        break;
                    default:
                        ConfirmDuplicateTransferDialog.initViews$lambda$4(this.f247b, view);
                        break;
                }
            }
        });
        final int i10 = 1;
        getBtnContinue().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateTransferDialog f247b;

            {
                this.f247b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ConfirmDuplicateTransferDialog.initViews$lambda$3(this.f247b, view);
                        break;
                    default:
                        ConfirmDuplicateTransferDialog.initViews$lambda$4(this.f247b, view);
                        break;
                }
            }
        });
    }

    @NotNull
    public final ConfirmDuplicateTransferDialog setDuplicateTitle(@Nullable CharSequence title) {
        if (title != null && !StringsKt.F(title)) {
            getTvTitle().setText(title);
        }
        return this;
    }

    @NotNull
    public final ConfirmDuplicateTransferDialog setOnContinueClickListener(@NotNull OnContinueClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.continueClickListener = listener;
        return this;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        n0.g().v(buildEventName("View"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmDuplicateTransferDialog(@Nullable Context context, @NotNull String eventBase, @NotNull String eventSuffix) {
        super(context);
        Intrinsics.checkNotNullParameter(eventBase, "eventBase");
        Intrinsics.checkNotNullParameter(eventSuffix, "eventSuffix");
        this.eventBase = eventBase;
        this.eventSuffix = eventSuffix;
        final int i7 = 0;
        this.tvTitle = C2131j.b(new Function0(this) { // from class: Ad.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateTransferDialog f249b;

            {
                this.f249b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return ConfirmDuplicateTransferDialog.tvTitle_delegate$lambda$0(this.f249b);
                    case 1:
                        return ConfirmDuplicateTransferDialog.btnContinue_delegate$lambda$1(this.f249b);
                    default:
                        return ConfirmDuplicateTransferDialog.ivClose_delegate$lambda$2(this.f249b);
                }
            }
        });
        final int i10 = 1;
        this.btnContinue = C2131j.b(new Function0(this) { // from class: Ad.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateTransferDialog f249b;

            {
                this.f249b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ConfirmDuplicateTransferDialog.tvTitle_delegate$lambda$0(this.f249b);
                    case 1:
                        return ConfirmDuplicateTransferDialog.btnContinue_delegate$lambda$1(this.f249b);
                    default:
                        return ConfirmDuplicateTransferDialog.ivClose_delegate$lambda$2(this.f249b);
                }
            }
        });
        final int i11 = 2;
        this.ivClose = C2131j.b(new Function0(this) { // from class: Ad.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmDuplicateTransferDialog f249b;

            {
                this.f249b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ConfirmDuplicateTransferDialog.tvTitle_delegate$lambda$0(this.f249b);
                    case 1:
                        return ConfirmDuplicateTransferDialog.btnContinue_delegate$lambda$1(this.f249b);
                    default:
                        return ConfirmDuplicateTransferDialog.ivClose_delegate$lambda$2(this.f249b);
                }
            }
        });
    }
}
