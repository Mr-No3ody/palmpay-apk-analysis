package p270rd;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.send_money.ui.activity.SelectBankActivity;
import com.transsnet.palmpay.send_money.ui.view.SideBarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rd.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1977u implements SideBarView.OnLetterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectBankActivity f41774a;

    public C1977u(SelectBankActivity selectBankActivity) {
        this.f41774a = selectBankActivity;
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterChanged(String letter, int i7) {
        Intrinsics.checkNotNullParameter(letter, "letter");
        int i10 = SelectBankActivity.f33187A;
        SelectBankActivity selectBankActivity = this.f41774a;
        int iC = selectBankActivity.o().c(letter);
        if (iC >= 0) {
            if (selectBankActivity.n().getLayoutManager() instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) selectBankActivity.n().getLayoutManager();
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(iC, 0);
                    return;
                }
                return;
            }
            RecyclerView.LayoutManager layoutManager = selectBankActivity.n().getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(iC);
            }
        }
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterGone() {
    }
}
