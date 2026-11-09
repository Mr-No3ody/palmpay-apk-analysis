package p141j9;

import C0.G;
import Pa.F;
import Pa.i0;
import Pa.r0;
import Pd.f;
import Vd.a;
import Wd.C0751z;
import Ya.g;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.n;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.airtime.bean.AirtimeOrderList;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAuthorizeInfoResp;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpHomeActivity;
import com.transsnet.palmpay.airtime.ui.TopUpRecordActivity;
import com.transsnet.palmpay.base.ShellApplication;
import com.transsnet.palmpay.betting.ui.activity.BettingAutoRenewOverlayActivity;
import com.transsnet.palmpay.betting.ui.activity.BettingQuickBetCreateOrderActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.bill.SubTransType;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.bean.rsp.ParseInstalmentsQrcodeRsp;
import com.transsnet.palmpay.credit.bean.req.QueryWithdrawPreReq;
import com.transsnet.palmpay.credit.bean.resp.CalcManagementFee;
import com.transsnet.palmpay.credit.bean.resp.CanCredit;
import com.transsnet.palmpay.credit.bean.resp.LoanPreCheck;
import com.transsnet.palmpay.credit.bean.resp.MoveCashAppResp;
import com.transsnet.palmpay.credit.bean.resp.QueryWithDrawData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainOkCardBill;
import com.transsnet.palmpay.credit.bean.rsp.LoanHomeRepaymentAccount;
import com.transsnet.palmpay.credit.bean.rsp.LoanHomeRepaymentDetail;
import com.transsnet.palmpay.credit.ui.activity.InputAmountActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopHomeActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLMainActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLManagementFeeDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.CLOcBillDialog;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanRepaymentListFragment;
import com.transsnet.palmpay.custom_view.PpSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.send_money.bean.req.TransferCreateOrderReq;
import com.transsnet.palmpay.send_money.bean.resp.TransferOrderCreateResp;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferToCommonAccountActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferToMobileActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableOrderListActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.teller.bean.CreateQucikBettingOrderReq;
import com.transsnet.palmpay.teller.bean.resp.CreateBettingOrderData;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1847n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p025ba.k;
import p071ef.b;
import p220oa.h;
import p221ob.c;
import p270rd.C1958a;
import p294tb.C2058u;
import p382zb.C2164g;

/* JADX INFO: renamed from: j9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1807o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacks f38420b;

    public /* synthetic */ C1807o(ComponentCallbacks componentCallbacks, int i7) {
        this.f38419a = i7;
        this.f38420b = componentCallbacks;
    }

    /* JADX WARN: Code duplicated, block: B:440:0x092c  */
    /* JADX WARN: Code duplicated, block: B:443:0x0937  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        T t;
        String customerId;
        String billerName;
        String name;
        CreateBettingOrderData.ValidateCustomer validateCustomerResp;
        CreateBettingOrderData.ValidateCustomer validateCustomerResp2;
        Long businessAmount;
        T t3;
        int signType;
        int productSubId;
        LoanPreCheck loanPreCheck;
        LoanPreCheck loanPreCheck2;
        Integer signType2;
        List<CLMainOkCardBill> okCardBillList;
        Integer applyStatus;
        CanCredit canCredit;
        CanCredit canCredit2;
        LoanPreCheck loanPreCheck3;
        Integer signType3;
        LoanPreCheck loanPreCheck4;
        CalcManagementFee calcManagementFee;
        Integer managementMode;
        MoveCashAppResp moveCashApp;
        Integer downloadOpenType;
        MoveCashAppResp moveCashApp2;
        MoveCashAppResp moveCashApp3;
        Integer downloadOpenType2;
        MoveCashAppResp moveCashApp4;
        MoveCashAppResp moveCashApp5;
        LoanHomeRepaymentDetail loanHomeRepaymentDetail;
        String androidLink;
        String str = "";
        long jLongValue = 0;
        downloadUrl = null;
        String downloadUrl = null;
        downloadUrl = null;
        String downloadUrl2 = null;
        msg = null;
        String msg = null;
        cLMainOkCardBill = null;
        CLMainOkCardBill cLMainOkCardBill = null;
        name = null;
        String name2 = null;
        String strW = null;
        int i7 = 0;
        ComponentCallbacks componentCallbacks = this.f38420b;
        switch (this.f38419a) {
            case 0:
                Function0 function0 = (Function0) obj;
                CommonBeanResult rsp = (CommonBeanResult) obj2;
                int i10 = ScheduleTopUpHomeActivity.f26471i;
                Intrinsics.checkNotNullParameter(rsp, "rsp");
                if (rsp.isSuccess()) {
                    ((ScheduleTopUpHomeActivity) componentCallbacks).f26473e = (ScheduleTopUpAuthorizeInfoResp) rsp.data;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                return Unit.f38893a;
            case 1:
                Function1 function1 = (Function1) obj;
                AirtimeOrderList rsp2 = (AirtimeOrderList) obj2;
                TopUpRecordActivity.a aVar = TopUpRecordActivity.f26486p;
                Intrinsics.checkNotNullParameter(rsp2, "rsp");
                if (!rsp2.isSuccess()) {
                    ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                    SwipeRecyclerView swipeRecyclerView = ((TopUpRecordActivity) componentCallbacks).f26487c;
                    if (swipeRecyclerView == null) {
                        Intrinsics.n("mSwipeRecyclerView");
                        throw null;
                    }
                    swipeRecyclerView.b("Load fail");
                } else if (function1 != null) {
                    function1.invoke(rsp2);
                }
                return Unit.f38893a;
            case 2:
                return ShellApplication.e((ShellApplication) componentCallbacks, (String) obj, ((Integer) obj2).intValue());
            case 3:
                Function0 function2 = (Function0) obj;
                CommonResult resp = (CommonResult) obj2;
                ArrayList arrayList = TransferResultActivity.f33237Z;
                Intrinsics.checkNotNullParameter(resp, "resp");
                if (!resp.isSuccess()) {
                    h.x((TransferResultActivity) componentCallbacks, resp.getRespMsg());
                } else if (function2 != null) {
                    function2.invoke();
                }
                return Unit.f38893a;
            case 4:
                TransferCreateOrderReq transferCreateOrderReq = (TransferCreateOrderReq) obj;
                TransferOrderCreateResp resp2 = (TransferOrderCreateResp) obj2;
                int i11 = TransferToCommonAccountActivity.f33276q0;
                Intrinsics.checkNotNullParameter(resp2, "resp");
                TransferToCommonAccountActivity transferToCommonAccountActivity = (TransferToCommonAccountActivity) componentCallbacks;
                if (resp2.isSuccess()) {
                    TransferOrderCreateResp.Data data = resp2.data;
                    if (data != null) {
                        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = transferToCommonAccountActivity.f33278Y;
                        if (balanceAndLimitData != null) {
                            if (balanceAndLimitData.balanceAmount > transferToCommonAccountActivity.y()) {
                                z3 = transferToCommonAccountActivity.n().isChecked();
                            } else {
                                BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData2 = transferToCommonAccountActivity.f33278Y;
                                if ((balanceAndLimitData2 != null ? balanceAndLimitData2.cashBox : 0L) > transferToCommonAccountActivity.y()) {
                                    if (transferToCommonAccountActivity.n().isChecked()) {
                                    }
                                }
                            }
                        }
                        C1958a c1958a = new C1958a(transferToCommonAccountActivity);
                        c1958a.f41720n = data.accountNo;
                        c1958a.f41718l = Integer.valueOf(data.businessType);
                        c1958a.f41719m = z3;
                        c1958a.f4971b = data.orderNo;
                        c1958a.c(Long.valueOf(data.amount));
                        c1958a.f4976g = data.payeeAccountType;
                        c1958a.f4972c = transferCreateOrderReq != null ? transferCreateOrderReq.getTransType() : null;
                        c1958a.f4978i = data.calculationExtInfo;
                        c1958a.f4974e = "1";
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new CoreCashierPaymentExtra(transferToCommonAccountActivity.getString(k.core_account_number), 10 == data.businessType ? i0.E(data.accountNo) : i0.o(data.accountNo)));
                        if (!TextUtils.isEmpty(data.recipientFullName)) {
                            arrayList2.add(new CoreCashierPaymentExtra(transferToCommonAccountActivity.getString(k.core_name), data.recipientFullName));
                        }
                        c1958a.b(arrayList2);
                        c1958a.d();
                    }
                } else if (TextUtils.isEmpty(resp2.getRespMsg())) {
                    h.x(transferToCommonAccountActivity, transferToCommonAccountActivity.getString(p159kd.h.sm_create_transfer_order_fail));
                } else {
                    h.x(transferToCommonAccountActivity, resp2.getRespMsg());
                }
                return Unit.f38893a;
            case 5:
                TransferCreateOrderReq transferCreateOrderReq2 = (TransferCreateOrderReq) obj;
                TransferOrderCreateResp resp3 = (TransferOrderCreateResp) obj2;
                int i12 = TransferToMobileActivity.f33282v0;
                Intrinsics.checkNotNullParameter(resp3, "resp");
                TransferToMobileActivity transferToMobileActivity = (TransferToMobileActivity) componentCallbacks;
                if (resp3.isSuccess()) {
                    TransferOrderCreateResp.Data data2 = resp3.data;
                    if (data2 != null) {
                        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData3 = transferToMobileActivity.f33284Y;
                        z3 = balanceAndLimitData3 != null && balanceAndLimitData3.balanceAmount > transferToMobileActivity.y() && transferToMobileActivity.n().isChecked();
                        C1958a c1958a2 = new C1958a(transferToMobileActivity);
                        int i13 = data2.businessType;
                        c1958a2.f41720n = i13 == 10 ? data2.accountNo : data2.recipientPhone;
                        c1958a2.f41718l = Integer.valueOf(i13);
                        c1958a2.f41719m = z3;
                        c1958a2.f4971b = data2.orderNo;
                        c1958a2.c(Long.valueOf(data2.amount));
                        c1958a2.f4976g = data2.payeeAccountType;
                        c1958a2.f4972c = transferCreateOrderReq2 != null ? transferCreateOrderReq2.getTransType() : null;
                        c1958a2.f4978i = data2.calculationExtInfo;
                        c1958a2.f4974e = "1";
                        ArrayList arrayList3 = new ArrayList();
                        String string = transferToMobileActivity.getString(k.core_account_number);
                        if (data2.businessType == 10) {
                            String str2 = data2.accountNo;
                            if (str2 != null) {
                                strW = r0.w(str2);
                            }
                        } else {
                            String recipientPhone = data2.recipientPhone;
                            Intrinsics.checkNotNullExpressionValue(recipientPhone, "recipientPhone");
                            strW = r0.w(recipientPhone);
                        }
                        arrayList3.add(new CoreCashierPaymentExtra(string, strW));
                        if (!TextUtils.isEmpty(data2.recipientFullName)) {
                            arrayList3.add(new CoreCashierPaymentExtra(transferToMobileActivity.getString(k.core_name), data2.recipientFullName));
                        }
                        c1958a2.b(arrayList3);
                        c1958a2.d();
                    }
                } else if (TextUtils.isEmpty(resp3.getRespMsg())) {
                    h.x(transferToMobileActivity, transferToMobileActivity.getString(p159kd.h.sm_create_transfer_order_fail));
                } else {
                    h.x(transferToMobileActivity, resp3.getRespMsg());
                }
                return Unit.f38893a;
            case 6:
                CommonBeanResult rsp3 = (CommonBeanResult) obj2;
                int i14 = BettingAutoRenewOverlayActivity.f26654g;
                Intrinsics.checkNotNullParameter(rsp3, "rsp");
                if (rsp3.isSuccess()) {
                    ToastUtils.showShort("Auto Top-up plan added successfully!", new Object[0]);
                } else {
                    String respMsg = rsp3.getRespMsg();
                    ToastUtils.showShort(respMsg != null ? respMsg : "", new Object[0]);
                }
                ((BettingAutoRenewOverlayActivity) componentCallbacks).finish();
                return Unit.f38893a;
            case 7:
                CreateQucikBettingOrderReq createQucikBettingOrderReq = (CreateQucikBettingOrderReq) obj;
                CommonBeanResult rsp4 = (CommonBeanResult) obj2;
                int i15 = BettingQuickBetCreateOrderActivity.f26686g;
                Intrinsics.checkNotNullParameter(rsp4, "rsp");
                BettingQuickBetCreateOrderActivity bettingQuickBetCreateOrderActivity = (BettingQuickBetCreateOrderActivity) componentCallbacks;
                if (rsp4.isSuccess() && (t = rsp4.data) != 0) {
                    CreateBettingOrderData.ValidateCustomer validateCustomerResp3 = ((CreateBettingOrderData) t).getValidateCustomerResp();
                    if (validateCustomerResp3 == null || validateCustomerResp3.getExists()) {
                        C0751z c0751z = new C0751z(bettingQuickBetCreateOrderActivity, 11);
                        CreateBettingOrderData createBettingOrderData = (CreateBettingOrderData) rsp4.data;
                        c0751z.f4971b = createBettingOrderData != null ? createBettingOrderData.getOrderNo() : null;
                        if (createQucikBettingOrderReq != null && (businessAmount = createQucikBettingOrderReq.getBusinessAmount()) != null) {
                            jLongValue = businessAmount.longValue();
                        }
                        c0751z.c(Long.valueOf(jLongValue));
                        CreateBettingOrderData createBettingOrderData2 = (CreateBettingOrderData) rsp4.data;
                        c0751z.f4972c = createBettingOrderData2 != null ? createBettingOrderData2.getTransType() : null;
                        CreateBettingOrderData createBettingOrderData3 = (CreateBettingOrderData) rsp4.data;
                        c0751z.f4978i = createBettingOrderData3 != null ? createBettingOrderData3.getCalculationExtInfo() : null;
                        c0751z.f4973d = SubTransType.INSTANCE.getSUB_TRANS_TYPE_QUICK_BETTING();
                        c0751z.f4974e = "999";
                        ArrayList arrayList4 = new ArrayList();
                        String string2 = bettingQuickBetCreateOrderActivity.getString(a.qt_user_id);
                        if (createQucikBettingOrderReq == null || (customerId = createQucikBettingOrderReq.getCustomerId()) == null) {
                            customerId = "";
                        }
                        arrayList4.add(new CoreCashierPaymentExtra(string2, customerId));
                        CreateBettingOrderData createBettingOrderData4 = (CreateBettingOrderData) rsp4.data;
                        if (createBettingOrderData4 != null && (validateCustomerResp2 = createBettingOrderData4.getValidateCustomerResp()) != null) {
                            name2 = validateCustomerResp2.getName();
                        }
                        if (!TextUtils.isEmpty(name2)) {
                            String string3 = bettingQuickBetCreateOrderActivity.getString(a.qt_account_name);
                            CreateBettingOrderData createBettingOrderData5 = (CreateBettingOrderData) rsp4.data;
                            if (createBettingOrderData5 == null || (validateCustomerResp = createBettingOrderData5.getValidateCustomerResp()) == null || (name = validateCustomerResp.getName()) == null) {
                                name = "";
                            }
                            arrayList4.add(new CoreCashierPaymentExtra(string3, name));
                        }
                        String string4 = bettingQuickBetCreateOrderActivity.getString(f.qt_biller_name);
                        CreateBettingOrderData createBettingOrderData6 = (CreateBettingOrderData) rsp4.data;
                        if (createBettingOrderData6 != null && (billerName = createBettingOrderData6.getBillerName()) != null) {
                            str = billerName;
                        }
                        arrayList4.add(new CoreCashierPaymentExtra(string4, str));
                        c0751z.b(arrayList4);
                        c0751z.d();
                    } else {
                        ToastUtils.showLong(bettingQuickBetCreateOrderActivity.getString(f.qt_user_id_is_invalid), new Object[0]);
                    }
                }
                bettingQuickBetCreateOrderActivity.finish();
                return Unit.f38893a;
            case 8:
                TransferOrderCreateResp resp4 = (TransferOrderCreateResp) obj2;
                KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                Intrinsics.checkNotNullParameter(resp4, "resp");
                InputAmountActivity inputAmountActivity = (InputAmountActivity) componentCallbacks;
                if (resp4.isSuccess()) {
                    TransferOrderCreateResp.Data data3 = resp4.data;
                    if (data3 != null) {
                        C1958a c1958a3 = new C1958a(inputAmountActivity);
                        c1958a3.f41720n = data3.accountNo;
                        c1958a3.f41718l = Integer.valueOf(data3.businessType);
                        c1958a3.f4976g = data3.payeeAccountType;
                        c1958a3.f4971b = data3.orderNo;
                        c1958a3.c(Long.valueOf(data3.amount));
                        c1958a3.f4978i = data3.calculationExtInfo;
                        c1958a3.f4972c = "03";
                        c1958a3.f4974e = "1";
                        ArrayList arrayList5 = new ArrayList();
                        String string5 = inputAmountActivity.getString(k.core_account_number);
                        String accountNo = data3.accountNo;
                        Intrinsics.checkNotNullExpressionValue(accountNo, "accountNo");
                        arrayList5.add(new CoreCashierPaymentExtra(string5, r0.w(accountNo)));
                        if (!TextUtils.isEmpty(data3.recipientFullName)) {
                            arrayList5.add(new CoreCashierPaymentExtra(inputAmountActivity.getString(k.core_name), data3.recipientFullName));
                        }
                        c1958a3.b(arrayList5);
                        c1958a3.d();
                    }
                } else if (TextUtils.isEmpty(resp4.getRespMsg())) {
                    h.x(inputAmountActivity, inputAmountActivity.getString(g.cs_create_transfer_order_fail));
                } else {
                    h.x(inputAmountActivity, resp4.getRespMsg());
                }
                return Unit.f38893a;
            case 9:
                String str3 = (String) obj;
                ParseInstalmentsQrcodeRsp resp5 = (ParseInstalmentsQrcodeRsp) obj2;
                int i16 = PayShopHomeActivity.f28705p0;
                Intrinsics.checkNotNullParameter(resp5, "resp");
                PayShopHomeActivity payShopHomeActivity = (PayShopHomeActivity) componentCallbacks;
                if (resp5.isSuccess()) {
                    ParseInstalmentsQrcodeRsp.DataBean dataBean = resp5.data;
                    if (dataBean != null && Intrinsics.c(str3, payShopHomeActivity.o())) {
                        if (dataBean.type == 1) {
                            switch (dataBean.status) {
                                case -1:
                                    payShopHomeActivity.x(payShopHomeActivity.getString(g.cs_merchant_id_not_find));
                                    break;
                                case 0:
                                case 3:
                                    payShopHomeActivity.n(dataBean);
                                    break;
                                case 1:
                                case 2:
                                case 4:
                                case 5:
                                    payShopHomeActivity.x(payShopHomeActivity.getString(g.cs_merchant_not_support));
                                    break;
                                default:
                                    payShopHomeActivity.x(payShopHomeActivity.getString(g.cs_merchant_id_not_find));
                                    break;
                            }
                        } else {
                            payShopHomeActivity.n(dataBean);
                        }
                    }
                } else {
                    payShopHomeActivity.x(resp5.getRespMsg());
                }
                return Unit.f38893a;
            case 10:
                Long l5 = (Long) obj;
                l5.getClass();
                int i17 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                ScheduleTransferForBankUnstableOrderListActivity scheduleTransferForBankUnstableOrderListActivity = (ScheduleTransferForBankUnstableOrderListActivity) componentCallbacks;
                scheduleTransferForBankUnstableOrderListActivity.n(l5);
                PpSwipeRefreshLayout ppSwipeRefreshLayoutR = scheduleTransferForBankUnstableOrderListActivity.r();
                ppSwipeRefreshLayoutR.setRefreshing(true);
                SwipeRefreshLayout.OnRefreshListener onRefreshListener = ppSwipeRefreshLayoutR.f31095a;
                if (onRefreshListener != null) {
                    onRefreshListener.onRefresh();
                }
                return Unit.f38893a;
            case 11:
                TransferCreateOrderReq transferCreateOrderReq3 = (TransferCreateOrderReq) obj;
                TransferOrderCreateResp resp6 = (TransferOrderCreateResp) obj2;
                TransferToBankInputAmountActivity.a aVar2 = TransferToBankInputAmountActivity.f33522C;
                Intrinsics.checkNotNullParameter(resp6, "resp");
                TransferToBankInputAmountActivity transferToBankInputAmountActivity = (TransferToBankInputAmountActivity) componentCallbacks;
                if (resp6.isSuccess()) {
                    Intrinsics.checkNotNullParameter(resp6, "resp");
                    TransferOrderCreateResp.Data data4 = resp6.data;
                    if (data4 != null) {
                        C1958a c1958a4 = new C1958a(transferToBankInputAmountActivity);
                        c1958a4.f41720n = data4.accountNo;
                        c1958a4.f41718l = Integer.valueOf(data4.businessType);
                        c1958a4.f4976g = data4.payeeAccountType;
                        c1958a4.f4971b = data4.orderNo;
                        c1958a4.c(Long.valueOf(data4.amount));
                        c1958a4.f4972c = transferCreateOrderReq3 != null ? transferCreateOrderReq3.getTransType() : null;
                        c1958a4.f4978i = data4.calculationExtInfo;
                        c1958a4.f4974e = "1";
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(new CoreCashierPaymentExtra(transferToBankInputAmountActivity.getString(k.core_account_number), data4.accountNo));
                        if (!TextUtils.isEmpty(data4.recipientFullName)) {
                            arrayList6.add(new CoreCashierPaymentExtra(transferToBankInputAmountActivity.getString(k.core_name), data4.recipientFullName));
                        }
                        String string6 = transferToBankInputAmountActivity.getString(k.core_bank);
                        BankInfo bankInfo = transferToBankInputAmountActivity.f33526e;
                        arrayList6.add(new CoreCashierPaymentExtra(string6, bankInfo != null ? bankInfo.bankName : null));
                        c1958a4.b(arrayList6);
                        c1958a4.d();
                    }
                } else if (TextUtils.isEmpty(resp6.getRespMsg())) {
                    h.x(transferToBankInputAmountActivity, transferToBankInputAmountActivity.getString(p159kd.h.sm_create_transfer_order_fail));
                } else {
                    h.x(transferToBankInputAmountActivity, resp6.getRespMsg());
                }
                return Unit.f38893a;
            case 12:
                TransferCreateOrderReq transferCreateOrderReq4 = (TransferCreateOrderReq) obj;
                TransferOrderCreateResp resp7 = (TransferOrderCreateResp) obj2;
                int i18 = TransferToPalmPayInputAmountActivity.f33602Y;
                Intrinsics.checkNotNullParameter(resp7, "resp");
                TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity = (TransferToPalmPayInputAmountActivity) componentCallbacks;
                if (resp7.isSuccess()) {
                    TransferOrderCreateResp.Data data5 = resp7.data;
                    if (data5 != null) {
                        C1958a c1958a5 = new C1958a(transferToPalmPayInputAmountActivity);
                        c1958a5.f41720n = data5.recipientPhone;
                        c1958a5.f41718l = Integer.valueOf(data5.businessType);
                        c1958a5.f41719m = false;
                        c1958a5.f4971b = data5.orderNo;
                        c1958a5.c(Long.valueOf(data5.amount));
                        c1958a5.f4972c = transferCreateOrderReq4 != null ? transferCreateOrderReq4.getTransType() : null;
                        c1958a5.f4976g = data5.payeeAccountType;
                        c1958a5.f4978i = data5.calculationExtInfo;
                        c1958a5.f4974e = "1";
                        ArrayList arrayList7 = new ArrayList();
                        String string7 = transferToPalmPayInputAmountActivity.getString(k.core_account_number);
                        String recipientPhone2 = data5.recipientPhone;
                        Intrinsics.checkNotNullExpressionValue(recipientPhone2, "recipientPhone");
                        arrayList7.add(new CoreCashierPaymentExtra(string7, r0.w(recipientPhone2)));
                        if (!TextUtils.isEmpty(data5.recipientFullName)) {
                            arrayList7.add(new CoreCashierPaymentExtra(transferToPalmPayInputAmountActivity.getString(k.core_name), data5.recipientFullName));
                        }
                        arrayList7.add(new CoreCashierPaymentExtra(transferToPalmPayInputAmountActivity.getString(k.core_bank), "PalmPay"));
                        c1958a5.b(arrayList7);
                        c1958a5.d();
                    }
                } else if (TextUtils.isEmpty(resp7.getRespMsg())) {
                    h.x(transferToPalmPayInputAmountActivity, transferToPalmPayInputAmountActivity.getString(p159kd.h.sm_create_transfer_order_fail));
                } else {
                    h.x(transferToPalmPayInputAmountActivity, resp7.getRespMsg());
                }
                return Unit.f38893a;
            case 13:
                QueryWithdrawPreReq queryWithdrawPreReq = (QueryWithdrawPreReq) obj;
                CommonBeanResult it = (CommonBeanResult) obj2;
                int i19 = CLMainFragment.j1;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.isSuccess() && (t3 = it.data) != 0) {
                    MoveCashAppResp moveCashApp6 = ((QueryWithDrawData) t3).getMoveCashApp();
                    CLMainFragment cLMainFragment = (CLMainFragment) componentCallbacks;
                    if (moveCashApp6 != null ? Intrinsics.c(moveCashApp6.getMoveStrategy(), Boolean.TRUE) : false) {
                        if (AppUtils.isAppInstalled("com.legend.cash")) {
                            i0.Z(cLMainFragment.getContext());
                        } else {
                            QueryWithDrawData queryWithDrawData = (QueryWithDrawData) it.data;
                            if (!TextUtils.isEmpty((queryWithDrawData == null || (moveCashApp5 = queryWithDrawData.getMoveCashApp()) == null) ? null : moveCashApp5.getDownloadUrl())) {
                                QueryWithDrawData queryWithDrawData2 = (QueryWithDrawData) it.data;
                                if (queryWithDrawData2 == null || (moveCashApp3 = queryWithDrawData2.getMoveCashApp()) == null || (downloadOpenType2 = moveCashApp3.getDownloadOpenType()) == null || downloadOpenType2.intValue() != 3) {
                                    QueryWithDrawData queryWithDrawData3 = (QueryWithDrawData) it.data;
                                    if (queryWithDrawData3 != null && (moveCashApp = queryWithDrawData3.getMoveCashApp()) != null && (downloadOpenType = moveCashApp.getDownloadOpenType()) != null && downloadOpenType.intValue() == 4) {
                                        QueryWithDrawData queryWithDrawData4 = (QueryWithDrawData) it.data;
                                        if (queryWithDrawData4 != null && (moveCashApp2 = queryWithDrawData4.getMoveCashApp()) != null) {
                                            downloadUrl2 = moveCashApp2.getDownloadUrl();
                                        }
                                        i0.c0(downloadUrl2);
                                    }
                                } else {
                                    QueryWithDrawData queryWithDrawData5 = (QueryWithDrawData) it.data;
                                    if (queryWithDrawData5 != null && (moveCashApp4 = queryWithDrawData5.getMoveCashApp()) != null) {
                                        downloadUrl = moveCashApp4.getDownloadUrl();
                                    }
                                    ActivityUtils.startActivity(IntentUtils.getOpenUrlIntent(downloadUrl, true));
                                }
                            }
                        }
                        return Unit.f38893a;
                    }
                    QueryWithDrawData queryWithDrawData6 = (QueryWithDrawData) it.data;
                    if (((queryWithDrawData6 == null || (calcManagementFee = queryWithDrawData6.getCalcManagementFee()) == null || (managementMode = calcManagementFee.getManagementMode()) == null) ? -1 : managementMode.intValue()) == 1) {
                        if (cLMainFragment.requireContext() != null) {
                            if (SPUtils.getInstance().getBoolean(BaseApplication.get().getUser().getMemberId(), true)) {
                                CLManagementFeeDialogFragment cLManagementFeeDialogFragmentNewInstance = CLManagementFeeDialogFragment.f29947C.newInstance();
                                Z childFragmentManager = cLMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                cLManagementFeeDialogFragmentNewInstance.show(childFragmentManager, "showCLManagementFeeDialog");
                                SPUtils.getInstance().put(BaseApplication.get().getUser().getMemberId(), false);
                            } else {
                                i0.c0("https://h5.fleximfb.com/cash/download-guide?source=CashHome&m=" + G.k());
                            }
                        }
                        return Unit.f38893a;
                    }
                    QueryWithDrawData queryWithDrawData7 = (QueryWithDrawData) it.data;
                    if (!((queryWithDrawData7 == null || (loanPreCheck4 = queryWithDrawData7.getLoanPreCheck()) == null) ? false : Intrinsics.c(loanPreCheck4.getNeedRoute(), Boolean.TRUE))) {
                        QueryWithDrawData queryWithDrawData8 = (QueryWithDrawData) it.data;
                        if (((queryWithDrawData8 == null || (loanPreCheck3 = queryWithDrawData8.getLoanPreCheck()) == null || (signType3 = loanPreCheck3.getSignType()) == null || signType3.intValue() != 1) ? false : true) == false) {
                            QueryWithDrawData queryWithDrawData9 = (QueryWithDrawData) it.data;
                            if ((queryWithDrawData9 == null || (canCredit2 = queryWithDrawData9.getCanCredit()) == null) ? false : Intrinsics.c(canCredit2.getCan(), Boolean.FALSE)) {
                                QueryWithDrawData queryWithDrawData10 = (QueryWithDrawData) it.data;
                                if (queryWithDrawData10 != null && (canCredit = queryWithDrawData10.getCanCredit()) != null) {
                                    msg = canCredit.getMsg();
                                }
                                n.u(msg);
                                return Unit.f38893a;
                            }
                            Integer productSubId2 = queryWithdrawPreReq != null ? queryWithdrawPreReq.getProductSubId() : null;
                            CLMainData cLMainData = cLMainFragment.f30266W0;
                            Integer shuntType = cLMainData != null ? cLMainData.getShuntType() : null;
                            if (shuntType != null && shuntType.intValue() == 1) {
                                c.f40268a.getInstance().getClass();
                                c.a().getH5BorrowUrl(productSubId2).k(p298tf.f.f42629b).i(b.a()).subscribe(new C2164g(cLMainFragment, i7));
                            } else if (shuntType != null && shuntType.intValue() == 2) {
                                cLMainFragment.showLoadingDialog(false);
                                if (AppUtils.isAppInstalled("com.legend.cash")) {
                                    i0.Z(cLMainFragment.getContext());
                                } else {
                                    CLMainData cLMainData2 = cLMainFragment.f30266W0;
                                    if (TextUtils.isEmpty(cLMainData2 != null ? cLMainData2.getCashAppDownloadUrl() : null)) {
                                        ToastUtils.showLong("download Flexi Cash url is null", new Object[0]);
                                    } else {
                                        CLMainData cLMainData3 = cLMainFragment.f30266W0;
                                        i0.c0(cLMainData3 != null ? cLMainData3.getCashAppDownloadUrl() : null);
                                    }
                                }
                            } else {
                                Context context = cLMainFragment.getContext();
                                if (context != null) {
                                    cLMainFragment.showLoadingDialog(false);
                                    CLMainData cLMainData4 = cLMainFragment.f30266W0;
                                    if (cLMainData4 == null || (applyStatus = cLMainData4.getApplyStatus()) == null || applyStatus.intValue() != 0) {
                                        CLMainData cLMainData5 = cLMainFragment.f30266W0;
                                        if (Intrinsics.c(cLMainData5 != null ? cLMainData5.getUserTag() : null, CLMainData.CL_STATUS_RE_ACTIVE)) {
                                            E activity = cLMainFragment.getActivity();
                                            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.credit.ui.activity.cashloan.CLMainActivity");
                                            ((CLMainActivity) activity).activeCashLoan((String) cLMainFragment.d1.get(productSubId2));
                                        } else {
                                            CLMainData cLMainData6 = cLMainFragment.f30266W0;
                                            List<CLMainOkCardBill> okCardBillList2 = cLMainData6 != null ? cLMainData6.getOkCardBillList() : null;
                                            if (okCardBillList2 == null || okCardBillList2.isEmpty()) {
                                                ARouter.getInstance().build("/credit_score/cl_borrow_activity").withInt("cl_account_type", (productSubId2 != null && productSubId2.intValue() == 2) ? 9 : 7).navigation();
                                            } else {
                                                CLMainData cLMainData7 = cLMainFragment.f30266W0;
                                                if (cLMainData7 != null && (okCardBillList = cLMainData7.getOkCardBillList()) != null) {
                                                    cLMainOkCardBill = okCardBillList.get(0);
                                                }
                                                new CLOcBillDialog(context, cLMainOkCardBill).show();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    p143jb.g dVar = p143jb.g.f38511o.getInstance();
                    Integer productSubId3 = queryWithdrawPreReq != null ? queryWithdrawPreReq.getProductSubId() : null;
                    CLMainData cLMainData8 = cLMainFragment.f30266W0;
                    Integer shuntType2 = cLMainData8 != null ? cLMainData8.getShuntType() : null;
                    QueryWithDrawData queryWithDrawData11 = (QueryWithDrawData) it.data;
                    p143jb.g.g(dVar, productSubId3, shuntType2, "LOAN_WITHDRAW", cLMainFragment, (queryWithDrawData11 == null || (loanPreCheck2 = queryWithDrawData11.getLoanPreCheck()) == null || (signType2 = loanPreCheck2.getSignType()) == null) ? -1 : signType2.intValue(), null, null, 480);
                    Eb.g gVar = Eb.g.f2277b;
                    Eb.f fVarA = gVar.a("cs_cl_key_sign_type");
                    QueryWithDrawData queryWithDrawData12 = (QueryWithDrawData) it.data;
                    if (queryWithDrawData12 == null || (loanPreCheck = queryWithDrawData12.getLoanPreCheck()) == null || (signType = loanPreCheck.getSignType()) == null) {
                        signType = -1;
                    }
                    fVarA.k(signType);
                    Eb.f fVarA2 = gVar.a("cs_cl_key_product_sub_id");
                    if (queryWithdrawPreReq == null || (productSubId = queryWithdrawPreReq.getProductSubId()) == null) {
                        productSubId = 1;
                    }
                    fVarA2.k(productSubId);
                    C2058u c2058u = cLMainFragment.f30277h1;
                    if (c2058u != null) {
                        c2058u.onLoanProductChange("LOAN_WITHDRAW");
                    }
                    return Unit.f38893a;
                }
                ToastUtils.showShort(it.getRespMsg(), new Object[0]);
                return Unit.f38893a;
            default:
                LoanHomeRepaymentAccount account = (LoanHomeRepaymentAccount) obj;
                LoanHomeRepaymentDetail detail = (LoanHomeRepaymentDetail) obj2;
                LoanRepaymentListFragment.a aVar3 = LoanRepaymentListFragment.f30356w;
                Intrinsics.checkNotNullParameter(account, "account");
                Intrinsics.checkNotNullParameter(detail, "detail");
                List<LoanHomeRepaymentDetail> detailList = account.getDetailList();
                LoanRepaymentListFragment loanRepaymentListFragment = (LoanRepaymentListFragment) componentCallbacks;
                if (detailList == null || (loanHomeRepaymentDetail = detailList.get(0)) == null || (androidLink = loanHomeRepaymentDetail.getAndroidLink()) == null) {
                    loanRepaymentListFragment.getClass();
                    Intrinsics.checkNotNullParameter(account, "outstandingAccount");
                    Intrinsics.checkNotNullParameter(detail, "detail");
                    Integer accountType = account.getAccountType();
                    if (accountType != null && accountType.intValue() == 6) {
                        ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, account.getCardNo()).navigation(loanRepaymentListFragment.getContext());
                    } else if (accountType != null && accountType.intValue() == 11) {
                        d.F("/credit_score/oc_home_mobile_installment_standalone_activity");
                    } else if (accountType != null && accountType.intValue() == 13) {
                        Long billId = detail.getBillId();
                        Intrinsics.checkNotNullParameter(account, "account");
                        Integer outstandingBillCount = account.getOutstandingBillCount();
                        if ((outstandingBillCount != null ? outstandingBillCount.intValue() : 0) > 1) {
                            d.x(null, "PalmPayCardMultiTerms");
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("billId", billId != null ? billId.longValue() : 0L);
                            d.x(bundle, "PalmPayCardRepayment");
                        }
                    } else {
                        Integer[] elements = {7, 9, 14};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        if (CollectionsKt.A(C1847n.A(elements), accountType)) {
                            Bundle bundle2 = new Bundle();
                            Long billId2 = detail.getBillId();
                            if (billId2 != null) {
                                bundle2.putLong("billId", billId2.longValue());
                            }
                            bundle2.putString("loanProduct", account.getLoanProduct());
                            bundle2.putBoolean("repayAllFlag", false);
                            d.x(bundle2, "LoanRepayHome");
                        }
                    }
                } else {
                    ActivityUtils.startActivity(F.a(loanRepaymentListFragment.getContext(), androidLink));
                }
                return Unit.f38893a;
        }
    }
}
