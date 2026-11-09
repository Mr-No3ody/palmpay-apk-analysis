package T8;

import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianExtra2Fragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddGuardianExtra2Fragment f9039a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AddGuardianExtra2Fragment addGuardianExtra2Fragment, Continuation continuation) {
        super(2, continuation);
        this.f9039a = addGuardianExtra2Fragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f9039a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        AddGuardianExtra2Fragment addGuardianExtra2Fragment = this.f9039a;
        addGuardianExtra2Fragment.showLoadingDialog(false);
        addGuardianExtra2Fragment.z();
        return Unit.f38893a;
    }
}
