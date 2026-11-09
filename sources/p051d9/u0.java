package p051d9;

import G8.a;
import com.transsnet.palmpay.account.bean.req.ChangeUserInfoReq;
import com.transsnet.palmpay.account.bean.req.ModifyMemberInfoReq;
import com.transsnet.palmpay.account.bean.req.VerifyRealNameReq;
import com.transsnet.palmpay.account.ui.mvp.contract.VerifyRealNameContract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.CommonResult;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends j implements VerifyRealNameContract.Presenter {
    public static void b(u0 u0Var, CommonResult commonResult) {
        BaseApplication.get().getUserDataSource().a().k(f.f42629b).i(b.a()).subscribe(new r0(u0Var, commonResult));
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyRealNameContract.Presenter
    public final void addMiddleName(String str) {
        ((VerifyRealNameContract.View) this.f27351a).showLoadingView(true);
        a.t().modifyMiddleName(str).k(f.f42629b).i(b.a()).subscribe(new t0(this));
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyRealNameContract.Presenter
    public final void changeName(ChangeUserInfoReq changeUserInfoReq) {
        ((VerifyRealNameContract.View) this.f27351a).showLoadingView(true);
        a.t().modifyUserName(changeUserInfoReq).k(f.f42629b).i(b.a()).subscribe(new s0(this));
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyRealNameContract.Presenter
    public final void getRegularRule(boolean z3) {
        ((VerifyRealNameContract.View) this.f27351a).showLoadingView(true);
        a.t().getRegularRule(0).k(f.f42629b).i(b.a()).subscribe(new o0(this, z3));
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyRealNameContract.Presenter
    public final void verifyMobileNumberRealName(ModifyMemberInfoReq modifyMemberInfoReq) {
        ((VerifyRealNameContract.View) this.f27351a).showLoadingView(true);
        a.t().verifyMobileNumberRealName(modifyMemberInfoReq).k(f.f42629b).i(b.a()).subscribe(new q0(this));
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyRealNameContract.Presenter
    public final void verifyName(VerifyRealNameReq verifyRealNameReq) {
        ((VerifyRealNameContract.View) this.f27351a).showLoadingView(true);
        a.t().verifyRealName(verifyRealNameReq).k(f.f42629b).i(b.a()).subscribe(new p0(this));
    }
}
