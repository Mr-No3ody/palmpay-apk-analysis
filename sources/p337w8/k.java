package p337w8;

import Ef.a;
import Ff.h;
import Fg.b;
import androidx.camera.core.impl.utils.executor.g;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f43325a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Continuation continuation) {
        super(2, continuation);
        this.f43325a = lVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f43325a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        l lVar = this.f43325a;
        ((b) lVar.f43337l.getValue()).c(lVar.f43334i, TimeUnit.MILLISECONDS.toNanos(lVar.f43331f));
        return Unit.f38893a;
    }
}
