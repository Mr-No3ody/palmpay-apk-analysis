package Qc;

import com.transsnet.palmpay.core.network.api.AccountApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7679b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(String str, Continuation continuation) {
        super(1, continuation);
        this.f7679b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new I(this.f7679b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((I) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7678a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        AccountApiService accountApiService = (AccountApiService) p324va.c.f43141a.f14623d;
        this.f7678a = 1;
        Object objQueryOrderNoByPayIdForMVVM = accountApiService.queryOrderNoByPayIdForMVVM(this.f7679b, this);
        return objQueryOrderNoByPayIdForMVVM == aVar ? aVar : objQueryOrderNoByPayIdForMVVM;
    }
}
