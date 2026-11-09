package Da;

import android.app.Activity;
import com.transsnet.palmpay.core.ui.activity.PPRNActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f1766a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Activity activity, Continuation continuation) {
        super(2, continuation);
        this.f1766a = activity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f1766a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PPRNActivity pPRNActivity = (PPRNActivity) this.f1766a;
        pPRNActivity.g(pPRNActivity.f27678b);
        return Unit.f38893a;
    }
}
