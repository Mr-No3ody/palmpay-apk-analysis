package N8;

import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.bean.rsp.UploadAppsFlyerRsp;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignUpActivity f6209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommonBeanResult f6210b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(SignUpActivity signUpActivity, CommonBeanResult commonBeanResult, Continuation continuation) {
        super(2, continuation);
        this.f6209a = signUpActivity;
        this.f6210b = commonBeanResult;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e0(this.f6209a, this.f6210b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SignUpActivity signUpActivity = this.f6209a;
        if (Pa.i0.W(signUpActivity)) {
            UploadAppsFlyerRsp uploadAppsFlyerRsp = (UploadAppsFlyerRsp) this.f6210b.data;
            List<SignUpRetainDialogConfig> list = uploadAppsFlyerRsp != null ? uploadAppsFlyerRsp.popupContents : null;
            SignUpActivity.a aVar2 = SignUpActivity.f26029C;
            signUpActivity.q(list);
        }
        return Unit.f38893a;
    }
}
