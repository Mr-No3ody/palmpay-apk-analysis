package Fd;

import Kd.T1;
import Pa.n0;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeRecentlyFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayHomeViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class F implements OnItemClickListener, OnItemChildClickListener, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayHomeRecentlyFragment f2657a;

    public /* synthetic */ F(TransferToPalmPayHomeRecentlyFragment transferToPalmPayHomeRecentlyFragment) {
        this.f2657a = transferToPalmPayHomeRecentlyFragment;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j jVar, View view, int i7) {
        int i10 = TransferToPalmPayHomeRecentlyFragment.f33823A;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        TransferToPalmPayHomeRecentlyFragment transferToPalmPayHomeRecentlyFragment = this.f2657a;
        RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) transferToPalmPayHomeRecentlyFragment.t().getItem(i7);
        if (recipientBeanV2 == null || view.getId() != p159kd.e.btnSetup) {
            return;
        }
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) transferToPalmPayHomeRecentlyFragment.f27333i;
        if (transferToPalmPayHomeViewModel != null) {
            p140j8.f.s(transferToPalmPayHomeViewModel, new T1(recipientBeanV2.getBusinessType(), recipientBeanV2.getRelationId(), null), new com.transsnet.palmpay.core.base.l(), (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        ARouter.getInstance().build("/sm/transfer_to_palmpay_contact").withString("core_order_source_type", transferToPalmPayHomeRecentlyFragment.t).withString("MEMBER_ID", recipientBeanV2.getMemberId()).withBoolean("existRecipient", true).navigation();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        int i10 = TransferToPalmPayHomeRecentlyFragment.f33823A;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        TransferToPalmPayHomeRecentlyFragment transferToPalmPayHomeRecentlyFragment = this.f2657a;
        RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) transferToPalmPayHomeRecentlyFragment.t().getItem(i7);
        if (recipientBeanV2 != null) {
            n0 n0VarG = n0.g();
            ClickEvent clickEvent = new ClickEvent("Transfer_ToPalmPay_ContactZone_Click");
            Integer num = transferToPalmPayHomeRecentlyFragment.f33827v;
            n0VarG.k(clickEvent.add("element_name", (num != null && num.intValue() == 2) ? "PalmPayContacts" : "Recent"));
            TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) transferToPalmPayHomeRecentlyFragment.f27333i;
            if (transferToPalmPayHomeViewModel != null) {
                transferToPalmPayHomeViewModel.d(recipientBeanV2.getBusinessType(), recipientBeanV2);
            }
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        int i7 = TransferToPalmPayHomeRecentlyFragment.f33823A;
        this.f2657a.v();
    }
}
