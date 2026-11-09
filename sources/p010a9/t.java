package p010a9;

import Ef.a;
import Ff.h;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.p0;
import android.graphics.drawable.Drawable;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.bean.rsp.UploadAppsFlyerRsp;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepOtcFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p015ag.o;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpStepOtcFragment f11866b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SignUpStepOtcFragment signUpStepOtcFragment, Continuation continuation) {
        super(2, continuation);
        this.f11866b = signUpStepOtcFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new t(this.f11866b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f11865a;
        if (i7 == 0) {
            g.M(obj);
            n0.g().v("SignUpOtpRetentionPopup");
            SignUpStepOtcFragment.a aVar2 = SignUpStepOtcFragment.f26279v;
            SignUpStepOtcFragment signUpStepOtcFragment = this.f11866b;
            SignUpActivity signUpActivityV = signUpStepOtcFragment.v();
            SignUpRetainDialogConfig configByPosition = signUpActivityV != null ? UploadAppsFlyerRsp.getConfigByPosition(SignUpRetainDialogConfig.DIALOG_POSITION_OTP, signUpActivityV.f26030A) : null;
            Drawable drawableV = r0.V(signUpStepOtcFragment.getContext(), configByPosition != null ? configByPosition.imageUrl : null);
            f fVar = I.f10809a;
            p0 p0Var = o.f11960a;
            s sVar = new s(signUpStepOtcFragment, configByPosition, drawableV, null);
            this.f11865a = 1;
            if (AbstractC0780y.s(p0Var, sVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }
}
