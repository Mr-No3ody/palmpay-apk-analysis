package p135j0;

import Ff.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f38046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f38047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f38048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f38049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0 f38050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38051f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, Continuation continuation) {
        super(continuation);
        this.f38050e = j0Var;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38049d = obj;
        this.f38051f |= Integer.MIN_VALUE;
        return this.f38050e.lock(null, this);
    }
}
