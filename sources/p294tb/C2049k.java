package p294tb;

import com.transsnet.palmpay.credit.bean.req.OcAddContactReq;
import com.transsnet.palmpay.credit.bean.req.PersonalInfo;
import com.transsnet.palmpay.credit.bean.rsp.SysConfigValue;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowResultActivity;
import com.transsnet.palmpay.credit.ui.dialog.PreferredLanguageDialog;
import p071ef.b;
import p221ob.c;
import p298tf.f;

/* JADX INFO: renamed from: tb.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2049k implements PreferredLanguageDialog.OnConfirmLanguageListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLBorrowResultActivity f42482a;

    public C2049k(CLBorrowResultActivity cLBorrowResultActivity) {
        this.f42482a = cLBorrowResultActivity;
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.PreferredLanguageDialog.OnConfirmLanguageListener
    public final void onConfirmLanguage(SysConfigValue sysConfigValue) {
        String keyValue;
        int i7 = CLBorrowResultActivity.f28876k0;
        CLBorrowResultActivity cLBorrowResultActivity = this.f42482a;
        if (sysConfigValue == null || (keyValue = sysConfigValue.getKeyValue()) == null) {
            keyValue = "";
        }
        OcAddContactReq ocAddContactReq = new OcAddContactReq(null, null, null, null, null, new PersonalInfo(keyValue));
        cLBorrowResultActivity.showLoadingDialog(true);
        c.f40268a.getInstance().getClass();
        c.a().addContact(ocAddContactReq).k(f.f42629b).i(b.a()).subscribe(new C2048j(cLBorrowResultActivity, 3));
    }
}
