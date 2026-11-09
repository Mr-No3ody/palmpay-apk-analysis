package Db;

import com.transsnet.palmpay.core.bean.req.GetSendCashDetailReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1777b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(String str, Continuation continuation) {
        super(1, continuation);
        this.f1777b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new D(this.f1777b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((D) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1776a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        GetSendCashDetailReq getSendCashDetailReq = new GetSendCashDetailReq(this.f1777b);
        this.f1776a = 1;
        Object sendCashDetailMvvm = payApiService.getSendCashDetailMvvm(getSendCashDetailReq, this);
        return sendCashDetailMvvm == aVar ? aVar : sendCashDetailMvvm;
    }
}
