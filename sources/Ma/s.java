package Ma;

import C0.G;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5921c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f5920b = str;
        this.f5921c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new s(this.f5920b, this.f5921c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((s) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5919a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        String strK = G.k();
        if (strK == null) {
            strK = "";
        }
        this.f5919a = 1;
        Object objNoticeCashierClose = payApiService.noticeCashierClose(this.f5920b, strK, this.f5921c, this);
        return objNoticeCashierClose == aVar ? aVar : objNoticeCashierClose;
    }
}
