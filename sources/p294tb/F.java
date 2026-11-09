package p294tb;

import Db.o;
import Z4.e;
import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.Z;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOpenResultActivity;
import com.transsnet.palmpay.credit.ui.dialog.DownloadCashPageDialogFragment;
import com.transsnet.palmpay.credit.ui.viewmodel.OpenResultViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CLOpenResultActivity f42407f;

    public F(CLOpenResultActivity cLOpenResultActivity) {
        this.f42407f = cLOpenResultActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f42407f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        CLOpenResultActivity cLOpenResultActivity = this.f42407f;
        cLOpenResultActivity.showLoadingDialog(false);
        ToastUtils.showShort(message, new Object[0]);
        cLOpenResultActivity.f28969J0.postDelayed(cLOpenResultActivity.s(), 5000L);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        Integer applyStatus;
        Integer productSubId;
        Integer checkStatus;
        CLOpenAccountResp cLOpenAccountResp = (CLOpenAccountResp) obj;
        CLOpenResultActivity cLOpenResultActivity = this.f42407f;
        cLOpenResultActivity.showLoadingDialog(false);
        Handler handler = cLOpenResultActivity.f28969J0;
        if (cLOpenAccountResp != null) {
            int iIntValue = 1;
            if (cLOpenAccountResp.isSuccess() && cLOpenAccountResp.getData() != null) {
                CLOpenAccountData data = cLOpenAccountResp.getData();
                cLOpenResultActivity.f28967H0 = data;
                if (data != null && (checkStatus = data.getCheckStatus()) != null && checkStatus.intValue() == 0) {
                    d.x(null, "LoanReviewing");
                    return;
                }
                CLOpenAccountData cLOpenAccountData = cLOpenResultActivity.f28967H0;
                if (cLOpenAccountData != null && (applyStatus = cLOpenAccountData.getApplyStatus()) != null && applyStatus.intValue() == 1) {
                    CLOpenAccountData cLOpenAccountData2 = cLOpenResultActivity.f28967H0;
                    if (!TextUtils.equals(cLOpenAccountData2 != null ? cLOpenAccountData2.getLoanProduct() : null, "PALMPAY_CARD")) {
                        if (TextUtils.equals(cLOpenResultActivity.f28976O0, "CASH_INSTALLMENT_RAISE_AMOUNT")) {
                            CLOpenResultActivity.z(cLOpenResultActivity, 1);
                            return;
                        }
                        handler.removeCallbacks(cLOpenResultActivity.s());
                        OpenResultViewModel openResultViewModel = (OpenResultViewModel) cLOpenResultActivity.l();
                        CLOpenAccountData cLOpenAccountData3 = cLOpenResultActivity.f28967H0;
                        if (cLOpenAccountData3 != null && (productSubId = cLOpenAccountData3.getProductSubId()) != null) {
                            iIntValue = productSubId.intValue();
                        }
                        openResultViewModel.getClass();
                        f.s(openResultViewModel, new o(iIntValue, null), openResultViewModel.f30691e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        return;
                    }
                }
                CLOpenResultActivity.z(cLOpenResultActivity, 3);
                return;
            }
        }
        if (!TextUtils.equals("2", cLOpenAccountResp != null ? cLOpenAccountResp.getRespCode() : null)) {
            handler.postDelayed(cLOpenResultActivity.s(), 5000L);
            return;
        }
        DownloadCashPageDialogFragment downloadCashPageDialogFragmentNewInstance = DownloadCashPageDialogFragment.f29959L.newInstance();
        Z supportFragmentManager = cLOpenResultActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        downloadCashPageDialogFragmentNewInstance.show(supportFragmentManager, "DownloadCashPageDialogFragment");
    }
}
