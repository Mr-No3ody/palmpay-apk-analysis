package p284sb;

import Ef.a;
import Ff.h;
import Wf.D;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentResultActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.PayShopPaymentViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayShopPaymentResultActivity f42115b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(PayShopPaymentResultActivity payShopPaymentResultActivity, Continuation continuation) {
        super(2, continuation);
        this.f42115b = payShopPaymentResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C(this.f42115b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f42114a;
        PayShopPaymentResultActivity payShopPaymentResultActivity = this.f42115b;
        if (i7 == 0) {
            g.M(obj);
            long j6 = payShopPaymentResultActivity.f28741H;
            this.f42114a = 1;
            if (D.b(j6, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        int i10 = PayShopPaymentResultActivity.f28737Q;
        PayByOrderResp.DataBean dataBean = payShopPaymentResultActivity.f28738A;
        if (dataBean != null && dataBean.payStatus == 0) {
            ((PayShopPaymentViewModel) payShopPaymentResultActivity.l()).d(dataBean.orderNo);
        }
        return Unit.f38893a;
    }
}
