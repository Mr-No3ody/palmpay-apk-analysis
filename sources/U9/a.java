package U9;

import Ab.D;
import Pa.C0525w;
import Pa.H;
import Pa.a0;
import Pa.r0;
import com.transsnet.palmpay.contacts.contract.LocalContactsListContract$IPresenter;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.rsp.MobileContactListResp;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends j implements LocalContactsListContract$IPresenter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p161kf.e f9289d;

    @Override // com.transsnet.palmpay.contacts.contract.LocalContactsListContract$IPresenter
    public final void queryContactLike(String str, List list) {
        p161kf.e eVar = this.f9289d;
        if (eVar != null && !eVar.isDisposed()) {
            p161kf.e eVar2 = this.f9289d;
            eVar2.getClass();
            p001if.a.a(eVar2);
        }
        C1765q c1765qI = new C1755g(new p279s5.d(10, list, str), 0).k(p298tf.f.f42629b).i(p071ef.b.a());
        p161kf.e eVar3 = new p161kf.e(new C0525w(this, 9), p147jf.a.f38601e, p147jf.a.f38599c);
        c1765qI.subscribe(eVar3);
        this.f9289d = eVar3;
        addSubscription(eVar3);
    }

    @Override // com.transsnet.palmpay.contacts.contract.LocalContactsListContract$IPresenter
    public final void queryPhoneContact() {
        String strB = H.b(p367ya.a.d().i() + "_mobile_contacts");
        df.d.d(r0.H1(MobileContactListResp.class, strB), new C1755g(new p121i2.e(2), 0).f(new p121i2.d((byte) 0, 2)).c(new a0(strB, 0))).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new D(this, 26));
    }
}
