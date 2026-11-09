package com.transsnet.palmpay.util;

import C0.G;
import android.annotation.SuppressLint;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.luck.picture.lib.config.FileSizeUnit;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.util.constant.RegexConstants;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FileUtils {
    private static final String LINE_SEP = System.getProperty("line.separator");
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public interface OnReplaceListener {
        boolean onReplace();
    }

    private FileUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @SuppressLint({"DefaultLocale"})
    private static String byte2FitMemorySize(long j6) {
        if (j6 < 0) {
            return "shouldn't be less than zero!";
        }
        if (j6 < FileSizeUnit.KB) {
            return String.format("%.3fB", Double.valueOf(j6));
        }
        if (j6 < FileSizeUnit.MB) {
            return String.format("%.3fKB", Double.valueOf(j6 / 1024.0d));
        }
        return j6 < FileSizeUnit.GB ? String.format("%.3fMB", Double.valueOf(j6 / 1048576.0d)) : String.format("%.3fGB", Double.valueOf(j6 / 1.073741824E9d));
    }

    private static String bytes2HexString(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        char[] cArr = new char[length << 1];
        int i7 = 0;
        for (byte b7 : bArr) {
            int i10 = i7 + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i7] = cArr2[(b7 >>> 4) & 15];
            i7 += 2;
            cArr[i10] = cArr2[b7 & Ascii.SI];
        }
        return new String(cArr);
    }

    public static boolean copyDir(String str, String str2, OnReplaceListener onReplaceListener) {
        return copyDir(getFileByPath(str), getFileByPath(str2), onReplaceListener);
    }

    public static boolean copyFile(String str, String str2, OnReplaceListener onReplaceListener) {
        return copyFile(getFileByPath(str), getFileByPath(str2), onReplaceListener);
    }

    private static boolean copyOrMoveDir(File file, File file2, OnReplaceListener onReplaceListener, boolean z3) {
        if (file != null && file2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.getPath());
            String str = File.separator;
            sb2.append(str);
            String string = sb2.toString();
            String str2 = file2.getPath() + str;
            if (!str2.contains(string) && file.exists() && file.isDirectory()) {
                if (file2.exists()) {
                    if (!onReplaceListener.onReplace()) {
                        return true;
                    }
                    if (!deleteAllInDir(file2)) {
                        return false;
                    }
                }
                if (!createOrExistsDir(file2)) {
                    return false;
                }
                for (File file3 : file.listFiles()) {
                    StringBuilder sbS = u.s(str2);
                    sbS.append(file3.getName());
                    File file4 = new File(sbS.toString());
                    if (file3.isFile()) {
                        if (!copyOrMoveFile(file3, file4, onReplaceListener, z3)) {
                            return false;
                        }
                    } else if (file3.isDirectory() && !copyOrMoveDir(file3, file4, onReplaceListener, z3)) {
                        return false;
                    }
                }
                return !z3 || deleteDir(file);
            }
        }
        return false;
    }

    private static boolean copyOrMoveFile(File file, File file2, OnReplaceListener onReplaceListener, boolean z3) {
        if (file != null && file2 != null && !file.equals(file2) && file.exists() && file.isFile()) {
            if (file2.exists()) {
                if (!onReplaceListener.onReplace()) {
                    return true;
                }
                if (!file2.delete()) {
                    return false;
                }
            }
            if (!createOrExistsDir(file2.getParentFile())) {
                return false;
            }
            try {
                return FileIOUtils.writeFileFromIS(file2, (InputStream) new FileInputStream(file), false) && (!z3 || deleteFile(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public static boolean createFileByDeleteOldFile(String str) {
        return createFileByDeleteOldFile(getFileByPath(str));
    }

    public static boolean createOrExistsDir(String str) {
        return createOrExistsDir(getFileByPath(str));
    }

    public static boolean createOrExistsFile(String str) {
        return createOrExistsFile(getFileByPath(str));
    }

    public static boolean deleteAllInDir(String str) {
        return deleteAllInDir(getFileByPath(str));
    }

    public static boolean deleteDir(String str) {
        return deleteDir(getFileByPath(str));
    }

    public static boolean deleteFile(String str) {
        return deleteFile(getFileByPath(str));
    }

    public static boolean deleteFilesInDir(String str) {
        return deleteFilesInDir(getFileByPath(str));
    }

    public static boolean deleteFilesInDirWithFilter(String str, FileFilter fileFilter) {
        return deleteFilesInDirWithFilter(getFileByPath(str), fileFilter);
    }

    public static long getDirLength(String str) {
        return getDirLength(getFileByPath(str));
    }

    public static String getDirName(File file) {
        if (file == null) {
            return null;
        }
        return getDirName(file.getAbsolutePath());
    }

    public static String getDirSize(String str) {
        return getDirSize(getFileByPath(str));
    }

    public static File getFileByPath(String str) {
        if (isSpace(str)) {
            return null;
        }
        return new File(str);
    }

    public static String getFileCharsetSimple(String str) {
        return getFileCharsetSimple(getFileByPath(str));
    }

    public static String getFileExtension(File file) {
        if (file == null) {
            return null;
        }
        return getFileExtension(file.getPath());
    }

    public static long getFileLastModified(String str) {
        return getFileLastModified(getFileByPath(str));
    }

    public static long getFileLength(String str) {
        if (str.matches(RegexConstants.REGEX_URL)) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    return httpURLConnection.getContentLength();
                }
                return -1L;
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        return getFileLength(getFileByPath(str));
    }

    public static int getFileLines(String str) {
        return getFileLines(getFileByPath(str));
    }

    public static byte[] getFileMD5(String str) {
        return getFileMD5(getFileByPath(str));
    }

    public static String getFileMD5ToString(String str) {
        return getFileMD5ToString(isSpace(str) ? null : new File(str));
    }

    public static String getFileName(File file) {
        if (file == null) {
            return null;
        }
        return getFileName(file.getAbsolutePath());
    }

    public static String getFileNameNoExtension(File file) {
        if (file == null) {
            return null;
        }
        return getFileNameNoExtension(file.getPath());
    }

    public static String getFileSize(String str) {
        long fileLength = getFileLength(str);
        return fileLength == -1 ? "" : byte2FitMemorySize(fileLength);
    }

    public static boolean isDir(String str) {
        return isDir(getFileByPath(str));
    }

    public static boolean isFile(String str) {
        return isFile(getFileByPath(str));
    }

    public static boolean isFileExists(String str) {
        return isFileExists(getFileByPath(str));
    }

    private static boolean isSpace(String str) {
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

    public static List<File> listFilesInDir(String str) {
        return listFilesInDir(str, false);
    }

    public static List<File> listFilesInDirWithFilter(String str, FileFilter fileFilter) {
        return listFilesInDirWithFilter(getFileByPath(str), fileFilter, false);
    }

    public static boolean moveDir(String str, String str2, OnReplaceListener onReplaceListener) {
        return moveDir(getFileByPath(str), getFileByPath(str2), onReplaceListener);
    }

    public static boolean moveFile(String str, String str2, OnReplaceListener onReplaceListener) {
        return moveFile(getFileByPath(str), getFileByPath(str2), onReplaceListener);
    }

    public static boolean rename(String str, String str2) {
        return rename(getFileByPath(str), str2);
    }

    public static boolean copyDir(File file, File file2, OnReplaceListener onReplaceListener) {
        return copyOrMoveDir(file, file2, onReplaceListener, false);
    }

    public static boolean copyFile(File file, File file2, OnReplaceListener onReplaceListener) {
        return copyOrMoveFile(file, file2, onReplaceListener, false);
    }

    public static boolean createFileByDeleteOldFile(File file) {
        if (file == null) {
            return false;
        }
        if ((file.exists() && !file.delete()) || !createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
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

    public static boolean deleteAllInDir(File file) {
        return deleteFilesInDirWithFilter(file, new FileFilter() { // from class: com.transsnet.palmpay.util.FileUtils.1
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                return true;
            }
        });
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
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
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

    public static boolean deleteFile(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile() && file.delete();
        }
        return true;
    }

    public static boolean deleteFilesInDir(File file) {
        return deleteFilesInDirWithFilter(file, new FileFilter() { // from class: com.transsnet.palmpay.util.FileUtils.2
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                return file2.isFile();
            }
        });
    }

    public static boolean deleteFilesInDirWithFilter(File file, FileFilter fileFilter) {
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
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (fileFilter.accept(file2)) {
                    if (file2.isFile()) {
                        if (!file2.delete()) {
                            return false;
                        }
                    } else if (file2.isDirectory() && !deleteDir(file2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static long getDirLength(File file) {
        if (!isDir(file)) {
            return -1L;
        }
        File[] fileArrListFiles = file.listFiles();
        long dirLength = 0;
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                dirLength = (file2.isDirectory() ? getDirLength(file2) : file2.length()) + dirLength;
            }
        }
        return dirLength;
    }

    public static String getDirName(String str) {
        if (isSpace(str)) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(File.separator);
        return iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf + 1);
    }

    public static String getDirSize(File file) {
        long dirLength = getDirLength(file);
        return dirLength == -1 ? "" : byte2FitMemorySize(dirLength);
    }

    public static String getFileCharsetSimple(File file) throws Throwable {
        int i7 = 0;
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    int i10 = (bufferedInputStream2.read() << 8) + bufferedInputStream2.read();
                    CloseUtils.closeIO(bufferedInputStream2);
                    i7 = i10;
                } catch (IOException e10) {
                    e = e10;
                    bufferedInputStream = bufferedInputStream2;
                    e.printStackTrace();
                    CloseUtils.closeIO(bufferedInputStream);
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    CloseUtils.closeIO(bufferedInputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            }
            if (i7 == 61371) {
                return Constants.ENCODING;
            }
            if (i7 != 65279) {
                return i7 != 65534 ? "GBK" : "Unicode";
            }
            return "UTF-16BE";
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String getFileExtension(String str) {
        if (isSpace(str)) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return (iLastIndexOf == -1 || str.lastIndexOf(File.separator) >= iLastIndexOf) ? "" : str.substring(iLastIndexOf + 1);
    }

    public static long getFileLastModified(File file) {
        if (file == null) {
            return -1L;
        }
        return file.lastModified();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    public static int getFileLines(File file) throws Throwable {
        ?? EndsWith;
        int i7;
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    try {
                        byte[] bArr = new byte[1024];
                        EndsWith = LINE_SEP.endsWith(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        try {
                            if (EndsWith == 0) {
                                i7 = 1;
                                while (true) {
                                    int i10 = bufferedInputStream2.read(bArr, 0, 1024);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        if (bArr[i11] == 13) {
                                            i7++;
                                        }
                                    }
                                }
                            } else {
                                i7 = 1;
                                while (true) {
                                    int i12 = bufferedInputStream2.read(bArr, 0, 1024);
                                    if (i12 == -1) {
                                        break;
                                    }
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        if (bArr[i13] == 10) {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            CloseUtils.closeIO(bufferedInputStream2);
                            return i7;
                        } catch (IOException e10) {
                            e = e10;
                            bufferedInputStream = bufferedInputStream2;
                            e.printStackTrace();
                            CloseUtils.closeIO(bufferedInputStream);
                            return EndsWith;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        EndsWith = 1;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    CloseUtils.closeIO(bufferedInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e12) {
            e = e12;
            EndsWith = 1;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0031: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:14:0x0031 */
    public static byte[] getFileMD5(File file) throws Throwable {
        Closeable closeable;
        DigestInputStream digestInputStream;
        Closeable closeable2 = null;
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
                    CloseUtils.closeIO(digestInputStream);
                    return bArrDigest;
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    CloseUtils.closeIO(digestInputStream);
                    return null;
                } catch (NoSuchAlgorithmException e11) {
                    e = e11;
                    e.printStackTrace();
                    CloseUtils.closeIO(digestInputStream);
                    return null;
                }
            } catch (IOException e12) {
                e = e12;
                digestInputStream = null;
                e.printStackTrace();
                CloseUtils.closeIO(digestInputStream);
                return null;
            } catch (NoSuchAlgorithmException e13) {
                e = e13;
                digestInputStream = null;
                e.printStackTrace();
                CloseUtils.closeIO(digestInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                CloseUtils.closeIO(closeable2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
        }
    }

    public static String getFileName(String str) {
        int iLastIndexOf;
        return (isSpace(str) || (iLastIndexOf = str.lastIndexOf(File.separator)) == -1) ? str : str.substring(iLastIndexOf + 1);
    }

    public static String getFileNameNoExtension(String str) {
        if (isSpace(str)) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        int iLastIndexOf2 = str.lastIndexOf(File.separator);
        if (iLastIndexOf2 == -1) {
            return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
        }
        return (iLastIndexOf == -1 || iLastIndexOf2 > iLastIndexOf) ? str.substring(iLastIndexOf2 + 1) : str.substring(iLastIndexOf2 + 1, iLastIndexOf);
    }

    public static boolean isDir(File file) {
        return file != null && file.exists() && file.isDirectory();
    }

    public static boolean isFile(File file) {
        return file != null && file.exists() && file.isFile();
    }

    public static boolean isFileExists(File file) {
        return file != null && file.exists();
    }

    public static List<File> listFilesInDir(File file) {
        return listFilesInDir(file, false);
    }

    public static List<File> listFilesInDirWithFilter(File file, FileFilter fileFilter) {
        return listFilesInDirWithFilter(file, fileFilter, false);
    }

    public static boolean moveDir(File file, File file2, OnReplaceListener onReplaceListener) {
        return copyOrMoveDir(file, file2, onReplaceListener, true);
    }

    public static boolean moveFile(File file, File file2, OnReplaceListener onReplaceListener) {
        return copyOrMoveFile(file, file2, onReplaceListener, true);
    }

    public static boolean rename(File file, String str) {
        if (file == null || !file.exists() || isSpace(str)) {
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

    public static String getFileMD5ToString(File file) {
        return bytes2HexString(getFileMD5(file));
    }

    public static String getFileSize(File file) {
        long fileLength = getFileLength(file);
        return fileLength == -1 ? "" : byte2FitMemorySize(fileLength);
    }

    public static List<File> listFilesInDir(String str, boolean z3) {
        return listFilesInDir(getFileByPath(str), z3);
    }

    public static List<File> listFilesInDirWithFilter(String str, FileFilter fileFilter, boolean z3) {
        return listFilesInDirWithFilter(getFileByPath(str), fileFilter, z3);
    }

    public static List<File> listFilesInDir(File file, boolean z3) {
        return listFilesInDirWithFilter(file, new FileFilter() { // from class: com.transsnet.palmpay.util.FileUtils.3
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                return true;
            }
        }, z3);
    }

    public static List<File> listFilesInDirWithFilter(File file, FileFilter fileFilter, boolean z3) {
        if (!isDir(file)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (fileFilter.accept(file2)) {
                    arrayList.add(file2);
                }
                if (z3 && file2.isDirectory()) {
                    arrayList.addAll(listFilesInDirWithFilter(file2, fileFilter, true));
                }
            }
        }
        return arrayList;
    }

    public static long getFileLength(File file) {
        if (isFile(file)) {
            return file.length();
        }
        return -1L;
    }
}
