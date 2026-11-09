package R8;

import Wf.AbstractC0780y;
import Wf.I;
import Wf.p0;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyFingerPrintFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public KeyPermanentlyInvalidatedException f7951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VerifyFingerPrintFragment f7953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(VerifyFingerPrintFragment verifyFingerPrintFragment, Continuation continuation) {
        super(2, continuation);
        this.f7953c = verifyFingerPrintFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f7953c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7952b;
        VerifyFingerPrintFragment verifyFingerPrintFragment = this.f7953c;
        boolean z3 = true;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            try {
                p145jd.a.d("check_auth_alias", true);
            } catch (Exception e10) {
                e = e10;
                if (e instanceof KeyPermanentlyInvalidatedException) {
                    p042cg.f fVar = I.f10809a;
                    p0 p0Var = p015ag.o.f11960a;
                    j jVar = new j(verifyFingerPrintFragment, null);
                    this.f7951a = (KeyPermanentlyInvalidatedException) e;
                    this.f7952b = 1;
                    if (AbstractC0780y.s(p0Var, jVar, this) == aVar) {
                        return aVar;
                    }
                    exc = e;
                    e = exc;
                }
                F6.d.c(verifyFingerPrintFragment.f27317a, "startAuthentication: ", e);
                z3 = false;
            }
            return Boolean.valueOf(z3);
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        exc = this.f7951a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        e = exc;
        F6.d.c(verifyFingerPrintFragment.f27317a, "startAuthentication: ", e);
        z3 = false;
        return Boolean.valueOf(z3);
    }
}
