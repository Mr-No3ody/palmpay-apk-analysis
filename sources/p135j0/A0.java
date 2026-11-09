package p135j0;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class A0 implements CoroutineContext.Element {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f37901c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0 f37902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f37903b;

    static {
        new z0(null);
        f37901c = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";
    }

    public A0(A0 a3, O instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f37902a = a3;
        this.f37903b = instance;
    }

    public final void a(O candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.f37903b == candidate) {
            throw new IllegalStateException(f37901c.toString());
        }
        A0 a3 = this.f37902a;
        if (a3 != null) {
            a3.a(candidate);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return e.a(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return y0.f38172a;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return e.b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }
}
