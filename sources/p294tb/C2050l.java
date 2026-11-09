package p294tb;

import Z4.e;
import android.text.TextUtils;
import com.transsnet.palmpay.credit.bean.rsp.QuerySysConfigResp;
import com.transsnet.palmpay.credit.bean.rsp.SysConfg;
import com.transsnet.palmpay.credit.bean.rsp.SysConfigValue;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowResultActivity;
import com.transsnet.palmpay.credit.ui.dialog.PreferredLanguageDialog;
import io.reactivex.disposables.Disposable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;

/* JADX INFO: renamed from: tb.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2050l extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CLBorrowResultActivity f42485f;

    public C2050l(CLBorrowResultActivity cLBorrowResultActivity) {
        this.f42485f = cLBorrowResultActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f42485f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String str) {
        CLBorrowResultActivity cLBorrowResultActivity = this.f42485f;
        cLBorrowResultActivity.showLoadingDialog(false);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        h.x(cLBorrowResultActivity, str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        List<SysConfg> data;
        List<SysConfigValue> values;
        QuerySysConfigResp querySysConfigResp = (QuerySysConfigResp) obj;
        CLBorrowResultActivity cLBorrowResultActivity = this.f42485f;
        cLBorrowResultActivity.showLoadingDialog(false);
        preferredLanguageDialog = null;
        PreferredLanguageDialog preferredLanguageDialog = null;
        if (querySysConfigResp == null || !querySysConfigResp.isSuccess() || (data = querySysConfigResp.getData()) == null || !(!data.isEmpty())) {
            if (TextUtils.isEmpty(querySysConfigResp != null ? querySysConfigResp.getRespMsg() : null)) {
                return;
            }
            h.x(cLBorrowResultActivity, querySysConfigResp != null ? querySysConfigResp.getRespMsg() : null);
            return;
        }
        List<SysConfg> data2 = querySysConfigResp.getData();
        Intrinsics.e(data2);
        SysConfg sysConfg = data2.get(0);
        if (sysConfg != null && (values = sysConfg.getValues()) != null) {
            preferredLanguageDialog = new PreferredLanguageDialog(cLBorrowResultActivity, values, new C2049k(cLBorrowResultActivity));
        }
        if (preferredLanguageDialog != null) {
            preferredLanguageDialog.show();
        }
    }
}
