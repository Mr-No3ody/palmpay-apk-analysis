package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010 \u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u001d\u0010%\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010$R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010&R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010&¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcRepayExitDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "mAmount", "<init>", "(Landroid/content/Context;Ljava/lang/Long;)V", "", "setListener", "()V", "initViews", "Landroid/view/View$OnClickListener;", "repayNowListener", "setRepayNowListener", "(Landroid/view/View$OnClickListener;)V", "stopDiscountListener", "setStopDiscountListener", "Ljava/lang/Long;", "Landroid/widget/TextView;", "stop_high_limit_tv$delegate", "Lkotlin/Lazy;", "getStop_high_limit_tv", "()Landroid/widget/TextView;", "stop_high_limit_tv", "Landroid/widget/Button;", "repay_now_bt$delegate", "getRepay_now_bt", "()Landroid/widget/Button;", "repay_now_bt", "increase_amount_tv$delegate", "getIncrease_amount_tv", "increase_amount_tv", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "Landroid/view/View$OnClickListener;", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepayExitDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: increase_amount_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy increase_amount_tv;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private final Long mAmount;

    @Nullable
    private View.OnClickListener repayNowListener;

    /* JADX INFO: renamed from: repay_now_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy repay_now_bt;

    @Nullable
    private View.OnClickListener stopDiscountListener;

    /* JADX INFO: renamed from: stop_high_limit_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy stop_high_limit_tv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcRepayExitDialog(@NotNull Context context, @Nullable Long l5) {
        super(context, Ya.f.cs_oc_repay_exit_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mAmount = l5;
        final int i7 = 0;
        this.stop_high_limit_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.K0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExitDialog f29991b;

            {
                this.f29991b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OcRepayExitDialog.stop_high_limit_tv_delegate$lambda$0(this.f29991b);
                    case 1:
                        return OcRepayExitDialog.repay_now_bt_delegate$lambda$1(this.f29991b);
                    case 2:
                        return OcRepayExitDialog.increase_amount_tv_delegate$lambda$2(this.f29991b);
                    default:
                        return OcRepayExitDialog.ivClose_delegate$lambda$3(this.f29991b);
                }
            }
        });
        final int i10 = 1;
        this.repay_now_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.K0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExitDialog f29991b;

            {
                this.f29991b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcRepayExitDialog.stop_high_limit_tv_delegate$lambda$0(this.f29991b);
                    case 1:
                        return OcRepayExitDialog.repay_now_bt_delegate$lambda$1(this.f29991b);
                    case 2:
                        return OcRepayExitDialog.increase_amount_tv_delegate$lambda$2(this.f29991b);
                    default:
                        return OcRepayExitDialog.ivClose_delegate$lambda$3(this.f29991b);
                }
            }
        });
        final int i11 = 2;
        this.increase_amount_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.K0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExitDialog f29991b;

            {
                this.f29991b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OcRepayExitDialog.stop_high_limit_tv_delegate$lambda$0(this.f29991b);
                    case 1:
                        return OcRepayExitDialog.repay_now_bt_delegate$lambda$1(this.f29991b);
                    case 2:
                        return OcRepayExitDialog.increase_amount_tv_delegate$lambda$2(this.f29991b);
                    default:
                        return OcRepayExitDialog.ivClose_delegate$lambda$3(this.f29991b);
                }
            }
        });
        final int i12 = 3;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.K0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExitDialog f29991b;

            {
                this.f29991b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return OcRepayExitDialog.stop_high_limit_tv_delegate$lambda$0(this.f29991b);
                    case 1:
                        return OcRepayExitDialog.repay_now_bt_delegate$lambda$1(this.f29991b);
                    case 2:
                        return OcRepayExitDialog.increase_amount_tv_delegate$lambda$2(this.f29991b);
                    default:
                        return OcRepayExitDialog.ivClose_delegate$lambda$3(this.f29991b);
                }
            }
        });
    }

    private final TextView getIncrease_amount_tv() {
        return (TextView) this.increase_amount_tv.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    private final Button getRepay_now_bt() {
        return (Button) this.repay_now_bt.getValue();
    }

    private final TextView getStop_high_limit_tv() {
        return (TextView) this.stop_high_limit_tv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView increase_amount_tv_delegate$lambda$2(OcRepayExitDialog ocRepayExitDialog) {
        return (TextView) ocRepayExitDialog.findViewById(Ya.e.increase_amount_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$3(OcRepayExitDialog ocRepayExitDialog) {
        return (ImageView) ocRepayExitDialog.findViewById(Ya.e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button repay_now_bt_delegate$lambda$1(OcRepayExitDialog ocRepayExitDialog) {
        return (Button) ocRepayExitDialog.findViewById(Ya.e.repay_now_bt);
    }

    private final void setListener() {
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            p220oa.h.l(this.stopDiscountListener, ivClose);
        }
        Button repay_now_bt = getRepay_now_bt();
        if (repay_now_bt != null) {
            p220oa.h.l(this.repayNowListener, repay_now_bt);
        }
        TextView stop_high_limit_tv = getStop_high_limit_tv();
        if (stop_high_limit_tv != null) {
            p220oa.h.l(this.stopDiscountListener, stop_high_limit_tv);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView stop_high_limit_tv_delegate$lambda$0(OcRepayExitDialog ocRepayExitDialog) {
        return (TextView) ocRepayExitDialog.findViewById(Ya.e.stop_high_limit_tv);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView increase_amount_tv = getIncrease_amount_tv();
        if (increase_amount_tv != null) {
            Long l5 = this.mAmount;
            increase_amount_tv.setText(Pa.r0.C(Pa.r0.E(l5 != null ? l5.longValue() : 0L), true));
        }
        setListener();
    }

    public final void setRepayNowListener(@NotNull View.OnClickListener repayNowListener) {
        Intrinsics.checkNotNullParameter(repayNowListener, "repayNowListener");
        this.repayNowListener = repayNowListener;
    }

    public final void setStopDiscountListener(@NotNull View.OnClickListener stopDiscountListener) {
        Intrinsics.checkNotNullParameter(stopDiscountListener, "stopDiscountListener");
        this.stopDiscountListener = stopDiscountListener;
    }
}
