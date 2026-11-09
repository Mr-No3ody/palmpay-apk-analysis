package Wf;

import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class Y extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.sessions.api.a f10832b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(com.google.firebase.sessions.api.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f10832b = aVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        Y y8 = new Y(this.f10832b, continuation);
        y8.f10831a = obj;
        return y8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CoroutineContext f17355b = ((CoroutineScope) this.f10831a).getF17355b();
        com.google.firebase.sessions.api.a aVar2 = this.f10832b;
        try {
            x0 x0Var = new x0();
            Job job = (Job) f17355b.get(C0753a0.f10836a);
            if (job == null) {
                throw new IllegalStateException(("Current context doesn't contain Job in it: " + f17355b).toString());
            }
            x0Var.f10908f = AbstractC0780y.l(job, true, x0Var);
            do {
                atomicIntegerFieldUpdater = x0.f10906g;
                i7 = atomicIntegerFieldUpdater.get(x0Var);
                if (i7 != 0) {
                    if (i7 == 2 || i7 == 3) {
                        break;
                        break;
                    }
                    x0.j(i7);
                    throw null;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(x0Var, i7, 0));
            try {
                return FirebaseSessionsDependencies.getRegisteredSubscribers$lambda$2$lambda$1(aVar2.f23075a);
            } finally {
                x0Var.i();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
