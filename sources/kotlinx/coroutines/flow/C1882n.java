package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1882n extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B6.T f39195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882n(B6.T t, Continuation continuation) {
        super(continuation);
        this.f39195b = t;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39194a = obj;
        this.f39196c |= Integer.MIN_VALUE;
        return this.f39195b.emit(null, this);
    }
}
