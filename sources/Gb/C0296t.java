package Gb;

import android.widget.TextView;
import com.transsnet.palmpay.credit.view.LoanOutstandingSummaryView;
import com.transsnet.palmpay.credit.view.TotalOutstandingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Gb.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0296t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f3302b;

    public /* synthetic */ C0296t(TextView textView, int i7) {
        this.f3301a = i7;
        this.f3302b = textView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextView textView = this.f3302b;
        String it = (String) obj;
        switch (this.f3301a) {
            case 0:
                int i7 = LoanOutstandingSummaryView.f30796d;
                Intrinsics.checkNotNullParameter(it, "it");
                textView.setText(it);
                textView.setVisibility(0);
                break;
            case 1:
                int i10 = LoanOutstandingSummaryView.f30796d;
                Intrinsics.checkNotNullParameter(it, "it");
                textView.setText(it);
                textView.setVisibility(0);
                break;
            case 2:
                int i11 = TotalOutstandingView.f30883d;
                Intrinsics.checkNotNullParameter(it, "it");
                textView.setText(it);
                textView.setVisibility(0);
                break;
            default:
                int i12 = TotalOutstandingView.f30883d;
                Intrinsics.checkNotNullParameter(it, "it");
                textView.setText(it);
                textView.setVisibility(0);
                break;
        }
        return Unit.f38893a;
    }
}
