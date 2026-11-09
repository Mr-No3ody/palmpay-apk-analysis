package p253qb;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import Wf.I;
import androidx.camera.core.impl.utils.executor.g;
import androidx.fragment.app.E;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.CreditBorrowParam;
import com.transsnet.palmpay.credit.bean.LoanEnterPreCheckInfo;
import com.transsnet.palmpay.credit.rnbridge.LoanCreditApplyBridge;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoanCreditApplyBridge f41472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f41473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CreditBorrowParam f41474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LoanCreditApplyBridge loanCreditApplyBridge, E e10, CreditBorrowParam creditBorrowParam, Continuation continuation) {
        super(2, continuation);
        this.f41472b = loanCreditApplyBridge;
        this.f41473c = e10;
        this.f41474d = creditBorrowParam;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f41472b, this.f41473c, this.f41474d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f2423a;
        int i7 = this.f41471a;
        LoanEnterPreCheckInfo loanEnterPreCheckInfo = null;
        if (i7 == 0) {
            g.M(obj);
            f fVar = I.f10809a;
            e eVar = e.f19009c;
            a aVar2 = new a(2, null);
            this.f41471a = 1;
            obj = AbstractC0780y.s(eVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
        if (commonBeanResult != null) {
            if (!commonBeanResult.isSuccess()) {
                commonBeanResult = null;
            }
            if (commonBeanResult != null) {
                loanEnterPreCheckInfo = (LoanEnterPreCheckInfo) commonBeanResult.data;
            }
        }
        E e10 = this.f41473c;
        LoanCreditApplyBridge loanCreditApplyBridge = this.f41472b;
        CreditBorrowParam creditBorrowParam = this.f41474d;
        if (loanEnterPreCheckInfo != null) {
            loanCreditApplyBridge.navigateAfterPreCheck(e10, creditBorrowParam, loanEnterPreCheckInfo);
        } else {
            loanCreditApplyBridge.startCredit(e10, creditBorrowParam);
        }
        return Unit.f38893a;
    }
}
