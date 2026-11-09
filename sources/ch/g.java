package ch;

import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.provider.m;
import com.transsnet.mtn.sdk.http.resp.CommonResult;
import com.transsnet.mtn.sdk.http.resp.SendSmsResp;
import p016b.b$a;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements b$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f19051a;

    public g(h hVar) {
        this.f19051a = hVar;
    }

    @Override // p016b.b$a
    public final void a(String str) {
        h hVar = this.f19051a;
        k kVar = hVar.f19057f;
        int i7 = k.f19064o;
        mh.h hVar2 = kVar.f36323a;
        if (hVar2 != null) {
            hVar2.dismiss();
        }
        hVar.e();
    }

    @Override // p016b.b$a
    public final void a(CommonResult commonResult) {
        boolean z3 = false;
        SendSmsResp sendSmsResp = (SendSmsResp) commonResult;
        h hVar = this.f19051a;
        k kVar = hVar.f19057f;
        int i7 = k.f19064o;
        mh.h hVar2 = kVar.f36323a;
        if (hVar2 != null) {
            hVar2.dismiss();
        }
        if (!sendSmsResp.isSuccess()) {
            hVar.e();
            hVar.a(sendSmsResp.getRespMsg());
            return;
        }
        if (sendSmsResp.data == null) {
            hVar.e();
            hVar.a("Data Error!");
            return;
        }
        if (sendSmsResp.isSendOK()) {
            hVar.getClass();
            hVar.f19056e = SystemClock.elapsedRealtime() + 60000;
            Handler handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new m(hVar, 3, handler, z3), 500L);
            String str = sendSmsResp.data.statusMessage;
            hVar.f19052a.setTextColor(Color.parseColor("#202046"));
            hVar.f19052a.setText(str);
            hVar.f19052a.setVisibility(0);
            return;
        }
        hVar.e();
        hVar.a(sendSmsResp.data.statusMessage);
    }
}
