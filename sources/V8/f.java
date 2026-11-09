package V8;

import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.p0;
import android.graphics.drawable.Drawable;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.bean.rsp.UploadAppsFlyerRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationAddressFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationAddressFragment f10129b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(IdentityVerificationAddressFragment identityVerificationAddressFragment, Continuation continuation) {
        super(2, continuation);
        this.f10129b = identityVerificationAddressFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f10129b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f10128a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            int i10 = IdentityVerificationAddressFragment.f26156Q;
            IdentityVerificationAddressFragment identityVerificationAddressFragment = this.f10129b;
            IdentityVerificationActivity identityVerificationActivityX = identityVerificationAddressFragment.x();
            SignUpRetainDialogConfig configByPosition = identityVerificationActivityX != null ? UploadAppsFlyerRsp.getConfigByPosition(SignUpRetainDialogConfig.DIALOG_POSITION_ADDR, identityVerificationActivityX.f25874w) : null;
            Drawable drawableV = r0.V(identityVerificationAddressFragment.getContext(), configByPosition != null ? configByPosition.imageUrl : null);
            p042cg.f fVar = I.f10809a;
            p0 p0Var = p015ag.o.f11960a;
            C0711e c0711e = new C0711e(identityVerificationAddressFragment, configByPosition, drawableV, null);
            this.f10128a = 1;
            if (AbstractC0780y.s(p0Var, c0711e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
