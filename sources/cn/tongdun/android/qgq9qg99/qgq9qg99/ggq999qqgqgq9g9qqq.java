package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.content.Context;
import android.text.TextUtils;
import cn.tongdun.android.shell.common.HelperJNI;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.io.File;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class ggq999qqgqgq9g9qqq {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static int f19144q999ggg99999qqggqqg9qg;
    private static String qgq9qg99;

    public static class q999ggg99999qqggqqg9qg implements Runnable {

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        private String f19145q999ggg99999qqggqqg9qg;
        private Context qgq9qg99;

        public q999ggg99999qqggqqg9qg(Context context, String str) {
            this.f19145q999ggg99999qqggqqg9qg = str;
            this.qgq9qg99 = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ggq999qqgqgq9g9qqq.q999ggg99999qqggqqg9qg(this.qgq9qg99, ggq999qqgqgq9g9qqq.qgq9qg99(1, this.f19145q999ggg99999qqggqqg9qg));
                ggq999qqgqgq9g9qqq.gqgg9q99qg9(this.qgq9qg99, ggq999qqgqgq9g9qqq.qgq9qg99(2, this.f19145q999ggg99999qqggqqg9qg));
                if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgq9q9999qg) {
                    ggq999qqgqgq9g9qqq.qqggggg9g9q99q9gq(this.qgq9qg99, ggq999qqgqgq9g9qqq.qgq9qg99(3, this.f19145q999ggg99999qqggqqg9qg));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void gqgg9q99qg9(Context context, String str) {
        cn.tongdun.android.qgq9qg99.qggqgq99q999g.qq9gg99gqqqgqgq999gqg.q999ggg99999qqggqqg9qg(new File(context.getFilesDir().getAbsolutePath(), cn.tongdun.android.qgq9qg99.qggqgq99q999g.gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("3f42085106", 48))), str);
    }

    public static int q999ggg99999qqggqqg9qg() {
        return f19144q999ggg99999qqggqqg9qg;
    }

    public static String qgq9qg99() {
        return qgq9qg99;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String qqggggg9g9q99q9gq() {
        Object objQ999ggg99999qqggqqg9qg;
        ReentrantLock reentrantLock = new ReentrantLock();
        try {
            if (reentrantLock.tryLock(500L, TimeUnit.MILLISECONDS) && (objQ999ggg99999qqggqqg9qg = HelperJNI.q999ggg99999qqggqqg9qg(70, (Object) null)) != null) {
                String str = (String) objQ999ggg99999qqggqqg9qg;
                reentrantLock.unlock();
                return str;
            }
        } catch (Throwable unused) {
        }
        reentrantLock.unlock();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String qgq9qg99(int i7, String str) {
        String str2;
        if (str == null || (str2 = (String) HelperJNI.q999ggg99999qqggqqg9qg(3, new Object[]{Integer.valueOf(i7)})) == null) {
            return null;
        }
        try {
            return new String(cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(str.getBytes(q999ggg99999qqggqqg9qg("64283b623c", 1)), str2.getBytes(q999ggg99999qqggqqg9qg("642e3d643a", 7))), q999ggg99999qqggqqg9qg("6447540d53", HomeDialogState.PRIORITY_HIGHEST));
        } catch (Exception unused) {
            return null;
        }
    }

    private static String qqggggg9g9q99q9gq(int i7, String str) {
        String str2 = (String) HelperJNI.q999ggg99999qqggqqg9qg(3, new Object[]{Integer.valueOf(i7)});
        if (str2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new String(cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99(str.getBytes(q999ggg99999qqggqqg9qg("643c2f7628", 21)), str2.getBytes(q999ggg99999qqggqqg9qg("6430237a24", 25))), q999ggg99999qqggqqg9qg("6426356c32", 15));
        } catch (Throwable th) {
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q99q99qq99q9g, th.getMessage());
            f19144q999ggg99999qqggqqg9qg = (16 << i7) | f19144q999ggg99999qqggqqg9qg;
            return null;
        }
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
            byte b7 = (byte) (i7 ^ 40);
            byte b10 = (byte) (bArr[0] ^ 17);
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

    private static synchronized String qqggggg9g9q99q9gq(Context context) {
        return cn.tongdun.android.qgq9qg99.qggqgq99q999g.qq9gg99gqqqgqgq999gqg.q999ggg99999qqggqqg9qg(new File(context.getFilesDir().getAbsolutePath(), cn.tongdun.android.qgq9qg99.qggqgq99q999g.gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("3f064c1542", 116))));
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:59:0x01db  */
    public static String q999ggg99999qqggqqg9qg(Context context) {
        String str;
        String strQ999ggg99999qqggqqg9qg;
        String strQqggggg9g9q99q9gq;
        f19144q999ggg99999qqggqqg9qg = 0;
        String[] strArr = new String[4];
        cn.tongdun.android.qgq9qg99.qggqgq99q999g.gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(context, new File(context.getFilesDir().getAbsolutePath(), q999ggg99999qqggqqg9qg("3f4a00590e", 56)).getAbsolutePath(), q999ggg99999qqggqqg9qg("65570e0948424b4c5d1e034a0e59", HomeDialogState.PRIORITY_HIGHEST_111));
        cn.tongdun.android.qgq9qg99.qggqgq99q999g.gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("656c353273797077662538713562", 84));
        strArr[0] = "";
        String strQgq9qg99 = cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, cn.tongdun.android.qgq9qg99.qggqgq99q999g.gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("65792027666c656273302d642077", 65)), "");
        if ("".equals(strQgq9qg99)) {
            strQgq9qg99 = null;
        }
        strArr[1] = strQgq9qg99;
        strArr[2] = qqggggg9g9q99q9gq(context);
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgq9q9999qg) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new cn.tongdun.android.q999ggg99999qqggqqg9qg.gqgg9q99qg9.qgq9qg99());
            Future<?> futureSubmit = threadPoolExecutor.submit(new q999qqg(strArr, context));
            try {
                futureSubmit.get(300L, TimeUnit.MILLISECONDS);
                futureSubmit.isDone();
            } catch (Throwable unused) {
            }
            threadPoolExecutor.shutdown();
        } else {
            strArr[3] = null;
        }
        for (int i7 = 1; i7 < 4; i7++) {
            String str2 = strArr[i7];
            if (str2 == null || str2.length() == 0) {
                f19144q999ggg99999qqggqqg9qg |= 1 << i7;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        String[] strArr2 = {null, qqggggg9g9q99q9gq(1, strArr[1]), qqggggg9g9q99q9gq(2, strArr[2]), null};
        if (!cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg(strArr2)) {
            HashMap map = new HashMap();
            for (int i10 = 0; i10 < 4; i10++) {
                String str3 = strArr2[i10];
                if (!TextUtils.isEmpty(str3) && !q999ggg99999qqggqqg9qg("7f3e3c25", 13).equals(str3)) {
                    map.put(str3, map.containsKey(str3) ? Integer.valueOf(((Integer) map.get(str3)).intValue() + 1) : 1);
                }
            }
            TreeMap treeMap = new TreeMap(new q9q9gqgqg9qgqg9qggq9(map));
            treeMap.putAll(map);
            str = (String) treeMap.firstKey();
            Thread thread = new Thread(new q999ggg99999qqggqqg9qg(context, str));
            thread.setName(q999ggg99999qqggqqg9qg("65100a02081a1054", 35));
            thread.start();
            String str4 = strArr2[1];
            if (str4 != null && !str.equals(str4)) {
                f19144q999ggg99999qqggqqg9qg |= 512;
            }
            String str5 = strArr2[2];
            if (str5 != null && !str.equals(str5)) {
                f19144q999ggg99999qqggqqg9qg |= 1024;
            }
            if (!TextUtils.isEmpty(strArr2[1])) {
                sb2.append(strArr2[1]);
            }
            sb2.append(q999ggg99999qqggqqg9qg("32", 87));
            if (!TextUtils.isEmpty(strArr2[2])) {
                strQ999ggg99999qqggqqg9qg = strArr2[2];
            }
            strQqggggg9g9q99q9gq = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgq9q9999qg ? qqggggg9g9q99q9gq(3, strArr[3]) : null;
            if (!TextUtils.isEmpty(strQqggggg9g9q99q9gq)) {
                sb2.append(q999ggg99999qqggqqg9qg("32", 90));
                sb2.append(q999ggg99999qqggqqg9qg("62677046", 85));
                sb2.append(strQqggggg9g9q99q9gq);
            } else if (sb2.toString().equals(q999ggg99999qqggqqg9qg("32", 126))) {
                sb2.delete(0, sb2.length());
            }
            qgq9qg99 = sb2.toString();
            return str;
        }
        str = (String) HelperJNI.q999ggg99999qqggqqg9qg(2, new Object[]{UUID.randomUUID().toString()});
        Thread thread2 = new Thread(new q999ggg99999qqggqqg9qg(context, str));
        thread2.setName(q999ggg99999qqggqqg9qg("651e040c06141e5a", 45));
        thread2.start();
        strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("32", 84);
        sb2.append(strQ999ggg99999qqggqqg9qg);
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgq9q9999qg) {
        }
        if (!TextUtils.isEmpty(strQqggggg9g9q99q9gq)) {
            sb2.append(q999ggg99999qqggqqg9qg("32", 90));
            sb2.append(q999ggg99999qqggqqg9qg("62677046", 85));
            sb2.append(strQqggggg9g9q99q9gq);
        } else if (sb2.toString().equals(q999ggg99999qqggqqg9qg("32", 126))) {
            sb2.delete(0, sb2.length());
        }
        qgq9qg99 = sb2.toString();
        return str;
    }

    public static /* synthetic */ void qqggggg9g9q99q9gq(Context context, String str) {
        ReentrantLock reentrantLock = new ReentrantLock();
        try {
            if (reentrantLock.tryLock(500L, TimeUnit.MILLISECONDS)) {
                HelperJNI.q999ggg99999qqggqqg9qg(69, new Object[]{str});
            }
            reentrantLock.unlock();
        } catch (Throwable unused) {
            reentrantLock.unlock();
        }
    }

    public static /* synthetic */ void q999ggg99999qqggqqg9qg(Context context, String str) {
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, cn.tongdun.android.qgq9qg99.qggqgq99q999g.gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("65653c3b7a70797e6f2c31783c6b", 93)), str);
    }
}
