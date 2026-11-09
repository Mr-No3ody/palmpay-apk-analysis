package o9;

import com.transsnet.palmpay.core.bean.req.DeleteHistoryOrderReq;
import com.transsnet.palmpay.core.network.PayApiService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class O extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f40129b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f40129b = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new O(this.f40129b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((O) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f40128a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        DeleteHistoryOrderReq deleteHistoryOrderReq = new DeleteHistoryOrderReq(this.f40129b);
        this.f40128a = 1;
        Object objDeleteHistoryOrderList = payApiService.deleteHistoryOrderList(deleteHistoryOrderReq, this);
        return objDeleteHistoryOrderList == aVar ? aVar : objDeleteHistoryOrderList;
    }
}
