package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class Y extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f36940b = str;
        this.f36941c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new Y(this.f36940b, this.f36941c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Y) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36939a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36939a = 1;
        Object objQueryAccountDeviceHistory = iApiAccountServiceT.queryAccountDeviceHistory(this.f36940b, this.f36941c, this);
        return objQueryAccountDeviceHistory == aVar ? aVar : objQueryAccountDeviceHistory;
    }
}
