package p055de;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.req.GetMenuBySceneReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetMenuBySceneReq f35906b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GetMenuBySceneReq getMenuBySceneReq, Continuation continuation) {
        super(1, continuation);
        this.f35906b = getMenuBySceneReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new c(this.f35906b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((c) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f35905a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f35905a = 1;
        Object menuBySceneV2 = payApiService.getMenuBySceneV2(this.f35906b, this);
        return menuBySceneV2 == aVar ? aVar : menuBySceneV2;
    }
}
