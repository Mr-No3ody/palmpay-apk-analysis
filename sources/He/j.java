package He;

import Ab.C;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.main.export.bean.rsp.PremiumBenefitsItemBean;
import com.transsnet.palmpay.main.export.bean.rsp.PremiumBenefitsRewardBean;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f3893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelPremiumBenefits f3894b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CommonResult commonResult, Continuation continuation, ModelPremiumBenefits modelPremiumBenefits) {
        super(2, continuation);
        this.f3893a = commonResult;
        this.f3894b = modelPremiumBenefits;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f3893a, continuation, this.f3894b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        C c6;
        T t;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f3893a;
        ModelPremiumBenefits modelPremiumBenefits = this.f3894b;
        if (commonBeanResult == null || !commonBeanResult.isSuccess() || (t = commonBeanResult.data) == 0) {
            c6 = modelPremiumBenefits.f35305c;
            if (c6 != null) {
                c6.invoke(Boolean.FALSE);
            }
        } else {
            List<PremiumBenefitsItemBean> list = ((PremiumBenefitsRewardBean) t).benefitVOList;
            if ((list != null ? list.size() : 0) > 0) {
                C c10 = modelPremiumBenefits.f35305c;
                if (c10 != null) {
                    c10.invoke(Boolean.TRUE);
                }
                PremiumBenefitsRewardBean premiumBenefitsRewardBean = (PremiumBenefitsRewardBean) commonBeanResult.data;
                if (premiumBenefitsRewardBean != null) {
                    modelPremiumBenefits.e(premiumBenefitsRewardBean);
                }
            } else {
                c6 = modelPremiumBenefits.f35305c;
                if (c6 != null) {
                    c6.invoke(Boolean.FALSE);
                }
            }
        }
        return Unit.f38893a;
    }
}
