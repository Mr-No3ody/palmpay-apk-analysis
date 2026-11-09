package Gb;

import android.widget.TextView;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import com.transsnet.palmpay.credit.view.LoanOutstandingSummaryView;
import com.transsnet.palmpay.credit.view.TotalOutstandingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f3297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WaiverInfo f3298c;

    public /* synthetic */ r(TextView textView, WaiverInfo waiverInfo, int i7) {
        this.f3296a = i7;
        this.f3297b = textView;
        this.f3298c = waiverInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WaiverInfo waiverInfo = this.f3298c;
        TextView textView = this.f3297b;
        String it = (String) obj;
        switch (this.f3296a) {
            case 0:
                int i7 = LoanOutstandingSummaryView.f30796d;
                Intrinsics.checkNotNullParameter(it, "it");
                textView.setText(it);
                textView.setVisibility(0);
                textView.setBackgroundResource(Intrinsics.c(waiverInfo.getWaiverType(), WaiverInfo.TYPE_PARTIAL) ? Ya.d.cs_cl_loan_fully_bj : Ya.d.cs_cl_loan_fully_bj);
                break;
            default:
                int i10 = TotalOutstandingView.f30883d;
                Intrinsics.checkNotNullParameter(it, "it");
                textView.setText(it);
                textView.setVisibility(0);
                textView.setBackgroundResource(Intrinsics.c(waiverInfo.getWaiverType(), WaiverInfo.TYPE_PARTIAL) ? Ya.d.cs_cl_loan_fully_bj : Ya.d.cs_cl_loan_fully_bj);
                break;
        }
        return Unit.f38893a;
    }
}
