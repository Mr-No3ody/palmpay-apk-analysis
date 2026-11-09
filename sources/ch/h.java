package ch;

import android.graphics.Color;
import android.text.TextUtils;
import android.widget.TextView;
import com.transsnet.mtn.sdk.http.req.SendSmsReq;
import com.transsnet.mtn.sdk.http.resp.SendSmsResp;
import com.transsnet.mtn.sdk.ui.view.InputView;
import com.transsnet.mtn.sdk.ui.view.MTNButton;
import p227p.c$a;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements c$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f19052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputView f19053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MTNButton f19054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f19055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f19056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f19057f;

    public h(k kVar) {
        this.f19057f = kVar;
    }

    @Override // p227p.c$a
    public final void a() {
        this.f19054c.e();
    }

    @Override // p227p.c$a
    public final void b() {
        this.f19054c.f25722f = 0;
        d();
    }

    @Override // p227p.c$a
    public final void c() {
        if (this.f19057f.getIntent().getBooleanExtra("SEND_SMS_SWITCH", true)) {
            f();
        }
    }

    public final void d() {
        if (this.f19054c.d()) {
            return;
        }
        if (TextUtils.isEmpty(this.f19053b.get())) {
            this.f19054c.c();
        } else {
            this.f19054c.f();
        }
    }

    public final void e() {
        k kVar = this.f19057f;
        if (kVar.isDestroyed()) {
            return;
        }
        this.f19055d.setEnabled(true);
        this.f19055d.setText(p349x8.d.mtn_str_resend);
        TextView textView = this.f19055d;
        kVar.j();
        textView.setTextColor(Color.parseColor("#FFC90A"));
    }

    public final void f() {
        SendSmsReq sendSmsReq = new SendSmsReq();
        k kVar = this.f19057f;
        sendSmsReq.bankCode = kVar.j().f36329c;
        sendSmsReq.loginId = p073f.c.a().f36338f;
        p073f.c.a().getClass();
        sendSmsReq.accountNo = null;
        sendSmsReq.pin = kVar.getIntent().getStringExtra("PIN");
        sendSmsReq.token = kVar.getIntent().getStringExtra("TOKEN");
        int i7 = k.f19064o;
        if (kVar.f36323a == null) {
            kVar.f36323a = new mh.h(kVar, 1);
        }
        kVar.f36323a.show();
        if (!kVar.isDestroyed()) {
            this.f19055d.setEnabled(false);
            this.f19055d.setText(kVar.getString(p349x8.d.mtn_str_resend_with_time, 60));
            this.f19055d.setTextColor(Color.parseColor("#858A8F"));
        }
        p002a.a.b("/api/v1/openBanking/sendOtp", sendSmsReq, new g(this), SendSmsResp.class);
    }

    @Override // p227p.c$a
    public final void a(String str) {
        this.f19052a.setTextColor(Color.parseColor("#E41C1C"));
        this.f19052a.setText(str);
        this.f19052a.setVisibility(0);
    }
}
