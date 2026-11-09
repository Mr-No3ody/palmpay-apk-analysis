package Kd;

import android.text.TextUtils;
import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.req.RecipientMemberLogoutReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class V1 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f5155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecipientBeanV2 f5156c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(Integer num, RecipientBeanV2 recipientBeanV2, Continuation continuation) {
        super(1, continuation);
        this.f5155b = num;
        this.f5156c = recipientBeanV2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new V1(this.f5155b, this.f5156c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((V1) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5154a;
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
        Integer num = this.f5155b;
        recipientMemberLogoutReq.businessType = num != null ? num.intValue() : 0;
        RecipientBeanV2 recipientBeanV2 = this.f5156c;
        String ppAccountNo = !TextUtils.isEmpty(recipientBeanV2.getPpAccountNo()) ? recipientBeanV2.getPpAccountNo() : recipientBeanV2.getPhone();
        if (ppAccountNo == null) {
            ppAccountNo = "";
        }
        recipientMemberLogoutReq.accountNo = ppAccountNo;
        String memberId = recipientBeanV2.getMemberId();
        recipientMemberLogoutReq.memberId = memberId != null ? memberId : "";
        this.f5154a = 1;
        Object recipientMemberLogOut = sendMoneyApiService.getRecipientMemberLogOut(recipientMemberLogoutReq, this);
        return recipientMemberLogOut == aVar ? aVar : recipientMemberLogOut;
    }
}
