package Pa;

import com.transsnet.palmpay.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Pa.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0528z extends Ff.h implements Function2 {
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0528z(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0528z) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SPUtils.getInstance().put("oc_first_contact_tag", "");
        SPUtils.getInstance().put("oc_first_contact_name", "");
        SPUtils.getInstance().put("oc_first_contact_phone", "");
        SPUtils.getInstance().put("oc_second_contact_tag", "");
        SPUtils.getInstance().put("oc_second_contact_name", "");
        SPUtils.getInstance().put("oc_second_contact_phone", "");
        SPUtils.getInstance().put("oc_self_phone", "");
        return Unit.f38893a;
    }
}
