package p310ub;

import Z4.e;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ub.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2080i extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OcApplyBaseActivity f42864g;

    public /* synthetic */ C2080i(OcApplyBaseActivity ocApplyBaseActivity, int i7) {
        this.f42863f = i7;
        this.f42864g = ocApplyBaseActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42863f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42864g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42864g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42863f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f42863f) {
            case 0:
                CommonResult commonResult = (CommonResult) obj;
                if (commonResult == null || !commonResult.isSuccess()) {
                    ToastUtils.showShort(commonResult != null ? commonResult.getRespMsg() : null, new Object[0]);
                }
                break;
            default:
                CommonResult commonResult2 = (CommonResult) obj;
                if (commonResult2 == null || !commonResult2.isSuccess()) {
                    ToastUtils.showShort(commonResult2 != null ? commonResult2.getRespMsg() : null, new Object[0]);
                }
                break;
        }
    }
}
