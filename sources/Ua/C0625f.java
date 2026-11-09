package Ua;

import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Ua.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0625f extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9399b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0625f(String str, Continuation continuation) {
        super(1, continuation);
        this.f9399b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0625f(this.f9399b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0625f) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f9398a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f9398a = 1;
        Object bankInfoByCardNoMvvm = payApiService.getBankInfoByCardNoMvvm(this.f9399b, this);
        return bankInfoByCardNoMvvm == aVar ? aVar : bankInfoByCardNoMvvm;
    }
}
