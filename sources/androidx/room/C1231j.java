package androidx.room;

import Wf.C0765i;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: androidx.room.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1231j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callable f17768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0765i f17769b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1231j(Callable callable, C0765i c0765i, Continuation continuation) {
        super(2, continuation);
        this.f17768a = callable;
        this.f17769b = c0765i;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1231j(this.f17768a, this.f17769b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1231j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        C0765i c0765i = this.f17769b;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        try {
            Object objCall = this.f17768a.call();
            p355xf.o oVar = p355xf.q.f43977a;
            c0765i.resumeWith(objCall);
        } catch (Throwable th) {
            p355xf.o oVar2 = p355xf.q.f43977a;
            c0765i.resumeWith(androidx.camera.core.impl.utils.executor.g.f(th));
        }
        return Unit.f38893a;
    }
}
