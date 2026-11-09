package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X0.i f39056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(X0.i iVar, Continuation continuation) {
        super(continuation);
        this.f39056b = iVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39055a = obj;
        this.f39057c |= Integer.MIN_VALUE;
        return this.f39056b.a(null, this);
    }
}
