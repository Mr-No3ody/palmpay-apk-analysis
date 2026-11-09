package Ed;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountBeneficiaryFragment;
import com.transsnet.palmpay.send_money.ui.view.SideBarView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ed.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0227g implements SideBarView.OnLetterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BankAccountBeneficiaryFragment f2371a;

    public C0227g(BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment) {
        this.f2371a = bankAccountBeneficiaryFragment;
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterChanged(String letter, int i7) {
        int i10;
        RecyclerView.LayoutManager layoutManager;
        Intrinsics.checkNotNullParameter(letter, "letter");
        BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment = this.f2371a;
        p173ld.x xVarU = bankAccountBeneficiaryFragment.u();
        xVarU.getClass();
        Intrinsics.checkNotNullParameter(letter, "letter");
        if (!"#".equals(letter)) {
            List<Object> data = xVarU.getData();
            int size = data.size();
            i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (Jd.c.c(((RecipientListResp.RecipientBean) data.get(i10)).getRecipientNickname()).equals(letter)) {
                    break;
                } else {
                    i10++;
                }
            }
        } else {
            i10 = 0;
        }
        if (i10 >= 0) {
            RecyclerView recyclerViewV = bankAccountBeneficiaryFragment.v();
            if ((recyclerViewV != null ? recyclerViewV.getLayoutManager() : null) instanceof LinearLayoutManager) {
                RecyclerView recyclerViewV2 = bankAccountBeneficiaryFragment.v();
                RecyclerView.LayoutManager layoutManager2 = recyclerViewV2 != null ? recyclerViewV2.getLayoutManager() : null;
                Intrinsics.f(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager2).scrollToPositionWithOffset(i10, 0);
                return;
            }
            RecyclerView recyclerViewV3 = bankAccountBeneficiaryFragment.v();
            if (recyclerViewV3 == null || (layoutManager = recyclerViewV3.getLayoutManager()) == null) {
                return;
            }
            layoutManager.scrollToPosition(i10);
        }
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterGone() {
    }
}
