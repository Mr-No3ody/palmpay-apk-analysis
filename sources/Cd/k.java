package Cd;

import com.palmpay.lib.scanplus.view.ScanView;
import com.transsnet.palmpay.core.callback.Argument0Callback;
import com.transsnet.palmpay.core.callback.Argument1Callback;
import com.transsnet.palmpay.send_money.ui.fragment.QrcodeScanFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Argument0Callback, Argument1Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QrcodeScanFragment f1371b;

    public /* synthetic */ k(QrcodeScanFragment qrcodeScanFragment, int i7) {
        this.f1370a = i7;
        this.f1371b = qrcodeScanFragment;
    }

    @Override // com.transsnet.palmpay.core.callback.Argument1Callback
    public void invoke(Object obj) {
        p038ca.a aVar = (p038ca.a) obj;
        switch (this.f1370a) {
            case 1:
                QrcodeScanFragment qrcodeScanFragment = this.f1371b;
                qrcodeScanFragment.x(qrcodeScanFragment.f33692p == 0, aVar);
                qrcodeScanFragment.f33692p++;
                break;
            default:
                this.f1371b.x(false, aVar);
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.callback.Argument0Callback
    public void invoke() {
        QrcodeScanFragment qrcodeScanFragment = this.f1371b;
        if (p377z5.l.o(qrcodeScanFragment.f27319c, "android.permission.CAMERA")) {
            if (qrcodeScanFragment.f33684C) {
                qrcodeScanFragment.f33691o.setCamera(true);
                qrcodeScanFragment.f33684C = true;
            }
            ScanView scanView = qrcodeScanFragment.f33691o;
            if (scanView != null) {
                scanView.f(false);
                return;
            }
            return;
        }
        ScanView scanView2 = qrcodeScanFragment.f33691o;
        if (scanView2 != null) {
            scanView2.f(true);
        }
    }
}
