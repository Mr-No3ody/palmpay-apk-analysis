package p384zd;

import Jd.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.SelectBankForTransferViaUssdDialog;
import com.transsnet.palmpay.send_money.ui.view.SideBarView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p173ld.m;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements SideBarView.OnLetterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectBankForTransferViaUssdDialog f44683a;

    public f(SelectBankForTransferViaUssdDialog selectBankForTransferViaUssdDialog) {
        this.f44683a = selectBankForTransferViaUssdDialog;
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterChanged(String letter, int i7) {
        Integer numValueOf;
        RecyclerView.LayoutManager layoutManager;
        int i10;
        Intrinsics.checkNotNullParameter(letter, "letter");
        SelectBankForTransferViaUssdDialog.a aVar = SelectBankForTransferViaUssdDialog.f33621Y;
        SelectBankForTransferViaUssdDialog selectBankForTransferViaUssdDialog = this.f44683a;
        m mVarJ = selectBankForTransferViaUssdDialog.j();
        if (mVarJ != null) {
            if (!"#".equals(letter)) {
                List<Object> data = mVarJ.getData();
                i10 = 0;
                while (true) {
                    if (i10 >= data.size()) {
                        i10 = -1;
                        break;
                    } else if (c.c(((BankInfo) data.get(i10)).bankName).equals(letter)) {
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            numValueOf = Integer.valueOf(i10);
        } else {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : 0) >= 0) {
            RecyclerView recyclerView = selectBankForTransferViaUssdDialog.f33624L;
            if ((recyclerView != null ? recyclerView.getLayoutManager() : null) instanceof LinearLayoutManager) {
                RecyclerView recyclerView2 = selectBankForTransferViaUssdDialog.f33624L;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) (recyclerView2 != null ? recyclerView2.getLayoutManager() : null);
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(numValueOf != null ? numValueOf.intValue() : 0, 0);
                    return;
                }
                return;
            }
            RecyclerView recyclerView3 = selectBankForTransferViaUssdDialog.f33624L;
            if (recyclerView3 == null || (layoutManager = recyclerView3.getLayoutManager()) == null) {
                return;
            }
            layoutManager.scrollToPosition(numValueOf != null ? numValueOf.intValue() : 0);
        }
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterGone() {
    }
}
