package Ma;

import com.transsnet.palmpay.core.bean.cashier.CashierReceiveMethodBean;
import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfWithdrawalReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultCalcOfWithdrawalReq f5898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CashierReceiveMethodBean f5899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DefaultCalcOfWithdrawalReq defaultCalcOfWithdrawalReq, CashierReceiveMethodBean cashierReceiveMethodBean, Continuation continuation) {
        super(2, continuation);
        this.f5898c = defaultCalcOfWithdrawalReq;
        this.f5899d = cashierReceiveMethodBean;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        k kVar = new k(this.f5898c, this.f5899d, continuation);
        kVar.f5897b = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:94:0x0156  */
    /* JADX WARN: Code duplicated, block: B:97:0x0161  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0192, code lost:
    
        if (r2.emit(r3, r16) == r1) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015e, code lost:
    
        if (r2.emit(r3, r16) == r1) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0178, code lost:
    
        if (r2.emit(r5, r16) == r1) goto L102;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ma.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
