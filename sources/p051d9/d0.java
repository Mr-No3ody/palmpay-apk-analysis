package p051d9;

import C0.G;
import F6.d;
import J3.a;
import Pa.H;
import Pa.a0;
import android.content.Context;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.transsnet.palmpay.account.bean.CheckInviteCodeReq;
import com.transsnet.palmpay.account.bean.SignUpReq;
import com.transsnet.palmpay.account.bean.req.NameCheckReq;
import com.transsnet.palmpay.account.bean.req.SignUpSuccessCouponReq;
import com.transsnet.palmpay.account.bean.rsp.CountryRegionList;
import com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import df.i;
import io.reactivex.internal.operators.observable.C1755g;
import java.util.ArrayList;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends j implements SignUpContract.Presenter {
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.Presenter
    public final boolean checkInvitationCode(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        CheckInviteCodeReq checkInviteCodeReq = new CheckInviteCodeReq();
        checkInviteCodeReq.countryCode = BaseApplication.getCountryLocale();
        checkInviteCodeReq.invitQrCode = str;
        a.D(this, (SignUpContract.View) this.f27351a, new T(checkInviteCodeReq, null), new Q(this, 0), new C1624v(11), false, true);
        return false;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.Presenter
    public final void checkMobileNumber(String str, String str2) {
        d.h("SignUpPresenter", 3, com.horcrux.svg.d0.q("checkMobileNumber authCode: ", !TextUtils.isEmpty(str2)));
        SignUpContract.View view = (SignUpContract.View) this.f27351a;
        if (view != null) {
            view.showLoadingView(true);
        }
        a.D(this, this.f27351a, new U(str, str2, null), new Q(this, 4), new Q(this, 5), false, false);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.Presenter
    public final void checkName(NameCheckReq nameCheckReq) {
        a.E(this, (SignUpContract.View) this.f27351a, new V(nameCheckReq, null), new Q(this, 2), null, true, true, 8);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.Presenter
    public final void getRegularRule(boolean z3) {
        a.D(this, (SignUpContract.View) this.f27351a, new W(1, null), new S(this, z3, 1), new C1624v(10), false, true);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.Presenter
    public final void preSignUp(SignUpReq signUpReq) {
        a.E(this, this.f27351a, new X(signUpReq, null), new Q(this, 1), null, false, true, 8);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.Presenter
    public final void queryAppConfig() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("switchSignUpPermissionDialog");
        a.E(this, this.f27351a, new Y(arrayList, null), new Q(this, 7), null, false, false, 8);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.Presenter
    public final void queryRegionList(boolean z3) {
        SignUpContract.View view = (SignUpContract.View) this.f27351a;
        if (view != null) {
            view.showLoadingView(true);
        }
        String countryLocale = BaseApplication.getCountryLocale();
        String strB = H.b(G.o("getCountryRegionListV2", countryLocale));
        df.d dVarC = G8.a.t().getCountryRegionList(countryLocale).c(new a0(strB, 0));
        C1755g c1755g = new C1755g(new p1.d(11, strB, new TypeToken<CommonListResultV2<CountryRegionList>>() { // from class: com.transsnet.palmpay.account.ui.mvp.presenter.SignUpPresenter$queryRegionList$fromDisk$1
        }.getType()), 0);
        i iVar = f.f42629b;
        df.d.d(c1755g.k(iVar), dVarC).k(iVar).i(b.a()).subscribe(new Z(this, z3));
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.Presenter
    public final void queryRegisterCoupon(SignUpSuccessCouponReq signUpSuccessCouponReq) {
        a.E(this, this.f27351a, new a0(signUpSuccessCouponReq, null), new Q(this, 3), null, false, true, 8);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.Presenter
    public final void updateUser(boolean z3) {
        a.D(this, this.f27351a, new b0(1, null), new S(this, z3, 0), new C1624v(12), false, false);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract.Presenter
    public final void verifyMtnNumber(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            d.h("SignUpPresenter", 3, "verifyMtnNumber something wrong");
        } else {
            d.h("SignUpPresenter", 3, "verifyMtnNumber");
            a.D(this, this.f27351a, new c0(context, this, str, str2, null), new Q(this, 6), new C1624v(13), false, false);
        }
    }
}
