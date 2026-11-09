package kotlinx.coroutines.flow;

import B6.C0094p;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1893z extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0094p f39245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f39246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f39247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0094p f39248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1893z(C0094p c0094p, Continuation continuation) {
        super(continuation);
        this.f39248d = c0094p;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39247c = obj;
        this.f39249e |= Integer.MIN_VALUE;
        return this.f39248d.emit(null, this);
    }
}
