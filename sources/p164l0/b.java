package p164l0;

import Ff.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f39250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f39252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(continuation);
        this.f39252c = cVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39251b = obj;
        this.f39253d |= Integer.MIN_VALUE;
        return this.f39252c.shouldMigrate(null, this);
    }
}
