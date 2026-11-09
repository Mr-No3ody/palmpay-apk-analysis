package T8;

import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianExtraFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddGuardianExtraFragment f9046a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AddGuardianExtraFragment addGuardianExtraFragment, Continuation continuation) {
        super(2, continuation);
        this.f9046a = addGuardianExtraFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f9046a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        AddGuardianExtraFragment addGuardianExtraFragment = this.f9046a;
        addGuardianExtraFragment.showLoadingDialog(false);
        addGuardianExtraFragment.z();
        return Unit.f38893a;
    }
}
