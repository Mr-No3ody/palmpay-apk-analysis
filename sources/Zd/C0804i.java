package Zd;

import Pa.C0525w;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.ChannelDataItemBean;
import com.transsnet.palmpay.teller.bean.QueryLastBillerRsp;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentElectricityHomeViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Zd.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0804i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillPaymentElectricityHomeFragment f11667b;

    public C0804i(BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment) {
        this.f11666a = 0;
        this.f11667b = billPaymentElectricityHomeFragment;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        QueryLimitAmountResp.DataBean dataBean;
        switch (this.f11666a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11667b;
                if (z3) {
                    billPaymentElectricityHomeFragment.showLoadingDialog(true, true);
                } else {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        billPaymentElectricityHomeFragment.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        C0525w c0525wF = C0525w.f();
                        ArrayList arrayList = (ArrayList) commonBeanResult.data;
                        com.palmpay.lib.apm.launchcounter.util.d.G("/main/trans_history", ((Gson) c0525wF.f7166b).toJson(arrayList != null ? arrayList : ""));
                    } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                        billPaymentElectricityHomeFragment.showLoadingDialog(false, true);
                    } else {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        billPaymentElectricityHomeFragment.showLoadingDialog(false, true);
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                        com.palmpay.lib.apm.launchcounter.util.d.G("/main/trans_history", "");
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryLimitAmountResp queryLimitAmountResp = (QueryLimitAmountResp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (queryLimitAmountResp.isSuccess() && (dataBean = queryLimitAmountResp.data) != null) {
                            long minAmount = dataBean.getMinAmount();
                            BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment2 = this.f11667b;
                            billPaymentElectricityHomeFragment2.f34271t0 = minAmount;
                            billPaymentElectricityHomeFragment2.f34270s0 = dataBean.getMaxAmount();
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryLastBillerRsp queryLastBillerRsp = (QueryLastBillerRsp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        boolean zIsSuccess = queryLastBillerRsp.isSuccess();
                        BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment3 = this.f11667b;
                        if (zIsSuccess) {
                            QueryLastBillerRsp.Data data = queryLastBillerRsp.getData();
                            if (data != null) {
                                ChannelDataItemBean channelDataItemBean = billPaymentElectricityHomeFragment3.f34260L;
                                if (TextUtils.isEmpty(channelDataItemBean != null ? channelDataItemBean.getBillerId() : null)) {
                                    billPaymentElectricityHomeFragment3.K(data.getBillerId(), data.getPaymentItemId(), data.getCustomerId(), Long.valueOf(data.getBusinessAmount()), true, false);
                                } else {
                                    ChannelDataItemBean channelDataItemBean2 = billPaymentElectricityHomeFragment3.f34260L;
                                    if (kotlin.text.y.h(channelDataItemBean2 != null ? channelDataItemBean2.getBillerId() : null, data.getBillerId(), false)) {
                                        billPaymentElectricityHomeFragment3.K(data.getBillerId(), data.getPaymentItemId(), data.getCustomerId(), Long.valueOf(data.getBusinessAmount()), true, false);
                                    }
                                }
                            } else {
                                ChannelDataItemBean channelDataItemBean3 = billPaymentElectricityHomeFragment3.f34260L;
                                if (TextUtils.isEmpty(channelDataItemBean3 != null ? channelDataItemBean3.getBillerId() : null)) {
                                    ArrayList arrayList2 = billPaymentElectricityHomeFragment3.f34263X;
                                    if (!arrayList2.isEmpty()) {
                                        billPaymentElectricityHomeFragment3.K(((BillerListItemBean) billPaymentElectricityHomeFragment3.f34263X.get(0)).getBillerId(), "", "", 0L, true, false);
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment3.f27333i;
                                        if (billPaymentElectricityHomeViewModel != null) {
                                            billPaymentElectricityHomeViewModel.e(((BillerListItemBean) arrayList2.get(0)).getBillerId(), false, false);
                                        }
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel2 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment3.f27333i;
                                        if (billPaymentElectricityHomeViewModel2 != null) {
                                            String billerId = ((BillerListItemBean) arrayList2.get(0)).getBillerId();
                                            billPaymentElectricityHomeViewModel2.f(billerId != null ? billerId : "");
                                        }
                                    }
                                }
                            }
                        } else {
                            if (!billPaymentElectricityHomeFragment3.f34263X.isEmpty()) {
                                billPaymentElectricityHomeFragment3.K(((BillerListItemBean) billPaymentElectricityHomeFragment3.f34263X.get(0)).getBillerId(), "", "", 0L, true, false);
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel3 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment3.f27333i;
                                ArrayList arrayList3 = billPaymentElectricityHomeFragment3.f34263X;
                                if (billPaymentElectricityHomeViewModel3 != null) {
                                    billPaymentElectricityHomeViewModel3.e(((BillerListItemBean) arrayList3.get(0)).getBillerId(), false, false);
                                }
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel4 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment3.f27333i;
                                if (billPaymentElectricityHomeViewModel4 != null) {
                                    String billerId2 = ((BillerListItemBean) arrayList3.get(0)).getBillerId();
                                    billPaymentElectricityHomeViewModel4.f(billerId2 != null ? billerId2 : "");
                                }
                            }
                            ToastUtils.showLong(queryLastBillerRsp.getRespMsg(), new Object[0]);
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

    public /* synthetic */ C0804i(BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment, BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment2, int i7) {
        this.f11666a = i7;
        this.f11667b = billPaymentElectricityHomeFragment2;
    }
}
