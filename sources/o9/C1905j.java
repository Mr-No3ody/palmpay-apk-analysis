package o9;

import com.transsnet.palmpay.airtime.network.IAirtimeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1905j extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40193b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1905j(int i7, Continuation continuation) {
        super(1, continuation);
        this.f40193b = i7;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1905j(this.f40193b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1905j) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f40192a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        this.f40192a = 1;
        Object objQueryMoreServiceByBusinessType = iAirtimeService.queryMoreServiceByBusinessType(this.f40193b, this);
        return objQueryMoreServiceByBusinessType == aVar ? aVar : objQueryMoreServiceByBusinessType;
    }
}
