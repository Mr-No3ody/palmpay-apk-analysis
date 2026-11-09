package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B6.W f39065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B6.W f39068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f39069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(B6.W w3, Continuation continuation) {
        super(continuation);
        this.f39068d = w3;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39066b = obj;
        this.f39067c |= Integer.MIN_VALUE;
        return this.f39068d.emit(null, this);
    }
}
