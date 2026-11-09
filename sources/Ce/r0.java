package Ce;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.RewardOrderDetail;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.TransactionFilterResp;
import com.transsnet.palmpay.ui.fragment.TransactionHistoryFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionHistoryFragment f1525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransactionHistoryFragment f1526c;

    public /* synthetic */ r0(TransactionHistoryFragment transactionHistoryFragment, TransactionHistoryFragment transactionHistoryFragment2, int i7) {
        this.f1524a = i7;
        this.f1525b = transactionHistoryFragment;
        this.f1526c = transactionHistoryFragment2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:137:0x0243  */
    /* JADX WARN: Code duplicated, block: B:160:0x028b  */
    /* JADX WARN: Code duplicated, block: B:267:0x0403  */
    /* JADX WARN: Code duplicated, block: B:76:0x0158  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList<TransactionFilterResp.FilterBean> conditions;
        boolean z3;
        ArrayList<String> arrayList;
        boolean z8;
        TransactionFilterResp.PaymentTypeBean paymentType;
        ArrayList<TransactionFilterResp.FilterBean> conditions2;
        String lowerCase;
        ArrayList<TransactionFilterResp.FilterBean> childTypeParam;
        boolean z10;
        String strK;
        ArrayList<TransactionFilterResp.FilterBean> conditions3;
        String lowerCase2;
        ArrayList<TransactionFilterResp.FilterBean> childTypeParam2;
        String strK2;
        String lowerCase3;
        String strK3;
        TransactionHistoryFragment transactionHistoryFragment = this.f1526c;
        boolean z11 = false;
        boolean z12 = true;
        TransactionHistoryFragment transactionHistoryFragment2 = this.f1525b;
        switch (this.f1524a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    transactionHistoryFragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    transactionHistoryFragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        TransactionFilterResp transactionFilterResp = (TransactionFilterResp) commonBeanResult.data;
                        int i7 = TransactionHistoryFragment.f35248k0;
                        transactionHistoryFragment.f35252H = new HashMap();
                        ArrayList<String> arrayList2 = new ArrayList<>();
                        ArrayList arrayList3 = transactionHistoryFragment.f35251C;
                        if (arrayList3 == null || arrayList3.isEmpty()) {
                            transactionHistoryFragment.f35251C = new ArrayList();
                            if (transactionFilterResp != null) {
                                ArrayList<TransactionFilterResp.FilterBean> status = transactionFilterResp.getStatus();
                                if (status != null) {
                                    Iterator<T> it2 = status.iterator();
                                    while (it2.hasNext()) {
                                        ArrayList<TransactionFilterResp.FilterBean> childTypeParam3 = ((TransactionFilterResp.FilterBean) it2.next()).getChildTypeParam();
                                        if (childTypeParam3 != null) {
                                            for (TransactionFilterResp.FilterBean filterBean : childTypeParam3) {
                                                if (filterBean.getDefaultChoose()) {
                                                    filterBean.setSelected(true);
                                                    transactionHistoryFragment.f35253L = filterBean.getCode();
                                                    ArrayList arrayList4 = transactionHistoryFragment.f35251C;
                                                    if (arrayList4 != null) {
                                                        String code = filterBean.getCode();
                                                        if (code == null) {
                                                            code = "";
                                                        }
                                                        arrayList4.add(code);
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                                ArrayList<TransactionFilterResp.FilterBean> conditions4 = transactionFilterResp.getConditions();
                                if (conditions4 != null) {
                                    Iterator<T> it3 = conditions4.iterator();
                                    while (it3.hasNext()) {
                                        ArrayList<TransactionFilterResp.FilterBean> childTypeParam4 = ((TransactionFilterResp.FilterBean) it3.next()).getChildTypeParam();
                                        if (childTypeParam4 != null) {
                                            for (TransactionFilterResp.FilterBean filterBean2 : childTypeParam4) {
                                                if (filterBean2.getDefaultChoose()) {
                                                    filterBean2.setSelected(true);
                                                    ArrayList arrayList5 = transactionHistoryFragment.f35251C;
                                                    if (arrayList5 != null) {
                                                        String code2 = filterBean2.getCode();
                                                        if (code2 == null) {
                                                            code2 = "";
                                                        }
                                                        arrayList5.add(code2);
                                                    }
                                                    HashMap map = transactionHistoryFragment.f35252H;
                                                    if (map != null) {
                                                        String name = filterBean2.getName();
                                                        if (name == null) {
                                                            name = "";
                                                        }
                                                        String code3 = filterBean2.getCode();
                                                        if (code3 == null) {
                                                            code3 = "";
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                                TransactionFilterResp.PaymentTypeBean paymentType2 = transactionFilterResp.getPaymentType();
                                if (paymentType2 != null && (conditions = paymentType2.getConditions()) != null) {
                                    Iterator<T> it4 = conditions.iterator();
                                    while (it4.hasNext()) {
                                        ArrayList<TransactionFilterResp.FilterBean> childTypeParam5 = ((TransactionFilterResp.FilterBean) it4.next()).getChildTypeParam();
                                        if (childTypeParam5 != null) {
                                            for (TransactionFilterResp.FilterBean filterBean3 : childTypeParam5) {
                                                if (filterBean3.getDefaultChoose()) {
                                                    filterBean3.setSelected(true);
                                                    ArrayList arrayList6 = transactionHistoryFragment.f35251C;
                                                    if (arrayList6 != null) {
                                                        String code4 = filterBean3.getCode();
                                                        if (code4 == null) {
                                                            code4 = "";
                                                        }
                                                        arrayList6.add(code4);
                                                    }
                                                    HashMap map2 = transactionHistoryFragment.f35252H;
                                                    if (map2 == null) {
                                                        z3 = false;
                                                    } else {
                                                        String name2 = filterBean3.getName();
                                                        if (name2 == null) {
                                                            name2 = "";
                                                        }
                                                        if (map2.containsKey(name2)) {
                                                            z3 = false;
                                                        } else {
                                                            z3 = true;
                                                        }
                                                    }
                                                    if (z3) {
                                                        HashMap map3 = transactionHistoryFragment.f35252H;
                                                        if (map3 != null) {
                                                            String name3 = filterBean3.getName();
                                                            if (name3 == null) {
                                                                name3 = "";
                                                            }
                                                            String code5 = filterBean3.getCode();
                                                            if (code5 == null) {
                                                                code5 = "";
                                                            }
                                                        }
                                                    } else {
                                                        HashMap map4 = transactionHistoryFragment.f35252H;
                                                        if (map4 != null) {
                                                            String name4 = filterBean3.getName();
                                                            if (name4 == null) {
                                                                name4 = "";
                                                            }
                                                            ArrayList arrayList7 = (ArrayList) map4.get(name4);
                                                            if (arrayList7 != null) {
                                                                String code6 = filterBean3.getCode();
                                                                if (code6 == null) {
                                                                    code6 = "";
                                                                }
                                                                arrayList7.add(code6);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (transactionFilterResp != null && (arrayList = transactionHistoryFragment.f35251C) != null) {
                                for (String str : arrayList) {
                                    ArrayList<TransactionFilterResp.FilterBean> status2 = transactionFilterResp.getStatus();
                                    if (status2 != null) {
                                        Iterator<T> it5 = status2.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                TransactionFilterResp.FilterBean filterBean4 = (TransactionFilterResp.FilterBean) it5.next();
                                                String name5 = filterBean4.getName();
                                                if (name5 == null || (strK3 = kotlin.text.y.k(name5, " ", "_")) == null) {
                                                    lowerCase3 = "";
                                                } else {
                                                    lowerCase3 = strK3.toLowerCase(Locale.ROOT);
                                                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                                                    if (lowerCase3 == null) {
                                                        lowerCase3 = "";
                                                    }
                                                }
                                                if (str != null && StringsKt.A(str, lowerCase3, z11) == z12) {
                                                    ArrayList<TransactionFilterResp.FilterBean> childTypeParam6 = filterBean4.getChildTypeParam();
                                                    if (childTypeParam6 != null) {
                                                        Iterator<T> it6 = childTypeParam6.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                TransactionFilterResp.FilterBean filterBean5 = (TransactionFilterResp.FilterBean) it6.next();
                                                                if (str.equals(filterBean5.getCode())) {
                                                                    filterBean5.setSelected(z12);
                                                                    transactionHistoryFragment.f35253L = filterBean5.getCode();
                                                                    z8 = z11;
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z8 = z12;
                                        }
                                    } else {
                                        z8 = z12;
                                    }
                                    if (z8 && (conditions3 = transactionFilterResp.getConditions()) != null) {
                                        for (TransactionFilterResp.FilterBean filterBean6 : conditions3) {
                                            String name6 = filterBean6.getName();
                                            if (name6 == null || (strK2 = kotlin.text.y.k(name6, " ", "_")) == null) {
                                                lowerCase2 = "";
                                            } else {
                                                lowerCase2 = strK2.toLowerCase(Locale.ROOT);
                                                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                                                if (lowerCase2 == null) {
                                                    lowerCase2 = "";
                                                }
                                            }
                                            if (str != null && StringsKt.A(str, lowerCase2, z11) && (childTypeParam2 = filterBean6.getChildTypeParam()) != null) {
                                                for (TransactionFilterResp.FilterBean filterBean7 : childTypeParam2) {
                                                    if (str.equals(filterBean7.getCode())) {
                                                        filterBean7.setSelected(true);
                                                        HashMap map5 = transactionHistoryFragment.f35252H;
                                                        if (map5 != null) {
                                                            String name7 = filterBean7.getName();
                                                            if (name7 == null) {
                                                                name7 = "";
                                                            }
                                                            String code7 = filterBean7.getCode();
                                                            if (code7 == null) {
                                                                code7 = "";
                                                            }
                                                        }
                                                        z8 = z11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (z8 && (paymentType = transactionFilterResp.getPaymentType()) != null && (conditions2 = paymentType.getConditions()) != null) {
                                        for (TransactionFilterResp.FilterBean filterBean8 : conditions2) {
                                            String name8 = filterBean8.getName();
                                            if (name8 == null || (strK = kotlin.text.y.k(name8, " ", "_")) == null) {
                                                lowerCase = "";
                                            } else {
                                                lowerCase = strK.toLowerCase(Locale.ROOT);
                                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                                if (lowerCase == null) {
                                                    lowerCase = "";
                                                }
                                            }
                                            if (((str == null || !StringsKt.A(str, lowerCase, z11)) ? z11 : true) && (childTypeParam = filterBean8.getChildTypeParam()) != null) {
                                                for (TransactionFilterResp.FilterBean filterBean9 : childTypeParam) {
                                                    if (Intrinsics.c(str, filterBean9.getCode())) {
                                                        filterBean9.setSelected(true);
                                                        HashMap map6 = transactionHistoryFragment.f35252H;
                                                        if (map6 == null) {
                                                            z10 = z11;
                                                        } else {
                                                            String name9 = filterBean9.getName();
                                                            if (name9 == null) {
                                                                name9 = "";
                                                            }
                                                            if (map6.containsKey(name9)) {
                                                                z10 = z11;
                                                            } else {
                                                                z10 = true;
                                                            }
                                                        }
                                                        if (z10) {
                                                            HashMap map7 = transactionHistoryFragment.f35252H;
                                                            if (map7 != null) {
                                                                String name10 = filterBean9.getName();
                                                                if (name10 == null) {
                                                                    name10 = "";
                                                                }
                                                                String code8 = filterBean9.getCode();
                                                                if (code8 == null) {
                                                                    code8 = "";
                                                                }
                                                            }
                                                        } else {
                                                            HashMap map8 = transactionHistoryFragment.f35252H;
                                                            if (map8 != null) {
                                                                String name11 = filterBean9.getName();
                                                                if (name11 == null) {
                                                                    name11 = "";
                                                                }
                                                                ArrayList arrayList8 = (ArrayList) map8.get(name11);
                                                                if (arrayList8 != null) {
                                                                    String code9 = filterBean9.getCode();
                                                                    if (code9 == null) {
                                                                        code9 = "";
                                                                    }
                                                                    arrayList8.add(code9);
                                                                }
                                                            }
                                                        }
                                                        String name12 = filterBean9.getName();
                                                        if (name12 == null) {
                                                            name12 = "";
                                                        }
                                                        arrayList2.add(name12);
                                                    }
                                                    z11 = false;
                                                }
                                            }
                                            z11 = false;
                                        }
                                    }
                                    z11 = false;
                                    z12 = true;
                                }
                            }
                            Bc.x xVar = (Bc.x) transactionHistoryFragment.f27335j;
                            if (xVar != null) {
                                xVar.f871c.setFilterName(arrayList2);
                            }
                        }
                        Bc.x xVar2 = (Bc.x) transactionHistoryFragment.f27335j;
                        if (xVar2 != null) {
                            xVar2.f871c.setData(transactionFilterResp);
                        }
                        Bc.x xVar3 = (Bc.x) transactionHistoryFragment.f27335j;
                        if (xVar3 != null) {
                            xVar3.f871c.setSelectedFilters(transactionHistoryFragment.f35252H);
                        }
                        Bc.x xVar4 = (Bc.x) transactionHistoryFragment.f27335j;
                        if (xVar4 != null) {
                            xVar4.f874f.setRefreshing(true);
                        }
                        transactionHistoryFragment.w(false);
                    } else {
                        p220oa.h.y(transactionHistoryFragment, commonBeanResult.getRespMsg());
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    transactionHistoryFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    transactionHistoryFragment2.showLoadingDialog(false, true);
                    p220oa.h.y(transactionHistoryFragment, ((com.transsnet.palmpay.core.base.n) it).f27358a);
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it7 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                if (it7 instanceof com.transsnet.palmpay.core.base.o) {
                    transactionHistoryFragment2.showLoadingDialog(true, true);
                } else if (it7 instanceof com.transsnet.palmpay.core.base.p) {
                    transactionHistoryFragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it7).f27360a;
                    if (commonBeanResult2.isSuccess()) {
                        RewardOrderDetail rewardOrderDetail = (RewardOrderDetail) commonBeanResult2.data;
                        int i10 = TransactionHistoryFragment.f35248k0;
                        if (rewardOrderDetail != null) {
                            Ea.a.e(TransType.TRANS_TYPE_OPERATING, rewardOrderDetail.lotteryOrderNo, "");
                        }
                    } else {
                        p220oa.h.y(transactionHistoryFragment, commonBeanResult2.getRespMsg());
                    }
                } else if (it7 instanceof com.transsnet.palmpay.core.base.m) {
                    transactionHistoryFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it7 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    transactionHistoryFragment2.showLoadingDialog(false, true);
                    p220oa.h.y(transactionHistoryFragment, ((com.transsnet.palmpay.core.base.n) it7).f27358a);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it8 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof com.transsnet.palmpay.core.base.o) {
                    transactionHistoryFragment2.showLoadingDialog(true, true);
                } else if (it8 instanceof com.transsnet.palmpay.core.base.p) {
                    transactionHistoryFragment2.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it8).f27360a;
                    if (commonResult.isSuccess()) {
                        TransactionHistoryFragment.u(transactionHistoryFragment, true, "");
                    } else if ("CFRONT_810001".equals(commonResult.getRespCode())) {
                        String respMsg = commonResult.getRespMsg();
                        Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                        TransactionHistoryFragment.u(transactionHistoryFragment, false, respMsg);
                    } else {
                        p220oa.h.y(transactionHistoryFragment, commonResult.getRespMsg());
                    }
                } else if (it8 instanceof com.transsnet.palmpay.core.base.m) {
                    transactionHistoryFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it8 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    transactionHistoryFragment2.showLoadingDialog(false, true);
                    ((com.transsnet.palmpay.core.base.n) it8).getClass();
                }
                return Unit.f38893a;
        }
    }
}
