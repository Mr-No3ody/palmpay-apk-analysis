package p143jb;

import F6.d;
import Z4.e;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.model.b;
import com.transsnet.mtn.sdk.MTN;
import com.transsnet.mtn.sdk.config.Configuration;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.resp.OcOneLoopData;
import com.transsnet.palmpay.credit.bean.resp.OcOneLoopDataResp;
import com.transsnet.palmpay.credit.bean.resp.OcSkipOneLoopResp;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p103gf.a;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f38569g;

    public /* synthetic */ r(t tVar, int i7) {
        this.f38568f = i7;
        this.f38569g = tVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f38568f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((a) this.f38569g.f38575a.getValue()).add(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((a) this.f38569g.f38575a.getValue()).add(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f38568f) {
            case 0:
                if (str != null) {
                    if ((!TextUtils.isEmpty(str) ? str : null) != null) {
                        ToastUtils.showLong(str, new Object[0]);
                    }
                }
                break;
            default:
                if (str != null) {
                    if ((!TextUtils.isEmpty(str) ? str : null) != null) {
                        ToastUtils.showShort(str, new Object[0]);
                    }
                }
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f38568f) {
            case 0:
                OcOneLoopDataResp ocOneLoopDataResp = (OcOneLoopDataResp) obj;
                if (ocOneLoopDataResp != null) {
                    if (((!ocOneLoopDataResp.isSuccess() || ocOneLoopDataResp.getData() == null) ? null : ocOneLoopDataResp) != null) {
                        OcOneLoopData data = ocOneLoopDataResp.getData();
                        t tVar = this.f38569g;
                        tVar.getClass();
                        d.h("CreditRouterManagerV2", 3, "routerOneLoop >>>");
                        Activity topActivity = ActivityUtils.getTopActivity();
                        if (topActivity != null) {
                            Context context = BaseApplication.getContext();
                            String string = topActivity.getString(k.core_one_loop_secret_key);
                            String string2 = topActivity.getString(k.core_one_loop_env);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            MTN.init(context, string, Integer.parseInt(string2));
                            Configuration configuration = new Configuration();
                            configuration.auth_id = data != null ? data.getId() : null;
                            configuration.mtn_id = MTN.MTN_NG;
                            configuration.phone = "";
                            configuration.agreeUrl = "";
                            MTN.start(configuration, new b(13, tVar, topActivity));
                        }
                    }
                }
                break;
            default:
                OcSkipOneLoopResp ocSkipOneLoopResp = (OcSkipOneLoopResp) obj;
                if (ocSkipOneLoopResp != null) {
                    if (!ocSkipOneLoopResp.isSuccess()) {
                        ocSkipOneLoopResp = null;
                    }
                    if (ocSkipOneLoopResp != null) {
                        if (!Intrinsics.c(ocSkipOneLoopResp.getData(), Boolean.FALSE)) {
                            this.f38569g.d();
                        } else {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "OneLoopAct");
                        }
                    }
                }
                break;
        }
    }
}
