package p235pb;

import C0.G;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.credit.bean.req.QueryMemberDetailReq;
import com.transsnet.palmpay.credit.bean.req.QueryRecipientReq;
import com.transsnet.palmpay.credit.contract.ContactListContract$IPresenter;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.List;
import p001if.a;
import p071ef.b;
import p161kf.e;
import p221ob.c;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends j implements ContactListContract$IPresenter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f41284d;

    @Override // com.transsnet.palmpay.credit.contract.ContactListContract$IPresenter
    public final void deleteRecipient(String str) {
        c.f40268a.getInstance().getClass();
        c.a().removeRecipient(str).k(f.f42629b).i(b.a()).subscribe(new d(this, 1));
    }

    @Override // com.transsnet.palmpay.credit.contract.ContactListContract$IPresenter
    public final void queryMemberDetailByKeyword(String str) {
        G.h(c.f40268a).queryMemberDetailByKeyWords(new QueryMemberDetailReq(str)).k(f.f42629b).i(b.a()).subscribe(new c(this, str, 1));
    }

    @Override // com.transsnet.palmpay.credit.contract.ContactListContract$IPresenter
    public final void queryMemberDetailByPhone(String str) {
        G.h(c.f40268a).queryMemberDetailByPhone(new QueryMemberDetailReq(str)).k(f.f42629b).i(b.a()).subscribe(new c(this, str, 0));
    }

    @Override // com.transsnet.palmpay.credit.contract.ContactListContract$IPresenter
    public final void queryRecipientLike(String str, List list) {
        e eVar = this.f41284d;
        if (eVar != null && !eVar.isDisposed()) {
            e eVar2 = this.f41284d;
            eVar2.getClass();
            a.a(eVar2);
        }
        C1765q c1765qI = new C1755g(new f(list, str), 0).k(f.f42629b).i(b.a());
        e eVar3 = new e(new e(this), p147jf.a.f38601e, p147jf.a.f38599c);
        c1765qI.subscribe(eVar3);
        this.f41284d = eVar3;
        addSubscription(eVar3);
    }

    @Override // com.transsnet.palmpay.credit.contract.ContactListContract$IPresenter
    public final void queryRecipientList(int i7, int i10) {
        QueryRecipientReq queryRecipientReq = new QueryRecipientReq();
        queryRecipientReq.setNum(i10);
        queryRecipientReq.setRecipientType(i7);
        c.f40268a.getInstance().getClass();
        c.a().queryRecipients(queryRecipientReq).k(f.f42629b).i(b.a()).subscribe(new d(this, 0));
    }
}
