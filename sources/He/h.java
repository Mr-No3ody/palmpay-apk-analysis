package He;

import Bc.D;
import android.widget.TextView;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import com.wang.avi.AVLoadingIndicatorView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f3886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelPremiumBenefits f3887b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Throwable th, Continuation continuation, ModelPremiumBenefits modelPremiumBenefits) {
        super(2, continuation);
        this.f3886a = th;
        this.f3887b = modelPremiumBenefits;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f3886a, continuation, this.f3887b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        AVLoadingIndicatorView aVLoadingIndicatorView;
        TextView textView;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        org.chromium.support_lib_boundary.util.b.W(this.f3886a);
        ModelPremiumBenefits modelPremiumBenefits = this.f3887b;
        D d2 = modelPremiumBenefits.f35306d;
        if (d2 != null && (textView = d2.f619e) != null) {
            p220oa.h.s(textView, true);
        }
        D d10 = modelPremiumBenefits.f35306d;
        if (d10 != null && (aVLoadingIndicatorView = (AVLoadingIndicatorView) d10.f626v) != null) {
            p220oa.h.s(aVLoadingIndicatorView, false);
        }
        return Unit.f38893a;
    }
}
