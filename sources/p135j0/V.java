package p135j0;

import Ff.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class V extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X f37988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q f37989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f37991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X f37992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37993f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(X x3, Continuation continuation) {
        super(continuation);
        this.f37992e = x3;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f37991d = obj;
        this.f37993f |= Integer.MIN_VALUE;
        return this.f37992e.readScope(null, this);
    }
}
