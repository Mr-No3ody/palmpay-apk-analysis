package Zf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f11755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f11756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11757d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, FlowCollector flowCollector, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f11755b = oVar;
        this.f11756c = flowCollector;
        this.f11757d = obj;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f11755b, this.f11756c, this.f11757d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Ff.h, kotlin.jvm.functions.Function3] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f11754a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            ?? r10 = this.f11755b.f11772e;
            this.f11754a = 1;
            if (r10.invoke(this.f11756c, this.f11757d, this) == aVar) {
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
