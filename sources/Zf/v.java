package Zf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1884p;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1884p f11797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f11798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C1884p c1884p, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f11797c = c1884p;
        this.f11798d = flowCollector;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        v vVar = new v(this.f11797c, this.f11798d, continuation);
        vVar.f11796b = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f11795a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f11796b;
            this.f11795a = 1;
            if (this.f11797c.invoke(coroutineScope, this.f11798d, this) == aVar) {
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
