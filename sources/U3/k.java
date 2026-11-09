package U3;

import com.flexibank.sdk.api.FlexiBankApiCashierService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O3.c f9207b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(O3.c cVar, Continuation continuation) {
        super(1, continuation);
        this.f9207b = cVar;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new k(this.f9207b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((k) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f9206a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        FlexiBankApiCashierService flexiBankApiCashierService = J3.b.f4493a;
        this.f9206a = 1;
        Object objQueryUserCouponListByConditionByVM = flexiBankApiCashierService.queryUserCouponListByConditionByVM(this.f9207b, this);
        return objQueryUserCouponListByConditionByVM == aVar ? aVar : objQueryUserCouponListByConditionByVM;
    }
}
