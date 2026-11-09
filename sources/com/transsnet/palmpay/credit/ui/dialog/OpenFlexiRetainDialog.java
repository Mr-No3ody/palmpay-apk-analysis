package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.req.CLOpenAccountReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001bR\u001d\u0010$\u001a\u0004\u0018\u00010 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OpenFlexiRetainDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/credit/bean/req/OcApplyData;", "applyData", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/bean/req/OcApplyData;)V", "", "handleExit", "()V", "", "getAppNum", "()I", "initViews", "Lcom/transsnet/palmpay/credit/bean/req/OcApplyData;", "getApplyData", "()Lcom/transsnet/palmpay/credit/bean/req/OcApplyData;", "Landroid/widget/ImageView;", "closeIv$delegate", "Lkotlin/Lazy;", "getCloseIv", "()Landroid/widget/ImageView;", "closeIv", "Lcom/palmpay/lib/ui/button/PpButton;", "continueTv$delegate", "getContinueTv", "()Lcom/palmpay/lib/ui/button/PpButton;", "continueTv", "exitTv$delegate", "getExitTv", "exitTv", "Landroid/widget/TextView;", "loanAmountTv$delegate", "getLoanAmountTv", "()Landroid/widget/TextView;", "loanAmountTv", "Companion", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OpenFlexiRetainDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @NotNull
    public static final String TAG = "OpenFlexiRetainDialog";

    @Nullable
    private final OcApplyData applyData;

    /* JADX INFO: renamed from: closeIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy closeIv;

    /* JADX INFO: renamed from: continueTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy continueTv;

    /* JADX INFO: renamed from: exitTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy exitTv;

    /* JADX INFO: renamed from: loanAmountTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loanAmountTv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenFlexiRetainDialog(@NotNull Context context, @Nullable OcApplyData ocApplyData) {
        super(context, Ya.f.cs_open_flexi_retain_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        this.applyData = ocApplyData;
        final int i7 = 0;
        this.closeIv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.U0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenFlexiRetainDialog f30054b;

            {
                this.f30054b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OpenFlexiRetainDialog.closeIv_delegate$lambda$0(this.f30054b);
                    case 1:
                        return OpenFlexiRetainDialog.continueTv_delegate$lambda$1(this.f30054b);
                    case 2:
                        return OpenFlexiRetainDialog.exitTv_delegate$lambda$2(this.f30054b);
                    default:
                        return OpenFlexiRetainDialog.loanAmountTv_delegate$lambda$3(this.f30054b);
                }
            }
        });
        final int i10 = 1;
        this.continueTv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.U0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenFlexiRetainDialog f30054b;

            {
                this.f30054b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OpenFlexiRetainDialog.closeIv_delegate$lambda$0(this.f30054b);
                    case 1:
                        return OpenFlexiRetainDialog.continueTv_delegate$lambda$1(this.f30054b);
                    case 2:
                        return OpenFlexiRetainDialog.exitTv_delegate$lambda$2(this.f30054b);
                    default:
                        return OpenFlexiRetainDialog.loanAmountTv_delegate$lambda$3(this.f30054b);
                }
            }
        });
        final int i11 = 2;
        this.exitTv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.U0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenFlexiRetainDialog f30054b;

            {
                this.f30054b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OpenFlexiRetainDialog.closeIv_delegate$lambda$0(this.f30054b);
                    case 1:
                        return OpenFlexiRetainDialog.continueTv_delegate$lambda$1(this.f30054b);
                    case 2:
                        return OpenFlexiRetainDialog.exitTv_delegate$lambda$2(this.f30054b);
                    default:
                        return OpenFlexiRetainDialog.loanAmountTv_delegate$lambda$3(this.f30054b);
                }
            }
        });
        final int i12 = 3;
        this.loanAmountTv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.U0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenFlexiRetainDialog f30054b;

            {
                this.f30054b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return OpenFlexiRetainDialog.closeIv_delegate$lambda$0(this.f30054b);
                    case 1:
                        return OpenFlexiRetainDialog.continueTv_delegate$lambda$1(this.f30054b);
                    case 2:
                        return OpenFlexiRetainDialog.exitTv_delegate$lambda$2(this.f30054b);
                    default:
                        return OpenFlexiRetainDialog.loanAmountTv_delegate$lambda$3(this.f30054b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView closeIv_delegate$lambda$0(OpenFlexiRetainDialog openFlexiRetainDialog) {
        return (ImageView) openFlexiRetainDialog.findViewById(Ya.e.closeIv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PpButton continueTv_delegate$lambda$1(OpenFlexiRetainDialog openFlexiRetainDialog) {
        return (PpButton) openFlexiRetainDialog.findViewById(Ya.e.continueTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PpButton exitTv_delegate$lambda$2(OpenFlexiRetainDialog openFlexiRetainDialog) {
        return (PpButton) openFlexiRetainDialog.findViewById(Ya.e.exitTv);
    }

    private final int getAppNum() {
        Context context = BaseApplication.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            List<PackageInfo> installedPackages = packageManager != null ? packageManager.getInstalledPackages(0) : null;
            List<PackageInfo> list = installedPackages;
            if (list != null && !list.isEmpty()) {
                return installedPackages.size();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    private final ImageView getCloseIv() {
        return (ImageView) this.closeIv.getValue();
    }

    private final PpButton getContinueTv() {
        return (PpButton) this.continueTv.getValue();
    }

    private final PpButton getExitTv() {
        return (PpButton) this.exitTv.getValue();
    }

    private final TextView getLoanAmountTv() {
        return (TextView) this.loanAmountTv.getValue();
    }

    private final void handleExit() {
        OcApplyData ocApplyData = this.applyData;
        String product = ocApplyData != null ? ocApplyData.getProduct() : null;
        F6.d.h(TAG, 3, C0.G.o("handleExit >>> loanProduct=", product));
        OcApplyData ocApplyData2 = this.applyData;
        if (!TextUtils.equals(ocApplyData2 != null ? ocApplyData2.getRouterTag() : null, "APPLY_CHECK_TAG") && (Intrinsics.c(product, "CASH_LOAN") || Intrinsics.c(product, "CASH_INSTANT_LOAN") || Intrinsics.c(product, "INSTALLMENT_LOAN"))) {
            IApiCreditService iApiCreditServiceH = C0.G.h(p221ob.c.f40268a);
            OcApplyData ocApplyData3 = this.applyData;
            String applyId = ocApplyData3 != null ? ocApplyData3.getApplyId() : null;
            OcApplyData ocApplyData4 = this.applyData;
            String deviceTag = ocApplyData4 != null ? ocApplyData4.getDeviceTag() : null;
            Integer numValueOf = Integer.valueOf(getAppNum());
            OcApplyData ocApplyData5 = this.applyData;
            boolean plIsActive = ocApplyData5 != null ? ocApplyData5.getPlIsActive() : true;
            OcApplyData ocApplyData6 = this.applyData;
            boolean plIsInstall = ocApplyData6 != null ? ocApplyData6.getPlIsInstall() : true;
            OcApplyData ocApplyData7 = this.applyData;
            String routerTag = ocApplyData7 != null ? ocApplyData7.getRouterTag() : null;
            OcApplyData ocApplyData8 = this.applyData;
            String product2 = ocApplyData8 != null ? ocApplyData8.getProduct() : null;
            iApiCreditServiceH.openCashLoan(new CLOpenAccountReq("RETURN_APPLY", applyId, deviceTag, numValueOf, plIsActive, plIsInstall, routerTag, null, null, null, null, null, null, null, null, product2, 32640, null)).k(p298tf.f.f42629b).subscribe(new p161kf.e(p147jf.a.f38600d, p147jf.a.f38601e, p147jf.a.f38599c));
        }
        dismiss();
        ARouter.getInstance().build("/main/home").navigation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4(OpenFlexiRetainDialog openFlexiRetainDialog, View view) {
        int id2 = view.getId();
        if (id2 == Ya.e.exitTv) {
            openFlexiRetainDialog.handleExit();
        } else if (id2 == Ya.e.continueTv || id2 == Ya.e.closeIv) {
            openFlexiRetainDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView loanAmountTv_delegate$lambda$3(OpenFlexiRetainDialog openFlexiRetainDialog) {
        return (TextView) openFlexiRetainDialog.findViewById(Ya.e.loanAmountTv);
    }

    @Nullable
    public final OcApplyData getApplyData() {
        return this.applyData;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        OcApplyData ocApplyData = this.applyData;
        if (TextUtils.equals(ocApplyData != null ? ocApplyData.getProduct() : null, "OK_CARD")) {
            TextView loanAmountTv = getLoanAmountTv();
            if (loanAmountTv != null) {
                loanAmountTv.setText(getContext().getString(Ya.g.cs_open_retain_text_flexi));
            }
        } else {
            TextView loanAmountTv2 = getLoanAmountTv();
            if (loanAmountTv2 != null) {
                loanAmountTv2.setText(getContext().getString(Ya.g.cs_open_retain_text_cash));
            }
        }
        p220oa.h.q(new ViewOnClickListenerC1533v(this, 13), getExitTv(), getContinueTv(), getCloseIv());
    }
}
