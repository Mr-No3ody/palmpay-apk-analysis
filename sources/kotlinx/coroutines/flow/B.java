package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B6.W f39046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B6.W f39049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f39050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(B6.W w3, Continuation continuation) {
        super(continuation);
        this.f39049d = w3;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39047b = obj;
        this.f39048c |= Integer.MIN_VALUE;
        return this.f39049d.emit(null, this);
    }
}
