package Fd;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import com.transsnet.palmpay.send_money.ui.view.SideBarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements SideBarView.OnLetterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayContactAllFragment f2691a;

    public m(TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment) {
        this.f2691a = transferToPalmPayContactAllFragment;
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterChanged(String letter, int i7) {
        RecyclerView.LayoutManager layoutManager;
        Intrinsics.checkNotNullParameter(letter, "letter");
        TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2691a;
        int iC = transferToPalmPayContactAllFragment.t().c(letter);
        if (iC >= 0) {
            RecyclerView recyclerViewV = transferToPalmPayContactAllFragment.v();
            if ((recyclerViewV != null ? recyclerViewV.getLayoutManager() : null) instanceof LinearLayoutManager) {
                RecyclerView recyclerViewV2 = transferToPalmPayContactAllFragment.v();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) (recyclerViewV2 != null ? recyclerViewV2.getLayoutManager() : null);
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(iC, 0);
                    return;
                }
                return;
            }
            RecyclerView recyclerViewV3 = transferToPalmPayContactAllFragment.v();
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
