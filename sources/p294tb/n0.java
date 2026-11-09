package p294tb;

import Z4.e;
import android.text.TextUtils;
import com.transsnet.palmpay.credit.bean.rsp.QuerySysConfigResp;
import com.transsnet.palmpay.credit.bean.rsp.SysConfg;
import com.transsnet.palmpay.credit.bean.rsp.SysConfigValue;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentResultActivity;
import com.transsnet.palmpay.credit.ui.dialog.PreferredLanguageDialog;
import io.reactivex.disposables.Disposable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CLRepaymentResultActivity f42490f;

    public n0(CLRepaymentResultActivity cLRepaymentResultActivity) {
        this.f42490f = cLRepaymentResultActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f42490f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String str) {
        CLRepaymentResultActivity cLRepaymentResultActivity = this.f42490f;
        cLRepaymentResultActivity.showLoadingDialog(false);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        h.x(cLRepaymentResultActivity, str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        List<SysConfg> data;
        List<SysConfigValue> values;
        QuerySysConfigResp querySysConfigResp = (QuerySysConfigResp) obj;
        CLRepaymentResultActivity cLRepaymentResultActivity = this.f42490f;
        cLRepaymentResultActivity.showLoadingDialog(false);
        preferredLanguageDialog = null;
        PreferredLanguageDialog preferredLanguageDialog = null;
        if (querySysConfigResp == null || !querySysConfigResp.isSuccess() || (data = querySysConfigResp.getData()) == null || !(!data.isEmpty())) {
            if (TextUtils.isEmpty(querySysConfigResp != null ? querySysConfigResp.getRespMsg() : null)) {
                return;
            }
            h.x(cLRepaymentResultActivity, querySysConfigResp != null ? querySysConfigResp.getRespMsg() : null);
            return;
        }
        List<SysConfg> data2 = querySysConfigResp.getData();
        Intrinsics.e(data2);
        SysConfg sysConfg = data2.get(0);
        if (sysConfg != null && (values = sysConfg.getValues()) != null) {
            preferredLanguageDialog = new PreferredLanguageDialog(cLRepaymentResultActivity, values, new m0(cLRepaymentResultActivity));
        }
        if (preferredLanguageDialog != null) {
            preferredLanguageDialog.show();
        }
    }
}
