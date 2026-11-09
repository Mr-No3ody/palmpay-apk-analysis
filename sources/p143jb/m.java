package p143jb;

import Z4.e;
import android.net.Uri;
import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.rsp.AllAuthInfoRsp;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f38534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f38535g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Integer f38536i;

    public m(o oVar, String str, Integer num) {
        this.f38534f = oVar;
        this.f38535g = str;
        this.f38536i = num;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f38534f.i().add(d2);
    }

    @Override // Z4.e
    public final void w(String str) {
        this.f38534f.B();
        ToastUtils.showShort(str, new Object[0]);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // Z4.e
    public final void y(Object obj) {
        AllAuthInfoRsp.DataBean dataBean;
        AllAuthInfoRsp.DataBean dataBean2;
        AllAuthInfoRsp.DataBean dataBean3;
        AllAuthInfoRsp.DataBean dataBean4;
        AllAuthInfoRsp.DataBean dataBean5;
        AllAuthInfoRsp.DataBean dataBean6;
        AllAuthInfoRsp.DataBean dataBean7;
        AllAuthInfoRsp allAuthInfoRsp = (AllAuthInfoRsp) obj;
        String str = this.f38535g;
        String path = Uri.parse(str).getPath();
        o oVar = this.f38534f;
        if (path != null) {
            int iHashCode = path.hashCode();
            Integer num = this.f38536i;
            switch (iHashCode) {
                case -2045561952:
                    if (path.equals("/credit_score/oc_all_verify_activity")) {
                        if (TextUtils.isEmpty((allAuthInfoRsp == null || (dataBean3 = allAuthInfoRsp.data) == null) ? null : dataBean3.bvn)) {
                            if (TextUtils.isEmpty((allAuthInfoRsp == null || (dataBean2 = allAuthInfoRsp.data) == null) ? null : dataBean2.bankCard)) {
                                if (TextUtils.isEmpty((allAuthInfoRsp == null || (dataBean = allAuthInfoRsp.data) == null) ? null : dataBean.bankAccount)) {
                                    oVar.y(num, str, null);
                                    return;
                                }
                            }
                        }
                        oVar.v(oVar.f38555m);
                        return;
                    }
                    break;
                case -1727487957:
                    if (path.equals("/account/upgrade")) {
                        if (TextUtils.isEmpty((allAuthInfoRsp == null || (dataBean4 = allAuthInfoRsp.data) == null) ? null : dataBean4.bvn)) {
                            oVar.y(num, str, null);
                            return;
                        } else {
                            oVar.v(oVar.f38555m);
                            return;
                        }
                    }
                    break;
                case -1294751000:
                    if (path.equals("/coreImpl/use_new_card")) {
                        if (TextUtils.isEmpty((allAuthInfoRsp == null || (dataBean5 = allAuthInfoRsp.data) == null) ? null : dataBean5.bankCard)) {
                            oVar.y(num, str, null);
                            return;
                        } else {
                            oVar.v(oVar.f38555m);
                            return;
                        }
                    }
                    break;
                case 1279279978:
                    if (path.equals("/coreImpl/bind_new_bank_account")) {
                        if (TextUtils.isEmpty((allAuthInfoRsp == null || (dataBean6 = allAuthInfoRsp.data) == null) ? null : dataBean6.bankAccount)) {
                            oVar.y(num, str, null);
                            return;
                        } else {
                            oVar.v(oVar.f38555m);
                            return;
                        }
                    }
                    break;
                case 1799542030:
                    if (path.equals("/coreImpl/add_new_card")) {
                        if (TextUtils.isEmpty((allAuthInfoRsp == null || (dataBean7 = allAuthInfoRsp.data) == null) ? null : dataBean7.bankCard)) {
                            oVar.y(num, str, null);
                            return;
                        } else {
                            oVar.v(oVar.f38555m);
                            return;
                        }
                    }
                    break;
            }
        }
        oVar.v(oVar.f38555m);
    }
}
