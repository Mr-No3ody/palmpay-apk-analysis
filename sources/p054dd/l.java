package p054dd;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashRecordActivity;
import com.transsnet.palmpay.r2c.viewmodel.Recharge2CashResultViewModel;
import com.transsnet.palmpay.teller.bean.HistoryOrderReq;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p085fd.e;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements OnLoadMoreListener, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Recharge2CashRecordActivity f35890a;

    @Override // com.chad.library.adapter.base.listener.OnLoadMoreListener
    public void onLoadMore() {
        Recharge2CashResultViewModel recharge2CashResultViewModel;
        com.transsnet.palmpay.core.base.l lVar;
        int i7 = Recharge2CashRecordActivity.f33127g;
        Recharge2CashRecordActivity recharge2CashRecordActivity = this.f35890a;
        Recharge2CashResultViewModel recharge2CashResultViewModel2 = (Recharge2CashResultViewModel) recharge2CashRecordActivity.l();
        if (Intrinsics.c((recharge2CashResultViewModel2 == null || (lVar = recharge2CashResultViewModel2.f33139f) == null) ? null : (q) lVar.d(), o.f27359a) || (recharge2CashResultViewModel = (Recharge2CashResultViewModel) recharge2CashRecordActivity.l()) == null) {
            return;
        }
        int i10 = recharge2CashRecordActivity.f33128d + 1;
        recharge2CashRecordActivity.f33128d = i10;
        HistoryOrderReq req = new HistoryOrderReq(i10, recharge2CashRecordActivity.f33129e);
        Intrinsics.checkNotNullParameter(req, "req");
        e eVar = new e(req, null);
        Boolean bool = Boolean.FALSE;
        com.transsnet.palmpay.core.base.l lVar2 = recharge2CashResultViewModel.f33139f;
        lVar2.f27356m = bool;
        Unit unit = Unit.f38893a;
        f.v(recharge2CashResultViewModel, eVar, lVar2, 0L);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        int i7 = Recharge2CashRecordActivity.f33127g;
        this.f35890a.p();
    }
}
