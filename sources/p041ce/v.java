package p041ce;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.BillQuickAccessBean;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.teller.ui.view.ModelBillerMoreService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f18971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelBillerMoreService f18972b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(CommonResult commonResult, Continuation continuation, ModelBillerMoreService modelBillerMoreService) {
        super(2, continuation);
        this.f18971a = commonResult;
        this.f18972b = modelBillerMoreService;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.f18971a, continuation, this.f18972b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        BillQuickAccessBean billQuickAccessBean;
        a aVar = a.f2423a;
        g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f18971a;
        if (commonBeanResult != null && commonBeanResult.isSuccess() && (billQuickAccessBean = (BillQuickAccessBean) commonBeanResult.data) != null) {
            this.f18972b.c(billQuickAccessBean);
        }
        return Unit.f38893a;
    }
}
