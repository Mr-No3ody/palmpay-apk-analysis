package com.transsnet.palmpay.credit.bean.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.palmpay.lib.webview.container.fast.WebViewCache;
import com.transsnet.palmpay.credit.bean.MultiLoanInfo;
import com.transsnet.palmpay.credit.bean.OutstandingAccount;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b`\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0016\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001B·\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010+\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010/\u0012\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010%¢\u0006\u0004\b1\u00102J\u0007\u0010\u0098\u0001\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00104\"\u0004\b8\u00106R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00104\"\u0004\b>\u00106R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00104\"\u0004\b@\u00106R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00104\"\u0004\bD\u00106R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00104\"\u0004\bF\u00106R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u00104\"\u0004\bT\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u00104\"\u0004\b^\u00106R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u00104\"\u0004\bd\u00106R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u00104\"\u0004\bj\u00106R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u00104\"\u0004\bp\u00106R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001a\u0010#\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u00104\"\u0004\bv\u00106R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001a\u0010'\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u00104\"\u0004\b|\u00106R\u001a\u0010(\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u00104\"\u0004\b~\u00106R\u001b\u0010)\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u00104\"\u0005\b\u0080\u0001\u00106R \u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010,\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u00104\"\u0005\b\u0086\u0001\u00106R\u001c\u0010-\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u00104\"\u0005\b\u0088\u0001\u00106R \u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R$\u00100\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010%X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010x\"\u0005\b\u008e\u0001\u0010zR\"\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001d\u0010\u0095\u0001\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u00104\"\u0005\b\u0097\u0001\u00106¨\u0006¤\u0001"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean;", "", "flexiOpen", "", "cashOpen", "quotaChange", "borrowCycleChange", "unloanInactiveUserSendCoupon", "hasAvailableCoupon", "flexiUnFrozen", "cashUnFrozen", "installmentLoanOpen", "businessInfo", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$BusinessInfo;", "installmentLoanInfo", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$AdjustQuotaBusinessResDto;", "repaymentInfo", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$RepaymentInfo;", "migrateAppSendCoupon", "migrateAppInfo", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateAppInfo;", "loanProduct", "", "calcReturnSendCoupon", "couponDto", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CalcReturnSendCouponDTO;", "cashMarketingNotifyOnlyA", "cashMarketingNotifyOnlyAData", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyAData;", "cashMarketingNotifyOnlyB", "cashMarketingNotifyOnlyBData", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyBData;", "cashMarketingRepayCoupon", "cashMarketingRepayCouponData", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingRepayCouponData;", "multiCouponSendSuccess", "multiCouponDataList", "", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MultiCouponData;", "prejyMigrateLoanTermExtension", "prejyMigrateBorrowCoupon", "prejyMigrateRaiseAmount", "migrateRewardInfoDto", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateRewardInfo;", "mobileInstallmentOpen", "installmentCreditIncreaseWhitelistHit", "phoneModelDto", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$PhoneModelDto;", "mobileInstallmentPopupBrands", "<init>", "(ZZZZZZZZZLcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$BusinessInfo;Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$AdjustQuotaBusinessResDto;Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$RepaymentInfo;ZLcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateAppInfo;Ljava/lang/String;ZLcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CalcReturnSendCouponDTO;ZLcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyAData;ZLcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyBData;ZLcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingRepayCouponData;ZLjava/util/List;ZZZLcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateRewardInfo;ZZLcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$PhoneModelDto;Ljava/util/List;)V", "getFlexiOpen", "()Z", "setFlexiOpen", "(Z)V", "getCashOpen", "setCashOpen", "getQuotaChange", "setQuotaChange", "getBorrowCycleChange", "setBorrowCycleChange", "getUnloanInactiveUserSendCoupon", "setUnloanInactiveUserSendCoupon", "getHasAvailableCoupon", "setHasAvailableCoupon", "getFlexiUnFrozen", "setFlexiUnFrozen", "getCashUnFrozen", "setCashUnFrozen", "getInstallmentLoanOpen", "setInstallmentLoanOpen", "getBusinessInfo", "()Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$BusinessInfo;", "setBusinessInfo", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$BusinessInfo;)V", "getInstallmentLoanInfo", "()Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$AdjustQuotaBusinessResDto;", "setInstallmentLoanInfo", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$AdjustQuotaBusinessResDto;)V", "getRepaymentInfo", "()Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$RepaymentInfo;", "setRepaymentInfo", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$RepaymentInfo;)V", "getMigrateAppSendCoupon", "setMigrateAppSendCoupon", "getMigrateAppInfo", "()Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateAppInfo;", "setMigrateAppInfo", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateAppInfo;)V", "getLoanProduct", "()Ljava/lang/String;", "setLoanProduct", "(Ljava/lang/String;)V", "getCalcReturnSendCoupon", "setCalcReturnSendCoupon", "getCouponDto", "()Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CalcReturnSendCouponDTO;", "setCouponDto", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CalcReturnSendCouponDTO;)V", "getCashMarketingNotifyOnlyA", "setCashMarketingNotifyOnlyA", "getCashMarketingNotifyOnlyAData", "()Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyAData;", "setCashMarketingNotifyOnlyAData", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyAData;)V", "getCashMarketingNotifyOnlyB", "setCashMarketingNotifyOnlyB", "getCashMarketingNotifyOnlyBData", "()Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyBData;", "setCashMarketingNotifyOnlyBData", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyBData;)V", "getCashMarketingRepayCoupon", "setCashMarketingRepayCoupon", "getCashMarketingRepayCouponData", "()Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingRepayCouponData;", "setCashMarketingRepayCouponData", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingRepayCouponData;)V", "getMultiCouponSendSuccess", "setMultiCouponSendSuccess", "getMultiCouponDataList", "()Ljava/util/List;", "setMultiCouponDataList", "(Ljava/util/List;)V", "getPrejyMigrateLoanTermExtension", "setPrejyMigrateLoanTermExtension", "getPrejyMigrateBorrowCoupon", "setPrejyMigrateBorrowCoupon", "getPrejyMigrateRaiseAmount", "setPrejyMigrateRaiseAmount", "getMigrateRewardInfoDto", "()Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateRewardInfo;", "setMigrateRewardInfoDto", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateRewardInfo;)V", "getMobileInstallmentOpen", "setMobileInstallmentOpen", "getInstallmentCreditIncreaseWhitelistHit", "setInstallmentCreditIncreaseWhitelistHit", "getPhoneModelDto", "()Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$PhoneModelDto;", "setPhoneModelDto", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$PhoneModelDto;)V", "getMobileInstallmentPopupBrands", "setMobileInstallmentPopupBrands", "multiLoanInfo", "Lcom/transsnet/palmpay/credit/bean/MultiLoanInfo;", "getMultiLoanInfo", "()Lcom/transsnet/palmpay/credit/bean/MultiLoanInfo;", "setMultiLoanInfo", "(Lcom/transsnet/palmpay/credit/bean/MultiLoanInfo;)V", "needFaceVerify", "getNeedFaceVerify", "setNeedFaceVerify", "hasRepaymentDialog", "BusinessInfo", "MigrateRewardInfo", "RepaymentInfo", "PhoneModelDto", "AdjustQuotaBusinessResDto", "MigrateAppInfo", "CalcReturnSendCouponDTO", "CashMarketingNotifyOnlyAData", "CashMarketingNotifyOnlyBData", "CashMarketingRepayCouponData", "MultiCouponData", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryLoanDialogPopUpsBean {
    private boolean borrowCycleChange;

    @Nullable
    private BusinessInfo businessInfo;
    private boolean calcReturnSendCoupon;
    private boolean cashMarketingNotifyOnlyA;

    @Nullable
    private CashMarketingNotifyOnlyAData cashMarketingNotifyOnlyAData;
    private boolean cashMarketingNotifyOnlyB;

    @Nullable
    private CashMarketingNotifyOnlyBData cashMarketingNotifyOnlyBData;
    private boolean cashMarketingRepayCoupon;

    @Nullable
    private CashMarketingRepayCouponData cashMarketingRepayCouponData;
    private boolean cashOpen;
    private boolean cashUnFrozen;

    @Nullable
    private CalcReturnSendCouponDTO couponDto;
    private boolean flexiOpen;
    private boolean flexiUnFrozen;
    private boolean hasAvailableCoupon;
    private boolean installmentCreditIncreaseWhitelistHit;

    @Nullable
    private AdjustQuotaBusinessResDto installmentLoanInfo;
    private boolean installmentLoanOpen;

    @Nullable
    private String loanProduct;

    @Nullable
    private MigrateAppInfo migrateAppInfo;
    private boolean migrateAppSendCoupon;

    @Nullable
    private MigrateRewardInfo migrateRewardInfoDto;
    private boolean mobileInstallmentOpen;

    @Nullable
    private List<String> mobileInstallmentPopupBrands;

    @Nullable
    private List<MultiCouponData> multiCouponDataList;
    private boolean multiCouponSendSuccess;

    @Nullable
    private MultiLoanInfo multiLoanInfo;
    private boolean needFaceVerify;

    @Nullable
    private PhoneModelDto phoneModelDto;
    private boolean prejyMigrateBorrowCoupon;
    private boolean prejyMigrateLoanTermExtension;
    private boolean prejyMigrateRaiseAmount;
    private boolean quotaChange;

    @Nullable
    private RepaymentInfo repaymentInfo;
    private boolean unloanInactiveUserSendCoupon;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b,\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001aR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u0010\u001aR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010\u001aR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b:\u0010*\"\u0004\b;\u0010,R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$AdjustQuotaBusinessResDto;", "", "creditQuota", "", "termSpanUnit", "", "termSpan", "", FirebaseAnalytics.Param.TERM, "maxLoanDays", "interestRatio", "", "loanAmount", "dailyInterest", "trafficChannel", "ifJointDebit", "cashCreditLimit", "cashExampleAmount", "cashMinInterestRate", "checkSuccessFlag", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Z)V", "getCreditQuota", "()Ljava/lang/Long;", "setCreditQuota", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTermSpanUnit", "()Ljava/lang/String;", "setTermSpanUnit", "(Ljava/lang/String;)V", "getTermSpan", "()Ljava/lang/Integer;", "setTermSpan", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTerm", "setTerm", "getMaxLoanDays", "setMaxLoanDays", "getInterestRatio", "()Ljava/lang/Double;", "setInterestRatio", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLoanAmount", "setLoanAmount", "getDailyInterest", "setDailyInterest", "getTrafficChannel", "setTrafficChannel", "getIfJointDebit", "setIfJointDebit", "getCashCreditLimit", "setCashCreditLimit", "getCashExampleAmount", "setCashExampleAmount", "getCashMinInterestRate", "setCashMinInterestRate", "getCheckSuccessFlag", "()Z", "setCheckSuccessFlag", "(Z)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdjustQuotaBusinessResDto {

        @Nullable
        private Long cashCreditLimit;

        @Nullable
        private Long cashExampleAmount;

        @Nullable
        private Double cashMinInterestRate;
        private boolean checkSuccessFlag;

        @Nullable
        private Long creditQuota;

        @Nullable
        private Long dailyInterest;

        @Nullable
        private Integer ifJointDebit;

        @Nullable
        private Double interestRatio;

        @Nullable
        private Long loanAmount;

        @Nullable
        private Integer maxLoanDays;

        @Nullable
        private Integer term;

        @Nullable
        private Integer termSpan;

        @Nullable
        private String termSpanUnit;

        @Nullable
        private String trafficChannel;

        public AdjustQuotaBusinessResDto(@Nullable Long l5, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Double d2, @Nullable Long l6, @Nullable Long l8, @Nullable String str2, @Nullable Integer num4, @Nullable Long l10, @Nullable Long l11, @Nullable Double d10, boolean z3) {
            this.creditQuota = l5;
            this.termSpanUnit = str;
            this.termSpan = num;
            this.term = num2;
            this.maxLoanDays = num3;
            this.interestRatio = d2;
            this.loanAmount = l6;
            this.dailyInterest = l8;
            this.trafficChannel = str2;
            this.ifJointDebit = num4;
            this.cashCreditLimit = l10;
            this.cashExampleAmount = l11;
            this.cashMinInterestRate = d10;
            this.checkSuccessFlag = z3;
        }

        @Nullable
        public final Long getCashCreditLimit() {
            return this.cashCreditLimit;
        }

        @Nullable
        public final Long getCashExampleAmount() {
            return this.cashExampleAmount;
        }

        @Nullable
        public final Double getCashMinInterestRate() {
            return this.cashMinInterestRate;
        }

        public final boolean getCheckSuccessFlag() {
            return this.checkSuccessFlag;
        }

        @Nullable
        public final Long getCreditQuota() {
            return this.creditQuota;
        }

        @Nullable
        public final Long getDailyInterest() {
            return this.dailyInterest;
        }

        @Nullable
        public final Integer getIfJointDebit() {
            return this.ifJointDebit;
        }

        @Nullable
        public final Double getInterestRatio() {
            return this.interestRatio;
        }

        @Nullable
        public final Long getLoanAmount() {
            return this.loanAmount;
        }

        @Nullable
        public final Integer getMaxLoanDays() {
            return this.maxLoanDays;
        }

        @Nullable
        public final Integer getTerm() {
            return this.term;
        }

        @Nullable
        public final Integer getTermSpan() {
            return this.termSpan;
        }

        @Nullable
        public final String getTermSpanUnit() {
            return this.termSpanUnit;
        }

        @Nullable
        public final String getTrafficChannel() {
            return this.trafficChannel;
        }

        public final void setCashCreditLimit(@Nullable Long l5) {
            this.cashCreditLimit = l5;
        }

        public final void setCashExampleAmount(@Nullable Long l5) {
            this.cashExampleAmount = l5;
        }

        public final void setCashMinInterestRate(@Nullable Double d2) {
            this.cashMinInterestRate = d2;
        }

        public final void setCheckSuccessFlag(boolean z3) {
            this.checkSuccessFlag = z3;
        }

        public final void setCreditQuota(@Nullable Long l5) {
            this.creditQuota = l5;
        }

        public final void setDailyInterest(@Nullable Long l5) {
            this.dailyInterest = l5;
        }

        public final void setIfJointDebit(@Nullable Integer num) {
            this.ifJointDebit = num;
        }

        public final void setInterestRatio(@Nullable Double d2) {
            this.interestRatio = d2;
        }

        public final void setLoanAmount(@Nullable Long l5) {
            this.loanAmount = l5;
        }

        public final void setMaxLoanDays(@Nullable Integer num) {
            this.maxLoanDays = num;
        }

        public final void setTerm(@Nullable Integer num) {
            this.term = num;
        }

        public final void setTermSpan(@Nullable Integer num) {
            this.termSpan = num;
        }

        public final void setTermSpanUnit(@Nullable String str) {
            this.termSpanUnit = str;
        }

        public final void setTrafficChannel(@Nullable String str) {
            this.trafficChannel = str;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CalcReturnSendCouponDTO;", "", "couponCode", "", "nominaValue", "", "maxReduceValue", "actNo", "loanProduct", "validDays", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCouponCode", "()Ljava/lang/String;", "getNominaValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMaxReduceValue", "getActNo", "getLoanProduct", "getValidDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CalcReturnSendCouponDTO {

        @Nullable
        private final String actNo;

        @Nullable
        private final String couponCode;

        @Nullable
        private final String loanProduct;

        @Nullable
        private final Long maxReduceValue;

        @Nullable
        private final Long nominaValue;

        @Nullable
        private final Integer validDays;

        public CalcReturnSendCouponDTO(@Nullable String str, @Nullable Long l5, @Nullable Long l6, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
            this.couponCode = str;
            this.nominaValue = l5;
            this.maxReduceValue = l6;
            this.actNo = str2;
            this.loanProduct = str3;
            this.validDays = num;
        }

        @Nullable
        public final String getActNo() {
            return this.actNo;
        }

        @Nullable
        public final String getCouponCode() {
            return this.couponCode;
        }

        @Nullable
        public final String getLoanProduct() {
            return this.loanProduct;
        }

        @Nullable
        public final Long getMaxReduceValue() {
            return this.maxReduceValue;
        }

        @Nullable
        public final Long getNominaValue() {
            return this.nominaValue;
        }

        @Nullable
        public final Integer getValidDays() {
            return this.validDays;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateAppInfo;", "", "cashAppDownloadUrl", "", "couponDiscountInfo", "urlRedirectType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCashAppDownloadUrl", "()Ljava/lang/String;", "setCashAppDownloadUrl", "(Ljava/lang/String;)V", "getCouponDiscountInfo", "setCouponDiscountInfo", "getUrlRedirectType", "setUrlRedirectType", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MigrateAppInfo {

        @Nullable
        private String cashAppDownloadUrl;

        @Nullable
        private String couponDiscountInfo;

        @Nullable
        private String urlRedirectType;

        public MigrateAppInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.cashAppDownloadUrl = str;
            this.couponDiscountInfo = str2;
            this.urlRedirectType = str3;
        }

        @Nullable
        public final String getCashAppDownloadUrl() {
            return this.cashAppDownloadUrl;
        }

        @Nullable
        public final String getCouponDiscountInfo() {
            return this.couponDiscountInfo;
        }

        @Nullable
        public final String getUrlRedirectType() {
            return this.urlRedirectType;
        }

        public final void setCashAppDownloadUrl(@Nullable String str) {
            this.cashAppDownloadUrl = str;
        }

        public final void setCouponDiscountInfo(@Nullable String str) {
            this.couponDiscountInfo = str;
        }

        public final void setUrlRedirectType(@Nullable String str) {
            this.urlRedirectType = str;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateRewardInfo;", "", "couponNominaValue", "", "loanDaysAfterExtend", "", "raiseLimit", "popupJumpH5Url", "", "popupJumpH5Type", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "getCouponNominaValue", "()Ljava/lang/Long;", "setCouponNominaValue", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLoanDaysAfterExtend", "()Ljava/lang/Integer;", "setLoanDaysAfterExtend", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRaiseLimit", "setRaiseLimit", "getPopupJumpH5Url", "()Ljava/lang/String;", "setPopupJumpH5Url", "(Ljava/lang/String;)V", "getPopupJumpH5Type", "setPopupJumpH5Type", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MigrateRewardInfo {

        @Nullable
        private Long couponNominaValue;

        @Nullable
        private Integer loanDaysAfterExtend;

        @Nullable
        private Integer popupJumpH5Type;

        @Nullable
        private String popupJumpH5Url;

        @Nullable
        private Long raiseLimit;

        public MigrateRewardInfo(@Nullable Long l5, @Nullable Integer num, @Nullable Long l6, @Nullable String str, @Nullable Integer num2) {
            this.couponNominaValue = l5;
            this.loanDaysAfterExtend = num;
            this.raiseLimit = l6;
            this.popupJumpH5Url = str;
            this.popupJumpH5Type = num2;
        }

        @Nullable
        public final Long getCouponNominaValue() {
            return this.couponNominaValue;
        }

        @Nullable
        public final Integer getLoanDaysAfterExtend() {
            return this.loanDaysAfterExtend;
        }

        @Nullable
        public final Integer getPopupJumpH5Type() {
            return this.popupJumpH5Type;
        }

        @Nullable
        public final String getPopupJumpH5Url() {
            return this.popupJumpH5Url;
        }

        @Nullable
        public final Long getRaiseLimit() {
            return this.raiseLimit;
        }

        public final void setCouponNominaValue(@Nullable Long l5) {
            this.couponNominaValue = l5;
        }

        public final void setLoanDaysAfterExtend(@Nullable Integer num) {
            this.loanDaysAfterExtend = num;
        }

        public final void setPopupJumpH5Type(@Nullable Integer num) {
            this.popupJumpH5Type = num;
        }

        public final void setPopupJumpH5Url(@Nullable String str) {
            this.popupJumpH5Url = str;
        }

        public final void setRaiseLimit(@Nullable Long l5) {
            this.raiseLimit = l5;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\bD\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR\u001c\u0010!\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\tR\u001c\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\tR\u001c\u0010'\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\tR\u001c\u0010*\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR\u001c\u0010-\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\tR\u001c\u00100\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\tR\u001c\u00103\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR\u001c\u00106\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\tR\u001c\u00109\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\tR\u001c\u0010<\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR\u001c\u0010?\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0007\"\u0004\bA\u0010\tR\u001c\u0010B\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\tR\u001c\u0010E\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\tR\u001c\u0010H\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u0010\tR\u001c\u0010K\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0007\"\u0004\bM\u0010\tR\u001c\u0010N\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0007\"\u0004\bP\u0010\tR\u001e\u0010Q\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\bR\u0010\u0010\"\u0004\bS\u0010\u0012R\u001e\u0010T\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\bU\u0010\u001a\"\u0004\bV\u0010\u001cR\u001e\u0010W\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\bX\u0010\u001a\"\u0004\bY\u0010\u001cR\u0015\u0010Z\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b[\u0010\u001a¨\u0006\\"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$PhoneModelDto;", "", "<init>", "()V", "orderNo", "", "getOrderNo", "()Ljava/lang/String;", "setOrderNo", "(Ljava/lang/String;)V", "loanNo", "getLoanNo", "setLoanNo", "repaymentDate", "", "getRepaymentDate", "()Ljava/lang/Long;", "setRepaymentDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "outstandingAmount", "getOutstandingAmount", "setOutstandingAmount", "accountType", "", "getAccountType", "()Ljava/lang/Integer;", "setAccountType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "accountNo", "getAccountNo", "setAccountNo", "virtualAccountNo", "getVirtualAccountNo", "setVirtualAccountNo", "accountName", "getAccountName", "setAccountName", "bankName", "getBankName", "setBankName", "bankUrl", "getBankUrl", "setBankUrl", "bankCode", "getBankCode", "setBankCode", "jumpPath", "getJumpPath", "setJumpPath", "jumpType", "getJumpType", "setJumpType", "jumpParams", "getJumpParams", "setJumpParams", "brand", "getBrand", "setBrand", "marketName", "getMarketName", "setMarketName", "type", "getType", "setType", WebViewCache.SOURCE_MEMORY_CACHE, "getMemory", "setMemory", "phoneColor", "getPhoneColor", "setPhoneColor", "storage", "getStorage", "setStorage", "imei", "getImei", "setImei", "loanTermSpanUnit", "getLoanTermSpanUnit", "setLoanTermSpanUnit", "dayRepayAmount", "getDayRepayAmount", "setDayRepayAmount", "loanDays", "getLoanDays", "setLoanDays", "graceDays", "getGraceDays", "setGraceDays", "loanTerm", "getLoanTerm", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PhoneModelDto {

        @Nullable
        private String accountName;

        @Nullable
        private String accountNo;

        @Nullable
        private Integer accountType;

        @Nullable
        private String bankCode;

        @Nullable
        private String bankName;

        @Nullable
        private String bankUrl;

        @Nullable
        private String brand;

        @Nullable
        private Long dayRepayAmount;

        @Nullable
        private Integer graceDays;

        @Nullable
        private String imei;

        @Nullable
        private String jumpParams;

        @Nullable
        private String jumpPath;

        @Nullable
        private String jumpType;

        @Nullable
        private Integer loanDays;

        @Nullable
        private String loanNo;

        @Nullable
        private final Integer loanTerm;

        @Nullable
        private String loanTermSpanUnit;

        @Nullable
        private String marketName;

        @Nullable
        private String memory;

        @Nullable
        private String orderNo;

        @Nullable
        private Long outstandingAmount;

        @Nullable
        private String phoneColor;

        @Nullable
        private Long repaymentDate;

        @Nullable
        private String storage;

        @Nullable
        private String type;

        @Nullable
        private String virtualAccountNo;

        @Nullable
        public final String getAccountName() {
            return this.accountName;
        }

        @Nullable
        public final String getAccountNo() {
            return this.accountNo;
        }

        @Nullable
        public final Integer getAccountType() {
            return this.accountType;
        }

        @Nullable
        public final String getBankCode() {
            return this.bankCode;
        }

        @Nullable
        public final String getBankName() {
            return this.bankName;
        }

        @Nullable
        public final String getBankUrl() {
            return this.bankUrl;
        }

        @Nullable
        public final String getBrand() {
            return this.brand;
        }

        @Nullable
        public final Long getDayRepayAmount() {
            return this.dayRepayAmount;
        }

        @Nullable
        public final Integer getGraceDays() {
            return this.graceDays;
        }

        @Nullable
        public final String getImei() {
            return this.imei;
        }

        @Nullable
        public final String getJumpParams() {
            return this.jumpParams;
        }

        @Nullable
        public final String getJumpPath() {
            return this.jumpPath;
        }

        @Nullable
        public final String getJumpType() {
            return this.jumpType;
        }

        @Nullable
        public final Integer getLoanDays() {
            return this.loanDays;
        }

        @Nullable
        public final String getLoanNo() {
            return this.loanNo;
        }

        @Nullable
        public final Integer getLoanTerm() {
            return this.loanTerm;
        }

        @Nullable
        public final String getLoanTermSpanUnit() {
            return this.loanTermSpanUnit;
        }

        @Nullable
        public final String getMarketName() {
            return this.marketName;
        }

        @Nullable
        public final String getMemory() {
            return this.memory;
        }

        @Nullable
        public final String getOrderNo() {
            return this.orderNo;
        }

        @Nullable
        public final Long getOutstandingAmount() {
            return this.outstandingAmount;
        }

        @Nullable
        public final String getPhoneColor() {
            return this.phoneColor;
        }

        @Nullable
        public final Long getRepaymentDate() {
            return this.repaymentDate;
        }

        @Nullable
        public final String getStorage() {
            return this.storage;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final String getVirtualAccountNo() {
            return this.virtualAccountNo;
        }

        public final void setAccountName(@Nullable String str) {
            this.accountName = str;
        }

        public final void setAccountNo(@Nullable String str) {
            this.accountNo = str;
        }

        public final void setAccountType(@Nullable Integer num) {
            this.accountType = num;
        }

        public final void setBankCode(@Nullable String str) {
            this.bankCode = str;
        }

        public final void setBankName(@Nullable String str) {
            this.bankName = str;
        }

        public final void setBankUrl(@Nullable String str) {
            this.bankUrl = str;
        }

        public final void setBrand(@Nullable String str) {
            this.brand = str;
        }

        public final void setDayRepayAmount(@Nullable Long l5) {
            this.dayRepayAmount = l5;
        }

        public final void setGraceDays(@Nullable Integer num) {
            this.graceDays = num;
        }

        public final void setImei(@Nullable String str) {
            this.imei = str;
        }

        public final void setJumpParams(@Nullable String str) {
            this.jumpParams = str;
        }

        public final void setJumpPath(@Nullable String str) {
            this.jumpPath = str;
        }

        public final void setJumpType(@Nullable String str) {
            this.jumpType = str;
        }

        public final void setLoanDays(@Nullable Integer num) {
            this.loanDays = num;
        }

        public final void setLoanNo(@Nullable String str) {
            this.loanNo = str;
        }

        public final void setLoanTermSpanUnit(@Nullable String str) {
            this.loanTermSpanUnit = str;
        }

        public final void setMarketName(@Nullable String str) {
            this.marketName = str;
        }

        public final void setMemory(@Nullable String str) {
            this.memory = str;
        }

        public final void setOrderNo(@Nullable String str) {
            this.orderNo = str;
        }

        public final void setOutstandingAmount(@Nullable Long l5) {
            this.outstandingAmount = l5;
        }

        public final void setPhoneColor(@Nullable String str) {
            this.phoneColor = str;
        }

        public final void setRepaymentDate(@Nullable Long l5) {
            this.repaymentDate = l5;
        }

        public final void setStorage(@Nullable String str) {
            this.storage = str;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        public final void setVirtualAccountNo(@Nullable String str) {
            this.virtualAccountNo = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\rB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$RepaymentInfo;", "", "cashCardInfo", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$RepaymentInfo$CashCardInfo;", "flexiCardInfo", "<init>", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$RepaymentInfo$CashCardInfo;Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$RepaymentInfo$CashCardInfo;)V", "getCashCardInfo", "()Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$RepaymentInfo$CashCardInfo;", "setCashCardInfo", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$RepaymentInfo$CashCardInfo;)V", "getFlexiCardInfo", "setFlexiCardInfo", "CashCardInfo", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RepaymentInfo {

        @Nullable
        private CashCardInfo cashCardInfo;

        @Nullable
        private CashCardInfo flexiCardInfo;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b!\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 R\u001e\u0010\f\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010 R\u001e\u0010\r\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 ¨\u0006*"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$RepaymentInfo$CashCardInfo;", "", "cardNo", "", "accountType", "", "status", "day", "penalty", "", "unpaidPenalty", "creditQuota", "tempQuotaExpirationDate", "tempQuota", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getCardNo", "()Ljava/lang/String;", "setCardNo", "(Ljava/lang/String;)V", "getAccountType", "()Ljava/lang/Integer;", "setAccountType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStatus", "setStatus", "getDay", "setDay", "getPenalty", "()Ljava/lang/Long;", "setPenalty", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUnpaidPenalty", "setUnpaidPenalty", "getCreditQuota", "setCreditQuota", "getTempQuotaExpirationDate", "setTempQuotaExpirationDate", "getTempQuota", "setTempQuota", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CashCardInfo {

            @Nullable
            private Integer accountType;

            @Nullable
            private String cardNo;

            @Nullable
            private Long creditQuota;

            @Nullable
            private Integer day;

            @Nullable
            private Long penalty;

            @Nullable
            private Integer status;

            @Nullable
            private Long tempQuota;

            @Nullable
            private Long tempQuotaExpirationDate;

            @Nullable
            private Long unpaidPenalty;

            public CashCardInfo(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11) {
                this.cardNo = str;
                this.accountType = num;
                this.status = num2;
                this.day = num3;
                this.penalty = l5;
                this.unpaidPenalty = l6;
                this.creditQuota = l8;
                this.tempQuotaExpirationDate = l10;
                this.tempQuota = l11;
            }

            @Nullable
            public final Integer getAccountType() {
                return this.accountType;
            }

            @Nullable
            public final String getCardNo() {
                return this.cardNo;
            }

            @Nullable
            public final Long getCreditQuota() {
                return this.creditQuota;
            }

            @Nullable
            public final Integer getDay() {
                return this.day;
            }

            @Nullable
            public final Long getPenalty() {
                return this.penalty;
            }

            @Nullable
            public final Integer getStatus() {
                return this.status;
            }

            @Nullable
            public final Long getTempQuota() {
                return this.tempQuota;
            }

            @Nullable
            public final Long getTempQuotaExpirationDate() {
                return this.tempQuotaExpirationDate;
            }

            @Nullable
            public final Long getUnpaidPenalty() {
                return this.unpaidPenalty;
            }

            public final void setAccountType(@Nullable Integer num) {
                this.accountType = num;
            }

            public final void setCardNo(@Nullable String str) {
                this.cardNo = str;
            }

            public final void setCreditQuota(@Nullable Long l5) {
                this.creditQuota = l5;
            }

            public final void setDay(@Nullable Integer num) {
                this.day = num;
            }

            public final void setPenalty(@Nullable Long l5) {
                this.penalty = l5;
            }

            public final void setStatus(@Nullable Integer num) {
                this.status = num;
            }

            public final void setTempQuota(@Nullable Long l5) {
                this.tempQuota = l5;
            }

            public final void setTempQuotaExpirationDate(@Nullable Long l5) {
                this.tempQuotaExpirationDate = l5;
            }

            public final void setUnpaidPenalty(@Nullable Long l5) {
                this.unpaidPenalty = l5;
            }
        }

        public RepaymentInfo(@Nullable CashCardInfo cashCardInfo, @Nullable CashCardInfo cashCardInfo2) {
            this.cashCardInfo = cashCardInfo;
            this.flexiCardInfo = cashCardInfo2;
        }

        @Nullable
        public final CashCardInfo getCashCardInfo() {
            return this.cashCardInfo;
        }

        @Nullable
        public final CashCardInfo getFlexiCardInfo() {
            return this.flexiCardInfo;
        }

        public final void setCashCardInfo(@Nullable CashCardInfo cashCardInfo) {
            this.cashCardInfo = cashCardInfo;
        }

        public final void setFlexiCardInfo(@Nullable CashCardInfo cashCardInfo) {
            this.flexiCardInfo = cashCardInfo;
        }
    }

    public QueryLoanDialogPopUpsBean(boolean z3, boolean z8, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, @Nullable BusinessInfo businessInfo, @Nullable AdjustQuotaBusinessResDto adjustQuotaBusinessResDto, @Nullable RepaymentInfo repaymentInfo, boolean z17, @Nullable MigrateAppInfo migrateAppInfo, @Nullable String str, boolean z18, @Nullable CalcReturnSendCouponDTO calcReturnSendCouponDTO, boolean z19, @Nullable CashMarketingNotifyOnlyAData cashMarketingNotifyOnlyAData, boolean z20, @Nullable CashMarketingNotifyOnlyBData cashMarketingNotifyOnlyBData, boolean z21, @Nullable CashMarketingRepayCouponData cashMarketingRepayCouponData, boolean z22, @Nullable List<MultiCouponData> list, boolean z23, boolean z24, boolean z25, @Nullable MigrateRewardInfo migrateRewardInfo, boolean z26, boolean z27, @Nullable PhoneModelDto phoneModelDto, @Nullable List<String> list2) {
        this.flexiOpen = z3;
        this.cashOpen = z8;
        this.quotaChange = z10;
        this.borrowCycleChange = z11;
        this.unloanInactiveUserSendCoupon = z12;
        this.hasAvailableCoupon = z13;
        this.flexiUnFrozen = z14;
        this.cashUnFrozen = z15;
        this.installmentLoanOpen = z16;
        this.businessInfo = businessInfo;
        this.installmentLoanInfo = adjustQuotaBusinessResDto;
        this.repaymentInfo = repaymentInfo;
        this.migrateAppSendCoupon = z17;
        this.migrateAppInfo = migrateAppInfo;
        this.loanProduct = str;
        this.calcReturnSendCoupon = z18;
        this.couponDto = calcReturnSendCouponDTO;
        this.cashMarketingNotifyOnlyA = z19;
        this.cashMarketingNotifyOnlyAData = cashMarketingNotifyOnlyAData;
        this.cashMarketingNotifyOnlyB = z20;
        this.cashMarketingNotifyOnlyBData = cashMarketingNotifyOnlyBData;
        this.cashMarketingRepayCoupon = z21;
        this.cashMarketingRepayCouponData = cashMarketingRepayCouponData;
        this.multiCouponSendSuccess = z22;
        this.multiCouponDataList = list;
        this.prejyMigrateLoanTermExtension = z23;
        this.prejyMigrateBorrowCoupon = z24;
        this.prejyMigrateRaiseAmount = z25;
        this.migrateRewardInfoDto = migrateRewardInfo;
        this.mobileInstallmentOpen = z26;
        this.installmentCreditIncreaseWhitelistHit = z27;
        this.phoneModelDto = phoneModelDto;
        this.mobileInstallmentPopupBrands = list2;
    }

    public final boolean getBorrowCycleChange() {
        return this.borrowCycleChange;
    }

    @Nullable
    public final BusinessInfo getBusinessInfo() {
        return this.businessInfo;
    }

    public final boolean getCalcReturnSendCoupon() {
        return this.calcReturnSendCoupon;
    }

    public final boolean getCashMarketingNotifyOnlyA() {
        return this.cashMarketingNotifyOnlyA;
    }

    @Nullable
    public final CashMarketingNotifyOnlyAData getCashMarketingNotifyOnlyAData() {
        return this.cashMarketingNotifyOnlyAData;
    }

    public final boolean getCashMarketingNotifyOnlyB() {
        return this.cashMarketingNotifyOnlyB;
    }

    @Nullable
    public final CashMarketingNotifyOnlyBData getCashMarketingNotifyOnlyBData() {
        return this.cashMarketingNotifyOnlyBData;
    }

    public final boolean getCashMarketingRepayCoupon() {
        return this.cashMarketingRepayCoupon;
    }

    @Nullable
    public final CashMarketingRepayCouponData getCashMarketingRepayCouponData() {
        return this.cashMarketingRepayCouponData;
    }

    public final boolean getCashOpen() {
        return this.cashOpen;
    }

    public final boolean getCashUnFrozen() {
        return this.cashUnFrozen;
    }

    @Nullable
    public final CalcReturnSendCouponDTO getCouponDto() {
        return this.couponDto;
    }

    public final boolean getFlexiOpen() {
        return this.flexiOpen;
    }

    public final boolean getFlexiUnFrozen() {
        return this.flexiUnFrozen;
    }

    public final boolean getHasAvailableCoupon() {
        return this.hasAvailableCoupon;
    }

    public final boolean getInstallmentCreditIncreaseWhitelistHit() {
        return this.installmentCreditIncreaseWhitelistHit;
    }

    @Nullable
    public final AdjustQuotaBusinessResDto getInstallmentLoanInfo() {
        return this.installmentLoanInfo;
    }

    public final boolean getInstallmentLoanOpen() {
        return this.installmentLoanOpen;
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    public final MigrateAppInfo getMigrateAppInfo() {
        return this.migrateAppInfo;
    }

    public final boolean getMigrateAppSendCoupon() {
        return this.migrateAppSendCoupon;
    }

    @Nullable
    public final MigrateRewardInfo getMigrateRewardInfoDto() {
        return this.migrateRewardInfoDto;
    }

    public final boolean getMobileInstallmentOpen() {
        return this.mobileInstallmentOpen;
    }

    @Nullable
    public final List<String> getMobileInstallmentPopupBrands() {
        return this.mobileInstallmentPopupBrands;
    }

    @Nullable
    public final List<MultiCouponData> getMultiCouponDataList() {
        return this.multiCouponDataList;
    }

    public final boolean getMultiCouponSendSuccess() {
        return this.multiCouponSendSuccess;
    }

    @Nullable
    public final MultiLoanInfo getMultiLoanInfo() {
        return this.multiLoanInfo;
    }

    public final boolean getNeedFaceVerify() {
        return this.needFaceVerify;
    }

    @Nullable
    public final PhoneModelDto getPhoneModelDto() {
        return this.phoneModelDto;
    }

    public final boolean getPrejyMigrateBorrowCoupon() {
        return this.prejyMigrateBorrowCoupon;
    }

    public final boolean getPrejyMigrateLoanTermExtension() {
        return this.prejyMigrateLoanTermExtension;
    }

    public final boolean getPrejyMigrateRaiseAmount() {
        return this.prejyMigrateRaiseAmount;
    }

    public final boolean getQuotaChange() {
        return this.quotaChange;
    }

    @Nullable
    public final RepaymentInfo getRepaymentInfo() {
        return this.repaymentInfo;
    }

    public final boolean getUnloanInactiveUserSendCoupon() {
        return this.unloanInactiveUserSendCoupon;
    }

    public final boolean hasRepaymentDialog() {
        RepaymentInfo repaymentInfo = this.repaymentInfo;
        if (repaymentInfo == null) {
            return false;
        }
        if ((repaymentInfo != null ? repaymentInfo.getCashCardInfo() : null) != null) {
            return true;
        }
        RepaymentInfo repaymentInfo2 = this.repaymentInfo;
        return (repaymentInfo2 != null ? repaymentInfo2.getFlexiCardInfo() : null) != null;
    }

    public final void setBorrowCycleChange(boolean z3) {
        this.borrowCycleChange = z3;
    }

    public final void setBusinessInfo(@Nullable BusinessInfo businessInfo) {
        this.businessInfo = businessInfo;
    }

    public final void setCalcReturnSendCoupon(boolean z3) {
        this.calcReturnSendCoupon = z3;
    }

    public final void setCashMarketingNotifyOnlyA(boolean z3) {
        this.cashMarketingNotifyOnlyA = z3;
    }

    public final void setCashMarketingNotifyOnlyAData(@Nullable CashMarketingNotifyOnlyAData cashMarketingNotifyOnlyAData) {
        this.cashMarketingNotifyOnlyAData = cashMarketingNotifyOnlyAData;
    }

    public final void setCashMarketingNotifyOnlyB(boolean z3) {
        this.cashMarketingNotifyOnlyB = z3;
    }

    public final void setCashMarketingNotifyOnlyBData(@Nullable CashMarketingNotifyOnlyBData cashMarketingNotifyOnlyBData) {
        this.cashMarketingNotifyOnlyBData = cashMarketingNotifyOnlyBData;
    }

    public final void setCashMarketingRepayCoupon(boolean z3) {
        this.cashMarketingRepayCoupon = z3;
    }

    public final void setCashMarketingRepayCouponData(@Nullable CashMarketingRepayCouponData cashMarketingRepayCouponData) {
        this.cashMarketingRepayCouponData = cashMarketingRepayCouponData;
    }

    public final void setCashOpen(boolean z3) {
        this.cashOpen = z3;
    }

    public final void setCashUnFrozen(boolean z3) {
        this.cashUnFrozen = z3;
    }

    public final void setCouponDto(@Nullable CalcReturnSendCouponDTO calcReturnSendCouponDTO) {
        this.couponDto = calcReturnSendCouponDTO;
    }

    public final void setFlexiOpen(boolean z3) {
        this.flexiOpen = z3;
    }

    public final void setFlexiUnFrozen(boolean z3) {
        this.flexiUnFrozen = z3;
    }

    public final void setHasAvailableCoupon(boolean z3) {
        this.hasAvailableCoupon = z3;
    }

    public final void setInstallmentCreditIncreaseWhitelistHit(boolean z3) {
        this.installmentCreditIncreaseWhitelistHit = z3;
    }

    public final void setInstallmentLoanInfo(@Nullable AdjustQuotaBusinessResDto adjustQuotaBusinessResDto) {
        this.installmentLoanInfo = adjustQuotaBusinessResDto;
    }

    public final void setInstallmentLoanOpen(boolean z3) {
        this.installmentLoanOpen = z3;
    }

    public final void setLoanProduct(@Nullable String str) {
        this.loanProduct = str;
    }

    public final void setMigrateAppInfo(@Nullable MigrateAppInfo migrateAppInfo) {
        this.migrateAppInfo = migrateAppInfo;
    }

    public final void setMigrateAppSendCoupon(boolean z3) {
        this.migrateAppSendCoupon = z3;
    }

    public final void setMigrateRewardInfoDto(@Nullable MigrateRewardInfo migrateRewardInfo) {
        this.migrateRewardInfoDto = migrateRewardInfo;
    }

    public final void setMobileInstallmentOpen(boolean z3) {
        this.mobileInstallmentOpen = z3;
    }

    public final void setMobileInstallmentPopupBrands(@Nullable List<String> list) {
        this.mobileInstallmentPopupBrands = list;
    }

    public final void setMultiCouponDataList(@Nullable List<MultiCouponData> list) {
        this.multiCouponDataList = list;
    }

    public final void setMultiCouponSendSuccess(boolean z3) {
        this.multiCouponSendSuccess = z3;
    }

    public final void setMultiLoanInfo(@Nullable MultiLoanInfo multiLoanInfo) {
        this.multiLoanInfo = multiLoanInfo;
    }

    public final void setNeedFaceVerify(boolean z3) {
        this.needFaceVerify = z3;
    }

    public final void setPhoneModelDto(@Nullable PhoneModelDto phoneModelDto) {
        this.phoneModelDto = phoneModelDto;
    }

    public final void setPrejyMigrateBorrowCoupon(boolean z3) {
        this.prejyMigrateBorrowCoupon = z3;
    }

    public final void setPrejyMigrateLoanTermExtension(boolean z3) {
        this.prejyMigrateLoanTermExtension = z3;
    }

    public final void setPrejyMigrateRaiseAmount(boolean z3) {
        this.prejyMigrateRaiseAmount = z3;
    }

    public final void setQuotaChange(boolean z3) {
        this.quotaChange = z3;
    }

    public final void setRepaymentInfo(@Nullable RepaymentInfo repaymentInfo) {
        this.repaymentInfo = repaymentInfo;
    }

    public final void setUnloanInactiveUserSendCoupon(boolean z3) {
        this.unloanInactiveUserSendCoupon = z3;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MultiCouponData;", "Landroid/os/Parcelable;", "couponDiscountAmount", "", "couponType", "", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getCouponDiscountAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCouponType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "writeToParcel", "", "flags", "describeContents", "CREATOR", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MultiCouponData implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Long couponDiscountAmount;

        @Nullable
        private final Integer couponType;

        /* JADX INFO: renamed from: com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$MultiCouponData$CREATOR, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MultiCouponData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MultiCouponData;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MultiCouponData;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<MultiCouponData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public MultiCouponData createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MultiCouponData(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public MultiCouponData[] newArray(int size) {
                return new MultiCouponData[size];
            }
        }

        public MultiCouponData(@Nullable Long l5, @Nullable Integer num) {
            this.couponDiscountAmount = l5;
            this.couponType = num;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public final Long getCouponDiscountAmount() {
            return this.couponDiscountAmount;
        }

        @Nullable
        public final Integer getCouponType() {
            return this.couponType;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeValue(this.couponDiscountAmount);
            parcel.writeValue(this.couponType);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public MultiCouponData(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Object value = parcel.readValue(Long.TYPE.getClassLoader());
            Long l5 = value instanceof Long ? (Long) value : null;
            Object value2 = parcel.readValue(Integer.TYPE.getClassLoader());
            this(l5, value2 instanceof Integer ? (Integer) value2 : null);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyBData;", "Landroid/os/Parcelable;", "amountToBeRepaid", "", "repaymentDate", "overdueDays", "", "overdueFee", "outstandingAccounts", "", "Lcom/transsnet/palmpay/credit/bean/OutstandingAccount;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getAmountToBeRepaid", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRepaymentDate", "getOverdueDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOverdueFee", "getOutstandingAccounts", "()Ljava/util/List;", "writeToParcel", "", "flags", "describeContents", "CREATOR", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CashMarketingNotifyOnlyBData implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Long amountToBeRepaid;

        @Nullable
        private final List<OutstandingAccount> outstandingAccounts;

        @Nullable
        private final Integer overdueDays;

        @Nullable
        private final Long overdueFee;

        @Nullable
        private final Long repaymentDate;

        /* JADX INFO: renamed from: com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyBData$CREATOR, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyBData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyBData;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyBData;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<CashMarketingNotifyOnlyBData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public CashMarketingNotifyOnlyBData createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashMarketingNotifyOnlyBData(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public CashMarketingNotifyOnlyBData[] newArray(int size) {
                return new CashMarketingNotifyOnlyBData[size];
            }
        }

        public CashMarketingNotifyOnlyBData(@Nullable Long l5, @Nullable Long l6, @Nullable Integer num, @Nullable Long l8, @Nullable List<OutstandingAccount> list) {
            this.amountToBeRepaid = l5;
            this.repaymentDate = l6;
            this.overdueDays = num;
            this.overdueFee = l8;
            this.outstandingAccounts = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public final Long getAmountToBeRepaid() {
            return this.amountToBeRepaid;
        }

        @Nullable
        public final List<OutstandingAccount> getOutstandingAccounts() {
            return this.outstandingAccounts;
        }

        @Nullable
        public final Integer getOverdueDays() {
            return this.overdueDays;
        }

        @Nullable
        public final Long getOverdueFee() {
            return this.overdueFee;
        }

        @Nullable
        public final Long getRepaymentDate() {
            return this.repaymentDate;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeValue(this.amountToBeRepaid);
            parcel.writeValue(this.repaymentDate);
            parcel.writeValue(this.overdueDays);
            parcel.writeValue(this.overdueFee);
            parcel.writeTypedList(this.outstandingAccounts);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public CashMarketingNotifyOnlyBData(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Class cls = Long.TYPE;
            Object value = parcel.readValue(cls.getClassLoader());
            Long l5 = value instanceof Long ? (Long) value : null;
            Object value2 = parcel.readValue(cls.getClassLoader());
            Long l6 = value2 instanceof Long ? (Long) value2 : null;
            Object value3 = parcel.readValue(Integer.TYPE.getClassLoader());
            Integer num = value3 instanceof Integer ? (Integer) value3 : null;
            Object value4 = parcel.readValue(cls.getClassLoader());
            this(l5, l6, num, value4 instanceof Long ? (Long) value4 : null, parcel.createTypedArrayList(OutstandingAccount.INSTANCE));
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingRepayCouponData;", "Landroid/os/Parcelable;", "couponDiscountAmount", "", "repaymentDate", "overdueDays", "", "overdueFee", "outstandingAccounts", "", "Lcom/transsnet/palmpay/credit/bean/OutstandingAccount;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getCouponDiscountAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRepaymentDate", "getOverdueDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOverdueFee", "getOutstandingAccounts", "()Ljava/util/List;", "writeToParcel", "", "flags", "describeContents", "CREATOR", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CashMarketingRepayCouponData implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Long couponDiscountAmount;

        @Nullable
        private final List<OutstandingAccount> outstandingAccounts;

        @Nullable
        private final Integer overdueDays;

        @Nullable
        private final Long overdueFee;

        @Nullable
        private final Long repaymentDate;

        /* JADX INFO: renamed from: com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$CashMarketingRepayCouponData$CREATOR, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingRepayCouponData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingRepayCouponData;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingRepayCouponData;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<CashMarketingRepayCouponData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public CashMarketingRepayCouponData createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashMarketingRepayCouponData(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public CashMarketingRepayCouponData[] newArray(int size) {
                return new CashMarketingRepayCouponData[size];
            }
        }

        public CashMarketingRepayCouponData(@Nullable Long l5, @Nullable Long l6, @Nullable Integer num, @Nullable Long l8, @Nullable List<OutstandingAccount> list) {
            this.couponDiscountAmount = l5;
            this.repaymentDate = l6;
            this.overdueDays = num;
            this.overdueFee = l8;
            this.outstandingAccounts = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public final Long getCouponDiscountAmount() {
            return this.couponDiscountAmount;
        }

        @Nullable
        public final List<OutstandingAccount> getOutstandingAccounts() {
            return this.outstandingAccounts;
        }

        @Nullable
        public final Integer getOverdueDays() {
            return this.overdueDays;
        }

        @Nullable
        public final Long getOverdueFee() {
            return this.overdueFee;
        }

        @Nullable
        public final Long getRepaymentDate() {
            return this.repaymentDate;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeValue(this.couponDiscountAmount);
            parcel.writeValue(this.repaymentDate);
            parcel.writeValue(this.overdueDays);
            parcel.writeValue(this.overdueFee);
            parcel.writeTypedList(this.outstandingAccounts);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public CashMarketingRepayCouponData(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Class cls = Long.TYPE;
            Object value = parcel.readValue(cls.getClassLoader());
            Long l5 = value instanceof Long ? (Long) value : null;
            Object value2 = parcel.readValue(cls.getClassLoader());
            Long l6 = value2 instanceof Long ? (Long) value2 : null;
            Object value3 = parcel.readValue(Integer.TYPE.getClassLoader());
            Integer num = value3 instanceof Integer ? (Integer) value3 : null;
            Object value4 = parcel.readValue(cls.getClassLoader());
            this(l5, l6, num, value4 instanceof Long ? (Long) value4 : null, parcel.createTypedArrayList(OutstandingAccount.INSTANCE));
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0010J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0019\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyAData;", "Landroid/os/Parcelable;", "amountToBeRepaid", "", "repaymentDate", "mayBeIncreaseAmount", "overdueDays", "", "overdueFee", "outstandingAccounts", "", "Lcom/transsnet/palmpay/credit/bean/OutstandingAccount;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getAmountToBeRepaid", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRepaymentDate", "getMayBeIncreaseAmount", "getOverdueDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOverdueFee", "getOutstandingAccounts", "()Ljava/util/List;", "writeToParcel", "", "flags", "describeContents", "CREATOR", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CashMarketingNotifyOnlyAData implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Long amountToBeRepaid;

        @Nullable
        private final Long mayBeIncreaseAmount;

        @Nullable
        private final List<OutstandingAccount> outstandingAccounts;

        @Nullable
        private final Integer overdueDays;

        @Nullable
        private final Long overdueFee;

        @Nullable
        private final Long repaymentDate;

        /* JADX INFO: renamed from: com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyAData$CREATOR, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyAData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyAData;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$CashMarketingNotifyOnlyAData;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<CashMarketingNotifyOnlyAData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public CashMarketingNotifyOnlyAData createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashMarketingNotifyOnlyAData(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public CashMarketingNotifyOnlyAData[] newArray(int size) {
                return new CashMarketingNotifyOnlyAData[size];
            }
        }

        public CashMarketingNotifyOnlyAData(@Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Integer num, @Nullable Long l10, @Nullable List<OutstandingAccount> list) {
            this.amountToBeRepaid = l5;
            this.repaymentDate = l6;
            this.mayBeIncreaseAmount = l8;
            this.overdueDays = num;
            this.overdueFee = l10;
            this.outstandingAccounts = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public final Long getAmountToBeRepaid() {
            return this.amountToBeRepaid;
        }

        @Nullable
        public final Long getMayBeIncreaseAmount() {
            return this.mayBeIncreaseAmount;
        }

        @Nullable
        public final List<OutstandingAccount> getOutstandingAccounts() {
            return this.outstandingAccounts;
        }

        @Nullable
        public final Integer getOverdueDays() {
            return this.overdueDays;
        }

        @Nullable
        public final Long getOverdueFee() {
            return this.overdueFee;
        }

        @Nullable
        public final Long getRepaymentDate() {
            return this.repaymentDate;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeValue(this.amountToBeRepaid);
            parcel.writeValue(this.repaymentDate);
            parcel.writeValue(this.mayBeIncreaseAmount);
            parcel.writeValue(this.overdueDays);
            parcel.writeValue(this.overdueFee);
            parcel.writeTypedList(this.outstandingAccounts);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public CashMarketingNotifyOnlyAData(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Class cls = Long.TYPE;
            Object value = parcel.readValue(cls.getClassLoader());
            Long l5 = value instanceof Long ? (Long) value : null;
            Object value2 = parcel.readValue(cls.getClassLoader());
            Long l6 = value2 instanceof Long ? (Long) value2 : null;
            Object value3 = parcel.readValue(cls.getClassLoader());
            Long l8 = value3 instanceof Long ? (Long) value3 : null;
            Object value4 = parcel.readValue(Integer.TYPE.getClassLoader());
            Integer num = value4 instanceof Integer ? (Integer) value4 : null;
            Object value5 = parcel.readValue(cls.getClassLoader());
            this(l5, l6, l8, num, value5 instanceof Long ? (Long) value5 : null, parcel.createTypedArrayList(OutstandingAccount.INSTANCE));
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b.\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b*\u0010\u001c\"\u0004\b+\u0010\u001eR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010'\"\u0004\b6\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010'\"\u0004\b:\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010'\"\u0004\b<\u0010)¨\u0006="}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$BusinessInfo;", "", "cashCreditQuota", "", "subProductId", "", "flexiCreditQuota", "changeDays", "extendedDays", "trafficChannel", "", "loanPeriods", "checkSuccessFlag", "", "minInterestRatio", "", "btnText", "jumpPath", "jumpType", "jumpParams", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCashCreditQuota", "()Ljava/lang/Long;", "setCashCreditQuota", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSubProductId", "()Ljava/lang/Integer;", "setSubProductId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFlexiCreditQuota", "setFlexiCreditQuota", "getChangeDays", "setChangeDays", "getExtendedDays", "setExtendedDays", "getTrafficChannel", "()Ljava/lang/String;", "setTrafficChannel", "(Ljava/lang/String;)V", "getLoanPeriods", "setLoanPeriods", "getCheckSuccessFlag", "()Z", "setCheckSuccessFlag", "(Z)V", "getMinInterestRatio", "()Ljava/lang/Double;", "setMinInterestRatio", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getBtnText", "setBtnText", "getJumpPath", "setJumpPath", "getJumpType", "setJumpType", "getJumpParams", "setJumpParams", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BusinessInfo {

        @Nullable
        private String btnText;

        @Nullable
        private Long cashCreditQuota;

        @Nullable
        private Integer changeDays;
        private boolean checkSuccessFlag;

        @Nullable
        private Integer extendedDays;

        @Nullable
        private Long flexiCreditQuota;

        @Nullable
        private String jumpParams;

        @Nullable
        private String jumpPath;

        @Nullable
        private String jumpType;

        @Nullable
        private Integer loanPeriods;

        @Nullable
        private Double minInterestRatio;

        @Nullable
        private Integer subProductId;

        @Nullable
        private String trafficChannel;

        public BusinessInfo(@Nullable Long l5, @Nullable Integer num, @Nullable Long l6, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, @Nullable Integer num4, boolean z3, @Nullable Double d2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.cashCreditQuota = l5;
            this.subProductId = num;
            this.flexiCreditQuota = l6;
            this.changeDays = num2;
            this.extendedDays = num3;
            this.trafficChannel = str;
            this.loanPeriods = num4;
            this.checkSuccessFlag = z3;
            this.minInterestRatio = d2;
            this.btnText = str2;
            this.jumpPath = str3;
            this.jumpType = str4;
            this.jumpParams = str5;
        }

        @Nullable
        public final String getBtnText() {
            return this.btnText;
        }

        @Nullable
        public final Long getCashCreditQuota() {
            return this.cashCreditQuota;
        }

        @Nullable
        public final Integer getChangeDays() {
            return this.changeDays;
        }

        public final boolean getCheckSuccessFlag() {
            return this.checkSuccessFlag;
        }

        @Nullable
        public final Integer getExtendedDays() {
            return this.extendedDays;
        }

        @Nullable
        public final Long getFlexiCreditQuota() {
            return this.flexiCreditQuota;
        }

        @Nullable
        public final String getJumpParams() {
            return this.jumpParams;
        }

        @Nullable
        public final String getJumpPath() {
            return this.jumpPath;
        }

        @Nullable
        public final String getJumpType() {
            return this.jumpType;
        }

        @Nullable
        public final Integer getLoanPeriods() {
            return this.loanPeriods;
        }

        @Nullable
        public final Double getMinInterestRatio() {
            return this.minInterestRatio;
        }

        @Nullable
        public final Integer getSubProductId() {
            return this.subProductId;
        }

        @Nullable
        public final String getTrafficChannel() {
            return this.trafficChannel;
        }

        public final void setBtnText(@Nullable String str) {
            this.btnText = str;
        }

        public final void setCashCreditQuota(@Nullable Long l5) {
            this.cashCreditQuota = l5;
        }

        public final void setChangeDays(@Nullable Integer num) {
            this.changeDays = num;
        }

        public final void setCheckSuccessFlag(boolean z3) {
            this.checkSuccessFlag = z3;
        }

        public final void setExtendedDays(@Nullable Integer num) {
            this.extendedDays = num;
        }

        public final void setFlexiCreditQuota(@Nullable Long l5) {
            this.flexiCreditQuota = l5;
        }

        public final void setJumpParams(@Nullable String str) {
            this.jumpParams = str;
        }

        public final void setJumpPath(@Nullable String str) {
            this.jumpPath = str;
        }

        public final void setJumpType(@Nullable String str) {
            this.jumpType = str;
        }

        public final void setLoanPeriods(@Nullable Integer num) {
            this.loanPeriods = num;
        }

        public final void setMinInterestRatio(@Nullable Double d2) {
            this.minInterestRatio = d2;
        }

        public final void setSubProductId(@Nullable Integer num) {
            this.subProductId = num;
        }

        public final void setTrafficChannel(@Nullable String str) {
            this.trafficChannel = str;
        }

        public /* synthetic */ BusinessInfo(Long l5, Integer num, Long l6, Integer num2, Integer num3, String str, Integer num4, boolean z3, Double d2, String str2, String str3, String str4, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(l5, num, l6, num2, num3, str, num4, z3, d2, (i7 & 512) != 0 ? null : str2, (i7 & 1024) != 0 ? null : str3, (i7 & 2048) != 0 ? null : str4, (i7 & 4096) != 0 ? null : str5);
        }
    }

    public /* synthetic */ QueryLoanDialogPopUpsBean(boolean z3, boolean z8, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, BusinessInfo businessInfo, AdjustQuotaBusinessResDto adjustQuotaBusinessResDto, RepaymentInfo repaymentInfo, boolean z17, MigrateAppInfo migrateAppInfo, String str, boolean z18, CalcReturnSendCouponDTO calcReturnSendCouponDTO, boolean z19, CashMarketingNotifyOnlyAData cashMarketingNotifyOnlyAData, boolean z20, CashMarketingNotifyOnlyBData cashMarketingNotifyOnlyBData, boolean z21, CashMarketingRepayCouponData cashMarketingRepayCouponData, boolean z22, List list, boolean z23, boolean z24, boolean z25, MigrateRewardInfo migrateRewardInfo, boolean z26, boolean z27, PhoneModelDto phoneModelDto, List list2, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z3, z8, z10, z11, z12, z13, z14, z15, z16, businessInfo, adjustQuotaBusinessResDto, repaymentInfo, z17, migrateAppInfo, str, z18, calcReturnSendCouponDTO, z19, cashMarketingNotifyOnlyAData, z20, cashMarketingNotifyOnlyBData, z21, cashMarketingRepayCouponData, z22, list, z23, z24, z25, migrateRewardInfo, z26, z27, phoneModelDto, (i10 & 1) != 0 ? null : list2);
    }
}
