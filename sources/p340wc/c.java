package p340wc;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.custom_view.dialog.y;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithdrawListFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f43391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReferEarnWithdrawListFragment f43392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Throwable th, Continuation continuation, ReferEarnWithdrawListFragment referEarnWithdrawListFragment) {
        super(2, continuation);
        this.f43391a = th;
        this.f43392b = referEarnWithdrawListFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f43391a, continuation, this.f43392b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        String strW = b.W(this.f43391a);
        ReferEarnWithdrawListFragment referEarnWithdrawListFragment = this.f43392b;
        referEarnWithdrawListFragment.showLoadingDialog(false);
        y yVar = new y(referEarnWithdrawListFragment.requireContext());
        yVar.f31323a = strW;
        yVar.h();
        return Unit.f38893a;
    }
}
