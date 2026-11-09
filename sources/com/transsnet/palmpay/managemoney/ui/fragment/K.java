package com.transsnet.palmpay.managemoney.ui.fragment;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.FundTransactionHistoryViewModel;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FundTransactionHistoryFragment f32479a;

    public K(FundTransactionHistoryFragment fundTransactionHistoryFragment) {
        this.f32479a = fundTransactionHistoryFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i10) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i7, i10);
        FundTransactionHistoryFragment fundTransactionHistoryFragment = this.f32479a;
        fundTransactionHistoryFragment.f32462H += i10;
        List list = fundTransactionHistoryFragment.f32471v.f6331b;
        if (list == null || list.size() != 0) {
            if (fundTransactionHistoryFragment.f32462H > SizeUtils.dp2px(20.0f)) {
                LinearLayout linearLayout = fundTransactionHistoryFragment.f32460B;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            } else {
                LinearLayout linearLayout2 = fundTransactionHistoryFragment.f32460B;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                List list2 = fundTransactionHistoryFragment.f32471v.f6331b;
                QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = list2 != null ? (QueryCashBoxTransactionListResp.CashBoxTransaction) list2.get(iFindFirstVisibleItemPosition) : null;
                if (cashBoxTransaction != null) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(cashBoxTransaction.getGmtCreated());
                    int i11 = calendar.get(2);
                    int i12 = i11 + 1;
                    int i13 = calendar.get(1);
                    fundTransactionHistoryFragment.y(i13, i12);
                    FundTransactionHistoryViewModel fundTransactionHistoryViewModel = (FundTransactionHistoryViewModel) fundTransactionHistoryFragment.f27333i;
                    if (fundTransactionHistoryViewModel != null) {
                        fundTransactionHistoryViewModel.h(FundTransactionHistoryFragment.t(i13, i12), FundTransactionHistoryFragment.t(i13, i11 + 2));
                    }
                }
            }
        }
    }
}
