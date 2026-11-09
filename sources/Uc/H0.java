package Uc;

import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentDetailResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryBalancePaymentDetailResp;
import com.transsnet.palmpay.p2pcash.ui.atm.TransactionDetailPage;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class H0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f9553d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G0 f9554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G0 f9555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransactionDetailPage f9556c;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r("depositOrderData", "getDepositOrderData()Lcom/transsnet/palmpay/p2pcash/bean/rsp/QueryAppointmentDetailResp$DataBean;", H0.class);
        kotlin.jvm.internal.G.f38952a.getClass();
        f9553d = new KProperty[]{rVar, new kotlin.jvm.internal.r("balancePaymentOrderData", "getBalancePaymentOrderData()Lcom/transsnet/palmpay/p2pcash/bean/rsp/QueryBalancePaymentDetailResp$DataBean;", H0.class)};
    }

    public H0(TransactionDetailPage transactionDetailPage) {
        this.f9556c = transactionDetailPage;
        this.f9554a = new G0(transactionDetailPage, 0);
        this.f9555b = new G0(transactionDetailPage, 1);
    }

    public final QueryBalancePaymentDetailResp.DataBean a() {
        return (QueryBalancePaymentDetailResp.DataBean) this.f9555b.getValue(this, f9553d[1]);
    }

    public final QueryAppointmentDetailResp.DataBean b() {
        return (QueryAppointmentDetailResp.DataBean) this.f9554a.getValue(this, f9553d[0]);
    }
}
