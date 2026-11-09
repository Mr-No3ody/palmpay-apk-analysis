package Qc;

import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxStatResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxTransactionHistoryViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Qc.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0563d extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashBoxTransactionHistoryViewModel f7742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ QueryCashBoxStatResp f7744d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0563d(CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel, long j6, QueryCashBoxStatResp queryCashBoxStatResp, Continuation continuation) {
        super(2, continuation);
        this.f7742b = cashBoxTransactionHistoryViewModel;
        this.f7743c = j6;
        this.f7744d = queryCashBoxStatResp;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0563d(this.f7742b, this.f7743c, this.f7744d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0563d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7741a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            this.f7741a = 1;
            if (Wf.D.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel = this.f7742b;
        cashBoxTransactionHistoryViewModel.f32727g.f27356m = new Long(this.f7743c);
        cashBoxTransactionHistoryViewModel.f32727g.k(new com.transsnet.palmpay.core.base.p(this.f7744d));
        return Unit.f38893a;
    }
}
