package cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.google.common.primitives.SignedBytes;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg implements qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g.q999ggg99999qqggqqg9qg$q999ggg99999qqggqqg9qg, reason: collision with other inner class name */
    public static class C0010q999ggg99999qqggqqg9qg {

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        public ZipFile f19098q999ggg99999qqggqqg9qg;
        public ZipEntry qgq9qg99;

        public C0010q999ggg99999qqggqqg9qg(ZipFile zipFile, ZipEntry zipEntry) {
            this.f19098q999ggg99999qqggqqg9qg = zipFile;
            this.qgq9qg99 = zipEntry;
        }
    }

    private C0010q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qg(Context context, String[] strArr, String str) {
        String[] strArrQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(context);
        int length = strArrQ999ggg99999qqggqqg9qg.length;
        int i7 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i7 >= length) {
                return null;
            }
            String str2 = strArrQ999ggg99999qqggqqg9qg[i7];
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i10 = i11;
                }
            }
            if (zipFile != null) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i12 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(q999ggg99999qqggqqg9qg("2c1b15", 65));
                            char c6 = File.separatorChar;
                            sb2.append(c6);
                            sb2.append(str3);
                            sb2.append(c6);
                            sb2.append(str);
                            ZipEntry entry = zipFile.getEntry(sb2.toString());
                            if (entry == null) {
                                entry = zipFile.getEntry(q999ggg99999qqggqqg9qg("212537212630", 104) + c6 + str3 + c6 + str);
                            }
                            if (entry != null) {
                                return new C0010q999ggg99999qqggqqg9qg(zipFile, entry);
                            }
                        }
                        i12 = i13;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i7++;
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
            byte b7 = (byte) (i7 ^ 95);
            byte b10 = (byte) (bArr[0] ^ SignedBytes.MAX_POWER_OF_TWO);
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

    @Override // cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg
    public final void q999ggg99999qqggqqg9qg(Context context, String[] strArr, String str, File file) {
        FileOutputStream fileOutputStream;
        for (String str2 : strArr) {
            StringBuilder sbS = u.s(str2);
            sbS.append(File.separatorChar);
            sbS.append(str);
            InputStream inputStream = null;
            try {
                InputStream inputStreamOpen = context.getAssets().open(sbS.toString());
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i7 = inputStreamOpen.read(bArr);
                            if (i7 <= 0) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, i7);
                            }
                        }
                        q999ggg99999qqggqqg9qg(inputStreamOpen);
                    } catch (Throwable unused) {
                        inputStream = inputStreamOpen;
                        q999ggg99999qqggqqg9qg(inputStream);
                    }
                } catch (Throwable unused2) {
                    fileOutputStream = null;
                }
            } catch (Throwable unused3) {
                fileOutputStream = null;
            }
            q999ggg99999qqggqqg9qg(fileOutputStream);
            q999ggg99999qqggqqg9qg(file);
            if (file.exists()) {
                return;
            }
        }
    }

    @Override // cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg
    public final void q999ggg99999qqggqqg9qg(Context context, String[] strArr, String str, File file, gqgg9q99qg9 gqgg9q99qg9Var) throws Throwable {
        String[] strArrQ999ggg99999qqggqqg9qg;
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        C0010q999ggg99999qqggqqg9qg c0010q999ggg99999qqggqqg9qg = null;
        InputStream inputStream2 = null;
        try {
            C0010q999ggg99999qqggqqg9qg c0010q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(context, strArr, str);
            try {
                if (c0010q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg == null) {
                    try {
                        strArrQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(context, str);
                    } catch (Exception e10) {
                        strArrQ999ggg99999qqggqqg9qg = new String[]{e10.toString()};
                    }
                    throw new qgq9qg99(str, strArr, strArrQ999ggg99999qqggqqg9qg);
                }
                int i7 = 0;
                while (true) {
                    int i10 = i7 + 1;
                    try {
                        if (i7 >= 5) {
                            zipFile = c0010q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.f19098q999ggg99999qqggqqg9qg;
                            if (zipFile != null) {
                                break;
                            } else {
                                return;
                            }
                        }
                        try {
                            if (file.exists() || file.createNewFile()) {
                                try {
                                    inputStream = c0010q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.f19098q999ggg99999qqggqqg9qg.getInputStream(c0010q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.qgq9qg99);
                                    try {
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            byte[] bArr = new byte[4096];
                                            long j6 = 0;
                                            while (true) {
                                                int i11 = inputStream.read(bArr);
                                                if (i11 == -1) {
                                                    break;
                                                }
                                                fileOutputStream.write(bArr, 0, i11);
                                                j6 += (long) i11;
                                            }
                                            fileOutputStream.flush();
                                            fileOutputStream.getFD().sync();
                                            if (j6 == file.length()) {
                                                q999ggg99999qqggqqg9qg(inputStream);
                                                q999ggg99999qqggqqg9qg(fileOutputStream);
                                                q999ggg99999qqggqqg9qg(file);
                                                zipFile = c0010q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.f19098q999ggg99999qqggqqg9qg;
                                                if (zipFile != null) {
                                                    break;
                                                } else {
                                                    return;
                                                }
                                            }
                                            q999ggg99999qqggqqg9qg(inputStream);
                                            q999ggg99999qqggqqg9qg(fileOutputStream);
                                        } catch (FileNotFoundException unused) {
                                            q999ggg99999qqggqqg9qg(inputStream);
                                        } catch (IOException unused2) {
                                            q999ggg99999qqggqqg9qg(inputStream);
                                        } catch (Throwable th) {
                                            th = th;
                                            inputStream2 = inputStream;
                                            q999ggg99999qqggqqg9qg(inputStream2);
                                            q999ggg99999qqggqqg9qg(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused3) {
                                        fileOutputStream = null;
                                    } catch (IOException unused4) {
                                        fileOutputStream = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream = null;
                                    }
                                } catch (FileNotFoundException unused5) {
                                    inputStream = null;
                                    fileOutputStream = null;
                                } catch (IOException unused6) {
                                    inputStream = null;
                                    fileOutputStream = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileOutputStream = null;
                                }
                            }
                        } catch (IOException unused7) {
                        }
                        i7 = i10;
                    } catch (IOException unused8) {
                        return;
                    }
                }
                zipFile.close();
            } catch (Throwable th4) {
                th = th4;
                c0010q999ggg99999qqggqqg9qg = c0010q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg;
                if (c0010q999ggg99999qqggqqg9qg != null) {
                    try {
                        ZipFile zipFile2 = c0010q999ggg99999qqggqqg9qg.f19098q999ggg99999qqggqqg9qg;
                        if (zipFile2 != null) {
                            zipFile2.close();
                        }
                    } catch (IOException unused9) {
                    }
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private static void q999ggg99999qqggqqg9qg(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static void q999ggg99999qqggqqg9qg(File file) {
        file.setReadable(true, false);
        file.setExecutable(true, false);
        file.setWritable(true);
    }

    private static String[] q999ggg99999qqggqqg9qg(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    private String[] q999ggg99999qqggqqg9qg(Context context, String str) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(q999ggg99999qqggqqg9qg("2c313f2a292634222533", 107));
        char c6 = File.separatorChar;
        sb2.append(c6);
        sb2.append(q999ggg99999qqggqqg9qg("683b4d4a", 23));
        sb2.append(c6);
        sb2.append(q999ggg99999qqggqqg9qg("1d1367", 59));
        sb2.append(c6);
        sb2.append(str);
        Pattern patternCompile = Pattern.compile(sb2.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : q999ggg99999qqggqqg9qg(context)) {
            try {
                ZipFile zipFile = new ZipFile(new File(str2), 1);
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (!zipEntryNextElement.getName().contains(q999ggg99999qqggqqg9qg("6e7677", 41))) {
                        Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                        if (matcher.matches()) {
                            hashSet.add(matcher.group(1));
                        }
                    }
                }
                zipFile.close();
            } catch (Throwable unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }
}
