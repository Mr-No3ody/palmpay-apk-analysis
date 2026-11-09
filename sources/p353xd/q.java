package p353xd;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.send_money.ui.activity.tobank.SelectBankForToBankActivity;
import com.transsnet.palmpay.send_money.ui.view.SideBarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements SideBarView.OnLetterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectBankForToBankActivity f43895a;

    public q(SelectBankForToBankActivity selectBankForToBankActivity) {
        this.f43895a = selectBankForToBankActivity;
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterChanged(String letter, int i7) {
        Intrinsics.checkNotNullParameter(letter, "letter");
        int i10 = SelectBankForToBankActivity.f33506B;
        SelectBankForToBankActivity selectBankForToBankActivity = this.f43895a;
        int iC = selectBankForToBankActivity.q().c(letter);
        if (iC >= 0) {
            if (selectBankForToBankActivity.p().getLayoutManager() instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) selectBankForToBankActivity.p().getLayoutManager();
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(iC, 0);
                    return;
                }
                return;
            }
            RecyclerView.LayoutManager layoutManager = selectBankForToBankActivity.p().getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(iC);
            }
        }
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterGone() {
    }
}
