package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1883o extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S f39199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883o(S s3, Continuation continuation) {
        super(2, continuation);
        this.f39199c = s3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1883o c1883o = new C1883o(this.f39199c, continuation);
        c1883o.f39198b = obj;
        return c1883o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1883o) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f39197a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            B6.T t = new B6.T((ProducerScope) this.f39198b, 4);
            this.f39197a = 1;
            if (this.f39199c.f39102a.collect(t, this) == aVar) {
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
