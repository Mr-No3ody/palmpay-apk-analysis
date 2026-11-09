package Ua;

import com.transsnet.palmpay.core.bean.FlashSaleDataBundleBeanV2;
import com.transsnet.palmpay.core.viewmodel.ModelDataPlanFlashSaleItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class V extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f9372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModelDataPlanFlashSaleItem f9373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FlashSaleDataBundleBeanV2 f9374d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(long j6, ModelDataPlanFlashSaleItem modelDataPlanFlashSaleItem, FlashSaleDataBundleBeanV2 flashSaleDataBundleBeanV2, Continuation continuation) {
        super(2, continuation);
        this.f9372b = j6;
        this.f9373c = modelDataPlanFlashSaleItem;
        this.f9374d = flashSaleDataBundleBeanV2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new V(this.f9372b, this.f9373c, this.f9374d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f9371a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            this.f9371a = 1;
            if (Wf.D.b(this.f9372b, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        ModelDataPlanFlashSaleItem modelDataPlanFlashSaleItem = this.f9373c;
        modelDataPlanFlashSaleItem.getAdapter().notifyDataSetChanged();
        modelDataPlanFlashSaleItem.g(this.f9374d);
        return Unit.f38893a;
    }
}
