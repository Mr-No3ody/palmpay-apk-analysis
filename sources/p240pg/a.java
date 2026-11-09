package p240pg;

import E.AbstractC0198c;
import Xe.d;
import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.mtn.sdk.MTN;
import com.transsnet.mtn.sdk.http.resp.CommonResult;
import com.transsnet.mtn.sdk.http.resp.GetConfigInfoResp;
import com.transsnet.mtn.sdk.ui.GateActivity;
import com.transsnet.mtn.sdk.ui.bank._common.TermsAndPrivacyActivity;
import java.util.List;
import p016b.b$a;
import p073f.c;
import vh.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements b$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GateActivity f41314a;

    public a(GateActivity gateActivity) {
        this.f41314a = gateActivity;
    }

    @Override // p016b.b$a
    public final void a(String str) {
        GateActivity gateActivity = this.f41314a;
        gateActivity.getClass();
        b.b(str);
        gateActivity.finish();
        c.a().b(102, str);
    }

    @Override // p016b.b$a
    public final void a(CommonResult commonResult) {
        Intent component;
        GetConfigInfoResp getConfigInfoResp = (GetConfigInfoResp) commonResult;
        boolean zIsSuccess = getConfigInfoResp.isSuccess();
        GateActivity gateActivity = this.f41314a;
        if (zIsSuccess) {
            c cVarA = c.a();
            String str = getConfigInfoResp.data.agreeUrlOperator;
            if (TextUtils.isEmpty(cVarA.f36335c)) {
                cVarA.f36335c = str;
            }
            c cVarA2 = c.a();
            String str2 = getConfigInfoResp.data.countryCode;
            cVarA2.getClass();
            AbstractC0198c.b();
            d dVar = AbstractC0198c.f1997f.f11213f;
            dVar.j(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
            dVar.e(str2, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
            c.a().f36337e = getConfigInfoResp.data.merchantName;
            c cVarA3 = c.a();
            List<GetConfigInfoResp.BankBean> list = getConfigInfoResp.data.bankList;
            cVarA3.getClass();
            int i7 = GateActivity.f25687b;
            gateActivity.getClass();
            if (TextUtils.isEmpty(c.a().f36336d)) {
                gateActivity.startActivity(new Intent(gateActivity, (Class<?>) TermsAndPrivacyActivity.class));
                gateActivity.finish();
                return;
            }
            String str3 = c.a().f36336d;
            if (str3 == null) {
                str3 = "";
            }
            if (!str3.equals(MTN.MTN_NG)) {
                component = !str3.equals(MTN.MTN) ? null : new Intent().setComponent(new ComponentName(D3.a.f1587c.getPackageName(), "com.transsnet.mtn.sdk.ui.bank.MTN.LoginActivity"));
            } else {
                component = new Intent().setComponent(new ComponentName(D3.a.f1587c.getPackageName(), "com.transsnet.mtn.sdk.ui.bank.MTN_NG.LoginActivity"));
            }
            gateActivity.startActivity(component);
            gateActivity.finish();
            return;
        }
        String respMsg = getConfigInfoResp.getRespMsg();
        gateActivity.getClass();
        b.b(respMsg);
        gateActivity.finish();
        c.a().b(102, getConfigInfoResp.getRespMsg());
    }
}
