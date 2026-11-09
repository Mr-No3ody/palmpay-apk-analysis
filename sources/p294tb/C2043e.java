package p294tb;

import Ya.e;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBillDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tb.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2043e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLBillDetailActivity f42461b;

    public /* synthetic */ C2043e(CLBillDetailActivity cLBillDetailActivity, int i7) {
        this.f42460a = i7;
        this.f42461b = cLBillDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CLBillDetailActivity cLBillDetailActivity = this.f42461b;
        switch (this.f42460a) {
            case 0:
                int i7 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.extend_label_tv);
            case 1:
                int i10 = CLBillDetailActivity.f28804I0;
                return (Button) cLBillDetailActivity.findViewById(e.cl_bill_repay_bt);
            case 2:
                int i11 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.bill_repaid_tv);
            case 3:
                int i12 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.cl_bill_service_content_tv);
            case 4:
                int i13 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.cl_bill_service_title_tv);
            case 5:
                int i14 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.bill_interest_tv);
            case 6:
                int i15 = CLBillDetailActivity.f28804I0;
                Object value = cLBillDetailActivity.f28821Y.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setVisibility(8);
                return Unit.f38893a;
            default:
                int i16 = CLBillDetailActivity.f28804I0;
                Object value2 = cLBillDetailActivity.f28829k0.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((View) value2).setVisibility(8);
                return Unit.f38893a;
        }
    }
}
