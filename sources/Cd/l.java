package Cd;

import android.view.View;
import com.transsnet.palmpay.send_money.ui.fragment.QrcodeScanFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QrcodeScanFragment f1373b;

    public /* synthetic */ l(QrcodeScanFragment qrcodeScanFragment, int i7) {
        this.f1372a = i7;
        this.f1373b = qrcodeScanFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        QrcodeScanFragment qrcodeScanFragment = this.f1373b;
        switch (this.f1372a) {
            case 0:
                int id2 = view.getId();
                if (id2 == p159kd.e.merchant_id_item) {
                    com.palmpay.lib.apm.launchcounter.util.d.F("/credit_score/bind_merchant");
                    if (qrcodeScanFragment.getActivity() != null) {
                        qrcodeScanFragment.getActivity().finish();
                    }
                } else if (id2 == p159kd.e.qrcard_number_item) {
                    p206nd.a aVar = p206nd.b.f39930c;
                    com.palmpay.lib.apm.launchcounter.util.d.D(5, "/request/input_mobile", "extra_type");
                    if (qrcodeScanFragment.getActivity() != null) {
                        qrcodeScanFragment.getActivity().finish();
                    }
                } else if (id2 == p159kd.e.qrcard_code_item) {
                    com.palmpay.lib.apm.launchcounter.util.d.F("/app/main_qrcode_activity");
                    if (qrcodeScanFragment.getActivity() != null) {
                        qrcodeScanFragment.getActivity().finish();
                    }
                }
                break;
            case 1:
                if (qrcodeScanFragment.f33685H) {
                    qrcodeScanFragment.f33691o.d();
                    qrcodeScanFragment.f33683B.getRightImageView2().setImageResource(com.transsnet.palmpay.custom_view.r.cv_close_light_icon);
                } else {
                    qrcodeScanFragment.f33691o.d();
                    qrcodeScanFragment.f33683B.getRightImageView2().setImageResource(com.transsnet.palmpay.custom_view.r.cv_open_light_icon);
                }
                qrcodeScanFragment.f33685H = !qrcodeScanFragment.f33685H;
                break;
            case 2:
                qrcodeScanFragment.getActivity().finish();
                break;
            case 3:
                qrcodeScanFragment.getActivity().finish();
                break;
            default:
                qrcodeScanFragment.getClass();
                qrcodeScanFragment.f33688Q.f("android.permission.CAMERA", new k(qrcodeScanFragment, 0), new k(qrcodeScanFragment, 1), new k(qrcodeScanFragment, 2));
                break;
        }
    }
}
