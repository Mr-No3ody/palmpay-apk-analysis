package p310ub;

import Z4.e;
import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class F0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OcProtocolActivity f42755g;

    public /* synthetic */ F0(OcProtocolActivity ocProtocolActivity, int i7) {
        this.f42754f = i7;
        this.f42755g = ocProtocolActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42754f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42755g.addSubscription(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42755g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42755g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42754f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f42755g.getClass();
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f42754f) {
            case 0:
                CommonResult commonResult = (CommonResult) obj;
                if (commonResult != null) {
                    commonResult.isSuccess();
                }
                break;
            case 1:
                CommonResult commonResult2 = (CommonResult) obj;
                this.f42755g.getClass();
                if (commonResult2 != null) {
                    commonResult2.isSuccess();
                }
                break;
            default:
                CommonResult commonResult3 = (CommonResult) obj;
                if (commonResult3 == null || !commonResult3.isSuccess()) {
                    TextUtils.isEmpty(commonResult3 != null ? commonResult3.getRespMsg() : null);
                }
                break;
        }
    }

    private final void R(String str) {
    }
}
