package Fe;

import com.transsnet.palmpay.core.bean.AccountFlowBean;
import com.transsnet.palmpay.core.bean.req.AccountFlowReq;
import com.transsnet.palmpay.ui.mvp.contract.PalmPayStatementContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class N extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AccountFlowReq f2740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q f2741g;

    public N(Q q10, AccountFlowReq accountFlowReq) {
        this.f2741g = q10;
        this.f2740f = accountFlowReq;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f2741g.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showShort(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        AccountFlowBean accountFlowBean = (AccountFlowBean) obj;
        if (!accountFlowBean.isSuccess()) {
            ToastUtils.showShort(accountFlowBean.getRespMsg());
            return;
        }
        int total = accountFlowBean.getData().getTotal();
        AccountFlowReq accountFlowReq = this.f2740f;
        int pageSize = ((accountFlowReq.getPageSize() + total) - 1) / accountFlowReq.getPageSize();
        Q q10 = this.f2741g;
        ((PalmPayStatementContract.View) q10.f27351a).setTotalPage(pageSize);
        if (accountFlowReq.getPageNum() == 1) {
            q10.f2745d.clear();
        }
        q10.f2745d.addAll(accountFlowBean.getData().getList());
        ((PalmPayStatementContract.View) q10.f27351a).showBillData(q10.f2745d);
        ((PalmPayStatementContract.View) q10.f27351a).stopLoadMore();
        if (accountFlowReq.getPageNum() != 1 || accountFlowBean.getData() == null || accountFlowBean.getData().getExtData() == null) {
            return;
        }
        ((PalmPayStatementContract.View) q10.f27351a).updateTotalAmount(accountFlowBean.getData().getExtData().getInComeAmount(), accountFlowBean.getData().getExtData().getPayOutAmount());
    }
}
