package p135j0;

import Ff.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class W extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X f37994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f37995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f37996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Z f37997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f37998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X f37999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38000g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x3, Continuation continuation) {
        super(continuation);
        this.f37999f = x3;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f37998e = obj;
        this.f38000g |= Integer.MIN_VALUE;
        return this.f37999f.writeScope(null, this);
    }
}
