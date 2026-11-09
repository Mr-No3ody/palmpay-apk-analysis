package Ce;

import android.text.TextUtils;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.google.android.material.navigation.NavigationBarView;
import com.transsnet.palmpay.core.bean.bill.TransHistoryItemBean;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;
import com.transsnet.palmpay.ui.fragment.TransactionHistoryFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0 implements OnItemClickListener, SwipeRefreshLayout.OnRefreshListener, OnLoadMoreListener, OnItemChildClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransactionHistoryFragment f1509a;

    public /* synthetic */ o0(TransactionHistoryFragment transactionHistoryFragment) {
        this.f1509a = transactionHistoryFragment;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j jVar, View view, int i7) {
        int i10 = TransactionHistoryFragment.f35248k0;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        this.f1509a.z();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        int i10 = TransactionHistoryFragment.f35248k0;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        TransactionHistoryFragment transactionHistoryFragment = this.f1509a;
        TransHistoryItemBean transHistoryItemBean = (TransHistoryItemBean) transactionHistoryFragment.v().getItem(i7);
        if (transHistoryItemBean.isHeader()) {
            return;
        }
        if (TextUtils.isEmpty(transHistoryItemBean.redirect)) {
            Ea.a.e(transHistoryItemBean.transType, transHistoryItemBean.orderNo, transHistoryItemBean.subTransTypeCode);
            return;
        }
        String str = transHistoryItemBean.redirect;
        if (str != null) {
            switch (str.hashCode()) {
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    if (str.equals("1")) {
                        TransHistoryRsp.DataBean.ListBean listBean = new TransHistoryRsp.DataBean.ListBean();
                        listBean.orderNo = transHistoryItemBean.orderNo;
                        listBean.transType = transHistoryItemBean.transType;
                        Long l5 = transHistoryItemBean.updateTime;
                        listBean.updateTime = l5 != null ? l5.longValue() : 0L;
                        Long l6 = transHistoryItemBean.amount;
                        listBean.amount = l6 != null ? l6.longValue() : 0L;
                        listBean.iconUrl = transHistoryItemBean.iconUrl;
                        listBean.title = transHistoryItemBean.title;
                        listBean.orderStatus = transHistoryItemBean.orderStatus;
                        ARouter.getInstance().build("/main/redirect_order_detail").withSerializable("extra_data", listBean).navigation();
                        break;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        Pa.i0.b0("/h5/transaction-router/home?transType=" + transHistoryItemBean.transType + "&orderId=" + transHistoryItemBean.orderNo);
                        break;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        com.palmpay.lib.apm.launchcounter.util.d.x(p002a.a.e(new Pair("orderNo", transHistoryItemBean.orderNo), new Pair("transType", transHistoryItemBean.transType)), "CommonDetail");
                        break;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        String customLinkAndroid = !TextUtils.isEmpty(transHistoryItemBean.customLinkH5) ? transHistoryItemBean.customLinkH5 : transHistoryItemBean.getCustomLinkAndroid();
                        if (!TextUtils.isEmpty(customLinkAndroid)) {
                            ActivityUtils.startActivity(Pa.F.a(transactionHistoryFragment.requireContext(), customLinkAndroid));
                        }
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnLoadMoreListener
    public void onLoadMore() {
        int i7 = TransactionHistoryFragment.f35248k0;
        this.f1509a.w(true);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        int i7 = TransactionHistoryFragment.f35248k0;
        this.f1509a.w(false);
    }
}
