package j4;

import C0.G;
import android.net.Uri;
import android.text.TextUtils;
import com.transsnet.palmpay.util.EncryptUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.util.Calendar;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p355xf.t f38293a = C2131j.b(new com.transsnet.palmpay.managemoney.ui.view.c(20));

    public static boolean a(String str) {
        long jLongValue;
        String key = d(str);
        String strC = c(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!b().containsKey(key)) {
            HashMap mapB = b();
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(key, "key");
            mapB.put(key, Long.valueOf(SPUtils.getInstance(StringsKt.A(key, "_sp_", false) ? StringsKt.T(key, "_sp_") : "").getLong(key, jCurrentTimeMillis)));
        }
        Long l5 = (Long) b().get(key);
        long jLongValue2 = l5 != null ? l5.longValue() : 0L;
        if (b().containsKey(strC)) {
            Long l6 = (Long) b().get(strC);
            jLongValue = l6 != null ? l6.longValue() : 0L;
        } else {
            jLongValue = 1;
        }
        return jLongValue2 <= jCurrentTimeMillis && jLongValue > 0;
    }

    public static HashMap b() {
        return (HashMap) f38293a.getValue();
    }

    public static String c(String str) {
        String strD = d(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        return strD + "-" + calendar.get(5);
    }

    public static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = EncryptUtils.encryptMD5ToString(Uri.parse(str).getPath());
        }
        return G.o("dialog_sp_", str);
    }
}
