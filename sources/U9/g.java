package U9;

import com.transsnet.palmpay.contacts.contract.RequestContactListContract$IPresenter;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1765q;
import org.sufficientlysecure.htmltextview.h;
import p045d3.k;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends j implements RequestContactListContract$IPresenter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f9298d;

    @Override // com.transsnet.palmpay.contacts.contract.RequestContactListContract$IPresenter
    public final void deleteContact(RequestContact requestContact) {
        C1765q c1765qI = new C1755g(new p1.d(this, 13, requestContact, false), 0).k(p298tf.f.f42629b).i(p071ef.b.a());
        p161kf.e eVar = new p161kf.e(new org.sufficientlysecure.htmltextview.g(2), p147jf.a.f38601e, p147jf.a.f38599c);
        c1765qI.subscribe(eVar);
        addSubscription(eVar);
    }

    @Override // com.transsnet.palmpay.contacts.contract.RequestContactListContract$IPresenter
    public final void queryRequestContactsList(String str) {
        C1765q c1765qI = new C1755g(new p279s5.d(this, 11, str, false), 0).k(p298tf.f.f42629b).i(p071ef.b.a());
        p161kf.e eVar = new p161kf.e(new p1.c(this, 9), p147jf.a.f38601e, p147jf.a.f38599c);
        c1765qI.subscribe(eVar);
        addSubscription(eVar);
    }

    @Override // com.transsnet.palmpay.contacts.contract.RequestContactListContract$IPresenter
    public final void updateContact(RequestContact requestContact) {
        C1765q c1765qI = new C1755g(new p279s5.d(this, 12, requestContact, false), 0).k(p298tf.f.f42629b).i(p071ef.b.a());
        p161kf.e eVar = new p161kf.e(new h(2), p147jf.a.f38601e, p147jf.a.f38599c);
        c1765qI.subscribe(eVar);
        addSubscription(eVar);
    }
}
