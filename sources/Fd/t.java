package Fd;

import Pa.n0;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFavoriteFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayHomeViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements OnItemClickListener, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayHomeFavoriteFragment f2707a;

    public /* synthetic */ t(TransferToPalmPayHomeFavoriteFragment transferToPalmPayHomeFavoriteFragment) {
        this.f2707a = transferToPalmPayHomeFavoriteFragment;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        TransferToPalmPayHomeFavoriteFragment transferToPalmPayHomeFavoriteFragment = this.f2707a;
        RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) transferToPalmPayHomeFavoriteFragment.t().getItem(i7);
        if (recipientBeanV2 != null) {
            n0.g().k((ClickEvent) C0.G.f("Transfer_ToPalmPay_ContactZone_Click", "element_name", "Favorites"));
            TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) transferToPalmPayHomeFavoriteFragment.f27333i;
            if (transferToPalmPayHomeViewModel != null) {
                transferToPalmPayHomeViewModel.d(recipientBeanV2.getBusinessType(), recipientBeanV2);
            }
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        this.f2707a.v();
    }
}
