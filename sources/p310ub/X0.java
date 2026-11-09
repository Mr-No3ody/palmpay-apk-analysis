package p310ub;

import C0.G;
import Eb.a;
import Eb.n;
import Hb.L;
import L6.b;
import Pa.r0;
import Ya.d;
import Ya.g;
import Z4.e;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.horcrux.svg.d0;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import com.transsnet.palmpay.credit.bean.resp.CLFamilyAndFriendPayResp;
import com.transsnet.palmpay.credit.bean.resp.FamilyAndFriendsPayData;
import com.transsnet.palmpay.credit.bean.resp.OcOrderData;
import com.transsnet.palmpay.credit.bean.resp.OcOrderRsp;
import com.transsnet.palmpay.credit.bean.resp.OcRepayBillResp;
import com.transsnet.palmpay.credit.bean.resp.OcRepayExitResp;
import com.transsnet.palmpay.credit.bean.rsp.OcCurBillData;
import com.transsnet.palmpay.credit.bean.rsp.PalmPayCardBillData;
import com.transsnet.palmpay.credit.bean.rsp.PalmPayCardBillDetailResp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p220oa.h;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class X0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OcRepayActivity f42808g;

    public /* synthetic */ X0(OcRepayActivity ocRepayActivity, int i7) {
        this.f42807f = i7;
        this.f42808g = ocRepayActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42807f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42808g.addSubscription(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42808g.addSubscription(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42808g.addSubscription(d2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42808g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42808g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42807f) {
            case 0:
                this.f42808g.showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 2:
                this.f42808g.showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 3:
                this.f42808g.showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            default:
                this.f42808g.showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:220:0x063e  */
    /* JADX WARN: Code duplicated, block: B:254:0x076a  */
    /* JADX WARN: Code duplicated, block: B:255:0x076c  */
    /* JADX WARN: Code duplicated, block: B:257:0x0772  */
    /* JADX WARN: Code duplicated, block: B:258:0x0777  */
    /* JADX WARN: Code duplicated, block: B:261:0x077d  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c0  */
    @Override // Z4.e
    public final void y(Object obj) {
        long jLongValue;
        Long outstandingAmount;
        long jLongValue2;
        Long predictEveryTermSpreadAmount;
        Long outstandingAmount2;
        final int i7 = 2;
        final int i10 = 1;
        final OcRepayActivity ocRepayActivity = this.f42808g;
        switch (this.f42807f) {
            case 0:
                OcOrderRsp ocOrderRsp = (OcOrderRsp) obj;
                if (ocOrderRsp != null) {
                    ocRepayActivity.showLoadingDialog(false);
                    if (!ocOrderRsp.isSuccess()) {
                        ToastUtils.showLong(ocOrderRsp.getRespMsg(), new Object[0]);
                    } else {
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_preview_activity");
                        int i11 = OcRepayActivity.f29705v1;
                        Postcard postcardWithLong = postcardBuild.withLong("ok_card_repay_amount", ocRepayActivity.x().getLong()).withString("ok_card_repay_card_no", ocRepayActivity.f29742c1).withLong("ok_card_repay_bill_id", ocRepayActivity.d1);
                        OcOrderData data = ocOrderRsp.getData();
                        postcardWithLong.withString("ok_card_repay_order_no", data != null ? data.getOrderId() : null).navigation();
                    }
                }
                break;
            case 1:
                OcRepayExitResp ocRepayExitResp = (OcRepayExitResp) obj;
                if (ocRepayExitResp != null && ocRepayExitResp.isSuccess()) {
                    ocRepayActivity.f29762p1 = ocRepayExitResp.getData();
                    break;
                }
                break;
            case 2:
                OcRepayBillResp ocRepayBillResp = (OcRepayBillResp) obj;
                ocRepayActivity.showLoadingDialog(false);
                if (ocRepayBillResp == null || !ocRepayBillResp.isSuccess() || ocRepayBillResp.getData() == null) {
                    ToastUtils.showLong(ocRepayBillResp != null ? ocRepayBillResp.getRespMsg() : null, new Object[0]);
                } else {
                    OcCurBillData data2 = ocRepayBillResp.getData();
                    ocRepayActivity.f29748g1 = data2;
                    if (data2 != null) {
                        WaiverInfo waiverInfoD = ocRepayActivity.D();
                        boolean zQ = a.q(waiverInfoD);
                        if (!zQ) {
                            Long outstandingAmount3 = data2.getOutstandingAmount();
                            if (outstandingAmount3 != null) {
                                jLongValue = outstandingAmount3.longValue();
                            } else {
                                jLongValue = 0;
                            }
                        } else if ((waiverInfoD == null || (outstandingAmount2 = waiverInfoD.getCurrentOutstandingAmount()) == null) && (outstandingAmount2 = data2.getOutstandingAmount()) == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = outstandingAmount2.longValue();
                        }
                        ocRepayActivity.f1 = jLongValue;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(jLongValue)));
                        Object value = ocRepayActivity.f29777y0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        TextView textView = (TextView) value;
                        Long unpaidPrincipal = data2.getUnpaidPrincipal();
                        textView.setText(r0.B(unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L, true));
                        Object value2 = ocRepayActivity.f29720K0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        TextView textView2 = (TextView) value2;
                        int i12 = g.cs_oc_before_day;
                        Long beginTimeStamp = data2.getBeginTimeStamp();
                        String strX1 = r0.X1(Long.valueOf(beginTimeStamp != null ? beginTimeStamp.longValue() : 0L), "dd MMM");
                        Long endTimeStamp = data2.getEndTimeStamp();
                        textView2.setText(ocRepayActivity.getString(i12, strX1, r0.X1(Long.valueOf(endTimeStamp != null ? endTimeStamp.longValue() : 0L), "dd MMM")));
                        Integer stauts = data2.getStauts();
                        t tVar = ocRepayActivity.f29776x0;
                        if (stauts != null && stauts.intValue() == 2) {
                            Integer overdueDays = data2.getOverdueDays();
                            int iIntValue = overdueDays != null ? overdueDays.intValue() : 0;
                            ocRepayActivity.y().setText(iIntValue > 1 ? ocRepayActivity.getString(g.cs_oc_day_overdue, Integer.valueOf(iIntValue), "s") : ocRepayActivity.getString(g.cs_oc_day_overdue, Integer.valueOf(iIntValue), ""));
                            Object value3 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            ((LinearLayout) value3).setVisibility(0);
                            long j6 = ocRepayActivity.d1;
                            t tVar2 = ocRepayActivity.f29758o;
                            t tVar3 = ocRepayActivity.f29773v0;
                            if (j6 == 0 && TextUtils.isEmpty(ocRepayActivity.f29745e1)) {
                                Object value4 = tVar3.getValue();
                                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                                ((ImageView) value4).setVisibility(0);
                                Object value5 = tVar2.getValue();
                                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                                ((TextView) value5).setVisibility(0);
                            } else {
                                Object value6 = tVar3.getValue();
                                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                                ((ImageView) value6).setVisibility(8);
                                Object value7 = tVar2.getValue();
                                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                                ((TextView) value7).setVisibility(8);
                            }
                        } else {
                            Object value8 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                            ((LinearLayout) value8).setVisibility(8);
                        }
                        Long unpaidPenalty = data2.getUnpaidPenalty();
                        long jLongValue3 = unpaidPenalty != null ? unpaidPenalty.longValue() : 0L;
                        Long unpaidInterest = data2.getUnpaidInterest();
                        long jLongValue4 = jLongValue3 + (unpaidInterest != null ? unpaidInterest.longValue() : 0L);
                        Long unpaidInstallmentServiceFee = data2.getUnpaidInstallmentServiceFee();
                        long jLongValue5 = jLongValue4 + (unpaidInstallmentServiceFee != null ? unpaidInstallmentServiceFee.longValue() : 0L);
                        Long unpaidSpreadServiceFee = data2.getUnpaidSpreadServiceFee();
                        long jLongValue6 = jLongValue5 + (unpaidSpreadServiceFee != null ? unpaidSpreadServiceFee.longValue() : 0L);
                        t tVar4 = ocRepayActivity.f29769t0;
                        if (jLongValue6 > 0) {
                            Object value9 = ocRepayActivity.f29767s0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                            ((TextView) value9).setText(r0.B(jLongValue6, true));
                            Object value10 = tVar4.getValue();
                            Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                            ((LinearLayout) value10).setVisibility(0);
                        } else {
                            Object value11 = tVar4.getValue();
                            Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                            ((LinearLayout) value11).setVisibility(8);
                        }
                        Integer extensionTag = data2.getExtensionTag();
                        if (extensionTag != null && extensionTag.intValue() == 1) {
                            ocRepayActivity.r().setVisibility(0);
                            Object value12 = ocRepayActivity.f29735X.getValue();
                            Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                            TextView textView3 = (TextView) value12;
                            Long extensionAmount = data2.getExtensionAmount();
                            textView3.setText(r0.B(extensionAmount != null ? extensionAmount.longValue() : 0L, true));
                            Object value13 = ocRepayActivity.f29728Q.getValue();
                            Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                            TextView textView4 = (TextView) value13;
                            Long extensionAmount2 = data2.getExtensionAmount();
                            textView4.setText(r0.B(extensionAmount2 != null ? extensionAmount2.longValue() : 0L, true));
                            Object value14 = ocRepayActivity.f29710C.getValue();
                            Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                            TextView textView5 = (TextView) value14;
                            Long extensionDownPaymentPrincipal = data2.getExtensionDownPaymentPrincipal();
                            textView5.setText(r0.B(extensionDownPaymentPrincipal != null ? extensionDownPaymentPrincipal.longValue() : 0L, true));
                            Object value15 = ocRepayActivity.f29708B.getValue();
                            Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                            TextView textView6 = (TextView) value15;
                            Long extensionServiceFee = data2.getExtensionServiceFee();
                            textView6.setText(r0.B(extensionServiceFee != null ? extensionServiceFee.longValue() : 0L, true));
                            t tVar5 = ocRepayActivity.f29716H;
                            if (jLongValue6 > 0) {
                                Object value16 = ocRepayActivity.f29721L.getValue();
                                Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                                ((TextView) value16).setText(r0.B(jLongValue6, true));
                                Object value17 = tVar5.getValue();
                                Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                                ((Group) value17).setVisibility(0);
                            } else {
                                Object value18 = tVar5.getValue();
                                Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                                ((Group) value18).setVisibility(8);
                            }
                            Object value19 = ocRepayActivity.f29706A.getValue();
                            Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                            TextView textView7 = (TextView) value19;
                            int i13 = g.cs_oc_mini_repayment_explain;
                            Long extensionAmount3 = data2.getExtensionAmount();
                            String strB = r0.B(extensionAmount3 != null ? extensionAmount3.longValue() : 0L, true);
                            Long extensionLastPrincipal = data2.getExtensionLastPrincipal();
                            String strB2 = r0.B(extensionLastPrincipal != null ? extensionLastPrincipal.longValue() : 0L, true);
                            Long extensionLastRepaymentDateStamp = data2.getExtensionLastRepaymentDateStamp();
                            textView7.setText(ocRepayActivity.getString(i13, strB, strB2, r0.X1(Long.valueOf(extensionLastRepaymentDateStamp != null ? extensionLastRepaymentDateStamp.longValue() : 0L), "MMM dd")));
                        } else {
                            ocRepayActivity.r().setVisibility(8);
                            Object value20 = ocRepayActivity.f29747g.getValue();
                            Intrinsics.checkNotNullExpressionValue(value20, "getValue(...)");
                            ((View) value20).setVisibility(8);
                        }
                        Integer spreadTag = data2.getSpreadTag();
                        if (spreadTag != null && spreadTag.intValue() == 1) {
                            ocRepayActivity.A().setVisibility(0);
                            ocRepayActivity.s().setVisibility(8);
                            Object value21 = ocRepayActivity.f29772v.getValue();
                            Intrinsics.checkNotNullExpressionValue(value21, "getValue(...)");
                            TextView textView8 = (TextView) value21;
                            SpanUtils foregroundColor = G.i("Pay in up to").setForegroundColor(ocRepayActivity.getColor(b.ppColorTextPrimary));
                            OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                            textView8.setText(foregroundColor.append(" " + (ocCurBillData != null ? ocCurBillData.getSpreadMaxTerm() : null)).setForegroundColor(ocRepayActivity.getColor(Ya.b.cs_oc_main_color)).append(" installment").setForegroundColor(ocRepayActivity.getColor(b.ppColorTextPrimary)).create());
                            Object value22 = ocRepayActivity.t.getValue();
                            Intrinsics.checkNotNullExpressionValue(value22, "getValue(...)");
                            TextView textView9 = (TextView) value22;
                            SpanUtils foregroundColor2 = G.i("Only").setForegroundColor(ocRepayActivity.getColor(b.ppColorTextPrimary));
                            OcCurBillData ocCurBillData2 = ocRepayActivity.f29748g1;
                            textView9.setText(d0.j(" ", r0.B((ocCurBillData2 == null || (predictEveryTermSpreadAmount = ocCurBillData2.getPredictEveryTermSpreadAmount()) == null) ? 0L : predictEveryTermSpreadAmount.longValue(), true), foregroundColor2).setForegroundColor(ocRepayActivity.getColor(Ya.b.cs_oc_main_color)).append(" needed to repay in each period").setForegroundColor(ocRepayActivity.getColor(b.ppColorTextPrimary)).create());
                        } else {
                            ocRepayActivity.A().setVisibility(8);
                            if (data2.getSpreadPromptType() != null) {
                                ocRepayActivity.s().setVisibility(0);
                            } else {
                                ocRepayActivity.s().setVisibility(8);
                            }
                        }
                        if (zQ && waiverInfoD != null) {
                            ocRepayActivity.f29771u1 = true;
                            ocRepayActivity.f29768s1 = waiverInfoD;
                            Object value23 = ocRepayActivity.f29726O0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value23, "getValue(...)");
                            ((ImageView) value23).setVisibility(0);
                            Object value24 = ocRepayActivity.f29727P0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value24, "getValue(...)");
                            ((View) value24).setVisibility(0);
                            Object value25 = ocRepayActivity.f29725N0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value25, "getValue(...)");
                            ((LinearLayout) value25).setBackgroundColor(ocRepayActivity.getColor(p.transparent));
                            final int i14 = 0;
                            a.g(waiverInfoD.getBadgeText(), new Function1() { // from class: ub.W0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    OcRepayActivity ocRepayActivity2 = ocRepayActivity;
                                    String it = (String) obj2;
                                    switch (i14) {
                                        case 0:
                                            int i15 = OcRepayActivity.f29705v1;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            t tVar6 = ocRepayActivity2.f29729Q0;
                                            Object value26 = tVar6.getValue();
                                            Intrinsics.checkNotNullExpressionValue(value26, "getValue(...)");
                                            ((TextView) value26).setText(it);
                                            Object value27 = tVar6.getValue();
                                            Intrinsics.checkNotNullExpressionValue(value27, "getValue(...)");
                                            ((TextView) value27).setVisibility(0);
                                            break;
                                        case 1:
                                            int i16 = OcRepayActivity.f29705v1;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            Object value28 = ocRepayActivity2.f29730R0.getValue();
                                            Intrinsics.checkNotNullExpressionValue(value28, "getValue(...)");
                                            ((TextView) value28).setText(it);
                                            Object value29 = ocRepayActivity2.f29731S0.getValue();
                                            Intrinsics.checkNotNullExpressionValue(value29, "getValue(...)");
                                            ((View) value29).setVisibility(0);
                                            break;
                                        default:
                                            int i17 = OcRepayActivity.f29705v1;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            ocRepayActivity2.w().setText(it);
                                            ocRepayActivity2.w().setVisibility(0);
                                            break;
                                    }
                                    return Unit.f38893a;
                                }
                            }, new T0(ocRepayActivity, 5));
                            a.g(waiverInfoD.getSummaryText(), new Function1() { // from class: ub.W0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    OcRepayActivity ocRepayActivity2 = ocRepayActivity;
                                    String it = (String) obj2;
                                    switch (i10) {
                                        case 0:
                                            int i15 = OcRepayActivity.f29705v1;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            t tVar6 = ocRepayActivity2.f29729Q0;
                                            Object value26 = tVar6.getValue();
                                            Intrinsics.checkNotNullExpressionValue(value26, "getValue(...)");
                                            ((TextView) value26).setText(it);
                                            Object value27 = tVar6.getValue();
                                            Intrinsics.checkNotNullExpressionValue(value27, "getValue(...)");
                                            ((TextView) value27).setVisibility(0);
                                            break;
                                        case 1:
                                            int i16 = OcRepayActivity.f29705v1;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            Object value28 = ocRepayActivity2.f29730R0.getValue();
                                            Intrinsics.checkNotNullExpressionValue(value28, "getValue(...)");
                                            ((TextView) value28).setText(it);
                                            Object value29 = ocRepayActivity2.f29731S0.getValue();
                                            Intrinsics.checkNotNullExpressionValue(value29, "getValue(...)");
                                            ((View) value29).setVisibility(0);
                                            break;
                                        default:
                                            int i17 = OcRepayActivity.f29705v1;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            ocRepayActivity2.w().setText(it);
                                            ocRepayActivity2.w().setVisibility(0);
                                            break;
                                    }
                                    return Unit.f38893a;
                                }
                            }, new T0(ocRepayActivity, 7));
                            Object value26 = ocRepayActivity.T0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value26, "getValue(...)");
                            ((ImageView) value26).setImageResource(Intrinsics.c(waiverInfoD.getWaiverType(), WaiverInfo.TYPE_FULL) ? d.cs_cl_loan_repayment_fully_date_bj_item1 : d.cs_cl_loan_repayment_fully_date_bj_item2);
                            a.g(waiverInfoD.getAmountLabel(), new Function1() { // from class: ub.W0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    OcRepayActivity ocRepayActivity2 = ocRepayActivity;
                                    String it = (String) obj2;
                                    switch (i7) {
                                        case 0:
                                            int i15 = OcRepayActivity.f29705v1;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            t tVar6 = ocRepayActivity2.f29729Q0;
                                            Object value27 = tVar6.getValue();
                                            Intrinsics.checkNotNullExpressionValue(value27, "getValue(...)");
                                            ((TextView) value27).setText(it);
                                            Object value28 = tVar6.getValue();
                                            Intrinsics.checkNotNullExpressionValue(value28, "getValue(...)");
                                            ((TextView) value28).setVisibility(0);
                                            break;
                                        case 1:
                                            int i16 = OcRepayActivity.f29705v1;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            Object value29 = ocRepayActivity2.f29730R0.getValue();
                                            Intrinsics.checkNotNullExpressionValue(value29, "getValue(...)");
                                            ((TextView) value29).setText(it);
                                            Object value210 = ocRepayActivity2.f29731S0.getValue();
                                            Intrinsics.checkNotNullExpressionValue(value210, "getValue(...)");
                                            ((View) value210).setVisibility(0);
                                            break;
                                        default:
                                            int i17 = OcRepayActivity.f29705v1;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            ocRepayActivity2.w().setText(it);
                                            ocRepayActivity2.w().setVisibility(0);
                                            break;
                                    }
                                    return Unit.f38893a;
                                }
                            }, new T0(ocRepayActivity, 8));
                            String strL = a.l(waiverInfoD.getWaiverAmount());
                            t tVar6 = ocRepayActivity.f29733V0;
                            if (strL == null || StringsKt.F(strL)) {
                                Object value27 = tVar6.getValue();
                                Intrinsics.checkNotNullExpressionValue(value27, "getValue(...)");
                                ((View) value27).setVisibility(8);
                            } else {
                                Object value28 = tVar6.getValue();
                                Intrinsics.checkNotNullExpressionValue(value28, "getValue(...)");
                                ((View) value28).setVisibility(0);
                                Object value29 = ocRepayActivity.f29734W0.getValue();
                                Intrinsics.checkNotNullExpressionValue(value29, "getValue(...)");
                                ((TextView) value29).setText(strL);
                            }
                            Button buttonV = ocRepayActivity.v();
                            String ctaText = waiverInfoD.getCtaText();
                            if (ctaText == null) {
                                ctaText = ocRepayActivity.getString(g.cs_cl_waiver_activate_default);
                                Intrinsics.checkNotNullExpressionValue(ctaText, "getString(...)");
                            } else {
                                if (StringsKt.F(ctaText)) {
                                    ctaText = null;
                                }
                                if (ctaText == null) {
                                    ctaText = ocRepayActivity.getString(g.cs_cl_waiver_activate_default);
                                    Intrinsics.checkNotNullExpressionValue(ctaText, "getString(...)");
                                }
                            }
                            buttonV.setText(ctaText);
                            Object value30 = ocRepayActivity.f29743d.getValue();
                            Intrinsics.checkNotNullExpressionValue(value30, "getValue(...)");
                            ((TextView) value30).setVisibility(8);
                            Object value31 = ocRepayActivity.f29746f.getValue();
                            Intrinsics.checkNotNullExpressionValue(value31, "getValue(...)");
                            ((SingleAdView) value31).setVisibility(8);
                            ocRepayActivity.r().setVisibility(8);
                            ocRepayActivity.A().setVisibility(8);
                            ocRepayActivity.s().setVisibility(8);
                            if (Intrinsics.c(waiverInfoD.getWaiverType(), WaiverInfo.TYPE_FULL)) {
                                ocRepayActivity.u().setVisibility(8);
                                ocRepayActivity.z().setVisibility(8);
                                ocRepayActivity.q().setVisibility(8);
                                ocRepayActivity.x().setFocusable(false);
                                ocRepayActivity.x().setFocusableInTouchMode(false);
                                ocRepayActivity.t().setVisibility(8);
                                ocRepayActivity.p();
                            } else {
                                ocRepayActivity.u().setVisibility(0);
                                ocRepayActivity.z().setVisibility(0);
                                ocRepayActivity.q().setVisibility(0);
                                ocRepayActivity.x().setFocusable(true);
                                ocRepayActivity.x().setFocusableInTouchMode(true);
                            }
                            Long validUntil = waiverInfoD.getValidUntil();
                            t tVar7 = ocRepayActivity.f29736X0;
                            if (validUntil == null) {
                                Object value32 = tVar7.getValue();
                                Intrinsics.checkNotNullExpressionValue(value32, "getValue(...)");
                                ((LinearLayout) value32).setVisibility(8);
                            } else {
                                Object value33 = tVar7.getValue();
                                Intrinsics.checkNotNullExpressionValue(value33, "getValue(...)");
                                ((LinearLayout) value33).setVisibility(0);
                                ocRepayActivity.C(validUntil.longValue());
                                n nVar = ocRepayActivity.t1;
                                if (nVar != null) {
                                    nVar.b();
                                }
                                ocRepayActivity.t1 = null;
                                n nVar2 = new n(validUntil.longValue(), new L(29, ocRepayActivity, validUntil), new T0(ocRepayActivity, 9));
                                nVar2.a();
                                ocRepayActivity.t1 = nVar2;
                            }
                        } else {
                            ocRepayActivity.B();
                            OcCurBillData ocCurBillData3 = ocRepayActivity.f29748g1;
                            if ((ocCurBillData3 != null ? ocCurBillData3.getWaiverInfo() : null) == null && ocRepayActivity.f29766r1 == null) {
                                i10 = 0;
                            }
                            if (ocRepayActivity.f29771u1 || i10 != 0) {
                                ocRepayActivity.u().setVisibility(0);
                                ocRepayActivity.z().setVisibility(0);
                                ocRepayActivity.q().setVisibility(0);
                            } else if (TextUtils.isEmpty(ocRepayActivity.f29745e1)) {
                                Long outstandingAmount4 = data2.getOutstandingAmount();
                                if ((outstandingAmount4 != null ? outstandingAmount4.longValue() : 0L) <= DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM || Intrinsics.c(ocRepayActivity.f29755l1, "oc_repay_all")) {
                                    outstandingAmount = data2.getOutstandingAmount();
                                    if (outstandingAmount != null) {
                                        jLongValue2 = outstandingAmount.longValue();
                                    } else {
                                        jLongValue2 = 0;
                                    }
                                    if (jLongValue2 > 0) {
                                        ocRepayActivity.u().setVisibility(8);
                                        ocRepayActivity.z().setVisibility(8);
                                        ocRepayActivity.q().setVisibility(8);
                                        ocRepayActivity.x().setFocusable(false);
                                        ocRepayActivity.x().setFocusableInTouchMode(false);
                                        ocRepayActivity.r().setVisibility(8);
                                        ocRepayActivity.A().setVisibility(8);
                                        ocRepayActivity.n();
                                    } else {
                                        ocRepayActivity.u().setVisibility(0);
                                        ocRepayActivity.z().setVisibility(0);
                                        ocRepayActivity.q().setVisibility(0);
                                    }
                                } else {
                                    ocRepayActivity.u().setVisibility(0);
                                    ocRepayActivity.z().setVisibility(0);
                                    ocRepayActivity.q().setVisibility(0);
                                }
                            } else {
                                outstandingAmount = data2.getOutstandingAmount();
                                if (outstandingAmount != null) {
                                    jLongValue2 = outstandingAmount.longValue();
                                } else {
                                    jLongValue2 = 0;
                                }
                                if (jLongValue2 > 0) {
                                    ocRepayActivity.u().setVisibility(8);
                                    ocRepayActivity.z().setVisibility(8);
                                    ocRepayActivity.q().setVisibility(8);
                                    ocRepayActivity.x().setFocusable(false);
                                    ocRepayActivity.x().setFocusableInTouchMode(false);
                                    ocRepayActivity.r().setVisibility(8);
                                    ocRepayActivity.A().setVisibility(8);
                                    ocRepayActivity.n();
                                } else {
                                    ocRepayActivity.u().setVisibility(0);
                                    ocRepayActivity.z().setVisibility(0);
                                    ocRepayActivity.q().setVisibility(0);
                                }
                            }
                            Long outstandingAmount5 = data2.getOutstandingAmount();
                            if ((outstandingAmount5 != null ? outstandingAmount5.longValue() : 0L) == 0) {
                                ocRepayActivity.o();
                            }
                        }
                    }
                }
                break;
            case 3:
                PalmPayCardBillDetailResp palmPayCardBillDetailResp = (PalmPayCardBillDetailResp) obj;
                ocRepayActivity.showLoadingDialog(false);
                if (palmPayCardBillDetailResp == null || !palmPayCardBillDetailResp.isSuccess() || palmPayCardBillDetailResp.getData() == null) {
                    ToastUtils.showLong(palmPayCardBillDetailResp != null ? palmPayCardBillDetailResp.getRespMsg() : null, new Object[0]);
                } else {
                    ocRepayActivity.f29749h1 = palmPayCardBillDetailResp.getData();
                    F6.d.h(ocRepayActivity.TAG, 3, "updateViewForPalmPayCard >>>");
                    PalmPayCardBillData palmPayCardBillData = ocRepayActivity.f29749h1;
                    if (palmPayCardBillData != null) {
                        Long unpaidAmount = palmPayCardBillData.getUnpaidAmount();
                        ocRepayActivity.f1 = unpaidAmount != null ? unpaidAmount.longValue() : 0L;
                        Long unpaidAmount2 = palmPayCardBillData.getUnpaidAmount();
                        long jLongValue7 = unpaidAmount2 != null ? unpaidAmount2.longValue() : 0L;
                        Long unpaidPrincipal2 = palmPayCardBillData.getUnpaidPrincipal();
                        long jLongValue8 = unpaidPrincipal2 != null ? unpaidPrincipal2.longValue() : 0L;
                        Long unpaidPenalty2 = palmPayCardBillData.getUnpaidPenalty();
                        long jLongValue9 = unpaidPenalty2 != null ? unpaidPenalty2.longValue() : 0L;
                        Long unpaidInterest2 = palmPayCardBillData.getUnpaidInterest();
                        long jLongValue10 = unpaidInterest2 != null ? unpaidInterest2.longValue() : 0L;
                        Long unpaidServiceFee = palmPayCardBillData.getUnpaidServiceFee();
                        long jLongValue11 = unpaidServiceFee != null ? unpaidServiceFee.longValue() : 0L;
                        Object value34 = ocRepayActivity.f29775w0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value34, "getValue(...)");
                        ((TextView) value34).setText(ocRepayActivity.getString(g.cs_oc_overdue_interest));
                        Object value35 = ocRepayActivity.f29769t0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value35, "getValue(...)");
                        h.s((LinearLayout) value35, jLongValue10 > 0);
                        Object value36 = ocRepayActivity.f29765r0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value36, "getValue(...)");
                        h.s((LinearLayout) value36, jLongValue11 > 0);
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(jLongValue7)));
                        Object value37 = ocRepayActivity.f29777y0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value37, "getValue(...)");
                        ((TextView) value37).setText(r0.B(jLongValue8, true));
                        ocRepayActivity.y().setText(r0.B(jLongValue9, true));
                        Object value38 = ocRepayActivity.f29767s0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value38, "getValue(...)");
                        ((TextView) value38).setText(r0.B(jLongValue10, true));
                        Object value39 = ocRepayActivity.f29763q0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value39, "getValue(...)");
                        ((TextView) value39).setText(r0.B(jLongValue11, true));
                    }
                }
                break;
            default:
                CLFamilyAndFriendPayResp cLFamilyAndFriendPayResp = (CLFamilyAndFriendPayResp) obj;
                ocRepayActivity.showLoadingDialog(false);
                if (cLFamilyAndFriendPayResp == null || !cLFamilyAndFriendPayResp.isSuccess() || cLFamilyAndFriendPayResp.getData() == null) {
                    ToastUtils.showLong(cLFamilyAndFriendPayResp != null ? cLFamilyAndFriendPayResp.getRespMsg() : null, new Object[0]);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("paymentLinkAccountType", "single");
                    bundle.putString("cardNo", ocRepayActivity.f29742c1);
                    FamilyAndFriendsPayData data3 = cLFamilyAndFriendPayResp.getData();
                    Intrinsics.e(data3);
                    Integer existPaymentLink = data3.getExistPaymentLink();
                    if (existPaymentLink == null || existPaymentLink.intValue() != 1) {
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanFamilyFriends");
                    } else {
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanFamilyFriendsShare");
                    }
                }
                break;
        }
    }
}
