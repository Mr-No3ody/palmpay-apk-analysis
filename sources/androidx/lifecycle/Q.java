package androidx.lifecycle;

import Wf.AbstractC0780y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1205o f17386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EnumC1204n f17387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ff.h f17388e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Q(AbstractC1205o abstractC1205o, EnumC1204n enumC1204n, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f17386c = abstractC1205o;
        this.f17387d = enumC1204n;
        this.f17388e = (Ff.h) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        Q q10 = new Q(this.f17386c, this.f17387d, this.f17388e, continuation);
        q10.f17385b = obj;
        return q10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f17384a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f17385b;
            p042cg.f fVar = Wf.I.f10809a;
            Xf.d dVar = ((Xf.d) p015ag.o.f11960a).f11224e;
            ?? r10 = this.f17388e;
            P p3 = new P(this.f17386c, this.f17387d, coroutineScope, r10, null);
            this.f17384a = 1;
            if (AbstractC0780y.s(dVar, p3, this) == aVar) {
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
