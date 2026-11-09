package p294tb;

import C0.G;
import Z4.e;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.n;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.rsp.CLMainResp;
import com.transsnet.palmpay.credit.bean.rsp.QueryLoanUserConfigBean;
import com.transsnet.palmpay.credit.bean.rsp.QueryLoanUserConfigResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentResultActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p220oa.h;
import p221ob.c;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CLRepaymentResultActivity f42484g;

    public /* synthetic */ k0(CLRepaymentResultActivity cLRepaymentResultActivity, int i7) {
        this.f42483f = i7;
        this.f42484g = cLRepaymentResultActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42483f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42484g.addSubscription(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42484g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42484g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        CLRepaymentResultActivity cLRepaymentResultActivity = this.f42484g;
        switch (this.f42483f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                cLRepaymentResultActivity.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                int i7 = CLRepaymentResultActivity.f29111q0;
                cLRepaymentResultActivity.p(2);
                break;
            case 1:
                cLRepaymentResultActivity.showLoadingDialog(false);
                if (!TextUtils.isEmpty(message)) {
                    h.x(cLRepaymentResultActivity, message);
                }
                break;
            default:
                cLRepaymentResultActivity.showLoadingDialog(false);
                if (!TextUtils.isEmpty(message)) {
                    h.x(cLRepaymentResultActivity, message);
                }
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CLRepaymentResultActivity cLRepaymentResultActivity = this.f42484g;
        switch (this.f42483f) {
            case 0:
                CLMainResp cLMainResp = (CLMainResp) obj;
                cLRepaymentResultActivity.showLoadingDialog(false);
                if (cLMainResp != null && cLMainResp.isSuccess() && cLMainResp.getData() != null) {
                    cLRepaymentResultActivity.f29118Q = cLMainResp.getData();
                }
                int i7 = CLRepaymentResultActivity.f29111q0;
                cLRepaymentResultActivity.p(1);
                break;
            case 1:
                QueryLoanUserConfigResp response = (QueryLoanUserConfigResp) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                cLRepaymentResultActivity.showLoadingDialog(false);
                QueryLoanUserConfigBean data = response.getData();
                if ((data != null ? data.getLanguageType() : null) == null) {
                    int i10 = CLRepaymentResultActivity.f29111q0;
                    cLRepaymentResultActivity.showLoadingDialog(true);
                    G.h(c.f40268a).querySysConfig("CREDIT_LANGUAGE", Boolean.FALSE).k(f.f42629b).i(b.a()).subscribe(new n0(cLRepaymentResultActivity));
                }
                break;
            default:
                CommonResult commonResult = (CommonResult) obj;
                cLRepaymentResultActivity.showLoadingDialog(false);
                n.u(commonResult != null ? commonResult.getRespMsg() : null);
                break;
        }
    }
}
