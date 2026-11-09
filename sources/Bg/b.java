package Bg;

import android.content.Intent;
import com.transsnet.mtn.sdk.http.resp.CommonResult;
import com.transsnet.mtn.sdk.http.resp.LoginResp;
import com.transsnet.mtn.sdk.ui.bank.MTN_NG.VerificationActivity;
import com.transsnet.mtn.sdk.ui.bank._common.LoginSuccessActivity;
import p016b.b$a;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements b$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerificationActivity f909a;

    public b(VerificationActivity verificationActivity) {
        this.f909a = verificationActivity;
    }

    @Override // p016b.b$a
    public final void a(String str) {
        int i7 = VerificationActivity.f25691p;
        this.f909a.f19067j.b();
        vh.b.b(str);
    }

    @Override // p016b.b$a
    public final void a(CommonResult commonResult) {
        LoginResp loginResp = (LoginResp) commonResult;
        int i7 = VerificationActivity.f25691p;
        VerificationActivity verificationActivity = this.f909a;
        verificationActivity.f19067j.b();
        if (!loginResp.isSuccess()) {
            verificationActivity.f19067j.a(loginResp.getRespMsg());
        } else if (loginResp.isLoginOK()) {
            verificationActivity.getClass();
            verificationActivity.startActivity(new Intent(verificationActivity, (Class<?>) LoginSuccessActivity.class));
        } else {
            verificationActivity.f19067j.a(loginResp.data.statusMessage);
        }
    }
}
