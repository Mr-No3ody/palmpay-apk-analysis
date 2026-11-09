package Fe;

import com.transsnet.palmpay.core.bean.LinkBankAccountResp;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.core.bean.req.SetDefaultPaymentBankCardReq;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import com.transsnet.palmpay.ui.mvp.contract.BankCardDetailContract;

/* JADX INFO: renamed from: Fe.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0258f extends com.transsnet.palmpay.core.base.j implements BankCardDetailContract.Presenter {
    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardDetailContract.Presenter
    public final void deleteLinkBankAccount(LinkBankAccountResp.LinkBankAccount linkBankAccount) {
        ((BankCardDetailContract.View) this.f27351a).showLoadingView(true);
        ((AccountApiService) p324va.c.f43141a.f14623d).deleteLinkBankAccount(linkBankAccount.getBankAccountNo()).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0256d(this));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardDetailContract.Presenter
    public final void deleteLinkBankCard(LinkBankCardResp.LinkBankCard linkBankCard) {
        ((BankCardDetailContract.View) this.f27351a).showLoadingView(true);
        ((AccountApiService) p324va.c.f43141a.f14623d).deleteLinkBankCard(linkBankCard.getAccountId()).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0255c(this));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardDetailContract.Presenter
    public final void setDefaultPaymentCard(String str, int i7) {
        ((BankCardDetailContract.View) this.f27351a).showLoadingView(true);
        ((AccountApiService) p324va.c.f43141a.f14623d).setDefaultPaymentBankCard(new SetDefaultPaymentBankCardReq(str, i7)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0257e(this));
    }
}
