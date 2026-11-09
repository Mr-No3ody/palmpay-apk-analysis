package p288sg;

import android.content.Intent;
import com.transsnet.mtn.sdk.http.resp.CommonResult;
import com.transsnet.mtn.sdk.http.resp.SendSmsResp;
import com.transsnet.mtn.sdk.ui.bank.MTN.LoginActivity;
import com.transsnet.mtn.sdk.ui.bank.MTN.VerificationActivity;
import p016b.b$a;
import vh.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements b$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f42254a;

    public a(LoginActivity loginActivity) {
        this.f42254a = loginActivity;
    }

    @Override // p016b.b$a
    public final void a(String str) {
        int i7 = LoginActivity.f25688j;
        this.f42254a.f19043i.b();
        b.b(str);
    }

    @Override // p016b.b$a
    public final void a(CommonResult commonResult) {
        SendSmsResp sendSmsResp = (SendSmsResp) commonResult;
        int i7 = LoginActivity.f25688j;
        LoginActivity loginActivity = this.f42254a;
        loginActivity.f19043i.b();
        if (!sendSmsResp.isSuccess()) {
            loginActivity.f19043i.a(sendSmsResp.getRespMsg());
            return;
        }
        if (sendSmsResp.data == null) {
            loginActivity.f19043i.a("Data Error!");
            return;
        }
        if (sendSmsResp.isLoginInvalid()) {
            loginActivity.f19043i.a(sendSmsResp.data.statusMessage);
            return;
        }
        loginActivity.f19043i.d();
        SendSmsResp.DataBean dataBean = sendSmsResp.data;
        String str = dataBean.statusCode;
        String str2 = dataBean.statusMessage;
        loginActivity.getClass();
        Intent intent = new Intent(loginActivity, (Class<?>) VerificationActivity.class);
        intent.putExtra("VERIFY_TYPE", 2);
        intent.putExtra("BUSINESS_TYPE", 1);
        intent.putExtra("SEND_SMS_STATUS", str);
        intent.putExtra("SEND_SMS_MSG", str2);
        intent.putExtra("SEND_SMS_SWITCH", false);
        loginActivity.startActivity(intent);
    }
}
