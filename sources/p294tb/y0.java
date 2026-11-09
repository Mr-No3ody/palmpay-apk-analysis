package p294tb;

import N8.q0;
import Z4.e;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.transsnet.palmpay.credit.bean.rsp.CLMainResp;
import com.transsnet.palmpay.credit.bean.rsp.OpenCashData;
import com.transsnet.palmpay.credit.bean.rsp.OpenCashProductResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLUpgradeActivity;
import com.transsnet.palmpay.credit.ui.fragment.CLOpenFragment;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CLUpgradeActivity f42530g;

    public /* synthetic */ y0(CLUpgradeActivity cLUpgradeActivity, int i7) {
        this.f42529f = i7;
        this.f42530g = cLUpgradeActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42529f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42530g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42530g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42529f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f42530g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f42529f) {
            case 0:
                OpenCashProductResp openCashProductResp = (OpenCashProductResp) obj;
                CLUpgradeActivity cLUpgradeActivity = this.f42530g;
                if (openCashProductResp == null || !openCashProductResp.isSuccess() || openCashProductResp.getData() == null) {
                    CLUpgradeActivity.v(cLUpgradeActivity);
                } else {
                    OpenCashData data = openCashProductResp.getData();
                    if (!(data != null ? Intrinsics.c(data.getOpenInstallmentCash(), Boolean.TRUE) : false)) {
                        CLUpgradeActivity.v(cLUpgradeActivity);
                    } else {
                        q0.v("/main/home", "tab", "finance");
                    }
                }
                break;
            default:
                CLMainResp cLMainResp = (CLMainResp) obj;
                CLUpgradeActivity cLUpgradeActivity2 = this.f42530g;
                cLUpgradeActivity2.showLoadingDialog(false);
                if (cLMainResp == null || !cLMainResp.isSuccess() || cLMainResp.getData() == null) {
                    ToastUtils.showShort(cLMainResp != null ? cLMainResp.getRespMsg() : null, new Object[0]);
                } else {
                    cLUpgradeActivity2.f29186M = cLMainResp.getData();
                    CLOpenFragment cLOpenFragment = new CLOpenFragment();
                    cLOpenFragment.f30325z0 = cLUpgradeActivity2.f29186M;
                    Z supportFragmentManager = cLUpgradeActivity2.getSupportFragmentManager();
                    C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
                    c1161aE.e(Ya.e.cl_upgrade_root_fl, cLOpenFragment, null);
                    c1161aE.h(true);
                }
                break;
        }
    }
}
