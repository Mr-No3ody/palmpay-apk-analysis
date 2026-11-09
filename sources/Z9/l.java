package Z9;

import com.transsnet.palmpay.contacts.api.ContactsApiService;
import com.transsnet.palmpay.contacts.bean.req.AddRelationShipReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddRelationShipReq f11597b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AddRelationShipReq addRelationShipReq, Continuation continuation) {
        super(1, continuation);
        this.f11597b = addRelationShipReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new l(this.f11597b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((l) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f11596a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ContactsApiService contactsApiService = (ContactsApiService) S9.a.f8824a.f41079b;
        this.f11596a = 1;
        Object objQueryRelationShip = contactsApiService.queryRelationShip(this.f11597b, this);
        return objQueryRelationShip == aVar ? aVar : objQueryRelationShip;
    }
}
