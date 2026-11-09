package com.transsnet.mtn.sdk.ui.bank.MTN;

import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.provider.m;
import ch.h;
import ch.k;
import com.transsnet.mtn.sdk.MTN;
import com.transsnet.mtn.sdk.http.req.LoginReq;
import com.transsnet.mtn.sdk.http.resp.LoginResp;
import p073f.a;
import p073f.c;
import p288sg.b;

/* JADX INFO: loaded from: classes3.dex */
public class VerificationActivity extends k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f25689p = 0;

    @Override // ch.e
    public final a j() {
        return a.f36325f;
    }

    @Override // ch.k
    public final void m(String str) {
        if (this.f19066i != 1) {
            return;
        }
        LoginReq loginReq = new LoginReq();
        a aVar = a.f36324e;
        loginReq.bankCode = MTN.MTN;
        loginReq.loginId = c.a().f36338f;
        loginReq.password = str;
        this.f19067j.a();
        p002a.a.b("/api/v1/openBanking/login", loginReq, new b(this), LoginResp.class);
    }

    @Override // ch.k
    public final void n() {
        h hVar = (h) this.f19067j;
        hVar.f19053b.setDigit(6);
        String stringExtra = getIntent().getStringExtra("SEND_SMS_STATUS");
        String stringExtra2 = getIntent().getStringExtra("SEND_SMS_MSG");
        if (!"00000000".equals(stringExtra)) {
            hVar.e();
            hVar.a(stringExtra2);
            return;
        }
        hVar.f19056e = SystemClock.elapsedRealtime() + 60000;
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new m(hVar, 3, handler, false), 500L);
        hVar.f19052a.setTextColor(Color.parseColor("#202046"));
        hVar.f19052a.setText(stringExtra2);
        hVar.f19052a.setVisibility(0);
    }
}
