package G0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2892b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(2, continuation);
        this.f2892b = iVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f2892b, continuation);
        hVar.f2891a = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
        throw null;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        throw null;
    }
}
