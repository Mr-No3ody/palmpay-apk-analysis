package Ba;

import Ac.h;
import Ad.c0;
import C0.G;
import C0.P;
import Dd.b;
import I8.o;
import I8.p;
import I8.q;
import Kd.C0367d;
import Ma.v;
import Me.r;
import N8.q0;
import O6.c;
import Pa.C0521s;
import Pa.C0525w;
import Pa.F;
import Pa.J;
import Pa.K;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pd.f;
import Rd.O;
import Rd.e0;
import Wd.C0731e;
import Wd.C0751z;
import Wf.C0753a0;
import Z6.i;
import Zf.y;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.api.Service;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.picker.picker.HoursMinutesPickerView;
import com.palmpay.lib.ui.picker.picker.TimePickerView;
import com.palmpay.lib.ui.picker.wheel.interfaces.IPickerViewData;
import com.transsnet.palmpay.account.bean.rsp.CheckPinRsp;
import com.transsnet.palmpay.account.bean.rsp.CountryRegionList;
import com.transsnet.palmpay.account.bean.rsp.GuardianRelationListBean;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyFingerPrintFragment;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifySafePinFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianRelationShipFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationAddressFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationConfirmBvnFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep2Fragment;
import com.transsnet.palmpay.airtime.bean.rsp.AutoRenewTaskBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.airtime.ui.AutoTopupOverlayActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfWithdrawalReq;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.core.bean.req.QueryBankcardUserNameReq;
import com.transsnet.palmpay.core.bean.rsp.CheckBankCardInfoRsp;
import com.transsnet.palmpay.core.bean.verify.VerifyQuestionNodeBean;
import com.transsnet.palmpay.core.rn.bridge.DatePickerBridge;
import com.transsnet.palmpay.core.ui.activity.FinancialWithdrawalPreviewActivity;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.core.ui.activity.d0;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckSafetyAssessmentQAFragment;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.databundle.ui.activity.BuyFlashSaleActivity;
import com.transsnet.palmpay.databundle.ui.activity.DataBundleAutoTopupOverlayActivity;
import com.transsnet.palmpay.main.export.bean.rsp.HomeCouponRewardsItems;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashRecordActivity;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.resp.BannerEntranceBean;
import com.transsnet.palmpay.send_money.bean.resp.RecipientMemberLogOutResp;
import com.transsnet.palmpay.send_money.ui.dialog.AccountUnavailableDialog;
import com.transsnet.palmpay.send_money.ui.fragment.AddBankAccountFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomePalmPayContactsFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeRecentlyFragment;
import com.transsnet.palmpay.send_money.util.TransferTrackingUtils;
import com.transsnet.palmpay.send_money.viewmodel.AddBankAccountViewModel;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp;
import com.transsnet.palmpay.teller.bean.DataBundleParams;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.bean.QueryRecommendReq;
import com.transsnet.palmpay.teller.bean.QueryRecommendRsp;
import com.transsnet.palmpay.teller.ui.activity.BeneficiariesActivity;
import com.transsnet.palmpay.teller.ui.activity.TvPreCheckActivity;
import com.transsnet.palmpay.teller.ui.dialog.RecommendPaymentItemDialog;
import com.transsnet.palmpay.teller.ui.fragment.BaseBillerHistoryFragment;
import com.transsnet.palmpay.ui.fragment.BankCardFragment;
import com.transsnet.palmpay.ui.fragment.TransactionHistoryFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.viewmodule.PalmZoneViewModel;
import io.fastkv.n;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Job;
import p025ba.e;
import p025ba.k;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f577b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f576a = i7;
        this.f577b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        int i7;
        int i10 = 3;
        DefaultCalcOfWithdrawalReq defaultCalcOfWithdrawalReq = (DefaultCalcOfWithdrawalReq) obj;
        PayByOrderResp rsp = (PayByOrderResp) obj2;
        int i11 = FinancialWithdrawalPreviewActivity.f27631H;
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        boolean zIsSuccess = rsp.isSuccess();
        FinancialWithdrawalPreviewActivity financialWithdrawalPreviewActivity = (FinancialWithdrawalPreviewActivity) this.f577b;
        if (zIsSuccess) {
            try {
                i7 = Integer.parseInt(financialWithdrawalPreviewActivity.s());
            } catch (Exception unused) {
                i7 = 1;
            }
            if (rsp.isSuccess() && rsp.getData() != null) {
                financialWithdrawalPreviewActivity.t = rsp.getData().payId;
                if (!rsp.getData().flag) {
                    String businessData = rsp.getData().businessData;
                    Intrinsics.checkNotNullExpressionValue(businessData, "businessData");
                    Integer num = 8;
                    if (Intrinsics.c(num.toString(), C0525w.j(businessData, "payStatus"))) {
                        K.c("999", businessData);
                        financialWithdrawalPreviewActivity.finish();
                    } else {
                        Integer numH = C0525w.h(businessData, "extVerifyMethod");
                        if (!K.b(numH, "999", businessData)) {
                            J j6 = new J();
                            j6.f7022a = "999";
                            j6.f7023b = rsp.getData();
                            j6.f7024c = financialWithdrawalPreviewActivity.f27454d;
                            j6.f7025d = financialWithdrawalPreviewActivity.f27455e;
                            j6.f7026e = defaultCalcOfWithdrawalReq != null ? defaultCalcOfWithdrawalReq.payAmount : financialWithdrawalPreviewActivity.f27461p;
                            j6.f7028g = financialWithdrawalPreviewActivity.f27460o;
                            j6.f7027f = financialWithdrawalPreviewActivity.f27456f;
                            if (K.a(j6)) {
                                financialWithdrawalPreviewActivity.finish();
                            }
                        } else if (numH == null || numH.intValue() != 3) {
                            financialWithdrawalPreviewActivity.finish();
                        }
                    }
                } else if (Intrinsics.c(financialWithdrawalPreviewActivity.f27454d, rsp.getData().orderNo)) {
                    CheckPayReq checkPayReq = new CheckPayReq();
                    checkPayReq.orderNo = rsp.getData().orderNo;
                    checkPayReq.orderType = "999";
                    checkPayReq.payId = rsp.getData().payId;
                    checkPayReq.subPayId = rsp.getData().subPayId;
                    checkPayReq.url = rsp.getData().url;
                    checkPayReq.verifyMethod = rsp.getData().verifyMethod;
                    checkPayReq.payRouteId = rsp.getData().payRouteId;
                    checkPayReq.transType = financialWithdrawalPreviewActivity.f27455e;
                    checkPayReq.otpReference = rsp.getData().otpReference;
                    checkPayReq.payAmount = defaultCalcOfWithdrawalReq != null ? defaultCalcOfWithdrawalReq.payAmount : financialWithdrawalPreviewActivity.f27461p;
                    checkPayReq.orderAmount = financialWithdrawalPreviewActivity.f27458i;
                    checkPayReq.feeAmount = 0L;
                    checkPayReq.subTransTypeCode = financialWithdrawalPreviewActivity.f27456f;
                    Intrinsics.checkNotNullParameter(checkPayReq, "checkPayReq");
                    d0 d0Var = new d0(financialWithdrawalPreviewActivity);
                    d0Var.f27748b = checkPayReq;
                    d0Var.f27758l = true;
                    d0Var.f27754h = financialWithdrawalPreviewActivity.f27460o;
                    d0Var.f27749c = rsp;
                    d0Var.f27750d = Integer.valueOf(i7);
                    d0Var.f27757k = financialWithdrawalPreviewActivity.isForceNoNightMode();
                    d0Var.f27753g = defaultCalcOfWithdrawalReq != null ? defaultCalcOfWithdrawalReq.detainmentContent : null;
                    d0Var.a();
                } else {
                    financialWithdrawalPreviewActivity.showErrorMessageDialog(financialWithdrawalPreviewActivity.getString(k.core_fail_to_pay_order));
                }
            } else if (CommonResult.CODE_BALANCE_ACCOUNT_LOCK.equals(rsp.getRespCode())) {
                d.F("/account/ask_apply_for_balance");
                financialWithdrawalPreviewActivity.finish();
            } else if (CommonResult.CODE_REQUIRE_VERIFY_BVN.equals(rsp.getRespCode())) {
                n.O(financialWithdrawalPreviewActivity, 0, Integer.valueOf(k.core_tips), null, null, null, null, rsp.getRespMsg(), Integer.valueOf(k.core_add_bvn), null, new ViewOnClickListenerC1478l(i10), Integer.valueOf(k.core_cancel), null, null, null, false, 0, 8385149).setOnDismissListener(new b(financialWithdrawalPreviewActivity, 22));
            } else {
                String respCode = rsp.getRespCode();
                if (Intrinsics.c(respCode, "33000039") || Intrinsics.c(respCode, "33000040") || Intrinsics.c(respCode, "33000041") || Intrinsics.c(respCode, "33000093")) {
                    String respCode2 = rsp.getRespCode();
                    String respMsg = rsp.getRespMsg();
                    if (respMsg == null) {
                        respMsg = "";
                    }
                    i0.i0(financialWithdrawalPreviewActivity, respCode2, respMsg, true);
                } else {
                    String respCode3 = rsp.getRespCode();
                    Intrinsics.checkNotNullExpressionValue(respCode3, "getRespCode(...)");
                    String respMsg2 = rsp.getRespMsg();
                    Intrinsics.checkNotNullExpressionValue(respMsg2, "getRespMsg(...)");
                    financialWithdrawalPreviewActivity.x(respCode3, respMsg2);
                }
            }
        } else {
            if (!TextUtils.isEmpty(rsp.getRespMsg())) {
                ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
            }
            financialWithdrawalPreviewActivity.finish();
        }
        return Unit.f38893a;
    }

    private final Object b(Object obj, Object obj2) {
        String billerName;
        String volume;
        String volumeUnit;
        String validity;
        String description;
        DataBundleWalletItemBean paymentItem;
        String description2;
        DataBundleWalletItemBean paymentItem2;
        DataBundleWalletItemBean paymentItem3;
        DataBundleWalletItemBean paymentItem4;
        DataBundleWalletItemBean paymentItem5;
        DataBundleWalletItemBean paymentItem6;
        final int i7 = 0;
        DataBundleParams dataBundleParams = (DataBundleParams) obj;
        CreateTellerOrderRsp result = (CreateTellerOrderRsp) obj2;
        int i10 = BuyFlashSaleActivity.f31762f;
        Intrinsics.checkNotNullParameter(result, "result");
        boolean zIsSuccess = result.isSuccess();
        final BuyFlashSaleActivity buyFlashSaleActivity = (BuyFlashSaleActivity) this.f577b;
        if (zIsSuccess) {
            C0751z c0751z = new C0751z(buyFlashSaleActivity, 7);
            c0751z.f4971b = result.data.orderNo;
            c0751z.c(Long.valueOf(dataBundleParams != null ? dataBundleParams.getAmount() : 0L));
            c0751z.f4972c = TransType.TRANS_TYPE_BUNDLE;
            c0751z.f4978i = result.data.calculationExtInfo;
            c0751z.f4974e = "5";
            ArrayList arrayList = new ArrayList();
            String string = buyFlashSaleActivity.getString(f.qt_biller_name);
            String str = "";
            if (dataBundleParams == null || (paymentItem6 = dataBundleParams.getPaymentItem()) == null || (billerName = paymentItem6.getBillerName()) == null) {
                billerName = "";
            }
            arrayList.add(new CoreCashierPaymentExtra(string, billerName));
            String string2 = buyFlashSaleActivity.getString(Vd.a.qt_bundle_bills);
            if (dataBundleParams == null || (paymentItem5 = dataBundleParams.getPaymentItem()) == null || (volume = paymentItem5.getVolume()) == null) {
                volume = "";
            }
            if (dataBundleParams == null || (paymentItem4 = dataBundleParams.getPaymentItem()) == null || (volumeUnit = paymentItem4.getVolumeUnit()) == null) {
                volumeUnit = "";
            }
            if (dataBundleParams == null || (paymentItem3 = dataBundleParams.getPaymentItem()) == null || (validity = paymentItem3.getValidity()) == null) {
                validity = "";
            }
            arrayList.add(new CoreCashierPaymentExtra(string2, q0.l(volume, volumeUnit, " - ", validity)));
            String string3 = buyFlashSaleActivity.getString(f.qt_recipient_mobile_number);
            String strL0 = r0.L0(dataBundleParams != null ? dataBundleParams.getMobileNumber() : null);
            if (strL0 == null) {
                strL0 = "";
            }
            arrayList.add(new CoreCashierPaymentExtra(string3, strL0));
            if (dataBundleParams == null || (paymentItem2 = dataBundleParams.getPaymentItem()) == null || (description = paymentItem2.getDescription()) == null) {
                description = "";
            }
            if (!TextUtils.isEmpty(description)) {
                String string4 = buyFlashSaleActivity.getString(Vd.a.qt_bundle_details);
                if (dataBundleParams != null && (paymentItem = dataBundleParams.getPaymentItem()) != null && (description2 = paymentItem.getDescription()) != null) {
                    str = description2;
                }
                arrayList.add(new CoreCashierPaymentExtra(string4, str));
            }
            c0751z.b(arrayList);
            c0751z.d();
            buyFlashSaleActivity.finish();
        } else if (Intrinsics.c(result.getRespCode(), "CFRONT_800101")) {
            int i11 = f.qt_confirm_mobile_information;
            final int i12 = 1;
            n.O(buyFlashSaleActivity, 0, Integer.valueOf(i11), null, null, null, null, result.getRespMsg(), Integer.valueOf(k.core_continue), null, new p054dd.n(3, dataBundleParams, buyFlashSaleActivity), Integer.valueOf(k.core_change), null, new View.OnClickListener() { // from class: ec.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuyFlashSaleActivity buyFlashSaleActivity2 = buyFlashSaleActivity;
                    switch (i7) {
                        case 0:
                            int i13 = BuyFlashSaleActivity.f31762f;
                            buyFlashSaleActivity2.m();
                            break;
                        default:
                            int i14 = BuyFlashSaleActivity.f31762f;
                            buyFlashSaleActivity2.finish();
                            break;
                    }
                }
            }, new View.OnClickListener() { // from class: ec.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuyFlashSaleActivity buyFlashSaleActivity2 = buyFlashSaleActivity;
                    switch (i12) {
                        case 0:
                            int i13 = BuyFlashSaleActivity.f31762f;
                            buyFlashSaleActivity2.m();
                            break;
                        default:
                            int i14 = BuyFlashSaleActivity.f31762f;
                            buyFlashSaleActivity2.finish();
                            break;
                    }
                }
            }, false, 0, 8327805);
        } else {
            ToastUtils.showLong(result.getRespMsg(), new Object[0]);
            buyFlashSaleActivity.finish();
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:230:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:301:0x0626  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RecipientMemberLogOutResp recipientMemberLogOutResp;
        RecipientMemberLogOutResp recipientMemberLogOutResp2;
        RecipientMemberLogOutResp recipientMemberLogOutResp3;
        String errorMessage;
        String errorMessage2;
        List list;
        int i7;
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        PpFormVertical ppFormVertical3;
        PpFormVertical ppFormVertical4;
        IPickerViewData iPickerViewData;
        List childList;
        IPickerViewData iPickerViewData2;
        List childList2;
        IPickerViewData iPickerViewData3;
        List childList3;
        e0 e0Var;
        Job job;
        O o10;
        String respMsg;
        Object obj3 = this.f577b;
        switch (this.f576a) {
            case 0:
                return DatePickerBridge.onHandle$lambda$3$lambda$2$lambda$1((DatePickerBridge) obj3, ((Long) obj).longValue(), (Long) obj2);
            case 1:
                CheckBankCardInfoReq checkBankCardInfoReq = (CheckBankCardInfoReq) obj;
                CheckBankCardInfoRsp resp = (CheckBankCardInfoRsp) obj2;
                int i10 = AddBankAccountFragment.f33648M;
                Intrinsics.checkNotNullParameter(resp, "resp");
                if (resp.isSuccess()) {
                    AddBankAccountFragment addBankAccountFragment = (AddBankAccountFragment) obj3;
                    if (Intrinsics.c(checkBankCardInfoReq != null ? checkBankCardInfoReq.bankCode : null, resp.data.bankCode)) {
                        AddBankAccountViewModel addBankAccountViewModel = (AddBankAccountViewModel) addBankAccountFragment.f27333i;
                        if (addBankAccountViewModel != null) {
                            p140j8.f.s(addBankAccountViewModel, new C0367d(new QueryBankcardUserNameReq(checkBankCardInfoReq.bankCardNo, checkBankCardInfoReq.bankCode), null), addBankAccountViewModel.f33964i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                    } else {
                        addBankAccountFragment.showLoadingDialog(false);
                        String respMsg2 = resp.getRespMsg();
                        Intrinsics.checkNotNullExpressionValue(respMsg2, "getRespMsg(...)");
                        c cVar = new c(addBankAccountFragment.requireContext());
                        cVar.e(k.core_title_attention);
                        cVar.f6605k = true;
                        cVar.f6598d = respMsg2;
                        cVar.d(k.core_payment_confirm, null);
                        O6.d dVarA = cVar.a();
                        dVarA.setCanceledOnTouchOutside(false);
                        dVarA.setCancelable(false);
                        dVarA.show();
                    }
                } else {
                    ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                }
                return Unit.f38893a;
            case 2:
                CommonResult resp2 = (CommonResult) obj2;
                int i11 = BankCardFragment.f35064B;
                Intrinsics.checkNotNullParameter(resp2, "resp");
                BankCardFragment bankCardFragment = (BankCardFragment) obj3;
                if (resp2.isSuccess()) {
                    ToastUtils.showLong(bankCardFragment.getString(h.main_bank_card_delete_success_text), new Object[0]);
                    bankCardFragment.v();
                } else {
                    p220oa.h.y(bankCardFragment, resp2.getRespMsg());
                }
                return Unit.f38893a;
            case 3:
                long jLongValue = ((Long) obj).longValue();
                int i12 = TransactionHistoryFragment.f35248k0;
                int iN0 = r0.N0(jLongValue);
                int iH0 = r0.h0(jLongValue);
                TransactionHistoryFragment transactionHistoryFragment = (TransactionHistoryFragment) obj3;
                transactionHistoryFragment.A(iN0, iH0);
                Calendar calendar = Calendar.getInstance();
                calendar.clear();
                calendar.set(iN0, iH0, 1);
                calendar.add(5, -1);
                transactionHistoryFragment.f35258Z = calendar.getTimeInMillis();
                transactionHistoryFragment.w(false);
                return Unit.f38893a;
            case 4:
                BannerEntranceBean entry = (BannerEntranceBean) obj;
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(entry, "entry");
                n0.g().k(new ClickEvent("Transfer_ToBank_QuickActions_Click").add("element_name", entry.getName()));
                TransferTrackingUtils.INSTANCE.logGridClick(TransferTrackingUtils.PAGE_TYPE_TO_BANK, entry.getName());
                String jumpUrl = entry.getJumpUrl();
                if (jumpUrl != null) {
                    String str = !TextUtils.isEmpty(jumpUrl) ? jumpUrl : null;
                    if (str != null) {
                        ActivityUtils.startActivity(F.a(((TransferToBankHomeFragment) obj3).requireContext(), str));
                    }
                }
                return Unit.f38893a;
            case 5:
                RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) obj;
                CommonBeanResult resp3 = (CommonBeanResult) obj2;
                Intrinsics.checkNotNullParameter(resp3, "resp");
                if (resp3.isSuccess() && (recipientMemberLogOutResp = (RecipientMemberLogOutResp) resp3.data) != null) {
                    Integer accountStatus = recipientMemberLogOutResp.getAccountStatus();
                    TransferToBankHomePalmPayContactsFragment transferToBankHomePalmPayContactsFragment = (TransferToBankHomePalmPayContactsFragment) obj3;
                    if (accountStatus != null && accountStatus.intValue() == 1) {
                        Context contextRequireContext = transferToBankHomePalmPayContactsFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        AccountUnavailableDialog accountUnavailableDialog = new AccountUnavailableDialog(contextRequireContext);
                        accountUnavailableDialog.show();
                        accountUnavailableDialog.setDialogInfo(recipientMemberLogOutResp);
                        accountUnavailableDialog.setData(recipientBeanV2);
                        accountUnavailableDialog.setListener(new c0(14, transferToBankHomePalmPayContactsFragment, recipientBeanV2));
                    } else if (recipientBeanV2 != null) {
                        String transType = recipientBeanV2.getTransType();
                        Integer businessType = recipientBeanV2.getBusinessType();
                        r0.O0(transType, Integer.valueOf(businessType != null ? businessType.intValue() : 0), recipientBeanV2.getAccountNo(), p002a.a.e(new Pair("core_order_source_type", transferToBankHomePalmPayContactsFragment.t), new Pair("MEMBER_ID", recipientBeanV2.getMemberId()), !TextUtils.isEmpty(recipientBeanV2.getPpAccountNo()) ? new Pair("extra_data", recipientBeanV2.getPpAccountNo()) : new Pair("extra_data", null)));
                    }
                }
                return Unit.f38893a;
            case 6:
                RecipientBeanV2 recipientBeanV3 = (RecipientBeanV2) obj;
                CommonBeanResult resp4 = (CommonBeanResult) obj2;
                Intrinsics.checkNotNullParameter(resp4, "resp");
                if (resp4.isSuccess() && (recipientMemberLogOutResp2 = (RecipientMemberLogOutResp) resp4.data) != null) {
                    Integer accountStatus2 = recipientMemberLogOutResp2.getAccountStatus();
                    TransferToPalmPayHomeFavoriteFragment transferToPalmPayHomeFavoriteFragment = (TransferToPalmPayHomeFavoriteFragment) obj3;
                    if (accountStatus2 != null && accountStatus2.intValue() == 1) {
                        Context contextRequireContext2 = transferToPalmPayHomeFavoriteFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        AccountUnavailableDialog accountUnavailableDialog2 = new AccountUnavailableDialog(contextRequireContext2);
                        accountUnavailableDialog2.show();
                        accountUnavailableDialog2.setDialogInfo(recipientMemberLogOutResp2);
                        accountUnavailableDialog2.setData(recipientBeanV3);
                        accountUnavailableDialog2.setListener(new c0(17, transferToPalmPayHomeFavoriteFragment, recipientBeanV3));
                    } else if (recipientBeanV3 != null) {
                        String transType2 = recipientBeanV3.getTransType();
                        Integer businessType2 = recipientBeanV3.getBusinessType();
                        r0.O0(transType2, Integer.valueOf(businessType2 != null ? businessType2.intValue() : 0), recipientBeanV3.getPhone(), p002a.a.e(new Pair("core_order_source_type", transferToPalmPayHomeFavoriteFragment.t), new Pair("MEMBER_ID", recipientBeanV3.getMemberId()), new Pair("existRecipient", Boolean.TRUE), !TextUtils.isEmpty(recipientBeanV3.getPpAccountNo()) ? new Pair("extra_data", recipientBeanV3.getPpAccountNo()) : new Pair("extra_data", null)));
                    }
                }
                return Unit.f38893a;
            case 7:
                BannerEntranceBean entry2 = (BannerEntranceBean) obj;
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(entry2, "entry");
                n0 n0VarG = n0.g();
                ClickEvent clickEvent = new ClickEvent("Transfer_ToPalmPay_QuickActions_Click");
                String name = entry2.getName();
                if (name == null) {
                    name = "";
                }
                n0VarG.k(clickEvent.add("element_name", name));
                TransferTrackingUtils.INSTANCE.logGridClick(TransferTrackingUtils.PAGE_TYPE_TO_PALMPAY, entry2.getName());
                String jumpUrl2 = entry2.getJumpUrl();
                if (jumpUrl2 != null) {
                    String str2 = jumpUrl2.length() > 0 ? jumpUrl2 : null;
                    if (str2 != null) {
                        TransferToPalmPayHomeFragment transferToPalmPayHomeFragment = (TransferToPalmPayHomeFragment) obj3;
                        ActivityUtils.startActivity(transferToPalmPayHomeFragment.getActivity(), F.a(transferToPalmPayHomeFragment.requireContext(), str2));
                    }
                }
                return Unit.f38893a;
            case 8:
                RecipientBeanV2 recipientBeanV4 = (RecipientBeanV2) obj;
                CommonBeanResult resp5 = (CommonBeanResult) obj2;
                int i13 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                Intrinsics.checkNotNullParameter(resp5, "resp");
                if (resp5.isSuccess() && (recipientMemberLogOutResp3 = (RecipientMemberLogOutResp) resp5.data) != null) {
                    Integer accountStatus3 = recipientMemberLogOutResp3.getAccountStatus();
                    TransferToPalmPayHomeRecentlyFragment transferToPalmPayHomeRecentlyFragment = (TransferToPalmPayHomeRecentlyFragment) obj3;
                    if (accountStatus3 != null && accountStatus3.intValue() == 1) {
                        Context contextRequireContext3 = transferToPalmPayHomeRecentlyFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        AccountUnavailableDialog accountUnavailableDialog3 = new AccountUnavailableDialog(contextRequireContext3);
                        accountUnavailableDialog3.show();
                        accountUnavailableDialog3.setDialogInfo(recipientMemberLogOutResp3);
                        accountUnavailableDialog3.setData(recipientBeanV4);
                        accountUnavailableDialog3.setListener(new c0(18, transferToPalmPayHomeRecentlyFragment, recipientBeanV4));
                    } else if (recipientBeanV4 != null) {
                        String transType3 = recipientBeanV4.getTransType();
                        Integer businessType3 = recipientBeanV4.getBusinessType();
                        r0.O0(transType3, Integer.valueOf(businessType3 != null ? businessType3.intValue() : 0), recipientBeanV4.getAccountNo(), p002a.a.e(new Pair("core_order_source_type", transferToPalmPayHomeRecentlyFragment.t), new Pair("MEMBER_ID", recipientBeanV4.getMemberId()), new Pair("existRecipient", Boolean.TRUE), !TextUtils.isEmpty(recipientBeanV4.getPpAccountNo()) ? new Pair("extra_data", recipientBeanV4.getPpAccountNo()) : new Pair("extra_data", null)));
                    }
                }
                return Unit.f38893a;
            case 9:
                CommonBeanResult rsp = (CommonBeanResult) obj2;
                CheckSafetyAssessmentQAFragment.a aVar = CheckSafetyAssessmentQAFragment.f28014A;
                Intrinsics.checkNotNullParameter(rsp, "rsp");
                CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment = (CheckSafetyAssessmentQAFragment) obj3;
                if (rsp.isSuccess() && rsp.data != 0) {
                    ((v) checkSafetyAssessmentQAFragment.f28019w.getValue()).f5926d.k((VerifyQuestionNodeBean) rsp.data);
                    P p3 = checkSafetyAssessmentQAFragment.f28018v;
                    if (p3 != null) {
                        p3.h(e.fragmentSafetyAssessmentQaQuestion, null, null);
                    }
                } else if ("1110010106".equals(rsp.getRespCode())) {
                    checkSafetyAssessmentQAFragment.A();
                }
                return Unit.f38893a;
            case 10:
                HomeCouponRewardsItems item = (HomeCouponRewardsItems) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(item, "item");
                PalmZoneViewModel palmZoneViewModel = ((r) obj3).f5997e;
                if (palmZoneViewModel != null) {
                    String str3 = item.couponCode;
                    palmZoneViewModel.d(Long.valueOf(item.claimId), iIntValue);
                }
                return Unit.f38893a;
            case 11:
                CommonBeanResult response = (CommonBeanResult) obj2;
                int i14 = VerifyFingerPrintFragment.f26112C;
                Intrinsics.checkNotNullParameter(response, "response");
                VerifyFingerPrintFragment verifyFingerPrintFragment = (VerifyFingerPrintFragment) obj3;
                if (response.isSuccess()) {
                    if (!i0.W(verifyFingerPrintFragment.getActivity())) {
                        return Unit.f38893a;
                    }
                    verifyFingerPrintFragment.w();
                    CheckPinRsp checkPinRsp = (CheckPinRsp) response.data;
                    if (checkPinRsp != null && (errorMessage = checkPinRsp.getErrorMessage()) != null) {
                        E activity = verifyFingerPrintFragment.getActivity();
                        if (activity != null) {
                            int i15 = k.core_failed_all_cap;
                            String string = verifyFingerPrintFragment.getString(BaseApplication.get().getUser().isLoginPswEnabled() ? F8.h.ac_verify_by_psw : F8.h.ac_verify_by_pin);
                            Intrinsics.e(string);
                            R8.e eVar = new R8.e(verifyFingerPrintFragment, 0);
                            int i16 = k.core_try_again;
                            K8.a aVar2 = new K8.a(22);
                            c cVar2 = new c(activity);
                            cVar2.f6614u = 1;
                            cVar2.e(i15);
                            cVar2.f6598d = errorMessage;
                            cVar2.d(i16, aVar2);
                            cVar2.f6601g = string;
                            cVar2.f6603i = eVar;
                            cVar2.f6605k = true;
                            cVar2.f6606l = 1;
                            G.v(cVar2, false, false);
                        }
                        return Unit.f38893a;
                    }
                    CheckPinRsp checkPinRsp2 = (CheckPinRsp) response.data;
                    if (checkPinRsp2 != null && checkPinRsp2.isValidate()) {
                        n0.g().k(new ClickEvent("PalmPayAutologout_VerifyType").afEvt(false).add("element_name", "VerifyType").add("element_details", "touchid"));
                        D3.a.O(new Qa.a("login", "fingerprint", "safe_lock", "success", "server_verify", null, null, null, verifyFingerPrintFragment.f26113A, 1760));
                        verifyFingerPrintFragment.z(null);
                        return Unit.f38893a;
                    }
                    CheckPinRsp checkPinRsp3 = (CheckPinRsp) response.data;
                    if (checkPinRsp3 != null && checkPinRsp3.isLock()) {
                        String string2 = verifyFingerPrintFragment.getString(F8.h.ac_msg_account_locked);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        verifyFingerPrintFragment.E(string2);
                        return Unit.f38893a;
                    }
                    verifyFingerPrintFragment.E(r0.H0(k.core_msg_authentication_fail));
                } else if (!C0521s.f7158a.j(verifyFingerPrintFragment.getActivity(), response)) {
                    String respMsg3 = response.getRespMsg();
                    Intrinsics.checkNotNullExpressionValue(respMsg3, "getRespMsg(...)");
                    verifyFingerPrintFragment.E(respMsg3);
                }
                return Unit.f38893a;
            case 12:
                String str4 = (String) obj;
                CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                Intrinsics.checkNotNullParameter(rsp2, "rsp");
                VerifySafePinFragment verifySafePinFragment = (VerifySafePinFragment) obj3;
                if (!rsp2.isSuccess()) {
                    Bc.f fVar = verifySafePinFragment.f26121j;
                    if (fVar != null) {
                        ((PinEntryView) fVar.f698d).b();
                    }
                    if (!C0521s.f7158a.j(verifySafePinFragment.getActivity(), rsp2)) {
                        String respMsg4 = rsp2.getRespMsg();
                        Intrinsics.checkNotNullExpressionValue(respMsg4, "getRespMsg(...)");
                        verifySafePinFragment.F(respMsg4);
                    }
                } else {
                    if (!i0.W(verifySafePinFragment.getActivity())) {
                        return Unit.f38893a;
                    }
                    verifySafePinFragment.w();
                    CheckPinRsp checkPinRsp4 = (CheckPinRsp) rsp2.data;
                    if (checkPinRsp4 != null && (errorMessage2 = checkPinRsp4.getErrorMessage()) != null) {
                        verifySafePinFragment.E(errorMessage2);
                        return Unit.f38893a;
                    }
                    CheckPinRsp checkPinRsp5 = (CheckPinRsp) rsp2.data;
                    if (checkPinRsp5 != null && checkPinRsp5.isValidate()) {
                        n0.g().k(new ClickEvent("PalmPayAutologout_VerifyType").afEvt(false).add("element_name", "VerifyType").add("element_details", "pin"));
                        verifySafePinFragment.z(str4);
                        return Unit.f38893a;
                    }
                    Bc.f fVar2 = verifySafePinFragment.f26121j;
                    if (fVar2 != null) {
                        ((PinEntryView) fVar2.f698d).b();
                    }
                    CheckPinRsp checkPinRsp6 = (CheckPinRsp) rsp2.data;
                    if (checkPinRsp6 != null && checkPinRsp6.isLock()) {
                        String string3 = verifySafePinFragment.getString(F8.h.ac_msg_account_locked);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        verifySafePinFragment.F(string3);
                        return Unit.f38893a;
                    }
                    int i17 = F8.h.ac_msg_pin_retry_times_left;
                    CheckPinRsp checkPinRsp7 = (CheckPinRsp) rsp2.data;
                    String string4 = verifySafePinFragment.getString(i17, Integer.valueOf(checkPinRsp7 != null ? checkPinRsp7.getValidateCount() : 0));
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    verifySafePinFragment.F(string4);
                }
                return Unit.f38893a;
            case 13:
                Boolean bool = (Boolean) obj;
                CommonListResultV2 result = (CommonListResultV2) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.isSuccess() && bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    Iterable<GuardianRelationListBean> iterable = result.data;
                    AddGuardianRelationShipFragment addGuardianRelationShipFragment = (AddGuardianRelationShipFragment) obj3;
                    if (i0.W(addGuardianRelationShipFragment.getActivity()) && !addGuardianRelationShipFragment.isDetached() && addGuardianRelationShipFragment.isAdded()) {
                        addGuardianRelationShipFragment.A().clear();
                        t tVar = addGuardianRelationShipFragment.f26138w;
                        ((List) tVar.getValue()).clear();
                        if (iterable != null) {
                            for (GuardianRelationListBean guardianRelationListBean : iterable) {
                                addGuardianRelationShipFragment.A().add(guardianRelationListBean);
                                List list2 = (List) tVar.getValue();
                                String relationName = guardianRelationListBean.relationName;
                                Intrinsics.checkNotNullExpressionValue(relationName, "relationName");
                                list2.add(relationName);
                            }
                            if (zBooleanValue) {
                                addGuardianRelationShipFragment.B();
                            }
                        }
                    }
                }
                return Unit.f38893a;
            case 14:
                Boolean bool2 = (Boolean) obj;
                CommonListResultV2 result2 = (CommonListResultV2) obj2;
                int i18 = IdentityVerificationAddressFragment.f26156Q;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2.isSuccess() && bool2 != null) {
                    boolean zBooleanValue2 = bool2.booleanValue();
                    List<T> list3 = result2.data;
                    IdentityVerificationAddressFragment identityVerificationAddressFragment = (IdentityVerificationAddressFragment) obj3;
                    if (i0.W(identityVerificationAddressFragment.getActivity()) && !identityVerificationAddressFragment.isDetached() && identityVerificationAddressFragment.isAdded() && list3 != 0 && ((list = identityVerificationAddressFragment.f26166w) == null || list.size() != list3.size())) {
                        identityVerificationAddressFragment.f26166w = list3;
                        identityVerificationAddressFragment.w().clear();
                        identityVerificationAddressFragment.f26158B = 0;
                        p pVar = (p) identityVerificationAddressFragment.f27335j;
                        String editContent = (pVar == null || (ppFormVertical2 = pVar.f4177c) == null) ? null : ppFormVertical2.getEditContent();
                        p pVar2 = (p) identityVerificationAddressFragment.f27335j;
                        String editContent2 = (pVar2 == null || (ppFormVertical = pVar2.f4178d) == null) ? null : ppFormVertical.getEditContent();
                        int i19 = 0;
                        for (T t : list3) {
                            int i20 = i19 + 1;
                            List listW = identityVerificationAddressFragment.w();
                            String areaName = t.areaName;
                            Intrinsics.checkNotNullExpressionValue(areaName, "areaName");
                            listW.add(areaName);
                            if (t.areaName.equals(editContent)) {
                                identityVerificationAddressFragment.f26158B = i19;
                                List<CountryRegionList> list4 = t.children;
                                identityVerificationAddressFragment.f26159C = list4;
                                if (list4 == null) {
                                    i7 = 0;
                                } else {
                                    if (list4.isEmpty()) {
                                        list4 = null;
                                    }
                                    if (list4 != null) {
                                        Iterator<T> it = list4.iterator();
                                        i7 = 0;
                                        while (true) {
                                            if (it.hasNext()) {
                                                int i21 = i7 + 1;
                                                if (!Intrinsics.c(editContent2, ((CountryRegionList) it.next()).areaName)) {
                                                    i7 = i21;
                                                }
                                            } else {
                                                i7 = 0;
                                            }
                                        }
                                    } else {
                                        i7 = 0;
                                    }
                                }
                                identityVerificationAddressFragment.f26160H = i7;
                            }
                            i19 = i20;
                        }
                        if (zBooleanValue2) {
                            identityVerificationAddressFragment.D();
                        }
                    }
                }
                return Unit.f38893a;
            case 15:
                long jLongValue2 = ((Long) obj).longValue();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(jLongValue2);
                IdentityVerificationConfirmBvnFragment identityVerificationConfirmBvnFragment = (IdentityVerificationConfirmBvnFragment) obj3;
                q qVar = (q) identityVerificationConfirmBvnFragment.f27335j;
                if (qVar != null && (ppFormVertical4 = qVar.f4188b) != null) {
                    ppFormVertical4.setTag(calendar2);
                }
                q qVar2 = (q) identityVerificationConfirmBvnFragment.f27335j;
                if (qVar2 != null && (ppFormVertical3 = qVar2.f4188b) != null) {
                    String strDate2String = TimeUtils.date2String(identityVerificationConfirmBvnFragment.u().getTime(), new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH));
                    Intrinsics.checkNotNullExpressionValue(strDate2String, "date2String(...)");
                    ppFormVertical3.setEditContent(strDate2String);
                }
                return Unit.f38893a;
            case 16:
                long jLongValue3 = ((Long) obj).longValue();
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTimeInMillis(jLongValue3);
                IdentityVerificationStep2Fragment identityVerificationStep2Fragment = (IdentityVerificationStep2Fragment) obj3;
                o oVar = (o) identityVerificationStep2Fragment.f27335j;
                if (oVar != null) {
                    oVar.f4168c.setTag(calendar3);
                }
                o oVar2 = (o) identityVerificationStep2Fragment.f27335j;
                if (oVar2 != null) {
                    PpFormVertical ppFormVertical5 = oVar2.f4168c;
                    String strDate2String2 = TimeUtils.date2String(identityVerificationStep2Fragment.w().getTime(), new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH));
                    Intrinsics.checkNotNullExpressionValue(strDate2String2, "date2String(...)");
                    ppFormVertical5.setEditContent(strDate2String2);
                }
                return Unit.f38893a;
            case 17:
                QueryRecommendReq queryRecommendReq = (QueryRecommendReq) obj;
                QueryRecommendRsp rsp3 = (QueryRecommendRsp) obj2;
                int i22 = BeneficiariesActivity.f34148v;
                Intrinsics.checkNotNullParameter(rsp3, "rsp");
                BeneficiariesActivity beneficiariesActivity = (BeneficiariesActivity) obj3;
                if (rsp3.billerAvailableStatus) {
                    PaymentItemBean paymentItemBean = rsp3.data;
                    if (TextUtils.isEmpty(paymentItemBean != null ? paymentItemBean.paymentItemId : null)) {
                        PaymentItemBean data = rsp3.data;
                        Intrinsics.checkNotNullExpressionValue(data, "data");
                        beneficiariesActivity.n(data, beneficiariesActivity.f34156o);
                    } else {
                        PaymentItemBean paymentItemBean2 = rsp3.data;
                        if (Intrinsics.c(paymentItemBean2 != null ? paymentItemBean2.paymentItemId : null, queryRecommendReq != null ? queryRecommendReq.paymentItemId : null)) {
                            PaymentItemBean data2 = rsp3.data;
                            Intrinsics.checkNotNullExpressionValue(data2, "data");
                            beneficiariesActivity.n(data2, beneficiariesActivity.f34156o);
                        } else {
                            RecommendPaymentItemDialog recommendPaymentItemDialog = new RecommendPaymentItemDialog(beneficiariesActivity);
                            recommendPaymentItemDialog.setCompleteCallback(new C0731e(beneficiariesActivity, rsp3));
                            recommendPaymentItemDialog.show();
                            PaymentItemBean data3 = rsp3.data;
                            Intrinsics.checkNotNullExpressionValue(data3, "data");
                            recommendPaymentItemDialog.setPaymentItem(data3);
                        }
                    }
                } else {
                    beneficiariesActivity.showErrorMessageDialog(rsp3.getRespMsg());
                }
                return Unit.f38893a;
            case 18:
                CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                CreateTellerOrderRsp rsp4 = (CreateTellerOrderRsp) obj2;
                KProperty[] kPropertyArr = TvPreCheckActivity.f34231j;
                Intrinsics.checkNotNullParameter(rsp4, "rsp");
                if (rsp4.isSuccess()) {
                    CreateTellerOrderRsp.DataBean dataBean = rsp4.data;
                    if (dataBean != null && createTellerOrderReq != null) {
                        TvPreCheckActivity tvPreCheckActivity = (TvPreCheckActivity) obj3;
                        C0751z c0751z = new C0751z(tvPreCheckActivity, 0);
                        c0751z.f4978i = dataBean.calculationExtInfo;
                        c0751z.f4971b = rsp4.data.orderNo;
                        c0751z.c(Long.valueOf(createTellerOrderReq.businessAmount));
                        c0751z.f4972c = p070ee.b.b("2");
                        c0751z.f4974e = "5";
                        ArrayList arrayList = new ArrayList();
                        String string5 = tvPreCheckActivity.getString(f.qt_biller_name);
                        String str5 = createTellerOrderReq.billerName;
                        if (str5 == null) {
                            str5 = "";
                        }
                        arrayList.add(new CoreCashierPaymentExtra(string5, str5));
                        if (!TextUtils.isEmpty(dataBean.fullName)) {
                            String string6 = tvPreCheckActivity.getString(Vd.a.qt_account_name);
                            String str6 = dataBean.fullName;
                            if (str6 == null) {
                                str6 = "";
                            }
                            arrayList.add(new CoreCashierPaymentExtra(string6, str6));
                        }
                        String str7 = createTellerOrderReq.customerDisplayName;
                        if (str7 == null) {
                            str7 = "";
                        }
                        String str8 = createTellerOrderReq.customerId;
                        if (str8 == null) {
                            str8 = "";
                        }
                        arrayList.add(new CoreCashierPaymentExtra(str7, str8));
                        if (!TextUtils.isEmpty(dataBean.address)) {
                            String string7 = tvPreCheckActivity.getString(k.core_address);
                            String str9 = dataBean.address;
                            if (str9 == null) {
                                str9 = "";
                            }
                            arrayList.add(new CoreCashierPaymentExtra(string7, str9));
                        }
                        c0751z.b(arrayList);
                        c0751z.d();
                    }
                } else {
                    ToastUtils.showLong(rsp4.getRespMsg(), new Object[0]);
                }
                return Unit.f38893a;
            case 19:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                return ((HoursMinutesPickerView) obj3).f24484v;
            case 20:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                return TimePickerView.i((TimePickerView) obj3);
            case 21:
                int iIntValue2 = ((Integer) obj).intValue();
                int iIntValue3 = ((Integer) obj2).intValue();
                X6.k kVar = (X6.k) obj3;
                List list5 = kVar.f11022e;
                if ((list5 != null ? list5.size() : 0) > iIntValue2) {
                    List list6 = kVar.f11022e;
                    if (((list6 == null || (iPickerViewData3 = (IPickerViewData) list6.get(iIntValue2)) == null || (childList3 = iPickerViewData3.getChildList()) == null) ? 0 : childList3.size()) > iIntValue3) {
                        List list7 = kVar.f11022e;
                        return (list7 == null || (iPickerViewData = (IPickerViewData) list7.get(iIntValue2)) == null || (childList = iPickerViewData.getChildList()) == null || (iPickerViewData2 = (IPickerViewData) childList.get(iIntValue3)) == null || (childList2 = iPickerViewData2.getChildList()) == null) ? z.f38935a : childList2;
                    }
                }
                return z.f38935a;
            case 22:
                Long l5 = (Long) obj;
                l5.longValue();
                Long l6 = (Long) obj2;
                i iVar = (i) obj3;
                Function2 function2 = iVar.f11555e;
                if (function2 != null) {
                    function2.invoke(l5, l6);
                }
                iVar.dismiss();
                return Unit.f38893a;
            case 23:
                Boolean bool3 = (Boolean) obj;
                CommonListResult rsp5 = (CommonListResult) obj2;
                int i23 = BaseBillerHistoryFragment.f34252v;
                Intrinsics.checkNotNullParameter(rsp5, "rsp");
                BaseBillerHistoryFragment baseBillerHistoryFragment = (BaseBillerHistoryFragment) obj3;
                e0 e0Var2 = (e0) baseBillerHistoryFragment.f27335j;
                if (e0Var2 != null && p220oa.h.e(e0Var2.f8265b) && (e0Var = (e0) baseBillerHistoryFragment.f27335j) != null) {
                    p220oa.h.s(e0Var.f8265b, false);
                }
                e0 e0Var3 = (e0) baseBillerHistoryFragment.f27335j;
                if (e0Var3 != null) {
                    p220oa.h.s(e0Var3.f8267d, true);
                }
                if (rsp5.isSuccess()) {
                    if (Intrinsics.c(bool3, Boolean.TRUE)) {
                        baseBillerHistoryFragment.u().setList(baseBillerHistoryFragment.w(rsp5.data, bool3.booleanValue()));
                    } else {
                        baseBillerHistoryFragment.u().addData((Collection<Object>) baseBillerHistoryFragment.w(rsp5.data, false));
                    }
                    CommonListResult.CommonList<T> commonList = rsp5.data;
                    if (commonList == 0 || commonList.totalPage != 0) {
                        Integer numValueOf = commonList != 0 ? Integer.valueOf(commonList.curPage) : null;
                        CommonListResult.CommonList<T> commonList2 = rsp5.data;
                        if (Intrinsics.c(numValueOf, commonList2 != 0 ? Integer.valueOf(commonList2.totalPage) : null)) {
                            baseBillerHistoryFragment.u().getLoadMoreModule().g();
                        } else {
                            CommonListResult.CommonList<T> commonList3 = rsp5.data;
                            Collection collection = commonList3 != 0 ? commonList3.list : null;
                            if (collection == null || collection.isEmpty()) {
                                baseBillerHistoryFragment.u().getLoadMoreModule().g();
                            } else {
                                baseBillerHistoryFragment.u().getLoadMoreModule().f();
                            }
                        }
                    } else {
                        baseBillerHistoryFragment.u().getLoadMoreModule().f();
                    }
                }
                e0 e0Var4 = (e0) baseBillerHistoryFragment.f27335j;
                if (e0Var4 != null) {
                    e0Var4.f8267d.setRefreshing(false);
                }
                return Unit.f38893a;
            case 24:
                int iIntValue4 = ((Integer) obj).intValue();
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                CoroutineContext.Key<?> key = element.getKey();
                CoroutineContext.Element element2 = ((y) obj3).f11803b.get(key);
                if (key == C0753a0.f10836a) {
                    Job job2 = (Job) element2;
                    Job parent = (Job) element;
                    while (true) {
                        if (parent == null) {
                            job = null;
                        } else if (parent != job2 && (parent instanceof p015ag.r)) {
                            parent = ((p015ag.r) parent).getParent();
                        } else {
                            job = parent;
                        }
                    }
                    if (job != job2) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + job + ", expected child of " + job2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (job2 != null) {
                        iIntValue4++;
                    }
                } else if (element != element2) {
                    iIntValue4 = Integer.MIN_VALUE;
                } else {
                    iIntValue4++;
                }
                return Integer.valueOf(iIntValue4);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return a(obj, obj2);
            case 26:
                Boolean bool4 = (Boolean) obj;
                CommonListResult rsp6 = (CommonListResult) obj2;
                int i24 = Recharge2CashRecordActivity.f33127g;
                Intrinsics.checkNotNullParameter(rsp6, "rsp");
                Recharge2CashRecordActivity recharge2CashRecordActivity = (Recharge2CashRecordActivity) obj3;
                O o11 = (O) recharge2CashRecordActivity.f27334c;
                if (o11 != null && p220oa.h.e(o11.f8121b) && (o10 = (O) recharge2CashRecordActivity.f27334c) != null) {
                    p220oa.h.s(o10.f8121b, false);
                }
                O o12 = (O) recharge2CashRecordActivity.f27334c;
                if (o12 != null) {
                    p220oa.h.s(o12.f8123d, true);
                }
                if (rsp6.isSuccess() && rsp6.data != null) {
                    if (Intrinsics.c(bool4, Boolean.TRUE)) {
                        recharge2CashRecordActivity.n().setList(recharge2CashRecordActivity.o(rsp6.data, bool4.booleanValue()));
                    } else {
                        recharge2CashRecordActivity.n().addData((Collection<Object>) recharge2CashRecordActivity.o(rsp6.data, false));
                    }
                    CommonListResult.CommonList<T> commonList4 = rsp6.data;
                    if (commonList4 == 0 || commonList4.totalPage != 0) {
                        Integer numValueOf2 = commonList4 != 0 ? Integer.valueOf(commonList4.curPage) : null;
                        CommonListResult.CommonList<T> commonList5 = rsp6.data;
                        if (Intrinsics.c(numValueOf2, commonList5 != 0 ? Integer.valueOf(commonList5.totalPage) : null)) {
                            recharge2CashRecordActivity.n().getLoadMoreModule().g();
                        } else {
                            recharge2CashRecordActivity.n().getLoadMoreModule().f();
                        }
                    } else {
                        recharge2CashRecordActivity.n().getLoadMoreModule().f();
                    }
                }
                O o13 = (O) recharge2CashRecordActivity.f27334c;
                if (o13 != null) {
                    o13.f8123d.setRefreshing(false);
                }
                return Unit.f38893a;
            case 27:
                return b(obj, obj2);
            case 28:
                CommonBeanResult rsp7 = (CommonBeanResult) obj2;
                int i25 = DataBundleAutoTopupOverlayActivity.f31768f;
                Intrinsics.checkNotNullParameter(rsp7, "rsp");
                DataBundleAutoTopupOverlayActivity dataBundleAutoTopupOverlayActivity = (DataBundleAutoTopupOverlayActivity) obj3;
                if (rsp7.isSuccess()) {
                    AutoRenewTaskBean autoRenewTaskBean = (AutoRenewTaskBean) rsp7.data;
                    if (TextUtils.isEmpty(autoRenewTaskBean != null ? autoRenewTaskBean.getTaskId() : null)) {
                        respMsg = rsp7.getRespMsg();
                        if (respMsg == null) {
                            respMsg = "";
                        }
                        ToastUtils.showShort(respMsg, new Object[0]);
                        dataBundleAutoTopupOverlayActivity.finish();
                    } else {
                        ToastUtils.showShort("Auto topup task added successfully!", new Object[0]);
                        Postcard postcardBuild = ARouter.getInstance().build("/databundle/auto_renew_task_status");
                        AutoRenewTaskBean autoRenewTaskBean2 = (AutoRenewTaskBean) rsp7.data;
                        postcardBuild.withString("extra_sub_id", autoRenewTaskBean2 != null ? autoRenewTaskBean2.getTaskId() : null).navigation();
                        dataBundleAutoTopupOverlayActivity.finish();
                    }
                } else {
                    respMsg = rsp7.getRespMsg();
                    if (respMsg == null) {
                        respMsg = "";
                    }
                    ToastUtils.showShort(respMsg, new Object[0]);
                    dataBundleAutoTopupOverlayActivity.finish();
                }
                return Unit.f38893a;
            default:
                CommonBeanResult rsp8 = (CommonBeanResult) obj2;
                int i26 = AutoTopupOverlayActivity.f26463f;
                Intrinsics.checkNotNullParameter(rsp8, "rsp");
                AutoTopupOverlayActivity autoTopupOverlayActivity = (AutoTopupOverlayActivity) obj3;
                if (rsp8.isSuccess()) {
                    ToastUtils.showShort("Auto topup task added successfully!", new Object[0]);
                    Postcard postcardBuild2 = ARouter.getInstance().build("/airtime/airtime_schedule_topup_task_status");
                    ScheduleTopUpTaskBean scheduleTopUpTaskBean = (ScheduleTopUpTaskBean) rsp8.data;
                    postcardBuild2.withString("extra_data_1", scheduleTopUpTaskBean != null ? scheduleTopUpTaskBean.getId() : null).navigation();
                    autoTopupOverlayActivity.finish();
                } else {
                    String respMsg5 = rsp8.getRespMsg();
                    if (respMsg5 == null) {
                        respMsg5 = "";
                    }
                    ToastUtils.showShort(respMsg5, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
