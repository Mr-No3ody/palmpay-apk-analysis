package B6;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class S extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t, Continuation continuation) {
        super(continuation);
        this.f419c = t;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f418b = obj;
        this.f420d |= Integer.MIN_VALUE;
        return this.f419c.a(null, this);
    }
}
