package androidx.room;

import Wf.AbstractC0774s;
import Wf.AbstractC0780y;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.X;

/* JADX INFO: renamed from: androidx.room.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1228g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G f17757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f17758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String[] f17759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Callable f17760g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228g(boolean z3, G g7, FlowCollector flowCollector, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.f17756c = z3;
        this.f17757d = g7;
        this.f17758e = flowCollector;
        this.f17759f = strArr;
        this.f17760g = callable;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1228g c1228g = new C1228g(this.f17756c, this.f17757d, this.f17758e, this.f17759f, this.f17760g, continuation);
        c1228g.f17755b = obj;
        return c1228g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1228g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f17754a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f17755b;
            Yf.n nVarA = p059e1.a.a(-1, null, 6);
            C1227f c1227f = new C1227f(this.f17759f, nVarA, 0);
            Object obj2 = Unit.f38893a;
            nVarA.mo64trySendJP2dKIU(obj2);
            if (coroutineScope.getF17355b().get(S.f17742a) != null) {
                throw new ClassCastException();
            }
            boolean z3 = this.f17756c;
            G g7 = this.f17757d;
            AbstractC0774s abstractC0774sX = z3 ? com.facebook.imagepipeline.nativecode.b.x(g7) : com.facebook.imagepipeline.nativecode.b.u(g7);
            Yf.n nVarA2 = p059e1.a.a(0, null, 7);
            AbstractC0780y.m(coroutineScope, abstractC0774sX, null, new C1226e(this.f17757d, c1227f, nVarA, this.f17760g, nVarA2, null), 2);
            this.f17754a = 1;
            Object objJ = X.j(this.f17758e, nVarA2, true, this);
            if (objJ == aVar) {
                obj2 = objJ;
            }
            if (obj2 == aVar) {
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
