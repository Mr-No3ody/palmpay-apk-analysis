package V0;

import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: V0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0691j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f9952b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0691j(CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.f9952b = coroutineWorker;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0691j(this.f9952b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C0691j c0691j = (C0691j) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f38893a;
        c0691j.invokeSuspend(unit);
        return unit;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f9951a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f9951a = 1;
        this.f9952b.getClass();
        throw new IllegalStateException("Not implemented");
    }
}
