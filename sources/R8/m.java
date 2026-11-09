package R8;

import android.content.Context;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyFingerPrintFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerifyFingerPrintFragment f7955a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(VerifyFingerPrintFragment verifyFingerPrintFragment, Continuation continuation) {
        super(2, continuation);
        this.f7955a = verifyFingerPrintFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f7955a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        Context context = this.f7955a.getContext();
        if (context == null) {
            return null;
        }
        return new p145jd.a(context);
    }
}
