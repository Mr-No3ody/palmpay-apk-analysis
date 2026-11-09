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

/* JADX INFO: renamed from: d9.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1621s extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35659a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1621s(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1621s) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f35659a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        ArrayList arrayList = new ArrayList();
        arrayList.add("switchLogInPermissionDialog");
        PayApiService payApiService = (PayApiService) c.f43141a.f14621b;
        QueryUiResourceReq queryUiResourceReq = new QueryUiResourceReq(arrayList);
        this.f35659a = 1;
        Object objQueryUiResource = payApiService.queryUiResource(queryUiResourceReq, this);
        return objQueryUiResource == aVar ? aVar : objQueryUiResource;
    }
}
