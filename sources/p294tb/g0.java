package p294tb;

import Pa.C0525w;
import Ya.g;
import Z4.e;
import android.text.TextUtils;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.credit.bean.resp.TopUpOrderDetailRsp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentExtendResultActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import org.sufficientlysecure.htmltextview.h;
import p284sb.C2025x;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CLRepaymentExtendResultActivity f42470f;

    public g0(CLRepaymentExtendResultActivity cLRepaymentExtendResultActivity) {
        this.f42470f = cLRepaymentExtendResultActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f42470f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f42470f.showLoadingDialog(false);
        ToastUtils.showShort(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        TopUpOrderDetailRsp.DataBean dataBean;
        TopUpOrderDetailRsp topUpOrderDetailRsp = (TopUpOrderDetailRsp) obj;
        if (topUpOrderDetailRsp == null || !topUpOrderDetailRsp.isSuccess() || (dataBean = topUpOrderDetailRsp.data) == null) {
            ToastUtils.showShort(topUpOrderDetailRsp != null ? topUpOrderDetailRsp.getRespMsg() : null, new Object[0]);
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(dataBean.extensionInfo);
        CLRepaymentExtendResultActivity cLRepaymentExtendResultActivity = this.f42470f;
        if (!zIsEmpty) {
            C0525w c0525wF = C0525w.f();
            String str = topUpOrderDetailRsp.data.extensionInfo;
            c0525wF.getClass();
            TopUpOrderDetailRsp.DataBean.ExtensionInfo extensionInfo = (TopUpOrderDetailRsp.DataBean.ExtensionInfo) C0525w.d(str, TopUpOrderDetailRsp.DataBean.ExtensionInfo.class);
            int i7 = extensionInfo.productSubId;
            int i10 = CLRepaymentExtendResultActivity.f29091B;
            cLRepaymentExtendResultActivity.f29092A = extensionInfo.loanNo;
        }
        TopUpOrderDetailRsp.DataBean data = topUpOrderDetailRsp.data;
        int i11 = data.status;
        Intrinsics.checkNotNullExpressionValue(data, "data");
        int i12 = CLRepaymentExtendResultActivity.f29091B;
        if (i11 == 1 || i11 == 3 || i11 == 6) {
            return;
        }
        String string = cLRepaymentExtendResultActivity.getString(g.cl_repay_result_ad_slot_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        InterstitialAdView.show$default(new InterstitialAdView(string, 0, new C2025x(6), new h(9)), cLRepaymentExtendResultActivity, null, 2, null);
    }
}
