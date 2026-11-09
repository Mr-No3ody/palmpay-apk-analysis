package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B6.W f39098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f39099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlowCollector f39100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(B6.W w3, Continuation continuation) {
        super(continuation);
        this.f39098c = w3;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39096a = obj;
        this.f39097b |= Integer.MIN_VALUE;
        return this.f39098c.emit(null, this);
    }
}
