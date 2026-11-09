package androidx.work.impl;

import Wf.AbstractC0780y;
import Wf.C0757c0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class F extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f18359b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(J j6, Continuation continuation) {
        super(2, continuation);
        this.f18359b = j6;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new F(this.f18359b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Object zVar;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f18358a;
        J j6 = this.f18359b;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                C0757c0 c0757c0 = j6.f18384m;
                E e10 = new E(j6, null);
                this.f18358a = 1;
                obj = AbstractC0780y.s(c0757c0, e10, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            zVar = (C) obj;
        } catch (v e11) {
            zVar = new B(e11.f18735a);
        } catch (CancellationException unused) {
            zVar = new z();
        } catch (Throwable th) {
            V0.C.c().b(K.f18385a, "Unexpected error in WorkerWrapper", th);
            zVar = new z();
        }
        Object objRunInTransaction = j6.f18379h.runInTransaction(new D(0, zVar, j6));
        Intrinsics.checkNotNullExpressionValue(objRunInTransaction, "workDatabase.runInTransa…          }\n            )");
        return objRunInTransaction;
    }
}
