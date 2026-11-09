package p235pb;

import E.N;
import V9.C0714c;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.credit.contract.MobileContactListContract$IPresenter;
import io.reactivex.internal.operators.observable.C1755g;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends j implements MobileContactListContract$IPresenter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f41285d = 0;

    @Override // com.transsnet.palmpay.credit.contract.MobileContactListContract$IPresenter
    public final void queryPhoneContact(boolean z3) {
        new C1755g(new N(z3, 8), 0).k(f.f42629b).i(b.a()).subscribe(new C0714c(this, 16));
    }
}
