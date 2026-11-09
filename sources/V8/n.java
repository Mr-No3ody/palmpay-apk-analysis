package V8;

import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.p0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep1Fragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationStep1Fragment f10148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SignUpRetainDialogConfig f10149c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(IdentityVerificationStep1Fragment identityVerificationStep1Fragment, SignUpRetainDialogConfig signUpRetainDialogConfig, Continuation continuation) {
        super(2, continuation);
        this.f10148b = identityVerificationStep1Fragment;
        this.f10149c = signUpRetainDialogConfig;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f10148b, this.f10149c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f10147a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            IdentityVerificationStep1Fragment identityVerificationStep1Fragment = this.f10148b;
            Context context = identityVerificationStep1Fragment.getContext();
            SignUpRetainDialogConfig signUpRetainDialogConfig = this.f10149c;
            Drawable drawableV = r0.V(context, signUpRetainDialogConfig != null ? signUpRetainDialogConfig.imageUrl : null);
            p042cg.f fVar = I.f10809a;
            p0 p0Var = p015ag.o.f11960a;
            m mVar = new m(identityVerificationStep1Fragment, signUpRetainDialogConfig, drawableV, null);
            this.f10147a = 1;
            if (AbstractC0780y.s(p0Var, mVar, this) == aVar) {
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
