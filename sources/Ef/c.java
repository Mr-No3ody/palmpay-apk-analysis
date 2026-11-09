package Ef;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f2429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Continuation f2430c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Continuation continuation, CoroutineContext coroutineContext, Function2 function2, Continuation continuation2) {
        super(continuation, coroutineContext);
        this.f2429b = function2;
        this.f2430c = continuation2;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f2428a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f2428a = 2;
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        this.f2428a = 1;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        Function2 function2 = this.f2429b;
        Intrinsics.f(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        K.d(2, function2);
        return function2.invoke(this.f2430c, this);
    }
}
