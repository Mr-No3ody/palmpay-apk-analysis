package p310ub;

import Ya.g;
import Z4.e;
import android.os.Handler;
import android.os.SystemClock;
import androidx.camera.core.streamsharing.i;
import com.transsnet.palmpay.credit.bean.resp.SendMTNOTPResp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMTNLoginActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import p141j9.B;
import p183m6.j;

/* JADX INFO: renamed from: ub.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2079h0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f42861f;

    public C2079h0(j jVar) {
        this.f42861f = jVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        ((OcMTNLoginActivity) this.f42861f.f39520b).addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        j jVar = this.f42861f;
        ((OcMTNLoginActivity) jVar.f39520b).showLoadingDialog(false);
        ((OcMTNLoginActivity) ((OcMTNLoginActivity) jVar.f39520b).f29570v0.f42878b).f29573y0 = true;
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        SendMTNOTPResp sendMTNOTPResp = (SendMTNOTPResp) obj;
        j jVar = this.f42861f;
        ((OcMTNLoginActivity) jVar.f39520b).showLoadingDialog(false);
        boolean zIsSuccess = sendMTNOTPResp.isSuccess();
        OcMTNLoginActivity ocMTNLoginActivity = (OcMTNLoginActivity) jVar.f39520b;
        if (!zIsSuccess) {
            ((OcMTNLoginActivity) ocMTNLoginActivity.f29570v0.f42878b).f29573y0 = true;
            ToastUtils.showLong(sendMTNOTPResp.getRespMsg());
        } else {
            if (!sendMTNOTPResp.isSendOK()) {
                ((OcMTNLoginActivity) ocMTNLoginActivity.f29570v0.f42878b).f29573y0 = true;
                ToastUtils.showLong(sendMTNOTPResp.data.statusMessage);
                return;
            }
            i iVar = ocMTNLoginActivity.f29572x0;
            iVar.getClass();
            iVar.f14502a = SystemClock.elapsedRealtime() + 60000;
            ((Handler) iVar.f14503b).postDelayed(new B(iVar, 19), 500L);
            ToastUtils.showLong(g.cs_str_send_successfully);
        }
    }
}
