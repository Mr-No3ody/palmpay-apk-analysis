package p294tb;

import Pa.r0;
import Z4.e;
import android.widget.Button;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.resp.CLExtendPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLExtendPlanResp;
import com.transsnet.palmpay.credit.bean.resp.CLRepayOrderData;
import com.transsnet.palmpay.credit.bean.resp.StampDutyPromptInfo;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentExtendActivity;
import com.transsnet.palmpay.credit.view.RepayStampDutyView;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tb.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2039b0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CLRepaymentExtendActivity f42451g;

    public /* synthetic */ C2039b0(CLRepaymentExtendActivity cLRepaymentExtendActivity, int i7) {
        this.f42450f = i7;
        this.f42451g = cLRepaymentExtendActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42450f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42451g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42451g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f42450f) {
            case 0:
                this.f42451g.showLoadingDialog(false);
                ToastUtils.showLong(str, new Object[0]);
                break;
            default:
                this.f42451g.showLoadingDialog(false);
                ToastUtils.showLong(str, new Object[0]);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        Long totalAmount;
        StampDutyPromptInfo stampDutyPromptInfo;
        Long totalAmount2;
        Integer extensionTag;
        Long extensionServiceFee;
        Long penalty;
        Long serviceFee;
        Long interest;
        Long principal;
        Long totalAmount3;
        switch (this.f42450f) {
            case 0:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                if (commonBeanResult != null) {
                    CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42451g;
                    cLRepaymentExtendActivity.showLoadingDialog(false);
                    if (!commonBeanResult.isSuccess()) {
                        ToastUtils.showLong(commonBeanResult.getRespMsg(), new Object[0]);
                    } else {
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_repayment_extend_preview__activity");
                        CLExtendPlanData cLExtendPlanData = cLRepaymentExtendActivity.f29069H;
                        Postcard postcardWithLong = postcardBuild.withLong("cl_repay_amount", (cLExtendPlanData == null || (totalAmount = cLExtendPlanData.getTotalAmount()) == null) ? 0L : totalAmount.longValue());
                        CLRepayOrderData cLRepayOrderData = (CLRepayOrderData) commonBeanResult.data;
                        postcardWithLong.withString("cl_repay_order_no", cLRepayOrderData != null ? cLRepayOrderData.getOrderId() : null).navigation();
                    }
                }
                break;
            default:
                CLExtendPlanResp cLExtendPlanResp = (CLExtendPlanResp) obj;
                CLRepaymentExtendActivity cLRepaymentExtendActivity2 = this.f42451g;
                cLRepaymentExtendActivity2.showLoadingDialog(false);
                if (cLExtendPlanResp == null || !cLExtendPlanResp.isSuccess() || cLExtendPlanResp.getData() == null) {
                    ToastUtils.showLong(cLExtendPlanResp != null ? cLExtendPlanResp.getRespMsg() : null, new Object[0]);
                    break;
                } else {
                    cLRepaymentExtendActivity2.f29069H = cLExtendPlanResp.getData();
                    Object value = cLRepaymentExtendActivity2.t.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    TextView textView = (TextView) value;
                    CLExtendPlanData cLExtendPlanData2 = cLRepaymentExtendActivity2.f29069H;
                    long jLongValue = 0;
                    textView.setText(r0.A((cLExtendPlanData2 == null || (totalAmount3 = cLExtendPlanData2.getTotalAmount()) == null) ? 0L : totalAmount3.longValue()));
                    Object value2 = cLRepaymentExtendActivity2.f29077p.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    TextView textView2 = (TextView) value2;
                    CLExtendPlanData cLExtendPlanData3 = cLRepaymentExtendActivity2.f29069H;
                    textView2.setText(r0.B((cLExtendPlanData3 == null || (principal = cLExtendPlanData3.getPrincipal()) == null) ? 0L : principal.longValue(), true));
                    Object value3 = cLRepaymentExtendActivity2.f29076o.getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                    TextView textView3 = (TextView) value3;
                    CLExtendPlanData cLExtendPlanData4 = cLRepaymentExtendActivity2.f29069H;
                    textView3.setText(r0.B((cLExtendPlanData4 == null || (interest = cLExtendPlanData4.getInterest()) == null) ? 0L : interest.longValue(), true));
                    Object value4 = cLRepaymentExtendActivity2.f29075j.getValue();
                    Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                    TextView textView4 = (TextView) value4;
                    CLExtendPlanData cLExtendPlanData5 = cLRepaymentExtendActivity2.f29069H;
                    textView4.setText(r0.B((cLExtendPlanData5 == null || (serviceFee = cLExtendPlanData5.getServiceFee()) == null) ? 0L : serviceFee.longValue(), true));
                    Object value5 = cLRepaymentExtendActivity2.f29074i.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                    TextView textView5 = (TextView) value5;
                    CLExtendPlanData cLExtendPlanData6 = cLRepaymentExtendActivity2.f29069H;
                    textView5.setText(r0.B((cLExtendPlanData6 == null || (penalty = cLExtendPlanData6.getPenalty()) == null) ? 0L : penalty.longValue(), true));
                    Object value6 = cLRepaymentExtendActivity2.f29073g.getValue();
                    Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                    TextView textView6 = (TextView) value6;
                    CLExtendPlanData cLExtendPlanData7 = cLRepaymentExtendActivity2.f29069H;
                    textView6.setText(r0.B((cLExtendPlanData7 == null || (extensionServiceFee = cLExtendPlanData7.getExtensionServiceFee()) == null) ? 0L : extensionServiceFee.longValue(), true));
                    Object value7 = cLRepaymentExtendActivity2.f29072f.getValue();
                    Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                    TextView textView7 = (TextView) value7;
                    CLExtendPlanData cLExtendPlanData8 = cLRepaymentExtendActivity2.f29069H;
                    textView7.setText(r0.X1(cLExtendPlanData8 != null ? cLExtendPlanData8.getExtensionRepaymentDate() : null, "MMM dd, yyyy"));
                    Object value8 = cLRepaymentExtendActivity2.f29071e.getValue();
                    Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                    Button button = (Button) value8;
                    CLExtendPlanData cLExtendPlanData9 = cLRepaymentExtendActivity2.f29069H;
                    button.setEnabled((cLExtendPlanData9 == null || (extensionTag = cLExtendPlanData9.getExtensionTag()) == null || extensionTag.intValue() != 1) ? false : true);
                    CLExtendPlanData cLExtendPlanData10 = cLRepaymentExtendActivity2.f29069H;
                    if (cLExtendPlanData10 != null && (stampDutyPromptInfo = cLExtendPlanData10.getStampDutyPromptInfo()) != null) {
                        CLExtendPlanData cLExtendPlanData11 = cLRepaymentExtendActivity2.f29069H;
                        if (cLExtendPlanData11 != null && (totalAmount2 = cLExtendPlanData11.getTotalAmount()) != null) {
                            jLongValue = totalAmount2.longValue();
                        }
                        Long thresholdAmount = stampDutyPromptInfo.getThresholdAmount();
                        boolean z3 = jLongValue >= (thresholdAmount != null ? thresholdAmount.longValue() : 1000000L);
                        Object value9 = cLRepaymentExtendActivity2.f29066A.getValue();
                        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                        ((RepayStampDutyView) value9).d(z3, stampDutyPromptInfo);
                        break;
                    }
                }
                break;
        }
    }
}
