package Zd;

import Pa.C0525w;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.ChannelDataItemBean;
import com.transsnet.palmpay.teller.bean.QueryLastBillerRsp;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentHomeNGFragment;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillPaymentHomeNGFragment f11679b;

    public /* synthetic */ o(BillPaymentHomeNGFragment billPaymentHomeNGFragment, int i7) {
        this.f11678a = i7;
        this.f11679b = billPaymentHomeNGFragment;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        QueryLimitAmountResp.DataBean dataBean;
        switch (this.f11678a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        QueryLastBillerRsp queryLastBillerRsp = (QueryLastBillerRsp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (queryLastBillerRsp.isSuccess()) {
                            QueryLastBillerRsp.Data data = queryLastBillerRsp.getData();
                            BillPaymentHomeNGFragment billPaymentHomeNGFragment = this.f11679b;
                            if (data != null) {
                                ChannelDataItemBean channelDataItemBean = billPaymentHomeNGFragment.f34281B;
                                if (TextUtils.isEmpty(channelDataItemBean != null ? channelDataItemBean.getBillerId() : null)) {
                                    billPaymentHomeNGFragment.B(data.getBillerId(), data.getPaymentItemId(), data.getCustomerId(), Long.valueOf(data.getBusinessAmount()), true, false);
                                } else {
                                    ChannelDataItemBean channelDataItemBean2 = billPaymentHomeNGFragment.f34281B;
                                    if (kotlin.text.y.h(channelDataItemBean2 != null ? channelDataItemBean2.getBillerId() : null, data.getBillerId(), false)) {
                                        billPaymentHomeNGFragment.B(data.getBillerId(), data.getPaymentItemId(), data.getCustomerId(), Long.valueOf(data.getBusinessAmount()), true, false);
                                    }
                                }
                            } else {
                                ChannelDataItemBean channelDataItemBean3 = billPaymentHomeNGFragment.f34281B;
                                if (TextUtils.isEmpty(channelDataItemBean3 != null ? channelDataItemBean3.getBillerId() : null) && !billPaymentHomeNGFragment.f34282C.isEmpty()) {
                                    billPaymentHomeNGFragment.B(((BillerListItemBean) billPaymentHomeNGFragment.f34282C.get(0)).getBillerId(), "", "", 0L, true, false);
                                }
                            }
                        } else {
                            ToastUtils.showLong(queryLastBillerRsp.getRespMsg(), new Object[0]);
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z3 = it2 instanceof com.transsnet.palmpay.core.base.o;
                BillPaymentHomeNGFragment billPaymentHomeNGFragment2 = this.f11679b;
                if (z3) {
                    billPaymentHomeNGFragment2.showLoadingDialog(true, true);
                } else {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        billPaymentHomeNGFragment2.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        C0525w c0525wF = C0525w.f();
                        ArrayList arrayList = (ArrayList) commonBeanResult.data;
                        com.palmpay.lib.apm.launchcounter.util.d.G("/main/trans_history", ((Gson) c0525wF.f7166b).toJson(arrayList != null ? arrayList : ""));
                    } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                        billPaymentHomeNGFragment2.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        billPaymentHomeNGFragment2.showLoadingDialog(false, true);
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                        com.palmpay.lib.apm.launchcounter.util.d.G("/main/trans_history", "");
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryLimitAmountResp queryLimitAmountResp = (QueryLimitAmountResp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        if (queryLimitAmountResp.isSuccess() && (dataBean = queryLimitAmountResp.data) != null) {
                            long minAmount = dataBean.getMinAmount();
                            BillPaymentHomeNGFragment billPaymentHomeNGFragment3 = this.f11679b;
                            billPaymentHomeNGFragment3.f34290k0 = minAmount;
                            billPaymentHomeNGFragment3.f34289Z = dataBean.getMaxAmount();
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }

    public o(BillPaymentHomeNGFragment billPaymentHomeNGFragment, BillPaymentHomeNGFragment billPaymentHomeNGFragment2) {
        this.f11678a = 2;
        this.f11679b = billPaymentHomeNGFragment2;
    }
}
