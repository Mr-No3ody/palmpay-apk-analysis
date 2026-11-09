package p135j0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class H extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f37934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1769b f37935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Function2 function2, C1769b c1769b, Continuation continuation) {
        super(2, continuation);
        this.f37934b = function2;
        this.f37935c = c1769b;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new H(this.f37934b, this.f37935c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f37933a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        Object obj2 = this.f37935c.f38013b;
        this.f37933a = 1;
        Object objInvoke = this.f37934b.invoke(obj2, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
