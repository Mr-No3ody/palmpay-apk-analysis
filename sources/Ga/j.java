package Ga;

import com.transsnet.palmpay.core.bean.req.UploadContactsItemReq;
import com.transsnet.palmpay.core.network.PayApiService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f3213b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List list, Continuation continuation) {
        super(2, continuation);
        this.f3213b = list;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f3213b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f3212a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        UploadContactsItemReq uploadContactsItemReq = new UploadContactsItemReq(this.f3213b);
        this.f3212a = 1;
        Object objUploadSystemContactList = payApiService.uploadSystemContactList(uploadContactsItemReq, this);
        return objUploadSystemContactList == aVar ? aVar : objUploadSystemContactList;
    }
}
