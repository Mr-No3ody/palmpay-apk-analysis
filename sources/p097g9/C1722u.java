package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.business.IApiAccountService;
import com.transsnet.palmpay.core.bean.BankInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g9.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1722u extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BankInfo f36991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722u(BankInfo bankInfo, String str, Continuation continuation) {
        super(1, continuation);
        this.f36991b = bankInfo;
        this.f36992c = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1722u(this.f36991b, this.f36992c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1722u) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36990a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        BankInfo bankInfo = this.f36991b;
        String str = bankInfo != null ? bankInfo.bankCode : null;
        this.f36990a = 1;
        Object objQueryBvnByBankAccount = iApiAccountServiceT.queryBvnByBankAccount(str, this.f36992c, this);
        return objQueryBvnByBankAccount == aVar ? aVar : objQueryBvnByBankAccount;
    }
}
