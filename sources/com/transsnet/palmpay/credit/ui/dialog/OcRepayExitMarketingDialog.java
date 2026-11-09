package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcRepayExitMarketingDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "setListener", "()V", "initViews", "Landroid/view/View$OnClickListener;", "repayNowListener", "setRepayNowListener", "(Landroid/view/View$OnClickListener;)V", "stopDiscountListener", "setStopDiscountListener", "Landroid/widget/Button;", "stop_discount$delegate", "Lkotlin/Lazy;", "getStop_discount", "()Landroid/widget/Button;", "stop_discount", "repay_now_bt$delegate", "getRepay_now_bt", "repay_now_bt", "Landroid/widget/ImageView;", "ivBg$delegate", "getIvBg", "()Landroid/widget/ImageView;", "ivBg", "Landroid/view/View$OnClickListener;", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepayExitMarketingDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: ivBg$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivBg;

    @Nullable
    private View.OnClickListener repayNowListener;

    /* JADX INFO: renamed from: repay_now_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy repay_now_bt;

    @Nullable
    private View.OnClickListener stopDiscountListener;

    /* JADX INFO: renamed from: stop_discount$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy stop_discount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcRepayExitMarketingDialog(@NotNull Context context) {
        super(context, Ya.f.cs_oc_repay_exit_marketing_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.stop_discount = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.L0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExitMarketingDialog f29995b;

            {
                this.f29995b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OcRepayExitMarketingDialog.stop_discount_delegate$lambda$0(this.f29995b);
                    case 1:
                        return OcRepayExitMarketingDialog.repay_now_bt_delegate$lambda$1(this.f29995b);
                    default:
                        return OcRepayExitMarketingDialog.ivBg_delegate$lambda$2(this.f29995b);
                }
            }
        });
        final int i10 = 1;
        this.repay_now_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.L0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExitMarketingDialog f29995b;

            {
                this.f29995b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcRepayExitMarketingDialog.stop_discount_delegate$lambda$0(this.f29995b);
                    case 1:
                        return OcRepayExitMarketingDialog.repay_now_bt_delegate$lambda$1(this.f29995b);
                    default:
                        return OcRepayExitMarketingDialog.ivBg_delegate$lambda$2(this.f29995b);
                }
            }
        });
        final int i11 = 2;
        this.ivBg = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.L0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExitMarketingDialog f29995b;

            {
                this.f29995b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OcRepayExitMarketingDialog.stop_discount_delegate$lambda$0(this.f29995b);
                    case 1:
                        return OcRepayExitMarketingDialog.repay_now_bt_delegate$lambda$1(this.f29995b);
                    default:
                        return OcRepayExitMarketingDialog.ivBg_delegate$lambda$2(this.f29995b);
                }
            }
        });
    }

    private final ImageView getIvBg() {
        return (ImageView) this.ivBg.getValue();
    }

    private final Button getRepay_now_bt() {
        return (Button) this.repay_now_bt.getValue();
    }

    private final Button getStop_discount() {
        return (Button) this.stop_discount.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivBg_delegate$lambda$2(OcRepayExitMarketingDialog ocRepayExitMarketingDialog) {
        return (ImageView) ocRepayExitMarketingDialog.findViewById(Ya.e.ivBg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button repay_now_bt_delegate$lambda$1(OcRepayExitMarketingDialog ocRepayExitMarketingDialog) {
        return (Button) ocRepayExitMarketingDialog.findViewById(Ya.e.repay_now_bt);
    }

    private final void setListener() {
        Button repay_now_bt = getRepay_now_bt();
        if (repay_now_bt != null) {
            p220oa.h.l(this.repayNowListener, repay_now_bt);
        }
        Button stop_discount = getStop_discount();
        if (stop_discount != null) {
            p220oa.h.l(this.stopDiscountListener, stop_discount);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button stop_discount_delegate$lambda$0(OcRepayExitMarketingDialog ocRepayExitMarketingDialog) {
        return (Button) ocRepayExitMarketingDialog.findViewById(Ya.e.stop_discount);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Pa.r0.h1(getIvBg(), Pa.r0.y0("/cs_oc_repay_exit_dialog_img.png"), Ya.d.cs_oc_repay_exit_dialog_img_holder);
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
