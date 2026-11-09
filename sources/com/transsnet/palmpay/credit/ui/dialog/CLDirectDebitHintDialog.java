package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLDirectDebitHintDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "repaymentDate", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "initViews", "()V", "Ljava/lang/String;", "Landroid/widget/TextView;", "btnTv$delegate", "Lkotlin/Lazy;", "getBtnTv", "()Landroid/widget/TextView;", "btnTv", "tvHint$delegate", "getTvHint", "tvHint", "tvDate$delegate", "getTvDate", "tvDate", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLDirectDebitHintDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: btnTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnTv;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private final String repaymentDate;

    /* JADX INFO: renamed from: tvDate$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvDate;

    /* JADX INFO: renamed from: tvHint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvHint;

    public /* synthetic */ CLDirectDebitHintDialog(Context context, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView btnTv_delegate$lambda$0(CLDirectDebitHintDialog cLDirectDebitHintDialog) {
        return (TextView) cLDirectDebitHintDialog.findViewById(Ya.e.btnTv);
    }

    private final TextView getBtnTv() {
        return (TextView) this.btnTv.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    private final TextView getTvDate() {
        return (TextView) this.tvDate.getValue();
    }

    private final TextView getTvHint() {
        return (TextView) this.tvHint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$6(CLDirectDebitHintDialog cLDirectDebitHintDialog, View view) {
        com.palmpay.lib.apm.launchcounter.util.d.x(null, "LoanAutomaticallyRepayment");
        cLDirectDebitHintDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$3(CLDirectDebitHintDialog cLDirectDebitHintDialog) {
        return (ImageView) cLDirectDebitHintDialog.findViewById(Ya.e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDate_delegate$lambda$2(CLDirectDebitHintDialog cLDirectDebitHintDialog) {
        return (TextView) cLDirectDebitHintDialog.findViewById(Ya.e.tvDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvHint_delegate$lambda$1(CLDirectDebitHintDialog cLDirectDebitHintDialog) {
        return (TextView) cLDirectDebitHintDialog.findViewById(Ya.e.tvHint);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        CharSequence text;
        TextView tvHint = getTvHint();
        if (tvHint != null && (text = tvHint.getText()) != null && text.length() != 0 && tvHint.getText().length() > 19) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tvHint.getText());
            spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getColor(L6.b.ppColorWarning)), 4, 19, 33);
            tvHint.setText(spannableStringBuilder);
        }
        TextView tvDate = getTvDate();
        if (tvDate != null) {
            tvDate.setText(this.repaymentDate);
        }
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLDirectDebitHintDialog f30183b;

                {
                    this.f30183b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30183b.dismiss();
                            break;
                        default:
                            CLDirectDebitHintDialog.initViews$lambda$6(this.f30183b, view);
                            break;
                    }
                }
            }, ivClose);
        }
        TextView btnTv = getBtnTv();
        if (btnTv != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLDirectDebitHintDialog f30183b;

                {
                    this.f30183b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30183b.dismiss();
                            break;
                        default:
                            CLDirectDebitHintDialog.initViews$lambda$6(this.f30183b, view);
                            break;
                    }
                }
            }, btnTv);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLDirectDebitHintDialog(@NotNull Context context, @Nullable String str) {
        super(context, Ya.f.cs_cl_dialog_direct_debit_hint);
        Intrinsics.checkNotNullParameter(context, "context");
        this.repaymentDate = str;
        final int i7 = 0;
        this.btnTv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLDirectDebitHintDialog f30192b;

            {
                this.f30192b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CLDirectDebitHintDialog.btnTv_delegate$lambda$0(this.f30192b);
                    case 1:
                        return CLDirectDebitHintDialog.tvHint_delegate$lambda$1(this.f30192b);
                    case 2:
                        return CLDirectDebitHintDialog.tvDate_delegate$lambda$2(this.f30192b);
                    default:
                        return CLDirectDebitHintDialog.ivClose_delegate$lambda$3(this.f30192b);
                }
            }
        });
        final int i10 = 1;
        this.tvHint = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLDirectDebitHintDialog f30192b;

            {
                this.f30192b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLDirectDebitHintDialog.btnTv_delegate$lambda$0(this.f30192b);
                    case 1:
                        return CLDirectDebitHintDialog.tvHint_delegate$lambda$1(this.f30192b);
                    case 2:
                        return CLDirectDebitHintDialog.tvDate_delegate$lambda$2(this.f30192b);
                    default:
                        return CLDirectDebitHintDialog.ivClose_delegate$lambda$3(this.f30192b);
                }
            }
        });
        final int i11 = 2;
        this.tvDate = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLDirectDebitHintDialog f30192b;

            {
                this.f30192b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLDirectDebitHintDialog.btnTv_delegate$lambda$0(this.f30192b);
                    case 1:
                        return CLDirectDebitHintDialog.tvHint_delegate$lambda$1(this.f30192b);
                    case 2:
                        return CLDirectDebitHintDialog.tvDate_delegate$lambda$2(this.f30192b);
                    default:
                        return CLDirectDebitHintDialog.ivClose_delegate$lambda$3(this.f30192b);
                }
            }
        });
        final int i12 = 3;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLDirectDebitHintDialog f30192b;

            {
                this.f30192b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return CLDirectDebitHintDialog.btnTv_delegate$lambda$0(this.f30192b);
                    case 1:
                        return CLDirectDebitHintDialog.tvHint_delegate$lambda$1(this.f30192b);
                    case 2:
                        return CLDirectDebitHintDialog.tvDate_delegate$lambda$2(this.f30192b);
                    default:
                        return CLDirectDebitHintDialog.ivClose_delegate$lambda$3(this.f30192b);
                }
            }
        });
    }
}
