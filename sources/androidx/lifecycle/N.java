package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class N extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f17370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f17370c = function2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        N n10 = new N(this.f17370c, continuation);
        n10.f17369b = obj;
        return n10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f17368a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f17369b;
            this.f17368a = 1;
            if (this.f17370c.invoke(coroutineScope, this) == aVar) {
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
