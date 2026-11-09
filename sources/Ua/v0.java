package Ua;

import Wf.AbstractC0780y;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OrderResultRewardModel f9495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(OrderResultRewardModel orderResultRewardModel, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f9495a = orderResultRewardModel;
        this.f9496b = str;
        this.f9497c = str2;
        this.f9498d = str3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new v0(this.f9495a, this.f9496b, this.f9497c, this.f9498d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((v0) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        OrderResultRewardModel orderResultRewardModel = this.f9495a;
        if (!orderResultRewardModel.f28521f) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = androidx.lifecycle.V.f(orderResultRewardModel);
            p042cg.f fVar = Wf.I.f10809a;
            orderResultRewardModel.addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new y0(orderResultRewardModel, this.f9496b, this.f9497c, this.f9498d, null), 2));
        }
        return Unit.f38893a;
    }
}
