package p294tb;

import Ya.e;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.api.Service;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBillDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: tb.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2042d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLBillDetailActivity f42457b;

    public /* synthetic */ C2042d(CLBillDetailActivity cLBillDetailActivity, int i7) {
        this.f42456a = i7;
        this.f42457b = cLBillDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CLBillDetailActivity cLBillDetailActivity = this.f42457b;
        switch (this.f42456a) {
            case 0:
                int i7 = CLBillDetailActivity.f28804I0;
                cLBillDetailActivity.r().setVisibility(8);
                return Unit.f38893a;
            case 1:
                int i10 = CLBillDetailActivity.f28804I0;
                cLBillDetailActivity.v();
                return Unit.f38893a;
            case 2:
                int i11 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.repayment_record_tv);
            case 3:
                int i12 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.cl_bill_interest_tv);
            case 4:
                int i13 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.bill_loan_amount_tv);
            case 5:
                int i14 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.due_day_tv);
            case 6:
                int i15 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.bill_repayment_amount_tv);
            case 7:
                int i16 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.extended_tag_tv);
            case 8:
                int i17 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.bill_amount_tv);
            case 9:
                int i18 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.bill_date_tv);
            case 10:
                int i19 = CLBillDetailActivity.f28804I0;
                return (PpTitleBar) cLBillDetailActivity.findViewById(e.cl_bill_mtb);
            case 11:
                int i20 = CLBillDetailActivity.f28804I0;
                return cLBillDetailActivity.findViewById(e.includeWaiverHeader);
            case 12:
                int i21 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.tvWaiverHeaderTitle);
            case 13:
                int i22 = CLBillDetailActivity.f28804I0;
                return (RecyclerView) cLBillDetailActivity.findViewById(e.bill_repayment_rv);
            case 14:
                int i23 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.tvWaiverHeaderSummary);
            case 15:
                int i24 = CLBillDetailActivity.f28804I0;
                return cLBillDetailActivity.findViewById(e.layoutWaiverSummaryBubble);
            case 16:
                int i25 = CLBillDetailActivity.f28804I0;
                return (ImageView) cLBillDetailActivity.findViewById(e.ivWaiverCardArt);
            case 17:
                int i26 = CLBillDetailActivity.f28804I0;
                return cLBillDetailActivity.findViewById(e.layoutLegacyAmountHeader);
            case 18:
                int i27 = CLBillDetailActivity.f28804I0;
                return (ImageView) cLBillDetailActivity.findViewById(e.ivWaiverFlag);
            case 19:
                int i28 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.tvWaiverAmountLabel);
            case 20:
                int i29 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.tvWaiverOriginalAmount);
            case 21:
                int i30 = CLBillDetailActivity.f28804I0;
                return cLBillDetailActivity.findViewById(e.rowWaiverDiscount);
            case 22:
                int i31 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.tvWaiverDiscountAmount);
            case 23:
                int i32 = CLBillDetailActivity.f28804I0;
                return (LinearLayout) cLBillDetailActivity.findViewById(e.llWaiverCountdown);
            case 24:
                int i33 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.repayment_count_tv);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i34 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.tvBillWaiverDays);
            case 26:
                int i35 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.tvBillWaiverHour);
            case 27:
                int i36 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.tvBillWaiverMinute);
            case 28:
                int i37 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.tvBillWaiverSecond);
            default:
                int i38 = CLBillDetailActivity.f28804I0;
                return (TextView) cLBillDetailActivity.findViewById(e.extend_tips_tv);
        }
    }
}
