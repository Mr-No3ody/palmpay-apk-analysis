package p085fd;

import Ef.a;
import Ff.h;
import com.transsnet.palmpay.airtime.network.IAirtimeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f36457b = str;
        this.f36458c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f36457b, this.f36458c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((g) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36456a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        this.f36456a = 1;
        Object airtimeBalance = iAirtimeService.getAirtimeBalance(this.f36457b, this.f36458c, this);
        return airtimeBalance == aVar ? aVar : airtimeBalance;
    }
}
