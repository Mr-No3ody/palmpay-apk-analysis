package Ab;

import Wd.C0751z;
import android.content.Context;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponResp;
import com.transsnet.palmpay.credit.bean.resp.CLMultipleRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLMultipleRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.CLShortCashRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLWithdrawData;
import com.transsnet.palmpay.credit.bean.resp.CLWithdrawResp;
import com.transsnet.palmpay.credit.ui.dialog.CLCouponDialog;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CLInstallmentBorrowFragment f136g;

    public /* synthetic */ n(CLInstallmentBorrowFragment cLInstallmentBorrowFragment, int i7) {
        this.f135f = i7;
        this.f136g = cLInstallmentBorrowFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f135f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f136g.f(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f136g.f(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f136g.f(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f136g.f(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f135f) {
            case 0:
                this.f136g.z().setEnabled(true);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f136g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(message, "message");
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment = this.f136g;
                cLInstallmentBorrowFragment.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                cLInstallmentBorrowFragment.f30519G1 = false;
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f136g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:128:0x01db  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:169:0x0287  */
    /* JADX WARN: Code duplicated, block: B:171:0x028d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0292  */
    /* JADX WARN: Code duplicated, block: B:175:0x0299  */
    /* JADX WARN: Code duplicated, block: B:177:0x029f  */
    /* JADX WARN: Code duplicated, block: B:180:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:183:0x02af  */
    /* JADX WARN: Code duplicated, block: B:236:0x0385  */
    /* JADX WARN: Code duplicated, block: B:238:0x038b  */
    /* JADX WARN: Code duplicated, block: B:239:0x0390  */
    /* JADX WARN: Code duplicated, block: B:241:0x0393  */
    /* JADX WARN: Code duplicated, block: B:243:0x0399  */
    /* JADX WARN: Code duplicated, block: B:246:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:249:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:302:0x047e  */
    /* JADX WARN: Code duplicated, block: B:332:0x0502  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:74:0x0105  */
    /* JADX WARN: Code duplicated, block: B:77:0x0110  */
    /* JADX WARN: Code duplicated, block: B:80:0x0115  */
    @Override // Z4.e
    public final void y(Object obj) {
        String orderId;
        Context context;
        CLBorrowCouponData coupon;
        CLMultipleRepaymentPlanData data;
        CLShortCashRepaymentPlanData instantRepayPlanAndCoupon;
        CLMultipleRepaymentPlanData data2;
        CLShortCashRepaymentPlanData cashRepayPlanAndCoupon;
        CLMultipleRepaymentPlanData data3;
        CLShortCashRepaymentPlanData installRepayPlanAndCoupon;
        CLMultipleRepaymentPlanData data4;
        CLShortCashRepaymentPlanData installRepayPlanAndCoupon2;
        CLMultipleRepaymentPlanData data5;
        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS;
        List<CLRepaymentPlanData> list;
        CLShortCashRepaymentPlanData installRepayPlanAndCoupon3;
        CLShortCashRepaymentPlanData cashRepayPlanAndCoupon2;
        CLShortCashRepaymentPlanData cashRepayPlanAndCoupon3;
        CLShortCashRepaymentPlanData cashRepayPlanAndCoupon4;
        CLShortCashRepaymentPlanData installRepayPlanAndCoupon4;
        CLMultipleRepaymentPlanData data6;
        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS2;
        List<CLRepaymentPlanData> list2;
        CLShortCashRepaymentPlanData installRepayPlanAndCoupon5;
        CLShortCashRepaymentPlanData instantRepayPlanAndCoupon2;
        CLShortCashRepaymentPlanData instantRepayPlanAndCoupon3;
        CLShortCashRepaymentPlanData instantRepayPlanAndCoupon4;
        CLShortCashRepaymentPlanData installRepayPlanAndCoupon6;
        CLMultipleRepaymentPlanData data7;
        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS3;
        List<CLRepaymentPlanData> list3;
        CLShortCashRepaymentPlanData cashRepayPlanAndCoupon5;
        CLShortCashRepaymentPlanData cashRepayPlanAndCoupon6;
        CLShortCashRepaymentPlanData cashRepayPlanAndCoupon7;
        CLMultipleRepaymentPlanData data8;
        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS4;
        List<CLRepaymentPlanData> list4;
        CLShortCashRepaymentPlanData instantRepayPlanAndCoupon5;
        CLShortCashRepaymentPlanData instantRepayPlanAndCoupon6;
        CLShortCashRepaymentPlanData instantRepayPlanAndCoupon7;
        CLShortCashRepaymentPlanData installRepayPlanAndCoupon7;
        CLShortCashRepaymentPlanData installRepayPlanAndCoupon8;
        switch (this.f135f) {
            case 0:
                CLWithdrawResp cLWithdrawResp = (CLWithdrawResp) obj;
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment = this.f136g;
                cLInstallmentBorrowFragment.z().setEnabled(true);
                if (cLWithdrawResp != null) {
                    if (cLWithdrawResp.isSuccess()) {
                        F6.d.h(cLInstallmentBorrowFragment.f27317a, 3, "callOldCashier >>>");
                        Context contextRequireContext = cLInstallmentBorrowFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        C0751z c0751z = new C0751z(contextRequireContext, 12);
                        CLWithdrawData data9 = cLWithdrawResp.getData();
                        c0751z.f4971b = data9 != null ? data9.getOrderId() : null;
                        c0751z.c(Long.valueOf(cLInstallmentBorrowFragment.x().getLong()));
                        c0751z.d();
                        SPUtils sPUtils = SPUtils.getInstance();
                        CLWithdrawData data10 = cLWithdrawResp.getData();
                        if (data10 == null || (orderId = data10.getOrderId()) == null) {
                            orderId = "";
                        }
                        sPUtils.put("cl_borrow_last_order_id", orderId);
                    } else if (Intrinsics.c(cLWithdrawResp.getRespCode(), "FOUND_OK_CARD_UN_SETTLED_BILL")) {
                        Context contextRequireContext2 = cLInstallmentBorrowFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                        io.fastkv.n.O(contextRequireContext2, 0, Integer.valueOf(p025ba.k.core_notes), null, null, null, null, cLWithdrawResp.getRespMsg(), null, cLInstallmentBorrowFragment.getString(Ya.g.cs_cl_oc_repay), new f(cLInstallmentBorrowFragment, 20), null, null, null, null, false, 0, 8386941);
                    } else {
                        ToastUtils.showLong(cLWithdrawResp.getRespMsg(), new Object[0]);
                    }
                }
                break;
            case 1:
                CLBorrowCouponResp cLBorrowCouponResp = (CLBorrowCouponResp) obj;
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment2 = this.f136g;
                int i7 = 0;
                cLInstallmentBorrowFragment2.showLoadingDialog(false);
                if (cLBorrowCouponResp == null || !cLBorrowCouponResp.isSuccess()) {
                    ToastUtils.showShort(cLBorrowCouponResp != null ? cLBorrowCouponResp.getRespMsg() : null, new Object[0]);
                    break;
                } else {
                    List<CLBorrowCouponData> data11 = cLBorrowCouponResp.getData();
                    if (data11 != null && !data11.isEmpty()) {
                        ArrayList arrayList = cLInstallmentBorrowFragment2.f30588L1;
                        arrayList.clear();
                        List<CLBorrowCouponData> data12 = cLBorrowCouponResp.getData();
                        Intrinsics.e(data12);
                        arrayList.addAll(data12);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int i10 = i7 + 1;
                            Long couponId = ((CLBorrowCouponData) it.next()).getCouponId();
                            CLRepaymentPlanData cLRepaymentPlanData = cLInstallmentBorrowFragment2.f30564q1;
                            if (Intrinsics.c(couponId, (cLRepaymentPlanData == null || (coupon = cLRepaymentPlanData.getCoupon()) == null) ? null : coupon.getCouponId())) {
                                cLInstallmentBorrowFragment2.f30587K1 = i7;
                                context = cLInstallmentBorrowFragment2.getContext();
                                if (context != null) {
                                    CLCouponDialog cLCouponDialog = new CLCouponDialog(context, arrayList, cLInstallmentBorrowFragment2.f30587K1);
                                    cLCouponDialog.setConfirmListener(new A8.c(3, cLInstallmentBorrowFragment2, cLCouponDialog));
                                    cLCouponDialog.show();
                                }
                            } else {
                                i7 = i10;
                            }
                            break;
                        }
                        context = cLInstallmentBorrowFragment2.getContext();
                        if (context != null) {
                            CLCouponDialog cLCouponDialog2 = new CLCouponDialog(context, arrayList, cLInstallmentBorrowFragment2.f30587K1);
                            cLCouponDialog2.setConfirmListener(new A8.c(3, cLInstallmentBorrowFragment2, cLCouponDialog2));
                            cLCouponDialog2.show();
                        }
                        break;
                    }
                }
                break;
            case 2:
                CLMultipleRepaymentPlanResp cLMultipleRepaymentPlanResp = (CLMultipleRepaymentPlanResp) obj;
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment3 = this.f136g;
                int i11 = 0;
                cLInstallmentBorrowFragment3.showLoadingDialog(false);
                calcRepayPlanForFCAndCouponDTOS = null;
                List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS5 = null;
                calcRepayPlanForFCAndCouponDTOS = null;
                List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS6 = null;
                calcRepayPlanForFCAndCouponDTOS = null;
                List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS7 = null;
                calcRepayPlanForFCAndCouponDTOS = null;
                List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS8 = null;
                calcRepayPlanForFCAndCouponDTOS = null;
                List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS9 = null;
                if (cLMultipleRepaymentPlanResp == null || !cLMultipleRepaymentPlanResp.isSuccess() || cLMultipleRepaymentPlanResp.getData() == null) {
                    ToastUtils.showLong(cLMultipleRepaymentPlanResp != null ? cLMultipleRepaymentPlanResp.getRespMsg() : null, new Object[0]);
                } else {
                    cLInstallmentBorrowFragment3.f30571u1 = cLMultipleRepaymentPlanResp.getData();
                    cLInstallmentBorrowFragment3.f30506A1 = -1;
                    CLMultipleRepaymentPlanData data13 = cLMultipleRepaymentPlanResp.getData();
                    if ((data13 != null ? data13.getInstallRepayPlanAndCoupon() : null) == null) {
                        data = cLMultipleRepaymentPlanResp.getData();
                        if (data != null) {
                            instantRepayPlanAndCoupon = data.getInstantRepayPlanAndCoupon();
                        } else {
                            instantRepayPlanAndCoupon = null;
                        }
                        ArrayList arrayList2 = cLInstallmentBorrowFragment3.f30557n1;
                        ArrayList arrayList3 = cLInstallmentBorrowFragment3.f30566r1;
                        if (instantRepayPlanAndCoupon == null) {
                            data2 = cLMultipleRepaymentPlanResp.getData();
                            if (data2 != null) {
                                cashRepayPlanAndCoupon = data2.getCashRepayPlanAndCoupon();
                            } else {
                                cashRepayPlanAndCoupon = null;
                            }
                            if (cashRepayPlanAndCoupon == null) {
                                data3 = cLMultipleRepaymentPlanResp.getData();
                                if (data3 != null) {
                                    installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                } else {
                                    installRepayPlanAndCoupon = null;
                                }
                                ArrayList arrayList4 = cLInstallmentBorrowFragment3.f30588L1;
                                ArrayList arrayList5 = cLInstallmentBorrowFragment3.f30583z1;
                                if (installRepayPlanAndCoupon == null) {
                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                    if (data4 != null) {
                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                    } else {
                                        installRepayPlanAndCoupon2 = null;
                                    }
                                    if (installRepayPlanAndCoupon2 == null) {
                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                    } else {
                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                        if (data5 != null || (installRepayPlanAndCoupon4 = data5.getInstallRepayPlanAndCoupon()) == null) {
                                            calcRepayPlanForFCAndCouponDTOS = null;
                                        } else {
                                            calcRepayPlanForFCAndCouponDTOS = installRepayPlanAndCoupon4.getCalcRepayPlanForFCAndCouponDTOS();
                                        }
                                        list = calcRepayPlanForFCAndCouponDTOS;
                                        if (list != null || list.isEmpty()) {
                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                        } else {
                                            CLMultipleRepaymentPlanData data14 = cLMultipleRepaymentPlanResp.getData();
                                            if ((data14 != null ? data14.getCashRepayPlanAndCoupon() : null) == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                CLMultipleRepaymentPlanData data15 = cLMultipleRepaymentPlanResp.getData();
                                                List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS10 = (data15 == null || (cashRepayPlanAndCoupon4 = data15.getCashRepayPlanAndCoupon()) == null) ? null : cashRepayPlanAndCoupon4.getCalcRepayPlanForFCAndCouponDTOS();
                                                if (calcRepayPlanForFCAndCouponDTOS10 == null || calcRepayPlanForFCAndCouponDTOS10.isEmpty()) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    CLMultipleRepaymentPlanData data16 = cLMultipleRepaymentPlanResp.getData();
                                                    cLInstallmentBorrowFragment3.f30577w1 = (data16 == null || (cashRepayPlanAndCoupon3 = data16.getCashRepayPlanAndCoupon()) == null) ? null : cashRepayPlanAndCoupon3.getBorrowAllDiscountInfo();
                                                    CLMultipleRepaymentPlanData data17 = cLMultipleRepaymentPlanResp.getData();
                                                    List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS11 = (data17 == null || (cashRepayPlanAndCoupon2 = data17.getCashRepayPlanAndCoupon()) == null) ? null : cashRepayPlanAndCoupon2.getCalcRepayPlanForFCAndCouponDTOS();
                                                    arrayList5.clear();
                                                    Intrinsics.e(calcRepayPlanForFCAndCouponDTOS11);
                                                    arrayList5.addAll(calcRepayPlanForFCAndCouponDTOS11);
                                                    cLInstallmentBorrowFragment3.f30586J1 = false;
                                                    int size = arrayList5.size();
                                                    for (int i12 = 0; i12 < size; i12++) {
                                                        if (Intrinsics.c(((CLRepaymentPlanData) arrayList5.get(i12)).getSelect(), Boolean.TRUE)) {
                                                            cLInstallmentBorrowFragment3.f30581y1 = i12;
                                                            cLInstallmentBorrowFragment3.f30564q1 = (CLRepaymentPlanData) arrayList5.get(i12);
                                                            p351xb.y yVar = cLInstallmentBorrowFragment3.f30585I1;
                                                            if (yVar != null) {
                                                                yVar.f43823d = cLInstallmentBorrowFragment3.f30581y1;
                                                            }
                                                        }
                                                        if (!cLInstallmentBorrowFragment3.f30586J1 && Intrinsics.c(((CLRepaymentPlanData) arrayList5.get(i12)).getAvailable(), Boolean.FALSE)) {
                                                            cLInstallmentBorrowFragment3.f30586J1 = true;
                                                        }
                                                    }
                                                    cLInstallmentBorrowFragment3.f30512C1 = 1;
                                                    cLInstallmentBorrowFragment3.f30509B1 = 1;
                                                    arrayList4.clear();
                                                    cLInstallmentBorrowFragment3.n0();
                                                    if (cLInstallmentBorrowFragment3.f30509B1 == 1) {
                                                        cLInstallmentBorrowFragment3.l0(false);
                                                        cLInstallmentBorrowFragment3.k0();
                                                    }
                                                    CLMultipleRepaymentPlanData data18 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data18 != null && (installRepayPlanAndCoupon3 = data18.getInstallRepayPlanAndCoupon()) != null) {
                                                        calcRepayPlanForFCAndCouponDTOS9 = installRepayPlanAndCoupon3.getCalcRepayPlanForFCAndCouponDTOS();
                                                    }
                                                    CLInstallmentBorrowFragment.g0(cLInstallmentBorrowFragment3, calcRepayPlanForFCAndCouponDTOS9);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    data6 = cLMultipleRepaymentPlanResp.getData();
                                    if (data6 != null || (installRepayPlanAndCoupon6 = data6.getInstallRepayPlanAndCoupon()) == null) {
                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                    } else {
                                        calcRepayPlanForFCAndCouponDTOS2 = installRepayPlanAndCoupon6.getCalcRepayPlanForFCAndCouponDTOS();
                                    }
                                    list2 = calcRepayPlanForFCAndCouponDTOS2;
                                    if (list2 != null || list2.isEmpty()) {
                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                        if (data4 != null) {
                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                        } else {
                                            installRepayPlanAndCoupon2 = null;
                                        }
                                        if (installRepayPlanAndCoupon2 == null) {
                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                        } else {
                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                            if (data5 != null) {
                                                calcRepayPlanForFCAndCouponDTOS = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS = null;
                                            }
                                            list = calcRepayPlanForFCAndCouponDTOS;
                                            if (list != null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            }
                                        }
                                    } else {
                                        CLMultipleRepaymentPlanData data19 = cLMultipleRepaymentPlanResp.getData();
                                        if ((data19 != null ? data19.getInstantRepayPlanAndCoupon() : null) == null) {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        } else {
                                            CLMultipleRepaymentPlanData data20 = cLMultipleRepaymentPlanResp.getData();
                                            List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS12 = (data20 == null || (instantRepayPlanAndCoupon4 = data20.getInstantRepayPlanAndCoupon()) == null) ? null : instantRepayPlanAndCoupon4.getCalcRepayPlanForFCAndCouponDTOS();
                                            if (calcRepayPlanForFCAndCouponDTOS12 == null || calcRepayPlanForFCAndCouponDTOS12.isEmpty()) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                CLMultipleRepaymentPlanData data21 = cLMultipleRepaymentPlanResp.getData();
                                                cLInstallmentBorrowFragment3.f30577w1 = (data21 == null || (instantRepayPlanAndCoupon3 = data21.getInstantRepayPlanAndCoupon()) == null) ? null : instantRepayPlanAndCoupon3.getBorrowAllDiscountInfo();
                                                CLMultipleRepaymentPlanData data22 = cLMultipleRepaymentPlanResp.getData();
                                                List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS13 = (data22 == null || (instantRepayPlanAndCoupon2 = data22.getInstantRepayPlanAndCoupon()) == null) ? null : instantRepayPlanAndCoupon2.getCalcRepayPlanForFCAndCouponDTOS();
                                                arrayList5.clear();
                                                Intrinsics.e(calcRepayPlanForFCAndCouponDTOS13);
                                                arrayList5.addAll(calcRepayPlanForFCAndCouponDTOS13);
                                                cLInstallmentBorrowFragment3.f30586J1 = false;
                                                int size2 = arrayList5.size();
                                                for (int i13 = 0; i13 < size2; i13++) {
                                                    if (Intrinsics.c(((CLRepaymentPlanData) arrayList5.get(i13)).getSelect(), Boolean.TRUE)) {
                                                        cLInstallmentBorrowFragment3.f30581y1 = i13;
                                                        cLInstallmentBorrowFragment3.f30564q1 = (CLRepaymentPlanData) arrayList5.get(i13);
                                                        p351xb.y yVar2 = cLInstallmentBorrowFragment3.f30585I1;
                                                        if (yVar2 != null) {
                                                            yVar2.f43823d = cLInstallmentBorrowFragment3.f30581y1;
                                                        }
                                                    }
                                                    if (!cLInstallmentBorrowFragment3.f30586J1 && Intrinsics.c(((CLRepaymentPlanData) arrayList5.get(i13)).getAvailable(), Boolean.FALSE)) {
                                                        cLInstallmentBorrowFragment3.f30586J1 = true;
                                                    }
                                                }
                                                cLInstallmentBorrowFragment3.f30512C1 = 3;
                                                cLInstallmentBorrowFragment3.f30509B1 = 3;
                                                arrayList4.clear();
                                                cLInstallmentBorrowFragment3.p0();
                                                if (cLInstallmentBorrowFragment3.f30509B1 == 3) {
                                                    cLInstallmentBorrowFragment3.l0(false);
                                                    cLInstallmentBorrowFragment3.k0();
                                                }
                                                CLMultipleRepaymentPlanData data23 = cLMultipleRepaymentPlanResp.getData();
                                                if (data23 != null && (installRepayPlanAndCoupon5 = data23.getInstallRepayPlanAndCoupon()) != null) {
                                                    calcRepayPlanForFCAndCouponDTOS8 = installRepayPlanAndCoupon5.getCalcRepayPlanForFCAndCouponDTOS();
                                                }
                                                CLInstallmentBorrowFragment.g0(cLInstallmentBorrowFragment3, calcRepayPlanForFCAndCouponDTOS8);
                                            }
                                        }
                                    }
                                }
                            } else {
                                data7 = cLMultipleRepaymentPlanResp.getData();
                                if (data7 != null || (cashRepayPlanAndCoupon7 = data7.getCashRepayPlanAndCoupon()) == null) {
                                    calcRepayPlanForFCAndCouponDTOS3 = null;
                                } else {
                                    calcRepayPlanForFCAndCouponDTOS3 = cashRepayPlanAndCoupon7.getCalcRepayPlanForFCAndCouponDTOS();
                                }
                                list3 = calcRepayPlanForFCAndCouponDTOS3;
                                if (list3 != null || list3.isEmpty()) {
                                    data3 = cLMultipleRepaymentPlanResp.getData();
                                    if (data3 != null) {
                                        installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                    } else {
                                        installRepayPlanAndCoupon = null;
                                    }
                                    ArrayList arrayList6 = cLInstallmentBorrowFragment3.f30588L1;
                                    ArrayList arrayList7 = cLInstallmentBorrowFragment3.f30583z1;
                                    if (installRepayPlanAndCoupon == null) {
                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                        if (data4 != null) {
                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                        } else {
                                            installRepayPlanAndCoupon2 = null;
                                        }
                                        if (installRepayPlanAndCoupon2 == null) {
                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                        } else {
                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                            if (data5 != null) {
                                                calcRepayPlanForFCAndCouponDTOS = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS = null;
                                            }
                                            list = calcRepayPlanForFCAndCouponDTOS;
                                            if (list != null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            }
                                        }
                                    } else {
                                        data6 = cLMultipleRepaymentPlanResp.getData();
                                        if (data6 != null) {
                                            calcRepayPlanForFCAndCouponDTOS2 = null;
                                        } else {
                                            calcRepayPlanForFCAndCouponDTOS2 = null;
                                        }
                                        list2 = calcRepayPlanForFCAndCouponDTOS2;
                                        if (list2 != null) {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        } else {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    CLMultipleRepaymentPlanData data24 = cLMultipleRepaymentPlanResp.getData();
                                    if ((data24 != null ? data24.getInstallRepayPlanAndCoupon() : null) != null) {
                                        data3 = cLMultipleRepaymentPlanResp.getData();
                                        if (data3 != null) {
                                            installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                        } else {
                                            installRepayPlanAndCoupon = null;
                                        }
                                        ArrayList arrayList8 = cLInstallmentBorrowFragment3.f30588L1;
                                        ArrayList arrayList9 = cLInstallmentBorrowFragment3.f30583z1;
                                        if (installRepayPlanAndCoupon == null) {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        } else {
                                            data6 = cLMultipleRepaymentPlanResp.getData();
                                            if (data6 != null) {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            }
                                            list2 = calcRepayPlanForFCAndCouponDTOS2;
                                            if (list2 != null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        CLMultipleRepaymentPlanData data25 = cLMultipleRepaymentPlanResp.getData();
                                        if ((data25 != null ? data25.getInstantRepayPlanAndCoupon() : null) == null) {
                                            cLInstallmentBorrowFragment3.f30506A1 = 1;
                                            CLMultipleRepaymentPlanData data26 = cLMultipleRepaymentPlanResp.getData();
                                            cLInstallmentBorrowFragment3.f30577w1 = (data26 == null || (cashRepayPlanAndCoupon6 = data26.getCashRepayPlanAndCoupon()) == null) ? null : cashRepayPlanAndCoupon6.getBorrowAllDiscountInfo();
                                            CLMultipleRepaymentPlanData data27 = cLMultipleRepaymentPlanResp.getData();
                                            if (data27 != null && (cashRepayPlanAndCoupon5 = data27.getCashRepayPlanAndCoupon()) != null) {
                                                calcRepayPlanForFCAndCouponDTOS7 = cashRepayPlanAndCoupon5.getCalcRepayPlanForFCAndCouponDTOS();
                                            }
                                            Intrinsics.e(calcRepayPlanForFCAndCouponDTOS7);
                                            arrayList3.clear();
                                            arrayList3.addAll(calcRepayPlanForFCAndCouponDTOS7);
                                            cLInstallmentBorrowFragment3.t1 = false;
                                            int size3 = arrayList3.size();
                                            while (i11 < size3) {
                                                if (Intrinsics.c(((CLRepaymentPlanData) arrayList3.get(i11)).getSelect(), Boolean.TRUE)) {
                                                    cLInstallmentBorrowFragment3.f30559o1 = i11;
                                                    cLInstallmentBorrowFragment3.f30562p1 = (CLRepaymentPlanData) arrayList3.get(i11);
                                                    p351xb.y yVar3 = cLInstallmentBorrowFragment3.f30568s1;
                                                    if (yVar3 != null) {
                                                        yVar3.f43823d = cLInstallmentBorrowFragment3.f30559o1;
                                                    }
                                                }
                                                if (!cLInstallmentBorrowFragment3.t1 && Intrinsics.c(((CLRepaymentPlanData) arrayList3.get(i11)).getAvailable(), Boolean.FALSE)) {
                                                    cLInstallmentBorrowFragment3.t1 = true;
                                                }
                                                i11++;
                                            }
                                            arrayList2.clear();
                                            cLInstallmentBorrowFragment3.q0();
                                            cLInstallmentBorrowFragment3.c0();
                                        } else {
                                            data3 = cLMultipleRepaymentPlanResp.getData();
                                            if (data3 != null) {
                                                installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon = null;
                                            }
                                            ArrayList arrayList10 = cLInstallmentBorrowFragment3.f30588L1;
                                            ArrayList arrayList11 = cLInstallmentBorrowFragment3.f30583z1;
                                            if (installRepayPlanAndCoupon == null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data6 = cLMultipleRepaymentPlanResp.getData();
                                                if (data6 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                }
                                                list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                if (list2 != null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            data8 = cLMultipleRepaymentPlanResp.getData();
                            if (data8 != null || (instantRepayPlanAndCoupon7 = data8.getInstantRepayPlanAndCoupon()) == null) {
                                calcRepayPlanForFCAndCouponDTOS4 = null;
                            } else {
                                calcRepayPlanForFCAndCouponDTOS4 = instantRepayPlanAndCoupon7.getCalcRepayPlanForFCAndCouponDTOS();
                            }
                            list4 = calcRepayPlanForFCAndCouponDTOS4;
                            if (list4 != null || list4.isEmpty()) {
                                data2 = cLMultipleRepaymentPlanResp.getData();
                                if (data2 != null) {
                                    cashRepayPlanAndCoupon = data2.getCashRepayPlanAndCoupon();
                                } else {
                                    cashRepayPlanAndCoupon = null;
                                }
                                if (cashRepayPlanAndCoupon == null) {
                                    data3 = cLMultipleRepaymentPlanResp.getData();
                                    if (data3 != null) {
                                        installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                    } else {
                                        installRepayPlanAndCoupon = null;
                                    }
                                    ArrayList arrayList12 = cLInstallmentBorrowFragment3.f30588L1;
                                    ArrayList arrayList13 = cLInstallmentBorrowFragment3.f30583z1;
                                    if (installRepayPlanAndCoupon == null) {
                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                        if (data4 != null) {
                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                        } else {
                                            installRepayPlanAndCoupon2 = null;
                                        }
                                        if (installRepayPlanAndCoupon2 == null) {
                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                        } else {
                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                            if (data5 != null) {
                                                calcRepayPlanForFCAndCouponDTOS = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS = null;
                                            }
                                            list = calcRepayPlanForFCAndCouponDTOS;
                                            if (list != null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            }
                                        }
                                    } else {
                                        data6 = cLMultipleRepaymentPlanResp.getData();
                                        if (data6 != null) {
                                            calcRepayPlanForFCAndCouponDTOS2 = null;
                                        } else {
                                            calcRepayPlanForFCAndCouponDTOS2 = null;
                                        }
                                        list2 = calcRepayPlanForFCAndCouponDTOS2;
                                        if (list2 != null) {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        } else {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    data7 = cLMultipleRepaymentPlanResp.getData();
                                    if (data7 != null) {
                                        calcRepayPlanForFCAndCouponDTOS3 = null;
                                    } else {
                                        calcRepayPlanForFCAndCouponDTOS3 = null;
                                    }
                                    list3 = calcRepayPlanForFCAndCouponDTOS3;
                                    if (list3 != null) {
                                        data3 = cLMultipleRepaymentPlanResp.getData();
                                        if (data3 != null) {
                                            installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                        } else {
                                            installRepayPlanAndCoupon = null;
                                        }
                                        ArrayList arrayList14 = cLInstallmentBorrowFragment3.f30588L1;
                                        ArrayList arrayList15 = cLInstallmentBorrowFragment3.f30583z1;
                                        if (installRepayPlanAndCoupon == null) {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        } else {
                                            data6 = cLMultipleRepaymentPlanResp.getData();
                                            if (data6 != null) {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            }
                                            list2 = calcRepayPlanForFCAndCouponDTOS2;
                                            if (list2 != null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        data3 = cLMultipleRepaymentPlanResp.getData();
                                        if (data3 != null) {
                                            installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                        } else {
                                            installRepayPlanAndCoupon = null;
                                        }
                                        ArrayList arrayList16 = cLInstallmentBorrowFragment3.f30588L1;
                                        ArrayList arrayList17 = cLInstallmentBorrowFragment3.f30583z1;
                                        if (installRepayPlanAndCoupon == null) {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        } else {
                                            data6 = cLMultipleRepaymentPlanResp.getData();
                                            if (data6 != null) {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            }
                                            list2 = calcRepayPlanForFCAndCouponDTOS2;
                                            if (list2 != null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                CLMultipleRepaymentPlanData data28 = cLMultipleRepaymentPlanResp.getData();
                                if ((data28 != null ? data28.getInstallRepayPlanAndCoupon() : null) != null) {
                                    data2 = cLMultipleRepaymentPlanResp.getData();
                                    if (data2 != null) {
                                        cashRepayPlanAndCoupon = data2.getCashRepayPlanAndCoupon();
                                    } else {
                                        cashRepayPlanAndCoupon = null;
                                    }
                                    if (cashRepayPlanAndCoupon == null) {
                                        data3 = cLMultipleRepaymentPlanResp.getData();
                                        if (data3 != null) {
                                            installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                        } else {
                                            installRepayPlanAndCoupon = null;
                                        }
                                        ArrayList arrayList18 = cLInstallmentBorrowFragment3.f30588L1;
                                        ArrayList arrayList19 = cLInstallmentBorrowFragment3.f30583z1;
                                        if (installRepayPlanAndCoupon == null) {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        } else {
                                            data6 = cLMultipleRepaymentPlanResp.getData();
                                            if (data6 != null) {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            }
                                            list2 = calcRepayPlanForFCAndCouponDTOS2;
                                            if (list2 != null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        data7 = cLMultipleRepaymentPlanResp.getData();
                                        if (data7 != null) {
                                            calcRepayPlanForFCAndCouponDTOS3 = null;
                                        } else {
                                            calcRepayPlanForFCAndCouponDTOS3 = null;
                                        }
                                        list3 = calcRepayPlanForFCAndCouponDTOS3;
                                        if (list3 != null) {
                                            data3 = cLMultipleRepaymentPlanResp.getData();
                                            if (data3 != null) {
                                                installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon = null;
                                            }
                                            ArrayList arrayList110 = cLInstallmentBorrowFragment3.f30588L1;
                                            ArrayList arrayList111 = cLInstallmentBorrowFragment3.f30583z1;
                                            if (installRepayPlanAndCoupon == null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data6 = cLMultipleRepaymentPlanResp.getData();
                                                if (data6 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                }
                                                list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                if (list2 != null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            data3 = cLMultipleRepaymentPlanResp.getData();
                                            if (data3 != null) {
                                                installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon = null;
                                            }
                                            ArrayList arrayList112 = cLInstallmentBorrowFragment3.f30588L1;
                                            ArrayList arrayList113 = cLInstallmentBorrowFragment3.f30583z1;
                                            if (installRepayPlanAndCoupon == null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data6 = cLMultipleRepaymentPlanResp.getData();
                                                if (data6 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                }
                                                list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                if (list2 != null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    CLMultipleRepaymentPlanData data29 = cLMultipleRepaymentPlanResp.getData();
                                    if ((data29 != null ? data29.getCashRepayPlanAndCoupon() : null) == null) {
                                        cLInstallmentBorrowFragment3.f30506A1 = 3;
                                        CLMultipleRepaymentPlanData data30 = cLMultipleRepaymentPlanResp.getData();
                                        cLInstallmentBorrowFragment3.f30577w1 = (data30 == null || (instantRepayPlanAndCoupon6 = data30.getInstantRepayPlanAndCoupon()) == null) ? null : instantRepayPlanAndCoupon6.getBorrowAllDiscountInfo();
                                        CLMultipleRepaymentPlanData data31 = cLMultipleRepaymentPlanResp.getData();
                                        if (data31 != null && (instantRepayPlanAndCoupon5 = data31.getInstantRepayPlanAndCoupon()) != null) {
                                            calcRepayPlanForFCAndCouponDTOS6 = instantRepayPlanAndCoupon5.getCalcRepayPlanForFCAndCouponDTOS();
                                        }
                                        arrayList3.clear();
                                        Intrinsics.e(calcRepayPlanForFCAndCouponDTOS6);
                                        arrayList3.addAll(calcRepayPlanForFCAndCouponDTOS6);
                                        cLInstallmentBorrowFragment3.t1 = false;
                                        int size4 = arrayList3.size();
                                        while (i11 < size4) {
                                            if (Intrinsics.c(((CLRepaymentPlanData) arrayList3.get(i11)).getSelect(), Boolean.TRUE)) {
                                                cLInstallmentBorrowFragment3.f30559o1 = i11;
                                                cLInstallmentBorrowFragment3.f30562p1 = (CLRepaymentPlanData) arrayList3.get(i11);
                                                p351xb.y yVar4 = cLInstallmentBorrowFragment3.f30568s1;
                                                if (yVar4 != null) {
                                                    yVar4.f43823d = cLInstallmentBorrowFragment3.f30559o1;
                                                }
                                            }
                                            if (!cLInstallmentBorrowFragment3.t1 && Intrinsics.c(((CLRepaymentPlanData) arrayList3.get(i11)).getAvailable(), Boolean.FALSE)) {
                                                cLInstallmentBorrowFragment3.t1 = true;
                                            }
                                            i11++;
                                        }
                                        arrayList2.clear();
                                        cLInstallmentBorrowFragment3.s0();
                                        cLInstallmentBorrowFragment3.c0();
                                    } else {
                                        data2 = cLMultipleRepaymentPlanResp.getData();
                                        if (data2 != null) {
                                            cashRepayPlanAndCoupon = data2.getCashRepayPlanAndCoupon();
                                        } else {
                                            cashRepayPlanAndCoupon = null;
                                        }
                                        if (cashRepayPlanAndCoupon == null) {
                                            data3 = cLMultipleRepaymentPlanResp.getData();
                                            if (data3 != null) {
                                                installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon = null;
                                            }
                                            ArrayList arrayList114 = cLInstallmentBorrowFragment3.f30588L1;
                                            ArrayList arrayList115 = cLInstallmentBorrowFragment3.f30583z1;
                                            if (installRepayPlanAndCoupon == null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data6 = cLMultipleRepaymentPlanResp.getData();
                                                if (data6 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                }
                                                list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                if (list2 != null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            data7 = cLMultipleRepaymentPlanResp.getData();
                                            if (data7 != null) {
                                                calcRepayPlanForFCAndCouponDTOS3 = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS3 = null;
                                            }
                                            list3 = calcRepayPlanForFCAndCouponDTOS3;
                                            if (list3 != null) {
                                                data3 = cLMultipleRepaymentPlanResp.getData();
                                                if (data3 != null) {
                                                    installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon = null;
                                                }
                                                ArrayList arrayList116 = cLInstallmentBorrowFragment3.f30588L1;
                                                ArrayList arrayList117 = cLInstallmentBorrowFragment3.f30583z1;
                                                if (installRepayPlanAndCoupon == null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data6 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data6 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    }
                                                    list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                    if (list2 != null) {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                data3 = cLMultipleRepaymentPlanResp.getData();
                                                if (data3 != null) {
                                                    installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon = null;
                                                }
                                                ArrayList arrayList118 = cLInstallmentBorrowFragment3.f30588L1;
                                                ArrayList arrayList119 = cLInstallmentBorrowFragment3.f30583z1;
                                                if (installRepayPlanAndCoupon == null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data6 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data6 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    }
                                                    list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                    if (list2 != null) {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
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
                        CLMultipleRepaymentPlanData data32 = cLMultipleRepaymentPlanResp.getData();
                        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS14 = (data32 == null || (installRepayPlanAndCoupon8 = data32.getInstallRepayPlanAndCoupon()) == null) ? null : installRepayPlanAndCoupon8.getCalcRepayPlanForFCAndCouponDTOS();
                        if (calcRepayPlanForFCAndCouponDTOS14 == null || calcRepayPlanForFCAndCouponDTOS14.isEmpty()) {
                            data = cLMultipleRepaymentPlanResp.getData();
                            if (data != null) {
                                instantRepayPlanAndCoupon = data.getInstantRepayPlanAndCoupon();
                            } else {
                                instantRepayPlanAndCoupon = null;
                            }
                            ArrayList arrayList20 = cLInstallmentBorrowFragment3.f30557n1;
                            ArrayList arrayList21 = cLInstallmentBorrowFragment3.f30566r1;
                            if (instantRepayPlanAndCoupon == null) {
                                data2 = cLMultipleRepaymentPlanResp.getData();
                                if (data2 != null) {
                                    cashRepayPlanAndCoupon = data2.getCashRepayPlanAndCoupon();
                                } else {
                                    cashRepayPlanAndCoupon = null;
                                }
                                if (cashRepayPlanAndCoupon == null) {
                                    data3 = cLMultipleRepaymentPlanResp.getData();
                                    if (data3 != null) {
                                        installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                    } else {
                                        installRepayPlanAndCoupon = null;
                                    }
                                    ArrayList arrayList1110 = cLInstallmentBorrowFragment3.f30588L1;
                                    ArrayList arrayList1111 = cLInstallmentBorrowFragment3.f30583z1;
                                    if (installRepayPlanAndCoupon == null) {
                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                        if (data4 != null) {
                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                        } else {
                                            installRepayPlanAndCoupon2 = null;
                                        }
                                        if (installRepayPlanAndCoupon2 == null) {
                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                        } else {
                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                            if (data5 != null) {
                                                calcRepayPlanForFCAndCouponDTOS = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS = null;
                                            }
                                            list = calcRepayPlanForFCAndCouponDTOS;
                                            if (list != null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            }
                                        }
                                    } else {
                                        data6 = cLMultipleRepaymentPlanResp.getData();
                                        if (data6 != null) {
                                            calcRepayPlanForFCAndCouponDTOS2 = null;
                                        } else {
                                            calcRepayPlanForFCAndCouponDTOS2 = null;
                                        }
                                        list2 = calcRepayPlanForFCAndCouponDTOS2;
                                        if (list2 != null) {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        } else {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    data7 = cLMultipleRepaymentPlanResp.getData();
                                    if (data7 != null) {
                                        calcRepayPlanForFCAndCouponDTOS3 = null;
                                    } else {
                                        calcRepayPlanForFCAndCouponDTOS3 = null;
                                    }
                                    list3 = calcRepayPlanForFCAndCouponDTOS3;
                                    if (list3 != null) {
                                        data3 = cLMultipleRepaymentPlanResp.getData();
                                        if (data3 != null) {
                                            installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                        } else {
                                            installRepayPlanAndCoupon = null;
                                        }
                                        ArrayList arrayList1112 = cLInstallmentBorrowFragment3.f30588L1;
                                        ArrayList arrayList1113 = cLInstallmentBorrowFragment3.f30583z1;
                                        if (installRepayPlanAndCoupon == null) {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        } else {
                                            data6 = cLMultipleRepaymentPlanResp.getData();
                                            if (data6 != null) {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            }
                                            list2 = calcRepayPlanForFCAndCouponDTOS2;
                                            if (list2 != null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        data3 = cLMultipleRepaymentPlanResp.getData();
                                        if (data3 != null) {
                                            installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                        } else {
                                            installRepayPlanAndCoupon = null;
                                        }
                                        ArrayList arrayList1114 = cLInstallmentBorrowFragment3.f30588L1;
                                        ArrayList arrayList1115 = cLInstallmentBorrowFragment3.f30583z1;
                                        if (installRepayPlanAndCoupon == null) {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        } else {
                                            data6 = cLMultipleRepaymentPlanResp.getData();
                                            if (data6 != null) {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            }
                                            list2 = calcRepayPlanForFCAndCouponDTOS2;
                                            if (list2 != null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                data8 = cLMultipleRepaymentPlanResp.getData();
                                if (data8 != null) {
                                    calcRepayPlanForFCAndCouponDTOS4 = null;
                                } else {
                                    calcRepayPlanForFCAndCouponDTOS4 = null;
                                }
                                list4 = calcRepayPlanForFCAndCouponDTOS4;
                                if (list4 != null) {
                                    data2 = cLMultipleRepaymentPlanResp.getData();
                                    if (data2 != null) {
                                        cashRepayPlanAndCoupon = data2.getCashRepayPlanAndCoupon();
                                    } else {
                                        cashRepayPlanAndCoupon = null;
                                    }
                                    if (cashRepayPlanAndCoupon == null) {
                                        data3 = cLMultipleRepaymentPlanResp.getData();
                                        if (data3 != null) {
                                            installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                        } else {
                                            installRepayPlanAndCoupon = null;
                                        }
                                        ArrayList arrayList1116 = cLInstallmentBorrowFragment3.f30588L1;
                                        ArrayList arrayList1117 = cLInstallmentBorrowFragment3.f30583z1;
                                        if (installRepayPlanAndCoupon == null) {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        } else {
                                            data6 = cLMultipleRepaymentPlanResp.getData();
                                            if (data6 != null) {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            }
                                            list2 = calcRepayPlanForFCAndCouponDTOS2;
                                            if (list2 != null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        data7 = cLMultipleRepaymentPlanResp.getData();
                                        if (data7 != null) {
                                            calcRepayPlanForFCAndCouponDTOS3 = null;
                                        } else {
                                            calcRepayPlanForFCAndCouponDTOS3 = null;
                                        }
                                        list3 = calcRepayPlanForFCAndCouponDTOS3;
                                        if (list3 != null) {
                                            data3 = cLMultipleRepaymentPlanResp.getData();
                                            if (data3 != null) {
                                                installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon = null;
                                            }
                                            ArrayList arrayList1118 = cLInstallmentBorrowFragment3.f30588L1;
                                            ArrayList arrayList1119 = cLInstallmentBorrowFragment3.f30583z1;
                                            if (installRepayPlanAndCoupon == null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data6 = cLMultipleRepaymentPlanResp.getData();
                                                if (data6 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                }
                                                list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                if (list2 != null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            data3 = cLMultipleRepaymentPlanResp.getData();
                                            if (data3 != null) {
                                                installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon = null;
                                            }
                                            ArrayList arrayList11110 = cLInstallmentBorrowFragment3.f30588L1;
                                            ArrayList arrayList11111 = cLInstallmentBorrowFragment3.f30583z1;
                                            if (installRepayPlanAndCoupon == null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data6 = cLMultipleRepaymentPlanResp.getData();
                                                if (data6 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                }
                                                list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                if (list2 != null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    data2 = cLMultipleRepaymentPlanResp.getData();
                                    if (data2 != null) {
                                        cashRepayPlanAndCoupon = data2.getCashRepayPlanAndCoupon();
                                    } else {
                                        cashRepayPlanAndCoupon = null;
                                    }
                                    if (cashRepayPlanAndCoupon == null) {
                                        data3 = cLMultipleRepaymentPlanResp.getData();
                                        if (data3 != null) {
                                            installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                        } else {
                                            installRepayPlanAndCoupon = null;
                                        }
                                        ArrayList arrayList11112 = cLInstallmentBorrowFragment3.f30588L1;
                                        ArrayList arrayList11113 = cLInstallmentBorrowFragment3.f30583z1;
                                        if (installRepayPlanAndCoupon == null) {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        } else {
                                            data6 = cLMultipleRepaymentPlanResp.getData();
                                            if (data6 != null) {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            }
                                            list2 = calcRepayPlanForFCAndCouponDTOS2;
                                            if (list2 != null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        data7 = cLMultipleRepaymentPlanResp.getData();
                                        if (data7 != null) {
                                            calcRepayPlanForFCAndCouponDTOS3 = null;
                                        } else {
                                            calcRepayPlanForFCAndCouponDTOS3 = null;
                                        }
                                        list3 = calcRepayPlanForFCAndCouponDTOS3;
                                        if (list3 != null) {
                                            data3 = cLMultipleRepaymentPlanResp.getData();
                                            if (data3 != null) {
                                                installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon = null;
                                            }
                                            ArrayList arrayList11114 = cLInstallmentBorrowFragment3.f30588L1;
                                            ArrayList arrayList11115 = cLInstallmentBorrowFragment3.f30583z1;
                                            if (installRepayPlanAndCoupon == null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data6 = cLMultipleRepaymentPlanResp.getData();
                                                if (data6 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                }
                                                list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                if (list2 != null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            data3 = cLMultipleRepaymentPlanResp.getData();
                                            if (data3 != null) {
                                                installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon = null;
                                            }
                                            ArrayList arrayList11116 = cLInstallmentBorrowFragment3.f30588L1;
                                            ArrayList arrayList11117 = cLInstallmentBorrowFragment3.f30583z1;
                                            if (installRepayPlanAndCoupon == null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data6 = cLMultipleRepaymentPlanResp.getData();
                                                if (data6 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                }
                                                list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                if (list2 != null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            CLMultipleRepaymentPlanData data33 = cLMultipleRepaymentPlanResp.getData();
                            if ((data33 != null ? data33.getCashRepayPlanAndCoupon() : null) != null) {
                                data = cLMultipleRepaymentPlanResp.getData();
                                if (data != null) {
                                    instantRepayPlanAndCoupon = data.getInstantRepayPlanAndCoupon();
                                } else {
                                    instantRepayPlanAndCoupon = null;
                                }
                                ArrayList arrayList22 = cLInstallmentBorrowFragment3.f30557n1;
                                ArrayList arrayList23 = cLInstallmentBorrowFragment3.f30566r1;
                                if (instantRepayPlanAndCoupon == null) {
                                    data2 = cLMultipleRepaymentPlanResp.getData();
                                    if (data2 != null) {
                                        cashRepayPlanAndCoupon = data2.getCashRepayPlanAndCoupon();
                                    } else {
                                        cashRepayPlanAndCoupon = null;
                                    }
                                    if (cashRepayPlanAndCoupon == null) {
                                        data3 = cLMultipleRepaymentPlanResp.getData();
                                        if (data3 != null) {
                                            installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                        } else {
                                            installRepayPlanAndCoupon = null;
                                        }
                                        ArrayList arrayList11118 = cLInstallmentBorrowFragment3.f30588L1;
                                        ArrayList arrayList11119 = cLInstallmentBorrowFragment3.f30583z1;
                                        if (installRepayPlanAndCoupon == null) {
                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                            if (data4 != null) {
                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon2 = null;
                                            }
                                            if (installRepayPlanAndCoupon2 == null) {
                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                            } else {
                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                if (data5 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                }
                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                if (list != null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                }
                                            }
                                        } else {
                                            data6 = cLMultipleRepaymentPlanResp.getData();
                                            if (data6 != null) {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS2 = null;
                                            }
                                            list2 = calcRepayPlanForFCAndCouponDTOS2;
                                            if (list2 != null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        data7 = cLMultipleRepaymentPlanResp.getData();
                                        if (data7 != null) {
                                            calcRepayPlanForFCAndCouponDTOS3 = null;
                                        } else {
                                            calcRepayPlanForFCAndCouponDTOS3 = null;
                                        }
                                        list3 = calcRepayPlanForFCAndCouponDTOS3;
                                        if (list3 != null) {
                                            data3 = cLMultipleRepaymentPlanResp.getData();
                                            if (data3 != null) {
                                                installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon = null;
                                            }
                                            ArrayList arrayList111110 = cLInstallmentBorrowFragment3.f30588L1;
                                            ArrayList arrayList111111 = cLInstallmentBorrowFragment3.f30583z1;
                                            if (installRepayPlanAndCoupon == null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data6 = cLMultipleRepaymentPlanResp.getData();
                                                if (data6 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                }
                                                list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                if (list2 != null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            data3 = cLMultipleRepaymentPlanResp.getData();
                                            if (data3 != null) {
                                                installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon = null;
                                            }
                                            ArrayList arrayList111112 = cLInstallmentBorrowFragment3.f30588L1;
                                            ArrayList arrayList111113 = cLInstallmentBorrowFragment3.f30583z1;
                                            if (installRepayPlanAndCoupon == null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data6 = cLMultipleRepaymentPlanResp.getData();
                                                if (data6 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                }
                                                list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                if (list2 != null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    data8 = cLMultipleRepaymentPlanResp.getData();
                                    if (data8 != null) {
                                        calcRepayPlanForFCAndCouponDTOS4 = null;
                                    } else {
                                        calcRepayPlanForFCAndCouponDTOS4 = null;
                                    }
                                    list4 = calcRepayPlanForFCAndCouponDTOS4;
                                    if (list4 != null) {
                                        data2 = cLMultipleRepaymentPlanResp.getData();
                                        if (data2 != null) {
                                            cashRepayPlanAndCoupon = data2.getCashRepayPlanAndCoupon();
                                        } else {
                                            cashRepayPlanAndCoupon = null;
                                        }
                                        if (cashRepayPlanAndCoupon == null) {
                                            data3 = cLMultipleRepaymentPlanResp.getData();
                                            if (data3 != null) {
                                                installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon = null;
                                            }
                                            ArrayList arrayList111114 = cLInstallmentBorrowFragment3.f30588L1;
                                            ArrayList arrayList111115 = cLInstallmentBorrowFragment3.f30583z1;
                                            if (installRepayPlanAndCoupon == null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data6 = cLMultipleRepaymentPlanResp.getData();
                                                if (data6 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                }
                                                list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                if (list2 != null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            data7 = cLMultipleRepaymentPlanResp.getData();
                                            if (data7 != null) {
                                                calcRepayPlanForFCAndCouponDTOS3 = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS3 = null;
                                            }
                                            list3 = calcRepayPlanForFCAndCouponDTOS3;
                                            if (list3 != null) {
                                                data3 = cLMultipleRepaymentPlanResp.getData();
                                                if (data3 != null) {
                                                    installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon = null;
                                                }
                                                ArrayList arrayList111116 = cLInstallmentBorrowFragment3.f30588L1;
                                                ArrayList arrayList111117 = cLInstallmentBorrowFragment3.f30583z1;
                                                if (installRepayPlanAndCoupon == null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data6 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data6 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    }
                                                    list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                    if (list2 != null) {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                data3 = cLMultipleRepaymentPlanResp.getData();
                                                if (data3 != null) {
                                                    installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon = null;
                                                }
                                                ArrayList arrayList111118 = cLInstallmentBorrowFragment3.f30588L1;
                                                ArrayList arrayList111119 = cLInstallmentBorrowFragment3.f30583z1;
                                                if (installRepayPlanAndCoupon == null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data6 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data6 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    }
                                                    list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                    if (list2 != null) {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        data2 = cLMultipleRepaymentPlanResp.getData();
                                        if (data2 != null) {
                                            cashRepayPlanAndCoupon = data2.getCashRepayPlanAndCoupon();
                                        } else {
                                            cashRepayPlanAndCoupon = null;
                                        }
                                        if (cashRepayPlanAndCoupon == null) {
                                            data3 = cLMultipleRepaymentPlanResp.getData();
                                            if (data3 != null) {
                                                installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon = null;
                                            }
                                            ArrayList arrayList1111110 = cLInstallmentBorrowFragment3.f30588L1;
                                            ArrayList arrayList1111111 = cLInstallmentBorrowFragment3.f30583z1;
                                            if (installRepayPlanAndCoupon == null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data6 = cLMultipleRepaymentPlanResp.getData();
                                                if (data6 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                }
                                                list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                if (list2 != null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            data7 = cLMultipleRepaymentPlanResp.getData();
                                            if (data7 != null) {
                                                calcRepayPlanForFCAndCouponDTOS3 = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS3 = null;
                                            }
                                            list3 = calcRepayPlanForFCAndCouponDTOS3;
                                            if (list3 != null) {
                                                data3 = cLMultipleRepaymentPlanResp.getData();
                                                if (data3 != null) {
                                                    installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon = null;
                                                }
                                                ArrayList arrayList1111112 = cLInstallmentBorrowFragment3.f30588L1;
                                                ArrayList arrayList1111113 = cLInstallmentBorrowFragment3.f30583z1;
                                                if (installRepayPlanAndCoupon == null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data6 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data6 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    }
                                                    list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                    if (list2 != null) {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                data3 = cLMultipleRepaymentPlanResp.getData();
                                                if (data3 != null) {
                                                    installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon = null;
                                                }
                                                ArrayList arrayList1111114 = cLInstallmentBorrowFragment3.f30588L1;
                                                ArrayList arrayList1111115 = cLInstallmentBorrowFragment3.f30583z1;
                                                if (installRepayPlanAndCoupon == null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data6 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data6 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    }
                                                    list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                    if (list2 != null) {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                CLMultipleRepaymentPlanData data34 = cLMultipleRepaymentPlanResp.getData();
                                if ((data34 != null ? data34.getInstantRepayPlanAndCoupon() : null) == null) {
                                    cLInstallmentBorrowFragment3.f30506A1 = 2;
                                    CLMultipleRepaymentPlanData data35 = cLMultipleRepaymentPlanResp.getData();
                                    if (data35 != null && (installRepayPlanAndCoupon7 = data35.getInstallRepayPlanAndCoupon()) != null) {
                                        calcRepayPlanForFCAndCouponDTOS5 = installRepayPlanAndCoupon7.getCalcRepayPlanForFCAndCouponDTOS();
                                    }
                                    CLInstallmentBorrowFragment.h0(cLInstallmentBorrowFragment3, calcRepayPlanForFCAndCouponDTOS5);
                                } else {
                                    data = cLMultipleRepaymentPlanResp.getData();
                                    if (data != null) {
                                        instantRepayPlanAndCoupon = data.getInstantRepayPlanAndCoupon();
                                    } else {
                                        instantRepayPlanAndCoupon = null;
                                    }
                                    ArrayList arrayList24 = cLInstallmentBorrowFragment3.f30557n1;
                                    ArrayList arrayList25 = cLInstallmentBorrowFragment3.f30566r1;
                                    if (instantRepayPlanAndCoupon == null) {
                                        data2 = cLMultipleRepaymentPlanResp.getData();
                                        if (data2 != null) {
                                            cashRepayPlanAndCoupon = data2.getCashRepayPlanAndCoupon();
                                        } else {
                                            cashRepayPlanAndCoupon = null;
                                        }
                                        if (cashRepayPlanAndCoupon == null) {
                                            data3 = cLMultipleRepaymentPlanResp.getData();
                                            if (data3 != null) {
                                                installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                            } else {
                                                installRepayPlanAndCoupon = null;
                                            }
                                            ArrayList arrayList1111116 = cLInstallmentBorrowFragment3.f30588L1;
                                            ArrayList arrayList1111117 = cLInstallmentBorrowFragment3.f30583z1;
                                            if (installRepayPlanAndCoupon == null) {
                                                data4 = cLMultipleRepaymentPlanResp.getData();
                                                if (data4 != null) {
                                                    installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon2 = null;
                                                }
                                                if (installRepayPlanAndCoupon2 == null) {
                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                } else {
                                                    data5 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data5 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS = null;
                                                    }
                                                    list = calcRepayPlanForFCAndCouponDTOS;
                                                    if (list != null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    }
                                                }
                                            } else {
                                                data6 = cLMultipleRepaymentPlanResp.getData();
                                                if (data6 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS2 = null;
                                                }
                                                list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                if (list2 != null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            data7 = cLMultipleRepaymentPlanResp.getData();
                                            if (data7 != null) {
                                                calcRepayPlanForFCAndCouponDTOS3 = null;
                                            } else {
                                                calcRepayPlanForFCAndCouponDTOS3 = null;
                                            }
                                            list3 = calcRepayPlanForFCAndCouponDTOS3;
                                            if (list3 != null) {
                                                data3 = cLMultipleRepaymentPlanResp.getData();
                                                if (data3 != null) {
                                                    installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon = null;
                                                }
                                                ArrayList arrayList1111118 = cLInstallmentBorrowFragment3.f30588L1;
                                                ArrayList arrayList1111119 = cLInstallmentBorrowFragment3.f30583z1;
                                                if (installRepayPlanAndCoupon == null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data6 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data6 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    }
                                                    list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                    if (list2 != null) {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                data3 = cLMultipleRepaymentPlanResp.getData();
                                                if (data3 != null) {
                                                    installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon = null;
                                                }
                                                ArrayList arrayList11111110 = cLInstallmentBorrowFragment3.f30588L1;
                                                ArrayList arrayList11111111 = cLInstallmentBorrowFragment3.f30583z1;
                                                if (installRepayPlanAndCoupon == null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data6 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data6 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    }
                                                    list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                    if (list2 != null) {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        data8 = cLMultipleRepaymentPlanResp.getData();
                                        if (data8 != null) {
                                            calcRepayPlanForFCAndCouponDTOS4 = null;
                                        } else {
                                            calcRepayPlanForFCAndCouponDTOS4 = null;
                                        }
                                        list4 = calcRepayPlanForFCAndCouponDTOS4;
                                        if (list4 != null) {
                                            data2 = cLMultipleRepaymentPlanResp.getData();
                                            if (data2 != null) {
                                                cashRepayPlanAndCoupon = data2.getCashRepayPlanAndCoupon();
                                            } else {
                                                cashRepayPlanAndCoupon = null;
                                            }
                                            if (cashRepayPlanAndCoupon == null) {
                                                data3 = cLMultipleRepaymentPlanResp.getData();
                                                if (data3 != null) {
                                                    installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon = null;
                                                }
                                                ArrayList arrayList11111112 = cLInstallmentBorrowFragment3.f30588L1;
                                                ArrayList arrayList11111113 = cLInstallmentBorrowFragment3.f30583z1;
                                                if (installRepayPlanAndCoupon == null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data6 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data6 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    }
                                                    list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                    if (list2 != null) {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                data7 = cLMultipleRepaymentPlanResp.getData();
                                                if (data7 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS3 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS3 = null;
                                                }
                                                list3 = calcRepayPlanForFCAndCouponDTOS3;
                                                if (list3 != null) {
                                                    data3 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data3 != null) {
                                                        installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon = null;
                                                    }
                                                    ArrayList arrayList11111114 = cLInstallmentBorrowFragment3.f30588L1;
                                                    ArrayList arrayList11111115 = cLInstallmentBorrowFragment3.f30583z1;
                                                    if (installRepayPlanAndCoupon == null) {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        data6 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data6 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS2 = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS2 = null;
                                                        }
                                                        list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                        if (list2 != null) {
                                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data4 != null) {
                                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                            } else {
                                                                installRepayPlanAndCoupon2 = null;
                                                            }
                                                            if (installRepayPlanAndCoupon2 == null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                                if (data5 != null) {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                } else {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                }
                                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                                if (list != null) {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                } else {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                }
                                                            }
                                                        } else {
                                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data4 != null) {
                                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                            } else {
                                                                installRepayPlanAndCoupon2 = null;
                                                            }
                                                            if (installRepayPlanAndCoupon2 == null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                                if (data5 != null) {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                } else {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                }
                                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                                if (list != null) {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                } else {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    data3 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data3 != null) {
                                                        installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon = null;
                                                    }
                                                    ArrayList arrayList11111116 = cLInstallmentBorrowFragment3.f30588L1;
                                                    ArrayList arrayList11111117 = cLInstallmentBorrowFragment3.f30583z1;
                                                    if (installRepayPlanAndCoupon == null) {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        data6 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data6 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS2 = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS2 = null;
                                                        }
                                                        list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                        if (list2 != null) {
                                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data4 != null) {
                                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                            } else {
                                                                installRepayPlanAndCoupon2 = null;
                                                            }
                                                            if (installRepayPlanAndCoupon2 == null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                                if (data5 != null) {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                } else {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                }
                                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                                if (list != null) {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                } else {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                }
                                                            }
                                                        } else {
                                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data4 != null) {
                                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                            } else {
                                                                installRepayPlanAndCoupon2 = null;
                                                            }
                                                            if (installRepayPlanAndCoupon2 == null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                                if (data5 != null) {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                } else {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                }
                                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                                if (list != null) {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                } else {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            data2 = cLMultipleRepaymentPlanResp.getData();
                                            if (data2 != null) {
                                                cashRepayPlanAndCoupon = data2.getCashRepayPlanAndCoupon();
                                            } else {
                                                cashRepayPlanAndCoupon = null;
                                            }
                                            if (cashRepayPlanAndCoupon == null) {
                                                data3 = cLMultipleRepaymentPlanResp.getData();
                                                if (data3 != null) {
                                                    installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                                } else {
                                                    installRepayPlanAndCoupon = null;
                                                }
                                                ArrayList arrayList11111118 = cLInstallmentBorrowFragment3.f30588L1;
                                                ArrayList arrayList11111119 = cLInstallmentBorrowFragment3.f30583z1;
                                                if (installRepayPlanAndCoupon == null) {
                                                    data4 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data4 != null) {
                                                        installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon2 = null;
                                                    }
                                                    if (installRepayPlanAndCoupon2 == null) {
                                                        ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                    } else {
                                                        data5 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data5 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS = null;
                                                        }
                                                        list = calcRepayPlanForFCAndCouponDTOS;
                                                        if (list != null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        }
                                                    }
                                                } else {
                                                    data6 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data6 != null) {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    } else {
                                                        calcRepayPlanForFCAndCouponDTOS2 = null;
                                                    }
                                                    list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                    if (list2 != null) {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                data7 = cLMultipleRepaymentPlanResp.getData();
                                                if (data7 != null) {
                                                    calcRepayPlanForFCAndCouponDTOS3 = null;
                                                } else {
                                                    calcRepayPlanForFCAndCouponDTOS3 = null;
                                                }
                                                list3 = calcRepayPlanForFCAndCouponDTOS3;
                                                if (list3 != null) {
                                                    data3 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data3 != null) {
                                                        installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon = null;
                                                    }
                                                    ArrayList arrayList111111110 = cLInstallmentBorrowFragment3.f30588L1;
                                                    ArrayList arrayList111111111 = cLInstallmentBorrowFragment3.f30583z1;
                                                    if (installRepayPlanAndCoupon == null) {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        data6 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data6 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS2 = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS2 = null;
                                                        }
                                                        list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                        if (list2 != null) {
                                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data4 != null) {
                                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                            } else {
                                                                installRepayPlanAndCoupon2 = null;
                                                            }
                                                            if (installRepayPlanAndCoupon2 == null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                                if (data5 != null) {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                } else {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                }
                                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                                if (list != null) {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                } else {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                }
                                                            }
                                                        } else {
                                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data4 != null) {
                                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                            } else {
                                                                installRepayPlanAndCoupon2 = null;
                                                            }
                                                            if (installRepayPlanAndCoupon2 == null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                                if (data5 != null) {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                } else {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                }
                                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                                if (list != null) {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                } else {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    data3 = cLMultipleRepaymentPlanResp.getData();
                                                    if (data3 != null) {
                                                        installRepayPlanAndCoupon = data3.getInstallRepayPlanAndCoupon();
                                                    } else {
                                                        installRepayPlanAndCoupon = null;
                                                    }
                                                    ArrayList arrayList111111112 = cLInstallmentBorrowFragment3.f30588L1;
                                                    ArrayList arrayList111111113 = cLInstallmentBorrowFragment3.f30583z1;
                                                    if (installRepayPlanAndCoupon == null) {
                                                        data4 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data4 != null) {
                                                            installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                        } else {
                                                            installRepayPlanAndCoupon2 = null;
                                                        }
                                                        if (installRepayPlanAndCoupon2 == null) {
                                                            ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                        } else {
                                                            data5 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data5 != null) {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            } else {
                                                                calcRepayPlanForFCAndCouponDTOS = null;
                                                            }
                                                            list = calcRepayPlanForFCAndCouponDTOS;
                                                            if (list != null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        data6 = cLMultipleRepaymentPlanResp.getData();
                                                        if (data6 != null) {
                                                            calcRepayPlanForFCAndCouponDTOS2 = null;
                                                        } else {
                                                            calcRepayPlanForFCAndCouponDTOS2 = null;
                                                        }
                                                        list2 = calcRepayPlanForFCAndCouponDTOS2;
                                                        if (list2 != null) {
                                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data4 != null) {
                                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                            } else {
                                                                installRepayPlanAndCoupon2 = null;
                                                            }
                                                            if (installRepayPlanAndCoupon2 == null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                                if (data5 != null) {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                } else {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                }
                                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                                if (list != null) {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                } else {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                }
                                                            }
                                                        } else {
                                                            data4 = cLMultipleRepaymentPlanResp.getData();
                                                            if (data4 != null) {
                                                                installRepayPlanAndCoupon2 = data4.getInstallRepayPlanAndCoupon();
                                                            } else {
                                                                installRepayPlanAndCoupon2 = null;
                                                            }
                                                            if (installRepayPlanAndCoupon2 == null) {
                                                                ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                            } else {
                                                                data5 = cLMultipleRepaymentPlanResp.getData();
                                                                if (data5 != null) {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                } else {
                                                                    calcRepayPlanForFCAndCouponDTOS = null;
                                                                }
                                                                list = calcRepayPlanForFCAndCouponDTOS;
                                                                if (list != null) {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                } else {
                                                                    ToastUtils.showLong("repayment plan is error", new Object[0]);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    cLInstallmentBorrowFragment3.f30519G1 = true;
                    cLInstallmentBorrowFragment3.m0();
                }
                break;
            default:
                CLRepaymentPlanResp cLRepaymentPlanResp = (CLRepaymentPlanResp) obj;
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment4 = this.f136g;
                cLInstallmentBorrowFragment4.showLoadingDialog(false);
                if (cLRepaymentPlanResp == null || !cLRepaymentPlanResp.isSuccess() || cLRepaymentPlanResp.getData() == null) {
                    ToastUtils.showShort(cLRepaymentPlanResp != null ? cLRepaymentPlanResp.getRespMsg() : null, new Object[0]);
                } else {
                    CLRepaymentPlanData cLRepaymentPlanData2 = cLInstallmentBorrowFragment4.f30564q1;
                    Boolean available = cLRepaymentPlanData2 != null ? cLRepaymentPlanData2.getAvailable() : null;
                    CLRepaymentPlanData data36 = cLRepaymentPlanResp.getData();
                    cLInstallmentBorrowFragment4.f30564q1 = data36;
                    ArrayList arrayList26 = cLInstallmentBorrowFragment4.f30583z1;
                    int i14 = cLInstallmentBorrowFragment4.f30581y1;
                    Intrinsics.e(data36);
                    arrayList26.set(i14, data36);
                    ((CLRepaymentPlanData) arrayList26.get(cLInstallmentBorrowFragment4.f30581y1)).setAvailable(available);
                    int i15 = cLInstallmentBorrowFragment4.f30509B1;
                    if (i15 == 1) {
                        cLInstallmentBorrowFragment4.n0();
                    } else if (i15 == 2) {
                        cLInstallmentBorrowFragment4.o0();
                    } else if (i15 == 3) {
                        cLInstallmentBorrowFragment4.p0();
                    }
                    cLInstallmentBorrowFragment4.k0();
                }
                break;
        }
    }
}
