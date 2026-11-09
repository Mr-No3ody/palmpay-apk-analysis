package p310ub;

import Ya.g;
import Z4.e;
import android.os.Handler;
import android.os.SystemClock;
import androidx.camera.core.streamsharing.i;
import com.transsnet.palmpay.credit.bean.resp.SendMTNOTPResp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOneLoopActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import p141j9.B;

/* JADX INFO: renamed from: ub.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2097q0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2102t0 f42907f;

    public C2097q0(C2102t0 c2102t0) {
        this.f42907f = c2102t0;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        ((OcOneLoopActivity) this.f42907f.f42923a).addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        C2102t0 c2102t0 = this.f42907f;
        ((OcOneLoopActivity) c2102t0.f42923a).showLoadingDialog(false);
        ((OcOneLoopActivity) c2102t0.f42923a).f29618u0.f42934a.f29621x0 = true;
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        SendMTNOTPResp sendMTNOTPResp = (SendMTNOTPResp) obj;
        C2102t0 c2102t0 = this.f42907f;
        ((OcOneLoopActivity) c2102t0.f42923a).showLoadingDialog(false);
        SendMTNOTPResp.DataBean dataBean = sendMTNOTPResp.data;
        int i7 = OcOneLoopActivity.f29605E0;
        OcOneLoopActivity ocOneLoopActivity = (OcOneLoopActivity) c2102t0.f42923a;
        if (!sendMTNOTPResp.isSuccess()) {
            ocOneLoopActivity.f29618u0.f42934a.f29621x0 = true;
            ToastUtils.showLong(sendMTNOTPResp.getRespMsg());
        } else {
            if (!sendMTNOTPResp.isSendOK()) {
                ocOneLoopActivity.f29618u0.f42934a.f29621x0 = true;
                ToastUtils.showLong(sendMTNOTPResp.data.statusMessage);
                return;
            }
            i iVar = ocOneLoopActivity.f29620w0;
            iVar.getClass();
            iVar.f14502a = SystemClock.elapsedRealtime() + 60000;
            ((Handler) iVar.f14503b).postDelayed(new B(iVar, 20), 500L);
            ToastUtils.showLong(g.cs_str_send_successfully);
        }
    }
}
