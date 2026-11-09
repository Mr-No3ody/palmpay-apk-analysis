package cn.tongdun.android.shell.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.camera.video.u;
import cn.tongdun.android.qgq9qg99.qggqgq99q999g.qqg999qq;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public final class qgq9qg99 {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static boolean f19276q999ggg99999qqggqqg9qg = false;
    private static boolean qgq9qg99 = false;

    private static String gqg99q9q9q(Context context) {
        try {
            return cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("716c69757e656e58556e", 3));
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    private static int gqgg9q99qg9(Context context) throws Throwable {
        if (context == null) {
            return -1;
        }
        String packageCodePath = context.getPackageCodePath();
        String[] strArr = {q999ggg99999qqggqqg9qg("7c292761623f33772e35776275626f29273a372d252f3d376c7130", 76), q999ggg99999qqggqqg9qg("7c2a2462613c30272b2c246b746e79616c2a2439342e262c3e346f7233", 79), q999ggg99999qqggqqg9qg("7c7a7432316c60777b7c74393c7a7469647e767c6e643f2263", 31), q999ggg99999qqggqqg9qg("7c1f11574d5a1403591f110c011b13190b015a4706", 122), q999ggg99999qqggqqg9qg("7c47490f15024c2b2b40590147495459434b415359021f5e", 34)};
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(packageCodePath);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                int i7 = 0;
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (!zipEntryNextElement.getName().contains(q999ggg99999qqggqqg9qg("3e6667", 6))) {
                        for (int i10 = 0; i10 < 5; i10++) {
                            if (zipEntryNextElement.getName().equals(strArr[i10])) {
                                i7 += 1 << i10;
                                break;
                            }
                        }
                    }
                }
                try {
                    zipFile2.close();
                } catch (IOException unused) {
                }
                return i7;
            } catch (IOException unused2) {
                zipFile = zipFile2;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused3) {
                    }
                }
                return 0;
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String q999ggg99999qqggqqg9qg(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(q999ggg99999qqggqqg9qg("405c5e4b57465a405141464c", 45));
        } catch (Exception unused) {
            return null;
        }
    }

    private static String qg9gqgqqggg9q9qg(Context context) {
        try {
            String str = context.getApplicationInfo().nativeLibraryDir;
            return str.substring(str.lastIndexOf(q999ggg99999qqggqqg9qg("3f", 11)) + 1, str.length());
        } catch (Exception e10) {
            e10.printStackTrace();
            return e10.getMessage();
        }
    }

    public static String qgq9qg99(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(q999ggg99999qqggqqg9qg("4462696c63726c7d7e7a", 18));
        } catch (Exception unused) {
            return null;
        }
    }

    private static String qgqq999g(Context context) {
        String property;
        try {
            property = System.getProperty(q999ggg99999qqggqqg9qg("7f3b7a6834362c", 71));
        } catch (Exception e10) {
            e10.printStackTrace();
            property = "" + q999ggg99999qqggqqg9qg("755d5b4655445d4641", 32);
        }
        try {
            q999ggg99999qqggqqg9qg("73", 99);
            Object objInvoke = ClassLoader.class.getDeclaredMethod(q999ggg99999qqggqqg9qg("76111914363b150e0d0d15", 126), String.class).invoke(context.getClassLoader(), q999ggg99999qqggqqg9qg("73", 99));
            if (objInvoke == null) {
                return q999ggg99999qqggqqg9qg("752f3c0d153f3d24", 68);
            }
            return property + q999ggg99999qqggqqg9qg("33", 62) + objInvoke.toString();
        } catch (Exception e11) {
            StringBuilder sbS = u.s(property);
            sbS.append(e11.getMessage());
            return sbS.toString();
        }
    }

    private static String qqggggg9g9q99q9gq(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.q999ggg99999qqggqqg9qg(((PackageInfo) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qgq9qg99(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.gqgg9q99qg9[1], new qqggggg9g9q99q9gq(context, context.getPackageName()))).signatures[0].toByteArray()).substring(0, 32);
        } catch (Exception e10) {
            return e10.getMessage();
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
            byte b7 = (byte) (i7 ^ 96);
            byte b10 = (byte) (bArr[0] ^ Ascii.DLE);
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

    private static void q999ggg99999qqggqqg9qg(File file, int i7) {
        File[] fileArrListFiles;
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            if (q999ggg99999qqggqqg9qg("7c29273a372d252f3d376c7130", 76).equals(file.getName())) {
                if (i7 == 0) {
                    f19276q999ggg99999qqggqqg9qg = true;
                    return;
                } else {
                    if (i7 == 1) {
                        qgq9qg99 = true;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            q999ggg99999qqggqqg9qg(file2, i7);
        }
    }

    public static String q999ggg99999qqggqqg9qg(Context context, long j6) {
        String string = Arrays.toString(Build.SUPPORTED_ABIS);
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new File(applicationInfo.nativeLibraryDir));
            arrayList.add(new File(applicationInfo.dataDir));
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                q999ggg99999qqggqqg9qg((File) arrayList.get(i7), i7);
            }
        }
        char[] charArray = (Build.BRAND + q999ggg99999qqggqqg9qg("4e3e", 94) + Build.MODEL + q999ggg99999qqggqqg9qg("4e77", 23) + Build.VERSION.SDK_INT + q999ggg99999qqggqqg9qg("4e63", 3) + qqggggg9g9q99q9gq(context) + q999ggg99999qqggqqg9qg("4e6a", 10) + string + q999ggg99999qqggqqg9qg("4e55", 53) + cn.tongdun.android.shell.q999ggg99999qqggqqg9qg.qgq9qg99.qgq9qg99(context) + q999ggg99999qqggqqg9qg("4e59", 57) + cn.tongdun.android.shell.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg(context) + q999ggg99999qqggqqg9qg("4e46", 38) + Build.FINGERPRINT + q999ggg99999qqggqqg9qg("4e6c", 12) + qqg999qq.q999ggg99999qqggqqg9qg(context) + q999ggg99999qqggqqg9qg("4e51", 49) + f19276q999ggg99999qqggqqg9qg + q999ggg99999qqggqqg9qg("4e08", 104) + qgq9qg99 + q999ggg99999qqggqqg9qg("4e46", 38) + gqgg9q99qg9(context) + q999ggg99999qqggqqg9qg("4e6c", 12) + q999ggg99999qqggqqg9qg("20", 29) + q999ggg99999qqggqqg9qg("4e15", 117) + qgqq999g(context) + q999ggg99999qqggqqg9qg("4e0d", 109) + qg9gqgqqggg9q9qg(context) + q999ggg99999qqggqqg9qg("4e404040", 32) + "" + q999ggg99999qqggqqg9qg("4e6c", 12) + "" + q999ggg99999qqggqqg9qg("4e34", 84) + gqg99q9q9q(context) + q999ggg99999qqggqqg9qg("4e75", 21) + "").toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            charArray[i10] = (char) (((long) charArray[i10]) ^ j6);
        }
        return new String(charArray);
    }
}
