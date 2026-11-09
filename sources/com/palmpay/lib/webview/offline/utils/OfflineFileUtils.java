package com.palmpay.lib.webview.offline.utils;

import C0.G;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.arouter.utils.Consts;
import com.google.common.base.Ascii;
import com.microsoft.codepush.react.CodePushConstants;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineFileUtils {
    private static final int BUFFER_LEN = 8192;
    private static int sBufferSize = 524288;
    private static final char[] HEX_DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] HEX_DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private OfflineFileUtils() {
    }

    @SuppressLint({"DefaultLocale"})
    public static long byte2FitMemorySize(long j6) {
        if (j6 >= 0) {
            return Math.round(j6 / 1024.0d);
        }
        throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
    }

    public static String bytes2HexString(byte[] bArr, boolean z3) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = z3 ? HEX_DIGITS_UPPER : HEX_DIGITS_LOWER;
        int length = bArr.length;
        if (length <= 0) {
            return "";
        }
        char[] cArr2 = new char[length << 1];
        int i7 = 0;
        for (byte b7 : bArr) {
            int i10 = i7 + 1;
            cArr2[i7] = cArr[(b7 >> 4) & 15];
            i7 += 2;
            cArr2[i10] = cArr[b7 & Ascii.SI];
        }
        return new String(cArr2);
    }

    public static boolean createOrExistsDir(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isDirectory();
        }
        return file.mkdirs();
    }

    public static boolean createOrExistsFile(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean deleteDir(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !deleteDir(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    private static String getAbsolutePath(File file) {
        return file == null ? "" : file.getAbsolutePath();
    }

    public static String getDirNameFromUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("/")) {
            return str.contains(Consts.DOT) ? str.substring(str.lastIndexOf("/"), str.lastIndexOf(Consts.DOT)) : str;
        }
        return str.contains(Consts.DOT) ? str.substring(0, str.lastIndexOf(Consts.DOT)) : str;
    }

    private static long getFileLength(File file) {
        if (isFile(file)) {
            return file.length();
        }
        return -1L;
    }

    public static byte[] getFileMD5(String str) {
        if (isSpaceString(str)) {
            return null;
        }
        return getFileMD5(new File(str));
    }

    public static long getFileSize(File file) {
        long fileLength = getFileLength(file);
        if (fileLength != -1) {
            return byte2FitMemorySize(fileLength);
        }
        return 0L;
    }

    public static String getInternalAppDataPath() {
        return getAbsolutePath(OfflineWebManager.getInstance().getContext().getDataDir());
    }

    public static boolean isFile(File file) {
        return file != null && file.exists() && file.isFile();
    }

    public static boolean isFileExists(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        return isFileExists(file.getAbsolutePath());
    }

    public static boolean isSpaceString(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!Character.isWhitespace(str.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static byte[] readFile2BytesByStream(File file) throws Throwable {
        ?? r10;
        ?? r3;
        ByteArrayOutputStream byteArrayOutputStream;
        boolean zIsFileExists = isFileExists(file);
        if (!zIsFileExists) {
            return null;
        }
        try {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), sBufferSize);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[sBufferSize];
                        while (true) {
                            int i7 = bufferedInputStream.read(bArr, 0, sBufferSize);
                            if (i7 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i7);
                            e.printStackTrace();
                            return null;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        return byteArray;
                    } catch (IOException e12) {
                        e = e12;
                        e.printStackTrace();
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (IOException e15) {
                    e = e15;
                    byteArrayOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    r10 = 0;
                    r3 = bufferedInputStream;
                    try {
                        r3.close();
                    } catch (IOException e16) {
                        e16.printStackTrace();
                    }
                    if (r10 == 0) {
                        throw th;
                    }
                    try {
                        r10.close();
                        throw th;
                    } catch (IOException e17) {
                        e17.printStackTrace();
                        throw th;
                    }
                }
            } catch (FileNotFoundException e18) {
                e18.printStackTrace();
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            r3 = zIsFileExists;
            r10 = file;
        }
    }

    public static String readFile2String(String str) {
        byte[] file2BytesByStream;
        if (isSpaceString(str) || (file2BytesByStream = readFile2BytesByStream(new File(str))) == null) {
            return null;
        }
        return new String(file2BytesByStream);
    }

    public static boolean rename(File file, String str) {
        if (file == null || !file.exists() || isSpaceString(str)) {
            return false;
        }
        if (str.equals(file.getName())) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getParent());
        File file2 = new File(G.r(sb2, File.separator, str));
        return !file2.exists() && file.renameTo(file2);
    }

    private static boolean unzipChildFile(File file, List<File> list, ZipFile zipFile, ZipEntry zipEntry, String str) throws IOException {
        File file2 = new File(file, str);
        list.add(file2);
        if (zipEntry.isDirectory()) {
            return createOrExistsDir(file2);
        }
        if (!createOrExistsFile(file2)) {
            return false;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i7 = bufferedInputStream.read(bArr);
                    if (i7 == -1) {
                        bufferedOutputStream.close();
                        bufferedInputStream.close();
                        return true;
                    }
                    bufferedOutputStream.write(bArr, 0, i7);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            bufferedInputStream.close();
            throw th4;
        }
    }

    public static List<File> unzipFile(String str, String str2) throws IOException {
        return unzipFileByKeyword(new File(str), new File(str2));
    }

    public static List<File> unzipFileByKeyword(File file, File file2) throws IOException {
        if (file == null || file2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            try {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String strReplace = zipEntryNextElement.getName().replace("\\", "/");
                if (strReplace.contains("../")) {
                    Log.e("ZipUtils", "entryName: " + strReplace + " is dangerous!");
                } else if (!unzipChildFile(file2, arrayList, zipFile, zipEntryNextElement, strReplace)) {
                    zipFile.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                zipFile.close();
                throw th;
            }
        }
        zipFile.close();
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0030: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:17:0x0030 */
    public static byte[] getFileMD5(File file) throws Throwable {
        InputStream inputStream;
        DigestInputStream digestInputStream;
        InputStream inputStream2 = null;
        try {
            if (file == null) {
                return null;
            }
            try {
                digestInputStream = new DigestInputStream(new FileInputStream(file), MessageDigest.getInstance("MD5"));
                try {
                    while (digestInputStream.read(new byte[CodePushConstants.DOWNLOAD_BUFFER_SIZE]) > 0) {
                    }
                    byte[] bArrDigest = digestInputStream.getMessageDigest().digest();
                    try {
                        digestInputStream.close();
                        return bArrDigest;
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        return bArrDigest;
                    }
                } catch (IOException e11) {
                    e = e11;
                    e.printStackTrace();
                    if (digestInputStream != null) {
                        try {
                            digestInputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    return null;
                } catch (NoSuchAlgorithmException e13) {
                    e = e13;
                    e.printStackTrace();
                    if (digestInputStream != null) {
                        digestInputStream.close();
                    }
                    return null;
                }
            } catch (IOException e14) {
                e = e14;
                digestInputStream = null;
                e.printStackTrace();
                if (digestInputStream != null) {
                    digestInputStream.close();
                }
                return null;
            } catch (NoSuchAlgorithmException e15) {
                e = e15;
                digestInputStream = null;
                e.printStackTrace();
                if (digestInputStream != null) {
                    digestInputStream.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e16) {
                        e16.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
        }
    }

    public static boolean isFileExists(String str) {
        if (isSpaceString(str)) {
            return false;
        }
        return new File(str).exists();
    }
}
