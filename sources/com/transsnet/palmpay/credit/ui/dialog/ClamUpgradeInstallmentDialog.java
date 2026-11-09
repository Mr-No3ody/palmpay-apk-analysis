package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/ClamUpgradeInstallmentDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/credit/ui/dialog/ClamUpgradeInstallmentDialog$OnUpgradeInstallmentListener;", "onUpgradeInstallmentListener", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/ui/dialog/ClamUpgradeInstallmentDialog$OnUpgradeInstallmentListener;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/credit/ui/dialog/ClamUpgradeInstallmentDialog$OnUpgradeInstallmentListener;", "getOnUpgradeInstallmentListener", "()Lcom/transsnet/palmpay/credit/ui/dialog/ClamUpgradeInstallmentDialog$OnUpgradeInstallmentListener;", "Landroid/widget/ImageView;", "iv_claim$delegate", "Lkotlin/Lazy;", "getIv_claim", "()Landroid/widget/ImageView;", "iv_claim", "iiv_close$delegate", "getIiv_close", "iiv_close", "OnUpgradeInstallmentListener", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClamUpgradeInstallmentDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: iiv_close$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iiv_close;

    /* JADX INFO: renamed from: iv_claim$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iv_claim;

    @NotNull
    private final OnUpgradeInstallmentListener onUpgradeInstallmentListener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/ClamUpgradeInstallmentDialog$OnUpgradeInstallmentListener;", "", "onClaim", "", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnUpgradeInstallmentListener {
        void onClaim();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClamUpgradeInstallmentDialog(@NotNull Context context, @NotNull OnUpgradeInstallmentListener onUpgradeInstallmentListener) {
        super(context, Ya.f.cs_cl_dialog_clam_upgrade_installment);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onUpgradeInstallmentListener, "onUpgradeInstallmentListener");
        this.onUpgradeInstallmentListener = onUpgradeInstallmentListener;
        final int i7 = 0;
        this.iv_claim = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ClamUpgradeInstallmentDialog f30134b;

            {
                this.f30134b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return ClamUpgradeInstallmentDialog.iv_claim_delegate$lambda$0(this.f30134b);
                    default:
                        return ClamUpgradeInstallmentDialog.iiv_close_delegate$lambda$1(this.f30134b);
                }
            }
        });
        final int i10 = 1;
        this.iiv_close = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ClamUpgradeInstallmentDialog f30134b;

            {
                this.f30134b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ClamUpgradeInstallmentDialog.iv_claim_delegate$lambda$0(this.f30134b);
                    default:
                        return ClamUpgradeInstallmentDialog.iiv_close_delegate$lambda$1(this.f30134b);
                }
            }
        });
    }

    private final ImageView getIiv_close() {
        return (ImageView) this.iiv_close.getValue();
    }

    private final ImageView getIv_claim() {
        return (ImageView) this.iv_claim.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView iiv_close_delegate$lambda$1(ClamUpgradeInstallmentDialog clamUpgradeInstallmentDialog) {
        return (ImageView) clamUpgradeInstallmentDialog.findViewById(Ya.e.iiv_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(ClamUpgradeInstallmentDialog clamUpgradeInstallmentDialog, View view) {
        OnUpgradeInstallmentListener onUpgradeInstallmentListener = clamUpgradeInstallmentDialog.onUpgradeInstallmentListener;
        if (onUpgradeInstallmentListener != null) {
            onUpgradeInstallmentListener.onClaim();
        }
        clamUpgradeInstallmentDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView iv_claim_delegate$lambda$0(ClamUpgradeInstallmentDialog clamUpgradeInstallmentDialog) {
        return (ImageView) clamUpgradeInstallmentDialog.findViewById(Ya.e.iv_claim);
    }

    @NotNull
    public final OnUpgradeInstallmentListener getOnUpgradeInstallmentListener() {
        return this.onUpgradeInstallmentListener;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth() - CommonViewExtKt.getDp(48);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        ImageView iv_claim = getIv_claim();
        if (iv_claim != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.i0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ClamUpgradeInstallmentDialog f30128b;

                {
                    this.f30128b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            ClamUpgradeInstallmentDialog.initViews$lambda$3(this.f30128b, view);
                            break;
                        default:
                            this.f30128b.dismiss();
                            break;
                    }
                }
            }, iv_claim);
        }
        ImageView iiv_close = getIiv_close();
        if (iiv_close != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.i0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ClamUpgradeInstallmentDialog f30128b;

                {
                    this.f30128b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            ClamUpgradeInstallmentDialog.initViews$lambda$3(this.f30128b, view);
                            break;
                        default:
                            this.f30128b.dismiss();
                            break;
                    }
                }
            }, iiv_close);
        }
    }
}
