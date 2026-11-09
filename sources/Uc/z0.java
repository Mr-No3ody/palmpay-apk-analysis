package Uc;

import androidx.cardview.widget.CardView;
import com.transsnet.palmpay.p2pcash.ui.atm.ReasonForCancellationPage;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReasonForCancellationPage f9749b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(ReasonForCancellationPage reasonForCancellationPage, int i7) {
        super("");
        this.f9748a = i7;
        this.f9749b = reasonForCancellationPage;
    }

    @Override // Of.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        ReasonForCancellationPage reasonForCancellationPage = this.f9749b;
        int i7 = this.f9748a;
        Intrinsics.checkNotNullParameter(property, "property");
        switch (i7) {
            case 0:
                int i10 = ReasonForCancellationPage.f32913j;
                reasonForCancellationPage.n().b();
                break;
            case 1:
                boolean zC = Intrinsics.c((String) obj2, "Other");
                p355xf.t tVar = reasonForCancellationPage.f32917d;
                if (zC) {
                    Object value = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    p220oa.h.C((CardView) value);
                } else {
                    Object value2 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    p220oa.h.c((CardView) value2);
                }
                reasonForCancellationPage.n().a();
                break;
            default:
                int i11 = ReasonForCancellationPage.f32913j;
                reasonForCancellationPage.n().a();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ArrayList arrayList, ReasonForCancellationPage reasonForCancellationPage) {
        super(arrayList);
        this.f9748a = 0;
        this.f9749b = reasonForCancellationPage;
    }
}
