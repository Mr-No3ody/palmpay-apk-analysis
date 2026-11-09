package com.transsnet.palmpay.credit.ui.dialog;

import Pa.C0525w;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.bean.QuotaChange;
import com.transsnet.palmpay.credit.bean.resp.CreditIncreaseInfo;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 22\u00020\u0001:\u00013BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0004*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001e\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u001e\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0018\u0010.\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010'R\u0018\u0010/\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010$R\u0018\u00100\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLIncreaseAmountDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "dialogType", "loanProduct", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$BusinessInfo;", "businessInfo", "", "Lcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data$OkCardQuotaLog;", "okCardQuotaLogList", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$BusinessInfo;Ljava/util/List;)V", "", "amountFormat", "(J)Ljava/lang/String;", "", "percentage", "(D)Ljava/lang/String;", "", "updateCycleChangeView", "()V", "updateQuotaChangeView", "", "quotaChange", "interestChange", "quota", "saveChangeData", "(ZZLcom/transsnet/palmpay/credit/bean/resp/CreditIncreaseInfo$Data$OkCardQuotaLog;)V", "initViews", "Ljava/lang/String;", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$BusinessInfo;", "Ljava/util/List;", "Landroid/widget/ImageView;", "ivIncreaseAmountClose", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "tvIncreaseAmountBtn", "Landroid/widget/TextView;", "tvIncreaseAmountTips2", "tvIncreaseAmountTips", "Landroid/view/View;", "layoutIncreaseAmountTips", "Landroid/view/View;", "tvIncreaseDialogAmount", "tvIncreaseDialogTitle", "ivIncreaseDialogBg", "jumpCashLoanBorrow", "Ljava/lang/Boolean;", "Companion", "a", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCLIncreaseAmountDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CLIncreaseAmountDialog.kt\ncom/transsnet/palmpay/credit/ui/dialog/CLIncreaseAmountDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,548:1\n1869#2,2:549\n*S KotlinDebug\n*F\n+ 1 CLIncreaseAmountDialog.kt\ncom/transsnet/palmpay/credit/ui/dialog/CLIncreaseAmountDialog\n*L\n198#1:549,2\n*E\n"})
public final class CLIncreaseAmountDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @NotNull
    public static final String TAG = "CLIncreaseAmountDialog";

    @NotNull
    public static final String URL_DIALOG_BG = "https://static.chuanyinet.com/images/Business%20Loand38840a3-b680-4b.png";

    @NotNull
    public static final String URL_DIALOG_BL_BG = "https://static.chuanyinet.com/images/Flexi%20Loanf70fbbf9-6bb9-4c.png";

    @NotNull
    public static final String URL_DIALOG_CARD_BG = "https://static.chuanyinet.com/images/Card%20Benefits51ad1306-06ae-4c.png";

    @Nullable
    private final QueryLoanDialogPopUpsBean.BusinessInfo businessInfo;

    @NotNull
    private final String dialogType;

    @Nullable
    private ImageView ivIncreaseAmountClose;

    @Nullable
    private ImageView ivIncreaseDialogBg;

    @Nullable
    private Boolean jumpCashLoanBorrow;

    @Nullable
    private View layoutIncreaseAmountTips;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final List<CreditIncreaseInfo.Data.OkCardQuotaLog> okCardQuotaLogList;

    @Nullable
    private TextView tvIncreaseAmountBtn;

    @Nullable
    private TextView tvIncreaseAmountTips;

    @Nullable
    private TextView tvIncreaseAmountTips2;

    @Nullable
    private TextView tvIncreaseDialogAmount;

    @Nullable
    private TextView tvIncreaseDialogTitle;

    public /* synthetic */ CLIncreaseAmountDialog(Context context, String str, String str2, QueryLoanDialogPopUpsBean.BusinessInfo businessInfo, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : businessInfo, (i7 & 16) != 0 ? null : list);
    }

    private final String amountFormat(long j6) {
        String strF = Pa.r0.F(j6);
        Intrinsics.checkNotNullExpressionValue(strF, "getAmountThousandNoPointWithCurrency(...)");
        return strF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(CLIncreaseAmountDialog cLIncreaseAmountDialog, View view) {
        QueryLoanDialogPopUpsBean.BusinessInfo businessInfo;
        cLIncreaseAmountDialog.dismiss();
        if (!Intrinsics.c(cLIncreaseAmountDialog.jumpCashLoanBorrow, Boolean.TRUE)) {
            if (Intrinsics.c(cLIncreaseAmountDialog.loanProduct, "OK_CARD")) {
                com.palmpay.lib.apm.launchcounter.util.d.x(null, "LoanFlexi");
                return;
            } else {
                if (!Intrinsics.c(cLIncreaseAmountDialog.loanProduct, "PALMPAY_BUSINESS_LOAN") || (businessInfo = cLIncreaseAmountDialog.businessInfo) == null || businessInfo.getJumpPath() == null || businessInfo.getJumpType() == null) {
                    return;
                }
                Pa.F.f(businessInfo.getJumpPath(), businessInfo.getJumpType(), businessInfo.getJumpParams());
                return;
            }
        }
        if (TextUtils.isEmpty(cLIncreaseAmountDialog.loanProduct)) {
            N8.q0.v("/main/home", "tab", "finance");
            return;
        }
        androidx.fragment.app.E activity = cLIncreaseAmountDialog.getActivity(cLIncreaseAmountDialog.getContext());
        if (activity != null) {
            ILoanCreditService iLoanCreditService = (ILoanCreditService) com.horcrux.svg.d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
            androidx.fragment.app.Z supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            iLoanCreditService.startBorrow(supportFragmentManager, cLIncreaseAmountDialog.loanProduct, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
        }
    }

    private final String percentage(double d2) {
        BigDecimal bigDecimalMultiply = new BigDecimal(d2).multiply(new BigDecimal(100));
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setMinimumFractionDigits(0);
        String str = decimalFormat.format(bigDecimalMultiply);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return N8.q0.j(str, "%");
    }

    private final void saveChangeData(boolean quotaChange, boolean interestChange, CreditIncreaseInfo.Data.OkCardQuotaLog quota) {
        try {
            p355xf.o oVar = p355xf.q.f43977a;
            ArrayList arrayList = new ArrayList();
            if (quotaChange) {
                Long lastQuota = quota.getLastQuota();
                Long currQuota = quota.getCurrQuota();
                String strValueOf = String.valueOf(lastQuota);
                String strValueOf2 = String.valueOf(currQuota);
                String str = this.loanProduct;
                Integer remainingDays = quota.getRemainingDays();
                arrayList.add(new QuotaChange(0, strValueOf, strValueOf2, str, Integer.valueOf(remainingDays != null ? remainingDays.intValue() : 0)));
            }
            if (interestChange) {
                Double preInterestRatio = quota.getPreInterestRatio();
                Double dValueOf = preInterestRatio != null ? Double.valueOf(Math.abs(preInterestRatio.doubleValue())) : null;
                Double interestRatio = quota.getInterestRatio();
                Double dValueOf2 = interestRatio != null ? Double.valueOf(Math.abs(interestRatio.doubleValue())) : null;
                String strValueOf3 = String.valueOf(dValueOf);
                String strValueOf4 = String.valueOf(dValueOf2);
                String str2 = this.loanProduct;
                Integer remainingDays2 = quota.getRemainingDays();
                arrayList.add(new QuotaChange(2, strValueOf3, strValueOf4, str2, Integer.valueOf(remainingDays2 != null ? remainingDays2.intValue() : 0)));
            }
            SPUtils.get().put("quota_change_data" + BaseApplication.get().getUser().getPhoneNumber(), ((Gson) C0525w.f().f7166b).toJson(arrayList));
            Unit unit = Unit.f38893a;
        } catch (Throwable th) {
            p355xf.o oVar2 = p355xf.q.f43977a;
            androidx.camera.core.impl.utils.executor.g.f(th);
        }
    }

    private final void updateCycleChangeView() {
        Integer changeDays;
        Integer extendedDays;
        F6.d.h(TAG, 3, "updateCycleChangeView >>>");
        TextView textView = this.tvIncreaseDialogTitle;
        if (textView != null) {
            textView.setText("Loan Term");
        }
        QueryLoanDialogPopUpsBean.BusinessInfo businessInfo = this.businessInfo;
        int iIntValue = (businessInfo == null || (extendedDays = businessInfo.getExtendedDays()) == null) ? 0 : extendedDays.intValue();
        QueryLoanDialogPopUpsBean.BusinessInfo businessInfo2 = this.businessInfo;
        int iIntValue2 = (businessInfo2 == null || (changeDays = businessInfo2.getChangeDays()) == null) ? 0 : changeDays.intValue();
        TextView textView2 = this.tvIncreaseDialogAmount;
        if (textView2 != null) {
            textView2.setText(new SpanUtils().append(String.valueOf(iIntValue2)).setFontSize(36, true).append("Days").setFontSize(16, true).setFontFamily("sans-serif").create());
        }
        View view = this.layoutIncreaseAmountTips;
        if (view != null) {
            p220oa.h.s(view, true);
        }
        TextView textView3 = this.tvIncreaseAmountTips2;
        if (textView3 != null) {
            p220oa.h.s(textView3, false);
        }
        TextView textView4 = this.tvIncreaseAmountTips;
        if (textView4 != null) {
            C0.G.w(getContext(), L6.b.ppColorWarning, C0.G.i("Loan term extended by ").setForegroundColor(getContext().getColor(p116hb.a.text_color_black_immutable)).append(iIntValue + " days"), textView4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:105:0x013d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0143  */
    /* JADX WARN: Code duplicated, block: B:109:0x0146  */
    /* JADX WARN: Code duplicated, block: B:112:0x014e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:120:0x0169  */
    /* JADX WARN: Code duplicated, block: B:121:0x016e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0174  */
    /* JADX WARN: Code duplicated, block: B:125:0x0176  */
    /* JADX WARN: Code duplicated, block: B:128:0x017d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0182  */
    /* JADX WARN: Code duplicated, block: B:132:0x0188  */
    /* JADX WARN: Code duplicated, block: B:133:0x018a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0191  */
    /* JADX WARN: Code duplicated, block: B:137:0x0196  */
    /* JADX WARN: Code duplicated, block: B:140:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x019e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:495:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x002f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:87:0x0109  */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    private final void updateQuotaChangeView() {
        double d2;
        long j6;
        boolean z3;
        boolean z8;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Double preInterestRatio;
        Double interestRatio;
        String string;
        Long changeQuota;
        Long currQuota;
        Long exceptSaveServiceFeeAmount;
        Double preServiceFeeRatio;
        Double serviceFeeRatio;
        Long changeQuota2;
        Long currQuota2;
        Long exceptSaveAmount;
        Long currQuota3;
        Double preInterestRatio2;
        Double interestRatio2;
        Long changeQuota3;
        Long currQuota4;
        Long changeQuota4;
        Long currQuota5;
        Long changeQuota5;
        Double preServiceFeeRatio2;
        Double serviceFeeRatio2;
        Long currQuota6;
        Long changeQuota6;
        Double preInterestRatio3;
        Double interestRatio3;
        Long currQuota7;
        long j10;
        int iIntValue;
        boolean z17;
        Long changeQuota7;
        long jLongValue;
        Double changedInterestRatio;
        double dDoubleValue;
        Double changedServiceFeeRatio;
        double dDoubleValue2;
        boolean z18;
        boolean z19;
        Long changeQuota8;
        long jLongValue2;
        boolean z20;
        Long changeQuota9;
        long jLongValue3;
        Double changedInterestRatio2;
        double dDoubleValue3;
        boolean z21;
        Long changeQuota10;
        long jLongValue4;
        Double changedInterestRatio3;
        double dDoubleValue4;
        Integer accountType;
        Integer accountType2;
        Integer accountType3;
        Integer accountType4;
        Integer accountType5;
        Integer remainingDays;
        Integer accountType6;
        Integer accountType7;
        F6.d.h(TAG, 3, "updateQuotaChangeView >>>");
        List<CreditIncreaseInfo.Data.OkCardQuotaLog> list = this.okCardQuotaLogList;
        kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
        if (list != null) {
            z3 = false;
            z8 = false;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
            z16 = false;
            for (CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog : list) {
                if (okCardQuotaLog == null || (accountType7 = okCardQuotaLog.getAccountType()) == null) {
                    j10 = 0;
                } else {
                    j10 = 0;
                    if (accountType7.intValue() != 7) {
                    }
                    if (okCardQuotaLog != null && (accountType6 = okCardQuotaLog.getAccountType()) != null) {
                        accountType6.intValue();
                    }
                    if (okCardQuotaLog != null || (remainingDays = okCardQuotaLog.getRemainingDays()) == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = remainingDays.intValue();
                    }
                    if (iIntValue > 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (okCardQuotaLog == null && (accountType5 = okCardQuotaLog.getAccountType()) != null && accountType5.intValue() == 7) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        if (okCardQuotaLog == null && (accountType4 = okCardQuotaLog.getAccountType()) != null && accountType4.intValue() == 9) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            if (okCardQuotaLog == null && (accountType3 = okCardQuotaLog.getAccountType()) != null && accountType3.intValue() == 6) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                f10.f38951a = okCardQuotaLog;
                                changeQuota8 = okCardQuotaLog.getChangeQuota();
                                if (changeQuota8 != null) {
                                    jLongValue2 = changeQuota8.longValue();
                                } else {
                                    jLongValue2 = j10;
                                }
                                z8 = jLongValue2 > j10;
                            } else {
                                if (okCardQuotaLog == null && (accountType2 = okCardQuotaLog.getAccountType()) != null && accountType2.intValue() == 13) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                if (z20) {
                                    f10.f38951a = okCardQuotaLog;
                                    changeQuota9 = okCardQuotaLog.getChangeQuota();
                                    if (changeQuota9 != null) {
                                        jLongValue3 = changeQuota9.longValue();
                                    } else {
                                        jLongValue3 = j10;
                                    }
                                    if (jLongValue3 > j10) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    changedInterestRatio2 = okCardQuotaLog.getChangedInterestRatio();
                                    if (changedInterestRatio2 != null) {
                                        dDoubleValue3 = changedInterestRatio2.doubleValue();
                                    } else {
                                        dDoubleValue3 = 0.0d;
                                    }
                                    z13 = dDoubleValue3 < 0.0d;
                                } else {
                                    if (okCardQuotaLog == null && (accountType = okCardQuotaLog.getAccountType()) != null && accountType.intValue() == 14) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    if (z21) {
                                        f10.f38951a = okCardQuotaLog;
                                        changeQuota10 = okCardQuotaLog.getChangeQuota();
                                        if (changeQuota10 != null) {
                                            jLongValue4 = changeQuota10.longValue();
                                        } else {
                                            jLongValue4 = j10;
                                        }
                                        if (jLongValue4 > j10) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        changedInterestRatio3 = okCardQuotaLog.getChangedInterestRatio();
                                        if (changedInterestRatio3 != null) {
                                            dDoubleValue4 = changedInterestRatio3.doubleValue();
                                        } else {
                                            dDoubleValue4 = 0.0d;
                                        }
                                        z15 = dDoubleValue4 < 0.0d;
                                    }
                                }
                            }
                        }
                    }
                    f10.f38951a = okCardQuotaLog;
                    changeQuota7 = okCardQuotaLog.getChangeQuota();
                    if (changeQuota7 != null) {
                        jLongValue = changeQuota7.longValue();
                    } else {
                        jLongValue = j10;
                    }
                    if (jLongValue > j10) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    changedInterestRatio = okCardQuotaLog.getChangedInterestRatio();
                    if (changedInterestRatio != null) {
                        dDoubleValue = changedInterestRatio.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    if (dDoubleValue < 0.0d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    changedServiceFeeRatio = okCardQuotaLog.getChangedServiceFeeRatio();
                    if (changedServiceFeeRatio != null) {
                        dDoubleValue2 = changedServiceFeeRatio.doubleValue();
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    if (dDoubleValue2 < 0.0d) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    saveChangeData(z3, z10, okCardQuotaLog);
                }
                if (okCardQuotaLog != null) {
                    okCardQuotaLog.getAccountType();
                }
                if (okCardQuotaLog != null) {
                    accountType6.intValue();
                }
                if (okCardQuotaLog != null) {
                    iIntValue = 0;
                } else {
                    iIntValue = 0;
                }
                if (iIntValue > 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (okCardQuotaLog == null) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (z17) {
                    if (okCardQuotaLog == null) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        if (okCardQuotaLog == null) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            f10.f38951a = okCardQuotaLog;
                            changeQuota8 = okCardQuotaLog.getChangeQuota();
                            if (changeQuota8 != null) {
                                jLongValue2 = changeQuota8.longValue();
                            } else {
                                jLongValue2 = j10;
                            }
                            if (jLongValue2 > j10) {
                            }
                        } else {
                            if (okCardQuotaLog == null) {
                                z20 = false;
                            } else {
                                z20 = false;
                            }
                            if (z20) {
                                f10.f38951a = okCardQuotaLog;
                                changeQuota9 = okCardQuotaLog.getChangeQuota();
                                if (changeQuota9 != null) {
                                    jLongValue3 = changeQuota9.longValue();
                                } else {
                                    jLongValue3 = j10;
                                }
                                if (jLongValue3 > j10) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                changedInterestRatio2 = okCardQuotaLog.getChangedInterestRatio();
                                if (changedInterestRatio2 != null) {
                                    dDoubleValue3 = changedInterestRatio2.doubleValue();
                                } else {
                                    dDoubleValue3 = 0.0d;
                                }
                                if (dDoubleValue3 < 0.0d) {
                                }
                            } else {
                                if (okCardQuotaLog == null) {
                                    z21 = false;
                                } else {
                                    z21 = false;
                                }
                                if (z21) {
                                    f10.f38951a = okCardQuotaLog;
                                    changeQuota10 = okCardQuotaLog.getChangeQuota();
                                    if (changeQuota10 != null) {
                                        jLongValue4 = changeQuota10.longValue();
                                    } else {
                                        jLongValue4 = j10;
                                    }
                                    if (jLongValue4 > j10) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    changedInterestRatio3 = okCardQuotaLog.getChangedInterestRatio();
                                    if (changedInterestRatio3 != null) {
                                        dDoubleValue4 = changedInterestRatio3.doubleValue();
                                    } else {
                                        dDoubleValue4 = 0.0d;
                                    }
                                    if (dDoubleValue4 < 0.0d) {
                                    }
                                }
                            }
                        }
                    }
                }
                f10.f38951a = okCardQuotaLog;
                changeQuota7 = okCardQuotaLog.getChangeQuota();
                if (changeQuota7 != null) {
                    jLongValue = changeQuota7.longValue();
                } else {
                    jLongValue = j10;
                }
                if (jLongValue > j10) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                changedInterestRatio = okCardQuotaLog.getChangedInterestRatio();
                if (changedInterestRatio != null) {
                    dDoubleValue = changedInterestRatio.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                if (dDoubleValue < 0.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                changedServiceFeeRatio = okCardQuotaLog.getChangedServiceFeeRatio();
                if (changedServiceFeeRatio != null) {
                    dDoubleValue2 = changedServiceFeeRatio.doubleValue();
                } else {
                    dDoubleValue2 = 0.0d;
                }
                if (dDoubleValue2 < 0.0d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                saveChangeData(z3, z10, okCardQuotaLog);
            }
            d2 = 0.0d;
            j6 = 0;
            Unit unit = Unit.f38893a;
        } else {
            d2 = 0.0d;
            j6 = 0;
            z3 = false;
            z8 = false;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
            z16 = false;
        }
        if (z3 && z8 && z10 && z11) {
            F6.d.h(TAG, 3, "case-------1-------");
            updateQuotaChangeView$showCommonContent(this, f10);
            return;
        }
        if (!z3 && z8 && z10 && z11) {
            F6.d.h(TAG, 3, "case-------2-------");
            updateQuotaChangeView$showInterestAndServiceChange(this, f10);
            return;
        }
        if (z3 && z10 && z11) {
            F6.d.h(TAG, 3, "case-------3-------");
            updateQuotaChangeView$showCommonContent(this, f10);
            return;
        }
        if (z3 && z10) {
            F6.d.h(TAG, 3, "case-------4-------");
            TextView textView = this.tvIncreaseDialogTitle;
            if (textView != null) {
                textView.setText(getContext().getString(p116hb.f.cs_cl_loan_amount_title));
                Unit unit2 = Unit.f38893a;
            }
            TextView textView2 = this.tvIncreaseDialogAmount;
            if (textView2 != null) {
                CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog2 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
                textView2.setText(amountFormat((okCardQuotaLog2 == null || (currQuota7 = okCardQuotaLog2.getCurrQuota()) == null) ? j6 : currQuota7.longValue()));
                Unit unit3 = Unit.f38893a;
            }
            View view = this.layoutIncreaseAmountTips;
            if (view != null) {
                p220oa.h.s(view, false);
                Unit unit4 = Unit.f38893a;
            }
            TextView textView3 = this.tvIncreaseAmountTips2;
            if (textView3 != null) {
                p220oa.h.s(textView3, true);
                Unit unit5 = Unit.f38893a;
            }
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog3 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            String strPercentage = percentage((okCardQuotaLog3 == null || (interestRatio3 = okCardQuotaLog3.getInterestRatio()) == null) ? d2 : Math.abs(interestRatio3.doubleValue()));
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog4 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            String strPercentage2 = percentage((okCardQuotaLog4 == null || (preInterestRatio3 = okCardQuotaLog4.getPreInterestRatio()) == null) ? d2 : Math.abs(preInterestRatio3.doubleValue()));
            TextView textView4 = this.tvIncreaseAmountTips2;
            if (textView4 != null) {
                SpanUtils foregroundColor = C0.G.i("⦁ Loan amount increased ").setForegroundColor(getContext().getColor(p116hb.a.text_color_black_immutable));
                CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog5 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
                C0.G.w(getContext(), L6.b.ppColorTextNormal, com.horcrux.svg.d0.i(getContext(), p116hb.a.text_color_black_immutable, foregroundColor.append(amountFormat((okCardQuotaLog5 == null || (changeQuota6 = okCardQuotaLog5.getChangeQuota()) == null) ? j6 : changeQuota6.longValue())).setForegroundColor(getContext().getColor(L6.b.ppColorWarning)).append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).append("⦁ Interest rate "), strPercentage).setForegroundColor(getContext().getColor(L6.b.ppColorWarning)).append(strPercentage2).setStrikethrough(), textView4);
                Unit unit6 = Unit.f38893a;
                return;
            }
            return;
        }
        if (z3 && z11) {
            F6.d.h(TAG, 3, "case-------5-------");
            TextView textView5 = this.tvIncreaseDialogTitle;
            if (textView5 != null) {
                textView5.setText(getContext().getString(p116hb.f.cs_cl_loan_amount_title));
                Unit unit7 = Unit.f38893a;
            }
            TextView textView6 = this.tvIncreaseDialogAmount;
            if (textView6 != null) {
                CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog6 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
                textView6.setText(amountFormat((okCardQuotaLog6 == null || (currQuota6 = okCardQuotaLog6.getCurrQuota()) == null) ? j6 : currQuota6.longValue()));
                Unit unit8 = Unit.f38893a;
            }
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog7 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            String strPercentage3 = percentage((okCardQuotaLog7 == null || (serviceFeeRatio2 = okCardQuotaLog7.getServiceFeeRatio()) == null) ? d2 : Math.abs(serviceFeeRatio2.doubleValue()));
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog8 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            String strPercentage4 = percentage((okCardQuotaLog8 == null || (preServiceFeeRatio2 = okCardQuotaLog8.getPreServiceFeeRatio()) == null) ? d2 : Math.abs(preServiceFeeRatio2.doubleValue()));
            View view2 = this.layoutIncreaseAmountTips;
            if (view2 != null) {
                p220oa.h.s(view2, false);
                Unit unit9 = Unit.f38893a;
            }
            TextView textView7 = this.tvIncreaseAmountTips2;
            if (textView7 != null) {
                p220oa.h.s(textView7, true);
                Unit unit10 = Unit.f38893a;
            }
            TextView textView8 = this.tvIncreaseAmountTips2;
            if (textView8 != null) {
                SpanUtils foregroundColor2 = C0.G.i("⦁ Loan amount increased ").setForegroundColor(getContext().getColor(p116hb.a.text_color_black_immutable));
                CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog9 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
                C0.G.w(getContext(), L6.b.ppColorTextNormal, com.horcrux.svg.d0.i(getContext(), p116hb.a.text_color_black_immutable, foregroundColor2.append(amountFormat((okCardQuotaLog9 == null || (changeQuota5 = okCardQuotaLog9.getChangeQuota()) == null) ? j6 : changeQuota5.longValue())).setForegroundColor(getContext().getColor(L6.b.ppColorWarning)).append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).append("⦁ Service fees rate "), strPercentage3).setForegroundColor(getContext().getColor(L6.b.ppColorWarning)).append(strPercentage4).setStrikethrough(), textView8);
                Unit unit11 = Unit.f38893a;
                return;
            }
            return;
        }
        if (z10 && z11) {
            F6.d.h(TAG, 3, "case-------6-------");
            updateQuotaChangeView$showInterestAndServiceChange(this, f10);
            return;
        }
        if (z3) {
            F6.d.h(TAG, 3, "case-------7-------");
            TextView textView9 = this.tvIncreaseDialogTitle;
            if (textView9 != null) {
                textView9.setText(getContext().getString(p116hb.f.cs_cl_loan_amount_title));
                Unit unit12 = Unit.f38893a;
            }
            TextView textView10 = this.tvIncreaseDialogAmount;
            if (textView10 != null) {
                CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog10 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
                textView10.setText(amountFormat((okCardQuotaLog10 == null || (currQuota5 = okCardQuotaLog10.getCurrQuota()) == null) ? j6 : currQuota5.longValue()));
                Unit unit13 = Unit.f38893a;
            }
            TextView textView11 = this.tvIncreaseAmountTips;
            if (textView11 != null) {
                SpanUtils foregroundColor3 = new SpanUtils().append(z16 ? "Including a temporary loan of " : "Loan amount has increased ").setForegroundColor(getContext().getColor(p116hb.a.text_color_black_immutable));
                CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog11 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
                textView11.setText(foregroundColor3.append(amountFormat((okCardQuotaLog11 == null || (changeQuota4 = okCardQuotaLog11.getChangeQuota()) == null) ? j6 : changeQuota4.longValue())).setForegroundColor(getContext().getColor(L6.b.ppColorWarning)).appendImage(p116hb.b.cs_cl_amount_increase_arrow_up_big).create());
                Unit unit14 = Unit.f38893a;
                return;
            }
            return;
        }
        if (z8) {
            F6.d.h(TAG, 3, "case-------8-------");
            this.jumpCashLoanBorrow = Boolean.FALSE;
            TextView textView12 = this.tvIncreaseDialogTitle;
            if (textView12 != null) {
                textView12.setText(getContext().getString(p116hb.f.cs_cl_flexi_amount_title));
                Unit unit15 = Unit.f38893a;
            }
            TextView textView13 = this.tvIncreaseAmountBtn;
            if (textView13 != null) {
                textView13.setText(getContext().getString(p025ba.k.core_ok));
                Unit unit16 = Unit.f38893a;
            }
            TextView textView14 = this.tvIncreaseDialogAmount;
            if (textView14 != null) {
                CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog12 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
                textView14.setText(amountFormat((okCardQuotaLog12 == null || (currQuota4 = okCardQuotaLog12.getCurrQuota()) == null) ? j6 : currQuota4.longValue()));
                Unit unit17 = Unit.f38893a;
            }
            TextView textView15 = this.tvIncreaseAmountTips;
            if (textView15 != null) {
                SpanUtils foregroundColor4 = new SpanUtils().append(z16 ? "Including a temporary loan of " : "Flexi limit has increased ").setForegroundColor(getContext().getColor(p116hb.a.text_color_black_immutable));
                CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog13 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
                textView15.setText(foregroundColor4.append(amountFormat((okCardQuotaLog13 == null || (changeQuota3 = okCardQuotaLog13.getChangeQuota()) == null) ? j6 : changeQuota3.longValue())).setForegroundColor(getContext().getColor(L6.b.ppColorWarning)).appendImage(p116hb.b.cs_cl_amount_increase_arrow_up_big).create());
                Unit unit18 = Unit.f38893a;
                return;
            }
            return;
        }
        if (z10) {
            F6.d.h(TAG, 3, "case-------9-------");
            TextView textView16 = this.tvIncreaseDialogTitle;
            if (textView16 != null) {
                textView16.setText(getContext().getString(p116hb.f.cs_cl_loan_interest_rate));
                Unit unit19 = Unit.f38893a;
            }
            View view3 = this.layoutIncreaseAmountTips;
            if (view3 != null) {
                p220oa.h.s(view3, true);
                Unit unit20 = Unit.f38893a;
            }
            TextView textView17 = this.tvIncreaseAmountTips2;
            if (textView17 != null) {
                p220oa.h.s(textView17, false);
                Unit unit21 = Unit.f38893a;
            }
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog14 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            String strPercentage5 = percentage((okCardQuotaLog14 == null || (interestRatio2 = okCardQuotaLog14.getInterestRatio()) == null) ? d2 : Math.abs(interestRatio2.doubleValue()));
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog15 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            String strPercentage6 = percentage((okCardQuotaLog15 == null || (preInterestRatio2 = okCardQuotaLog15.getPreInterestRatio()) == null) ? d2 : Math.abs(preInterestRatio2.doubleValue()));
            TextView textView18 = this.tvIncreaseDialogAmount;
            if (textView18 != null) {
                textView18.setText(C0.G.i(strPercentage5).setForegroundColor(getContext().getColor(p116hb.a.text_color_black_immutable)).append(" ").append(strPercentage6).setStrikethrough().setForegroundColor(getContext().getColor(L6.b.ppColorTextNormal)).setFontSize(14, true).create());
                Unit unit22 = Unit.f38893a;
            }
            TextView textView19 = this.tvIncreaseAmountTips;
            if (textView19 != null) {
                SpanUtils spanUtilsI = C0.G.i("Borrow ");
                CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog16 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
                SpanUtils foregroundColor5 = spanUtilsI.append(amountFormat((okCardQuotaLog16 == null || (currQuota3 = okCardQuotaLog16.getCurrQuota()) == null) ? j6 : currQuota3.longValue())).append(", save interest ").setForegroundColor(getContext().getColor(p116hb.a.text_color_black_immutable));
                CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog17 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
                C0.G.w(getContext(), p116hb.a.text_color_black_immutable, com.horcrux.svg.d0.i(getContext(), L6.b.ppColorWarning, foregroundColor5.append(amountFormat((okCardQuotaLog17 == null || (exceptSaveAmount = okCardQuotaLog17.getExceptSaveAmount()) == null) ? j6 : exceptSaveAmount.longValue())), " per day"), textView19);
                Unit unit23 = Unit.f38893a;
                return;
            }
            return;
        }
        if ((z12 && z13) || (z14 && z15)) {
            this.jumpCashLoanBorrow = Boolean.FALSE;
            TextView textView20 = this.tvIncreaseDialogTitle;
            if (textView20 != null) {
                textView20.setText(getContext().getString(p116hb.f.cs_cl_credit_amount));
                Unit unit24 = Unit.f38893a;
            }
            TextView textView21 = this.tvIncreaseDialogAmount;
            if (textView21 != null) {
                CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog18 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
                textView21.setText(amountFormat((okCardQuotaLog18 == null || (currQuota2 = okCardQuotaLog18.getCurrQuota()) == null) ? j6 : currQuota2.longValue()));
                Unit unit25 = Unit.f38893a;
            }
            View view4 = this.layoutIncreaseAmountTips;
            if (view4 != null) {
                p220oa.h.s(view4, false);
                Unit unit26 = Unit.f38893a;
            }
            TextView textView22 = this.tvIncreaseAmountTips2;
            if (textView22 != null) {
                p220oa.h.s(textView22, true);
                Unit unit27 = Unit.f38893a;
            }
            TextView textView23 = this.tvIncreaseAmountTips2;
            if (textView23 != null) {
                SpanUtils foregroundColor6 = C0.G.i("⦁ Credit amount has increased ").setForegroundColor(getContext().getColor(p116hb.a.text_color_black_immutable));
                CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog19 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
                textView23.setText(foregroundColor6.append(amountFormat((okCardQuotaLog19 == null || (changeQuota2 = okCardQuotaLog19.getChangeQuota()) == null) ? j6 : changeQuota2.longValue())).setForegroundColor(getContext().getColor(L6.b.ppColorWarning)).appendImage(p116hb.b.cs_cl_amount_increase_arrow_up_big).create());
                Unit unit28 = Unit.f38893a;
            }
            TextView textView24 = this.tvIncreaseAmountBtn;
            if (textView24 != null) {
                textView24.setText(getContext().getString(p116hb.f.cs_cl_amount_increase_dialog_check));
                Unit unit29 = Unit.f38893a;
                return;
            }
            return;
        }
        if (z13 || z15) {
            this.jumpCashLoanBorrow = Boolean.FALSE;
            F6.d.h(TAG, 3, "case-------100-------");
            TextView textView25 = this.tvIncreaseDialogTitle;
            if (textView25 != null) {
                textView25.setText(getContext().getString(p116hb.f.cs_cl_interest_rate));
                Unit unit30 = Unit.f38893a;
            }
            View view5 = this.layoutIncreaseAmountTips;
            if (view5 != null) {
                p220oa.h.s(view5, true);
                Unit unit31 = Unit.f38893a;
            }
            TextView textView26 = this.tvIncreaseAmountTips2;
            if (textView26 != null) {
                p220oa.h.s(textView26, false);
                Unit unit32 = Unit.f38893a;
            }
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog20 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            String strPercentage7 = percentage((okCardQuotaLog20 == null || (interestRatio = okCardQuotaLog20.getInterestRatio()) == null) ? d2 : Math.abs(interestRatio.doubleValue()));
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog21 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            String strPercentage8 = percentage((okCardQuotaLog21 == null || (preInterestRatio = okCardQuotaLog21.getPreInterestRatio()) == null) ? d2 : Math.abs(preInterestRatio.doubleValue()));
            TextView textView27 = this.tvIncreaseDialogAmount;
            if (textView27 != null) {
                textView27.setText(C0.G.i(strPercentage7).setForegroundColor(getContext().getColor(p116hb.a.text_color_black_immutable)).append(" ").append(strPercentage8).setStrikethrough().setForegroundColor(getContext().getColor(L6.b.ppColorTextNormal)).setFontSize(14, true).create());
                Unit unit33 = Unit.f38893a;
            }
            TextView textView28 = this.tvIncreaseAmountBtn;
            if (textView28 != null) {
                textView28.setText(getContext().getString(p116hb.f.cs_cl_amount_increase_dialog_check));
                Unit unit34 = Unit.f38893a;
                return;
            }
            return;
        }
        if (z11) {
            F6.d.h(TAG, 3, "case-------10-------");
            TextView textView29 = this.tvIncreaseDialogTitle;
            if (textView29 != null) {
                textView29.setText(getContext().getString(p116hb.f.cs_cl_service_fee_rate));
                Unit unit35 = Unit.f38893a;
            }
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog22 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            String strPercentage9 = percentage((okCardQuotaLog22 == null || (serviceFeeRatio = okCardQuotaLog22.getServiceFeeRatio()) == null) ? d2 : Math.abs(serviceFeeRatio.doubleValue()));
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog23 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            String strPercentage10 = percentage((okCardQuotaLog23 == null || (preServiceFeeRatio = okCardQuotaLog23.getPreServiceFeeRatio()) == null) ? d2 : Math.abs(preServiceFeeRatio.doubleValue()));
            TextView textView30 = this.tvIncreaseDialogAmount;
            if (textView30 != null) {
                textView30.setText(new SpanUtils().append(strPercentage9).append(" ").append(strPercentage10).setStrikethrough().setForegroundColor(getContext().getColor(L6.b.ppColorTextNormal)).setFontSize(14, true).create());
                Unit unit36 = Unit.f38893a;
            }
            TextView textView31 = this.tvIncreaseAmountTips;
            if (textView31 != null) {
                SpanUtils foregroundColor7 = C0.G.i("Borrow ").append(amountFormat(1000000L)).append(", save service fee ").setForegroundColor(getContext().getColor(p116hb.a.text_color_black_immutable));
                CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog24 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
                C0.G.w(getContext(), L6.b.ppColorWarning, foregroundColor7.append(amountFormat((okCardQuotaLog24 == null || (exceptSaveServiceFeeAmount = okCardQuotaLog24.getExceptSaveServiceFeeAmount()) == null) ? j6 : exceptSaveServiceFeeAmount.longValue())), textView31);
                Unit unit37 = Unit.f38893a;
                return;
            }
            return;
        }
        if (!z12 && !z14) {
            F6.d.h(TAG, 3, "case-------0-------");
            dismiss();
            return;
        }
        this.jumpCashLoanBorrow = Boolean.FALSE;
        F6.d.h(TAG, 3, "case-------4-------");
        TextView textView32 = this.tvIncreaseDialogTitle;
        if (textView32 != null) {
            textView32.setText(getContext().getString(p116hb.f.cs_cl_loan_amount_title));
            Unit unit38 = Unit.f38893a;
        }
        TextView textView33 = this.tvIncreaseDialogAmount;
        if (textView33 != null) {
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog25 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            textView33.setText(amountFormat((okCardQuotaLog25 == null || (currQuota = okCardQuotaLog25.getCurrQuota()) == null) ? j6 : currQuota.longValue()));
            Unit unit39 = Unit.f38893a;
        }
        View view6 = this.layoutIncreaseAmountTips;
        if (view6 != null) {
            p220oa.h.s(view6, true);
            Unit unit40 = Unit.f38893a;
        }
        TextView textView34 = this.tvIncreaseAmountTips2;
        if (textView34 != null) {
            p220oa.h.s(textView34, false);
            Unit unit41 = Unit.f38893a;
        }
        TextView textView35 = this.tvIncreaseAmountTips;
        if (textView35 != null) {
            SpanUtils foregroundColor8 = C0.G.i("Loan amount has increased ").setForegroundColor(getContext().getColor(p116hb.a.text_color_black_immutable));
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog26 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            textView35.setText(foregroundColor8.append(amountFormat((okCardQuotaLog26 == null || (changeQuota = okCardQuotaLog26.getChangeQuota()) == null) ? j6 : changeQuota.longValue())).setForegroundColor(getContext().getColor(L6.b.ppColorWarning)).appendImage(p116hb.b.cs_cl_amount_increase_arrow_up_big).create());
            Unit unit42 = Unit.f38893a;
        }
        TextView textView36 = this.tvIncreaseAmountBtn;
        if (textView36 != null) {
            if (Intrinsics.c(this.loanProduct, "PALMPAY_BUSINESS_LOAN")) {
                QueryLoanDialogPopUpsBean.BusinessInfo businessInfo = this.businessInfo;
                string = null;
                if (TextUtils.isEmpty(businessInfo != null ? businessInfo.getBtnText() : null)) {
                    string = getContext().getString(p116hb.f.cs_cl_amount_increase_dialog_i_know);
                } else {
                    QueryLoanDialogPopUpsBean.BusinessInfo businessInfo2 = this.businessInfo;
                    if (businessInfo2 != null) {
                        string = businessInfo2.getBtnText();
                    }
                }
            } else {
                string = getContext().getString(p116hb.f.cs_cl_amount_increase_dialog_check);
            }
            textView36.setText(string);
            Unit unit43 = Unit.f38893a;
        }
    }

    private static final void updateQuotaChangeView$showCommonContent(CLIncreaseAmountDialog cLIncreaseAmountDialog, kotlin.jvm.internal.F f10) {
        Long changeQuota;
        Double preInterestRatio;
        Double interestRatio;
        Long currQuota;
        TextView textView = cLIncreaseAmountDialog.tvIncreaseDialogTitle;
        if (textView != null) {
            textView.setText(cLIncreaseAmountDialog.getContext().getString(p116hb.f.cs_cl_loan_amount_title));
        }
        TextView textView2 = cLIncreaseAmountDialog.tvIncreaseDialogAmount;
        long jLongValue = 0;
        if (textView2 != null) {
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            textView2.setText(cLIncreaseAmountDialog.amountFormat((okCardQuotaLog == null || (currQuota = okCardQuotaLog.getCurrQuota()) == null) ? 0L : currQuota.longValue()));
        }
        View view = cLIncreaseAmountDialog.layoutIncreaseAmountTips;
        if (view != null) {
            p220oa.h.s(view, false);
        }
        TextView textView3 = cLIncreaseAmountDialog.tvIncreaseAmountTips2;
        if (textView3 != null) {
            p220oa.h.s(textView3, true);
        }
        CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog2 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
        double dAbs = 0.0d;
        String strPercentage = cLIncreaseAmountDialog.percentage((okCardQuotaLog2 == null || (interestRatio = okCardQuotaLog2.getInterestRatio()) == null) ? 0.0d : Math.abs(interestRatio.doubleValue()));
        CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog3 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
        if (okCardQuotaLog3 != null && (preInterestRatio = okCardQuotaLog3.getPreInterestRatio()) != null) {
            dAbs = Math.abs(preInterestRatio.doubleValue());
        }
        String strPercentage2 = cLIncreaseAmountDialog.percentage(dAbs);
        TextView textView4 = cLIncreaseAmountDialog.tvIncreaseAmountTips2;
        if (textView4 != null) {
            SpanUtils foregroundColor = C0.G.i("⦁ Loan amount increased ").setForegroundColor(cLIncreaseAmountDialog.getContext().getColor(p116hb.a.text_color_black_immutable));
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog4 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            if (okCardQuotaLog4 != null && (changeQuota = okCardQuotaLog4.getChangeQuota()) != null) {
                jLongValue = changeQuota.longValue();
            }
            C0.G.w(cLIncreaseAmountDialog.getContext(), L6.b.ppColorTextNormal, com.horcrux.svg.d0.i(cLIncreaseAmountDialog.getContext(), p116hb.a.text_color_black_immutable, foregroundColor.append(cLIncreaseAmountDialog.amountFormat(jLongValue)).setForegroundColor(cLIncreaseAmountDialog.getContext().getColor(L6.b.ppColorWarning)).append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).append("⦁ Interest rate "), strPercentage).setForegroundColor(cLIncreaseAmountDialog.getContext().getColor(L6.b.ppColorWarning)).append(strPercentage2).setStrikethrough(), textView4);
        }
    }

    private static final void updateQuotaChangeView$showInterestAndServiceChange(CLIncreaseAmountDialog cLIncreaseAmountDialog, kotlin.jvm.internal.F f10) {
        Long exceptSaveAmount;
        Long currQuota;
        Double preInterestRatio;
        Double interestRatio;
        TextView textView = cLIncreaseAmountDialog.tvIncreaseDialogTitle;
        if (textView != null) {
            textView.setText(cLIncreaseAmountDialog.getContext().getString(p116hb.f.cs_cl_loan_interest_rate));
        }
        View view = cLIncreaseAmountDialog.layoutIncreaseAmountTips;
        if (view != null) {
            p220oa.h.s(view, true);
        }
        TextView textView2 = cLIncreaseAmountDialog.tvIncreaseAmountTips2;
        if (textView2 != null) {
            p220oa.h.s(textView2, false);
        }
        CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
        double dAbs = 0.0d;
        String strPercentage = cLIncreaseAmountDialog.percentage((okCardQuotaLog == null || (interestRatio = okCardQuotaLog.getInterestRatio()) == null) ? 0.0d : Math.abs(interestRatio.doubleValue()));
        CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog2 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
        if (okCardQuotaLog2 != null && (preInterestRatio = okCardQuotaLog2.getPreInterestRatio()) != null) {
            dAbs = Math.abs(preInterestRatio.doubleValue());
        }
        String strPercentage2 = cLIncreaseAmountDialog.percentage(dAbs);
        TextView textView3 = cLIncreaseAmountDialog.tvIncreaseDialogAmount;
        if (textView3 != null) {
            textView3.setText(C0.G.i(strPercentage).setForegroundColor(cLIncreaseAmountDialog.getContext().getColor(p116hb.a.text_color_black_immutable)).append(" ").append(strPercentage2).setStrikethrough().setForegroundColor(cLIncreaseAmountDialog.getContext().getColor(L6.b.ppColorTextNormal)).setFontSize(14, true).create());
        }
        TextView textView4 = cLIncreaseAmountDialog.tvIncreaseAmountTips;
        if (textView4 != null) {
            SpanUtils spanUtilsI = C0.G.i("Borrow ");
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog3 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            long jLongValue = 0;
            SpanUtils foregroundColor = spanUtilsI.append(cLIncreaseAmountDialog.amountFormat((okCardQuotaLog3 == null || (currQuota = okCardQuotaLog3.getCurrQuota()) == null) ? 0L : currQuota.longValue())).append(", save interest ").setForegroundColor(cLIncreaseAmountDialog.getContext().getColor(p116hb.a.text_color_black_immutable));
            CreditIncreaseInfo.Data.OkCardQuotaLog okCardQuotaLog4 = (CreditIncreaseInfo.Data.OkCardQuotaLog) f10.f38951a;
            if (okCardQuotaLog4 != null && (exceptSaveAmount = okCardQuotaLog4.getExceptSaveAmount()) != null) {
                jLongValue = exceptSaveAmount.longValue();
            }
            C0.G.w(cLIncreaseAmountDialog.getContext(), p116hb.a.text_color_black_immutable, com.horcrux.svg.d0.i(cLIncreaseAmountDialog.getContext(), L6.b.ppColorWarning, foregroundColor.append(cLIncreaseAmountDialog.amountFormat(jLongValue)), " per day"), textView4);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        String str;
        String str2 = this.dialogType;
        String str3 = this.loanProduct;
        QueryLoanDialogPopUpsBean.BusinessInfo businessInfo = this.businessInfo;
        StringBuilder sbF = androidx.camera.camera2.internal.F.f("dialogType=", str2, ", loanProduct=", str3, ", businessInfo=");
        sbF.append(businessInfo);
        F6.d.h(TAG, 3, sbF.toString());
        this.ivIncreaseAmountClose = (ImageView) findViewById(p116hb.c.ivIncreaseAmountClose);
        this.tvIncreaseAmountBtn = (TextView) findViewById(p116hb.c.tvIncreaseAmountBtn);
        this.tvIncreaseAmountTips2 = (TextView) findViewById(p116hb.c.tvIncreaseAmountTips2);
        this.tvIncreaseAmountTips = (TextView) findViewById(p116hb.c.tvIncreaseAmountTips);
        this.layoutIncreaseAmountTips = findViewById(p116hb.c.layoutIncreaseAmountTips);
        this.tvIncreaseDialogAmount = (TextView) findViewById(p116hb.c.tvIncreaseDialogAmount);
        this.tvIncreaseDialogTitle = (TextView) findViewById(p116hb.c.tvIncreaseDialogTitle);
        this.ivIncreaseDialogBg = (ImageView) findViewById(p116hb.c.ivIncreaseDialogBg);
        if (Intrinsics.c(this.loanProduct, "PALMPAY_CARD")) {
            str = URL_DIALOG_CARD_BG;
        } else {
            str = Intrinsics.c(this.loanProduct, "PALMPAY_BUSINESS_LOAN") ? URL_DIALOG_BL_BG : URL_DIALOG_BG;
        }
        com.bumptech.glide.m mVar = (com.bumptech.glide.m) com.bumptech.glide.b.e(getContext()).load(str).g(com.bumptech.glide.load.engine.k.f20703b);
        ImageView imageView = this.ivIncreaseDialogBg;
        Intrinsics.e(imageView);
        mVar.S(imageView);
        ImageView imageView2 = this.ivIncreaseAmountClose;
        if (imageView2 != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLIncreaseAmountDialog f30218b;

                {
                    this.f30218b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30218b.dismiss();
                            break;
                        default:
                            CLIncreaseAmountDialog.initViews$lambda$3(this.f30218b, view);
                            break;
                    }
                }
            }, imageView2);
        }
        TextView textView = this.tvIncreaseAmountBtn;
        if (textView != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLIncreaseAmountDialog f30218b;

                {
                    this.f30218b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30218b.dismiss();
                            break;
                        default:
                            CLIncreaseAmountDialog.initViews$lambda$3(this.f30218b, view);
                            break;
                    }
                }
            }, textView);
        }
        if (Intrinsics.c(this.dialogType, "borrowCycleChange")) {
            updateCycleChangeView();
        } else {
            updateQuotaChangeView();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLIncreaseAmountDialog(@NotNull Context context, @NotNull String dialogType, @Nullable String str, @Nullable QueryLoanDialogPopUpsBean.BusinessInfo businessInfo, @Nullable List<CreditIncreaseInfo.Data.OkCardQuotaLog> list) {
        super(context, p116hb.d.cs_cl_dialog_increase_amount);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dialogType, "dialogType");
        this.dialogType = dialogType;
        this.loanProduct = str;
        this.businessInfo = businessInfo;
        this.okCardQuotaLogList = list;
        this.jumpCashLoanBorrow = Boolean.TRUE;
    }
}
