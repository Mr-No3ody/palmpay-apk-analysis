package androidx.lifecycle;

import Wf.AbstractC0777v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes.dex */
public final class O extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mutex f17371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ff.h f17372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p072eg.e f17374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ff.h f17375e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(p072eg.e eVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f17374d = eVar;
        this.f17375e = (Ff.h) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new O(this.f17374d, this.f17375e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutex;
        Ff.h hVar;
        ?? r3;
        Mutex mutex2;
        Throwable th;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f17373c;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                mutex = this.f17374d;
                this.f17371a = mutex;
                hVar = this.f17375e;
                this.f17372b = hVar;
                this.f17373c = 1;
                if (mutex.lock(null, this) != aVar) {
                }
                r3 = hVar;
                return aVar;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = this.f17371a;
                try {
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                    Unit unit = Unit.f38893a;
                    mutex2.unlock(null);
                    return Unit.f38893a;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Function2 function2 = (Function2) this.f17372b;
            Mutex mutex3 = this.f17371a;
            androidx.camera.core.impl.utils.executor.g.M(obj);
            mutex = mutex3;
            r3 = function2;
            r3 = hVar;
            N n10 = new N(r3, null);
            this.f17371a = mutex;
            this.f17372b = null;
            this.f17373c = 2;
            if (AbstractC0777v.d(n10, this) != aVar) {
                mutex2 = mutex;
                Unit unit2 = Unit.f38893a;
                mutex2.unlock(null);
                return Unit.f38893a;
            }
            r3 = hVar;
            return aVar;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }
}
