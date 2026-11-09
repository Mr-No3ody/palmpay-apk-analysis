package p098ga;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f37017b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f37017b = (h) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ff.h, kotlin.jvm.functions.Function1] */
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f37017b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Ff.h, kotlin.jvm.functions.Function1] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f37016a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        this.f37016a = 1;
        Object objInvoke = this.f37017b.invoke(this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
