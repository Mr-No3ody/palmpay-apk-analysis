package p202n9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.airtime.ui.view.ModelAirtimeDataPlanQuickBuyItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f39862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelAirtimeDataPlanQuickBuyItem f39863b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Throwable th, Continuation continuation, ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem) {
        super(2, continuation);
        this.f39862a = th;
        this.f39863b = modelAirtimeDataPlanQuickBuyItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f39862a, continuation, this.f39863b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        b.W(this.f39862a);
        int i7 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
        this.f39863b.d(null);
        return Unit.f38893a;
    }
}
