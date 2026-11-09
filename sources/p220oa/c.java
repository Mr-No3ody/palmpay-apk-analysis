package p220oa;

import Ef.a;
import Ff.h;
import Z4.e;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f40250a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f40250a = function1;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f40250a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        this.f40250a.invoke(e.i("Offline"));
        return Unit.f38893a;
    }
}
