package He;

import Wf.AbstractC0780y;
import Wf.D;
import Wf.t0;
import androidx.lifecycle.V;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import com.transsnet.palmpay.ui.view.ModelPremiumScrollNotice;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p355xf.C2127f;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelPremiumScrollNotice f3911b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ModelPremiumScrollNotice modelPremiumScrollNotice, Continuation continuation) {
        super(2, continuation);
        this.f3911b = modelPremiumScrollNotice;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f3911b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
        return Ef.a.f2423a;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f3910a;
        ModelPremiumScrollNotice modelPremiumScrollNotice = this.f3911b;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
                throw new C2127f();
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            if (modelPremiumScrollNotice.f35314d.size() > 1) {
                ModelPremiumBenefits modelPremiumBenefits = modelPremiumScrollNotice.f35312b;
                modelPremiumScrollNotice.f35313c = modelPremiumBenefits != null ? AbstractC0780y.m(V.f(modelPremiumBenefits), null, null, new u(modelPremiumScrollNotice, null), 3) : null;
            }
            this.f3910a = 1;
            D.a(this);
            return aVar;
        } catch (Throwable th) {
            int i10 = ModelPremiumScrollNotice.f35310g;
            t0 t0Var = modelPremiumScrollNotice.f35313c;
            if (t0Var != null) {
                t0Var.cancel((CancellationException) null);
            }
            modelPremiumScrollNotice.f35313c = null;
            throw th;
        }
    }
}
