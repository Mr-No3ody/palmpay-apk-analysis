package Fe;

import android.text.TextUtils;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.AccountFlowBean;
import com.transsnet.palmpay.core.bean.req.AccountFlowReq;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import com.transsnet.palmpay.ui.mvp.contract.PalmPayStatementContract;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends com.transsnet.palmpay.core.base.j implements PalmPayStatementContract.Presenter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f2745d;

    @Override // com.transsnet.palmpay.core.base.j
    /* JADX INFO: renamed from: a */
    public final void attachView(IBaseView iBaseView) {
        this.f27351a = (PalmPayStatementContract.View) iBaseView;
        this.f2745d = new ArrayList();
    }

    @Override // com.transsnet.palmpay.core.base.j, com.transsnet.palmpay.core.base.IBasePresenter
    public final void attachView(PalmPayStatementContract.View view) {
        this.f27351a = view;
        this.f2745d = new ArrayList();
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PalmPayStatementContract.Presenter
    public final void loadBillData(int i7, int i10, String str, int i11, int i12, String str2) {
        AccountFlowReq accountFlowReq = new AccountFlowReq();
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(i7, i10 - 1, 1);
        accountFlowReq.setBeginTime(calendar.getTimeInMillis());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.set(i7, i10, 1);
        accountFlowReq.setEndTime(calendar2.getTimeInMillis());
        accountFlowReq.setPageNum(i11);
        accountFlowReq.setPageSize(i12);
        accountFlowReq.setAccountId(str2);
        if (i11 == 1) {
            accountFlowReq.setTotalFlag(1);
        } else {
            accountFlowReq.setTotalFlag(0);
        }
        String strB = Pa.H.b(accountFlowReq);
        df.d dVarC = ((AccountApiService) p324va.c.f43141a.f14623d).queryBalanceAccFlow(accountFlowReq).c(new Pa.a0(strB, 0));
        if (accountFlowReq.getPageNum() != 1) {
            strB = "";
        }
        df.d.d(Pa.r0.H1(AccountFlowBean.class, strB), dVarC).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new N(this, accountFlowReq));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PalmPayStatementContract.Presenter
    public final void queryBalanceAccount() {
        ((AccountApiService) p324va.c.f43141a.f14623d).queryBalanceAccount().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new P(this));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PalmPayStatementContract.Presenter
    public final void queryOrderNoByPayId(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((AccountApiService) p324va.c.f43141a.f14623d).queryOrderNoByPayId(str).i(p071ef.b.a()).k(p298tf.f.f42629b).subscribe(new O(this, str));
    }
}
