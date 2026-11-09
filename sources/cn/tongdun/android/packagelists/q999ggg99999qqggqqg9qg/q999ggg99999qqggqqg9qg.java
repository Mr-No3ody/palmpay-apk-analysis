package cn.tongdun.android.packagelists.q999ggg99999qqggqqg9qg;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static StringBuilder f19072q999ggg99999qqggqqg9qg;
    private static final String[] qgq9qg99 = {q999ggg99999qqggqqg9qg("25414f0e0242475b504b4007", 89), q999ggg99999qqggqqg9qg("251f11505a1b131b181a58", 7), q999ggg99999qqggqqg9qg("251a14554912021b191a141655", 2), q999ggg99999qqggqqg9qg("212a222a292b696d2d28343f242f68", 54), q999ggg99999qqggqqg9qg("25000e4f4a11181a1e004b", 24), q999ggg99999qqggqqg9qg("251816575710080853", 0), q999ggg99999qqggqqg9qg("251b155441061f19151350", 3), q999ggg99999qqggqqg9qg("250f01405b1c1c1a42", 23), q999ggg99999qqggqqg9qg("250d0342401e011e40", 21), q999ggg99999qqggqqg9qg("25010f4e501f01130b160444", 25), q999ggg99999qqggqqg9qg("251e10514f04145f5d1d18040f141f58", 6), q999ggg99999qqggqqg9qg("253d337273383a30282870", 37), q999ggg99999qqggqqg9qg("2508064753081d07050d4d", 16), q999ggg99999qqggqqg9qg("25737d3c3671797e747f34", 107), q999ggg99999qqggqqg9qg("254d43020348504319", 85), q999ggg99999qqggqqg9qg("2517195854161e0b17005b", 15), q999ggg99999qqggqqg9qg("257b7534207b6c766b2a", 99), q999ggg99999qqggqqg9qg("255d53120c4d5046", 69), q999ggg99999qqggqqg9qg("25050b4a4f151e44", 29), q999ggg99999qqggqqg9qg("25292766712b346e", 49), q999ggg99999qqggqqg9qg("252c226363282c3d217b", 52), q999ggg99999qqggqqg9qg("25020c4d4d021d0a1d070e4c", 26), q999ggg99999qqggqqg9qg("25353b7a7b323b72", 45), q999ggg99999qqggqqg9qg("257b75343d7c776e", 99), q999ggg99999qqggqqg9qg("25636d2c2e6e647a73766932", 123), q999ggg99999qqggqqg9qg("252a2465652e2a35297d", 50), q999ggg99999qqggqqg9qg("25131d5c591e050914020954", 11), q999ggg99999qqggqqg9qg("250e00415d1a001c59", 22), q999ggg99999qqggqqg9qg("25323c7d672039372d2f383578", 42), q999ggg99999qqggqqg9qg("25616f2e2e6f767670706e6022", 121), q999ggg99999qqggqqg9qg("25642929727e626126", 125), q999ggg99999qqggqqg9qg("25707e3f266b73", 104), q999ggg99999qqggqqg9qg("25707e3f227e676f6337", 104), q999ggg99999qqggqqg9qg("25252b6a7437253a2f34333b26", 61), q999ggg99999qqggqqg9qg("252d2362752e3d66", 53), q999ggg99999qqggqqg9qg("257d7332386466717a706c627e78733a", 101), q999ggg99999qqggqqg9qg("256c62232b73736b7972696022", 116), q999ggg99999qqggqqg9qg("256d63223e79637f3a", 117), q999ggg99999qqggqqg9qg("250f01404b1714030b0b48", 23), q999ggg99999qqggqqg9qg("25717f3e326f7b7b20", 105), q999ggg99999qqggqqg9qg("251e10514e051617141f0445", 6), q999ggg99999qqggqqg9qg("25696726286e6c6a6c6a62646c2c", 113), q999ggg99999qqggqqg9qg("254f41000e4f4358524d06", 87), q999ggg99999qqggqqg9qg("25757b3a36757d777138", 109), q999ggg99999qqggqqg9qg("25090746460d04080d10140b40", 17)};
    private static final String[] qqggggg9g9q99q9gq = {q999ggg99999qqggqqg9qg("682360606e", 122)};
    private static final String[] gqgg9q99qg9 = {q999ggg99999qqggqqg9qg("0546606168515866647e78652a", 121)};
    private static final ReentrantLock qgqq999g = new ReentrantLock();
    private static final HashMap qg9gqgqqggg9q9qg = new HashMap();

    public static PackageInfo q999ggg99999qqggqqg9qg(String str) {
        try {
            ReentrantLock reentrantLock = qgqq999g;
            if (reentrantLock.tryLock(50L, TimeUnit.MILLISECONDS)) {
                if (TextUtils.isEmpty(str)) {
                    reentrantLock.unlock();
                    return null;
                }
                PackageInfo packageInfo = (PackageInfo) qg9gqgqqggg9q9qg.get(str);
                PackageInfo packageInfo2 = packageInfo != null ? packageInfo : null;
                reentrantLock.unlock();
                return packageInfo2;
            }
            reentrantLock.unlock();
        } catch (Throwable unused) {
            qgqq999g.unlock();
        }
        return null;
    }

    public static void qgq9qg99() {
    }

    public static String q999ggg99999qqggqqg9qg() {
        StringBuilder sb2 = f19072q999ggg99999qqggqqg9qg;
        if (sb2 == null) {
            return "";
        }
        String string = sb2.toString();
        if (string.length() <= 0 || !string.contains(q999ggg99999qqggqqg9qg("6a", 41))) {
            return string;
        }
        return (string.endsWith(q999ggg99999qqggqqg9qg("6a", 23)) || string.endsWith(q999ggg99999qqggqqg9qg("7c", 23)) || string.endsWith(q999ggg99999qqggqqg9qg("6c", 25))) ? string.substring(0, string.lastIndexOf(q999ggg99999qqggqqg9qg("6a", 105))) : string;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0162 A[EDGE_INSN: B:100:0x0162->B:81:0x0162 BREAK  A[LOOP:1: B:29:0x008f->B:80:0x015f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0119 A[Catch: all -> 0x01bc, TryCatch #0 {all -> 0x01bc, blocks: (B:3:0x0005, B:8:0x0010, B:10:0x0029, B:13:0x0030, B:15:0x0038, B:17:0x003c, B:19:0x0042, B:21:0x0050, B:22:0x0057, B:25:0x0078, B:28:0x0084, B:29:0x008f, B:32:0x0097, B:34:0x009f, B:36:0x00b0, B:38:0x00b4, B:41:0x00be, B:43:0x00c4, B:45:0x00ca, B:47:0x00d2, B:49:0x00da, B:50:0x00e2, B:55:0x00f6, B:57:0x00fc, B:60:0x0106, B:62:0x010b, B:51:0x00e6, B:53:0x00f2, B:64:0x0119, B:66:0x011e, B:68:0x0124, B:74:0x0133, B:76:0x0139, B:78:0x0141, B:79:0x014c, B:71:0x012d, B:81:0x0162, B:82:0x016a, B:84:0x0170, B:86:0x0183, B:88:0x018b, B:89:0x0196, B:90:0x01b0, B:23:0x005a), top: B:95:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x011e A[Catch: all -> 0x01bc, TryCatch #0 {all -> 0x01bc, blocks: (B:3:0x0005, B:8:0x0010, B:10:0x0029, B:13:0x0030, B:15:0x0038, B:17:0x003c, B:19:0x0042, B:21:0x0050, B:22:0x0057, B:25:0x0078, B:28:0x0084, B:29:0x008f, B:32:0x0097, B:34:0x009f, B:36:0x00b0, B:38:0x00b4, B:41:0x00be, B:43:0x00c4, B:45:0x00ca, B:47:0x00d2, B:49:0x00da, B:50:0x00e2, B:55:0x00f6, B:57:0x00fc, B:60:0x0106, B:62:0x010b, B:51:0x00e6, B:53:0x00f2, B:64:0x0119, B:66:0x011e, B:68:0x0124, B:74:0x0133, B:76:0x0139, B:78:0x0141, B:79:0x014c, B:71:0x012d, B:81:0x0162, B:82:0x016a, B:84:0x0170, B:86:0x0183, B:88:0x018b, B:89:0x0196, B:90:0x01b0, B:23:0x005a), top: B:95:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0124 A[Catch: all -> 0x01bc, TryCatch #0 {all -> 0x01bc, blocks: (B:3:0x0005, B:8:0x0010, B:10:0x0029, B:13:0x0030, B:15:0x0038, B:17:0x003c, B:19:0x0042, B:21:0x0050, B:22:0x0057, B:25:0x0078, B:28:0x0084, B:29:0x008f, B:32:0x0097, B:34:0x009f, B:36:0x00b0, B:38:0x00b4, B:41:0x00be, B:43:0x00c4, B:45:0x00ca, B:47:0x00d2, B:49:0x00da, B:50:0x00e2, B:55:0x00f6, B:57:0x00fc, B:60:0x0106, B:62:0x010b, B:51:0x00e6, B:53:0x00f2, B:64:0x0119, B:66:0x011e, B:68:0x0124, B:74:0x0133, B:76:0x0139, B:78:0x0141, B:79:0x014c, B:71:0x012d, B:81:0x0162, B:82:0x016a, B:84:0x0170, B:86:0x0183, B:88:0x018b, B:89:0x0196, B:90:0x01b0, B:23:0x005a), top: B:95:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x012d A[Catch: all -> 0x01bc, LOOP:4: B:67:0x0122->B:71:0x012d, LOOP_END, TryCatch #0 {all -> 0x01bc, blocks: (B:3:0x0005, B:8:0x0010, B:10:0x0029, B:13:0x0030, B:15:0x0038, B:17:0x003c, B:19:0x0042, B:21:0x0050, B:22:0x0057, B:25:0x0078, B:28:0x0084, B:29:0x008f, B:32:0x0097, B:34:0x009f, B:36:0x00b0, B:38:0x00b4, B:41:0x00be, B:43:0x00c4, B:45:0x00ca, B:47:0x00d2, B:49:0x00da, B:50:0x00e2, B:55:0x00f6, B:57:0x00fc, B:60:0x0106, B:62:0x010b, B:51:0x00e6, B:53:0x00f2, B:64:0x0119, B:66:0x011e, B:68:0x0124, B:74:0x0133, B:76:0x0139, B:78:0x0141, B:79:0x014c, B:71:0x012d, B:81:0x0162, B:82:0x016a, B:84:0x0170, B:86:0x0183, B:88:0x018b, B:89:0x0196, B:90:0x01b0, B:23:0x005a), top: B:95:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0133 A[Catch: all -> 0x01bc, TryCatch #0 {all -> 0x01bc, blocks: (B:3:0x0005, B:8:0x0010, B:10:0x0029, B:13:0x0030, B:15:0x0038, B:17:0x003c, B:19:0x0042, B:21:0x0050, B:22:0x0057, B:25:0x0078, B:28:0x0084, B:29:0x008f, B:32:0x0097, B:34:0x009f, B:36:0x00b0, B:38:0x00b4, B:41:0x00be, B:43:0x00c4, B:45:0x00ca, B:47:0x00d2, B:49:0x00da, B:50:0x00e2, B:55:0x00f6, B:57:0x00fc, B:60:0x0106, B:62:0x010b, B:51:0x00e6, B:53:0x00f2, B:64:0x0119, B:66:0x011e, B:68:0x0124, B:74:0x0133, B:76:0x0139, B:78:0x0141, B:79:0x014c, B:71:0x012d, B:81:0x0162, B:82:0x016a, B:84:0x0170, B:86:0x0183, B:88:0x018b, B:89:0x0196, B:90:0x01b0, B:23:0x005a), top: B:95:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0139 A[Catch: all -> 0x01bc, TryCatch #0 {all -> 0x01bc, blocks: (B:3:0x0005, B:8:0x0010, B:10:0x0029, B:13:0x0030, B:15:0x0038, B:17:0x003c, B:19:0x0042, B:21:0x0050, B:22:0x0057, B:25:0x0078, B:28:0x0084, B:29:0x008f, B:32:0x0097, B:34:0x009f, B:36:0x00b0, B:38:0x00b4, B:41:0x00be, B:43:0x00c4, B:45:0x00ca, B:47:0x00d2, B:49:0x00da, B:50:0x00e2, B:55:0x00f6, B:57:0x00fc, B:60:0x0106, B:62:0x010b, B:51:0x00e6, B:53:0x00f2, B:64:0x0119, B:66:0x011e, B:68:0x0124, B:74:0x0133, B:76:0x0139, B:78:0x0141, B:79:0x014c, B:71:0x012d, B:81:0x0162, B:82:0x016a, B:84:0x0170, B:86:0x0183, B:88:0x018b, B:89:0x0196, B:90:0x01b0, B:23:0x005a), top: B:95:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0141 A[Catch: all -> 0x01bc, TryCatch #0 {all -> 0x01bc, blocks: (B:3:0x0005, B:8:0x0010, B:10:0x0029, B:13:0x0030, B:15:0x0038, B:17:0x003c, B:19:0x0042, B:21:0x0050, B:22:0x0057, B:25:0x0078, B:28:0x0084, B:29:0x008f, B:32:0x0097, B:34:0x009f, B:36:0x00b0, B:38:0x00b4, B:41:0x00be, B:43:0x00c4, B:45:0x00ca, B:47:0x00d2, B:49:0x00da, B:50:0x00e2, B:55:0x00f6, B:57:0x00fc, B:60:0x0106, B:62:0x010b, B:51:0x00e6, B:53:0x00f2, B:64:0x0119, B:66:0x011e, B:68:0x0124, B:74:0x0133, B:76:0x0139, B:78:0x0141, B:79:0x014c, B:71:0x012d, B:81:0x0162, B:82:0x016a, B:84:0x0170, B:86:0x0183, B:88:0x018b, B:89:0x0196, B:90:0x01b0, B:23:0x005a), top: B:95:0x0005 }] */
    public static String q999ggg99999qqggqqg9qg(Context context) {
        String str;
        ApplicationInfo applicationInfo;
        String str2;
        String[] strArr;
        int length;
        int i7;
        boolean z3;
        ReentrantLock reentrantLock = qgqq999g;
        reentrantLock.lock();
        try {
            if (!cn.tongdun.android.packagelists.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context)) {
                reentrantLock.unlock();
                return null;
            }
            f19072q999ggg99999qqggqqg9qg = new StringBuilder();
            String strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("6b", 4);
            PackageManager packageManager = context.getPackageManager();
            List installedPackages = packageManager.getInstalledPackages(0);
            if (installedPackages == null || installedPackages.size() == 0) {
                Intent intent = new Intent(q999ggg99999qqggqqg9qg("27101509021912555818050e140545501d0802191e5f7c131718", 11));
                intent.addCategory(q999ggg99999qqggqqg9qg("272a2f333823286f62223f342e3f7f68273034272d382e724728313e282e2832", 49));
                installedPackages = packageManager.queryIntentActivities(intent, 0);
            } else {
                HashMap map = qg9gqgqqggg9q9qg;
                if (map.size() > 0) {
                    map.clear();
                }
                for (int i10 = 0; i10 < installedPackages.size(); i10++) {
                    PackageInfo packageInfo = (PackageInfo) installedPackages.get(i10);
                    if (!TextUtils.isEmpty(packageInfo.packageName)) {
                        qg9gqgqqggg9q9qg.put(packageInfo.packageName, packageInfo);
                    }
                }
            }
            if (installedPackages == null) {
                String string = f19072q999ggg99999qqggqqg9qg.toString();
                qgqq999g.unlock();
                return string;
            }
            HashMap map2 = new HashMap();
            int i11 = 0;
            String str3 = null;
            for (Object obj : installedPackages) {
                if (obj instanceof ResolveInfo) {
                    applicationInfo = ((ResolveInfo) obj).activityInfo.applicationInfo;
                    str = ((ResolveInfo) obj).activityInfo.packageName;
                } else {
                    str = str3;
                    applicationInfo = null;
                }
                if (obj instanceof PackageInfo) {
                    applicationInfo = ((PackageInfo) obj).applicationInfo;
                    str2 = applicationInfo.packageName;
                } else {
                    str2 = str;
                }
                if (applicationInfo != null) {
                    boolean z8 = true;
                    if ((applicationInfo.flags & 1) > 0) {
                        String[] strArr2 = qgq9qg99;
                        int length2 = strArr2.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length2) {
                                z3 = false;
                                break;
                            }
                            String str4 = strArr2[i12];
                            if (str2.startsWith(str4)) {
                                String str5 = (String) map2.get(str4);
                                map2.put(str4, str5 == null ? q999ggg99999qqggqqg9qg("77", 88) : Integer.toString(Integer.parseInt(str5) + 1));
                                z3 = true;
                                break;
                            }
                            i12++;
                        }
                        for (String str6 : qqggggg9g9q99q9gq) {
                            if (str2.endsWith(str6)) {
                                z3 = true;
                                break;
                            }
                        }
                        if (!z3 && !q999ggg99999qqggqqg9qg("2742475b504b40", 89).equals(str2)) {
                            if ((applicationInfo.flags & 1) <= 0) {
                                strArr = gqgg9q99qg9;
                                length = strArr.length;
                                i7 = 0;
                                while (true) {
                                    if (i7 < length) {
                                        z8 = false;
                                        break;
                                    }
                                    if (str2.startsWith(strArr[i7])) {
                                        break;
                                    }
                                    i7++;
                                }
                                if (z8) {
                                    i11++;
                                    if (i11 <= 100) {
                                        break;
                                    }
                                    if (f19072q999ggg99999qqggqqg9qg.length() > 0) {
                                        f19072q999ggg99999qqggqqg9qg.append(q999ggg99999qqggqqg9qg("6a", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP));
                                    }
                                    StringBuilder sb2 = f19072q999ggg99999qqggqqg9qg;
                                    sb2.append(str2);
                                    sb2.append(q999ggg99999qqggqqg9qg("7c", 23));
                                    sb2.append(strQ999ggg99999qqggqqg9qg);
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    } else if ((applicationInfo.flags & 1) <= 0) {
                        strArr = gqgg9q99qg9;
                        length = strArr.length;
                        i7 = 0;
                        while (true) {
                            if (i7 < length) {
                                z8 = false;
                                break;
                            }
                            if (str2.startsWith(strArr[i7])) {
                                break;
                                break;
                            }
                            i7++;
                        }
                        if (z8) {
                            i11++;
                            if (i11 <= 100) {
                                break;
                                break;
                            }
                            if (f19072q999ggg99999qqggqqg9qg.length() > 0) {
                                f19072q999ggg99999qqggqqg9qg.append(q999ggg99999qqggqqg9qg("6a", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP));
                            }
                            StringBuilder sb3 = f19072q999ggg99999qqggqqg9qg;
                            sb3.append(str2);
                            sb3.append(q999ggg99999qqggqqg9qg("7c", 23));
                            sb3.append(strQ999ggg99999qqggqqg9qg);
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                str3 = str2;
            }
            for (String str7 : map2.keySet()) {
                if (Integer.parseInt((String) map2.get(str7)) > 5) {
                    if (f19072q999ggg99999qqggqqg9qg.length() > 0) {
                        f19072q999ggg99999qqggqqg9qg.append(q999ggg99999qqggqqg9qg("6a", 36));
                    }
                    StringBuilder sb4 = f19072q999ggg99999qqggqqg9qg;
                    sb4.append(str7);
                    sb4.append(q999ggg99999qqggqqg9qg("6c", 113));
                    sb4.append((String) map2.get(str7));
                }
            }
            String string2 = f19072q999ggg99999qqggqqg9qg.toString();
            qgqq999g.unlock();
            return string2;
        } catch (Throwable unused) {
            qgqq999g.unlock();
            return f19072q999ggg99999qqggqqg9qg.toString();
        }
    }

    public static String q999ggg99999qqggqqg9qg(Context context, ActivityManager activityManager) {
        if (context == null || activityManager == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(Integer.MAX_VALUE);
        if (runningTasks == null || runningTasks.size() == 0) {
            return sb2.toString();
        }
        Iterator<ActivityManager.RunningTaskInfo> it = runningTasks.iterator();
        while (it.hasNext()) {
            String packageName = it.next().baseActivity.getPackageName();
            if (sb2.length() > 0) {
                sb2.append(q999ggg99999qqggqqg9qg("6a", 61));
            }
            sb2.append(packageName);
        }
        return sb2.toString();
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
            byte b7 = (byte) (i7 ^ 20);
            byte b10 = (byte) (bArr[0] ^ 70);
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
