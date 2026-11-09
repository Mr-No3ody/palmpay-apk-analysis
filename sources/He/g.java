package He;

import Bc.D;
import Hb.L;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.main.export.bean.rsp.PremiumTrialClaimResultBean;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import com.wang.avi.AVLoadingIndicatorView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f3883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelPremiumBenefits f3884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L f3885c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CommonResult commonResult, Continuation continuation, ModelPremiumBenefits modelPremiumBenefits, L l5) {
        super(2, continuation);
        this.f3883a = commonResult;
        this.f3884b = modelPremiumBenefits;
        this.f3885c = l5;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f3883a, continuation, this.f3884b, this.f3885c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        PremiumTrialClaimResultBean premiumTrialClaimResultBean;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CommonBeanResult commonBeanResult = (CommonBeanResult) this.f3883a;
        ModelPremiumBenefits modelPremiumBenefits = this.f3884b;
        D d2 = modelPremiumBenefits.f35306d;
        if (d2 != null) {
            p220oa.h.s(d2.f619e, true);
        }
        D d10 = modelPremiumBenefits.f35306d;
        if (d10 != null) {
            p220oa.h.s((AVLoadingIndicatorView) d10.f626v, false);
        }
        if (commonBeanResult != null && commonBeanResult.isSuccess() && (premiumTrialClaimResultBean = (PremiumTrialClaimResultBean) commonBeanResult.data) != null && premiumTrialClaimResultBean.claimEnable) {
            modelPremiumBenefits.d();
            this.f3885c.invoke();
        }
        return Unit.f38893a;
    }
}
