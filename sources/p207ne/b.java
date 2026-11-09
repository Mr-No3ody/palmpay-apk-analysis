package p207ne;

import M1.j;
import P8.a;
import Pa.i0;
import Pe.V;
import android.text.TextUtils;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.core.bean.bill.TransHistoryItemBean;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;
import com.transsnet.palmpay.ui.activity.minor.MinorAccountDetailActivity;
import com.transsnet.palmpay.viewmodule.MinorViewModel;
import kotlin.jvm.internal.Intrinsics;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements SwipeRefreshLayout.OnRefreshListener, OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MinorAccountDetailActivity f39937a;

    public /* synthetic */ b(MinorAccountDetailActivity minorAccountDetailActivity) {
        this.f39937a = minorAccountDetailActivity;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        int i10 = MinorAccountDetailActivity.f34759g;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        a aVar = this.f39937a.f34763f;
        if (aVar == null) {
            Intrinsics.n("mCashBoxTransactionAdapter");
            throw null;
        }
        TransHistoryItemBean transHistoryItemBean = (TransHistoryItemBean) aVar.getItem(i7);
        if (transHistoryItemBean == null || TextUtils.isEmpty(transHistoryItemBean.redirect)) {
            return;
        }
        String str = transHistoryItemBean.redirect;
        if (!Intrinsics.c(str, "1")) {
            if (Intrinsics.c(str, "2")) {
                i0.b0("/h5/transaction-router/home?transType=" + transHistoryItemBean.transType + "&orderId=" + transHistoryItemBean.orderNo);
                return;
            }
            return;
        }
        TransHistoryRsp.DataBean.ListBean listBean = new TransHistoryRsp.DataBean.ListBean();
        listBean.orderNo = transHistoryItemBean.orderNo;
        listBean.transType = transHistoryItemBean.transType;
        Long l5 = transHistoryItemBean.updateTime;
        listBean.updateTime = l5 != null ? l5.longValue() : 0L;
        Long l6 = transHistoryItemBean.amount;
        listBean.amount = l6 != null ? l6.longValue() : 0L;
        listBean.iconUrl = transHistoryItemBean.iconUrl;
        listBean.orderStatus = transHistoryItemBean.orderStatus;
        listBean.title = transHistoryItemBean.title;
        ARouter.getInstance().build("/main/redirect_order_detail").withSerializable("extra_data", listBean).navigation();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        int i7 = MinorAccountDetailActivity.f34759g;
        MinorAccountDetailActivity minorAccountDetailActivity = this.f39937a;
        MinorViewModel minorViewModel = (MinorViewModel) minorAccountDetailActivity.l();
        String accountId = minorAccountDetailActivity.o();
        minorViewModel.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        f.s(minorViewModel, new V(accountId, null), minorViewModel.f35378e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0 ? true : true, (28 & 16) == 0);
        minorAccountDetailActivity.m();
    }
}
