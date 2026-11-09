package He;

import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.V;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import com.transsnet.palmpay.ui.view.ModelPremiumScrollNotice;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelPremiumBenefits f3913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModelPremiumScrollNotice f3914c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ModelPremiumBenefits modelPremiumBenefits, ModelPremiumScrollNotice modelPremiumScrollNotice, Continuation continuation) {
        super(2, continuation);
        this.f3913b = modelPremiumBenefits;
        this.f3914c = modelPremiumScrollNotice;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new t(this.f3913b, this.f3914c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f3912a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            EnumC1204n enumC1204n = EnumC1204n.f17464e;
            s sVar = new s(this.f3914c, null);
            this.f3912a = 1;
            if (V.j(this.f3913b, enumC1204n, sVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
