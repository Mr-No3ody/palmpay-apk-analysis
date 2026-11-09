package p051d9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.req.QueryUiResourceReq;
import com.transsnet.palmpay.core.network.PayApiService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p324va.c;

/* JADX INFO: loaded from: classes3.dex */
public final class Y extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f35587b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f35587b = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new Y(this.f35587b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Y) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f35586a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        PayApiService payApiService = (PayApiService) c.f43141a.f14621b;
        QueryUiResourceReq queryUiResourceReq = new QueryUiResourceReq(this.f35587b);
        this.f35586a = 1;
        Object objQueryUiResource = payApiService.queryUiResource(queryUiResourceReq, this);
        return objQueryUiResource == aVar ? aVar : objQueryUiResource;
    }
}
