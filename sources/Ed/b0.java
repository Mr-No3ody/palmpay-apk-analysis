package Ed;

import Kd.T1;
import Pa.n0;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomePalmPayContactsFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayHomeViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b0 implements OnItemClickListener, OnItemChildClickListener, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToBankHomePalmPayContactsFragment f2360a;

    public /* synthetic */ b0(TransferToBankHomePalmPayContactsFragment transferToBankHomePalmPayContactsFragment) {
        this.f2360a = transferToBankHomePalmPayContactsFragment;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        TransferToBankHomePalmPayContactsFragment transferToBankHomePalmPayContactsFragment = this.f2360a;
        RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) transferToBankHomePalmPayContactsFragment.t().getItem(i7);
        if (view.getId() == p159kd.e.btnSetup) {
            TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) transferToBankHomePalmPayContactsFragment.f27333i;
            if (transferToPalmPayHomeViewModel != null) {
                p140j8.f.s(transferToPalmPayHomeViewModel, new T1(recipientBeanV2.getBusinessType(), recipientBeanV2.getRelationId(), null), new com.transsnet.palmpay.core.base.l(), (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
            ARouter.getInstance().build("/sm/transfer_to_palmpay_contact").withString("core_order_source_type", transferToBankHomePalmPayContactsFragment.t).withString("MEMBER_ID", recipientBeanV2.getMemberId()).navigation();
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        TransferToBankHomePalmPayContactsFragment transferToBankHomePalmPayContactsFragment = this.f2360a;
        RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) transferToBankHomePalmPayContactsFragment.t().getItem(i7);
        n0.g().k((ClickEvent) C0.G.f("Transfer_ToBank_ContactZone_Click", "element_name", "PalmPayContacts"));
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) transferToBankHomePalmPayContactsFragment.f27333i;
        if (transferToPalmPayHomeViewModel != null) {
            transferToPalmPayHomeViewModel.d(recipientBeanV2.getBusinessType(), recipientBeanV2);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        this.f2360a.v();
    }
}
