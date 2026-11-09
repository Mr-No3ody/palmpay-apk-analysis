package He;

import Bc.D;
import android.widget.TextView;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import com.transsnet.palmpay.ui.view.ModelPremiumScrollNotice;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f3902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelPremiumBenefits f3903b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Throwable th, Continuation continuation, ModelPremiumBenefits modelPremiumBenefits) {
        super(2, continuation);
        this.f3902a = th;
        this.f3903b = modelPremiumBenefits;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f3902a, continuation, this.f3903b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        TextView textView;
        TextView textView2;
        ModelPremiumScrollNotice modelPremiumScrollNotice;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        org.chromium.support_lib_boundary.util.b.W(this.f3902a);
        ModelPremiumBenefits modelPremiumBenefits = this.f3903b;
        D d2 = modelPremiumBenefits.f35306d;
        if (d2 != null && (modelPremiumScrollNotice = (ModelPremiumScrollNotice) d2.f614A) != null) {
            p220oa.h.s(modelPremiumScrollNotice, false);
        }
        D d10 = modelPremiumBenefits.f35306d;
        if (d10 != null && (textView2 = d10.f620f) != null) {
            p220oa.h.s(textView2, true);
        }
        D d11 = modelPremiumBenefits.f35306d;
        if (d11 != null && (textView = d11.f620f) != null) {
            textView.setText(modelPremiumBenefits.getContext().getString(p025ba.k.core_more));
        }
        return Unit.f38893a;
    }
}
