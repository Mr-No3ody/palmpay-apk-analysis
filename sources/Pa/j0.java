package Pa;

import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.bill.TransType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 {
    public static String a(long j6, String str, String phoneNumber) {
        String strD;
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        try {
            strD = p183m6.n.f39523a.instance().d("featurePalmpayUssdPrefix", "861");
        } catch (Exception unused) {
            strD = null;
        }
        if (TextUtils.isEmpty(strD)) {
            strD = "861";
        }
        String strConcat = "*".concat(strD != null ? strD : "861");
        if (!TransType.TRANS_TYPE_BILLER_BETTING.equals(str)) {
            if (TransType.TRANS_TYPE_BUNDLE.equals(str)) {
                return N8.q0.l(strConcat, "*3", TextUtils.isEmpty(phoneNumber) ? "" : "*".concat(phoneNumber), "#");
            }
            if ("04".equals(str)) {
                return androidx.camera.video.u.n(strConcat, "*2", j6 >= 100 ? androidx.camera.video.u.i(j6, "*") : "*100", TextUtils.isEmpty(phoneNumber) ? "" : "*".concat(phoneNumber), "#");
            }
        }
        return N8.q0.j(strConcat, "#");
    }
}
