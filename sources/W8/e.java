package W8;

import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInInputMobileFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LogInInputMobileFragment f10579a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Continuation continuation, LogInInputMobileFragment logInInputMobileFragment) {
        super(2, continuation);
        this.f10579a = logInInputMobileFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(continuation, this.f10579a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        boolean zC;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        int i7 = LogInInputMobileFragment.f26194C;
        LogInInputMobileFragment logInInputMobileFragment = this.f10579a;
        LogInActivity logInActivityW = logInInputMobileFragment.w();
        if (logInActivityW != null) {
            zC = !logInActivityW.f25882L ? p059e1.a.C("keyConfirmPermissionDialog", false) : true;
        }
        logInInputMobileFragment.f26198o = zC;
        return Unit.f38893a;
    }
}
