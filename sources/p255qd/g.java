package p255qd;

import V9.C0714c;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.QueryRecordReq;
import com.transsnet.palmpay.send_money.contract.MoneyTransferRecordContract$IPresenter;
import p188md.b;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends j implements MoneyTransferRecordContract$IPresenter {
    @Override // com.transsnet.palmpay.send_money.contract.MoneyTransferRecordContract$IPresenter
    public final void queryMoneyTransferRecordList(QueryRecordReq queryRecordReq) {
        ((SendMoneyApiService) b.f39648a.f6830b).queryTransferRecord(queryRecordReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(this, 18));
    }
}
