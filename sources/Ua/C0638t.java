package Ua;

import com.transsnet.palmpay.core.bean.req.QueryCouponStatisticsReq;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import com.transsnet.palmpay.util.NetworkUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: renamed from: Ua.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0638t extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryCouponStatisticsReq f9480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ModelAvailableCouponItem f9481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f9482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0638t(String str, Continuation continuation, QueryCouponStatisticsReq queryCouponStatisticsReq, ModelAvailableCouponItem modelAvailableCouponItem, Function0 function0) {
        super(2, continuation);
        this.f9479b = str;
        this.f9480c = queryCouponStatisticsReq;
        this.f9481d = modelAvailableCouponItem;
        this.f9482e = function0;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        Function0 function0 = this.f9482e;
        return new C0638t(this.f9479b, continuation, this.f9480c, this.f9481d, function0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0638t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f9478a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            if (!NetworkUtils.isConnected()) {
                return Unit.f38893a;
            }
            kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
            f10.f38951a = "";
            kotlinx.coroutines.flow.T t = new kotlinx.coroutines.flow.T(new r(this.f9479b, f10, null, this.f9480c));
            p042cg.f fVar = Wf.I.f10809a;
            Flow flowN = kotlinx.coroutines.flow.X.n(t, p042cg.e.f19009c);
            ModelAvailableCouponItem modelAvailableCouponItem = this.f9481d;
            C1888u c1888u = new C1888u(flowN, new Ma.l((Continuation) null, modelAvailableCouponItem));
            C0637s c0637s = new C0637s(null, modelAvailableCouponItem, this.f9482e);
            this.f9478a = 1;
            if (kotlinx.coroutines.flow.X.g(c1888u, c0637s, this) == aVar) {
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
