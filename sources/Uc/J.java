package Uc;

import com.transsnet.palmpay.p2pcash.bean.rsp.CreateBalancePaymentOrderResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.GetCashierInfoResp;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f9563b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(K k2, int i7) {
        super(null);
        this.f9562a = i7;
        this.f9563b = k2;
    }

    @Override // Of.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        switch (this.f9562a) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                if (((CreateBalancePaymentOrderResp.DataBean) obj2) != null) {
                    this.f9563b.c();
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                GetCashierInfoResp.LimitAmountRespBean limitAmountRespBean = (GetCashierInfoResp.LimitAmountRespBean) obj2;
                K k2 = this.f9563b;
                k2.f9571e = null;
                if (limitAmountRespBean != null) {
                    GetCashierInfoResp.LimitAmountRespBean limitAmountRespBean2 = limitAmountRespBean.minAmount > k2.e() ? limitAmountRespBean : null;
                    if (limitAmountRespBean2 != null) {
                        k2.f9571e = C0.G.o("Amount should be above ", Pa.r0.B(limitAmountRespBean2.minAmount, false));
                    }
                }
                if (limitAmountRespBean != null) {
                    if (limitAmountRespBean.maxAmount >= k2.e()) {
                        limitAmountRespBean = null;
                    }
                    if (limitAmountRespBean != null) {
                        k2.f9571e = C0.G.o("Amount should be below ", Pa.r0.B(limitAmountRespBean.maxAmount, false));
                    }
                }
                break;
        }
    }
}
