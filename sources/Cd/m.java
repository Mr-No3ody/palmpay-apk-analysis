package Cd;

import android.view.View;
import com.transsnet.palmpay.send_money.ui.fragment.QrcodeScanFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QrcodeScanFragment f1375b;

    public /* synthetic */ m(QrcodeScanFragment qrcodeScanFragment, int i7) {
        this.f1374a = i7;
        this.f1375b = qrcodeScanFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1374a) {
            case 0:
                this.f1375b.f27319c.finish();
                break;
            default:
                this.f1375b.getActivity().finish();
                break;
        }
    }
}
