package kotlin.coroutines;

import Ab.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static CoroutineContext.Element a(CoroutineContext.Element element, CoroutineContext.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.c(element.getKey(), key)) {
            return element;
        }
        return null;
    }

    public static CoroutineContext b(CoroutineContext.Element element, CoroutineContext.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.c(element.getKey(), key) ? f.f38943a : element;
    }

    public static CoroutineContext c(CoroutineContext.Element element, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return context == f.f38943a ? element : (CoroutineContext) context.fold(element, new y(2));
    }
}
