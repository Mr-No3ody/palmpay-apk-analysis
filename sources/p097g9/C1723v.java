package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g9.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1723v extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f36996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1723v(int i7, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f36994b = str;
        this.f36995c = str2;
        this.f36996d = i7;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1723v(this.f36996d, this.f36994b, this.f36995c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1723v) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36993a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36993a = 1;
        Object objQueryBvnIdentityInfo = iApiAccountServiceT.queryBvnIdentityInfo(this.f36994b, this.f36995c, this.f36996d, this);
        return objQueryBvnIdentityInfo == aVar ? aVar : objQueryBvnIdentityInfo;
    }
}
