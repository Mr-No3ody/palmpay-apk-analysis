package U3;

import com.flexibank.sdk.api.FlexiBankApiCashierService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O3.e f9188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(O3.e eVar, Continuation continuation) {
        super(1, continuation);
        this.f9188b = eVar;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f9188b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((b) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f9187a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        FlexiBankApiCashierService flexiBankApiCashierService = J3.b.f4493a;
        this.f9187a = 1;
        Object objCheckSavingPay = flexiBankApiCashierService.checkSavingPay(this.f9188b, this);
        return objCheckSavingPay == aVar ? aVar : objCheckSavingPay;
    }
}
