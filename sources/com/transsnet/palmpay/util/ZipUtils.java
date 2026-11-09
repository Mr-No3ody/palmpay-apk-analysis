package com.transsnet.palmpay.util;

import C0.G;
import android.text.TextUtils;
import androidx.camera.video.u;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class ZipUtils {
    private static final int BUFFER_LEN = 8192;

    private ZipUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static boolean createOrExistsDir(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isDirectory();
        }
        return file.mkdirs();
    }

    private static boolean createOrExistsFile(File file) {
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

    public static List<String> getComments(String str) throws IOException {
        return getComments(getFileByPath(str));
    }

    private static File getFileByPath(String str) {
        if (isSpace(str)) {
            return null;
        }
        return new File(str);
    }

    public static List<String> getFilesPath(String str) throws IOException {
        return getFilesPath(getFileByPath(str));
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

    private static boolean unzipChildFile(File file, List<File> list, ZipFile zipFile, ZipEntry zipEntry, String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        BufferedInputStream bufferedInputStream;
        if (TextUtils.isEmpty(str) || str.contains("../")) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file);
        File file2 = new File(G.r(sb2, File.separator, str));
        list.add(file2);
        if (zipEntry.isDirectory()) {
            if (!createOrExistsDir(file2)) {
                return false;
            }
        } else {
            if (!createOrExistsFile(file2)) {
                return false;
            }
            try {
                bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i7 = bufferedInputStream.read(bArr);
                            if (i7 == -1) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, i7);
                        }
                        CloseUtils.closeIO(bufferedInputStream, bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        CloseUtils.closeIO(bufferedInputStream, bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    bufferedOutputStream = null;
                    th = th3;
                }
            } catch (Throwable th4) {
                bufferedOutputStream = null;
                th = th4;
                bufferedInputStream = null;
            }
        }
        return true;
    }

    public static List<File> unzipFile(String str, String str2) throws IOException {
        return unzipFileByKeyword(str, str2, (String) null);
    }

    public static List<File> unzipFileByKeyword(String str, String str2, String str3) throws IOException {
        return unzipFileByKeyword(getFileByPath(str), getFileByPath(str2), str3);
    }

    private static boolean zipFile(File file, String str, ZipOutputStream zipOutputStream, String str2) throws Throwable {
        StringBuilder sbS = u.s(str);
        sbS.append(isSpace(str) ? "" : File.separator);
        sbS.append(file.getName());
        String string = sbS.toString();
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                ZipEntry zipEntry = new ZipEntry(string + '/');
                zipEntry.setComment(str2);
                zipOutputStream.putNextEntry(zipEntry);
                zipOutputStream.closeEntry();
            } else {
                for (File file2 : fileArrListFiles) {
                    if (!zipFile(file2, string, zipOutputStream, str2)) {
                        return false;
                    }
                }
            }
        } else {
            BufferedInputStream bufferedInputStream = null;
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    ZipEntry zipEntry2 = new ZipEntry(string);
                    zipEntry2.setComment(str2);
                    zipOutputStream.putNextEntry(zipEntry2);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i7 = bufferedInputStream2.read(bArr, 0, 8192);
                        if (i7 == -1) {
                            break;
                        }
                        zipOutputStream.write(bArr, 0, i7);
                    }
                    zipOutputStream.closeEntry();
                    CloseUtils.closeIO(bufferedInputStream2);
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    CloseUtils.closeIO(bufferedInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return true;
    }

    public static boolean zipFiles(Collection<String> collection, String str) throws IOException {
        return zipFiles(collection, str, (String) null);
    }

    public static List<String> getComments(File file) throws IOException {
        if (file == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(file).entries();
        while (enumerationEntries.hasMoreElements()) {
            arrayList.add(enumerationEntries.nextElement().getComment());
        }
        return arrayList;
    }

    public static List<String> getFilesPath(File file) throws IOException {
        if (file == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(file).entries();
        while (enumerationEntries.hasMoreElements()) {
            arrayList.add(enumerationEntries.nextElement().getName());
        }
        return arrayList;
    }

    public static List<File> unzipFile(File file, File file2) throws IOException {
        return unzipFileByKeyword(file, file2, (String) null);
    }

    public static List<File> unzipFileByKeyword(File file, File file2, String str) throws IOException {
        if (file == null || file2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        if (!isSpace(str)) {
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String name = zipEntryNextElement.getName();
                if (name.contains(str) && !unzipChildFile(file2, arrayList, zipFile, zipEntryNextElement, name)) {
                    break;
                }
            }
        } else {
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement2 = enumerationEntries.nextElement();
                if (!unzipChildFile(file2, arrayList, zipFile, zipEntryNextElement2, zipEntryNextElement2.getName())) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public static boolean zipFiles(Collection<String> collection, String str, String str2) throws Throwable {
        if (collection == null || str == null) {
            return false;
        }
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str));
            try {
                Iterator<String> it = collection.iterator();
                while (it.hasNext()) {
                    if (!zipFile(getFileByPath(it.next()), "", zipOutputStream2, str2)) {
                        zipOutputStream2.finish();
                        CloseUtils.closeIO(zipOutputStream2);
                        return false;
                    }
                }
                zipOutputStream2.finish();
                CloseUtils.closeIO(zipOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                if (zipOutputStream != null) {
                    zipOutputStream.finish();
                    CloseUtils.closeIO(zipOutputStream);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean zipFiles(Collection<File> collection, File file) throws IOException {
        return zipFiles(collection, file, (String) null);
    }

    public static boolean zipFiles(Collection<File> collection, File file, String str) throws Throwable {
        if (collection == null || file == null) {
            return false;
        }
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file));
            try {
                Iterator<File> it = collection.iterator();
                while (it.hasNext()) {
                    if (!zipFile(it.next(), "", zipOutputStream2, str)) {
                        zipOutputStream2.finish();
                        CloseUtils.closeIO(zipOutputStream2);
                        return false;
                    }
                }
                zipOutputStream2.finish();
                CloseUtils.closeIO(zipOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                if (zipOutputStream != null) {
                    zipOutputStream.finish();
                    CloseUtils.closeIO(zipOutputStream);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean zipFile(String str, String str2) throws IOException {
        return zipFile(getFileByPath(str), getFileByPath(str2), (String) null);
    }

    public static boolean zipFile(String str, String str2, String str3) throws IOException {
        return zipFile(getFileByPath(str), getFileByPath(str2), str3);
    }

    public static boolean zipFile(File file, File file2) throws IOException {
        return zipFile(file, file2, (String) null);
    }

    public static boolean zipFile(File file, File file2, String str) throws Throwable {
        if (file == null || file2 == null) {
            return false;
        }
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file2));
            try {
                boolean zZipFile = zipFile(file, "", zipOutputStream2, str);
                CloseUtils.closeIO(zipOutputStream2);
                return zZipFile;
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                if (zipOutputStream != null) {
                    CloseUtils.closeIO(zipOutputStream);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
