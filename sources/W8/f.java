package W8;

import Wf.AbstractC0780y;
import Wf.I;
import com.transsnet.palmpay.account.ui.fragment.login.LogInInputMobileFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LogInInputMobileFragment f10581b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Continuation continuation, LogInInputMobileFragment logInInputMobileFragment) {
        super(2, continuation);
        this.f10581b = logInInputMobileFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(continuation, this.f10581b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f10580a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            p042cg.f fVar = I.f10809a;
            p042cg.e eVar = p042cg.e.f19009c;
            e eVar2 = new e(null, this.f10581b);
            this.f10580a = 1;
            if (AbstractC0780y.s(eVar, eVar2, this) == aVar) {
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
