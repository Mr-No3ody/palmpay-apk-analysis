package p270rd;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.send_money.bean.QueryRecordReq;
import com.transsnet.palmpay.send_money.ui.activity.MoneyTransferRecordActivity;
import p255qd.g;

/* JADX INFO: renamed from: rd.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1965h implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MoneyTransferRecordActivity f41748a;

    public C1965h(MoneyTransferRecordActivity moneyTransferRecordActivity) {
        this.f41748a = moneyTransferRecordActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        MoneyTransferRecordActivity moneyTransferRecordActivity = this.f41748a;
        if (moneyTransferRecordActivity.f33175e) {
            return;
        }
        moneyTransferRecordActivity.f33172b.a();
        ((g) moneyTransferRecordActivity.f27350a).queryMoneyTransferRecordList(new QueryRecordReq(moneyTransferRecordActivity.f33174d + 1, 10));
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
    }
}
