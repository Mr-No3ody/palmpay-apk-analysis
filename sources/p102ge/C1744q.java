package p102ge;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import Wf.I;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p042cg.e;
import p042cg.f;

/* JADX INFO: renamed from: ge.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1744q extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37227a;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1744q(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1744q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f2423a;
        int i7 = this.f37227a;
        if (i7 == 0) {
            g.M(obj);
            f fVar = I.f10809a;
            e eVar = e.f19009c;
            C1743p c1743p = new C1743p(2, null);
            this.f37227a = 1;
            obj = AbstractC0780y.s(eVar, c1743p, this);
            if (obj == aVar) {
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
