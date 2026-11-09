package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1891x extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1875g f39234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1875g f39236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891x(C1875g c1875g, Continuation continuation) {
        super(continuation);
        this.f39236c = c1875g;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39235b = obj;
        this.f39237d |= Integer.MIN_VALUE;
        return this.f39236c.emit(null, this);
    }
}
