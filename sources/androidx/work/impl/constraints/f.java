package androidx.work.impl.constraints;

import V0.C;
import Wf.D;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f18485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f18486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ProducerScope producerScope, Continuation continuation) {
        super(2, continuation);
        this.f18485b = hVar;
        this.f18486c = producerScope;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f18485b, this.f18486c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f18484a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            this.f18484a = 1;
            if (D.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        C c6 = C.c();
        int i10 = m.f18506a;
        c6.getClass();
        this.f18486c.mo64trySendJP2dKIU(new b(7));
        return Unit.f38893a;
    }
}
