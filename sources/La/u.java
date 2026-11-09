package La;

import Pa.C0525w;
import Pa.r0;
import android.app.Activity;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.bean.rsp.USSDFundResp;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f5603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f5604g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f5605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f5606j;

    public u(v vVar, String str, String str2, long j6) {
        this.f5606j = vVar;
        this.f5603f = str;
        this.f5604g = str2;
        this.f5605i = j6;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f5606j.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        USSDFundResp uSSDFundResp = (USSDFundResp) obj;
        if (uSSDFundResp == null || !uSSDFundResp.isSuccess() || uSSDFundResp.data == null) {
            return;
        }
        String str = this.f5603f;
        boolean zEquals = "01".equals(str);
        String str2 = this.f5604g;
        if (zEquals) {
            Postcard postcardBuild = ARouter.getInstance().build("/cashin/ussd_result");
            C0525w c0525wF = C0525w.f();
            postcardBuild.withString("extra_data", ((Gson) c0525wF.f7166b).toJson(uSSDFundResp.data)).withString("extra_type", str).withString("orderId", str2).withLong("extra_amount", this.f5605i).navigation();
        } else {
            Postcard postcardBuild2 = ARouter.getInstance().build("/core/ussd_pay_result");
            C0525w c0525wF2 = C0525w.f();
            postcardBuild2.withString("extra_data", ((Gson) c0525wF2.f7166b).toJson(uSSDFundResp.data)).withString("extra_type", str).withString("orderId", str2).navigation();
        }
        if ("04".equals(str)) {
            r0.A1();
        }
        Object obj2 = this.f5606j.f27351a;
        if (obj2 instanceof Activity) {
            ((Activity) obj2).finish();
        }
    }
}
