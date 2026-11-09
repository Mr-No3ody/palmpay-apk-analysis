package R8;

import android.util.Base64;
import androidx.biometric.u;
import com.transsnet.palmpay.core.base.BaseApplication;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p145jd.a f7954a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p145jd.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f7954a = aVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f7954a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        byte[] bArrDecode = Base64.decode(io.fastkv.n.p(BaseApplication.get().getUser().getPhoneNumber()), 2);
        this.f7954a.getClass();
        return new u(p145jd.a.c("login_keystore_alias", bArrDecode));
    }
}
