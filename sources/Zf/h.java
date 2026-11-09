package Zf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f11752c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(2, continuation);
        this.f11752c = iVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f11752c, continuation);
        hVar.f11751b = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f11750a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            FlowCollector flowCollector = (FlowCollector) this.f11751b;
            this.f11750a = 1;
            if (this.f11752c.f(flowCollector, this) == aVar) {
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
