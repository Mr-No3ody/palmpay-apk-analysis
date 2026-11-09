package He;

import Ab.C;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.ui.view.ModelPalmPrizeBanner;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f3875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelPalmPrizeBanner f3876b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CommonResult commonResult, Continuation continuation, ModelPalmPrizeBanner modelPalmPrizeBanner) {
        super(2, continuation);
        this.f3875a = commonResult;
        this.f3876b = modelPalmPrizeBanner;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f3875a, continuation, this.f3876b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CommonListResultV2 commonListResultV2 = (CommonListResultV2) this.f3875a;
        ModelPalmPrizeBanner modelPalmPrizeBanner = this.f3876b;
        if (commonListResultV2 == null || !commonListResultV2.isSuccess() || commonListResultV2.data == null) {
            C c6 = modelPalmPrizeBanner.f35302c;
            if (c6 != null) {
                c6.invoke(Boolean.FALSE);
            }
        } else {
            C c10 = modelPalmPrizeBanner.f35302c;
            if (c10 != null) {
                c10.invoke(Boolean.TRUE);
            }
            List list = commonListResultV2.data;
            if (list != null) {
                modelPalmPrizeBanner.e(list);
            }
        }
        return Unit.f38893a;
    }
}
