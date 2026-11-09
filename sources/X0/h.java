package X0;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f10957c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(continuation);
        this.f10957c = iVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f10955a = obj;
        this.f10956b |= Integer.MIN_VALUE;
        return this.f10957c.emit(null, this);
    }
}
