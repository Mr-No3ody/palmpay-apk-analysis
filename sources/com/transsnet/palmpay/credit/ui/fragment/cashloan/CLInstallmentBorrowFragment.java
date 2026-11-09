package com.transsnet.palmpay.credit.ui.fragment.cashloan;

import A8.a;
import Ab.ViewOnClickListenerC0053e;
import Ab.ViewOnFocusChangeListenerC0052d;
import Ab.i;
import Ab.n;
import Ab.o;
import Ab.p;
import Ab.q;
import Ab.r;
import C0.G;
import Pa.r0;
import Ya.d;
import Ya.g;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.BorrowAllDiscountConfig;
import com.transsnet.palmpay.credit.bean.req.CLRepaymentPlanReq;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.credit.bean.resp.CLMultipleRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLShortCashRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.RepaymentPlan;
import com.transsnet.palmpay.credit.bean.rsp.CLCanBorrowData;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.dialog.CLCouponDialog;
import face.security.device.api.FaceSecCode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p071ef.b;
import p183m6.j;
import p220oa.h;
import p221ob.c;
import p298tf.f;
import p310ub.C2085k0;
import p351xb.y;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/cashloan/CLInstallmentBorrowFragment;", "Lcom/transsnet/palmpay/credit/ui/fragment/cashloan/CLBorrowBaseFragment;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLInstallmentBorrowFragment extends CLBorrowBaseFragment {

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public static final /* synthetic */ int f30584M1 = 0;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public y f30585I1;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public boolean f30586J1;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public int f30587K1 = -1;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public final ArrayList f30588L1 = new ArrayList();

    public static final void g0(CLInstallmentBorrowFragment cLInstallmentBorrowFragment, List list) {
        ArrayList arrayList = cLInstallmentBorrowFragment.f30566r1;
        arrayList.clear();
        Intrinsics.e(list);
        arrayList.addAll(list);
        cLInstallmentBorrowFragment.t1 = false;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Intrinsics.c(((CLRepaymentPlanData) arrayList.get(i7)).getSelect(), Boolean.TRUE)) {
                cLInstallmentBorrowFragment.f30559o1 = i7;
                cLInstallmentBorrowFragment.f30562p1 = (CLRepaymentPlanData) arrayList.get(i7);
                y yVar = cLInstallmentBorrowFragment.f30568s1;
                if (yVar != null) {
                    yVar.f43823d = cLInstallmentBorrowFragment.f30559o1;
                }
            }
            if (!cLInstallmentBorrowFragment.t1 && Intrinsics.c(((CLRepaymentPlanData) arrayList.get(i7)).getAvailable(), Boolean.FALSE)) {
                cLInstallmentBorrowFragment.t1 = true;
            }
        }
        cLInstallmentBorrowFragment.f30509B1 = 2;
        cLInstallmentBorrowFragment.f30557n1.clear();
        cLInstallmentBorrowFragment.o0();
        if (cLInstallmentBorrowFragment.f30509B1 == 2) {
            cLInstallmentBorrowFragment.l0(true);
            cLInstallmentBorrowFragment.c0();
        }
    }

    public static final void h0(CLInstallmentBorrowFragment cLInstallmentBorrowFragment, List list) {
        ArrayList arrayList = cLInstallmentBorrowFragment.f30566r1;
        arrayList.clear();
        Intrinsics.e(list);
        arrayList.addAll(list);
        cLInstallmentBorrowFragment.t1 = false;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Intrinsics.c(((CLRepaymentPlanData) arrayList.get(i7)).getSelect(), Boolean.TRUE)) {
                cLInstallmentBorrowFragment.f30559o1 = i7;
                cLInstallmentBorrowFragment.f30562p1 = (CLRepaymentPlanData) arrayList.get(i7);
                y yVar = cLInstallmentBorrowFragment.f30568s1;
                if (yVar != null) {
                    yVar.f43823d = cLInstallmentBorrowFragment.f30559o1;
                }
            }
            if (!cLInstallmentBorrowFragment.t1 && Intrinsics.c(((CLRepaymentPlanData) arrayList.get(i7)).getAvailable(), Boolean.FALSE)) {
                cLInstallmentBorrowFragment.t1 = true;
            }
        }
        cLInstallmentBorrowFragment.f30557n1.clear();
        cLInstallmentBorrowFragment.r0();
        cLInstallmentBorrowFragment.c0();
    }

    @Override // com.transsnet.palmpay.credit.ui.fragment.cashloan.CLBorrowBaseFragment
    public final void e0() {
        super.e0();
        int i7 = this.f30506A1;
        if (i7 == 1) {
            q0();
        } else if (i7 == 3) {
            s0();
        } else if (i7 == 2) {
            r0();
        } else if (this.f30509B1 == 2) {
            o0();
        }
        m0();
    }

    public final Long i0() {
        List<RepaymentPlan> repaymentPlanList;
        RepaymentPlan repaymentPlan;
        CLRepaymentPlanData cLRepaymentPlanDataX = X();
        if (cLRepaymentPlanDataX == null || (repaymentPlanList = cLRepaymentPlanDataX.getRepaymentPlanList()) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(repaymentPlanList, "<this>");
        List listY = 1 >= repaymentPlanList.size() ? CollectionsKt.Y(repaymentPlanList) : C1849p.c(CollectionsKt.K(repaymentPlanList));
        if (listY == null || (repaymentPlan = (RepaymentPlan) listY.get(0)) == null) {
            return null;
        }
        return repaymentPlan.getRepaymentDate();
    }

    public final void j0() {
        int i7 = this.f30506A1;
        if (i7 == 1 || i7 == 3 || i7 == 2) {
            b0();
            return;
        }
        if (this.f30509B1 == 2) {
            b0();
            return;
        }
        ArrayList arrayList = this.f30588L1;
        if (arrayList == null || arrayList.isEmpty()) {
            showLoadingDialog(true);
            G.h(c.f40268a).getBorrowCoupon(this.f30564q1).k(f.f42629b).i(b.a()).subscribe(new n(this, 1));
            return;
        }
        Context context = getContext();
        if (context != null) {
            CLCouponDialog cLCouponDialog = new CLCouponDialog(context, arrayList, this.f30587K1);
            cLCouponDialog.setConfirmListener(new A8.c(3, this, cLCouponDialog));
            cLCouponDialog.show();
        }
    }

    public final void k0() {
        CLBorrowCouponData coupon;
        Long actualDiscountAmount;
        Context context = getContext();
        if (context != null) {
            CLRepaymentPlanData cLRepaymentPlanData = this.f30564q1;
            if ((cLRepaymentPlanData != null ? cLRepaymentPlanData.getCoupon() : null) != null) {
                C().setTextColor(context.getColor(L6.b.ppColorTextPrimary));
                D().setVisibility(0);
                TextView textViewC = C();
                int i7 = g.cs_use_coupons_content;
                CLRepaymentPlanData cLRepaymentPlanData2 = this.f30564q1;
                textViewC.setText(getString(i7, r0.B((cLRepaymentPlanData2 == null || (coupon = cLRepaymentPlanData2.getCoupon()) == null || (actualDiscountAmount = coupon.getActualDiscountAmount()) == null) ? 0L : actualDiscountAmount.longValue(), true)));
                E().setVisibility(0);
                return;
            }
            ArrayList arrayList = this.f30588L1;
            if (arrayList == null || arrayList.isEmpty()) {
                C().setTextColor(context.getColor(Ya.b.cs_cl_bw_no_coupon_txt_color));
                D().setVisibility(8);
                C().setText(getString(g.cs_unavailable_coupons));
                E().setVisibility(8);
                return;
            }
            C().setTextColor(context.getColor(L6.b.ppColorTextPrimary));
            D().setVisibility(0);
            C().setText(getString(g.cs_available_coupons, Integer.valueOf(arrayList.size())));
            E().setVisibility(0);
        }
    }

    public final void l0(boolean z3) {
        Context context = getContext();
        if (context != null) {
            t tVar = this.f30513D0;
            t tVar2 = this.f30563q0;
            t tVar3 = this.f30521H0;
            t tVar4 = this.f30522I0;
            t tVar5 = this.f30516F0;
            t tVar6 = this.f30523J0;
            t tVar7 = this.f30518G0;
            if (z3) {
                this.f30509B1 = 2;
                Object value = tVar7.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((LinearLayout) value).setBackgroundResource(d.cs_cl_loan_method_unchecked_bg);
                Object value2 = tVar6.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((LinearLayout) value2).setBackgroundResource(d.cs_cl_loan_method_checked_bg);
                Object value3 = tVar5.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                ((TextView) value3).setTextColor(context.getColor(L6.b.ppColorTextPrimary));
                O().setTextColor(context.getColor(L6.b.ppColorTextDisable));
                Object value4 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                ((TextView) value4).setTextColor(context.getColor(L6.b.ppColorFlexiCashPrimary));
                Object value5 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((TextView) value5).setTextColor(context.getColor(L6.b.ppColorFlexiCashPrimary));
                Object value6 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                ((LinearLayout) value6).setVisibility(0);
                Object value7 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                ((LinearLayout) value7).setVisibility(8);
                c0();
                return;
            }
            this.f30509B1 = this.f30512C1;
            Object value8 = tVar7.getValue();
            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
            ((LinearLayout) value8).setBackgroundResource(d.cs_cl_loan_method_checked_bg);
            Object value9 = tVar6.getValue();
            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
            ((LinearLayout) value9).setBackgroundResource(d.cs_cl_loan_method_unchecked_bg);
            Object value10 = tVar5.getValue();
            Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
            ((TextView) value10).setTextColor(context.getColor(L6.b.ppColorFlexiCashPrimary));
            O().setTextColor(context.getColor(L6.b.ppColorFlexiCashPrimary));
            Object value11 = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
            ((TextView) value11).setTextColor(context.getColor(L6.b.ppColorTextPrimary));
            Object value12 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
            ((TextView) value12).setTextColor(context.getColor(L6.b.ppColorTextDisable));
            Object value13 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
            ((LinearLayout) value13).setVisibility(8);
            Object value14 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
            ((LinearLayout) value14).setVisibility(0);
            k0();
        }
    }

    public final void m0() {
        CLRepaymentPlanData cLRepaymentPlanData;
        Long stampDuty;
        Long managementFeeSum;
        Long loanAmount;
        Long stampDuty2;
        Long managementFeeSum2;
        Long stampDuty3;
        Long managementFeeSum3;
        int i7;
        F6.d.h(this.f27317a, 3, "mShowStampDutyView = " + this.f30519G1 + ", mOnlyProductType = " + this.f30506A1 + ", mSelectedMethod = " + this.f30509B1);
        int i10 = this.f30506A1;
        if (i10 == 1 || i10 == 3 || i10 == 2 || (i7 = this.f30509B1) == 2) {
            cLRepaymentPlanData = this.f30562p1;
        } else {
            cLRepaymentPlanData = (i7 == 1 || i7 == 3) ? this.f30564q1 : null;
        }
        long jLongValue = 0;
        boolean z3 = ((cLRepaymentPlanData == null || (managementFeeSum3 = cLRepaymentPlanData.getManagementFeeSum()) == null) ? 0L : managementFeeSum3.longValue()) > 0;
        boolean z8 = ((cLRepaymentPlanData == null || (stampDuty3 = cLRepaymentPlanData.getStampDuty()) == null) ? 0L : stampDuty3.longValue()) > 0;
        if (!z3 && !z8) {
            this.f30519G1 = false;
        }
        Object value = this.f30546c1.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        h.s((ConstraintLayout) value, this.f30519G1);
        if (this.f30519G1) {
            t tVar = this.f30544a1;
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            h.s((TextView) value2, z3);
            t tVar2 = this.Z0;
            Object value3 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            h.s((TextView) value3, z8);
            String strB = r0.B(r0.U1(String.valueOf((cLRepaymentPlanData == null || (loanAmount = cLRepaymentPlanData.getLoanAmount()) == null) ? 0L : loanAmount.longValue()), String.valueOf(r0.b(String.valueOf((cLRepaymentPlanData == null || (managementFeeSum2 = cLRepaymentPlanData.getManagementFeeSum()) == null) ? 0L : managementFeeSum2.longValue()), String.valueOf((cLRepaymentPlanData == null || (stampDuty2 = cLRepaymentPlanData.getStampDuty()) == null) ? 0L : stampDuty2.longValue())))).longValueExact(), true);
            Object value4 = this.f30545b1.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((TextView) value4).setText("Received amount: " + strB);
            Object value5 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            TextView textView = (TextView) value5;
            textView.setText("Management fee: " + r0.B((cLRepaymentPlanData == null || (managementFeeSum = cLRepaymentPlanData.getManagementFeeSum()) == null) ? 0L : managementFeeSum.longValue(), true));
            Object value6 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            TextView textView2 = (TextView) value6;
            if (cLRepaymentPlanData != null && (stampDuty = cLRepaymentPlanData.getStampDuty()) != null) {
                jLongValue = stampDuty.longValue();
            }
            G.x("Stamp duty: ", r0.B(jLongValue, true), textView2);
        }
    }

    public final void n0() {
        double dDoubleValue;
        Long outstandingAmountSum;
        CLShortCashRepaymentPlanData cashRepayPlanAndCoupon;
        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS;
        CLRepaymentPlanData cLRepaymentPlanData;
        Double interestRatio;
        CLShortCashRepaymentPlanData cashRepayPlanAndCoupon2;
        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS2;
        Context context = getContext();
        if (context != null) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00%");
            CLMultipleRepaymentPlanData cLMultipleRepaymentPlanData = this.f30571u1;
            boolean z3 = false;
            if (((cLMultipleRepaymentPlanData == null || (cashRepayPlanAndCoupon2 = cLMultipleRepaymentPlanData.getCashRepayPlanAndCoupon()) == null || (calcRepayPlanForFCAndCouponDTOS2 = cashRepayPlanAndCoupon2.getCalcRepayPlanForFCAndCouponDTOS()) == null) ? 0 : calcRepayPlanForFCAndCouponDTOS2.size()) > 0) {
                CLMultipleRepaymentPlanData cLMultipleRepaymentPlanData2 = this.f30571u1;
                dDoubleValue = (cLMultipleRepaymentPlanData2 == null || (cashRepayPlanAndCoupon = cLMultipleRepaymentPlanData2.getCashRepayPlanAndCoupon()) == null || (calcRepayPlanForFCAndCouponDTOS = cashRepayPlanAndCoupon.getCalcRepayPlanForFCAndCouponDTOS()) == null || (cLRepaymentPlanData = calcRepayPlanForFCAndCouponDTOS.get(0)) == null || (interestRatio = cLRepaymentPlanData.getInterestRatio()) == null) ? 0.0d : interestRatio.doubleValue();
            } else {
                dDoubleValue = 0.06d;
            }
            O().setText(getString(g.cs_cl_product_rate, decimalFormat.format(dDoubleValue)));
            Object value = this.f30508B0.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((TextView) value).setText(getString(g.cs_cl_when_to_repay));
            Object value2 = this.f30578x0.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((TextView) value2).setText(getString(g.cs_cl_how_long_to_keep));
            y yVar = this.f30585I1;
            ArrayList arrayList = this.f30583z1;
            if (yVar == null) {
                this.f30585I1 = new y(context, arrayList, this.f30581y1, 1);
                Q().setAdapter(this.f30585I1);
                y yVar2 = this.f30585I1;
                if (yVar2 != null) {
                    j itemClickListener = new j(this, 1);
                    Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
                    yVar2.f4993c = itemClickListener;
                }
            } else {
                yVar.f43823d = this.f30581y1;
                yVar.f43824e = 1;
            }
            Q().setLayoutManager(new GridLayoutManager(context, arrayList.size()));
            y yVar3 = this.f30585I1;
            if (yVar3 != null) {
                yVar3.notifyDataSetChanged();
            }
            Object value3 = this.f30511C0.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((ConstraintLayout) value3).setVisibility(0);
            if (Q().getVisibility() == 0 && this.f30586J1) {
                P().setVisibility(0);
            } else {
                P().setVisibility(8);
            }
            int i7 = this.f30581y1;
            if (i7 >= 0 && i7 < arrayList.size()) {
                Object value4 = this.f30505A0.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                TextView textView = (TextView) value4;
                CLRepaymentPlanData cLRepaymentPlanData2 = this.f30564q1;
                textView.setText(r0.X1(cLRepaymentPlanData2 != null ? cLRepaymentPlanData2.getRepaymentDate() : null, "dd MMM, yyyy"));
                Object value5 = this.f30569t0.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                TextView textView2 = (TextView) value5;
                CLRepaymentPlanData cLRepaymentPlanData3 = this.f30564q1;
                textView2.setText(r0.B((cLRepaymentPlanData3 == null || (outstandingAmountSum = cLRepaymentPlanData3.getOutstandingAmountSum()) == null) ? 0L : outstandingAmountSum.longValue(), true));
                Object value6 = this.f30576w0.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                TextView textView3 = (TextView) value6;
                int i10 = g.cs_cl_repay_days;
                CLRepaymentPlanData cLRepaymentPlanData4 = this.f30564q1;
                textView3.setText(getString(i10, String.valueOf(cLRepaymentPlanData4 != null ? cLRepaymentPlanData4.getInterestDays() : null)));
                N().setVisibility(0);
                R().setVisibility(0);
                K().setVisibility(0);
            }
            Button buttonZ = z();
            int i11 = this.f30581y1;
            if (i11 >= 0 && i11 < arrayList.size()) {
                z3 = true;
            }
            buttonZ.setEnabled(z3);
            super.e0();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        if (getContext() != null) {
            Bundle arguments = getArguments();
            this.f30554k1 = arguments != null ? arguments.getInt("cl_account_type", 7) : 7;
            org.greenrobot.eventbus.c.b().j(this);
            HashMap map = this.f30574v1;
            map.put(2, "CASH_INSTALLMENT_LOAN");
            map.put(1, "CASH_LOAN");
            map.put(3, "CASH_INSTANT_LOAN");
            Object value = this.f30549h1.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((TextView) value).setText(BaseApplication.getCurrencySymbol());
            x().setKeyListener(DigitsKeyListener.getInstance("0123456789"));
            x().setShowSoftInputOnFocus(false);
            I().getPaint().setFlags(8);
            I().getPaint().setAntiAlias(true);
            J().addItemDecoration(new Ab.h());
            A().setActionText(getString(k.core_confirm));
            A().setActionButtonEnable(false);
            K().getPaint().setFlags(8);
            K().getPaint().setAntiAlias(true);
        }
        if (getContext() != null) {
            P().getPaint().setFlags(8);
            P().getPaint().setAntiAlias(true);
            L().getPaint().setFlags(8);
            L().getPaint().setAntiAlias(true);
            M().addItemDecoration(new o());
            Q().addItemDecoration(new p());
        }
        Context context = getContext();
        if (context != null) {
            x().setOnTextInputListener(new a(this, 2));
            x().setOnFocusChangeListener(new ViewOnFocusChangeListenerC0052d(0, this, context));
            x().addTextChangedListener(new i(this, 0));
            A().setDigitalKeyboardClickListener(new Ab.j(this));
            Object value2 = this.f30560p.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            h.l(new ViewOnClickListenerC0053e(context, this), (TextView) value2);
            h.l(new Ab.f(this, 0), x());
            Object value3 = this.f1.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            h.l(new Ab.f(this, 1), (TextView) value3);
            h.l(new Ab.f(this, 2), I());
            h.l(new Ab.f(this, 3), E());
            Object value4 = this.f30504A.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            h.l(new A8.c(2, this, context), (TextView) value4);
            h.l(new Ab.f(this, 4), K());
            h.l(new Ab.f(this, 5), z());
        }
        if (getContext() != null) {
            Object value5 = this.f30553k0.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            h.l(new Ab.f(this, 6), (TextView) value5);
            Object value6 = this.f30505A0.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            h.l(new Ab.f(this, 15), (TextView) value6);
            h.l(new Ab.f(this, 16), T());
            h.l(new Ab.f(this, 17), w());
            h.l(new Ab.f(this, 18), P());
            h.l(new Ab.f(this, 19), L());
            Object value7 = this.f30531P0.getValue();
            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
            h.l(new Ab.f(this, 7), (ConstraintLayout) value7);
            Object value8 = this.f30527M.getValue();
            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
            h.l(new Ab.f(this, 8), (ConstraintLayout) value8);
            Object value9 = this.f30573v0.getValue();
            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
            h.l(new Ab.f(this, 9), (ConstraintLayout) value9);
            Object value10 = this.f30518G0.getValue();
            Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
            h.l(new Ab.f(this, 10), (LinearLayout) value10);
            Object value11 = this.f30523J0.getValue();
            Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
            h.l(new Ab.f(this, 11), (LinearLayout) value11);
            h.l(new Ab.f(this, 12), C());
            h.l(new Ab.f(this, 13), D());
            Object value12 = this.Z0.getValue();
            Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
            h.l(new Ab.f(this, 14), (TextView) value12);
        }
        return 0;
    }

    public final void o0() {
        double dDoubleValue;
        String str;
        Long repaymentDate;
        Long outstandingAmountSum;
        List<RepaymentPlan> repaymentPlanList;
        CLShortCashRepaymentPlanData installRepayPlanAndCoupon;
        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS;
        CLRepaymentPlanData cLRepaymentPlanData;
        Double interestRatio;
        CLShortCashRepaymentPlanData installRepayPlanAndCoupon2;
        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS2;
        Context context = getContext();
        if (context != null) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00%");
            CLMultipleRepaymentPlanData cLMultipleRepaymentPlanData = this.f30571u1;
            boolean z3 = false;
            if (((cLMultipleRepaymentPlanData == null || (installRepayPlanAndCoupon2 = cLMultipleRepaymentPlanData.getInstallRepayPlanAndCoupon()) == null || (calcRepayPlanForFCAndCouponDTOS2 = installRepayPlanAndCoupon2.getCalcRepayPlanForFCAndCouponDTOS()) == null) ? 0 : calcRepayPlanForFCAndCouponDTOS2.size()) > 0) {
                CLMultipleRepaymentPlanData cLMultipleRepaymentPlanData2 = this.f30571u1;
                dDoubleValue = (cLMultipleRepaymentPlanData2 == null || (installRepayPlanAndCoupon = cLMultipleRepaymentPlanData2.getInstallRepayPlanAndCoupon()) == null || (calcRepayPlanForFCAndCouponDTOS = installRepayPlanAndCoupon.getCalcRepayPlanForFCAndCouponDTOS()) == null || (cLRepaymentPlanData = calcRepayPlanForFCAndCouponDTOS.get(0)) == null || (interestRatio = cLRepaymentPlanData.getInterestRatio()) == null) ? 0.0d : interestRatio.doubleValue();
            } else {
                dDoubleValue = 0.06d;
            }
            Object value = this.f30521H0.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((TextView) value).setText(getString(g.cs_cl_product_rate, decimalFormat.format(dDoubleValue)));
            y yVar = this.f30568s1;
            ArrayList arrayList = this.f30566r1;
            if (yVar == null) {
                this.f30568s1 = new y(context, arrayList, this.f30559o1, 2);
            }
            y yVar2 = this.f30568s1;
            if (yVar2 != null) {
                yVar2.f43823d = this.f30559o1;
            }
            if (yVar2 != null) {
                yVar2.f43824e = 2;
            }
            if (M().getAdapter() == null) {
                M().setAdapter(this.f30568s1);
            }
            y yVar3 = this.f30568s1;
            if (yVar3 != null) {
                org.greenrobot.eventbus.f itemClickListener = new org.greenrobot.eventbus.f(this, 1);
                Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
                yVar3.f4993c = itemClickListener;
            }
            M().setLayoutManager(new GridLayoutManager(context, arrayList.size()));
            y yVar4 = this.f30568s1;
            if (yVar4 != null) {
                yVar4.notifyDataSetChanged();
            }
            Y().setVisibility(8);
            Z().setVisibility(8);
            Object value2 = this.f30561p0.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((ConstraintLayout) value2).setVisibility(0);
            if (M().getVisibility() == 0 && this.t1) {
                L().setVisibility(0);
            } else {
                L().setVisibility(8);
            }
            int i7 = this.f30559o1;
            if (i7 >= 0 && i7 < arrayList.size()) {
                List<RepaymentPlan> repaymentPlanList2 = ((CLRepaymentPlanData) arrayList.get(this.f30559o1)).getRepaymentPlanList();
                if (!(repaymentPlanList2 == null || repaymentPlanList2.isEmpty())) {
                    Object value3 = this.f30553k0.getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                    TextView textView = (TextView) value3;
                    CLRepaymentPlanData cLRepaymentPlanData2 = this.f30562p1;
                    RepaymentPlan repaymentPlan = null;
                    if (TextUtils.equals(cLRepaymentPlanData2 != null ? cLRepaymentPlanData2.getTermSpanUnit() : null, "D")) {
                        CLRepaymentPlanData cLRepaymentPlanData3 = this.f30562p1;
                        String strValueOf = String.valueOf(cLRepaymentPlanData3 != null ? cLRepaymentPlanData3.getTermSpan() : null);
                        CLRepaymentPlanData cLRepaymentPlanData4 = this.f30562p1;
                        String plainString = r0.w1(strValueOf, String.valueOf(cLRepaymentPlanData4 != null ? cLRepaymentPlanData4.getLoanTerm() : null)).toPlainString();
                        CLRepaymentPlanData cLRepaymentPlanData5 = this.f30562p1;
                        str = plainString + " days (" + (cLRepaymentPlanData5 != null ? cLRepaymentPlanData5.getLoanTerm() : null) + " periods)";
                    } else {
                        CLRepaymentPlanData cLRepaymentPlanData6 = this.f30562p1;
                        String strValueOf2 = String.valueOf(cLRepaymentPlanData6 != null ? cLRepaymentPlanData6.getTermSpan() : null);
                        CLRepaymentPlanData cLRepaymentPlanData7 = this.f30562p1;
                        String plainString2 = r0.w1(strValueOf2, String.valueOf(cLRepaymentPlanData7 != null ? cLRepaymentPlanData7.getLoanTerm() : null)).toPlainString();
                        CLRepaymentPlanData cLRepaymentPlanData8 = this.f30562p1;
                        str = plainString2 + " months (" + (cLRepaymentPlanData8 != null ? cLRepaymentPlanData8.getLoanTerm() : null) + " periods)";
                    }
                    textView.setText(str);
                    CLRepaymentPlanData cLRepaymentPlanData9 = this.f30562p1;
                    if (cLRepaymentPlanData9 != null && (repaymentPlanList = cLRepaymentPlanData9.getRepaymentPlanList()) != null) {
                        repaymentPlan = repaymentPlanList.get(0);
                    }
                    Object value4 = this.f30525L.getValue();
                    Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                    TextView textView2 = (TextView) value4;
                    CLRepaymentPlanData cLRepaymentPlanData10 = this.f30562p1;
                    long jLongValue = 0;
                    textView2.setText(r0.B((cLRepaymentPlanData10 == null || (outstandingAmountSum = cLRepaymentPlanData10.getOutstandingAmountSum()) == null) ? 0L : outstandingAmountSum.longValue(), true));
                    Object value5 = this.f30539X.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                    ((TextView) value5).setText(getString(g.cs_first_repayment_date_title));
                    t tVar = this.f30532Q;
                    Object value6 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                    TextView textView3 = (TextView) value6;
                    int i10 = g.cs_first_repayment_date;
                    if (repaymentPlan != null && (repaymentDate = repaymentPlan.getRepaymentDate()) != null) {
                        jLongValue = repaymentDate.longValue();
                    }
                    textView3.setText(getString(i10, r0.X1(Long.valueOf(jLongValue), "dd MMM, yyyy")));
                    Object value7 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                    ((TextView) value7).setVisibility(0);
                    N().setVisibility(0);
                    R().setVisibility(0);
                    K().setVisibility(0);
                }
            }
            Button buttonZ = z();
            int i11 = this.f30559o1;
            if (i11 >= 0 && i11 < arrayList.size()) {
                List<RepaymentPlan> repaymentPlanList3 = ((CLRepaymentPlanData) arrayList.get(this.f30559o1)).getRepaymentPlanList();
                if (!(repaymentPlanList3 == null || repaymentPlanList3.isEmpty())) {
                    z3 = true;
                }
            }
            buttonZ.setEnabled(z3);
            super.e0();
        }
    }

    public final void p0() {
        double dDoubleValue;
        Long outstandingAmountSum;
        CLShortCashRepaymentPlanData instantRepayPlanAndCoupon;
        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS;
        CLRepaymentPlanData cLRepaymentPlanData;
        Double interestRatio;
        CLShortCashRepaymentPlanData instantRepayPlanAndCoupon2;
        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS2;
        Context context = getContext();
        if (context != null) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00%");
            CLMultipleRepaymentPlanData cLMultipleRepaymentPlanData = this.f30571u1;
            boolean z3 = false;
            if (((cLMultipleRepaymentPlanData == null || (instantRepayPlanAndCoupon2 = cLMultipleRepaymentPlanData.getInstantRepayPlanAndCoupon()) == null || (calcRepayPlanForFCAndCouponDTOS2 = instantRepayPlanAndCoupon2.getCalcRepayPlanForFCAndCouponDTOS()) == null) ? 0 : calcRepayPlanForFCAndCouponDTOS2.size()) > 0) {
                CLMultipleRepaymentPlanData cLMultipleRepaymentPlanData2 = this.f30571u1;
                dDoubleValue = (cLMultipleRepaymentPlanData2 == null || (instantRepayPlanAndCoupon = cLMultipleRepaymentPlanData2.getInstantRepayPlanAndCoupon()) == null || (calcRepayPlanForFCAndCouponDTOS = instantRepayPlanAndCoupon.getCalcRepayPlanForFCAndCouponDTOS()) == null || (cLRepaymentPlanData = calcRepayPlanForFCAndCouponDTOS.get(0)) == null || (interestRatio = cLRepaymentPlanData.getInterestRatio()) == null) ? 0.0d : interestRatio.doubleValue();
            } else {
                dDoubleValue = 0.06d;
            }
            O().setText(getString(g.cs_cl_product_rate, decimalFormat.format(dDoubleValue)));
            Object value = this.f30508B0.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((TextView) value).setText(getString(g.cs_cl_how_long_to_keep));
            Object value2 = this.f30578x0.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((TextView) value2).setText(getString(g.cs_cl_when_to_repay));
            y yVar = this.f30585I1;
            ArrayList arrayList = this.f30583z1;
            if (yVar == null) {
                this.f30585I1 = new y(context, arrayList, this.f30581y1, 3);
                Q().setAdapter(this.f30585I1);
                y yVar2 = this.f30585I1;
                if (yVar2 != null) {
                    p1.c itemClickListener = new p1.c(this, 1);
                    Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
                    yVar2.f4993c = itemClickListener;
                }
            } else {
                yVar.f43823d = this.f30581y1;
                yVar.f43824e = 3;
            }
            Q().setLayoutManager(new GridLayoutManager(context, arrayList.size()));
            y yVar3 = this.f30585I1;
            if (yVar3 != null) {
                yVar3.notifyDataSetChanged();
            }
            Object value3 = this.f30511C0.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((ConstraintLayout) value3).setVisibility(0);
            if (Q().getVisibility() == 0 && this.f30586J1) {
                P().setVisibility(0);
            } else {
                P().setVisibility(8);
            }
            int i7 = this.f30581y1;
            if (i7 >= 0 && i7 < arrayList.size()) {
                Object value4 = this.f30576w0.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                TextView textView = (TextView) value4;
                CLRepaymentPlanData cLRepaymentPlanData2 = this.f30564q1;
                textView.setText(r0.X1(cLRepaymentPlanData2 != null ? cLRepaymentPlanData2.getRepaymentDate() : null, "dd MMM, yyyy"));
                Object value5 = this.f30569t0.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                TextView textView2 = (TextView) value5;
                CLRepaymentPlanData cLRepaymentPlanData3 = this.f30564q1;
                textView2.setText(r0.B((cLRepaymentPlanData3 == null || (outstandingAmountSum = cLRepaymentPlanData3.getOutstandingAmountSum()) == null) ? 0L : outstandingAmountSum.longValue(), true));
                Object value6 = this.f30505A0.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                TextView textView3 = (TextView) value6;
                int i10 = g.cs_cl_repay_days;
                CLRepaymentPlanData cLRepaymentPlanData4 = this.f30564q1;
                textView3.setText(getString(i10, String.valueOf(cLRepaymentPlanData4 != null ? cLRepaymentPlanData4.getLoanDays() : null)));
                N().setVisibility(0);
                R().setVisibility(0);
                K().setVisibility(0);
            }
            Button buttonZ = z();
            int i11 = this.f30581y1;
            if (i11 >= 0 && i11 < arrayList.size()) {
                z3 = true;
            }
            buttonZ.setEnabled(z3);
            super.e0();
        }
    }

    public final void q0() {
        Long outstandingAmountSum;
        Context context = getContext();
        if (context != null) {
            boolean z3 = false;
            B().setVisibility(0);
            Object value = this.f30538W0.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((TextView) value).setText(getString(g.cs_cl_when_to_repay));
            Object value2 = this.f30535S0.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((TextView) value2).setText(getString(g.cs_cl_how_long_to_keep));
            y yVar = this.f30568s1;
            ArrayList arrayList = this.f30566r1;
            if (yVar == null) {
                this.f30568s1 = new y(context, arrayList, this.f30559o1, 1);
            }
            y yVar2 = this.f30568s1;
            if (yVar2 != null) {
                yVar2.f43823d = this.f30559o1;
            }
            if (yVar2 != null) {
                yVar2.f43824e = 1;
            }
            if (J().getAdapter() == null) {
                J().setAdapter(this.f30568s1);
            }
            y yVar3 = this.f30568s1;
            if (yVar3 != null) {
                C2085k0 itemClickListener = new C2085k0(this, 1);
                Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
                yVar3.f4993c = itemClickListener;
            }
            J().setLayoutManager(new GridLayoutManager(context, arrayList.size()));
            y yVar4 = this.f30568s1;
            if (yVar4 != null) {
                yVar4.notifyDataSetChanged();
            }
            if (J().getVisibility() == 0 && this.t1) {
                I().setVisibility(0);
            } else {
                I().setVisibility(8);
            }
            int i7 = this.f30559o1;
            if (i7 >= 0 && i7 < arrayList.size()) {
                TextView textViewW = w();
                CLRepaymentPlanData cLRepaymentPlanData = this.f30562p1;
                textViewW.setText(r0.X1(cLRepaymentPlanData != null ? cLRepaymentPlanData.getRepaymentDate() : null, "dd MMM, yyyy"));
                Object value3 = this.f30529N0.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                TextView textView = (TextView) value3;
                CLRepaymentPlanData cLRepaymentPlanData2 = this.f30562p1;
                textView.setText(r0.B((cLRepaymentPlanData2 == null || (outstandingAmountSum = cLRepaymentPlanData2.getOutstandingAmountSum()) == null) ? 0L : outstandingAmountSum.longValue(), true));
                TextView textViewT = T();
                int i10 = g.cs_cl_repay_days;
                CLRepaymentPlanData cLRepaymentPlanData3 = this.f30562p1;
                textViewT.setText(getString(i10, String.valueOf(cLRepaymentPlanData3 != null ? cLRepaymentPlanData3.getInterestDays() : null)));
                W().setVisibility(0);
                R().setVisibility(0);
                K().setVisibility(0);
                B().setVisibility(0);
            }
            Button buttonZ = z();
            int i11 = this.f30559o1;
            if (i11 >= 0 && i11 < arrayList.size()) {
                z3 = true;
            }
            buttonZ.setEnabled(z3);
            super.e0();
        }
    }

    public final void r0() {
        List<RepaymentPlan> repaymentPlanList;
        List<RepaymentPlan> repaymentPlanList2;
        String string;
        Long repaymentDate;
        Long outstandingAmountSum;
        List<RepaymentPlan> repaymentPlanList3;
        Context context = getContext();
        if (context != null) {
            y yVar = this.f30568s1;
            ArrayList arrayList = this.f30566r1;
            if (yVar == null) {
                this.f30568s1 = new y(context, arrayList, this.f30559o1, 2);
            }
            y yVar2 = this.f30568s1;
            if (yVar2 != null) {
                yVar2.f43823d = this.f30559o1;
            }
            if (yVar2 != null) {
                yVar2.f43824e = 2;
            }
            if (J().getAdapter() == null) {
                J().setAdapter(this.f30568s1);
            }
            y yVar3 = this.f30568s1;
            if (yVar3 != null) {
                r itemClickListener = new r(this, 0);
                Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
                yVar3.f4993c = itemClickListener;
            }
            J().setLayoutManager(new GridLayoutManager(context, arrayList.size()));
            y yVar4 = this.f30568s1;
            if (yVar4 != null) {
                yVar4.notifyDataSetChanged();
            }
            Y().setVisibility(8);
            Z().setVisibility(8);
            boolean z3 = false;
            B().setVisibility(0);
            if (J().getVisibility() == 0 && this.t1) {
                I().setVisibility(0);
            } else {
                I().setVisibility(8);
            }
            int i7 = this.f30559o1;
            if (i7 >= 0 && i7 < arrayList.size() && (repaymentPlanList2 = ((CLRepaymentPlanData) arrayList.get(this.f30559o1)).getRepaymentPlanList()) != null && !repaymentPlanList2.isEmpty()) {
                TextView textViewW = w();
                CLRepaymentPlanData cLRepaymentPlanData = this.f30562p1;
                RepaymentPlan repaymentPlan = null;
                if (TextUtils.equals(cLRepaymentPlanData != null ? cLRepaymentPlanData.getTermSpanUnit() : null, "D")) {
                    int i10 = g.cs_cl_repay_day_with_period;
                    CLRepaymentPlanData cLRepaymentPlanData2 = this.f30562p1;
                    String strValueOf = String.valueOf(cLRepaymentPlanData2 != null ? cLRepaymentPlanData2.getLoanDays() : null);
                    CLRepaymentPlanData cLRepaymentPlanData3 = this.f30562p1;
                    string = getString(i10, strValueOf, "s", cLRepaymentPlanData3 != null ? cLRepaymentPlanData3.getTerm() : null);
                } else {
                    int i11 = g.cs_cl_repay_month_with_period;
                    CLRepaymentPlanData cLRepaymentPlanData4 = this.f30562p1;
                    String term = cLRepaymentPlanData4 != null ? cLRepaymentPlanData4.getTerm() : null;
                    CLRepaymentPlanData cLRepaymentPlanData5 = this.f30562p1;
                    string = getString(i11, term, "s", cLRepaymentPlanData5 != null ? cLRepaymentPlanData5.getTerm() : null);
                }
                textViewW.setText(string);
                CLRepaymentPlanData cLRepaymentPlanData6 = this.f30562p1;
                if (cLRepaymentPlanData6 != null && (repaymentPlanList3 = cLRepaymentPlanData6.getRepaymentPlanList()) != null) {
                    repaymentPlan = repaymentPlanList3.get(0);
                }
                Object value = this.f30529N0.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                TextView textView = (TextView) value;
                CLRepaymentPlanData cLRepaymentPlanData7 = this.f30562p1;
                long jLongValue = 0;
                textView.setText(r0.B((cLRepaymentPlanData7 == null || (outstandingAmountSum = cLRepaymentPlanData7.getOutstandingAmountSum()) == null) ? 0L : outstandingAmountSum.longValue(), true));
                T().setText(getString(g.cs_first_repayment_date_title));
                t tVar = this.f30533Q0;
                Object value2 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                TextView textView2 = (TextView) value2;
                int i12 = g.cs_first_repayment_date;
                if (repaymentPlan != null && (repaymentDate = repaymentPlan.getRepaymentDate()) != null) {
                    jLongValue = repaymentDate.longValue();
                }
                textView2.setText(getString(i12, r0.X1(Long.valueOf(jLongValue), "dd MMM, yyyy")));
                Object value3 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                ((TextView) value3).setVisibility(0);
                W().setVisibility(0);
                R().setVisibility(0);
                K().setVisibility(0);
            }
            Button buttonZ = z();
            int i13 = this.f30559o1;
            if (i13 >= 0 && i13 < arrayList.size() && (repaymentPlanList = ((CLRepaymentPlanData) arrayList.get(this.f30559o1)).getRepaymentPlanList()) != null && !repaymentPlanList.isEmpty()) {
                z3 = true;
            }
            buttonZ.setEnabled(z3);
            super.e0();
        }
    }

    public final void s0() {
        Long outstandingAmountSum;
        Context context = getContext();
        if (context != null) {
            y yVar = this.f30568s1;
            ArrayList arrayList = this.f30566r1;
            if (yVar == null) {
                this.f30568s1 = new y(context, arrayList, this.f30559o1, 3);
            }
            y yVar2 = this.f30568s1;
            if (yVar2 != null) {
                yVar2.f43823d = this.f30559o1;
            }
            if (yVar2 != null) {
                yVar2.f43824e = 3;
            }
            if (J().getAdapter() == null) {
                J().setAdapter(this.f30568s1);
            }
            y yVar3 = this.f30568s1;
            if (yVar3 != null) {
                Oe.a itemClickListener = new Oe.a(this, 2);
                Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
                yVar3.f4993c = itemClickListener;
            }
            J().setLayoutManager(new GridLayoutManager(context, arrayList.size()));
            y yVar4 = this.f30568s1;
            if (yVar4 != null) {
                yVar4.notifyDataSetChanged();
            }
            boolean z3 = false;
            B().setVisibility(0);
            w().setVisibility(0);
            J().setVisibility(8);
            int i7 = this.f30559o1;
            if (i7 >= 0 && i7 < arrayList.size()) {
                TextView textViewT = T();
                CLRepaymentPlanData cLRepaymentPlanData = this.f30562p1;
                textViewT.setText(r0.X1(cLRepaymentPlanData != null ? cLRepaymentPlanData.getRepaymentDate() : null, "dd MMM, yyyy"));
                Object value = this.f30529N0.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                TextView textView = (TextView) value;
                CLRepaymentPlanData cLRepaymentPlanData2 = this.f30562p1;
                textView.setText(r0.B((cLRepaymentPlanData2 == null || (outstandingAmountSum = cLRepaymentPlanData2.getOutstandingAmountSum()) == null) ? 0L : outstandingAmountSum.longValue(), true));
                TextView textViewW = w();
                int i10 = g.cs_cl_repay_days;
                CLRepaymentPlanData cLRepaymentPlanData3 = this.f30562p1;
                textViewW.setText(getString(i10, String.valueOf(cLRepaymentPlanData3 != null ? cLRepaymentPlanData3.getLoanDays() : null)));
                W().setVisibility(0);
                R().setVisibility(0);
                K().setVisibility(0);
            }
            Button buttonZ = z();
            int i11 = this.f30559o1;
            if (i11 >= 0 && i11 < arrayList.size()) {
                z3 = true;
            }
            buttonZ.setEnabled(z3);
            super.e0();
        }
    }

    @Override // com.transsnet.palmpay.credit.ui.fragment.cashloan.CLBorrowBaseFragment
    public final void t() {
        BorrowAllDiscountConfig borrowAllDiscountConfig;
        Long maxLoanAmt;
        BorrowAllDiscountConfig borrowAllDiscountConfig2;
        Long maxLoanAmt2;
        boolean z3 = false;
        d0(false);
        this.f30559o1 = -1;
        this.f30581y1 = -1;
        W().setVisibility(8);
        N().setVisibility(8);
        E().setVisibility(8);
        R().setVisibility(8);
        int i7 = this.f30554k1;
        String str = this.f27317a;
        if (i7 == 7) {
            F6.d.h(str, 3, "queryRepaymentPlan >>>");
            CLCanBorrowData cLCanBorrowData = this.f30555l1;
            long jLongValue = (cLCanBorrowData == null || (maxLoanAmt2 = cLCanBorrowData.getMaxLoanAmt()) == null) ? 0L : maxLoanAmt2.longValue();
            long j6 = x().getLong();
            if (j6 <= 0 || j6 > jLongValue || j6 % ((long) FaceSecCode.SC_SUCCESS) != 0) {
                return;
            }
            showLoadingDialog(true);
            IApiCreditService iApiCreditServiceH = G.h(c.f40268a);
            Long lValueOf = Long.valueOf(x().getLong());
            if (this.D1 && (borrowAllDiscountConfig2 = this.f30579x1) != null && borrowAllDiscountConfig2.ifMatchTag) {
                z3 = true;
            }
            iApiCreditServiceH.queryRepaymentPlan(new CLRepaymentPlanReq(lValueOf, null, z3)).k(f.f42629b).i(b.a()).subscribe(new n(this, 2));
            return;
        }
        F6.d.h(str, 3, "queryInstallmentLoanRepaymentPlan >>>");
        CLCanBorrowData cLCanBorrowData2 = this.f30555l1;
        long jLongValue2 = (cLCanBorrowData2 == null || (maxLoanAmt = cLCanBorrowData2.getMaxLoanAmt()) == null) ? 0L : maxLoanAmt.longValue();
        long j10 = x().getLong();
        if (j10 <= 0 || j10 > jLongValue2 || j10 % ((long) FaceSecCode.SC_SUCCESS) != 0) {
            return;
        }
        showLoadingDialog(true);
        IApiCreditService iApiCreditServiceH2 = G.h(c.f40268a);
        Long lValueOf2 = Long.valueOf(x().getLong());
        if (this.D1 && (borrowAllDiscountConfig = this.f30579x1) != null && borrowAllDiscountConfig.ifMatchTag) {
            z3 = true;
        }
        iApiCreditServiceH2.queryInstallmentLoanRepaymentPlan(new CLRepaymentPlanReq(lValueOf2, null, z3)).k(f.f42629b).i(b.a()).subscribe(new q(this));
    }

    public final void t0() {
        G.h(c.f40268a).clBorrowUseCoupon(this.f30564q1).k(f.f42629b).i(b.a()).subscribe(new n(this, 3));
    }
}
