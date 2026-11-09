package X0;

import V0.A;
import V0.B;
import V0.C;
import Wf.AbstractC0780y;
import Wf.t0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ListenableFuture f10938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t0 f10939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f10942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F1.b f10943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.model.k f10944g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(B b7, F1.b bVar, androidx.work.impl.model.k kVar, Continuation continuation) {
        super(2, continuation);
        this.f10942e = b7;
        this.f10943f = bVar;
        this.f10944g = kVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f10942e, this.f10943f, this.f10944g, continuation);
        eVar.f10941d = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        AtomicInteger atomicInteger;
        ListenableFuture listenableFuture;
        Ef.a aVar = Ef.a.f2423a;
        ?? r3 = this.f10940c;
        B b7 = this.f10942e;
        boolean z3 = true;
        try {
            try {
                if (r3 == 0) {
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f10941d;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    androidx.concurrent.futures.m mVarB = b7.b();
                    Intrinsics.checkNotNullExpressionValue(mVarB, "delegate.startWork()");
                    t0 t0VarM = AbstractC0780y.m(coroutineScope, null, null, new d(this.f10943f, this.f10944g, atomicInteger2, mVarB, null), 3);
                    try {
                        this.f10941d = atomicInteger2;
                        this.f10938a = mVarB;
                        this.f10939b = t0VarM;
                        this.f10940c = 1;
                        obj = G8.a.h(mVarB, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        atomicInteger = atomicInteger2;
                        listenableFuture = mVarB;
                        r3 = t0VarM;
                    } catch (CancellationException e10) {
                        cancellationException = e10;
                        atomicInteger = atomicInteger2;
                        listenableFuture = mVarB;
                        String str = m.f10965a;
                        C c6 = C.c();
                        b7.getClass().toString();
                        c6.getClass();
                        if (atomicInteger.get() != -256) {
                            z3 = false;
                        }
                        if (listenableFuture.isCancelled()) {
                            throw cancellationException;
                        }
                        throw cancellationException;
                    }
                } else {
                    if (r3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0 t0Var = this.f10939b;
                    listenableFuture = this.f10938a;
                    atomicInteger = (AtomicInteger) this.f10941d;
                    try {
                        androidx.camera.core.impl.utils.executor.g.M(obj);
                        r3 = t0Var;
                    } catch (CancellationException e11) {
                        cancellationException = e11;
                        String str2 = m.f10965a;
                        C c10 = C.c();
                        b7.getClass().toString();
                        c10.getClass();
                        if (atomicInteger.get() != -256) {
                            z3 = false;
                        }
                        if (listenableFuture.isCancelled() || !z3) {
                            throw cancellationException;
                        }
                        throw new a(atomicInteger.get());
                    }
                }
                A a3 = (A) obj;
                r3.cancel(null);
                return a3;
            } catch (Throwable th) {
                String str3 = m.f10965a;
                C c11 = C.c();
                b7.getClass().toString();
                c11.getClass();
                throw th;
            }
        } catch (Throwable th2) {
            r3.cancel(null);
            throw th2;
        }
    }
}
