package Pe;

import com.transsnet.palmpay.core.network.api.AccountApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Pe.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0539k extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7265c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0539k(String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f7264b = str;
        this.f7265c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0539k(this.f7264b, this.f7265c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0539k) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7263a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        AccountApiService accountApiService = (AccountApiService) p324va.c.f43141a.f14623d;
        this.f7263a = 1;
        Object objDeleteLinkBankCardMvvm = accountApiService.deleteLinkBankCardMvvm(this.f7264b, this.f7265c, this);
        return objDeleteLinkBankCardMvvm == aVar ? aVar : objDeleteLinkBankCardMvvm;
    }
}
