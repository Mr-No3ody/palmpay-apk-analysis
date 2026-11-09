package Gb;

import android.widget.TextView;
import com.transsnet.palmpay.credit.view.LoanOutstandingSummaryView;
import com.transsnet.palmpay.credit.view.TotalOutstandingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Gb.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0295s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f3300b;

    public /* synthetic */ C0295s(TextView textView, int i7) {
        this.f3299a = i7;
        this.f3300b = textView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TextView textView = this.f3300b;
        switch (this.f3299a) {
            case 0:
                int i7 = LoanOutstandingSummaryView.f30796d;
                textView.setVisibility(8);
                break;
            case 1:
                int i10 = LoanOutstandingSummaryView.f30796d;
                textView.setVisibility(8);
                break;
            case 2:
                int i11 = LoanOutstandingSummaryView.f30796d;
                textView.setVisibility(8);
                break;
            case 3:
                int i12 = TotalOutstandingView.f30883d;
                textView.setVisibility(8);
                break;
            case 4:
                int i13 = TotalOutstandingView.f30883d;
                textView.setVisibility(8);
                break;
            default:
                int i14 = TotalOutstandingView.f30883d;
                textView.setVisibility(8);
                break;
        }
        return Unit.f38893a;
    }
}
