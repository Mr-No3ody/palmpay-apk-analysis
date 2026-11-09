package p310ub;

import Pa.r0;
import Ya.g;
import Z4.e;
import android.widget.Button;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.credit.bean.resp.OcExtendBillData;
import com.transsnet.palmpay.credit.bean.resp.OcExtendBillResp;
import com.transsnet.palmpay.credit.bean.resp.OcOrderData;
import com.transsnet.palmpay.credit.bean.resp.OcOrderRsp;
import com.transsnet.palmpay.credit.bean.resp.StampDutyPromptInfo;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayExtendActivity;
import com.transsnet.palmpay.credit.view.RepayStampDutyView;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OcRepayExtendActivity f42833g;

    public /* synthetic */ c1(OcRepayExtendActivity ocRepayExtendActivity, int i7) {
        this.f42832f = i7;
        this.f42833g = ocRepayExtendActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42832f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42833g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42833g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f42832f) {
            case 0:
                this.f42833g.showLoadingDialog(false);
                ToastUtils.showLong(str, new Object[0]);
                break;
            default:
                this.f42833g.showLoadingDialog(false);
                ToastUtils.showLong(str, new Object[0]);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        Long extensionAmount;
        StampDutyPromptInfo stampDutyPromptInfo;
        Long extensionAmount2;
        Long extensionLastRepaymentDateStamp;
        Long extensionLastPrincipal;
        Long extensionAmount3;
        Long extensionAmount4;
        Integer extensionTag;
        Long extensionServiceFee;
        Long penalty;
        Long extensionAmount5;
        Long extensionDownPaymentPrincipal;
        switch (this.f42832f) {
            case 0:
                OcOrderRsp ocOrderRsp = (OcOrderRsp) obj;
                if (ocOrderRsp != null) {
                    OcRepayExtendActivity ocRepayExtendActivity = this.f42833g;
                    ocRepayExtendActivity.showLoadingDialog(false);
                    if (!ocOrderRsp.isSuccess()) {
                        ToastUtils.showLong(ocOrderRsp.getRespMsg(), new Object[0]);
                    } else {
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_extend_preview_activity");
                        OcExtendBillData ocExtendBillData = ocRepayExtendActivity.f29780A;
                        Postcard postcardWithLong = postcardBuild.withLong("ok_card_repay_amount", (ocExtendBillData == null || (extensionAmount = ocExtendBillData.getExtensionAmount()) == null) ? 0L : extensionAmount.longValue());
                        OcExtendBillData ocExtendBillData2 = ocRepayExtendActivity.f29780A;
                        Postcard postcardWithString = postcardWithLong.withString("ok_card_repay_card_no", ocExtendBillData2 != null ? ocExtendBillData2.getCardNo() : null);
                        Long l5 = ocRepayExtendActivity.f29791w;
                        Postcard postcardWithLong2 = postcardWithString.withLong("ok_card_repay_bill_id", l5 != null ? l5.longValue() : 0L);
                        OcOrderData data = ocOrderRsp.getData();
                        postcardWithLong2.withString("ok_card_repay_order_no", data != null ? data.getOrderId() : null).navigation();
                    }
                }
                break;
            default:
                OcExtendBillResp ocExtendBillResp = (OcExtendBillResp) obj;
                OcRepayExtendActivity ocRepayExtendActivity2 = this.f42833g;
                ocRepayExtendActivity2.showLoadingDialog(false);
                if (ocExtendBillResp == null || !ocExtendBillResp.isSuccess() || ocExtendBillResp.getData() == null) {
                    ToastUtils.showLong(ocExtendBillResp != null ? ocExtendBillResp.getRespMsg() : null, new Object[0]);
                    break;
                } else {
                    ocRepayExtendActivity2.f29780A = ocExtendBillResp.getData();
                    Object value = ocRepayExtendActivity2.f29786i.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    TextView textView = (TextView) value;
                    OcExtendBillData ocExtendBillData3 = ocRepayExtendActivity2.f29780A;
                    long jLongValue = 0;
                    textView.setText(r0.B((ocExtendBillData3 == null || (extensionDownPaymentPrincipal = ocExtendBillData3.getExtensionDownPaymentPrincipal()) == null) ? 0L : extensionDownPaymentPrincipal.longValue(), true));
                    Object value2 = ocRepayExtendActivity2.f29788o.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    TextView textView2 = (TextView) value2;
                    OcExtendBillData ocExtendBillData4 = ocRepayExtendActivity2.f29780A;
                    textView2.setText(r0.A((ocExtendBillData4 == null || (extensionAmount5 = ocExtendBillData4.getExtensionAmount()) == null) ? 0L : extensionAmount5.longValue()));
                    Object value3 = ocRepayExtendActivity2.f29785g.getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                    TextView textView3 = (TextView) value3;
                    OcExtendBillData ocExtendBillData5 = ocRepayExtendActivity2.f29780A;
                    textView3.setText(r0.B((ocExtendBillData5 == null || (penalty = ocExtendBillData5.getPenalty()) == null) ? 0L : penalty.longValue(), true));
                    Object value4 = ocRepayExtendActivity2.f29784f.getValue();
                    Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                    TextView textView4 = (TextView) value4;
                    OcExtendBillData ocExtendBillData6 = ocRepayExtendActivity2.f29780A;
                    textView4.setText(r0.B((ocExtendBillData6 == null || (extensionServiceFee = ocExtendBillData6.getExtensionServiceFee()) == null) ? 0L : extensionServiceFee.longValue(), true));
                    t tVar = ocRepayExtendActivity2.f29782d;
                    Object value5 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                    Button button = (Button) value5;
                    OcExtendBillData ocExtendBillData7 = ocRepayExtendActivity2.f29780A;
                    button.setEnabled((ocExtendBillData7 == null || (extensionTag = ocExtendBillData7.getExtensionTag()) == null || extensionTag.intValue() != 1) ? false : true);
                    Object value6 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                    Button button2 = (Button) value6;
                    int i7 = g.cs_pay_extension_fee;
                    OcExtendBillData ocExtendBillData8 = ocRepayExtendActivity2.f29780A;
                    button2.setText(ocRepayExtendActivity2.getString(i7, r0.B((ocExtendBillData8 == null || (extensionAmount4 = ocExtendBillData8.getExtensionAmount()) == null) ? 0L : extensionAmount4.longValue(), false)));
                    Object value7 = ocRepayExtendActivity2.f29783e.getValue();
                    Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                    TextView textView5 = (TextView) value7;
                    int i10 = g.cs_oc_mini_repayment_explain;
                    OcExtendBillData ocExtendBillData9 = ocRepayExtendActivity2.f29780A;
                    String strB = r0.B((ocExtendBillData9 == null || (extensionAmount3 = ocExtendBillData9.getExtensionAmount()) == null) ? 0L : extensionAmount3.longValue(), true);
                    OcExtendBillData ocExtendBillData10 = ocRepayExtendActivity2.f29780A;
                    String strB2 = r0.B((ocExtendBillData10 == null || (extensionLastPrincipal = ocExtendBillData10.getExtensionLastPrincipal()) == null) ? 0L : extensionLastPrincipal.longValue(), true);
                    OcExtendBillData ocExtendBillData11 = ocRepayExtendActivity2.f29780A;
                    textView5.setText(ocRepayExtendActivity2.getString(i10, strB, strB2, r0.X1(Long.valueOf((ocExtendBillData11 == null || (extensionLastRepaymentDateStamp = ocExtendBillData11.getExtensionLastRepaymentDateStamp()) == null) ? 0L : extensionLastRepaymentDateStamp.longValue()), "MMM dd")));
                    OcExtendBillData ocExtendBillData12 = ocRepayExtendActivity2.f29780A;
                    if (ocExtendBillData12 != null && (stampDutyPromptInfo = ocExtendBillData12.getStampDutyPromptInfo()) != null) {
                        OcExtendBillData ocExtendBillData13 = ocRepayExtendActivity2.f29780A;
                        if (ocExtendBillData13 != null && (extensionAmount2 = ocExtendBillData13.getExtensionAmount()) != null) {
                            jLongValue = extensionAmount2.longValue();
                        }
                        Long thresholdAmount = stampDutyPromptInfo.getThresholdAmount();
                        boolean z3 = jLongValue >= (thresholdAmount != null ? thresholdAmount.longValue() : 1000000L);
                        Object value8 = ocRepayExtendActivity2.f29790v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                        ((RepayStampDutyView) value8).d(z3, stampDutyPromptInfo);
                        break;
                    }
                }
                break;
        }
    }
}
