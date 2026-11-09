package p255qd;

import V9.C0714c;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.ApplyVoucherReq;
import com.transsnet.palmpay.send_money.contract.CollectMoneyResultContract$IPresenter;
import p188md.b;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends j implements CollectMoneyResultContract$IPresenter {
    @Override // com.transsnet.palmpay.send_money.contract.CollectMoneyResultContract$IPresenter
    public final void applyVoucher(ApplyVoucherReq applyVoucherReq) {
        ((SendMoneyApiService) b.f39648a.f6830b).applyVoucher(applyVoucherReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(this, 17));
    }
}
