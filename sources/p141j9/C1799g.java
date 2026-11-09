package p141j9;

import Ef.a;
import Ff.h;
import Wf.D;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.airtime.ui.AirtimeGroupPurchaseResultActivity;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeResultViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o9.C1901f;
import p140j8.f;

/* JADX INFO: renamed from: j9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1799g extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AirtimeGroupPurchaseResultActivity f38404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1799g(AirtimeGroupPurchaseResultActivity airtimeGroupPurchaseResultActivity, Continuation continuation) {
        super(2, continuation);
        this.f38404b = airtimeGroupPurchaseResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1799g(this.f38404b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1799g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f38403a;
        if (i7 == 0) {
            g.M(obj);
            this.f38403a = 1;
            if (D.b(5000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        int i10 = AirtimeGroupPurchaseResultActivity.f26459g;
        AirtimeGroupPurchaseResultActivity airtimeGroupPurchaseResultActivity = this.f38404b;
        AirTimeResultViewModel airTimeResultViewModel = (AirTimeResultViewModel) airtimeGroupPurchaseResultActivity.l();
        String str = airtimeGroupPurchaseResultActivity.f26460d;
        airTimeResultViewModel.getClass();
        f.s(airTimeResultViewModel, new C1901f(str, null), airTimeResultViewModel.f26613j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        return Unit.f38893a;
    }
}
