package Eb;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.E;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f2273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f2274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f2275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static QueryLoanDialogPopUpsBean.PhoneModelDto f2276d;

    public static void a(E e10, Intent intent) {
        String orderNo;
        if (e10 == null || !f2273a) {
            c[] cVarArr = c.f2272a;
            return;
        }
        if (f2274b) {
            c[] cVarArr2 = c.f2272a;
            return;
        }
        f2274b = true;
        try {
            f2273a = false;
            String stringExtra = intent != null ? intent.getStringExtra("faceToken") : null;
            if (intent != null) {
                intent.removeExtra("faceToken");
            }
            if (intent != null) {
                e10.setIntent(intent);
            }
            QueryLoanDialogPopUpsBean.PhoneModelDto phoneModelDto = f2276d;
            f2276d = null;
            if (stringExtra == null || StringsKt.F(stringExtra)) {
                c[] cVarArr3 = c.f2272a;
            } else {
                f2275c = true;
                Bundle bundle = new Bundle();
                String loanNo = phoneModelDto != null ? phoneModelDto.getLoanNo() : null;
                if (loanNo == null) {
                    loanNo = "";
                }
                bundle.putString("loanNo", loanNo);
                bundle.putString("loanProduct", "HIRE_PURCHASE");
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "MobileInstallmentOverview");
                if (phoneModelDto != null && (orderNo = phoneModelDto.getOrderNo()) != null) {
                    String str = orderNo.length() > 0 ? orderNo : null;
                    if (str != null) {
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().confirmHirePurchaseRepaymentAppLogin(str).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new d());
                    }
                }
                c[] cVarArr4 = c.f2272a;
            }
        } finally {
            f2274b = false;
        }
    }
}
