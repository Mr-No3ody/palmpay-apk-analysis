package Ua;

import com.transsnet.palmpay.core.bean.BillQuickAccessBean;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.viewmodel.ModelBillQuickAccessItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class E extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f9309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelBillQuickAccessItem f9310b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(CommonResult commonResult, Continuation continuation, ModelBillQuickAccessItem modelBillQuickAccessItem) {
        super(2, continuation);
        this.f9309a = commonResult;
        this.f9310b = modelBillQuickAccessItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new E(this.f9309a, continuation, this.f9310b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        BillQuickAccessBean billQuickAccessBean;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f9309a;
        if (commonBeanResult != null && commonBeanResult.isSuccess() && (billQuickAccessBean = (BillQuickAccessBean) commonBeanResult.data) != null) {
            this.f9310b.c(billQuickAccessBean);
        }
        return Unit.f38893a;
    }
}
