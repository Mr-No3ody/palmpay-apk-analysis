package Ke;

import Wf.AbstractC0780y;
import Wf.I;
import Wf.p0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p015ag.o;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f5442b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f5442b = hVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f5442b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5441a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            boolean zB = p367ya.b.b();
            p042cg.f fVar = I.f10809a;
            p0 p0Var = o.f11960a;
            f fVar2 = new f(this.f5442b, zB, null);
            this.f5441a = 1;
            if (AbstractC0780y.s(p0Var, fVar2, this) == aVar) {
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
