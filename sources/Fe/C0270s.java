package Fe;

import com.transsnet.palmpay.core.bean.req.ClipboardMatchInfoReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Fe.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0270s extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2810b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0270s(String str, Continuation continuation) {
        super(1, continuation);
        this.f2810b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0270s(this.f2810b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0270s) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2809a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        ClipboardMatchInfoReq clipboardMatchInfoReq = new ClipboardMatchInfoReq(this.f2810b);
        this.f2809a = 1;
        Object clipboardMatchInfo = payApiService.getClipboardMatchInfo(clipboardMatchInfoReq, this);
        return clipboardMatchInfo == aVar ? aVar : clipboardMatchInfo;
    }
}
