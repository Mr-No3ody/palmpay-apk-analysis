package X0;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F1.b f10934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.model.k f10935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f10936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture f10937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(F1.b bVar, androidx.work.impl.model.k kVar, AtomicInteger atomicInteger, ListenableFuture listenableFuture, Continuation continuation) {
        super(2, continuation);
        this.f10934b = bVar;
        this.f10935c = kVar;
        this.f10936d = atomicInteger;
        this.f10937e = listenableFuture;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f10934b, this.f10935c, this.f10936d, this.f10937e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f10933a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            this.f10933a = 1;
            obj = m.a(this.f10934b, this.f10935c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        this.f10936d.set(((Number) obj).intValue());
        this.f10937e.cancel(true);
        return Unit.f38893a;
    }
}
