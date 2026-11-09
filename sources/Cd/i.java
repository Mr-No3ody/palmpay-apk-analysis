package Cd;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;
import com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MoneyTransferHistoryFragment f1368a;

    public i(MoneyTransferHistoryFragment moneyTransferHistoryFragment) {
        this.f1368a = moneyTransferHistoryFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i10) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i7, i10);
        MoneyTransferHistoryFragment moneyTransferHistoryFragment = this.f1368a;
        int i11 = moneyTransferHistoryFragment.f33676Q + i10;
        moneyTransferHistoryFragment.f33676Q = i11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        F6.d.h("smoothDistance", 3, sb2.toString());
        List list = moneyTransferHistoryFragment.w().f4985b;
        if (list == null || list.size() != 0) {
            moneyTransferHistoryFragment.C();
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                moneyTransferHistoryFragment.E((TransHistoryRsp.DataBean.ListBean) moneyTransferHistoryFragment.w().getItem(((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition()));
            }
        }
    }
}
