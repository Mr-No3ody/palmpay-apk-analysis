package Gb;

import com.transsnet.palmpay.credit.view.BaseLoanView;
import com.transsnet.palmpay.credit.view.LoanOutstandingSummaryView;
import com.transsnet.palmpay.credit.view.TotalOutstandingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseLoanView f3305c;

    public /* synthetic */ u(BaseLoanView baseLoanView, long j6, int i7) {
        this.f3303a = i7;
        this.f3305c = baseLoanView;
        this.f3304b = j6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j6 = this.f3304b;
        BaseLoanView baseLoanView = this.f3305c;
        switch (this.f3303a) {
            case 0:
                int i7 = LoanOutstandingSummaryView.f30796d;
                ((LoanOutstandingSummaryView) baseLoanView).e(j6);
                break;
            default:
                int i10 = TotalOutstandingView.f30883d;
                ((TotalOutstandingView) baseLoanView).i(j6);
                break;
        }
        return Unit.f38893a;
    }
}
