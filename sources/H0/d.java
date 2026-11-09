package H0;

import C0.G;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.camera.video.u;
import androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final org.sufficientlysecure.htmltextview.f f3555a = new org.sufficientlysecure.htmltextview.f(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f3556b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f3557c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f3558d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f3559e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f3560f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f3561g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f3562h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f3563i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f3564j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int length = 0;
        for (c cVar : cVarArr) {
            length += ((((cVar.f3552g * 2) + 7) & (-8)) / 8) + (cVar.f3550e * 2) + d(cVar.f3546a, cVar.f3547b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f3551f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f3560f)) {
            for (c cVar2 : cVarArr) {
                p(byteArrayOutputStream, cVar2, d(cVar2.f3546a, cVar2.f3547b, bArr));
                r(byteArrayOutputStream, cVar2);
                int[] iArr = cVar2.f3553h;
                int length2 = iArr.length;
                int i7 = 0;
                int i10 = 0;
                while (i7 < length2) {
                    int i11 = iArr[i7];
                    u(byteArrayOutputStream, i11 - i10);
                    i7++;
                    i10 = i11;
                }
                q(byteArrayOutputStream, cVar2);
            }
        } else {
            for (c cVar3 : cVarArr) {
                p(byteArrayOutputStream, cVar3, d(cVar3.f3546a, cVar3.f3547b, bArr));
            }
            for (c cVar4 : cVarArr) {
                r(byteArrayOutputStream, cVar4);
                int[] iArr2 = cVar4.f3553h;
                int length3 = iArr2.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length3) {
                    int i14 = iArr2[i12];
                    u(byteArrayOutputStream, i14 - i13);
                    i12++;
                    i13 = i14;
                }
                q(byteArrayOutputStream, cVar4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z3 = true;
        for (File file2 : fileArrListFiles) {
            z3 = c(file2) && z3;
        }
        return z3;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f3562h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f3561g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return G.r(u.s(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(int i7, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[i7];
        int i10 = 0;
        while (i10 < i7) {
            int i11 = inputStream.read(bArr, i10, i7 - i10);
            if (i11 < 0) {
                throw new IllegalStateException(G.m(i7, "Not enough bytes to read: "));
            }
            i10 += i11;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i7) {
        int[] iArr = new int[i7];
        int iM = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            iM += (int) m(2, byteArrayInputStream);
            iArr[i10] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i7, int i10) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[2048];
            int i11 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i11 < i7) {
                int i12 = fileInputStream.read(bArr2);
                if (i12 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i7 + " bytes");
                }
                inflater.setInput(bArr2, 0, i12);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i10 - iInflate);
                    i11 += i12;
                } catch (DataFormatException e10) {
                    throw new IllegalStateException(e10.getMessage());
                }
            }
            if (i11 == i7) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i7 + " actual=" + i11);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) throws IOException {
        byte[] bArr3 = f3563i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f3564j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(2, fileInputStream);
            byte[] bArrH = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                c[] cVarArrK = k(byteArrayInputStream, bArr2, iM, cVarArr);
                byteArrayInputStream.close();
                return cVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f3558d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(1, fileInputStream);
        byte[] bArrH2 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            c[] cVarArrJ = j(byteArrayInputStream2, iM2, cVarArr);
            byteArrayInputStream2.close();
            return cVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i7, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i7 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i7];
        int[] iArr = new int[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            int iM = (int) m(2, byteArrayInputStream);
            iArr[i10] = (int) m(2, byteArrayInputStream);
            strArr[i10] = new String(f(iM, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i11 = 0; i11 < i7; i11++) {
            c cVar = cVarArr[i11];
            if (!cVar.f3547b.equals(strArr[i11])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i12 = iArr[i11];
            cVar.f3550e = i12;
            cVar.f3553h = g(byteArrayInputStream, i12);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i7, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i7 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i10 = 0; i10 < i7; i10++) {
            m(2, byteArrayInputStream);
            String str = new String(f((int) m(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long jM = m(4, byteArrayInputStream);
            int iM = (int) m(2, byteArrayInputStream);
            c cVar = null;
            if (cVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i11 = 0; i11 < cVarArr.length; i11++) {
                    if (cVarArr[i11].f3547b.equals(strSubstring)) {
                        cVar = cVarArr[i11];
                        break;
                    }
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f3549d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f3562h)) {
                cVar.f3550e = iM;
                cVar.f3553h = iArrG;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f3559e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(1, fileInputStream);
        byte[] bArrH = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            c[] cVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return cVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(int i7, InputStream inputStream) throws IOException {
        byte[] bArrF = f(i7, inputStream);
        long j6 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j6 += ((long) (bArrF[i10] & UnsignedBytes.MAX_VALUE)) << (i10 * 8);
        }
        return j6;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i7) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            int iM = (int) m(2, byteArrayInputStream);
            int iM2 = (int) m(2, byteArrayInputStream);
            cVarArr[i10] = new c(str, new String(f(iM, byteArrayInputStream), StandardCharsets.UTF_8), m(4, byteArrayInputStream), iM2, (int) m(4, byteArrayInputStream), (int) m(4, byteArrayInputStream), new int[iM2], new TreeMap());
        }
        for (int i11 = 0; i11 < i7; i11++) {
            c cVar = cVarArr[i11];
            int iAvailable = byteArrayInputStream.available() - cVar.f3551f;
            int iM3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = cVar.f3554i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3 += (int) m(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(iM3), 1);
                for (int iM4 = (int) m(2, byteArrayInputStream); iM4 > 0; iM4--) {
                    m(2, byteArrayInputStream);
                    int iM5 = (int) m(1, byteArrayInputStream);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(1, byteArrayInputStream);
                            for (int iM6 = (int) m(1, byteArrayInputStream); iM6 > 0; iM6--) {
                                m(2, byteArrayInputStream);
                            }
                            iM5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f3553h = g(byteArrayInputStream, cVar.f3550e);
            int i12 = cVar.f3552g;
            BitSet bitSetValueOf = BitSet.valueOf(f((((i12 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : 0;
                if (bitSetValueOf.get(i13 + i12)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) throws IOException {
        long j6;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f3558d;
        int i7 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f3559e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(cVarArr, bArr3);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                t(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f3561g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f3554i.size() * 4;
                    String strD = d(cVar.f3546a, cVar.f3547b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, strD.getBytes(charset).length);
                    u(byteArrayOutputStream, cVar.f3553h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, cVar.f3548c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = cVar.f3554i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i10 : cVar.f3553h) {
                        u(byteArrayOutputStream, i10);
                    }
                }
                return true;
            }
            byte[] bArr5 = f3560f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(cVarArr, bArr5);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                t(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f3562h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String strD2 = d(cVar2.f3546a, cVar2.f3547b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, strD2.getBytes(charset2).length);
                TreeMap treeMap = cVar2.f3554i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, cVar2.f3553h.length);
                t(byteArrayOutputStream, cVar2.f3548c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i11 : cVar2.f3553h) {
                    u(byteArrayOutputStream, i11);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, cVarArr.length);
            int i12 = 2;
            int i13 = 2;
            for (c cVar3 : cVarArr) {
                t(byteArrayOutputStream2, cVar3.f3548c, 4);
                t(byteArrayOutputStream2, cVar3.f3549d, 4);
                t(byteArrayOutputStream2, cVar3.f3552g, 4);
                String strD3 = d(cVar3.f3546a, cVar3.f3547b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i13 = i13 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i13 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray.length);
            }
            l lVar = new l(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(lVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i14];
                    u(byteArrayOutputStream3, i14);
                    u(byteArrayOutputStream3, cVar4.f3550e);
                    i15 = i15 + 4 + (cVar4.f3550e * i12);
                    int[] iArr = cVar4.f3553h;
                    int length3 = iArr.length;
                    int i16 = i7;
                    int i17 = i12;
                    int i18 = i16;
                    while (i18 < length3) {
                        int i19 = iArr[i18];
                        u(byteArrayOutputStream3, i19 - i16);
                        i18++;
                        i16 = i19;
                    }
                    i14++;
                    i12 = i17;
                    i7 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
            }
            l lVar2 = new l(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(lVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i20 = 0;
            int i21 = 0;
            while (i20 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i20];
                    Iterator it3 = cVar5.f3554i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream5, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream6, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            u(byteArrayOutputStream4, i20);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i22 = i21 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream4, length4, 4);
                            u(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i21 = i22 + length4;
                            i20++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i21 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i21 + ", does not match actual size " + byteArray5.length);
            }
            l lVar3 = new l(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(lVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + ((long) (arrayList2.size() * 16));
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i23 = 0;
            while (i23 < arrayList2.size()) {
                l lVar4 = (l) arrayList2.get(i23);
                int i24 = lVar4.f3576a;
                if (i24 == 1) {
                    j6 = 0;
                } else if (i24 == 2) {
                    j6 = 1;
                } else if (i24 == 3) {
                    j6 = 2;
                } else if (i24 == 4) {
                    j6 = 3;
                } else {
                    if (i24 != 5) {
                        throw null;
                    }
                    j6 = 4;
                }
                t(byteArrayOutputStream, j6, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = lVar4.f3577b;
                if (lVar4.f3578c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    t(byteArrayOutputStream, bArrA3.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i23++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i25 = 0; i25 < arrayList6.size(); i25++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i25));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, cVar.f3550e);
        t(byteArrayOutputStream, cVar.f3551f, 4);
        t(byteArrayOutputStream, cVar.f3548c, 4);
        t(byteArrayOutputStream, cVar.f3552g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        byte[] bArr = new byte[(((cVar.f3552g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f3554i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i7 = iIntValue / 8;
                bArr[i7] = (byte) (bArr[i7] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i10 = iIntValue + cVar.f3552g;
                int i11 = i10 / 8;
                bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        int i7 = 0;
        for (Map.Entry entry : cVar.f3554i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, iIntValue - i7);
                u(byteArrayOutputStream, 0);
                i7 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0164 A[Catch: all -> 0x0161, TRY_ENTER, TryCatch #3 {all -> 0x0161, blocks: (B:93:0x0140, B:95:0x014c, B:106:0x0164, B:107:0x0169), top: B:225:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0175 A[Catch: IllegalStateException -> 0x015b, IOException -> 0x015d, FileNotFoundException -> 0x015f, TRY_LEAVE, TryCatch #27 {FileNotFoundException -> 0x015f, IOException -> 0x015d, IllegalStateException -> 0x015b, blocks: (B:91:0x0138, B:96:0x0156, B:114:0x0175, B:112:0x0172, B:111:0x016f), top: B:263:0x0138 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x018b  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ae A[Catch: all -> 0x01bc, TRY_LEAVE, TryCatch #20 {all -> 0x01bc, blocks: (B:130:0x01a2, B:132:0x01ae, B:141:0x01bf), top: B:246:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01bf A[Catch: all -> 0x01bc, TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x01bc, blocks: (B:130:0x01a2, B:132:0x01ae, B:141:0x01bf), top: B:246:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:165:0x0204 A[Catch: all -> 0x0226, TRY_LEAVE, TryCatch #7 {all -> 0x0226, blocks: (B:162:0x01fc, B:163:0x01fe, B:165:0x0204), top: B:224:0x01fc }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0253  */
    /* JADX WARN: Code duplicated, block: B:210:0x025d  */
    /* JADX WARN: Code duplicated, block: B:215:0x026a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x026e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x014c A[Catch: all -> 0x0161, TRY_LEAVE, TryCatch #3 {all -> 0x0161, blocks: (B:93:0x0140, B:95:0x014c, B:106:0x0164, B:107:0x0169), top: B:225:0x0140 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v3, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static void s(Context context, Executor executor, ProfileInstaller$DiagnosticsCallback profileInstaller$DiagnosticsCallback, boolean z3) {
        boolean z8;
        ?? r10;
        FileInputStream fileInputStreamA;
        c[] cVarArrL;
        ProfileInstaller$DiagnosticsCallback profileInstaller$DiagnosticsCallback2;
        c[] cVarArr;
        byte[] bArr;
        ?? r11;
        boolean z10;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr2;
        int i7;
        ?? r12;
        boolean z11;
        byte[] bArr3;
        ?? byteArrayOutputStream;
        int i10;
        b bVar;
        FileInputStream fileInputStreamA2;
        ?? r13;
        ?? r14;
        boolean z12;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z3) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j6 = dataInputStream.readLong();
                            dataInputStream.close();
                            z12 = j6 == packageInfo.lastUpdateTime;
                            if (z12) {
                                profileInstaller$DiagnosticsCallback.onResultReceived(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z12 = false;
                    }
                } else {
                    z12 = false;
                }
                if (z12) {
                    context.getPackageName();
                    k.c(context, false);
                    return;
                }
            }
            context.getPackageName();
            int i11 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, profileInstaller$DiagnosticsCallback, name, file2);
            byte[] bArr4 = bVar2.f3540c;
            if (bArr4 == null) {
                bVar2.b(3, Integer.valueOf(i11));
            } else {
                try {
                    try {
                        try {
                            if (file2.exists()) {
                                if (!file2.canWrite()) {
                                    bVar2.b(4, null);
                                }
                                if (z11 || !z3) {
                                    r14 = 0;
                                } else {
                                    r14 = r13;
                                }
                                k.c(context, r14);
                            }
                            try {
                                file2.createNewFile();
                            } catch (IOException unused2) {
                                z8 = true;
                                bVar2.b(4, null);
                                z11 = false;
                                r13 = z8;
                            }
                            fileInputStreamA = bVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e10) {
                            profileInstaller$DiagnosticsCallback.onResultReceived(6, e10);
                            fileInputStreamA = null;
                        } catch (IOException e11) {
                            profileInstaller$DiagnosticsCallback.onResultReceived(7, e11);
                            fileInputStreamA = null;
                        }
                        if (fileInputStreamA != null) {
                            try {
                                if (!Arrays.equals((byte[]) r10, f(4, fileInputStreamA))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                cVarArrL = l(fileInputStreamA, f(4, fileInputStreamA), bVar2.f3542e);
                                try {
                                    fileInputStreamA.close();
                                } catch (IOException e12) {
                                    profileInstaller$DiagnosticsCallback.onResultReceived(7, e12);
                                }
                                bVar2.f3544g = cVarArrL;
                            } catch (IOException e13) {
                                profileInstaller$DiagnosticsCallback.onResultReceived(7, e13);
                                fileInputStreamA.close();
                                cVarArrL = null;
                            } catch (IllegalStateException e14) {
                                profileInstaller$DiagnosticsCallback.onResultReceived(8, e14);
                                fileInputStreamA.close();
                                cVarArrL = null;
                            }
                        }
                    } catch (IOException e15) {
                        profileInstaller$DiagnosticsCallback.onResultReceived(7, e15);
                    }
                    c[] cVarArr2 = bVar2.f3544g;
                    if (cVarArr2 != null && (i10 = Build.VERSION.SDK_INT) <= 34) {
                        if (i10 == 24 || i10 == 25) {
                            try {
                                fileInputStreamA2 = bVar2.a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamA2 == null) {
                                    try {
                                        if (Arrays.equals(f3557c, f(4, fileInputStreamA2))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        bVar2.f3544g = i(fileInputStreamA2, f(4, fileInputStreamA2), bArr4, cVarArr2);
                                        fileInputStreamA2.close();
                                        bVar = bVar2;
                                    } catch (Throwable th4) {
                                        try {
                                            fileInputStreamA2.close();
                                            throw th4;
                                        } catch (Throwable th5) {
                                            th4.addSuppressed(th5);
                                            throw th4;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamA2 != null) {
                                        fileInputStreamA2.close();
                                    }
                                    bVar = null;
                                }
                            } catch (FileNotFoundException e16) {
                                profileInstaller$DiagnosticsCallback.onResultReceived(9, e16);
                            } catch (IOException e17) {
                                profileInstaller$DiagnosticsCallback.onResultReceived(7, e17);
                            } catch (IllegalStateException e18) {
                                bVar2.f3544g = null;
                                profileInstaller$DiagnosticsCallback.onResultReceived(8, e18);
                            }
                            if (bVar != null) {
                                bVar2 = bVar;
                            }
                        } else {
                            switch (i10) {
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                    fileInputStreamA2 = bVar2.a(assets, "dexopt/baseline.profm");
                                    if (fileInputStreamA2 == null) {
                                        if (fileInputStreamA2 != null) {
                                            fileInputStreamA2.close();
                                        }
                                        bVar = null;
                                    } else {
                                        if (Arrays.equals(f3557c, f(4, fileInputStreamA2))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        bVar2.f3544g = i(fileInputStreamA2, f(4, fileInputStreamA2), bArr4, cVarArr2);
                                        fileInputStreamA2.close();
                                        bVar = bVar2;
                                    }
                                    if (bVar != null) {
                                        bVar2 = bVar;
                                        break;
                                    }
                                default:
                                    profileInstaller$DiagnosticsCallback2 = bVar2.f3539b;
                                    cVarArr = bVar2.f3544g;
                                    if (cVarArr != null && (bArr3 = bVar2.f3540c) != null) {
                                        if (bVar2.f3543f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            try {
                                                byteArrayOutputStream.write(r10);
                                                byteArrayOutputStream.write(bArr3);
                                                if (o(byteArrayOutputStream, bArr3, cVarArr)) {
                                                    bVar2.f3545h = byteArrayOutputStream.toByteArray();
                                                    byteArrayOutputStream.close();
                                                    bVar2.f3544g = null;
                                                } else {
                                                    profileInstaller$DiagnosticsCallback2.onResultReceived(5, null);
                                                    bVar2.f3544g = null;
                                                    byteArrayOutputStream.close();
                                                }
                                            } catch (Throwable th6) {
                                                try {
                                                    byteArrayOutputStream.close();
                                                    throw th6;
                                                } catch (Throwable th7) {
                                                    th6.addSuppressed(th7);
                                                    throw th6;
                                                }
                                            }
                                        } catch (IOException e19) {
                                            profileInstaller$DiagnosticsCallback2.onResultReceived(7, e19);
                                        } catch (IllegalStateException e20) {
                                            profileInstaller$DiagnosticsCallback2.onResultReceived(8, e20);
                                        }
                                    }
                                    bArr = bVar2.f3545h;
                                    if (bArr != null) {
                                        z10 = false;
                                        r12 = 1;
                                    } else {
                                        try {
                                            if (bVar2.f3543f) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            try {
                                                try {
                                                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                                                    try {
                                                        fileOutputStream = new FileOutputStream(bVar2.f3541d);
                                                        try {
                                                            try {
                                                                bArr2 = new byte[512];
                                                                while (true) {
                                                                    i7 = byteArrayInputStream.read(bArr2);
                                                                    if (i7 > 0) {
                                                                        fileOutputStream.write(bArr2, 0, i7);
                                                                    } else {
                                                                        r12 = 1;
                                                                        try {
                                                                            bVar2.b(1, null);
                                                                            fileOutputStream.close();
                                                                            byteArrayInputStream.close();
                                                                            bVar2.f3545h = null;
                                                                            bVar2.f3544g = null;
                                                                            z10 = true;
                                                                        } catch (Throwable th8) {
                                                                            th = th8;
                                                                        }
                                                                    }
                                                                    th = th;
                                                                    try {
                                                                        fileOutputStream.close();
                                                                        throw th;
                                                                    } catch (Throwable th9) {
                                                                        th.addSuppressed(th9);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                                Throwable th11 = th;
                                                                try {
                                                                    byteArrayInputStream.close();
                                                                    throw th11;
                                                                } catch (Throwable th12) {
                                                                    th11.addSuppressed(th12);
                                                                    throw th11;
                                                                }
                                                            }
                                                        } catch (Throwable th13) {
                                                            th = th13;
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                    }
                                                } catch (FileNotFoundException e21) {
                                                    e = e21;
                                                    bVar2.b(6, e);
                                                    r11 = r10;
                                                    bVar2.f3545h = null;
                                                    bVar2.f3544g = null;
                                                    z10 = false;
                                                    r12 = r11;
                                                } catch (IOException e22) {
                                                    e = e22;
                                                    bVar2.b(7, e);
                                                    r11 = r10;
                                                    bVar2.f3545h = null;
                                                    bVar2.f3544g = null;
                                                    z10 = false;
                                                    r12 = r11;
                                                }
                                            } catch (FileNotFoundException e23) {
                                                e = e23;
                                                r10 = 1;
                                                bVar2.b(6, e);
                                                r11 = r10;
                                                bVar2.f3545h = null;
                                                bVar2.f3544g = null;
                                                z10 = false;
                                                r12 = r11;
                                            } catch (IOException e24) {
                                                e = e24;
                                                r10 = 1;
                                                bVar2.b(7, e);
                                                r11 = r10;
                                                bVar2.f3545h = null;
                                                bVar2.f3544g = null;
                                                z10 = false;
                                                r12 = r11;
                                            }
                                        } catch (Throwable th15) {
                                            bVar2.f3545h = null;
                                            bVar2.f3544g = null;
                                            throw th15;
                                        }
                                    }
                                    if (z10) {
                                        e(packageInfo, filesDir);
                                    }
                                    z11 = z10;
                                    r13 = r12;
                                    if (z11) {
                                        r14 = 0;
                                    } else {
                                        r14 = 0;
                                    }
                                    k.c(context, r14);
                            }
                        }
                    }
                    profileInstaller$DiagnosticsCallback2 = bVar2.f3539b;
                    cVarArr = bVar2.f3544g;
                    if (cVarArr != null) {
                        if (bVar2.f3543f) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(r10);
                        byteArrayOutputStream.write(bArr3);
                        if (o(byteArrayOutputStream, bArr3, cVarArr)) {
                            profileInstaller$DiagnosticsCallback2.onResultReceived(5, null);
                            bVar2.f3544g = null;
                            byteArrayOutputStream.close();
                        } else {
                            bVar2.f3545h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bVar2.f3544g = null;
                        }
                    }
                    bArr = bVar2.f3545h;
                    if (bArr != null) {
                        if (bVar2.f3543f) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayInputStream = new ByteArrayInputStream(bArr);
                        fileOutputStream = new FileOutputStream(bVar2.f3541d);
                        bArr2 = new byte[512];
                        while (true) {
                            i7 = byteArrayInputStream.read(bArr2);
                            if (i7 > 0) {
                                fileOutputStream.write(bArr2, 0, i7);
                            } else {
                                r12 = 1;
                                bVar2.b(1, null);
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                bVar2.f3545h = null;
                                bVar2.f3544g = null;
                                z10 = true;
                            }
                            th = th;
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                    z10 = false;
                    r12 = 1;
                    if (z10) {
                        e(packageInfo, filesDir);
                    }
                    z11 = z10;
                    r13 = r12;
                    if (z11) {
                        r14 = 0;
                    } else {
                        r14 = 0;
                    }
                    k.c(context, r14);
                } catch (Throwable th16) {
                    try {
                        fileInputStreamA.close();
                        throw th16;
                    } catch (IOException e25) {
                        profileInstaller$DiagnosticsCallback.onResultReceived(7, e25);
                        throw th16;
                    }
                }
                bVar2.f3543f = true;
                r10 = f3556b;
            }
            z8 = true;
            z11 = false;
            r13 = z8;
            if (z11) {
                r14 = 0;
            } else {
                r14 = 0;
            }
            k.c(context, r14);
        } catch (PackageManager.NameNotFoundException e26) {
            profileInstaller$DiagnosticsCallback.onResultReceived(7, e26);
            k.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j6, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            bArr[i10] = (byte) ((j6 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i7) throws IOException {
        t(byteArrayOutputStream, i7, 2);
    }
}
