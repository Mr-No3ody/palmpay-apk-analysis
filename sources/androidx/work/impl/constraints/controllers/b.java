package androidx.work.impl.constraints.controllers;

import V0.C;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f18476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.f18476c = cVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.f18476c, continuation);
        bVar.f18475b = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        int i7 = 1;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = this.f18474a;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            ProducerScope producerScope = (ProducerScope) this.f18475b;
            c cVar = this.f18476c;
            a listener = new a(cVar, producerScope);
            androidx.work.impl.constraints.trackers.e eVar = cVar.f18477a;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(listener, "listener");
            synchronized (eVar.f18514c) {
                try {
                    if (eVar.f18515d.add(listener)) {
                        if (eVar.f18515d.size() == 1) {
                            eVar.f18516e = eVar.a();
                            C c6 = C.c();
                            int i11 = androidx.work.impl.constraints.trackers.f.f18517a;
                            Objects.toString(eVar.f18516e);
                            c6.getClass();
                            eVar.c();
                        }
                        listener.onConstraintChanged(eVar.f18516e);
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            E0.h hVar = new E0.h(i7, this.f18476c, listener);
            this.f18474a = 1;
            if (Yf.C.a(producerScope, hVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
