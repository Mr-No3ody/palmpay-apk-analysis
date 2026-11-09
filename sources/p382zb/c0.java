package p382zb;

import Z4.e;
import androidx.camera.core.impl.utils.n;
import com.transsnet.palmpay.credit.bean.resp.OcFinanceMenuData;
import com.transsnet.palmpay.credit.bean.resp.OcFinanceMenuResp;
import com.transsnet.palmpay.credit.bean.rsp.CLMainResp;
import com.transsnet.palmpay.credit.ui.fragment.OcMainFragment;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p368yb.B;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f44570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OcMainFragment f44571g;

    public /* synthetic */ c0(OcMainFragment ocMainFragment, int i7) {
        this.f44570f = i7;
        this.f44571g = ocMainFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f44570f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44571g.f(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44571g.f(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f44570f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f44571g.showLoadingDialog(false);
                n.u(message);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                n.u(message);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f44570f) {
            case 0:
                CLMainResp cLMainResp = (CLMainResp) obj;
                OcMainFragment ocMainFragment = this.f44571g;
                ocMainFragment.showLoadingDialog(false);
                if (cLMainResp == null || !cLMainResp.isSuccess() || cLMainResp.getData() == null) {
                    n.u(cLMainResp != null ? cLMainResp.getRespMsg() : null);
                } else {
                    ocMainFragment.t = cLMainResp.getData();
                    ocMainFragment.getContext();
                }
                break;
            default:
                OcFinanceMenuResp ocFinanceMenuResp = (OcFinanceMenuResp) obj;
                if (ocFinanceMenuResp == null || !ocFinanceMenuResp.isSuccess()) {
                    n.u(ocFinanceMenuResp != null ? ocFinanceMenuResp.getRespMsg() : null);
                    break;
                } else {
                    List<OcFinanceMenuData> data = ocFinanceMenuResp.getData();
                    if (data != null && !data.isEmpty()) {
                        OcMainFragment ocMainFragment2 = this.f44571g;
                        ArrayList arrayList = ocMainFragment2.f30470z0;
                        arrayList.clear();
                        List<OcFinanceMenuData> data2 = ocFinanceMenuResp.getData();
                        Intrinsics.e(data2);
                        arrayList.addAll(data2);
                        B b7 = ocMainFragment2.f30447A0;
                        if (b7 != null) {
                            b7.notifyDataSetChanged();
                        }
                        break;
                    }
                }
                break;
        }
    }
}
