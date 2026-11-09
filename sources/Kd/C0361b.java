package Kd;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.AddRecipientReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Kd.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0361b extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddRecipientReq f5198b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0361b(AddRecipientReq addRecipientReq, Continuation continuation) {
        super(1, continuation);
        this.f5198b = addRecipientReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0361b(this.f5198b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0361b) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5197a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        this.f5197a = 1;
        Object objCreateRecipientMvvm = sendMoneyApiService.createRecipientMvvm(this.f5198b, this);
        return objCreateRecipientMvvm == aVar ? aVar : objCreateRecipientMvvm;
    }
}
