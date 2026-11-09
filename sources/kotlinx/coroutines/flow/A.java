package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.slidingpanelayout.widget.b f39044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B6.W f39045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(androidx.slidingpanelayout.widget.b bVar, Continuation continuation) {
        super(continuation);
        this.f39044c = bVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39042a = obj;
        this.f39043b |= Integer.MIN_VALUE;
        return this.f39044c.collect(null, this);
    }
}
