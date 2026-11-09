package p102ge;

import Wf.AbstractC0780y;
import Wf.V;
import com.transsnet.palmpay.core.ui.dialog.CoinRewardDialog;
import com.transsnet.palmpay.ui.activity.GetCoinRewardsActivity;

/* JADX INFO: renamed from: ge.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1742o implements CoinRewardDialog.ActionInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f37225a;

    public C1742o(String str, GetCoinRewardsActivity getCoinRewardsActivity) {
        this.f37225a = str;
    }

    @Override // com.transsnet.palmpay.core.ui.dialog.CoinRewardDialog.ActionInterface
    public final void action(int i7) {
        if ("COINRAIN-AUTOSAVE-ACTIVITY".equals(this.f37225a)) {
            GetCoinRewardsActivity.a aVar = GetCoinRewardsActivity.f34458e;
            AbstractC0780y.m(V.f10828a, null, null, new C1744q(2, null), 3);
        }
    }
}
