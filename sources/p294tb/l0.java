package p294tb;

import Pa.C0525w;
import Ya.g;
import Z4.e;
import android.os.Handler;
import android.text.TextUtils;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.credit.bean.resp.TopUpOrderDetailRsp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentResultActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import org.sufficientlysecure.htmltextview.h;
import p071ef.b;
import p221ob.c;
import p284sb.C2025x;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CLRepaymentResultActivity f42486f;

    public l0(CLRepaymentResultActivity cLRepaymentResultActivity) {
        this.f42486f = cLRepaymentResultActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f42486f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f42486f.showLoadingDialog(false);
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
        CLRepaymentResultActivity cLRepaymentResultActivity = this.f42486f;
        if (!zIsEmpty) {
            C0525w c0525wF = C0525w.f();
            String str = topUpOrderDetailRsp.data.extensionInfo;
            c0525wF.getClass();
            cLRepaymentResultActivity.f29119X = ((TopUpOrderDetailRsp.DataBean.ExtensionInfo) C0525w.d(str, TopUpOrderDetailRsp.DataBean.ExtensionInfo.class)).productSubId;
        }
        TopUpOrderDetailRsp.DataBean data = topUpOrderDetailRsp.data;
        int i7 = data.status;
        Intrinsics.checkNotNullExpressionValue(data, "data");
        RunnableC2060w runnableC2060w = cLRepaymentResultActivity.f29131p0;
        Handler handler = cLRepaymentResultActivity.f29121Z;
        if (i7 != 0 && i7 != 1) {
            if (i7 == 3) {
                cLRepaymentResultActivity.showLoadingDialog(true);
                c.f40268a.getInstance().getClass();
                c.a().getCashLoanNew().k(f.f42629b).i(b.a()).subscribe(new k0(cLRepaymentResultActivity, 0));
                handler.removeCallbacks(runnableC2060w);
                return;
            }
            if (i7 != 5) {
                String string = cLRepaymentResultActivity.getString(g.cl_repay_result_ad_slot_id);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                InterstitialAdView.show$default(new InterstitialAdView(string, 0, new C2025x(7), new h(9)), cLRepaymentResultActivity, null, 2, null);
                handler.removeCallbacks(runnableC2060w);
                cLRepaymentResultActivity.p(2);
                return;
            }
        }
        handler.postDelayed(runnableC2060w, cLRepaymentResultActivity.f29128k0);
        cLRepaymentResultActivity.p(3);
    }
}
