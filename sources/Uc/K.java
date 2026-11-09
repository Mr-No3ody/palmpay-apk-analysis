package Uc;

import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.p2pcash.bean.req.CreateBalancePaymentOrderReq;
import com.transsnet.palmpay.p2pcash.bean.req.GetCashierInfoReq;
import com.transsnet.palmpay.p2pcash.bean.rsp.CreateBalancePaymentOrderResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.CreateBizOrderResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.GetCashierInfoResp;
import com.transsnet.palmpay.p2pcash.business.IApiP2PCashService;
import com.transsnet.palmpay.p2pcash.ui.atm.CashierDeskPage;
import com.transsnet.palmpay.util.NetworkUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class K {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f9566i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f9567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f9568b = new J(this, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f9569c = new J(this, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f9570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PaymentMethod f9572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GetCashierInfoResp.CalculationDtoBean f9573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ CashierDeskPage f9574h;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r("depositOrderData", "getDepositOrderData()Lcom/transsnet/palmpay/p2pcash/bean/rsp/CreateBizOrderResp;", K.class);
        kotlin.jvm.internal.G.f38952a.getClass();
        f9566i = new KProperty[]{rVar, new kotlin.jvm.internal.r("balancePaymentOrderData", "getBalancePaymentOrderData()Lcom/transsnet/palmpay/p2pcash/bean/rsp/CreateBalancePaymentOrderResp$DataBean;", K.class), new kotlin.jvm.internal.r("limitAmountData", "getLimitAmountData()Lcom/transsnet/palmpay/p2pcash/bean/rsp/GetCashierInfoResp$LimitAmountRespBean;", K.class), new kotlin.jvm.internal.r("paymentMethodListData", "getPaymentMethodListData()Ljava/util/ArrayList;", K.class)};
    }

    public K(CashierDeskPage cashierDeskPage) {
        this.f9574h = cashierDeskPage;
        this.f9567a = new I(cashierDeskPage, this);
        this.f9570d = new I(new ArrayList(), this, cashierDeskPage);
    }

    public final void a(String depositOrderId) {
        Intrinsics.checkNotNullParameter(depositOrderId, "depositOrderId");
        CreateBalancePaymentOrderReq createBalancePaymentOrderReq = new CreateBalancePaymentOrderReq();
        createBalancePaymentOrderReq.bookingOrderNo = depositOrderId;
        createBalancePaymentOrderReq.ipAddress = NetworkUtils.getIPAddress(true);
        CashierDeskPage cashierDeskPage = this.f9574h;
        cashierDeskPage.showLoadingDialog(true);
        ((IApiP2PCashService) Tc.a.f9070a.f41176b).createBalancePaymentOrder(createBalancePaymentOrderReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new F(cashierDeskPage, this));
    }

    public final CreateBalancePaymentOrderResp.DataBean b() {
        return (CreateBalancePaymentOrderResp.DataBean) this.f9568b.getValue(this, f9566i[1]);
    }

    public final void c() {
        GetCashierInfoReq getCashierInfoReq = new GetCashierInfoReq();
        getCashierInfoReq.orderAmount = e();
        getCashierInfoReq.orderId = f();
        getCashierInfoReq.transType = h();
        CashierDeskPage cashierDeskPage = this.f9574h;
        cashierDeskPage.showLoadingDialog(true);
        ((IApiP2PCashService) Tc.a.f9070a.f41176b).getCashierInfo(getCashierInfoReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new G(cashierDeskPage, this));
    }

    public final CreateBizOrderResp d() {
        return (CreateBizOrderResp) this.f9567a.getValue(this, f9566i[0]);
    }

    public final long e() {
        int i7 = CashierDeskPage.f32844B;
        int iM = this.f9574h.m();
        if (iM != 1 && iM != 2) {
            if (iM != 3) {
                return 0L;
            }
            CreateBizOrderResp createBizOrderRespD = d();
            Intrinsics.e(createBizOrderRespD);
            return createBizOrderRespD.depositMoney;
        }
        CreateBalancePaymentOrderResp.DataBean dataBeanB = b();
        Intrinsics.e(dataBeanB);
        long jLongValue = dataBeanB.bookingAmount.longValue();
        CreateBalancePaymentOrderResp.DataBean dataBeanB2 = b();
        Intrinsics.e(dataBeanB2);
        Long depositMoney = dataBeanB2.depositMoney;
        Intrinsics.checkNotNullExpressionValue(depositMoney, "depositMoney");
        return jLongValue - depositMoney.longValue();
    }

    public final String f() {
        int i7 = CashierDeskPage.f32844B;
        int iM = this.f9574h.m();
        if (iM == 1 || iM == 2) {
            CreateBalancePaymentOrderResp.DataBean dataBeanB = b();
            Intrinsics.e(dataBeanB);
            String orderNo = dataBeanB.orderNo;
            Intrinsics.checkNotNullExpressionValue(orderNo, "orderNo");
            return orderNo;
        }
        if (iM != 3) {
            return "";
        }
        CreateBizOrderResp createBizOrderRespD = d();
        Intrinsics.e(createBizOrderRespD);
        String orderNo2 = createBizOrderRespD.orderNo;
        Intrinsics.checkNotNullExpressionValue(orderNo2, "orderNo");
        return orderNo2;
    }

    public final String g() {
        int i7 = CashierDeskPage.f32844B;
        int iM = this.f9574h.m();
        if (iM == 1 || iM == 2) {
            return TransType.TRANS_TYPE_AUTO_TRANSFER_BANK_ACCOUNT;
        }
        return iM != 3 ? "" : "62";
    }

    public final String h() {
        int i7 = CashierDeskPage.f32844B;
        int iM = this.f9574h.m();
        if (iM == 1 || iM == 2) {
            return TransType.TRANS_TYPE_EXCHANGE_CASH_BALANCE_PAYMENT;
        }
        return iM != 3 ? "" : TransType.TRANS_TYPE_EXCHANGE_CASH_DEPOSIT;
    }
}
