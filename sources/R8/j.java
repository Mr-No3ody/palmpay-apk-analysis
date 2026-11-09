package R8;

import android.content.Context;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyFingerPrintFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerifyFingerPrintFragment f7950a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(VerifyFingerPrintFragment verifyFingerPrintFragment, Continuation continuation) {
        super(2, continuation);
        this.f7950a = verifyFingerPrintFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f7950a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        VerifyFingerPrintFragment verifyFingerPrintFragment = this.f7950a;
        Context context = verifyFingerPrintFragment.getContext();
        if (context == null) {
            return null;
        }
        int i7 = F8.h.ac_fingerprint_verifying_unavailable;
        int i10 = p025ba.k.core_confirm;
        return io.fastkv.n.O(context, 0, new Integer(i7), null, null, null, null, "Your Fingerprint information has been changed recently. To ensure your account security, please use PIN to reactive", new Integer(i10), null, new e(verifyFingerPrintFragment, 2), null, null, null, null, true, 0, 8305277);
    }
}
