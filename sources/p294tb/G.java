package p294tb;

import Db.r;
import Db.s;
import Db.t;
import Wd.C0751z;
import Ya.d;
import Ya.g;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.resp.CLQueryFirstLoanBean;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLShortCashRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLShortCashRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.CLWithdrawData;
import com.transsnet.palmpay.credit.bean.resp.CLWithdrawResp;
import com.transsnet.palmpay.credit.bean.rsp.CLProductResp;
import com.transsnet.palmpay.credit.bean.rsp.ProductSubs;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOpenResultActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.OpenResultViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p140j8.f;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLOpenResultActivity f42409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CLOpenResultActivity f42410c;

    public /* synthetic */ G(CLOpenResultActivity cLOpenResultActivity, CLOpenResultActivity cLOpenResultActivity2, int i7) {
        this.f42408a = i7;
        this.f42409b = cLOpenResultActivity;
        this.f42410c = cLOpenResultActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long maxLoanAmt;
        Integer productSubId;
        Long loanAmount;
        long jLongValue = 0;
        CLOpenResultActivity cLOpenResultActivity = this.f42410c;
        CLOpenResultActivity cLOpenResultActivity2 = this.f42409b;
        switch (this.f42408a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    cLOpenResultActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    cLOpenResultActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                    if (commonBeanResult != null && commonBeanResult.isSuccess() && Intrinsics.c(((CLQueryFirstLoanBean) commonBeanResult.data).getFirstLoanFlag(), Boolean.TRUE)) {
                        ((CLQueryFirstLoanBean) commonBeanResult.data).getFreePasswordFlag();
                        int i7 = CLOpenResultActivity.f28955V0;
                        OpenResultViewModel openResultViewModel = (OpenResultViewModel) cLOpenResultActivity.l();
                        int productSubId2 = ((CLQueryFirstLoanBean) commonBeanResult.data).getProductSubId();
                        openResultViewModel.getClass();
                        f.s(openResultViewModel, new t(productSubId2, null), openResultViewModel.f30692f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    } else {
                        CLOpenResultActivity.z(cLOpenResultActivity, 3);
                    }
                } else if (it instanceof m) {
                    cLOpenResultActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    cLOpenResultActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                    CLOpenResultActivity.z(cLOpenResultActivity, 3);
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    cLOpenResultActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    cLOpenResultActivity2.showLoadingDialog(false, true);
                    CLProductResp cLProductResp = (CLProductResp) ((p) it2).f27360a;
                    if (cLProductResp == null || !cLProductResp.isSuccess()) {
                        CLOpenResultActivity.z(cLOpenResultActivity, 3);
                    } else {
                        int i10 = CLOpenResultActivity.f28955V0;
                        OpenResultViewModel openResultViewModel2 = (OpenResultViewModel) cLOpenResultActivity.l();
                        ProductSubs data = cLProductResp.getData();
                        int iIntValue = (data == null || (productSubId = data.getProductSubId()) == null) ? 3 : productSubId.intValue();
                        ProductSubs data2 = cLProductResp.getData();
                        if (data2 != null && (maxLoanAmt = data2.getMaxLoanAmt()) != null) {
                            jLongValue = maxLoanAmt.longValue();
                        }
                        openResultViewModel2.getClass();
                        com.transsnet.palmpay.core.base.l lVar = openResultViewModel2.f30693g;
                        if (iIntValue == 1) {
                            f.s(openResultViewModel2, new Db.p(jLongValue, null), lVar, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        } else if (iIntValue == 2) {
                            f.s(openResultViewModel2, new Db.q(jLongValue, null), lVar, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        } else if (iIntValue != 3) {
                            f.s(openResultViewModel2, new s(jLongValue, null), lVar, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        } else {
                            f.s(openResultViewModel2, new r(jLongValue, null), lVar, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                    }
                } else if (it2 instanceof m) {
                    cLOpenResultActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    cLOpenResultActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                    CLOpenResultActivity.z(cLOpenResultActivity, 3);
                }
                return Unit.f38893a;
            case 2:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof o) {
                    cLOpenResultActivity2.showLoadingDialog(true, true);
                } else if (it3 instanceof p) {
                    cLOpenResultActivity2.showLoadingDialog(false, true);
                    CLShortCashRepaymentPlanResp cLShortCashRepaymentPlanResp = (CLShortCashRepaymentPlanResp) ((p) it3).f27360a;
                    if (cLShortCashRepaymentPlanResp == null || !cLShortCashRepaymentPlanResp.isSuccess()) {
                        CLOpenResultActivity.z(cLOpenResultActivity, 3);
                    } else {
                        CLShortCashRepaymentPlanData data3 = cLShortCashRepaymentPlanResp.getData();
                        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS = data3 != null ? data3.getCalcRepayPlanForFCAndCouponDTOS() : null;
                        if (calcRepayPlanForFCAndCouponDTOS != null && !calcRepayPlanForFCAndCouponDTOS.isEmpty()) {
                            cLOpenResultActivity.f28975N0.clear();
                            ArrayList arrayList = cLOpenResultActivity.f28975N0;
                            CLShortCashRepaymentPlanData data4 = cLShortCashRepaymentPlanResp.getData();
                            List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS2 = data4 != null ? data4.getCalcRepayPlanForFCAndCouponDTOS() : null;
                            Intrinsics.e(calcRepayPlanForFCAndCouponDTOS2);
                            arrayList.addAll(calcRepayPlanForFCAndCouponDTOS2);
                            int size = arrayList.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                if (Intrinsics.c(((CLRepaymentPlanData) arrayList.get(i11)).getSelect(), Boolean.TRUE)) {
                                    cLOpenResultActivity.f28974M0 = (CLRepaymentPlanData) arrayList.get(i11);
                                }
                            }
                        }
                        CLOpenResultActivity.z(cLOpenResultActivity, 3);
                    }
                } else if (it3 instanceof m) {
                    cLOpenResultActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof n)) {
                        throw new l();
                    }
                    cLOpenResultActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                    CLOpenResultActivity.z(cLOpenResultActivity, 3);
                }
                return Unit.f38893a;
            default:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4 instanceof o) {
                    cLOpenResultActivity2.showLoadingDialog(true, true);
                } else if (it4 instanceof p) {
                    cLOpenResultActivity2.showLoadingDialog(false, true);
                    CLWithdrawResp cLWithdrawResp = (CLWithdrawResp) ((p) it4).f27360a;
                    if (cLWithdrawResp != null) {
                        boolean zIsSuccess = cLWithdrawResp.isSuccess();
                        CLOpenResultActivity cLOpenResultActivity3 = this.f42410c;
                        if (zIsSuccess) {
                            cLOpenResultActivity3.showLoadingDialog(true);
                            C0751z c0751z = new C0751z(cLOpenResultActivity3, 12);
                            CLWithdrawData data5 = cLWithdrawResp.getData();
                            c0751z.f4971b = data5 != null ? data5.getOrderId() : null;
                            CLRepaymentPlanData cLRepaymentPlanData = cLOpenResultActivity3.f28974M0;
                            if (cLRepaymentPlanData != null && (loanAmount = cLRepaymentPlanData.getLoanAmount()) != null) {
                                jLongValue = loanAmount.longValue();
                            }
                            c0751z.c(Long.valueOf(jLongValue));
                            c0751z.d();
                            CLWithdrawData data6 = cLWithdrawResp.getData();
                            if (data6 != null) {
                                data6.getOrderId();
                            }
                        } else if (Intrinsics.c(cLWithdrawResp.getRespCode(), "FOUND_OK_CARD_UN_SETTLED_BILL")) {
                            io.fastkv.n.O(cLOpenResultActivity3, 0, Integer.valueOf(g.cs_flexi_overdue), null, Integer.valueOf(d.cs_oc_finance_tip_warn_icon), null, null, cLWithdrawResp.getRespMsg(), null, cLOpenResultActivity3.getString(g.cs_confirm), H.f42411a, null, null, null, null, false, 0, 8386933);
                        } else {
                            ToastUtils.showLong(cLWithdrawResp.getRespMsg(), new Object[0]);
                        }
                    }
                } else if (it4 instanceof m) {
                    cLOpenResultActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it4 instanceof n)) {
                        throw new l();
                    }
                    cLOpenResultActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it4).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
