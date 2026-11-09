package Z9;

import com.transsnet.palmpay.contacts.api.ContactsApiService;
import com.transsnet.palmpay.core.bean.req.AddContactReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddContactReq f11576b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AddContactReq addContactReq, Continuation continuation) {
        super(1, continuation);
        this.f11576b = addContactReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new c(this.f11576b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((c) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f11575a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ContactsApiService contactsApiService = (ContactsApiService) S9.a.f8824a.f41079b;
        this.f11575a = 1;
        Object objAddContact = contactsApiService.addContact(this.f11576b, this);
        return objAddContact == aVar ? aVar : objAddContact;
    }
}
