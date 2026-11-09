package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.content.Context;
import android.text.TextUtils;
import cn.tongdun.android.shell.FMAgent;
import cn.tongdun.android.shell.common.HelperJNI;
import com.adjust.sdk.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class qgq9qg99 {
    private static volatile qgq9qg99 qgq9qg99;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private volatile q999ggg99999qqggqqg9qg f19108q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg.f19109q999ggg99999qqggqqg9qg;
    private final Object qqggggg9g9q99q9gq = new Object();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class q999ggg99999qqggqqg9qg {

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        public static final q999ggg99999qqggqqg9qg f19109q999ggg99999qqggqqg9qg = new q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("3b50414e554f5d4750405c5e4d4c", 69), 0);
        public static final q999ggg99999qqggqqg9qg qgq9qg99 = new q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("3b12030c170d1f0515041b140e060e", 7), 1);
        public static final q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq = new q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("3b32232c372d3f25392b3e272e", 39), 2);
        public static final q999ggg99999qqggqqg9qg gqgg9q99qg9 = new q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("3b73626d766c7e6479636473696b66697b656a67", 102), 3);
        public static final q999ggg99999qqggqqg9qg qgqq999g = new q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("3b6e7f706b7163796562776664687e", 123), 4);
        public static final q999ggg99999qqggqqg9qg qg9gqgqqggg9q9qg = new q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("3b0819160d17051f081802120010030213", 29), 5);
        public static final q999ggg99999qqggqqg9qg gqg99q9q9q = new q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("3b66777863796b71676c6b7a607a786b7a62657e6a68", 115), 6);
        public static final q999ggg99999qqggqqg9qg q9q999qgg99gq9qq9qqq9g = new q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("3b71606f746e7c667c626d607379676865", 100), 7);

        private q999ggg99999qqggqqg9qg(String str, int i7) {
            super(str, i7);
        }

        private static String q999ggg99999qqggqqg9qg(String str, int i7) {
            try {
                int length = str.length() / 2;
                char[] charArray = str.toCharArray();
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 << 1;
                    bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
                }
                byte b7 = (byte) (i7 ^ 4);
                byte b10 = (byte) (bArr[0] ^ 122);
                bArr[0] = b10;
                for (int i12 = 1; i12 < length; i12++) {
                    b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                    bArr[i12] = b10;
                }
                return new String(bArr, Constants.ENCODING);
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }
    }

    private qgq9qg99() {
    }

    private static String gqgg9q99qg9(Context context) {
        return cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg("7368796b", 10)) ? "" : cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, q999ggg99999qqggqqg9qg("77643d38656f", 7), "");
    }

    public static qgq9qg99 q999ggg99999qqggqqg9qg() {
        if (qgq9qg99 == null) {
            synchronized (qgq9qg99.class) {
                try {
                    if (qgq9qg99 == null) {
                        qgq9qg99 = new qgq9qg99();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qgq9qg99;
    }

    public static void qgq9qg99(Context context) {
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg("730b1a08", 105))) {
            return;
        }
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("77623b3e6369", 1), "");
    }

    private long qgqq999g(Context context) {
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg("73322331", 80))) {
            return 0L;
        }
        String strGqgg9q99qg9 = gqgg9q99qg9(context);
        if (!TextUtils.isEmpty(strGqgg9q99qg9) && strGqgg9q99qg9.contains(q999ggg99999qqggqqg9qg("275f", 44))) {
            try {
                return Long.parseLong(strGqgg9q99qg9.substring(strGqgg9q99qg9.indexOf(q999ggg99999qqggqqg9qg("276d", 30)) + 2));
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public final void qqggggg9g9q99q9gq() {
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg("73273624", 69))) {
            return;
        }
        this.f19108q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg.f19109q999ggg99999qqggqqg9qg;
    }

    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 115);
            byte b10 = (byte) (bArr[0] ^ 3);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public final boolean qgq9qg99() {
        boolean z3;
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg("7319081a", 123))) {
            return false;
        }
        synchronized (this.qqggggg9g9q99q9gq) {
            z3 = !this.f19108q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg.f19109q999ggg99999qqggqqg9qg);
        }
        return z3;
    }

    public final void qqggggg9g9q99q9gq(Context context) {
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg("736c7d6f", 14))) {
            return;
        }
        if (this.f19108q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg.qgqq999g)) {
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.ggq999qqgqgq9g9qqq;
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg enumC0015q999ggg99999qqggqqg9qg = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.f19272q999ggg99999qqggqqg9qg;
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar, enumC0015q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg());
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(enumC0015q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg());
            return;
        }
        if (this.f19108q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg.gqg99q9q9q)) {
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar2 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.g9g9ggqqggqq99gqq9q99;
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg enumC0015q999ggg99999qqggqqg9qg2 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.q9q999qgg99gq9qq9qqq9g;
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar2, enumC0015q999ggg99999qqggqqg9qg2.q999ggg99999qqggqqg9qg());
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(enumC0015q999ggg99999qqggqqg9qg2.q999ggg99999qqggqqg9qg());
            return;
        }
        if (this.f19108q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg)) {
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar3 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.g99gq9qg9gggq9qgg;
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg enumC0015q999ggg99999qqggqqg9qg3 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.qgqq999g;
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar3, enumC0015q999ggg99999qqggqqg9qg3.q999ggg99999qqggqqg9qg());
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(enumC0015q999ggg99999qqggqqg9qg3.q999ggg99999qqggqqg9qg());
            return;
        }
        if (this.f19108q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg.gqgg9q99qg9)) {
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar4 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999qqg;
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg enumC0015q999ggg99999qqggqqg9qg4 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.gqgg9q99qg9;
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar4, enumC0015q999ggg99999qqggqqg9qg4.q999ggg99999qqggqqg9qg());
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(enumC0015q999ggg99999qqggqqg9qg4.q999ggg99999qqggqqg9qg());
            if (context != null && qqg999qq.q999ggg99999qqggqqg9qg(context)) {
                throw new IllegalArgumentException(enumC0015q999ggg99999qqggqqg9qg4.q999ggg99999qqggqqg9qg());
            }
            return;
        }
        if (this.f19108q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg.q9q999qgg99gq9qq9qqq9g)) {
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar5 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qg9qqq999gq;
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg enumC0015q999ggg99999qqggqqg9qg5 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.gqg99q9q9q;
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar5, enumC0015q999ggg99999qqggqqg9qg5.q999ggg99999qqggqqg9qg());
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(enumC0015q999ggg99999qqggqqg9qg5.q999ggg99999qqggqqg9qg());
            if (context != null && qqg999qq.q999ggg99999qqggqqg9qg(context)) {
                throw new IllegalArgumentException(enumC0015q999ggg99999qqggqqg9qg5.q999ggg99999qqggqqg9qg());
            }
            return;
        }
        if (this.f19108q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq)) {
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q9q9gqgqg9qgqg9qggq9, cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg());
            return;
        }
        cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar6 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q9q9gqgqg9qgqg9qggq9;
        cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg enumC0015q999ggg99999qqggqqg9qg6 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.qgq9qg99;
        cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar6, enumC0015q999ggg99999qqggqqg9qg6.q999ggg99999qqggqqg9qg());
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(enumC0015q999ggg99999qqggqqg9qg6.q999ggg99999qqggqqg9qg());
    }

    public static void q999ggg99999qqggqqg9qg(Context context) {
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg("73726371", 16))) {
            return;
        }
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("77461f1a474d", 37), String.format(Locale.US, q999ggg99999qqggqqg9qg("2628297e7f28", 13), cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9g9q9qq9, String.valueOf(System.currentTimeMillis())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        if ((java.lang.System.currentTimeMillis() - qgqq999g(r5)) > 7200000) goto L41;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg qgq9qg99(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg
            java.lang.String r1 = "735d4c5e"
            r2 = 63
            java.lang.String r1 = q999ggg99999qqggqqg9qg(r1, r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13
            cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99$q999ggg99999qqggqqg9qg r5 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg.f19109q999ggg99999qqggqqg9qg
            return r5
        L13:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L1c
            cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99$q999ggg99999qqggqqg9qg r5 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq
            return r5
        L1c:
            r0 = 58
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.Object r0 = cn.tongdun.android.shell.common.HelperJNI.q999ggg99999qqggqqg9qg(r0, r1)
            if (r0 == 0) goto Lbc
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L33
            cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99$q999ggg99999qqggqqg9qg r5 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg.gqgg9q99qg9
            return r5
        L33:
            java.lang.String r0 = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg
            java.lang.String r1 = "736c7d6f"
            r2 = 14
            java.lang.String r1 = q999ggg99999qqggqqg9qg(r1, r2)
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = ""
            if (r0 == 0) goto L46
            goto L70
        L46:
            java.lang.String r0 = gqgg9q99qg9(r5)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L70
            java.lang.String r2 = "274e"
            r3 = 61
            java.lang.String r2 = q999ggg99999qqggqqg9qg(r2, r3)
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L5f
            goto L70
        L5f:
            java.lang.String r1 = "272e"
            r2 = 93
            java.lang.String r1 = q999ggg99999qqggqqg9qg(r1, r2)
            int r1 = r0.indexOf(r1)
            r2 = 0
            java.lang.String r1 = r0.substring(r2, r1)
        L70:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lb9
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto Lb9
            java.lang.String r6 = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg
            java.lang.String r0 = "732a3b29"
            r1 = 72
            java.lang.String r0 = q999ggg99999qqggqqg9qg(r0, r1)
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto Lb6
            java.lang.String r6 = gqgg9q99qg9(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto Lb9
            java.lang.String r0 = "2731"
            r1 = 66
            java.lang.String r0 = q999ggg99999qqggqqg9qg(r0, r1)
            boolean r6 = r6.contains(r0)
            if (r6 != 0) goto La5
            goto Lb9
        La5:
            long r5 = r4.qgqq999g(r5)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r5
            r5 = 7200000(0x6ddd00, double:3.5572727E-317)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto Lb6
            goto Lb9
        Lb6:
            cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99$q999ggg99999qqggqqg9qg r5 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg.qgqq999g
            return r5
        Lb9:
            cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99$q999ggg99999qqggqqg9qg r5 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg.f19109q999ggg99999qqggqqg9qg
            return r5
        Lbc:
            cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99$q999ggg99999qqggqqg9qg r5 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg.q9q999qgg99gq9qq9qqq9g
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.qgq9qg99(android.content.Context, java.lang.String):cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99$q999ggg99999qqggqqg9qg");
    }

    public static void q999ggg99999qqggqqg9qg(Context context, String str) {
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg("73011002", 99))) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (qqg999qq.q999ggg99999qqggqqg9qg(context)) {
                if (FMAgent.mFMGetBlackBoxCodeCallback != null) {
                    new cn.tongdun.android.shell.common.qgqq999g();
                    cn.tongdun.android.shell.common.qg9gqgqqggg9q9qg qg9gqgqqggg9q9qgVarQgq9qg99 = cn.tongdun.android.shell.common.qgqq999g.qgq9qg99(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg());
                    if (qg9gqgqqggg9q9qgVarQgq9qg99 != null) {
                        FMAgent.mFMGetBlackBoxCodeCallback.onResult(qg9gqgqqggg9q9qgVarQgq9qg99.f19275q999ggg99999qqggqqg9qg, qg9gqgqqggg9q9qgVarQgq9qg99.qgq9qg99);
                    }
                }
                throw new IllegalArgumentException(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg());
            }
            return;
        }
        Object objQ999ggg99999qqggqqg9qg = HelperJNI.q999ggg99999qqggqqg9qg(58, new Object[]{str});
        if (objQ999ggg99999qqggqqg9qg == null) {
            if (qqg999qq.q999ggg99999qqggqqg9qg(context)) {
                if (FMAgent.mFMGetBlackBoxCodeCallback != null) {
                    new cn.tongdun.android.shell.common.qgqq999g();
                    cn.tongdun.android.shell.common.qg9gqgqqggg9q9qg qg9gqgqqggg9q9qgVarQgq9qg910 = cn.tongdun.android.shell.common.qgqq999g.qgq9qg99(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg());
                    if (qg9gqgqqggg9q9qgVarQgq9qg910 != null) {
                        FMAgent.mFMGetBlackBoxCodeCallback.onResult(qg9gqgqqggg9q9qgVarQgq9qg910.f19275q999ggg99999qqggqqg9qg, qg9gqgqqggg9q9qgVarQgq9qg910.qgq9qg99);
                    }
                }
                throw new IllegalArgumentException(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg());
            }
            return;
        }
        if (((Boolean) objQ999ggg99999qqggqqg9qg).booleanValue() || !qqg999qq.q999ggg99999qqggqqg9qg(context)) {
            return;
        }
        if (FMAgent.mFMGetBlackBoxCodeCallback != null) {
            new cn.tongdun.android.shell.common.qgqq999g();
            cn.tongdun.android.shell.common.qg9gqgqqggg9q9qg qg9gqgqqggg9q9qgVarQgq9qg911 = cn.tongdun.android.shell.common.qgqq999g.qgq9qg99(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.gqgg9q99qg9.q999ggg99999qqggqqg9qg());
            if (qg9gqgqqggg9q9qgVarQgq9qg911 != null) {
                FMAgent.mFMGetBlackBoxCodeCallback.onResult(qg9gqgqqggg9q9qgVarQgq9qg911.f19275q999ggg99999qqggqqg9qg, qg9gqgqqggg9q9qgVarQgq9qg911.qgq9qg99);
            }
        }
        throw new IllegalArgumentException(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.EnumC0015q999ggg99999qqggqqg9qg.gqgg9q99qg9.q999ggg99999qqggqqg9qg());
    }

    public final void q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar) {
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg("7339283a", 91))) {
            return;
        }
        synchronized (this.qqggggg9g9q99q9gq) {
            this.f19108q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qgVar;
        }
    }
}
