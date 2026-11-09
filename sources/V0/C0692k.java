package V0;

import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: V0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0692k extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f9954b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0692k(CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.f9954b = coroutineWorker;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0692k(this.f9954b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0692k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f9953a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f9953a = 1;
        Object objC = this.f9954b.c(this);
        return objC == aVar ? aVar : objC;
    }
}
