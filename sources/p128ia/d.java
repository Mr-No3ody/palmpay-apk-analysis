package p128ia;

import Ff.c;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f37453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37454c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, c cVar) {
        super(cVar);
        this.f37453b = eVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f37452a = obj;
        this.f37454c |= Integer.MIN_VALUE;
        return this.f37453b.f(null, null, false, this);
    }
}
