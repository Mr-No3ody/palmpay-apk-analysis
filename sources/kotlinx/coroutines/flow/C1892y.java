package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1892y extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.slidingpanelayout.widget.b f39240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.slidingpanelayout.widget.b f39241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlowCollector f39242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Throwable f39243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f39244g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892y(androidx.slidingpanelayout.widget.b bVar, Continuation continuation) {
        super(continuation);
        this.f39240c = bVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39238a = obj;
        this.f39239b |= Integer.MIN_VALUE;
        return this.f39240c.collect(null, this);
    }
}
