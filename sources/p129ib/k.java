package p129ib;

import C0.G;
import Ef.a;
import Ff.h;
import Pa.C0525w;
import Wf.AbstractC0780y;
import Wf.I;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.camera.core.impl.utils.executor.g;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.credit.bean.MultiLoanInfo;
import com.transsnet.palmpay.credit.bean.QuotaChange;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.credit.handler.MultiLoanPopupHost;
import com.transsnet.palmpay.credit.ui.dialog.AutoOpenCashSuccDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLDoubleResultRetainDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLIncreaseAmountDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLInstallmentUserMigrateDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLLimitedTimeBenefitsDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.CLMigrateInterestCouponsDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLMultiCouponSendSuccessDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.CLZeroInterestDiscountDialog;
import com.transsnet.palmpay.credit.ui.dialog.CalcReturnSendCouponDialog;
import com.transsnet.palmpay.credit.ui.dialog.OpenCashLoanReviewSuccDialog;
import com.transsnet.palmpay.credit.ui.dialog.OpenCashSuccDialog;
import com.transsnet.palmpay.credit.ui.dialog.OpenFlexiSuccDialog;
import com.transsnet.palmpay.credit.ui.dialog.OpenInstallmentLoanReviewSuccDialog;
import com.transsnet.palmpay.credit.ui.dialog.PalLoanMigrateDialog;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import com.transsnet.palmpay.credit.ui.dialog.UnFrozenCashDialog;
import com.transsnet.palmpay.credit.ui.dialog.UnFrozenFlexiDialog;
import com.transsnet.palmpay.credit.ui.dialog.UpgradeInstallmentSuccDialog;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f37475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommonBeanResult f37476b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, CommonBeanResult commonBeanResult, Continuation continuation) {
        super(2, continuation);
        this.f37475a = mVar;
        this.f37476b = commonBeanResult;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f37475a, this.f37476b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:153:0x04aa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.credit.handler.HomeDialogHandler$HandleCallBack] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.credit.handler.HomeDialogHandler$HandleCallBack] */
    /* JADX WARN: Type inference failed for: r1v66, types: [com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.credit.handler.HomeDialogHandler$HandleCallBack] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Object[] objArr;
        Long flexiCreditQuota;
        Integer changeDays;
        Integer subProductId;
        Long cashCreditQuota;
        int iHashCode;
        final int i7 = 1;
        final int iIntValue = 0;
        a aVar = a.f2423a;
        g.M(obj);
        m mVar = this.f37475a;
        if (!mVar.f37484c) {
            Activity topActivity = ActivityUtils.getTopActivity();
            if (topActivity == null || "account.ui.activity.PinSafeWithPatternActivity".equals(topActivity.getLocalClassName())) {
                mVar.f37484c = false;
            } else {
                mVar.f37484c = true;
                QueryLoanDialogPopUpsBean queryLoanDialogPopUpsBean = (QueryLoanDialogPopUpsBean) this.f37476b.data;
                if (queryLoanDialogPopUpsBean == null) {
                    mVar.f37484c = false;
                    ?? r3 = mVar.f37485d;
                    if (r3 != 0) {
                        r3.onNoDialogToHandle();
                    }
                } else if (queryLoanDialogPopUpsBean.getPrejyMigrateRaiseAmount()) {
                    PalLoanMigrateDialog palLoanMigrateDialog = new PalLoanMigrateDialog(topActivity, queryLoanDialogPopUpsBean.getLoanProduct(), 1, queryLoanDialogPopUpsBean.getMigrateRewardInfoDto());
                    palLoanMigrateDialog.setOnShowListener(new a(mVar, 14));
                    palLoanMigrateDialog.setOnDismissListener(new b(mVar, 2));
                    palLoanMigrateDialog.show();
                } else if (queryLoanDialogPopUpsBean.getPrejyMigrateLoanTermExtension()) {
                    PalLoanMigrateDialog palLoanMigrateDialog2 = new PalLoanMigrateDialog(topActivity, queryLoanDialogPopUpsBean.getLoanProduct(), 2, queryLoanDialogPopUpsBean.getMigrateRewardInfoDto());
                    palLoanMigrateDialog2.setOnShowListener(new a(mVar, 7));
                    palLoanMigrateDialog2.setOnDismissListener(new b(mVar, 12));
                    palLoanMigrateDialog2.show();
                } else if (queryLoanDialogPopUpsBean.getPrejyMigrateBorrowCoupon()) {
                    PalLoanMigrateDialog palLoanMigrateDialog3 = new PalLoanMigrateDialog(topActivity, queryLoanDialogPopUpsBean.getLoanProduct(), 3, queryLoanDialogPopUpsBean.getMigrateRewardInfoDto());
                    palLoanMigrateDialog3.setOnShowListener(new a(mVar, 11));
                    palLoanMigrateDialog3.setOnDismissListener(new b(mVar, 13));
                    palLoanMigrateDialog3.show();
                } else if (queryLoanDialogPopUpsBean.hasRepaymentDialog()) {
                    QueryLoanDialogPopUpsBean.RepaymentInfo repaymentInfo = queryLoanDialogPopUpsBean.getRepaymentInfo();
                    if (repaymentInfo != null) {
                        RepayRemindDialog repayRemindDialog = new RepayRemindDialog(topActivity, repaymentInfo);
                        repayRemindDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ib.c
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                switch (i7) {
                                    case 0:
                                        SPUtils.getInstance().put(d.d(), System.currentTimeMillis());
                                        break;
                                    default:
                                        SPUtils.getInstance().put(d.f(), System.currentTimeMillis());
                                        break;
                                }
                            }
                        });
                        repayRemindDialog.setOnDismissListener(new b(mVar, 14));
                        repayRemindDialog.show();
                    }
                } else if (queryLoanDialogPopUpsBean.getCashMarketingNotifyOnlyA()) {
                    mVar.f37484c = true;
                    CLLimitedTimeBenefitsDialogFragment cLLimitedTimeBenefitsDialogFragmentNewInstance = CLLimitedTimeBenefitsDialogFragment.f29945H.newInstance(0, queryLoanDialogPopUpsBean.getCashMarketingNotifyOnlyAData());
                    cLLimitedTimeBenefitsDialogFragmentNewInstance.f31248w = new g(mVar);
                    Z supportFragmentManager = ((E) topActivity).getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    cLLimitedTimeBenefitsDialogFragmentNewInstance.show(supportFragmentManager, "showCashMarketingNotifyOnlyADataDialog");
                    mVar.d("cashMarketingNotifyOnlyA");
                } else if (queryLoanDialogPopUpsBean.getCashMarketingNotifyOnlyB()) {
                    CLLimitedTimeBenefitsDialogFragment cLLimitedTimeBenefitsDialogFragmentNewInstance2 = CLLimitedTimeBenefitsDialogFragment.f29945H.newInstance(1, queryLoanDialogPopUpsBean.getCashMarketingNotifyOnlyBData());
                    cLLimitedTimeBenefitsDialogFragmentNewInstance2.f31248w = new h(mVar);
                    Z supportFragmentManager2 = ((E) topActivity).getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                    cLLimitedTimeBenefitsDialogFragmentNewInstance2.show(supportFragmentManager2, "showCashMarketingNotifyOnlyBDataDialog");
                    mVar.d("cashMarketingNotifyOnlyB");
                } else if (queryLoanDialogPopUpsBean.getCashMarketingRepayCoupon()) {
                    CLLimitedTimeBenefitsDialogFragment cLLimitedTimeBenefitsDialogFragmentNewInstance3 = CLLimitedTimeBenefitsDialogFragment.f29945H.newInstance(2, queryLoanDialogPopUpsBean.getCashMarketingRepayCouponData());
                    cLLimitedTimeBenefitsDialogFragmentNewInstance3.f31248w = new e(mVar);
                    Z supportFragmentManager3 = ((E) topActivity).getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                    cLLimitedTimeBenefitsDialogFragmentNewInstance3.show(supportFragmentManager3, "showCashMarketingRepayCoupon");
                    mVar.d("cashMarketingRepayCoupon");
                } else if (queryLoanDialogPopUpsBean.getInstallmentLoanOpen()) {
                    QueryLoanDialogPopUpsBean.AdjustQuotaBusinessResDto installmentLoanInfo = queryLoanDialogPopUpsBean.getInstallmentLoanInfo();
                    if (installmentLoanInfo != null) {
                        if ("REPAYMENT_OPEN_INSTALLMENT_LOAN_DEL".equals(installmentLoanInfo.getTrafficChannel())) {
                            Integer ifJointDebit = installmentLoanInfo.getIfJointDebit();
                            CLInstallmentUserMigrateDialog cLInstallmentUserMigrateDialog = new CLInstallmentUserMigrateDialog(topActivity, ifJointDebit != null && ifJointDebit.intValue() == 1, queryLoanDialogPopUpsBean.getLoanProduct());
                            cLInstallmentUserMigrateDialog.setOnShowListener(new a(mVar, 12));
                            cLInstallmentUserMigrateDialog.setOnDismissListener(new b(mVar, 15));
                            cLInstallmentUserMigrateDialog.show();
                        } else if (installmentLoanInfo.getCheckSuccessFlag()) {
                            OpenInstallmentLoanReviewSuccDialog openInstallmentLoanReviewSuccDialog = new OpenInstallmentLoanReviewSuccDialog(topActivity);
                            openInstallmentLoanReviewSuccDialog.setLoanProduct(queryLoanDialogPopUpsBean.getLoanProduct());
                            openInstallmentLoanReviewSuccDialog.show();
                            openInstallmentLoanReviewSuccDialog.setOnShowListener(new a(mVar, 16));
                            openInstallmentLoanReviewSuccDialog.setOnDismissListener(new b(mVar, 18));
                            openInstallmentLoanReviewSuccDialog.fillData(installmentLoanInfo);
                        } else {
                            UpgradeInstallmentSuccDialog upgradeInstallmentSuccDialog = new UpgradeInstallmentSuccDialog(topActivity);
                            upgradeInstallmentSuccDialog.setLoanProduct(queryLoanDialogPopUpsBean.getLoanProduct());
                            upgradeInstallmentSuccDialog.show();
                            upgradeInstallmentSuccDialog.setOnShowListener(new a(mVar, 17));
                            upgradeInstallmentSuccDialog.setOnDismissListener(new b(mVar, 19));
                            upgradeInstallmentSuccDialog.fillData(installmentLoanInfo);
                        }
                    }
                } else if (queryLoanDialogPopUpsBean.getCashUnFrozen()) {
                    UnFrozenCashDialog unFrozenCashDialog = new UnFrozenCashDialog(topActivity);
                    unFrozenCashDialog.setLoanProduct(queryLoanDialogPopUpsBean.getLoanProduct());
                    unFrozenCashDialog.setOnShowListener(new a(mVar, 18));
                    unFrozenCashDialog.setOnDismissListener(new b(mVar, 20));
                    unFrozenCashDialog.show();
                } else {
                    long jLongValue = 0;
                    if (queryLoanDialogPopUpsBean.getCashOpen()) {
                        QueryLoanDialogPopUpsBean.BusinessInfo businessInfo = queryLoanDialogPopUpsBean.getBusinessInfo();
                        if (businessInfo == null || !businessInfo.getCheckSuccessFlag()) {
                            QueryLoanDialogPopUpsBean.BusinessInfo businessInfo2 = queryLoanDialogPopUpsBean.getBusinessInfo();
                            String trafficChannel = businessInfo2 != null ? businessInfo2.getTrafficChannel() : null;
                            if (trafficChannel == null || ((iHashCode = trafficChannel.hashCode()) == -378871862 ? !trafficChannel.equals("CALLBACK_USER_SELF_CREDIT_REJECT_JOB") : !(iHashCode == 91847551 ? trafficChannel.equals("RETURN_APPLY") : iHashCode == 967311380 && trafficChannel.equals("CALLBACK_USER_QUIT_CREDIT_STAY_POPUP_JOB")))) {
                                OpenCashSuccDialog openCashSuccDialog = new OpenCashSuccDialog(topActivity);
                                openCashSuccDialog.setLoanProduct(queryLoanDialogPopUpsBean.getLoanProduct());
                                openCashSuccDialog.setOnShowListener(new a(mVar, 2));
                                openCashSuccDialog.setOnDismissListener(new b(mVar, 3));
                                QueryLoanDialogPopUpsBean.BusinessInfo businessInfo3 = queryLoanDialogPopUpsBean.getBusinessInfo();
                                if (businessInfo3 != null && (cashCreditQuota = businessInfo3.getCashCreditQuota()) != null) {
                                    jLongValue = cashCreditQuota.longValue();
                                }
                                long j6 = jLongValue;
                                QueryLoanDialogPopUpsBean.BusinessInfo businessInfo4 = queryLoanDialogPopUpsBean.getBusinessInfo();
                                if (businessInfo4 != null && (subProductId = businessInfo4.getSubProductId()) != null) {
                                    iIntValue = subProductId.intValue();
                                }
                                openCashSuccDialog.fillData(j6, iIntValue);
                            } else {
                                AutoOpenCashSuccDialog autoOpenCashSuccDialog = new AutoOpenCashSuccDialog(topActivity);
                                autoOpenCashSuccDialog.setLoanProduct(queryLoanDialogPopUpsBean.getLoanProduct());
                                autoOpenCashSuccDialog.setOnShowListener(new a(mVar, 1));
                                autoOpenCashSuccDialog.setOnDismissListener(new b(mVar, 1));
                                QueryLoanDialogPopUpsBean.BusinessInfo businessInfo5 = queryLoanDialogPopUpsBean.getBusinessInfo();
                                autoOpenCashSuccDialog.fillData(businessInfo5 != null ? businessInfo5.getTrafficChannel() : null);
                            }
                        } else {
                            OpenCashLoanReviewSuccDialog openCashLoanReviewSuccDialog = new OpenCashLoanReviewSuccDialog(topActivity);
                            openCashLoanReviewSuccDialog.setLoanProduct(queryLoanDialogPopUpsBean.getLoanProduct());
                            openCashLoanReviewSuccDialog.setOnShowListener(new a(mVar, 0));
                            openCashLoanReviewSuccDialog.setOnDismissListener(new b(mVar, 0));
                            openCashLoanReviewSuccDialog.show();
                            openCashLoanReviewSuccDialog.fillData(queryLoanDialogPopUpsBean.getBusinessInfo());
                        }
                    } else if (queryLoanDialogPopUpsBean.getQuotaChange()) {
                        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = mVar.f37483b;
                        if (lifecycleCoroutineScopeImpl != null) {
                            f fVar = I.f10809a;
                            AbstractC0780y.m(lifecycleCoroutineScopeImpl, e.f19009c, null, new j(mVar, topActivity, queryLoanDialogPopUpsBean, null), 2);
                        }
                    } else if (queryLoanDialogPopUpsBean.getBorrowCycleChange()) {
                        QueryLoanDialogPopUpsBean.BusinessInfo businessInfo6 = queryLoanDialogPopUpsBean.getBusinessInfo();
                        if (businessInfo6 != null && (changeDays = businessInfo6.getChangeDays()) != null) {
                            iIntValue = changeDays.intValue();
                        }
                        if (iIntValue > 0) {
                            ArrayList arrayList = new ArrayList();
                            QueryLoanDialogPopUpsBean.BusinessInfo businessInfo7 = queryLoanDialogPopUpsBean.getBusinessInfo();
                            Integer loanPeriods = businessInfo7 != null ? businessInfo7.getLoanPeriods() : null;
                            QueryLoanDialogPopUpsBean.BusinessInfo businessInfo8 = queryLoanDialogPopUpsBean.getBusinessInfo();
                            QuotaChange quotaChange = new QuotaChange(1, String.valueOf(loanPeriods), String.valueOf(businessInfo8 != null ? businessInfo8.getLoanPeriods() : null), queryLoanDialogPopUpsBean.getLoanProduct(), null, 16, null);
                            String str = "quota_change_data" + G.A();
                            arrayList.add(quotaChange);
                            SPUtils.get().put(str, ((Gson) C0525w.f().f7166b).toJson(arrayList));
                        }
                        if (ActivityUtils.isValidActivityContext(topActivity)) {
                            CLIncreaseAmountDialog cLIncreaseAmountDialog = new CLIncreaseAmountDialog(topActivity, "borrowCycleChange", queryLoanDialogPopUpsBean.getLoanProduct(), queryLoanDialogPopUpsBean.getBusinessInfo(), null, 16, null);
                            cLIncreaseAmountDialog.setOnShowListener(new a(mVar, 3));
                            cLIncreaseAmountDialog.setOnDismissListener(new b(mVar, 4));
                            cLIncreaseAmountDialog.show();
                        }
                    } else if (queryLoanDialogPopUpsBean.getUnloanInactiveUserSendCoupon()) {
                        CLZeroInterestDiscountDialog cLZeroInterestDiscountDialog = new CLZeroInterestDiscountDialog(topActivity, queryLoanDialogPopUpsBean.getLoanProduct());
                        cLZeroInterestDiscountDialog.setOnShowListener(new a(mVar, 4));
                        cLZeroInterestDiscountDialog.setOnDismissListener(new b(mVar, 5));
                        cLZeroInterestDiscountDialog.show();
                    } else if (queryLoanDialogPopUpsBean.getMigrateAppSendCoupon()) {
                        CLMigrateInterestCouponsDialog cLMigrateInterestCouponsDialog = new CLMigrateInterestCouponsDialog(topActivity, queryLoanDialogPopUpsBean.getMigrateAppInfo());
                        cLMigrateInterestCouponsDialog.setOnShowListener(new a(mVar, 6));
                        cLMigrateInterestCouponsDialog.setOnDismissListener(new b(mVar, 6));
                        cLMigrateInterestCouponsDialog.show();
                    } else if (queryLoanDialogPopUpsBean.getHasAvailableCoupon()) {
                        CLDoubleResultRetainDialog cLDoubleResultRetainDialog = new CLDoubleResultRetainDialog(topActivity, 0, 2, null);
                        cLDoubleResultRetainDialog.setLoanProduct(queryLoanDialogPopUpsBean.getLoanProduct());
                        cLDoubleResultRetainDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ib.c
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                switch (iIntValue) {
                                    case 0:
                                        SPUtils.getInstance().put(d.d(), System.currentTimeMillis());
                                        break;
                                    default:
                                        SPUtils.getInstance().put(d.f(), System.currentTimeMillis());
                                        break;
                                }
                            }
                        });
                        cLDoubleResultRetainDialog.setOnDismissListener(new b(mVar, 7));
                        cLDoubleResultRetainDialog.show();
                    } else if (queryLoanDialogPopUpsBean.getMultiCouponSendSuccess()) {
                        CLMultiCouponSendSuccessDialogFragment cLMultiCouponSendSuccessDialogFragmentNewInstance = CLMultiCouponSendSuccessDialogFragment.f29948C.newInstance();
                        cLMultiCouponSendSuccessDialogFragmentNewInstance.f31248w = new f(mVar);
                        Z supportFragmentManager4 = ((E) topActivity).getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "getSupportFragmentManager(...)");
                        cLMultiCouponSendSuccessDialogFragmentNewInstance.show(supportFragmentManager4, "showMultiCouponSendSuccessDialog");
                    } else {
                        MultiLoanInfo multiLoanInfo = queryLoanDialogPopUpsBean.getMultiLoanInfo();
                        if (multiLoanInfo != null ? Intrinsics.c(multiLoanInfo.getShowPopup(), Boolean.TRUE) : false) {
                            String popupSummary = multiLoanInfo.getPopupSummary();
                            if ((popupSummary == null || StringsKt.F(popupSummary)) == true) {
                                objArr = false;
                            } else {
                                objArr = true;
                            }
                        } else {
                            objArr = false;
                        }
                        if (objArr == true) {
                            if (mVar.b(topActivity, queryLoanDialogPopUpsBean)) {
                                mVar.f37486e = null;
                            } else {
                                WeakReference weakReference = mVar.f37482a;
                                Object obj2 = weakReference != null ? (BaseFragment) weakReference.get() : null;
                                MultiLoanPopupHost multiLoanPopupHost = obj2 instanceof MultiLoanPopupHost ? (MultiLoanPopupHost) obj2 : null;
                                if (((multiLoanPopupHost == null || multiLoanPopupHost.findInstallmentProductForMultiLoanPopup() != null) ? 0 : 1) != 0) {
                                    mVar.f37486e = queryLoanDialogPopUpsBean;
                                    mVar.f37484c = false;
                                    F6.d.h("HomeDialogHandler", 3, "defer multiLoan popup, waiting for installment product");
                                } else {
                                    mVar.f37484c = false;
                                    ?? r10 = mVar.f37485d;
                                    if (r10 != 0) {
                                        r10.onNoDialogToHandle();
                                    }
                                }
                            }
                        } else if (queryLoanDialogPopUpsBean.getFlexiUnFrozen()) {
                            UnFrozenFlexiDialog unFrozenFlexiDialog = new UnFrozenFlexiDialog(topActivity);
                            unFrozenFlexiDialog.setOnShowListener(new a(mVar, 8));
                            unFrozenFlexiDialog.setOnDismissListener(new b(mVar, 8));
                            unFrozenFlexiDialog.show();
                        } else if (queryLoanDialogPopUpsBean.getFlexiOpen()) {
                            OpenFlexiSuccDialog openFlexiSuccDialog = new OpenFlexiSuccDialog(topActivity);
                            openFlexiSuccDialog.setOnShowListener(new a(mVar, 9));
                            openFlexiSuccDialog.setOnDismissListener(new b(mVar, 9));
                            QueryLoanDialogPopUpsBean.BusinessInfo businessInfo9 = queryLoanDialogPopUpsBean.getBusinessInfo();
                            if (businessInfo9 != null && (flexiCreditQuota = businessInfo9.getFlexiCreditQuota()) != null) {
                                jLongValue = flexiCreditQuota.longValue();
                            }
                            openFlexiSuccDialog.fillData(jLongValue);
                        } else if (queryLoanDialogPopUpsBean.getCalcReturnSendCoupon()) {
                            QueryLoanDialogPopUpsBean.CalcReturnSendCouponDTO couponDto = queryLoanDialogPopUpsBean.getCouponDto();
                            if (couponDto != null) {
                                CalcReturnSendCouponDialog calcReturnSendCouponDialog = new CalcReturnSendCouponDialog(topActivity, couponDto);
                                calcReturnSendCouponDialog.setOnShowListener(new a(mVar, 10));
                                calcReturnSendCouponDialog.setOnDismissListener(new b(mVar, 11));
                                calcReturnSendCouponDialog.show();
                            }
                        } else {
                            mVar.f37484c = false;
                            ?? r11 = mVar.f37485d;
                            if (r11 != 0) {
                                r11.onNoDialogToHandle();
                            }
                        }
                    }
                }
            }
        }
        return Unit.f38893a;
    }
}
