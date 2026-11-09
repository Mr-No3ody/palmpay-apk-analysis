package p135j0;

import Ff.c;
import kotlin.coroutines.Continuation;
import p072eg.e;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f38133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f38134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f38136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38137e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(v0 v0Var, Continuation continuation) {
        super(continuation);
        this.f38136d = v0Var;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38135c = obj;
        this.f38137e |= Integer.MIN_VALUE;
        return this.f38136d.lock(null, this);
    }
}
