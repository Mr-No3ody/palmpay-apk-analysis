package com.transsnet.adsdk.utils;

import C0.G;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes3.dex */
public final class AdZipUtils {
    private static final int BUFFER_LEN = 8192;

    private AdZipUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static boolean createOrExistsDir(final File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isDirectory();
        }
        return file.mkdirs();
    }

    private static boolean createOrExistsFile(final File file) {
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

    private static boolean isSpace(final String s3) {
        if (s3 == null) {
            return true;
        }
        int length = s3.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!Character.isWhitespace(s3.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    private static boolean unzipChildFile(final File destDir, final List<File> files, final ZipFile zf2, final ZipEntry entry, final String entryName) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        BufferedInputStream bufferedInputStream;
        if (TextUtils.isEmpty(entryName) || entryName.contains("../")) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(destDir);
        File file = new File(G.r(sb2, File.separator, entryName));
        files.add(file);
        if (entry.isDirectory()) {
            if (!createOrExistsDir(file)) {
                return false;
            }
        } else {
            if (!createOrExistsFile(file)) {
                return false;
            }
            try {
                bufferedInputStream = new BufferedInputStream(zf2.getInputStream(entry));
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i7 = bufferedInputStream.read(bArr);
                            if (i7 == -1) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, i7);
                        }
                        AdSdkUtils.closeIO(bufferedInputStream, bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        AdSdkUtils.closeIO(bufferedInputStream, bufferedOutputStream);
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

    public static List<File> unzipFile(final File zipFile, final File destDir) throws IOException {
        return unzipFileByKeyword(zipFile, destDir, null);
    }

    public static List<File> unzipFileByKeyword(final File zipFile, final File destDir, final String keyword) throws IOException {
        if (zipFile == null || destDir == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            ZipFile zipFile2 = new ZipFile(zipFile);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                if (!isSpace(keyword)) {
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        String name = zipEntryNextElement.getName();
                        if (name.contains(keyword) && !unzipChildFile(destDir, arrayList, zipFile2, zipEntryNextElement, name)) {
                            break;
                        }
                    }
                } else {
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement2 = enumerationEntries.nextElement();
                        if (!unzipChildFile(destDir, arrayList, zipFile2, zipEntryNextElement2, zipEntryNextElement2.getName())) {
                            break;
                        }
                    }
                }
                zipFile2.close();
                return arrayList;
            } catch (Throwable th) {
                try {
                    zipFile2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            return arrayList;
        }
    }
}
