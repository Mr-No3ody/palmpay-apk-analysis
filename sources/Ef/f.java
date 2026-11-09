package Ef;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;

/* JADX INFO: loaded from: classes4.dex */
public class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation a(Continuation continuation, Continuation completion, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (function2 instanceof Ff.a) {
            return ((Ff.a) function2).create(continuation, completion);
        }
        CoroutineContext context = completion.getContext();
        return context == kotlin.coroutines.f.f38943a ? new b(completion, continuation, function2) : new c(completion, context, function2, continuation);
    }

    public static Continuation b(Continuation continuation) {
        Continuation<Object> continuationIntercepted;
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        Ff.c cVar = continuation instanceof Ff.c ? (Ff.c) continuation : null;
        return (cVar == null || (continuationIntercepted = cVar.intercepted()) == null) ? continuation : continuationIntercepted;
    }

    public static Object c(Function2 function2, Object obj, Continuation completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        CoroutineContext context = completion.getContext();
        Continuation dVar = context == kotlin.coroutines.f.f38943a ? new d(completion) : new e(completion, context);
        K.d(2, function2);
        return function2.invoke(obj, dVar);
    }
}
