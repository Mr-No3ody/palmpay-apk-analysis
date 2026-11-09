package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1714l extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddUserExtraInfoReq f36971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714l(AddUserExtraInfoReq addUserExtraInfoReq, Continuation continuation) {
        super(1, continuation);
        this.f36971b = addUserExtraInfoReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1714l(this.f36971b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1714l) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36970a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        AddUserExtraInfoReq addUserExtraInfoReq = this.f36971b;
        if (addUserExtraInfoReq != null) {
            addUserExtraInfoReq.campaignContent = p059e1.a.H("firebase_sp_appsflyer_campaign");
        }
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36970a = 1;
        Object objAddUserExtraInfo = iApiAccountServiceT.addUserExtraInfo(addUserExtraInfoReq, this);
        return objAddUserExtraInfo == aVar ? aVar : objAddUserExtraInfo;
    }
}
