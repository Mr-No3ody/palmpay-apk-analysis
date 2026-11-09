package Fa;

import Ff.h;
import Wf.AbstractC0780y;
import Wf.I;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2633a;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2633a;
        if (i7 == 0) {
            g.M(obj);
            f fVar = I.f10809a;
            p042cg.e eVar = p042cg.e.f19009c;
            b bVar = new b(2, null);
            this.f2633a = 1;
            if (AbstractC0780y.s(eVar, bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }
}
