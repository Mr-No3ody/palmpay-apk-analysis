package Fd;

import Ed.C0238s;
import Wf.I;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayContactAllFragment f2680b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment, Continuation continuation) {
        super(2, continuation);
        this.f2680b = transferToPalmPayContactAllFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f2680b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2679a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2680b;
            T t = new T(new C0251f(transferToPalmPayContactAllFragment, null));
            p042cg.f fVar = I.f10809a;
            C1888u c1888u = new C1888u(X.n(t, p042cg.e.f19009c), new C0238s(3, null, 2));
            h hVar = new h(transferToPalmPayContactAllFragment, null);
            this.f2679a = 1;
            if (X.g(c1888u, hVar, this) == aVar) {
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
