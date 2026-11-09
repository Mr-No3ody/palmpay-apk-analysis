package p294tb;

import Z4.e;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.resp.OcSignStatusResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLLastProtocolActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p221ob.c;
import p298tf.f;

/* JADX INFO: renamed from: tb.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2056s extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CLLastProtocolActivity f42507g;

    public /* synthetic */ C2056s(CLLastProtocolActivity cLLastProtocolActivity, int i7) {
        this.f42506f = i7;
        this.f42507g = cLLastProtocolActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42506f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42507g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42507g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42506f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                CLLastProtocolActivity cLLastProtocolActivity = this.f42507g;
                cLLastProtocolActivity.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                cLLastProtocolActivity.finish();
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                CLLastProtocolActivity cLLastProtocolActivity2 = this.f42507g;
                cLLastProtocolActivity2.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                CLLastProtocolActivity.y(cLLastProtocolActivity2);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        int i7 = 1;
        CLLastProtocolActivity cLLastProtocolActivity = this.f42507g;
        switch (this.f42506f) {
            case 0:
                OcSignStatusResp ocSignStatusResp = (OcSignStatusResp) obj;
                cLLastProtocolActivity.showLoadingDialog(false);
                if (ocSignStatusResp == null || !ocSignStatusResp.isSuccess() || ocSignStatusResp.getData() == null) {
                    ToastUtils.showShort(ocSignStatusResp != null ? ocSignStatusResp.getRespMsg() : null, new Object[0]);
                    cLLastProtocolActivity.finish();
                } else {
                    int i10 = CLLastProtocolActivity.f28939Y;
                    cLLastProtocolActivity.showLoadingDialog(true);
                    c.f40268a.getInstance().getClass();
                    c.a().uploadCashSign().k(f.f42629b).i(b.a()).subscribe(new C2056s(cLLastProtocolActivity, i7));
                }
                break;
            default:
                CommonBeanResult response = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                cLLastProtocolActivity.showLoadingDialog(false);
                CLLastProtocolActivity.y(cLLastProtocolActivity);
                break;
        }
    }
}
