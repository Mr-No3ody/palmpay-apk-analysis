package p282s9;

import Ef.a;
import Ff.h;
import Rd.C0593i;
import android.widget.TextView;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.betting.ui.activity.BettingQuickBetWebActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ long f42091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BettingQuickBetWebActivity f42092b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(BettingQuickBetWebActivity bettingQuickBetWebActivity, Continuation continuation) {
        super(2, continuation);
        this.f42092b = bettingQuickBetWebActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        o oVar = new o(this.f42092b, continuation);
        oVar.f42091a = ((Number) obj).longValue();
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        TextView textView;
        a aVar = a.f2423a;
        g.M(obj);
        long j6 = this.f42091a;
        String str = BettingQuickBetWebActivity.f26693j;
        C0593i c0593i = (C0593i) this.f42092b.f27334c;
        if (c0593i != null && (textView = c0593i.f8337g) != null) {
            textView.setText((j6 / ((long) 1000)) + "s");
        }
        return Unit.f38893a;
    }
}
