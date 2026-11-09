package Uc;

import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.p2pcash.bean.rsp.CreateBalancePaymentOrderResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.CreateBizOrderResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.GetCashierInfoResp;
import com.transsnet.palmpay.p2pcash.ui.atm.CashierDeskPage;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayBalancePaymentDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayDepositDialog;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CashierDeskPage f9547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f9548g;

    public G(CashierDeskPage cashierDeskPage, K k2) {
        this.f9547f = cashierDeskPage;
        this.f9548g = k2;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f9547f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        CashierDeskPage cashierDeskPage = this.f9547f;
        cashierDeskPage.showLoadingDialog(false);
        ToastUtils.showLong(msg, new Object[0]);
        cashierDeskPage.finish();
    }

    @Override // Z4.e
    public final void y(Object obj) {
        String str;
        Long l5;
        Long l6;
        Long l8;
        Long l10;
        int i7 = 3;
        int i10 = 2;
        GetCashierInfoResp resp = (GetCashierInfoResp) obj;
        Intrinsics.checkNotNullParameter(resp, "resp");
        CashierDeskPage cashierDeskPage = this.f9547f;
        cashierDeskPage.showLoadingDialog(false);
        GetCashierInfoResp getCashierInfoResp = resp.isSuccess() ? resp : null;
        if (getCashierInfoResp != null) {
            GetCashierInfoResp.LimitAmountRespBean limitAmountRespBean = getCashierInfoResp.data.limitAmountResp;
            K k2 = this.f9548g;
            J j6 = k2.f9569c;
            KProperty<?>[] kPropertyArr = K.f9566i;
            j6.setValue(k2, kPropertyArr[2], limitAmountRespBean);
            List<PaymentMethod> list = getCashierInfoResp.data.paymentMethodList;
            ArrayList arrayList = new ArrayList(list != null ? list : kotlin.collections.z.f38935a);
            Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
            k2.f9570d.setValue(k2, kPropertyArr[3], arrayList);
            k2.f9573g = getCashierInfoResp.data.calculationDto;
            int i11 = CashierDeskPage.f32844B;
            O o10 = (O) cashierDeskPage.t.getValue();
            o10.getClass();
            CashierDeskPage cashierDeskPage2 = o10.f9582a;
            int iM = cashierDeskPage2.m();
            if (iM == 1 || iM == 2) {
                Intrinsics.checkNotNullParameter(cashierDeskPage2, "<this>");
                PayBalancePaymentDialog payBalancePaymentDialog = new PayBalancePaymentDialog(cashierDeskPage2);
                payBalancePaymentDialog.show();
                CreateBalancePaymentOrderResp.DataBean dataBeanB = cashierDeskPage2.l().b();
                if (dataBeanB == null || (str = dataBeanB.networkName) == null) {
                    str = "";
                }
                payBalancePaymentDialog.setAgentName(str);
                CreateBalancePaymentOrderResp.DataBean dataBeanB2 = cashierDeskPage2.l().b();
                payBalancePaymentDialog.setBookedAmount((dataBeanB2 == null || (l10 = dataBeanB2.bookingAmount) == null) ? 0L : l10.longValue());
                CreateBalancePaymentOrderResp.DataBean dataBeanB3 = cashierDeskPage2.l().b();
                payBalancePaymentDialog.setDepositAmount((dataBeanB3 == null || (l8 = dataBeanB3.depositMoney) == null) ? 0L : l8.longValue());
                CreateBalancePaymentOrderResp.DataBean dataBeanB4 = cashierDeskPage2.l().b();
                long jLongValue = (dataBeanB4 == null || (l6 = dataBeanB4.bookingAmount) == null) ? 0L : l6.longValue();
                CreateBalancePaymentOrderResp.DataBean dataBeanB5 = cashierDeskPage2.l().b();
                long jLongValue2 = jLongValue - ((dataBeanB5 == null || (l5 = dataBeanB5.depositMoney) == null) ? 0L : l5.longValue());
                PaymentMethod paymentMethod = cashierDeskPage2.l().f9572f;
                long j10 = paymentMethod != null ? paymentMethod.availableBalance : 0L;
                GetCashierInfoResp.CalculationDtoBean calculationDtoBean = cashierDeskPage2.l().f9573g;
                payBalancePaymentDialog.setBalance(j10, calculationDtoBean != null ? calculationDtoBean.payAmount : jLongValue2);
                PaymentMethod paymentMethod2 = cashierDeskPage2.l().f9572f;
                long j11 = paymentMethod2 != null ? paymentMethod2.availableBalance : 0L;
                GetCashierInfoResp.CalculationDtoBean calculationDtoBean2 = cashierDeskPage2.l().f9573g;
                if (calculationDtoBean2 != null) {
                    jLongValue2 = calculationDtoBean2.payAmount;
                }
                payBalancePaymentDialog.setPayBtnTxT(j11, jLongValue2);
                payBalancePaymentDialog.setCloseListener(new M(cashierDeskPage2, 4));
                payBalancePaymentDialog.setListener(new M(cashierDeskPage2, 5));
            } else if (iM == 3) {
                Intrinsics.checkNotNullParameter(cashierDeskPage2, "<this>");
                PayDepositDialog payDepositDialog = new PayDepositDialog(cashierDeskPage2);
                payDepositDialog.show();
                CreateBizOrderResp createBizOrderRespD = cashierDeskPage2.l().d();
                payDepositDialog.setAmount(createBizOrderRespD != null ? createBizOrderRespD.depositMoney : 0L);
                PaymentMethod paymentMethod3 = cashierDeskPage2.l().f9572f;
                long j12 = paymentMethod3 != null ? paymentMethod3.availableBalance : 0L;
                CreateBizOrderResp createBizOrderRespD2 = cashierDeskPage2.l().d();
                payDepositDialog.setBalance(j12, createBizOrderRespD2 != null ? createBizOrderRespD2.depositMoney : 0L);
                PaymentMethod paymentMethod4 = cashierDeskPage2.l().f9572f;
                long j13 = paymentMethod4 != null ? paymentMethod4.availableBalance : 0L;
                CreateBizOrderResp createBizOrderRespD3 = cashierDeskPage2.l().d();
                payDepositDialog.setPayBtnTxT(j13, createBizOrderRespD3 != null ? createBizOrderRespD3.depositMoney : 0L);
                payDepositDialog.setNotice(new M7.s(o10, 19));
                payDepositDialog.setCloseListener(new M(cashierDeskPage2, i10));
                payDepositDialog.setListener(new M(cashierDeskPage2, i7));
            }
        }
        if ((resp.isSuccess() ? resp : null) == null) {
            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
            cashierDeskPage.finish();
            Unit unit = Unit.f38893a;
        }
    }
}
