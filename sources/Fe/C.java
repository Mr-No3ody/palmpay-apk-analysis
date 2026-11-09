package Fe;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.main.export.bean.rsp.HomeMePageMenuRsp;
import com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f2722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2723b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(CommonResult commonResult, Continuation continuation, I i7) {
        super(2, continuation);
        this.f2722a = commonResult;
        this.f2723b = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C(this.f2722a, continuation, this.f2723b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        HomeMePageMenuRsp homeMePageMenuRsp = (HomeMePageMenuRsp) this.f2722a;
        boolean z3 = I.f2735f;
        HomeFragmentContract$IView homeFragmentContract$IView = (HomeFragmentContract$IView) this.f2723b.f27351a;
        if (homeFragmentContract$IView != null) {
            homeFragmentContract$IView.showSlideMenuList(homeMePageMenuRsp.data);
        }
        return Unit.f38893a;
    }
}
