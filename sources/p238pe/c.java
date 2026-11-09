package p238pe;

import Ef.a;
import F6.d;
import Ff.h;
import Pe.n0;
import Wf.D;
import Wf.t0;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.main.export.bean.rsp.PayCodeOrderDetailBean;
import com.transsnet.palmpay.ui.activity.paycode.PayCodeTransactionResultActivity;
import com.transsnet.palmpay.viewmodule.PayCodeTransctionResultViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayCodeTransactionResultActivity f41303b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PayCodeTransactionResultActivity payCodeTransactionResultActivity, Continuation continuation) {
        super(2, continuation);
        this.f41303b = payCodeTransactionResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f41303b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f41302a;
        if (i7 == 0) {
            g.M(obj);
            this.f41302a = 1;
            if (D.b(5000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        PayCodeTransactionResultActivity payCodeTransactionResultActivity = this.f41303b;
        PayCodeOrderDetailBean payCodeOrderDetailBean = payCodeTransactionResultActivity.t;
        if (payCodeOrderDetailBean != null) {
            PayCodeTransctionResultViewModel payCodeTransctionResultViewModel = (PayCodeTransctionResultViewModel) payCodeTransactionResultActivity.l();
            CheckPayReq req = new CheckPayReq();
            req.payId = payCodeOrderDetailBean.payId;
            PayByOrderResp.DataBean dataBean = (PayByOrderResp.DataBean) payCodeTransactionResultActivity.f34796f.getValue();
            req.subPayId = dataBean != null ? dataBean.subPayId : null;
            req.orderNo = payCodeOrderDetailBean.orderNo;
            req.transType = payCodeOrderDetailBean.transType;
            req.orderType = payCodeOrderDetailBean.orderType;
            req.endFlag = false;
            payCodeTransctionResultViewModel.getClass();
            Intrinsics.checkNotNullParameter(req, "req");
            t0 t0Var = payCodeTransctionResultViewModel.f35401f;
            if (t0Var != null && t0Var.isActive()) {
                d.h("jobQueryResult cancel", 3, new Object[0]);
                t0 t0Var2 = payCodeTransctionResultViewModel.f35401f;
                if (t0Var2 != null) {
                    t0Var2.cancel((CancellationException) null);
                }
            }
            payCodeTransctionResultViewModel.f35401f = f.s(payCodeTransctionResultViewModel, new n0(req, null), payCodeTransctionResultViewModel.f35400e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        return Unit.f38893a;
    }
}
