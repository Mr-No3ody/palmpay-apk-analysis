package T8;

import com.transsnet.palmpay.account.ui.fragment.guardian.GuardianApproveBirthCertificateFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GuardianApproveBirthCertificateFragment f9062a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(GuardianApproveBirthCertificateFragment guardianApproveBirthCertificateFragment, Continuation continuation) {
        super(2, continuation);
        this.f9062a = guardianApproveBirthCertificateFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f9062a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        GuardianApproveBirthCertificateFragment guardianApproveBirthCertificateFragment = this.f9062a;
        guardianApproveBirthCertificateFragment.showLoadingDialog(false);
        guardianApproveBirthCertificateFragment.z();
        return Unit.f38893a;
    }
}
