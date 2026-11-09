package Kd;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.req.RecipientMemberLogoutReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class W0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecipientListResp.RecipientBean f5160b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(RecipientListResp.RecipientBean recipientBean, Continuation continuation) {
        super(1, continuation);
        this.f5160b = recipientBean;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new W0(this.f5160b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((W0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5159a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        RecipientMemberLogoutReq recipientMemberLogoutReq = new RecipientMemberLogoutReq();
        recipientMemberLogoutReq.businessType = 2;
        RecipientListResp.RecipientBean recipientBean = this.f5160b;
        String recipientAccountNumber = recipientBean.getRecipientAccountNumber();
        if (recipientAccountNumber == null) {
            recipientAccountNumber = "";
        }
        recipientMemberLogoutReq.accountNo = recipientAccountNumber;
        String recipientMemberId = recipientBean.getRecipientMemberId();
        recipientMemberLogoutReq.memberId = recipientMemberId != null ? recipientMemberId : "";
        this.f5159a = 1;
        Object recipientMemberLogOut = sendMoneyApiService.getRecipientMemberLogOut(recipientMemberLogoutReq, this);
        return recipientMemberLogOut == aVar ? aVar : recipientMemberLogOut;
    }
}
