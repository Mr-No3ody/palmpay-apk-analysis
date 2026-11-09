package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7831b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i7, Continuation continuation) {
        super(1, continuation);
        this.f7831b = i7;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new r(this.f7831b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((r) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7830a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        this.f7830a = 1;
        Object cashBoxBeforeOrderConfig = manageApiService.getCashBoxBeforeOrderConfig(this.f7831b, this);
        return cashBoxBeforeOrderConfig == aVar ? aVar : cashBoxBeforeOrderConfig;
    }
}
