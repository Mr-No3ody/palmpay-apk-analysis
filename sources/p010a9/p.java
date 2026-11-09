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
import com.transsnet.palmpay.account.bean.SignUpReq;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.bean.rsp.UploadAppsFlyerRsp;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepInputPinV2Fragment;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p015ag.o;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpStepInputPinV2Fragment f11858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SignUpStepInputPinV2Fragment signUpStepInputPinV2Fragment, Continuation continuation) {
        super(2, continuation);
        this.f11858b = signUpStepInputPinV2Fragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f11858b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        SignUpReq signUpReqM;
        SignUpReq signUpReqM2;
        a aVar = a.f2423a;
        int i7 = this.f11857a;
        if (i7 == 0) {
            g.M(obj);
            n0 n0VarG = n0.g();
            ViewEvent viewEvent = new ViewEvent("SignUpSetPINRetentionPopup");
            SignUpStepInputPinV2Fragment.a aVar2 = SignUpStepInputPinV2Fragment.f26273A;
            SignUpStepInputPinV2Fragment signUpStepInputPinV2Fragment = this.f11858b;
            SignUpActivity signUpActivityV = signUpStepInputPinV2Fragment.v();
            ViewEvent viewEventAdd = viewEvent.add("mobileNo", (signUpActivityV == null || (signUpReqM2 = signUpActivityV.m()) == null) ? null : signUpReqM2.mobileNo);
            SignUpActivity signUpActivityV2 = signUpStepInputPinV2Fragment.v();
            n0VarG.u(viewEventAdd.add("mtnAuthCode", (signUpActivityV2 == null || (signUpReqM = signUpActivityV2.m()) == null) ? null : signUpReqM.mtnAuthCode));
            SignUpActivity signUpActivityV3 = signUpStepInputPinV2Fragment.v();
            SignUpRetainDialogConfig configByPosition = signUpActivityV3 != null ? UploadAppsFlyerRsp.getConfigByPosition(SignUpRetainDialogConfig.DIALOG_POSITION_PIN, signUpActivityV3.f26030A) : null;
            Drawable drawableV = r0.V(signUpStepInputPinV2Fragment.getContext(), configByPosition != null ? configByPosition.imageUrl : null);
            f fVar = I.f10809a;
            p0 p0Var = o.f11960a;
            o oVar = new o(signUpStepInputPinV2Fragment, configByPosition, drawableV, null);
            this.f11857a = 1;
            if (AbstractC0780y.s(p0Var, oVar, this) == aVar) {
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
