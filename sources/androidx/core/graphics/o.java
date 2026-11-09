package androidx.core.graphics;

import N8.q0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public o() {
        new ConcurrentHashMap();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float[] b(int i7, float[] fArr) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i7, length);
        float[] fArr2 = new float[i7];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static boolean c(File file, Resources resources, int i7) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i7);
            try {
                boolean zD = d(file, inputStreamOpenRawResource);
                a(inputStreamOpenRawResource);
                return zD;
            } catch (Throwable th) {
                th = th;
                a(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean d(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i7 = inputStream.read(bArr);
                        if (i7 == -1) {
                            a(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i7);
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static ColorFilter e(int i7, b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objB = a.b(bVar);
            if (objB != null) {
                return a.a(i7, objB);
            }
            return null;
        }
        PorterDuff.Mode modeQ = q(bVar);
        if (modeQ != null) {
            return new PorterDuffColorFilter(i7, modeQ);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[SYNTHETIC] */
    public static g[] k(String str) {
        int i7;
        String strTrim;
        float[] fArrB;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i12 < str.length()) {
            while (i12 < str.length()) {
                char cCharAt = str.charAt(i12);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i11, i12).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i10) != 'z' || strTrim.charAt(i10) == 'Z') {
                                fArrB = new float[i10];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i13 = i10;
                                    int i14 = 1;
                                    while (i14 < length) {
                                        int i15 = i10;
                                        int i16 = i15;
                                        int i17 = i16;
                                        int i18 = i17;
                                        for (int i19 = i14; i19 < strTrim.length(); i19++) {
                                            char cCharAt2 = strTrim.charAt(i19);
                                            if (cCharAt2 == ' ') {
                                                i15 = 0;
                                                i17 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i15 = 0;
                                                        i17 = 1;
                                                        break;
                                                    case '-':
                                                        if (i19 == i14 || i15 != 0) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 0;
                                                            i17 = 1;
                                                            i18 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i16 == 0) {
                                                            i15 = 0;
                                                            i16 = 1;
                                                        } else {
                                                            i15 = 0;
                                                            i17 = 1;
                                                            i18 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i15 = 0;
                                                        break;
                                                }
                                            } else {
                                                i15 = 1;
                                            }
                                            if (i17 != 0) {
                                                if (i14 < i19) {
                                                    fArr[i13] = Float.parseFloat(strTrim.substring(i14, i19));
                                                    i13++;
                                                }
                                                if (i18 != 0) {
                                                    i14 = i19;
                                                } else {
                                                    i14 = i19 + 1;
                                                }
                                                i10 = 0;
                                            }
                                        }
                                        if (i14 < i19) {
                                            fArr[i13] = Float.parseFloat(strTrim.substring(i14, i19));
                                            i13++;
                                        }
                                        if (i18 != 0) {
                                            i14 = i19;
                                        } else {
                                            i14 = i19 + 1;
                                        }
                                        i10 = 0;
                                    }
                                    fArrB = b(i13, fArr);
                                    i10 = 0;
                                } catch (NumberFormatException e10) {
                                    throw new RuntimeException(q0.k("error in parsing \"", strTrim, "\""), e10);
                                }
                            }
                            arrayList.add(new g(strTrim.charAt(i10), fArrB));
                        }
                        i11 = i12;
                        i12++;
                        i10 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i12++;
            }
            strTrim = str.substring(i11, i12).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i10) != 'z') {
                    fArrB = new float[i10];
                } else {
                    fArrB = new float[i10];
                }
                arrayList.add(new g(strTrim.charAt(i10), fArrB));
            }
            i11 = i12;
            i12++;
            i10 = 0;
        }
        if (i12 - i11 != 1 || i11 >= str.length()) {
            i7 = 0;
        } else {
            i7 = 0;
            arrayList.add(new g(str.charAt(i11), new float[0]));
        }
        return (g[]) arrayList.toArray(new g[i7]);
    }

    public static Path l(String str) {
        Path path = new Path();
        try {
            g.b(k(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing ".concat(str), e10);
        }
    }

    public static g[] m(g[] gVarArr) {
        g[] gVarArr2 = new g[gVarArr.length];
        for (int i7 = 0; i7 < gVarArr.length; i7++) {
            gVarArr2[i7] = new g(gVarArr[i7]);
        }
        return gVarArr2;
    }

    public static File o(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i7 = 0; i7 < 100; i7++) {
            File file = new File(cacheDir, str + i7);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static MappedByteBuffer p(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static PorterDuff.Mode q(b bVar) {
        if (bVar == null) {
            return null;
        }
        switch (c.f16044a[bVar.ordinal()]) {
            case 1:
                return PorterDuff.Mode.CLEAR;
            case 2:
                return PorterDuff.Mode.SRC;
            case 3:
                return PorterDuff.Mode.DST;
            case 4:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.DST_OVER;
            case 6:
                return PorterDuff.Mode.SRC_IN;
            case 7:
                return PorterDuff.Mode.DST_IN;
            case 8:
                return PorterDuff.Mode.SRC_OUT;
            case 9:
                return PorterDuff.Mode.DST_OUT;
            case 10:
                return PorterDuff.Mode.SRC_ATOP;
            case 11:
                return PorterDuff.Mode.DST_ATOP;
            case 12:
                return PorterDuff.Mode.XOR;
            case 13:
                return PorterDuff.Mode.ADD;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.OVERLAY;
            case 17:
                return PorterDuff.Mode.DARKEN;
            case 18:
                return PorterDuff.Mode.LIGHTEN;
            default:
                return null;
        }
    }

    public abstract Typeface f(Context context, Y.c cVar, Resources resources, int i7);

    public abstract Typeface g(Context context, androidx.core.provider.j[] jVarArr, int i7);

    public Typeface h(Context context, List list, int i7) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface i(Context context, InputStream inputStream) {
        File fileO = o(context);
        if (fileO == null) {
            return null;
        }
        try {
            if (d(fileO, inputStream)) {
                return Typeface.createFromFile(fileO.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileO.delete();
        }
    }

    public Typeface j(Context context, Resources resources, int i7, String str, int i10) {
        File fileO = o(context);
        if (fileO == null) {
            return null;
        }
        try {
            if (c(fileO, resources, i7)) {
                return Typeface.createFromFile(fileO.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileO.delete();
        }
    }

    public androidx.core.provider.j n(androidx.core.provider.j[] jVarArr, int i7) {
        n nVar = new n();
        int i10 = (i7 & 1) == 0 ? 400 : 700;
        boolean z3 = (i7 & 2) != 0;
        androidx.core.provider.j jVar = null;
        int i11 = Integer.MAX_VALUE;
        for (androidx.core.provider.j jVar2 : jVarArr) {
            int iAbs = (Math.abs(nVar.getWeight(jVar2) - i10) * 2) + (nVar.isItalic(jVar2) == z3 ? 0 : 1);
            if (jVar == null || i11 > iAbs) {
                jVar = jVar2;
                i11 = iAbs;
            }
        }
        return jVar;
    }
}
