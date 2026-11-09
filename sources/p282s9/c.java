package p282s9;

import androidx.activity.z;
import com.transsnet.palmpay.betting.bean.BettingQuickILotHomeBean;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.betting.ui.view.ModelQuickBettingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BettingHomeActivity f42068b;

    public /* synthetic */ c(BettingHomeActivity bettingHomeActivity, int i7) {
        this.f42067a = i7;
        this.f42068b = bettingHomeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BettingHomeActivity bettingHomeActivity = this.f42068b;
        switch (this.f42067a) {
            case 0:
                z addCallback = (z) obj;
                KProperty[] kPropertyArr = BettingHomeActivity.f26660w0;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                bettingHomeActivity.goBackToHome();
                break;
            default:
                BettingQuickILotHomeBean data = (BettingQuickILotHomeBean) obj;
                KProperty[] kPropertyArr2 = BettingHomeActivity.f26660w0;
                Intrinsics.checkNotNullParameter(data, "data");
                ModelQuickBettingView modelQuickBettingView = bettingHomeActivity.t;
                if (modelQuickBettingView != null) {
                    modelQuickBettingView.i(data);
                }
                break;
        }
        return Unit.f38893a;
    }
}
