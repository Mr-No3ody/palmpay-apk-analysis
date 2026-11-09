package p135j0;

import Ff.c;
import O2.a;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f38110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Mutex f38111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f38113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(a aVar, c cVar) {
        super(cVar);
        this.f38113d = aVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38112c = obj;
        this.f38114e |= Integer.MIN_VALUE;
        return this.f38113d.h(this);
    }
}
