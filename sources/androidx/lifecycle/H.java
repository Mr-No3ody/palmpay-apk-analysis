package androidx.lifecycle;

import Wf.AbstractC0780y;
import Wf.C0753a0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final class H extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1205o f17349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C6.i f17350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(AbstractC1205o abstractC1205o, C6.i iVar, Continuation continuation) {
        super(2, continuation);
        this.f17349c = abstractC1205o;
        this.f17350d = iVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        H h7 = new H(this.f17349c, this.f17350d, continuation);
        h7.f17348b = obj;
        return h7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1206p c1206p;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f17347a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1206p = (C1206p) this.f17348b;
            try {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                c1206p.a();
                return obj;
            } catch (Throwable th) {
                th = th;
                c1206p.a();
                throw th;
            }
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        Job job = (Job) ((CoroutineScope) this.f17348b).getF17355b().get(C0753a0.f10836a);
        if (job == null) {
            throw new IllegalStateException("when[State] methods should have a parent job");
        }
        G g7 = new G();
        C1206p c1206p2 = new C1206p(this.f17349c, g7.f17346c, job);
        try {
            C6.i iVar = this.f17350d;
            this.f17348b = c1206p2;
            this.f17347a = 1;
            obj = AbstractC0780y.s(g7, iVar, this);
            if (obj == aVar) {
                return aVar;
            }
            c1206p = c1206p2;
            c1206p.a();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            c1206p = c1206p2;
            c1206p.a();
            throw th;
        }
    }
}
