package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FlowCollector f39053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B6.W f39054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(B6.W w3, Continuation continuation) {
        super(continuation);
        this.f39054d = w3;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39051a = obj;
        this.f39052b |= Integer.MIN_VALUE;
        return this.f39054d.emit(null, this);
    }
}
