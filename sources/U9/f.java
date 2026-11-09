package U9;

import Pa.H;
import Pa.a0;
import Pa.r0;
import android.graphics.Bitmap;
import com.transsnet.palmpay.contacts.api.ContactsApiService;
import com.transsnet.palmpay.contacts.bean.resp.MemberQRCode;
import com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IPresenter;
import com.transsnet.palmpay.core.base.j;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1765q;
import p045d3.k;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends j implements PersonalQRCodeContract$IPresenter {
    @Override // com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IPresenter
    public final void generateQrcodeImg(String str) {
        new C1755g(new k(str, 9), 0).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new e(this, 1));
    }

    @Override // com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IPresenter
    public final void getPersonalQRCodeInfo() {
        String strB = H.b(p367ya.a.d().i() + "_personal_qrcode");
        df.d.d(r0.H1(MemberQRCode.class, strB), ((ContactsApiService) S9.a.f8824a.f41079b).createMemberQRCode().c(new a0(strB, 0))).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new e(this, 0));
    }

    @Override // com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IPresenter
    public final void savePicture(Bitmap bitmap) {
        C1765q c1765qI = new C1755g(new org.greenrobot.eventbus.f(bitmap, 5), 0).k(p298tf.f.f42629b).i(p071ef.b.a());
        p161kf.e eVar = new p161kf.e(new p183m6.j(this, 7), p147jf.a.f38601e, p147jf.a.f38599c);
        c1765qI.subscribe(eVar);
        addSubscription(eVar);
    }
}
