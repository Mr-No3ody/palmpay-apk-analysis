package androidx.room;

import Wf.AbstractC0777v;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: androidx.room.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1229h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G f17764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String[] f17765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Callable f17766f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1229h(boolean z3, G g7, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.f17763c = z3;
        this.f17764d = g7;
        this.f17765e = strArr;
        this.f17766f = callable;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1229h c1229h = new C1229h(this.f17763c, this.f17764d, this.f17765e, this.f17766f, continuation);
        c1229h.f17762b = obj;
        return c1229h;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1229h) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f17761a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            FlowCollector flowCollector = (FlowCollector) this.f17762b;
            C1228g c1228g = new C1228g(this.f17763c, this.f17764d, flowCollector, this.f17765e, this.f17766f, null);
            this.f17761a = 1;
            if (AbstractC0777v.d(c1228g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
