package p282s9;

import Ef.a;
import Ff.h;
import Rd.C0593i;
import androidx.camera.core.impl.utils.executor.g;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.betting.ui.activity.BettingQuickBetWebActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BettingQuickBetWebActivity f42090a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(BettingQuickBetWebActivity bettingQuickBetWebActivity, Continuation continuation) {
        super(2, continuation);
        this.f42090a = bettingQuickBetWebActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f42090a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((n) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        ConstraintLayout constraintLayout;
        a aVar = a.f2423a;
        g.M(obj);
        String str = BettingQuickBetWebActivity.f26693j;
        C0593i c0593i = (C0593i) this.f42090a.f27334c;
        if (c0593i != null && (constraintLayout = c0593i.f8332b) != null) {
            p220oa.h.s(constraintLayout, false);
        }
        return Unit.f38893a;
    }
}
