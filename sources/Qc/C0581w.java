package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Qc.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0581w extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0581w(int i7, String str, Continuation continuation) {
        super(1, continuation);
        this.f7839b = str;
        this.f7840c = i7;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0581w(this.f7840c, this.f7839b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0581w) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7838a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        this.f7838a = 1;
        Object cashBoxWithdrawalOrderDetail = manageApiService.getCashBoxWithdrawalOrderDetail(this.f7839b, this.f7840c, this);
        return cashBoxWithdrawalOrderDetail == aVar ? aVar : cashBoxWithdrawalOrderDetail;
    }
}
