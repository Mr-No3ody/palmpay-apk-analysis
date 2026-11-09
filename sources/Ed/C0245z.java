package Ed;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import com.transsnet.palmpay.send_money.ui.view.SideBarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ed.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0245z implements SideBarView.OnLetterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BankAccountPalmPayContactFragment f2417a;

    public C0245z(BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment) {
        this.f2417a = bankAccountPalmPayContactFragment;
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterChanged(String letter, int i7) {
        RecyclerView.LayoutManager layoutManager;
        Intrinsics.checkNotNullParameter(letter, "letter");
        BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment = this.f2417a;
        int iC = bankAccountPalmPayContactFragment.t().c(letter);
        if (iC >= 0) {
            RecyclerView recyclerViewV = bankAccountPalmPayContactFragment.v();
            if ((recyclerViewV != null ? recyclerViewV.getLayoutManager() : null) instanceof LinearLayoutManager) {
                RecyclerView recyclerViewV2 = bankAccountPalmPayContactFragment.v();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) (recyclerViewV2 != null ? recyclerViewV2.getLayoutManager() : null);
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(iC, 0);
                    return;
                }
                return;
            }
            RecyclerView recyclerViewV3 = bankAccountPalmPayContactFragment.v();
            if (recyclerViewV3 == null || (layoutManager = recyclerViewV3.getLayoutManager()) == null) {
                return;
            }
            layoutManager.scrollToPosition(iC);
        }
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterGone() {
    }
}
