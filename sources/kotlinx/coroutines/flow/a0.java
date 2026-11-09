package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B6.W f39137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39138c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(B6.W w3, Continuation continuation) {
        super(continuation);
        this.f39137b = w3;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39136a = obj;
        this.f39138c |= Integer.MIN_VALUE;
        return this.f39137b.a(0, this);
    }
}
