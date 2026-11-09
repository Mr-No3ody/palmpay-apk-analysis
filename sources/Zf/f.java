package Zf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f11746c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(2, continuation);
        this.f11746c = gVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = new f(this.f11746c, continuation);
        fVar.f11745b = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f11744a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            ProducerScope producerScope = (ProducerScope) this.f11745b;
            this.f11744a = 1;
            if (this.f11746c.b(producerScope, this) == aVar) {
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
