package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.bean.resp.CreditIncreaseInfo;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0001&BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001e\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLHighQualityIncreaseAmountDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "dialogType", "loanProduct", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$BusinessInfo;", "businessInfo", "", "Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data$OkCardQuotaLog;", "okCardQuotaLogList", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$BusinessInfo;Ljava/util/List;)V", "", "handleBorrowClick", "()V", "resolveChangeQuota", "()Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data$OkCardQuotaLog;", "changeQuota", "bindQuotaAmount", "(Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data$OkCardQuotaLog;)V", "initViews", "Ljava/lang/String;", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$BusinessInfo;", "Ljava/util/List;", "Landroid/widget/ImageView;", "ivIncreaseAmountClose", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "tvIncreaseAmountBtn", "Landroid/widget/TextView;", "tvCurrencySymbol", "tvIncreaseDialogAmount", "", "jumpCashLoanBorrow", "Ljava/lang/Boolean;", "Companion", "a", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCLHighQualityIncreaseAmountDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CLHighQualityIncreaseAmountDialog.kt\ncom/transsnet/palmpay/credit/ui/dialog/CLHighQualityIncreaseAmountDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1869#2,2:137\n*S KotlinDebug\n*F\n+ 1 CLHighQualityIncreaseAmountDialog.kt\ncom/transsnet/palmpay/credit/ui/dialog/CLHighQualityIncreaseAmountDialog\n*L\n109#1:137,2\n*E\n"})
public final class CLHighQualityIncreaseAmountDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @NotNull
    public static final String TAG = "CLHighQualityIncreaseAmountDialog";

    @Nullable
    private final QueryLoanDialogPopUpsBean.BusinessInfo businessInfo;

    @NotNull
    private final String dialogType;

    @Nullable
    private ImageView ivIncreaseAmountClose;

    @Nullable
    private Boolean jumpCashLoanBorrow;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final List<CreditIncreaseInfo.Data.OkCardQuotaLog> okCardQuotaLogList;

    @Nullable
    private TextView tvCurrencySymbol;

    @Nullable
    private TextView tvIncreaseAmountBtn;

    @Nullable
    private TextView tvIncreaseDialogAmount;

    public /* synthetic */ CLHighQualityIncreaseAmountDialog(Context context, String str, String str2, QueryLoanDialogPopUpsBean.BusinessInfo businessInfo, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : businessInfo, (i7 & 16) != 0 ? null : list);
    }

    private final void bindQuotaAmount(CreditIncreaseInfo.Data.OkCardQuotaLog changeQuota) {
        Long currQuota;
        long jLongValue = (changeQuota == null || (currQuota = changeQuota.getCurrQuota()) == null) ? 0L : currQuota.longValue();
        TextView textView = this.tvCurrencySymbol;
        if (textView != null) {
            textView.setText(BaseApplication.getCurrencySymbol());
        }
        TextView textView2 = this.tvIncreaseDialogAmount;
        if (textView2 != null) {
            textView2.setText(Pa.r0.E(jLongValue));
        }
    }

    private final void handleBorrowClick() {
        QueryLoanDialogPopUpsBean.BusinessInfo businessInfo;
        if (!Intrinsics.c(this.jumpCashLoanBorrow, Boolean.TRUE)) {
            if (Intrinsics.c(this.loanProduct, "OK_CARD")) {
                com.palmpay.lib.apm.launchcounter.util.d.x(null, "LoanFlexi");
                return;
            } else {
                if (!Intrinsics.c(this.loanProduct, "PALMPAY_BUSINESS_LOAN") || (businessInfo = this.businessInfo) == null || businessInfo.getJumpPath() == null || businessInfo.getJumpType() == null) {
                    return;
                }
                Pa.F.f(businessInfo.getJumpPath(), businessInfo.getJumpType(), businessInfo.getJumpParams());
                return;
            }
        }
        if (TextUtils.isEmpty(this.loanProduct)) {
            N8.q0.v("/main/home", "tab", "finance");
            return;
        }
        androidx.fragment.app.E activity = getActivity(getContext());
        if (activity != null) {
            ILoanCreditService iLoanCreditService = (ILoanCreditService) com.horcrux.svg.d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
            androidx.fragment.app.Z supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            iLoanCreditService.startBorrow(supportFragmentManager, this.loanProduct, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(CLHighQualityIncreaseAmountDialog cLHighQualityIncreaseAmountDialog, View view) {
        cLHighQualityIncreaseAmountDialog.dismiss();
        cLHighQualityIncreaseAmountDialog.handleBorrowClick();
    }

    private final CreditIncreaseInfo.Data.OkCardQuotaLog resolveChangeQuota() {
        Integer accountType;
        Integer accountType2;
        Integer accountType3;
        Integer accountType4;
        Integer accountType5;
        List<CreditIncreaseInfo.Data.OkCardQuotaLog> list = this.okCardQuotaLogList;
        CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog = null;
        if (list != null) {
            for (CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog2 : list) {
                if ((okCardQuotaLog2 != null && (accountType5 = okCardQuotaLog2.getAccountType()) != null && accountType5.intValue() == 7) || ((okCardQuotaLog2 != null && (accountType4 = okCardQuotaLog2.getAccountType()) != null && accountType4.intValue() == 9) || ((okCardQuotaLog2 != null && (accountType3 = okCardQuotaLog2.getAccountType()) != null && accountType3.intValue() == 6) || ((okCardQuotaLog2 != null && (accountType2 = okCardQuotaLog2.getAccountType()) != null && accountType2.intValue() == 13) || (okCardQuotaLog2 != null && (accountType = okCardQuotaLog2.getAccountType()) != null && accountType.intValue() == 14))))) {
                    okCardQuotaLog = okCardQuotaLog2;
                }
            }
        }
        return okCardQuotaLog;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        String str = this.dialogType;
        String str2 = this.loanProduct;
        QueryLoanDialogPopUpsBean.BusinessInfo businessInfo = this.businessInfo;
        StringBuilder sbF = androidx.camera.camera2.internal.F.f("dialogType=", str, ", loanProduct=", str2, ", businessInfo=");
        sbF.append(businessInfo);
        F6.d.h(TAG, 3, sbF.toString());
        this.ivIncreaseAmountClose = (ImageView) findViewById(p116hb.c.ivIncreaseAmountClose);
        this.tvIncreaseAmountBtn = (TextView) findViewById(p116hb.c.tvIncreaseAmountBtn);
        this.tvCurrencySymbol = (TextView) findViewById(p116hb.c.tvCurrencySymbol);
        this.tvIncreaseDialogAmount = (TextView) findViewById(p116hb.c.tvIncreaseDialogAmount);
        ImageView imageView = this.ivIncreaseAmountClose;
        if (imageView != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLHighQualityIncreaseAmountDialog f30214b;

                {
                    this.f30214b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30214b.dismiss();
                            break;
                        default:
                            CLHighQualityIncreaseAmountDialog.initViews$lambda$1(this.f30214b, view);
                            break;
                    }
                }
            }, imageView);
        }
        TextView textView = this.tvIncreaseAmountBtn;
        if (textView != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLHighQualityIncreaseAmountDialog f30214b;

                {
                    this.f30214b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30214b.dismiss();
                            break;
                        default:
                            CLHighQualityIncreaseAmountDialog.initViews$lambda$1(this.f30214b, view);
                            break;
                    }
                }
            }, textView);
        }
        bindQuotaAmount(resolveChangeQuota());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLHighQualityIncreaseAmountDialog(@NotNull Context context, @NotNull String dialogType, @Nullable String str, @Nullable QueryLoanDialogPopUpsBean.BusinessInfo businessInfo, @Nullable List<CreditIncreaseInfo.Data.OkCardQuotaLog> list) {
        super(context, p116hb.d.cs_cl_dialog_high_quality_increase_amount);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dialogType, "dialogType");
        this.dialogType = dialogType;
        this.loanProduct = str;
        this.businessInfo = businessInfo;
        this.okCardQuotaLogList = list;
        this.jumpCashLoanBorrow = Boolean.TRUE;
    }
}
