package J9;

import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreviewPayInfoV2Req f4589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PreviewPayInfoV2Req previewPayInfoV2Req, Continuation continuation) {
        super(1, continuation);
        this.f4589b = previewPayInfoV2Req;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new m(this.f4589b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((m) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4588a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f4588a = 1;
        Object objQueryPreviewPayInfoV2New = payApiService.queryPreviewPayInfoV2New(this.f4589b, this);
        return objQueryPreviewPayInfoV2New == aVar ? aVar : objQueryPreviewPayInfoV2New;
    }
}
