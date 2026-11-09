package androidx.work.impl;

/* JADX INFO: loaded from: classes.dex */
public final class G extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J f18360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f18362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(J j6, Ff.c cVar) {
        super(cVar);
        this.f18362c = j6;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f18361b = obj;
        this.f18363d |= Integer.MIN_VALUE;
        return J.a(this.f18362c, this);
    }
}
