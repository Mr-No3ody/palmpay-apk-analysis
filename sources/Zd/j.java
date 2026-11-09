package Zd;

import Rd.f0;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.resp.QueryElectricCustomerIdIsExitBean;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f11669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BillPaymentElectricityHomeFragment f11670c;

    public /* synthetic */ j(com.transsnet.palmpay.core.base.l lVar, BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment, int i7) {
        this.f11668a = i7;
        this.f11669b = lVar;
        this.f11670c = billPaymentElectricityHomeFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        T t;
        List list;
        BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11670c;
        com.transsnet.palmpay.core.base.l lVar = this.f11669b;
        switch (this.f11668a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        Object obj2 = lVar.f27356m;
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        String str = (String) obj2;
                        if (!commonBeanResult.isSuccess() || (t = commonBeanResult.data) == 0) {
                            int i7 = BillPaymentElectricityHomeFragment.f34255z0;
                            billPaymentElectricityHomeFragment.B().stop();
                            f0 f0Var = (f0) billPaymentElectricityHomeFragment.f27335j;
                            if (f0Var != null) {
                                p220oa.h.s(f0Var.f8300o, false);
                            }
                        } else if (str != null) {
                            billPaymentElectricityHomeFragment.f34262Q.put(str, (QueryElectricCustomerIdIsExitBean) t);
                            billPaymentElectricityHomeFragment.w(str, (QueryElectricCustomerIdIsExitBean) commonBeanResult.data);
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                        int i10 = BillPaymentElectricityHomeFragment.f34255z0;
                        billPaymentElectricityHomeFragment.B().stop();
                        f0 f0Var2 = (f0) billPaymentElectricityHomeFragment.f27335j;
                        if (f0Var2 != null) {
                            p220oa.h.s(f0Var2.f8300o, false);
                        }
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        Object obj3 = lVar.f27356m;
                        CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        String str2 = (String) obj3;
                        if (commonListResultV2.isSuccess()) {
                            if (str2 != null) {
                            }
                            BillerListItemBean billerListItemBean = billPaymentElectricityHomeFragment.f34265Z;
                            if (Intrinsics.c(billerListItemBean != null ? billerListItemBean.getBillerId() : null, str2) && (list = (List) billPaymentElectricityHomeFragment.f34275w.get(str2)) != null && (!list.isEmpty())) {
                                billPaymentElectricityHomeFragment.I(billPaymentElectricityHomeFragment.D().getData());
                                billPaymentElectricityHomeFragment.D().notifyDataSetChanged();
                            }
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}
