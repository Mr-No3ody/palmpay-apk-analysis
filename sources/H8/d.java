package H8;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CoroutineScope f3748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3753g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Ff.c cVar) {
        super(cVar);
        this.f3752f = fVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f3751e = obj;
        this.f3753g |= Integer.MIN_VALUE;
        return this.f3752f.a(null, null, null, null, this);
    }
}
