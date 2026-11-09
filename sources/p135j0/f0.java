package p135j0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f38042a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(j0 j0Var, Continuation continuation) {
        super(2, continuation);
        this.f38042a = j0Var;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f0(this.f38042a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        d0 d0Var = j0.f38063j;
        return new Integer(p0.f38116b.nativeIncrementAndGetCounterValue(((p0) this.f38042a.f38075i.getValue()).f38117a));
    }
}
