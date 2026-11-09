package Wd;

import Pa.C0525w;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp;
import com.transsnet.palmpay.teller.bean.QueryLastBillerRsp;
import com.transsnet.palmpay.teller.ui.activity.WaecHomeActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WaecHomeActivity f10745b;

    public /* synthetic */ Y(WaecHomeActivity waecHomeActivity, int i7) {
        this.f10744a = i7;
        this.f10745b = waecHomeActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        QueryLimitAmountResp.DataBean dataBean;
        QueryLastBillerRsp.Data data;
        WaecHomeActivity waecHomeActivity = this.f10745b;
        switch (this.f10744a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        QueryLimitAmountResp queryLimitAmountResp = (QueryLimitAmountResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (queryLimitAmountResp.isSuccess() && (dataBean = queryLimitAmountResp.data) != null) {
                            waecHomeActivity.f34241H = dataBean.getMinAmount();
                            waecHomeActivity.f34240C = dataBean.getMaxAmount();
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryLastBillerRsp queryLastBillerRsp = (QueryLastBillerRsp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (queryLastBillerRsp.isSuccess() && (data = queryLastBillerRsp.getData()) != null) {
                            String billerId = data.getBillerId();
                            String paymentItemId = data.getPaymentItemId();
                            String customerId = data.getCustomerId();
                            Long lValueOf = Long.valueOf(data.getBusinessAmount());
                            int i7 = WaecHomeActivity.f34237Q;
                            waecHomeActivity.v(billerId, lValueOf, paymentItemId, customerId);
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it2;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        nVar.getClass();
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof com.transsnet.palmpay.core.base.o) {
                    waecHomeActivity.showLoadingDialog(true, true);
                } else {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        waecHomeActivity.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        C0525w c0525wF = C0525w.f();
                        ArrayList arrayList = (ArrayList) commonBeanResult.data;
                        com.palmpay.lib.apm.launchcounter.util.d.G("/main/trans_history", ((Gson) c0525wF.f7166b).toJson(arrayList != null ? arrayList : ""));
                    } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                        waecHomeActivity.showLoadingDialog(false, true);
                    } else {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        waecHomeActivity.showLoadingDialog(false, true);
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it3).getClass();
                        com.palmpay.lib.apm.launchcounter.util.d.G("/main/trans_history", "");
                    }
                }
                return Unit.f38893a;
        }
    }
}
