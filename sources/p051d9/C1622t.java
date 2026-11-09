package p051d9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.req.ShareAccountDetailReq;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p324va.c;

/* JADX INFO: renamed from: d9.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1622t extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShareAccountDetailReq f35662b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1622t(ShareAccountDetailReq shareAccountDetailReq, Continuation continuation) {
        super(1, continuation);
        this.f35662b = shareAccountDetailReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1622t(this.f35662b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1622t) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f35661a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        AccountApiService accountApiService = (AccountApiService) c.f43141a.f14623d;
        this.f35661a = 1;
        Object objQueryShareAccountDetailMvvm = accountApiService.queryShareAccountDetailMvvm(this.f35662b, this);
        return objQueryShareAccountDetailMvvm == aVar ? aVar : objQueryShareAccountDetailMvvm;
    }
}
