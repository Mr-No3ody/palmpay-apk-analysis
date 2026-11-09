package He;

import Ab.C;
import com.transsnet.palmpay.ui.view.ModelPalmPrizeBanner;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f3877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelPalmPrizeBanner f3878b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Throwable th, Continuation continuation, ModelPalmPrizeBanner modelPalmPrizeBanner) {
        super(2, continuation);
        this.f3877a = th;
        this.f3878b = modelPalmPrizeBanner;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f3877a, continuation, this.f3878b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        org.chromium.support_lib_boundary.util.b.W(this.f3877a);
        C c6 = this.f3878b.f35302c;
        if (c6 != null) {
            c6.invoke(Boolean.FALSE);
        }
        return Unit.f38893a;
    }
}
