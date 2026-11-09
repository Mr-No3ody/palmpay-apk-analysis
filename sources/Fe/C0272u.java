package Fe;

import com.transsnet.palmpay.main.export.bean.rsp.GetHomeCommonRsp;
import com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Fe.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0272u extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f2812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetHomeCommonRsp.DataBean f2813b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0272u(I i7, GetHomeCommonRsp.DataBean dataBean, Continuation continuation) {
        super(2, continuation);
        this.f2812a = i7;
        this.f2813b = dataBean;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0272u(this.f2812a, this.f2813b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0272u) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        boolean z3 = I.f2735f;
        HomeFragmentContract$IView homeFragmentContract$IView = (HomeFragmentContract$IView) this.f2812a.f27351a;
        if (homeFragmentContract$IView != null) {
            homeFragmentContract$IView.showHomeCommonInfo(this.f2813b);
        }
        return Unit.f38893a;
    }
}
