package Zf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f11758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Job f11760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f11761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f11762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11763f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Continuation continuation) {
        super(continuation);
        this.f11762e = mVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f11761d = obj;
        this.f11763f |= Integer.MIN_VALUE;
        return this.f11762e.emit(null, this);
    }
}
