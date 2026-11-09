package T8;

import Bc.B;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.ui.fragment.guardian.GuardianApproveBirthCertificateFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GuardianApproveBirthCertificateFragment f9064a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(GuardianApproveBirthCertificateFragment guardianApproveBirthCertificateFragment, Continuation continuation) {
        super(2, continuation);
        this.f9064a = guardianApproveBirthCertificateFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.f9064a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        PpButton ppButton;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        B b7 = this.f9064a.f26147p;
        if (b7 != null && (ppButton = (PpButton) b7.f597i) != null) {
            ppButton.setEnabled(true);
        }
        return Unit.f38893a;
    }
}
