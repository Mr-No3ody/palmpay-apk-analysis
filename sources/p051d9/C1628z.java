package p051d9;

import C0.G;
import Fe.C0259g;
import J3.a;
import La.D;
import Pa.H;
import Pa.a0;
import com.google.gson.reflect.TypeToken;
import com.transsnet.palmpay.account.bean.ApplyForTier3Req;
import com.transsnet.palmpay.account.bean.rsp.CountryRegionList;
import com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.managemoney.ui.view.c;
import df.d;
import df.i;
import io.reactivex.internal.operators.observable.C1755g;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p298tf.f;

/* JADX INFO: renamed from: d9.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1628z extends j implements PalmPayLevelUpTier3Contract.Presenter {
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract.Presenter
    public final void getIdIdentityList(boolean z3) {
        a.B(this, (PalmPayLevelUpTier3Contract.View) this.f27351a, new c(2), new D(this, z3, 2), new com.facebook.react.packagerconnection.a(29), false, true);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract.Presenter
    public final void queryAddressFromBill(String str) {
        a.D(this, (PalmPayLevelUpTier3Contract.View) this.f27351a, new C1626x(str, null), new C1625w(this, 0), new C1624v(1), false, true);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract.Presenter
    public final void queryLatestBillOrder(String orderNo) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        a.B(this, (PalmPayLevelUpTier3Contract.View) this.f27351a, new C0259g(orderNo, 4), new C1625w(this, 1), new com.facebook.react.packagerconnection.a(28), false, false);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract.Presenter
    public final void queryRegionList(boolean z3) {
        PalmPayLevelUpTier3Contract.View view = (PalmPayLevelUpTier3Contract.View) this.f27351a;
        if (view != null) {
            view.showLoadingView(true);
        }
        String countryLocale = BaseApplication.getCountryLocale();
        String strB = H.b(G.o("getCountryRegionListV2", countryLocale));
        d dVarC = G8.a.t().getCountryRegionList(countryLocale).c(new a0(strB, 0));
        C1755g c1755g = new C1755g(new p1.d(11, strB, new TypeToken<CommonListResultV2<CountryRegionList>>() { // from class: com.transsnet.palmpay.account.ui.mvp.presenter.PalmPayLevelUpTier3Presenter$queryRegionList$fromDisk$1
        }.getType()), 0);
        i iVar = f.f42629b;
        d.d(c1755g.k(iVar), dVarC).k(iVar).i(b.a()).subscribe(new C1627y(this, z3));
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract.Presenter
    public final void submitApplication(ApplyForTier3Req req) {
        Intrinsics.checkNotNullParameter(req, "req");
        a.B(this, (PalmPayLevelUpTier3Contract.View) this.f27351a, new X6.c(req, 27), new C1605b(3, this, req), new C1624v(0), false, true);
    }
}
