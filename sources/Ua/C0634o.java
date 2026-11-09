package Ua;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.rsp.QueryCouponClaimBodyData;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Ua.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0634o extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f9440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelAvailableCouponItem f9441b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0634o(CommonResult commonResult, Continuation continuation, ModelAvailableCouponItem modelAvailableCouponItem) {
        super(2, continuation);
        this.f9440a = commonResult;
        this.f9441b = modelAvailableCouponItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0634o(this.f9440a, continuation, this.f9441b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0634o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f9440a;
        if (commonBeanResult != null && commonBeanResult.isSuccess()) {
            T t = commonBeanResult.data;
            if (((QueryCouponClaimBodyData) t) != null) {
                ModelAvailableCouponItem.c(this.f9441b, (QueryCouponClaimBodyData) t);
            }
        }
        return Unit.f38893a;
    }
}
