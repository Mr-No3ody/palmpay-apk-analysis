package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1869a extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Zf.y f39132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f39134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1869a(T t, Continuation continuation) {
        super(continuation);
        this.f39134c = t;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39133b = obj;
        this.f39135d |= Integer.MIN_VALUE;
        return this.f39134c.collect(null, this);
    }
}
