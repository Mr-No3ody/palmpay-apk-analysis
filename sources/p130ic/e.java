package p130ic;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.req.DeleteHistoryOrderReq;
import com.transsnet.palmpay.core.network.PayApiService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f37508b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f37508b = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new e(this.f37508b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f37507a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        PayApiService payApiService = (PayApiService) c.f43141a.f14621b;
        DeleteHistoryOrderReq deleteHistoryOrderReq = new DeleteHistoryOrderReq(this.f37508b);
        this.f37507a = 1;
        Object objDeleteHistoryOrderList = payApiService.deleteHistoryOrderList(deleteHistoryOrderReq, this);
        return objDeleteHistoryOrderList == aVar ? aVar : objDeleteHistoryOrderList;
    }
}
