package U9;

import E.N;
import Pa.H;
import Pa.r0;
import com.transsnet.palmpay.contacts.contract.MobileContactListContract$IPresenter;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.rsp.MobileContactListResp;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1760l;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.List;
import p137j3.u;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends j implements MobileContactListContract$IPresenter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f9294e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p161kf.e f9295d;

    @Override // com.transsnet.palmpay.contacts.contract.MobileContactListContract$IPresenter
    public final void queryContactLike(String str, List list) {
        p161kf.e eVar = this.f9295d;
        if (eVar != null && !eVar.isDisposed()) {
            p161kf.e eVar2 = this.f9295d;
            eVar2.getClass();
            p001if.a.a(eVar2);
        }
        C1765q c1765qI = new C1755g(new c(list, str), 0).k(p298tf.f.f42629b).i(p071ef.b.a());
        p161kf.e eVar3 = new p161kf.e(new Sd.b(this, 7), p147jf.a.f38601e, p147jf.a.f38599c);
        c1765qI.subscribe(eVar3);
        this.f9295d = eVar3;
        addSubscription(eVar3);
    }

    @Override // com.transsnet.palmpay.contacts.contract.MobileContactListContract$IPresenter
    public final void queryMobileAndPalmPayContact() {
        String strB = H.b(p367ya.a.d().i() + "_mobile_palmpay_contacts");
        df.d.d(r0.H1(MobileContactListResp.class, strB), new C1760l(new C1755g(new org.sufficientlysecure.htmltextview.f(2), 0).f(new p166l2.a(2)), new u(2), 2).c(new C2085k0(strB, 6))).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new b(this, 1));
    }

    @Override // com.transsnet.palmpay.contacts.contract.MobileContactListContract$IPresenter
    public final void queryPhoneContact(boolean z3) {
        new C1755g(new N(z3, 1), 0).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new b(this, 0));
    }
}
