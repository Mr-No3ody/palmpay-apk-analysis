package kotlin.coroutines;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements CoroutineContext.Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f38938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext.Key f38939b;

    public b(CoroutineContext.Key baseKey, Function1 safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f38938a = safeCast;
        this.f38939b = baseKey instanceof b ? ((b) baseKey).f38939b : baseKey;
    }
}
