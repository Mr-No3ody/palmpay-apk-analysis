package R8;

import com.transsnet.palmpay.account.ui.fragment.auth.VerifyFingerPrintFragment;
import com.transsnet.palmpay.account.ui.viewmodel.SafeVerifyViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import p097g9.W;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerifyFingerPrintFragment f7943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f7944b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(VerifyFingerPrintFragment verifyFingerPrintFragment, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.f7943a = verifyFingerPrintFragment;
        this.f7944b = bArr;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f7943a, this.f7944b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        String str = new String(this.f7944b, Charsets.UTF_8);
        int i7 = VerifyFingerPrintFragment.f26112C;
        SafeVerifyViewModel safeVerifyViewModel = (SafeVerifyViewModel) this.f7943a.f27333i;
        if (safeVerifyViewModel != null) {
            W w3 = new W(str, null);
            com.transsnet.palmpay.core.base.l lVar = safeVerifyViewModel.f26440f;
            lVar.f27356m = str;
            Unit unit = Unit.f38893a;
            p140j8.f.v(safeVerifyViewModel, w3, lVar, 0L);
        }
        return Unit.f38893a;
    }
}
