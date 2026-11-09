package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X0.i f39095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(X0.i iVar, Continuation continuation) {
        super(continuation);
        this.f39095c = iVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39093a = obj;
        this.f39094b |= Integer.MIN_VALUE;
        return this.f39095c.emit(null, this);
    }
}
