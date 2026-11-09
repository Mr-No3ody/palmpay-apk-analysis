package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: androidx.room.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1230i extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callable f17767a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230i(Callable callable, Continuation continuation) {
        super(2, continuation);
        this.f17767a = callable;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1230i(this.f17767a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1230i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        return this.f17767a.call();
    }
}
