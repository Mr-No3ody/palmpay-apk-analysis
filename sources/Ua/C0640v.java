package Ua;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.CorePointInfoBean;
import com.transsnet.palmpay.core.viewmodel.ModelAvailablePointItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Ua.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0640v extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f9493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelAvailablePointItem f9494b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0640v(CommonResult commonResult, Continuation continuation, ModelAvailablePointItem modelAvailablePointItem) {
        super(2, continuation);
        this.f9493a = commonResult;
        this.f9494b = modelAvailablePointItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0640v(this.f9493a, continuation, this.f9494b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0640v) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        T t;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f9493a;
        if (commonBeanResult != null && commonBeanResult.isSuccess() && (t = commonBeanResult.data) != 0) {
            ModelAvailablePointItem modelAvailablePointItem = this.f9494b;
            modelAvailablePointItem.setVisibility(0);
            ModelAvailablePointItem.a(modelAvailablePointItem, (CorePointInfoBean) t);
        }
        return Unit.f38893a;
    }
}
