package Uc;

import android.widget.LinearLayout;
import com.transsnet.palmpay.p2pcash.ui.atm.ReasonForCancellationPage;
import com.transsnet.palmpay.p2pcash.ui.atm.view.ReasonItemView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReasonForCancellationPage f9535a;

    public C0(ReasonForCancellationPage reasonForCancellationPage) {
        this.f9535a = reasonForCancellationPage;
    }

    public final void a() {
        int i7 = ReasonForCancellationPage.f32913j;
        ReasonForCancellationPage reasonForCancellationPage = this.f9535a;
        if (reasonForCancellationPage.m().a().length() > 0 && !Intrinsics.c(reasonForCancellationPage.m().a(), "Other")) {
            ReasonForCancellationPage.l(reasonForCancellationPage).setStatus(1);
        } else if (Intrinsics.c(reasonForCancellationPage.m().a(), "Other")) {
            A0 a0M = reasonForCancellationPage.m();
            a0M.getClass();
            if (((String) a0M.f9528c.getValue(a0M, A0.f9525e[2])).length() > 0) {
                ReasonForCancellationPage.l(reasonForCancellationPage).setStatus(1);
            } else {
                ReasonForCancellationPage.l(reasonForCancellationPage).setStatus(2);
            }
        } else {
            ReasonForCancellationPage.l(reasonForCancellationPage).setStatus(2);
        }
        ReasonForCancellationPage.l(reasonForCancellationPage).setOnP2PButtonClickListener(new B0(reasonForCancellationPage));
    }

    public final void b() {
        ReasonForCancellationPage reasonForCancellationPage = this.f9535a;
        p355xf.t tVar = reasonForCancellationPage.f32918e;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LinearLayout) value).removeAllViews();
        A0 a0M = reasonForCancellationPage.m();
        a0M.getClass();
        int size = ((ArrayList) a0M.f9526a.getValue(a0M, A0.f9525e[0])).size();
        for (int i7 = 0; i7 < size; i7++) {
            A0 a0M2 = reasonForCancellationPage.m();
            a0M2.getClass();
            Object obj = ((ArrayList) a0M2.f9526a.getValue(a0M2, A0.f9525e[0])).get(i7);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            Intrinsics.checkNotNullParameter(reasonForCancellationPage, "<this>");
            ReasonItemView reasonItemView = new ReasonItemView(reasonForCancellationPage);
            reasonItemView.setReason((String) obj);
            reasonItemView.setListener(new B0(reasonForCancellationPage));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((LinearLayout) value2).addView(reasonItemView, layoutParams);
        }
    }
}
