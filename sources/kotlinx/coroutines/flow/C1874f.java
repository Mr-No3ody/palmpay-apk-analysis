package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1874f extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1875g f39157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1874f(C1875g c1875g, Continuation continuation) {
        super(continuation);
        this.f39157b = c1875g;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39156a = obj;
        this.f39158c |= Integer.MIN_VALUE;
        return this.f39157b.emit(null, this);
    }
}
