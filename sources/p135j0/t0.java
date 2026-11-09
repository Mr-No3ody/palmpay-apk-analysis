package p135j0;

import Ff.c;
import kotlin.coroutines.Continuation;
import p072eg.e;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f38142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f38145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38146e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(v0 v0Var, Continuation continuation) {
        super(continuation);
        this.f38145d = v0Var;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38144c = obj;
        this.f38146e |= Integer.MIN_VALUE;
        return this.f38145d.tryLock(null, this);
    }
}
