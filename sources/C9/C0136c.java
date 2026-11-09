package C9;

import J9.C0323g;
import com.transsnet.palmpay.cash_in.bean.response.BindBankCardDetail;
import com.transsnet.palmpay.cash_in.ui.activity.BindBankCardResultActivity;
import com.transsnet.palmpay.cash_in.ui.viewmodel.BindBankCardViewModel;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: C9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0136c extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BindBankCardResultActivity f1296b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0136c(BindBankCardResultActivity bindBankCardResultActivity, Continuation continuation) {
        super(2, continuation);
        this.f1296b = bindBankCardResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0136c(this.f1296b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0136c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1295a;
        BindBankCardResultActivity bindBankCardResultActivity = this.f1296b;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            long j6 = bindBankCardResultActivity.f26799p;
            this.f1295a = 1;
            if (Wf.D.b(j6, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        PayByOrderResp.DataBean dataBean = bindBankCardResultActivity.f26795g;
        if (dataBean != null) {
            BindBankCardViewModel bindBankCardViewModel = (BindBankCardViewModel) bindBankCardResultActivity.l();
            CheckPayReq checkPayReq = new CheckPayReq();
            checkPayReq.payId = dataBean.payId;
            checkPayReq.subPayId = dataBean.subPayId;
            BindBankCardDetail bindBankCardDetail = bindBankCardResultActivity.f26798o;
            checkPayReq.orderNo = bindBankCardDetail != null ? bindBankCardDetail.orderId : null;
            checkPayReq.transType = bindBankCardDetail != null ? bindBankCardDetail.transType : null;
            checkPayReq.orderType = "7";
            checkPayReq.endFlag = false;
            bindBankCardViewModel.getClass();
            p140j8.f.s(bindBankCardViewModel, new C0323g(checkPayReq, null), bindBankCardViewModel.f27095e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        return Unit.f38893a;
    }
}
