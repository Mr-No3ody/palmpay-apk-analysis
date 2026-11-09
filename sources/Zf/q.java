package Zf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f11774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11775c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Continuation continuation) {
        super(continuation);
        this.f11774b = rVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f11773a = obj;
        this.f11775c |= Integer.MIN_VALUE;
        return this.f11774b.emit(null, this);
    }
}
