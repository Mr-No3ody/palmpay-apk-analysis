package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class N extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7690b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(int i7, Continuation continuation) {
        super(1, continuation);
        this.f7690b = i7;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new N(this.f7690b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((N) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7689a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        this.f7689a = 1;
        Object objUpdateInterestSwitch = manageApiService.updateInterestSwitch(this.f7690b, this);
        return objUpdateInterestSwitch == aVar ? aVar : objUpdateInterestSwitch;
    }
}
