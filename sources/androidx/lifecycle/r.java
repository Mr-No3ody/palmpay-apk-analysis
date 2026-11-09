package androidx.lifecycle;

import Wf.C0753a0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final class r extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f17471b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, Continuation continuation) {
        super(2, continuation);
        this.f17471b = lifecycleCoroutineScopeImpl;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        r rVar = new r(this.f17471b, continuation);
        rVar.f17470a = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f17470a;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f17471b;
        AbstractC1205o abstractC1205o = lifecycleCoroutineScopeImpl.f17354a;
        if (((C1212w) abstractC1205o).f17478d.compareTo(EnumC1204n.f17461b) >= 0) {
            abstractC1205o.a(lifecycleCoroutineScopeImpl);
        } else {
            Job job = (Job) coroutineScope.getF17355b().get(C0753a0.f10836a);
            if (job != null) {
                job.cancel((CancellationException) null);
            }
        }
        return Unit.f38893a;
    }
}
