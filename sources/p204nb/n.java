package p204nb;

import Ff.c;
import Wf.C0769m;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mutex f39903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0769m f39904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f39905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f39906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39907e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, c cVar) {
        super(cVar);
        this.f39906d = qVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39905c = obj;
        this.f39907e |= Integer.MIN_VALUE;
        return this.f39906d.d(this);
    }
}
