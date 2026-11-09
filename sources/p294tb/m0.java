package p294tb;

import com.transsnet.palmpay.credit.bean.req.OcAddContactReq;
import com.transsnet.palmpay.credit.bean.req.PersonalInfo;
import com.transsnet.palmpay.credit.bean.rsp.SysConfigValue;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentResultActivity;
import com.transsnet.palmpay.credit.ui.dialog.PreferredLanguageDialog;
import p071ef.b;
import p221ob.c;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements PreferredLanguageDialog.OnConfirmLanguageListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLRepaymentResultActivity f42487a;

    public m0(CLRepaymentResultActivity cLRepaymentResultActivity) {
        this.f42487a = cLRepaymentResultActivity;
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.PreferredLanguageDialog.OnConfirmLanguageListener
    public final void onConfirmLanguage(SysConfigValue sysConfigValue) {
        String keyValue;
        int i7 = CLRepaymentResultActivity.f29111q0;
        CLRepaymentResultActivity cLRepaymentResultActivity = this.f42487a;
        cLRepaymentResultActivity.getClass();
        if (sysConfigValue == null || (keyValue = sysConfigValue.getKeyValue()) == null) {
            keyValue = "";
        }
        OcAddContactReq ocAddContactReq = new OcAddContactReq(null, null, null, null, null, new PersonalInfo(keyValue));
        cLRepaymentResultActivity.showLoadingDialog(true);
        c.f40268a.getInstance().getClass();
        c.a().addContact(ocAddContactReq).k(f.f42629b).i(b.a()).subscribe(new k0(cLRepaymentResultActivity, 2));
    }
}
