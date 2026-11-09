package La;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.QueryBankListRsp;
import com.transsnet.palmpay.core.ui.mvp.contract.BasePaymentContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f5593f;

    public p(r rVar) {
        this.f5593f = rVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f5593f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        List<BankInfo> list;
        IBaseView iBaseView;
        QueryBankListRsp queryBankListRsp = (QueryBankListRsp) obj;
        if (queryBankListRsp == null || (list = queryBankListRsp.data) == null || (iBaseView = this.f5593f.f27351a) == null) {
            return;
        }
        ((BasePaymentContract.IView) iBaseView).handleBankList(list);
    }
}
