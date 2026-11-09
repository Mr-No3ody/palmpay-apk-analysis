package kotlinx.coroutines.flow;

import Zf.AbstractC0807c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1881m extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.F f39189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f39191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.F f39192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f39193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881m(Continuation continuation, kotlin.jvm.internal.F f10, FlowCollector flowCollector) {
        super(2, continuation);
        this.f39192d = f10;
        this.f39193e = flowCollector;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1881m c1881m = new C1881m(continuation, this.f39192d, this.f39193e);
        c1881m.f39191c = obj;
        return c1881m;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1881m) create(new Yf.v(((Yf.v) obj).f11449a), (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kotlin.jvm.internal.F f10;
        kotlin.jvm.internal.F f11;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f39190b;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            Object obj2 = ((Yf.v) this.f39191c).f11449a;
            boolean z3 = obj2 instanceof Yf.u;
            f10 = this.f39192d;
            if (!z3) {
                f10.f38951a = obj2;
            }
            if (z3) {
                Throwable thA = Yf.v.a(obj2);
                if (thA != null) {
                    throw thA;
                }
                Object obj3 = f10.f38951a;
                if (obj3 != null) {
                    if (obj3 == AbstractC0807c.f11737b) {
                        obj3 = null;
                    }
                    this.f39191c = obj2;
                    this.f39189a = f10;
                    this.f39190b = 1;
                    if (this.f39193e.emit(obj3, this) == aVar) {
                        return aVar;
                    }
                    f11 = f10;
                }
                f10.f38951a = AbstractC0807c.f11739d;
            }
            return Unit.f38893a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f11 = this.f39189a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        f10 = f11;
        f10.f38951a = AbstractC0807c.f11739d;
        return Unit.f38893a;
    }
}
