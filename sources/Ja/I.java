package Ja;

import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.ui.activity.PayVerificationActivity;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckUssdAirtimeSharePinFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class I extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CheckUssdAirtimeSharePinFragment f4631g;

    public /* synthetic */ I(CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment, int i7) {
        this.f4630f = i7;
        this.f4631g = checkUssdAirtimeSharePinFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f4630f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f4631g.f(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f4631g.f(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f4630f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                CheckUssdAirtimeSharePinFragment.z(this.f4631g);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                CheckUssdAirtimeSharePinFragment.z(this.f4631g);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment = this.f4631g;
        switch (this.f4630f) {
            case 0:
                CheckPayResp checkPayResp = (CheckPayResp) obj;
                if (checkPayResp != null && checkPayResp.isSuccess()) {
                    CheckUssdAirtimeSharePinFragment.a aVar = CheckUssdAirtimeSharePinFragment.f28035L;
                    PayVerificationActivity payVerificationActivity = (PayVerificationActivity) checkUssdAirtimeSharePinFragment.getActivity();
                    if (payVerificationActivity != null && ActivityUtils.isValidActivityContext(checkUssdAirtimeSharePinFragment.requireActivity())) {
                        payVerificationActivity.showQueryPayResult(checkPayResp);
                        break;
                    }
                } else {
                    CheckUssdAirtimeSharePinFragment.z(checkUssdAirtimeSharePinFragment);
                    break;
                }
                break;
            default:
                CheckUssdAirtimeSharePinFragment.z(checkUssdAirtimeSharePinFragment);
                break;
        }
    }
}
