package p219o8;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f40089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f40090b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Runnable runnable, Consumer consumer, Continuation continuation) {
        super(2, continuation);
        this.f40089a = runnable;
        this.f40090b = consumer;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f40089a, this.f40090b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        try {
            this.f40089a.run();
        } catch (Throwable th) {
            Consumer consumer = this.f40090b;
            if (consumer != null) {
                consumer.accept(th);
            }
        }
        return Unit.f38893a;
    }
}
