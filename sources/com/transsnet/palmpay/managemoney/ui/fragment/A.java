package com.transsnet.palmpay.managemoney.ui.fragment;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxTransactionHistoryViewModel;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashBoxTransactionHistoryFragment f32340a;

    public A(CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment) {
        this.f32340a = cashBoxTransactionHistoryFragment;
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
        CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = this.f32340a;
        cashBoxTransactionHistoryFragment.f32432H += i10;
        List list = cashBoxTransactionHistoryFragment.f32440v.f6313c;
        if (list == null || list.size() != 0) {
            if (cashBoxTransactionHistoryFragment.f32432H > SizeUtils.dp2px(20.0f)) {
                LinearLayout linearLayout = cashBoxTransactionHistoryFragment.f32430B;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            } else {
                LinearLayout linearLayout2 = cashBoxTransactionHistoryFragment.f32430B;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                List list2 = cashBoxTransactionHistoryFragment.f32440v.f6313c;
                QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = list2 != null ? (QueryCashBoxTransactionListResp.CashBoxTransaction) list2.get(iFindFirstVisibleItemPosition) : null;
                if (cashBoxTransaction != null) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(cashBoxTransaction.getGmtCreated());
                    int i11 = calendar.get(2);
                    int i12 = i11 + 1;
                    int i13 = calendar.get(1);
                    cashBoxTransactionHistoryFragment.x(i13, i12);
                    CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel = (CashBoxTransactionHistoryViewModel) cashBoxTransactionHistoryFragment.f27333i;
                    if (cashBoxTransactionHistoryViewModel != null) {
                        cashBoxTransactionHistoryViewModel.h(CashBoxTransactionHistoryFragment.t(i13, i12), CashBoxTransactionHistoryFragment.t(i13, i11 + 2));
                    }
                }
            }
        }
    }
}
