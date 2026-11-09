package Fe;

import com.transsnet.palmpay.core.bean.UnlinkBankCardReq;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IPresenter;

/* JADX INFO: renamed from: Fe.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0254b extends com.transsnet.palmpay.core.base.j implements BankCardAndAccountContract$IPresenter {
    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IPresenter
    public final void deleteLinkBankAccount(String str) {
        ((AccountApiService) p324va.c.f43141a.f14623d).deleteLinkBankAccount(str).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0253a(this, 4));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IPresenter
    public final void deleteLinkBankCard(String str) {
        ((AccountApiService) p324va.c.f43141a.f14623d).deleteLinkBankCard(str).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0253a(this, 2));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IPresenter
    public final void queryLinkBankAccountList() {
        ((AccountApiService) p324va.c.f43141a.f14623d).queryLinkBankAccountList().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0253a(this, 1));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IPresenter
    public final void queryLinkBankCardList() {
        ((AccountApiService) p324va.c.f43141a.f14623d).queryLinkBankCardList().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0253a(this, 0));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.BankCardAndAccountContract$IPresenter
    public final void unlinkBankCard(UnlinkBankCardReq unlinkBankCardReq) {
        ((AccountApiService) p324va.c.f43141a.f14623d).unLinkBankCard(unlinkBankCardReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0253a(this, 3));
    }
}
