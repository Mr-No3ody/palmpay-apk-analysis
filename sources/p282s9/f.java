package p282s9;

import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.betting.viewmodel.BettingDepositViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import x9.m;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BettingHomeActivity f42074b;

    public /* synthetic */ f(BettingHomeActivity bettingHomeActivity, int i7) {
        this.f42073a = i7;
        this.f42074b = bettingHomeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BettingDepositViewModel bettingDepositViewModel;
        int i7 = 1;
        BettingHomeActivity bettingHomeActivity = this.f42074b;
        switch (this.f42073a) {
            case 0:
                String str = bettingHomeActivity.f26672i;
                if (str != null && str.length() != 0) {
                    bettingHomeActivity.v(bettingHomeActivity.f26672i, bettingHomeActivity.f26673j);
                }
                break;
            case 1:
                String str2 = bettingHomeActivity.f26672i;
                if (str2 != null && str2.length() != 0) {
                    bettingHomeActivity.v(bettingHomeActivity.f26672i, bettingHomeActivity.f26673j);
                }
                break;
            case 2:
                KProperty[] kPropertyArr = BettingHomeActivity.f26660w0;
                BettingDepositViewModel bettingDepositViewModel2 = (BettingDepositViewModel) bettingHomeActivity.l();
                if (bettingDepositViewModel2 != null) {
                    bettingDepositViewModel2.f(new f(bettingHomeActivity, i7));
                }
                if (bettingHomeActivity.t != null && (bettingDepositViewModel = (BettingDepositViewModel) bettingHomeActivity.l()) != null) {
                    c cVar = new c(bettingHomeActivity, i7);
                    m mVar = new m(1, null);
                    l lVar = bettingDepositViewModel.f26770B;
                    lVar.f27356m = cVar;
                    Unit unit = Unit.f38893a;
                    p140j8.f.v(bettingDepositViewModel, mVar, lVar, 0L);
                }
                break;
            default:
                BettingHomeActivity.q(bettingHomeActivity);
                break;
        }
        return Unit.f38893a;
    }
}
