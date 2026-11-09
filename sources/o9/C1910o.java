package o9;

import com.transsnet.palmpay.airtime.network.IAirtimeService;
import com.transsnet.palmpay.teller.bean.HistoryOrderReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1910o extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HistoryOrderReq f40222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1910o(HistoryOrderReq historyOrderReq, Continuation continuation) {
        super(1, continuation);
        this.f40222b = historyOrderReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1910o(this.f40222b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1910o) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f40221a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        this.f40221a = 1;
        Object airtimeOrderList = iAirtimeService.getAirtimeOrderList(this.f40222b, this);
        return airtimeOrderList == aVar ? aVar : airtimeOrderList;
    }
}
