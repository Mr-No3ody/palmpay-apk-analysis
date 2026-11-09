package La;

import com.transsnet.palmpay.core.bean.req.AddBankAccSendOtpReq;
import com.transsnet.palmpay.core.bean.req.AddBankAccountReq;
import com.transsnet.palmpay.core.bean.req.BindBankAccountReq;
import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.core.bean.req.CheckCardBindNumReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends r implements AddBankAccountContract.IPresenter {
    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IPresenter
    public final void addBankAccount(AddBankAccountReq addBankAccountReq) {
        ((AddBankAccountContract.IView) this.f27351a).showLoadingView(true);
        ((PayApiService) p324va.c.f43141a.f14621b).addBankAccount(addBankAccountReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0437c(this));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IPresenter
    public final void addBankAccountSendOtp(AddBankAccSendOtpReq addBankAccSendOtpReq) {
        ((AddBankAccountContract.IView) this.f27351a).showLoadingView(true);
        ((PayApiService) p324va.c.f43141a.f14621b).addBankAccSendOtp(addBankAccSendOtpReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0438d(this));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IPresenter
    public final void addTzBankAccount(AddBankAccountReq addBankAccountReq) {
        ((AddBankAccountContract.IView) this.f27351a).showLoadingView(true);
        ((PayApiService) p324va.c.f43141a.f14621b).addBankAccount(addBankAccountReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0440f(this));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IPresenter
    public final void bindBankAccount(BindBankAccountReq bindBankAccountReq) {
        ((AddBankAccountContract.IView) this.f27351a).showLoadingView(true);
        ((PayApiService) p324va.c.f43141a.f14621b).bindBankAccount(bindBankAccountReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0436b(this));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IPresenter
    public final void checkCardBindNum(CheckCardBindNumReq checkCardBindNumReq) {
        ((AddBankAccountContract.IView) this.f27351a).showLoadingView(true);
        ((AccountApiService) p324va.c.f43141a.f14623d).checkCardBindNum(checkCardBindNumReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0435a(this));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IPresenter
    public final void checkInputBankAccountInfo(CheckBankCardInfoReq checkBankCardInfoReq) {
        ((AddBankAccountContract.IView) this.f27351a).showLoadingView(true);
        ((AccountApiService) p324va.c.f43141a.f14623d).checkInputBankInfo(checkBankCardInfoReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new g(this, checkBankCardInfoReq));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract.IPresenter
    public final void queryPaymentMethod() {
        ((AccountApiService) p324va.c.f43141a.f14623d).queryPaymentMethod().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0439e(this));
    }
}
