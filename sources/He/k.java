package He;

import Ab.C;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f3895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelPremiumBenefits f3896b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Throwable th, Continuation continuation, ModelPremiumBenefits modelPremiumBenefits) {
        super(2, continuation);
        this.f3895a = th;
        this.f3896b = modelPremiumBenefits;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f3895a, continuation, this.f3896b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        org.chromium.support_lib_boundary.util.b.W(this.f3895a);
        C c6 = this.f3896b.f35305c;
        if (c6 != null) {
            c6.invoke(Boolean.FALSE);
        }
        return Unit.f38893a;
    }
}
