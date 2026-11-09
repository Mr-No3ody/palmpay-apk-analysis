package N8;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: N8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0475t extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6256f;

    public /* synthetic */ C0475t(int i7) {
        this.f6256f = i7;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f6256f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                break;
            case 1:
            case 2:
                break;
            case 3:
                Intrinsics.checkNotNullParameter(d2, "d");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(d2, "d");
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f6256f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                break;
            case 1:
                ToastUtils.showLong(message);
                break;
            case 2:
                ToastUtils.showLong(message);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f6256f) {
            case 0:
                break;
            case 1:
                if (((CommonResult) obj).isSuccess()) {
                    p367ya.a.d().f44149a.k("key_notification", true);
                }
                break;
            case 2:
                if (((CommonResult) obj).isSuccess()) {
                    p367ya.a.d().f44149a.k("key_notification", true);
                }
                break;
            case 3:
                CommonResult commonResult = (CommonResult) obj;
                if (commonResult == null || !commonResult.isSuccess()) {
                    ToastUtils.showShort(commonResult != null ? commonResult.getRespMsg() : null, new Object[0]);
                }
                break;
            case 4:
                CommonResult commonResult2 = (CommonResult) obj;
                if (commonResult2 == null || !commonResult2.isSuccess()) {
                    ToastUtils.showShort(commonResult2 != null ? commonResult2.getRespMsg() : null, new Object[0]);
                }
                break;
            default:
                break;
        }
    }

    private final void R(Disposable disposable) {
    }

    private final void S(Disposable disposable) {
    }
}
