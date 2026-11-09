package p130ic;

import Ef.a;
import Ff.h;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37512c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f37511b = str;
        this.f37512c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f37511b, this.f37512c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((g) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f37510a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        this.f37510a = 1;
        Object objQueryAvailableCoupon = iApiTellerService.queryAvailableCoupon(this.f37511b, this.f37512c, TransType.TRANS_TYPE_BUNDLE, this);
        return objQueryAvailableCoupon == aVar ? aVar : objQueryAvailableCoupon;
    }
}
