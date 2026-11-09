package p271re;

import F5.b;
import O6.c;
import O6.d;
import com.transsnet.palmpay.ui.activity.qr.QrCodePayMoneyFragment;
import com.transsnet.palmpay.util.MediaContentObserver;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements MediaContentObserver.CallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ QrCodePayMoneyFragment f41796a;

    public h(QrCodePayMoneyFragment qrCodePayMoneyFragment) {
        this.f41796a = qrCodePayMoneyFragment;
    }

    @Override // com.transsnet.palmpay.util.MediaContentObserver.CallBack
    public final void screenShotStart() {
        QrCodePayMoneyFragment qrCodePayMoneyFragment = this.f41796a;
        if (qrCodePayMoneyFragment.isAdded() && qrCodePayMoneyFragment.getActivity() != null && qrCodePayMoneyFragment.f34896p0) {
            String string = qrCodePayMoneyFragment.getString(k.core_pay_money_qrcode_screen_shot_hint);
            if (qrCodePayMoneyFragment.f34885H == null) {
                c cVar = new c(qrCodePayMoneyFragment.getContext());
                cVar.e(k.core_title_attention);
                cVar.f6605k = true;
                cVar.f6598d = string;
                cVar.d(k.core_payment_confirm, new b(9));
                d dVarA = cVar.a();
                qrCodePayMoneyFragment.f34885H = dVarA;
                dVarA.setCanceledOnTouchOutside(false);
                qrCodePayMoneyFragment.f34885H.setCancelable(false);
            }
            if (qrCodePayMoneyFragment.f34885H.isShowing()) {
                return;
            }
            qrCodePayMoneyFragment.f34885H.show();
        }
    }
}
