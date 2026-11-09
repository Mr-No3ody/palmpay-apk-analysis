package p310ub;

import Ya.g;
import Z4.e;
import android.graphics.Color;
import com.transsnet.palmpay.credit.bean.resp.MTNLoginResp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMTNLoginActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import p183m6.j;

/* JADX INFO: renamed from: ub.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2081i0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f42865f;

    public C2081i0(j jVar) {
        this.f42865f = jVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        ((OcMTNLoginActivity) this.f42865f.f39520b).addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ((OcMTNLoginActivity) this.f42865f.f39520b).showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        MTNLoginResp mTNLoginResp = (MTNLoginResp) obj;
        j jVar = this.f42865f;
        ((OcMTNLoginActivity) jVar.f39520b).showLoadingDialog(false);
        boolean zIsSuccess = mTNLoginResp.isSuccess();
        OcMTNLoginActivity ocMTNLoginActivity = (OcMTNLoginActivity) jVar.f39520b;
        if (zIsSuccess) {
            if (mTNLoginResp.isLoginOK()) {
                ocMTNLoginActivity.r();
                return;
            }
            C2085k0 c2085k0 = ocMTNLoginActivity.f29570v0;
            String str = mTNLoginResp.data.statusMessage;
            OcMTNLoginActivity ocMTNLoginActivity2 = (OcMTNLoginActivity) c2085k0.f42878b;
            ocMTNLoginActivity2.f29567s0.setBackgroundColor(Color.parseColor("#EC2424"));
            ocMTNLoginActivity2.f29568t0.setVisibility(0);
            ocMTNLoginActivity2.f29568t0.setText(str);
            return;
        }
        if ("00100005".equals(mTNLoginResp.getRespCode())) {
            ToastUtils.showLong(ocMTNLoginActivity.getString(g.cs_str_session_invalid_info));
            return;
        }
        C2085k0 c2085k1 = ocMTNLoginActivity.f29570v0;
        String respMsg = mTNLoginResp.getRespMsg();
        OcMTNLoginActivity ocMTNLoginActivity3 = (OcMTNLoginActivity) c2085k1.f42878b;
        ocMTNLoginActivity3.f29567s0.setBackgroundColor(Color.parseColor("#EC2424"));
        ocMTNLoginActivity3.f29568t0.setVisibility(0);
        ocMTNLoginActivity3.f29568t0.setText(respMsg);
    }
}
