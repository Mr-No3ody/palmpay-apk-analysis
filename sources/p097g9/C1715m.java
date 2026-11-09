package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.bean.req.ApplyBalanceV2Req;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1715m extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApplyBalanceV2Req f36973b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715m(ApplyBalanceV2Req applyBalanceV2Req, Continuation continuation) {
        super(1, continuation);
        this.f36973b = applyBalanceV2Req;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1715m(this.f36973b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1715m) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36972a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        ApplyBalanceV2Req applyBalanceV2Req = this.f36973b;
        if (applyBalanceV2Req != null) {
            applyBalanceV2Req.campaignContent = p059e1.a.H("firebase_sp_appsflyer_campaign");
        }
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36972a = 1;
        Object objApplyForBalanceV2 = iApiAccountServiceT.applyForBalanceV2(applyBalanceV2Req, this);
        return objApplyForBalanceV2 == aVar ? aVar : objApplyForBalanceV2;
    }
}
