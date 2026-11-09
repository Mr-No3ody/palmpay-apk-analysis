package Pa;

import android.text.TextUtils;
import com.alibaba.android.arouter.utils.Consts;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E {
    static {
        BigDecimal.valueOf(10000000000L);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026 A[Catch: NumberFormatException -> 0x0037, TryCatch #0 {NumberFormatException -> 0x0037, blocks: (B:3:0x0003, B:6:0x000a, B:14:0x001c, B:16:0x0026, B:18:0x0032, B:17:0x002e, B:12:0x0017, B:9:0x0011), top: B:32:0x0003, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x002e A[Catch: NumberFormatException -> 0x0037, TryCatch #0 {NumberFormatException -> 0x0037, blocks: (B:3:0x0003, B:6:0x000a, B:14:0x001c, B:16:0x0026, B:18:0x0032, B:17:0x002e, B:12:0x0017, B:9:0x0011), top: B:32:0x0003, inners: #1 }] */
    public static String a(String str) {
        String plainString;
        double d2;
        BigDecimal bigDecimalValueOf;
        BigDecimal bigDecimalStripTrailingZeros;
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            if (TextUtils.isEmpty(str)) {
                d2 = 0.0d;
                bigDecimalValueOf = BigDecimal.valueOf(d2);
                if (bigDecimalValueOf.signum() == 0) {
                    bigDecimalStripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
                } else {
                    bigDecimalStripTrailingZeros = bigDecimalValueOf.stripTrailingZeros();
                }
                plainString = bigDecimalStripTrailingZeros.toPlainString();
            } else {
                try {
                    d2 = Double.parseDouble(str);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    d2 = 0.0d;
                }
                bigDecimalValueOf = BigDecimal.valueOf(d2);
                if (bigDecimalValueOf.signum() == 0) {
                    bigDecimalStripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
                } else {
                    bigDecimalStripTrailingZeros = bigDecimalValueOf.stripTrailingZeros();
                }
                plainString = bigDecimalStripTrailingZeros.toPlainString();
            }
        } catch (NumberFormatException unused) {
            plainString = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
        }
        if (TextUtils.isEmpty(plainString)) {
            return "0";
        }
        return (plainString.endsWith(".00") || plainString.endsWith(".0")) ? plainString.substring(0, plainString.lastIndexOf(Consts.DOT)) : plainString;
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }
}
