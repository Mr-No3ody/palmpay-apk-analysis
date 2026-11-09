package Jb;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import com.transsnet.palmpay.core.bean.TransferByLoanResult;
import com.transsnet.palmpay.credit.bean.req.CLSaveCashierContextReq;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.viewmodel.TransferByLoanViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f4708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CLRepaymentPlanData f4709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TransferByLoanViewModel f4710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(G g7, CLRepaymentPlanData cLRepaymentPlanData, TransferByLoanViewModel transferByLoanViewModel, Continuation continuation) {
        super(2, continuation);
        this.f4708b = g7;
        this.f4709c = cLRepaymentPlanData;
        this.f4710d = transferByLoanViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new K(this.f4708b, this.f4709c, this.f4710d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4707a;
        CLRepaymentPlanData cLRepaymentPlanData = this.f4709c;
        G g7 = this.f4708b;
        TransferByLoanViewModel transferByLoanViewModel = this.f4710d;
        String str = g7.f4701b;
        TransferByLoanOpenParams transferByLoanOpenParams = g7.f4700a;
        androidx.lifecycle.F f10 = transferByLoanViewModel.f30936o;
        androidx.lifecycle.F f11 = transferByLoanViewModel.f30934i;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                p221ob.c.f40268a.getInstance().getClass();
                IApiCreditService iApiCreditServiceA = p221ob.c.a();
                CLSaveCashierContextReq cLSaveCashierContextReqK = G8.a.k(transferByLoanOpenParams, str, cLRepaymentPlanData);
                this.f4707a = 1;
                obj = iApiCreditServiceA.saveCashierContext(cLSaveCashierContextReqK, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            CommonResult commonResult = (CommonResult) obj;
            if (commonResult.isSuccess()) {
                transferByLoanViewModel.f30930C = true;
                f11.k(Boolean.FALSE);
                transferByLoanViewModel.t.k(new TransferByLoanResult(TransferByLoanResult.STATUS_CONFIRMED, p264r5.a.c(transferByLoanOpenParams, str, cLRepaymentPlanData)));
                return Unit.f38893a;
            }
            transferByLoanViewModel.f30929B = false;
            f11.k(Boolean.FALSE);
            String respMsg = commonResult.getRespMsg();
            if (respMsg == null) {
                respMsg = "";
            }
            f10.k(respMsg);
            return Unit.f38893a;
        } catch (CancellationException e10) {
            transferByLoanViewModel.f30929B = false;
            f11.k(Boolean.FALSE);
            throw e10;
        } catch (Exception unused) {
            transferByLoanViewModel.f30929B = false;
            f11.k(Boolean.FALSE);
            f10.k("");
        }
    }
}
