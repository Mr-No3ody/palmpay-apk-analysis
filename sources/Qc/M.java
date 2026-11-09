package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(int i7, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f7686b = i7;
        this.f7687c = str;
        this.f7688d = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new M(this.f7686b, this.f7687c, this.f7688d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((M) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7685a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        this.f7685a = 1;
        Object objUpdateAutoTransferConfig = manageApiService.updateAutoTransferConfig(this.f7686b, this.f7687c, this.f7688d, this);
        return objUpdateAutoTransferConfig == aVar ? aVar : objUpdateAutoTransferConfig;
    }
}
