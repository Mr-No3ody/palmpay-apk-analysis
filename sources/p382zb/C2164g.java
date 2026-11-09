package p382zb;

import L6.i;
import O6.c;
import O6.d;
import Pa.i0;
import Ya.g;
import Z4.e;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.resp.CLH5BorrowUrlData;
import com.transsnet.palmpay.credit.bean.resp.CLH5BorrowUrlResp;
import com.transsnet.palmpay.credit.bean.resp.MoveCashAppResp;
import com.transsnet.palmpay.credit.bean.resp.QueryInstallmentWithdrawData;
import com.transsnet.palmpay.credit.bean.resp.QueryInstallmentWithdrawResp;
import com.transsnet.palmpay.credit.bean.resp.SignedProtocolRes;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLMainActivity;
import com.transsnet.palmpay.credit.ui.dialog.AgentAutoRepaymentDialog;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p294tb.W;
import p310ub.Q0;

/* JADX INFO: renamed from: zb.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2164g extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f44582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CLMainFragment f44583g;

    public /* synthetic */ C2164g(CLMainFragment cLMainFragment, int i7) {
        this.f44582f = i7;
        this.f44583g = cLMainFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f44582f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44583g.f(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44583g.f(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44583g.f(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44583g.f(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f44582f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f44583g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 1:
                this.f44583g.showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 2:
                ToastUtils.showLong(message, new Object[0]);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        String h5BorrowUrl;
        Intent openUrlIntent;
        SignedProtocolRes signedProtocolRes;
        MoveCashAppResp moveCashApp;
        MoveCashAppResp moveCashApp2;
        Integer downloadOpenType;
        MoveCashAppResp moveCashApp3;
        MoveCashAppResp moveCashApp4;
        Integer downloadOpenType2;
        MoveCashAppResp moveCashApp5;
        MoveCashAppResp moveCashApp6;
        switch (this.f44582f) {
            case 0:
                CLH5BorrowUrlResp cLH5BorrowUrlResp = (CLH5BorrowUrlResp) obj;
                CLMainFragment cLMainFragment = this.f44583g;
                cLMainFragment.showLoadingDialog(false);
                if (cLH5BorrowUrlResp != null && cLH5BorrowUrlResp.isSuccess()) {
                    CLH5BorrowUrlData data = cLH5BorrowUrlResp.getData();
                    if (!TextUtils.isEmpty(data != null ? data.getH5BorrowUrl() : null)) {
                        if (SPUtils.getInstance().getBoolean("show_h5_borrow_dialog", true)) {
                            CLH5BorrowUrlData data2 = cLH5BorrowUrlResp.getData();
                            String h5BorrowUrl2 = data2 != null ? data2.getH5BorrowUrl() : null;
                            Context context = cLMainFragment.getContext();
                            if (context != null) {
                                c cVar = new c(context);
                                cVar.f6615v = i.ppFlexiCashDialogTheme;
                                cVar.f6605k = false;
                                cVar.f6596b = d.f(cLMainFragment.getString(g.cs_cl_h5_borrow_dialog_title));
                                cVar.f6598d = cLMainFragment.getString(g.cs_cl_h5_borrow_dialog_content);
                                String string = cLMainFragment.getString(k.core_got_it);
                                W w3 = new W(18, cLMainFragment, h5BorrowUrl2);
                                cVar.f6600f = string;
                                cVar.f6602h = w3;
                                cVar.a().show();
                            }
                            SPUtils.getInstance().put("show_h5_borrow_dialog", false);
                            break;
                        } else {
                            E activity = cLMainFragment.getActivity();
                            if (activity != null) {
                                ((CLMainActivity) activity).f28946k0 = true;
                            }
                            CLH5BorrowUrlData data3 = cLH5BorrowUrlResp.getData();
                            if (data3 != null && (h5BorrowUrl = data3.getH5BorrowUrl()) != null && (openUrlIntent = IntentUtils.getOpenUrlIntent(h5BorrowUrl, true)) != null) {
                                ActivityUtils.startActivity(openUrlIntent);
                                break;
                            }
                        }
                    }
                }
                ToastUtils.showShort(cLH5BorrowUrlResp != null ? cLH5BorrowUrlResp.getRespMsg() : null, new Object[0]);
                break;
            case 1:
                QueryInstallmentWithdrawResp response = (QueryInstallmentWithdrawResp) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                CLMainFragment cLMainFragment2 = this.f44583g;
                boolean zC = false;
                cLMainFragment2.showLoadingDialog(false);
                if (response.isSuccess()) {
                    QueryInstallmentWithdrawData data4 = response.getData();
                    if ((data4 == null || (moveCashApp6 = data4.getMoveCashApp()) == null) ? false : Intrinsics.c(moveCashApp6.getMoveStrategy(), Boolean.TRUE)) {
                        if (!AppUtils.isAppInstalled("com.legend.cash")) {
                            QueryInstallmentWithdrawData data5 = response.getData();
                            String downloadUrl = null;
                            if (!TextUtils.isEmpty((data5 == null || (moveCashApp5 = data5.getMoveCashApp()) == null) ? null : moveCashApp5.getDownloadUrl())) {
                                QueryInstallmentWithdrawData data6 = response.getData();
                                if (!((data6 == null || (moveCashApp4 = data6.getMoveCashApp()) == null || (downloadOpenType2 = moveCashApp4.getDownloadOpenType()) == null || downloadOpenType2.intValue() != 3) ? false : true)) {
                                    QueryInstallmentWithdrawData data7 = response.getData();
                                    if (data7 != null && (moveCashApp2 = data7.getMoveCashApp()) != null && (downloadOpenType = moveCashApp2.getDownloadOpenType()) != null && downloadOpenType.intValue() == 4) {
                                        zC = true;
                                    }
                                    if (zC) {
                                        QueryInstallmentWithdrawData data8 = response.getData();
                                        if (data8 != null && (moveCashApp = data8.getMoveCashApp()) != null) {
                                            downloadUrl = moveCashApp.getDownloadUrl();
                                        }
                                        i0.c0(downloadUrl);
                                    }
                                } else {
                                    QueryInstallmentWithdrawData data9 = response.getData();
                                    if (data9 != null && (moveCashApp3 = data9.getMoveCashApp()) != null) {
                                        downloadUrl = moveCashApp3.getDownloadUrl();
                                    }
                                    ActivityUtils.startActivity(IntentUtils.getOpenUrlIntent(downloadUrl, true));
                                }
                            }
                        } else {
                            i0.Z(cLMainFragment2.getContext());
                        }
                    }
                }
                if (response.isSuccess()) {
                    QueryInstallmentWithdrawData data10 = response.getData();
                    if (data10 != null && (signedProtocolRes = data10.getSignedProtocolRes()) != null) {
                        zC = Intrinsics.c(signedProtocolRes.getResult(), Boolean.TRUE);
                    }
                    if (zC) {
                        ARouter.getInstance().build("/credit_score/cl_borrow_activity").withInt("cl_account_type", 9).navigation();
                    }
                }
                Context contextRequireContext = cLMainFragment2.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                new AgentAutoRepaymentDialog(contextRequireContext, new Q0(cLMainFragment2)).show();
                break;
            case 2:
                CommonResult response2 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(response2, "response");
                if (response2.isSuccess()) {
                    ARouter.getInstance().build("/credit_score/cl_borrow_activity").withInt("cl_account_type", 9).navigation();
                }
                break;
            default:
                break;
        }
    }

    private final void R(String str) {
    }
}
