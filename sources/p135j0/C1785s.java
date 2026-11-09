package p135j0;

import Ff.c;
import X0.i;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: j0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1785s extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f38132c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785s(i iVar, Continuation continuation) {
        super(continuation);
        this.f38132c = iVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38130a = obj;
        this.f38131b |= Integer.MIN_VALUE;
        return this.f38132c.emit(null, this);
    }
}
