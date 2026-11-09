package com.transsnet.palmpay.util;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FileIOUtils {
    private static final String LINE_SEP = System.getProperty("line.separator");
    private static int sBufferSize = UserMetadata.MAX_INTERNAL_KEY_SIZE;

    private FileIOUtils() {
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

    private static boolean createOrExistsFile(String str) {
        return createOrExistsFile(getFileByPath(str));
    }

    private static File getFileByPath(String str) {
        if (isSpace(str)) {
            return null;
        }
        return new File(str);
    }

    private static boolean isFileExists(File file) {
        return file != null && file.exists();
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

    public static byte[] readFile2BytesByChannel(String str) {
        return readFile2BytesByChannel(getFileByPath(str));
    }

    public static byte[] readFile2BytesByMap(String str) {
        return readFile2BytesByMap(getFileByPath(str));
    }

    public static byte[] readFile2BytesByStream(String str) {
        return readFile2BytesByStream(getFileByPath(str));
    }

    public static List<String> readFile2List(String str) {
        return readFile2List(getFileByPath(str), (String) null);
    }

    public static String readFile2String(String str) {
        return readFile2String(getFileByPath(str), (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String saveBmpToExternalStorage(String str, Bitmap bitmap, boolean z3) throws Throwable {
        Uri uriInsert;
        String path = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), str).getPath();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        if (z3) {
            contentValues.put("mime_type", "image/png");
        } else {
            contentValues.put("mime_type", "image/jpeg");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("relative_path", "Pictures/");
        }
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        ContentResolver contentResolver = Utils.getApp().getContentResolver();
        ContentValues contentValues2 = null;
        try {
            try {
                try {
                    uriInsert = Utils.getApp().getContentResolver().insert(uri, contentValues);
                    try {
                        if (uriInsert == null) {
                            throw new IOException("Failed to create new MediaStore record.");
                        }
                        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                        try {
                            if (outputStreamOpenOutputStream == null) {
                                throw new IOException("Failed to get output stream.");
                            }
                            if (!bitmap.compress(z3 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream)) {
                                throw new IOException("Failed to save bitmap.");
                            }
                            CloseUtils.closeIO(outputStreamOpenOutputStream);
                            return path;
                        } catch (IOException e10) {
                            e = e10;
                            if (uriInsert != null) {
                                contentResolver.delete(uriInsert, null, null);
                            }
                            throw new IOException(e);
                        }
                    } catch (IOException e11) {
                        e = e11;
                    }
                } catch (Throwable th) {
                    th = th;
                    CloseUtils.closeIO(contentValues2);
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                uriInsert = null;
            }
        } catch (Throwable th2) {
            th = th2;
            contentValues2 = contentValues;
        }
    }

    public static void setBufferSize(int i7) {
        sBufferSize = i7;
    }

    public static boolean writeFileFromBytesByChannel(String str, byte[] bArr, boolean z3) {
        return writeFileFromBytesByChannel(getFileByPath(str), bArr, false, z3);
    }

    public static boolean writeFileFromBytesByMap(String str, byte[] bArr, boolean z3) {
        return writeFileFromBytesByMap(str, bArr, false, z3);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr) {
        return writeFileFromBytesByStream(getFileByPath(str), bArr, false);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream) {
        return writeFileFromIS(getFileByPath(str), inputStream, false);
    }

    public static boolean writeFileFromString(String str, String str2) {
        return writeFileFromString(getFileByPath(str), str2, false);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] readFile2BytesByChannel(File file) throws Throwable {
        FileChannel channel;
        File file2 = null;
        try {
            if (!isFileExists(file)) {
                return null;
            }
            try {
                channel = new RandomAccessFile(file, "r").getChannel();
                try {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) channel.size());
                    while (channel.read(byteBufferAllocate) > 0) {
                    }
                    byte[] bArrArray = byteBufferAllocate.array();
                    CloseUtils.closeIO(channel);
                    return bArrArray;
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    CloseUtils.closeIO(channel);
                    return null;
                }
            } catch (IOException e11) {
                e = e11;
                channel = null;
            } catch (Throwable th) {
                th = th;
                CloseUtils.closeIO(file2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            file2 = file;
        }
    }

    public static byte[] readFile2BytesByMap(File file) throws Throwable {
        Throwable th;
        IOException iOException;
        FileChannel channel;
        FileChannel fileChannel = null;
        if (!isFileExists(file)) {
            return null;
        }
        try {
            channel = new RandomAccessFile(file, "r").getChannel();
            try {
                try {
                    int size = (int) channel.size();
                    byte[] bArr = new byte[size];
                    channel.map(FileChannel.MapMode.READ_ONLY, 0L, size).load().get(bArr, 0, size);
                    CloseUtils.closeIO(channel);
                    return bArr;
                } catch (IOException e10) {
                    iOException = e10;
                    iOException.printStackTrace();
                    CloseUtils.closeIO(channel);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileChannel = channel;
                CloseUtils.closeIO(fileChannel);
                throw th;
            }
        } catch (IOException e11) {
            iOException = e11;
            channel = null;
        } catch (Throwable th3) {
            th = th3;
            CloseUtils.closeIO(fileChannel);
            throw th;
        }
    }

    public static byte[] readFile2BytesByStream(File file) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        if (!isFileExists(file)) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        byte[] bArr = new byte[sBufferSize];
                        while (true) {
                            int i7 = fileInputStream.read(bArr, 0, sBufferSize);
                            if (i7 == -1) {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                CloseUtils.closeIO(fileInputStream, byteArrayOutputStream);
                                return byteArray;
                            }
                            byteArrayOutputStream.write(bArr, 0, i7);
                            th = th;
                            CloseUtils.closeIO(fileInputStream, byteArrayOutputStream);
                            throw th;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        e.printStackTrace();
                        CloseUtils.closeIO(fileInputStream, byteArrayOutputStream);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e11) {
                e = e11;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (IOException e12) {
            e = e12;
            byteArrayOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    public static List<String> readFile2List(String str, String str2) {
        return readFile2List(getFileByPath(str), str2);
    }

    public static String readFile2String(String str, String str2) {
        return readFile2String(getFileByPath(str), str2);
    }

    public static boolean writeFileFromBytesByChannel(String str, byte[] bArr, boolean z3, boolean z8) {
        return writeFileFromBytesByChannel(getFileByPath(str), bArr, z3, z8);
    }

    public static boolean writeFileFromBytesByMap(String str, byte[] bArr, boolean z3, boolean z8) {
        return writeFileFromBytesByMap(getFileByPath(str), bArr, z3, z8);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, boolean z3) {
        return writeFileFromBytesByStream(getFileByPath(str), bArr, z3);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, boolean z3) {
        return writeFileFromIS(getFileByPath(str), inputStream, z3);
    }

    public static boolean writeFileFromString(String str, String str2, boolean z3) {
        return writeFileFromString(getFileByPath(str), str2, z3);
    }

    public static List<String> readFile2List(File file) {
        return readFile2List(file, 0, Integer.MAX_VALUE, (String) null);
    }

    public static String readFile2String(File file) {
        return readFile2String(file, (String) null);
    }

    public static boolean writeFileFromBytesByChannel(File file, byte[] bArr, boolean z3) {
        return writeFileFromBytesByChannel(file, bArr, false, z3);
    }

    public static boolean writeFileFromBytesByMap(File file, byte[] bArr, boolean z3) {
        return writeFileFromBytesByMap(file, bArr, false, z3);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr) {
        return writeFileFromBytesByStream(file, bArr, false);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream) {
        return writeFileFromIS(file, inputStream, false);
    }

    public static boolean writeFileFromString(File file, String str) {
        return writeFileFromString(file, str, false);
    }

    public static List<String> readFile2List(File file, String str) {
        return readFile2List(file, 0, Integer.MAX_VALUE, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String readFile2String(File file, String str) throws Throwable {
        BufferedReader bufferedReader;
        String str2 = null;
        try {
            if (!isFileExists(file)) {
                return null;
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                if (isSpace(str)) {
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                } else {
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), str));
                }
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb2.append(line);
                        while (true) {
                            String line2 = bufferedReader.readLine();
                            if (line2 == null) {
                                break;
                            }
                            sb2.append(LINE_SEP);
                            sb2.append(line2);
                        }
                    }
                    String string = sb2.toString();
                    CloseUtils.closeIO(bufferedReader);
                    return string;
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    CloseUtils.closeIO(bufferedReader);
                    return null;
                }
            } catch (IOException e11) {
                e = e11;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                CloseUtils.closeIO(str2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            str2 = str;
        }
    }

    public static boolean writeFileFromBytesByChannel(File file, byte[] bArr, boolean z3, boolean z8) {
        if (bArr == null) {
            return false;
        }
        FileChannel channel = null;
        try {
            try {
                channel = new FileOutputStream(file, z3).getChannel();
                channel.position(channel.size());
                channel.write(ByteBuffer.wrap(bArr));
                if (z8) {
                    channel.force(true);
                }
                CloseUtils.closeIO(channel);
                return true;
            } catch (IOException e10) {
                e10.printStackTrace();
                CloseUtils.closeIO(channel);
                return false;
            }
        } catch (Throwable th) {
            CloseUtils.closeIO(channel);
            throw th;
        }
    }

    public static boolean writeFileFromBytesByMap(File file, byte[] bArr, boolean z3, boolean z8) throws Throwable {
        IOException iOException;
        Throwable th;
        if (bArr == null || !createOrExistsFile(file)) {
            return false;
        }
        FileChannel fileChannel = null;
        try {
            try {
                FileChannel channel = new FileOutputStream(file, z3).getChannel();
                try {
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, channel.size(), bArr.length);
                    map.put(bArr);
                    if (z8) {
                        map.force();
                    }
                    CloseUtils.closeIO(channel);
                    return true;
                } catch (IOException e10) {
                    iOException = e10;
                    fileChannel = channel;
                    iOException.printStackTrace();
                    CloseUtils.closeIO(fileChannel);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = channel;
                    CloseUtils.closeIO(fileChannel);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            iOException = e11;
        }
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, boolean z3) throws Throwable {
        if (bArr == null || !createOrExistsFile(file)) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file, z3));
                try {
                    bufferedOutputStream2.write(bArr);
                    CloseUtils.closeIO(bufferedOutputStream2);
                    return true;
                } catch (IOException e10) {
                    e = e10;
                    bufferedOutputStream = bufferedOutputStream2;
                    e.printStackTrace();
                    CloseUtils.closeIO(bufferedOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    CloseUtils.closeIO(bufferedOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream, boolean z3) throws Throwable {
        if (!createOrExistsFile(file) || inputStream == null) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file, z3));
                try {
                    byte[] bArr = new byte[sBufferSize];
                    while (true) {
                        int i7 = inputStream.read(bArr, 0, sBufferSize);
                        if (i7 != -1) {
                            bufferedOutputStream2.write(bArr, 0, i7);
                        } else {
                            CloseUtils.closeIO(inputStream, bufferedOutputStream2);
                            return true;
                        }
                    }
                } catch (IOException e10) {
                    e = e10;
                    bufferedOutputStream = bufferedOutputStream2;
                    e.printStackTrace();
                    CloseUtils.closeIO(inputStream, bufferedOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    CloseUtils.closeIO(inputStream, bufferedOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean writeFileFromString(File file, String str, boolean z3) throws Throwable {
        if (file == null || str == null || !createOrExistsFile(file)) {
            return false;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file, z3));
                try {
                    bufferedWriter2.write(str);
                    CloseUtils.closeIO(bufferedWriter2);
                    return true;
                } catch (IOException e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    e.printStackTrace();
                    CloseUtils.closeIO(bufferedWriter);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CloseUtils.closeIO(bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public static List<String> readFile2List(String str, int i7, int i10) {
        return readFile2List(getFileByPath(str), i7, i10, (String) null);
    }

    public static List<String> readFile2List(String str, int i7, int i10, String str2) {
        return readFile2List(getFileByPath(str), i7, i10, str2);
    }

    public static List<String> readFile2List(File file, int i7, int i10) {
        return readFile2List(file, i7, i10, (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List<String> readFile2List(File file, int i7, int i10, String str) throws Throwable {
        BufferedReader bufferedReader;
        int i11 = 1;
        String str2 = null;
        if (!isFileExists(file)) {
            return null;
        }
        try {
            if (i7 > i10) {
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                if (isSpace(str)) {
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                } else {
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), str));
                }
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null || i11 > i10) {
                            break;
                            break;
                        }
                        if (i7 <= i11 && i11 <= i10) {
                            arrayList.add(line);
                        }
                        i11++;
                    } catch (IOException e10) {
                        e = e10;
                        e.printStackTrace();
                        CloseUtils.closeIO(bufferedReader);
                        return null;
                    }
                }
                CloseUtils.closeIO(bufferedReader);
                return arrayList;
            } catch (IOException e11) {
                e = e11;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                CloseUtils.closeIO(str2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            str2 = str;
        }
    }
}
