package Db;

import com.transsnet.palmpay.credit.ui.viewmodel.UnfreezeViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UnfreezeViewModel f1796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(String str, String str2, String str3, UnfreezeViewModel unfreezeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f1793b = str;
        this.f1794c = str2;
        this.f1795d = str3;
        this.f1796e = unfreezeViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new L(this.f1793b, this.f1794c, this.f1795d, this.f1796e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1792a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            T t = new T(new H(this.f1793b, this.f1794c, null));
            I i10 = new I(this.f1795d, null);
            int i11 = kotlinx.coroutines.flow.F.f39062a;
            X0.j jVar = new X0.j(new androidx.slidingpanelayout.widget.b(t, i10, 3), 5);
            p042cg.f fVar = Wf.I.f10809a;
            Flow flowN = X.n(jVar, p042cg.e.f19009c);
            UnfreezeViewModel unfreezeViewModel = this.f1796e;
            C1888u c1888u = new C1888u(flowN, new J(unfreezeViewModel, null));
            K k2 = new K(unfreezeViewModel);
            this.f1792a = 1;
            if (c1888u.collect(k2, this) == aVar) {
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
