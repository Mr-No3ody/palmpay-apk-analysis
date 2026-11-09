package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.req.SavePayoutOptionsReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7682b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(int i7, Continuation continuation) {
        super(1, continuation);
        this.f7682b = i7;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new K(this.f7682b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((K) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7681a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        SavePayoutOptionsReq savePayoutOptionsReq = new SavePayoutOptionsReq(this.f7682b);
        this.f7681a = 1;
        Object objSavePayoutOptions = manageApiService.savePayoutOptions(savePayoutOptionsReq, this);
        return objSavePayoutOptions == aVar ? aVar : objSavePayoutOptions;
    }
}
