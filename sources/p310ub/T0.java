package p310ub;

import Pa.r0;
import Ya.e;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import com.transsnet.palmpay.credit.bean.rsp.OcCurBillData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class T0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcRepayActivity f42792b;

    public /* synthetic */ T0(OcRepayActivity ocRepayActivity, int i7) {
        this.f42791a = i7;
        this.f42792b = ocRepayActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[PHI: r3
      0x0026: PHI (r3v17 java.lang.Long) = (r3v6 java.lang.Long), (r3v18 java.lang.Long) binds: [B:15:0x0035, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Long outstandingAmount;
        long jLongValue;
        int i7 = 8;
        OcRepayActivity ocRepayActivity = this.f42792b;
        switch (this.f42791a) {
            case 0:
                int i10 = OcRepayActivity.f29705v1;
                return (TextView) ocRepayActivity.findViewById(e.settlement_order_tv);
            case 1:
                int i11 = OcRepayActivity.f29705v1;
                return (TextView) ocRepayActivity.findViewById(e.ins_unavailable_tv);
            case 2:
                int i12 = OcRepayActivity.f29705v1;
                return (TextView) ocRepayActivity.findViewById(e.spread_second_tv);
            case 3:
                int i13 = OcRepayActivity.f29705v1;
                return (Group) ocRepayActivity.findViewById(e.extend_interest_group);
            case 4:
                int i14 = OcRepayActivity.f29705v1;
                return (TextView) ocRepayActivity.findViewById(e.extend_penalty_tv);
            case 5:
                int i15 = OcRepayActivity.f29705v1;
                Object value = ocRepayActivity.f29729Q0.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setVisibility(8);
                return Unit.f38893a;
            case 6:
                int i16 = OcRepayActivity.f29705v1;
                return (TextView) ocRepayActivity.findViewById(e.init_payment_tv);
            case 7:
                int i17 = OcRepayActivity.f29705v1;
                Object value2 = ocRepayActivity.f29731S0.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((View) value2).setVisibility(8);
                return Unit.f38893a;
            case 8:
                int i18 = OcRepayActivity.f29705v1;
                ocRepayActivity.w().setVisibility(8);
                return Unit.f38893a;
            case 9:
                ocRepayActivity.f29771u1 = true;
                WaiverInfo waiverInfo = ocRepayActivity.f29768s1;
                if (waiverInfo == null || (outstandingAmount = waiverInfo.getOriginalOutstandingAmount()) == null) {
                    OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                    outstandingAmount = ocCurBillData != null ? ocCurBillData.getOutstandingAmount() : null;
                    if (outstandingAmount != null) {
                        jLongValue = outstandingAmount.longValue();
                    } else {
                        jLongValue = 0;
                    }
                } else {
                    jLongValue = outstandingAmount.longValue();
                }
                ocRepayActivity.B();
                ocRepayActivity.f29766r1 = null;
                ocRepayActivity.f1 = jLongValue;
                ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(jLongValue)));
                ocRepayActivity.x().setFocusable(true);
                ocRepayActivity.x().setFocusableInTouchMode(true);
                ocRepayActivity.u().setVisibility(0);
                ocRepayActivity.z().setVisibility(0);
                ocRepayActivity.q().setVisibility(0);
                OcCurBillData ocCurBillData2 = ocRepayActivity.f29748g1;
                if (ocCurBillData2 != null) {
                    LinearLayout linearLayoutR = ocRepayActivity.r();
                    Integer extensionTag = ocCurBillData2.getExtensionTag();
                    linearLayoutR.setVisibility((extensionTag != null && extensionTag.intValue() == 1) ? 0 : 8);
                    ConstraintLayout constraintLayoutA = ocRepayActivity.A();
                    Integer spreadTag = ocCurBillData2.getSpreadTag();
                    if (spreadTag != null && spreadTag.intValue() == 1) {
                        i7 = 0;
                    }
                    constraintLayoutA.setVisibility(i7);
                }
                if (jLongValue == 0) {
                    ocRepayActivity.o();
                } else {
                    ocRepayActivity.p();
                }
                return Unit.f38893a;
            default:
                int i19 = OcRepayActivity.f29705v1;
                return (TextView) ocRepayActivity.findViewById(e.extend_amount_tv);
        }
    }
}
