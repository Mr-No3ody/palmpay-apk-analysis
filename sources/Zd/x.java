package Zd;

import Pa.C0525w;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.ChannelDataItemBean;
import com.transsnet.palmpay.teller.bean.QueryLastBillerRsp;
import com.transsnet.palmpay.teller.bean.resp.QueryAccountHistoryData;
import com.transsnet.palmpay.teller.bean.resp.QueryAccountHistoryResp;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillPaymentTvHomeFragment f11694b;

    public /* synthetic */ x(BillPaymentTvHomeFragment billPaymentTvHomeFragment, int i7) {
        this.f11693a = i7;
        this.f11694b = billPaymentTvHomeFragment;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0149  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        QueryLimitAmountResp.DataBean dataBean;
        switch (this.f11693a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        QueryLastBillerRsp queryLastBillerRsp = (QueryLastBillerRsp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (queryLastBillerRsp.isSuccess()) {
                            QueryLastBillerRsp.Data data = queryLastBillerRsp.getData();
                            BillPaymentTvHomeFragment billPaymentTvHomeFragment = this.f11694b;
                            if (data != null) {
                                ChannelDataItemBean channelDataItemBean = billPaymentTvHomeFragment.f34302Q;
                                if (TextUtils.isEmpty(channelDataItemBean != null ? channelDataItemBean.getBillerId() : null)) {
                                    billPaymentTvHomeFragment.C(true, false, data.getBillerId(), data.getCustomerId());
                                } else {
                                    ChannelDataItemBean channelDataItemBean2 = billPaymentTvHomeFragment.f34302Q;
                                    if (kotlin.text.y.h(channelDataItemBean2 != null ? channelDataItemBean2.getBillerId() : null, data.getBillerId(), false)) {
                                        billPaymentTvHomeFragment.C(true, false, data.getBillerId(), data.getCustomerId());
                                    }
                                }
                            } else {
                                ChannelDataItemBean channelDataItemBean3 = billPaymentTvHomeFragment.f34302Q;
                                if (TextUtils.isEmpty(channelDataItemBean3 != null ? channelDataItemBean3.getBillerId() : null) && !billPaymentTvHomeFragment.f34304Y.isEmpty()) {
                                    billPaymentTvHomeFragment.C(true, false, ((BillerListItemBean) billPaymentTvHomeFragment.f34304Y.get(0)).getBillerId(), "");
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
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryAccountHistoryResp queryAccountHistoryResp = (QueryAccountHistoryResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        BillPaymentTvHomeFragment billPaymentTvHomeFragment2 = this.f11694b;
                        billPaymentTvHomeFragment2.f34296A.clear();
                        List<QueryAccountHistoryData> data2 = queryAccountHistoryResp.getData();
                        if (data2 != null) {
                            billPaymentTvHomeFragment2.f34296A.addAll(data2);
                        }
                        billPaymentTvHomeFragment2.G(billPaymentTvHomeFragment2.f34306k0);
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                boolean z3 = it3 instanceof com.transsnet.palmpay.core.base.o;
                BillPaymentTvHomeFragment billPaymentTvHomeFragment3 = this.f11694b;
                if (z3) {
                    billPaymentTvHomeFragment3.showLoadingDialog(true, true);
                } else {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        billPaymentTvHomeFragment3.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        C0525w c0525wF = C0525w.f();
                        ArrayList arrayList = (ArrayList) commonBeanResult.data;
                        com.palmpay.lib.apm.launchcounter.util.d.G("/main/trans_history", ((Gson) c0525wF.f7166b).toJson(arrayList != null ? arrayList : ""));
                    } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                        billPaymentTvHomeFragment3.showLoadingDialog(false, true);
                    } else {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        billPaymentTvHomeFragment3.showLoadingDialog(false, true);
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it3).getClass();
                        com.palmpay.lib.apm.launchcounter.util.d.G("/main/trans_history", "");
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryLimitAmountResp queryLimitAmountResp = (QueryLimitAmountResp) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                        if (queryLimitAmountResp.isSuccess() && (dataBean = queryLimitAmountResp.data) != null) {
                            long minAmount = dataBean.getMinAmount();
                            BillPaymentTvHomeFragment billPaymentTvHomeFragment4 = this.f11694b;
                            billPaymentTvHomeFragment4.f34310s0 = minAmount;
                            billPaymentTvHomeFragment4.f34309r0 = dataBean.getMaxAmount();
                        }
                    } else if (!(it4 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it4).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }

    public x(BillPaymentTvHomeFragment billPaymentTvHomeFragment, BillPaymentTvHomeFragment billPaymentTvHomeFragment2) {
        this.f11693a = 3;
        this.f11694b = billPaymentTvHomeFragment2;
    }
}
