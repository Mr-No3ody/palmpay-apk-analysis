package p310ub;

import F6.d;
import Pa.r0;
import Ya.g;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.credit.bean.resp.CLInstallmentLoanMainPageResp;
import com.transsnet.palmpay.credit.bean.resp.CLOpenUserListResp;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanMainPageData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCashLoanBill;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCreditCard;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainResp;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRsp;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcTotalBillActivity;
import com.transsnet.palmpay.credit.view.OcCommonBillCard;
import com.transsnet.palmpay.custom_view.marqueeview.MarqueeView;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p355xf.l;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class z1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcTotalBillActivity f42956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OcTotalBillActivity f42957c;

    public /* synthetic */ z1(OcTotalBillActivity ocTotalBillActivity, OcTotalBillActivity ocTotalBillActivity2, int i7) {
        this.f42955a = i7;
        this.f42956b = ocTotalBillActivity;
        this.f42957c = ocTotalBillActivity2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OkCardMainPageRspData data;
        Long allOutstandingAmount;
        Long nextCycleInstallmentAmount;
        Integer applyStatus;
        Integer applyStatus2;
        CLMainData data2;
        CLMainCreditCard creditCard;
        Long allOutstandingAmount2;
        CLMainCashLoanBill currentCashLoanBill;
        CLMainCreditCard creditCard2;
        Long allOutstandingAmount3;
        Integer applyStatus3;
        Integer applyStatus4;
        List<String> data3;
        List<String> data4;
        MarqueeView marqueeView;
        long jLongValue = 0;
        OcTotalBillActivity ocTotalBillActivity = this.f42957c;
        boolean z3 = false;
        OcTotalBillActivity ocTotalBillActivity2 = this.f42956b;
        switch (this.f42955a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    ocTotalBillActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    ocTotalBillActivity2.showLoadingDialog(false, true);
                    OkCardMainPageRsp okCardMainPageRsp = (OkCardMainPageRsp) ((p) it).f27360a;
                    if (!okCardMainPageRsp.isSuccess() || okCardMainPageRsp.getData() == null) {
                        ToastUtils.showLong(okCardMainPageRsp.getRespMsg(), new Object[0]);
                    } else {
                        ocTotalBillActivity.f29901Z = okCardMainPageRsp.getData();
                        OkCardMainPageRspData data5 = okCardMainPageRsp.getData();
                        t tVar = ocTotalBillActivity.f29896L;
                        t tVar2 = ocTotalBillActivity.f29898Q;
                        if ((data5 == null || (applyStatus2 = data5.getApplyStatus()) == null || applyStatus2.intValue() != -1) && ((data = okCardMainPageRsp.getData()) == null || (applyStatus = data.getApplyStatus()) == null || applyStatus.intValue() != 2)) {
                            Object value = tVar2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            ((LinearLayout) value).setVisibility(0);
                            Object value2 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            ((ConstraintLayout) value2).setVisibility(0);
                            OkCardMainPageRspData data6 = okCardMainPageRsp.getData();
                            if (((data6 == null || (nextCycleInstallmentAmount = data6.getNextCycleInstallmentAmount()) == null) ? 0L : nextCycleInstallmentAmount.longValue()) > 0) {
                                TextView textViewR = ocTotalBillActivity.r();
                                int i7 = g.cs_oc_total_outstanding;
                                OkCardMainPageRspData data7 = okCardMainPageRsp.getData();
                                if (data7 != null && (allOutstandingAmount = data7.getAllOutstandingAmount()) != null) {
                                    jLongValue = allOutstandingAmount.longValue();
                                }
                                textViewR.setText(ocTotalBillActivity.getString(i7, r0.B(jLongValue, false)));
                                ocTotalBillActivity.r().setVisibility(0);
                            } else {
                                ocTotalBillActivity.r().setVisibility(8);
                            }
                            ocTotalBillActivity.q().j(okCardMainPageRsp.getData());
                        } else {
                            Object value3 = tVar2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            ((LinearLayout) value3).setVisibility(8);
                            Object value4 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                            ((ConstraintLayout) value4).setVisibility(8);
                        }
                    }
                } else if (it instanceof m) {
                    ocTotalBillActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    ocTotalBillActivity2.showLoadingDialog(false, true);
                    String str = ((n) it).f27358a;
                    ocTotalBillActivity.showLoadingDialog(false);
                    ToastUtils.showLong(str, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    ocTotalBillActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    ocTotalBillActivity2.showLoadingDialog(false, true);
                    CLMainResp cLMainResp = (CLMainResp) ((p) it2).f27360a;
                    if (!cLMainResp.isSuccess() || cLMainResp.getData() == null) {
                        ToastUtils.showLong(cLMainResp.getRespMsg(), new Object[0]);
                    } else {
                        ocTotalBillActivity.f29906k0 = cLMainResp.getData();
                        CLMainData data8 = cLMainResp.getData();
                        t tVar3 = ocTotalBillActivity.f29892A;
                        t tVar4 = ocTotalBillActivity.f29894C;
                        if ((data8 == null || (applyStatus4 = data8.getApplyStatus()) == null || applyStatus4.intValue() != -1) && ((data2 = cLMainResp.getData()) == null || (applyStatus3 = data2.getApplyStatus()) == null || applyStatus3.intValue() != 2)) {
                            Object value5 = tVar4.getValue();
                            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                            ((LinearLayout) value5).setVisibility(0);
                            Object value6 = tVar3.getValue();
                            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                            ((ConstraintLayout) value6).setVisibility(0);
                            CLMainData data9 = cLMainResp.getData();
                            long jLongValue2 = (data9 == null || (creditCard2 = data9.getCreditCard()) == null || (allOutstandingAmount3 = creditCard2.getAllOutstandingAmount()) == null) ? 0L : allOutstandingAmount3.longValue();
                            CLMainData data10 = cLMainResp.getData();
                            if (jLongValue2 > ((data10 == null || (currentCashLoanBill = data10.getCurrentCashLoanBill()) == null) ? 0L : currentCashLoanBill.getOutstandingAmount())) {
                                TextView textViewN = ocTotalBillActivity.n();
                                int i10 = g.cs_oc_total_outstanding;
                                CLMainData data11 = cLMainResp.getData();
                                if (data11 != null && (creditCard = data11.getCreditCard()) != null && (allOutstandingAmount2 = creditCard.getAllOutstandingAmount()) != null) {
                                    jLongValue = allOutstandingAmount2.longValue();
                                }
                                textViewN.setText(ocTotalBillActivity.getString(i10, r0.B(jLongValue, false)));
                                ocTotalBillActivity.n().setVisibility(0);
                            } else {
                                ocTotalBillActivity.n().setVisibility(8);
                            }
                            Object value7 = ocTotalBillActivity.t.getValue();
                            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                            ((OcCommonBillCard) value7).h(cLMainResp.getData());
                        } else {
                            Object value8 = tVar4.getValue();
                            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                            ((LinearLayout) value8).setVisibility(8);
                            Object value9 = tVar3.getValue();
                            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                            ((ConstraintLayout) value9).setVisibility(8);
                        }
                    }
                } else if (it2 instanceof m) {
                    ocTotalBillActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    ocTotalBillActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 2:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof o) {
                    ocTotalBillActivity2.showLoadingDialog(true, true);
                } else if (it3 instanceof p) {
                    ocTotalBillActivity2.showLoadingDialog(false, true);
                    CLInstallmentLoanMainPageResp cLInstallmentLoanMainPageResp = (CLInstallmentLoanMainPageResp) ((p) it3).f27360a;
                    if (!cLInstallmentLoanMainPageResp.isSuccess() || cLInstallmentLoanMainPageResp.getData() == null) {
                        int i11 = OcTotalBillActivity.f29891r0;
                        ocTotalBillActivity.p().setVisibility(8);
                        ToastUtils.showLong(cLInstallmentLoanMainPageResp.getRespMsg(), new Object[0]);
                    } else {
                        InstallmentLoanMainPageData data12 = cLInstallmentLoanMainPageResp.getData();
                        Integer applyStatus5 = data12 != null ? data12.getApplyStatus() : null;
                        if (applyStatus5 == null || applyStatus5.intValue() == -1 || applyStatus5.intValue() == 0 || applyStatus5.intValue() == 2) {
                            d.h(ocTotalBillActivity.TAG, 3, "installment account is inactive");
                            ocTotalBillActivity.p().setVisibility(8);
                        } else {
                            ocTotalBillActivity.p().setVisibility(0);
                            ocTotalBillActivity.q().setBackground(null);
                            ocTotalBillActivity.p().setBackground(null);
                            ocTotalBillActivity.p().i(cLInstallmentLoanMainPageResp.getData());
                        }
                    }
                } else if (it3 instanceof m) {
                    ocTotalBillActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof n)) {
                        throw new l();
                    }
                    ocTotalBillActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4 instanceof o) {
                    ocTotalBillActivity2.showLoadingDialog(true, true);
                } else if (it4 instanceof p) {
                    ocTotalBillActivity2.showLoadingDialog(false, true);
                    CLOpenUserListResp cLOpenUserListResp = (CLOpenUserListResp) ((p) it4).f27360a;
                    if (cLOpenUserListResp.isSuccess() && (data4 = cLOpenUserListResp.getData()) != null && !data4.isEmpty() && (marqueeView = ocTotalBillActivity.f29910q0) != null) {
                        marqueeView.b(cLOpenUserListResp.getData());
                    }
                    Object value10 = ocTotalBillActivity.f29900Y.getValue();
                    Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                    LinearLayout linearLayout = (LinearLayout) value10;
                    if (cLOpenUserListResp.isSuccess() && (data3 = cLOpenUserListResp.getData()) != null && !data3.isEmpty()) {
                        z3 = true;
                    }
                    h.s(linearLayout, z3);
                } else if (it4 instanceof m) {
                    ocTotalBillActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it4 instanceof n)) {
                        throw new l();
                    }
                    ocTotalBillActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it4).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
