package p242q0;

import C0.G;
import android.util.Log;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f41357d;

    public c(int i7, int i10, byte[] bArr) {
        this(-1L, bArr, i7, i10);
    }

    public static c a(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(g.b0);
        return new c(2, bytes.length, bytes);
    }

    public static c b(long j6, ByteOrder byteOrder) {
        return c(new long[]{j6}, byteOrder);
    }

    public static c c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f41382S[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j6 : jArr) {
            byteBufferWrap.putInt((int) j6);
        }
        return new c(4, jArr.length, byteBufferWrap.array());
    }

    public static c d(e[] eVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f41382S[5] * eVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (e eVar : eVarArr) {
            byteBufferWrap.putInt((int) eVar.f41362a);
            byteBufferWrap.putInt((int) eVar.f41363b);
        }
        return new c(5, eVarArr.length, byteBufferWrap.array());
    }

    public static c e(int i7, ByteOrder byteOrder) {
        return f(new int[]{i7}, byteOrder);
    }

    public static c f(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f41382S[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i7 : iArr) {
            byteBufferWrap.putShort((short) i7);
        }
        return new c(3, iArr.length, byteBufferWrap.array());
    }

    public final double g(ByteOrder byteOrder) throws Throwable {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objJ instanceof String) {
            return Double.parseDouble((String) objJ);
        }
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objJ instanceof int[]) {
            int[] iArr = (int[]) objJ;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objJ instanceof double[]) {
            double[] dArr = (double[]) objJ;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objJ instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) objJ;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f41362a / eVar.f41363b;
    }

    public final int h(ByteOrder byteOrder) throws Throwable {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objJ instanceof String) {
            return Integer.parseInt((String) objJ);
        }
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objJ instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objJ;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String i(ByteOrder byteOrder) throws Throwable {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            return null;
        }
        if (objJ instanceof String) {
            return (String) objJ;
        }
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            while (i7 < jArr.length) {
                sb2.append(jArr[i7]);
                i7++;
                if (i7 != jArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objJ instanceof int[]) {
            int[] iArr = (int[]) objJ;
            while (i7 < iArr.length) {
                sb2.append(iArr[i7]);
                i7++;
                if (i7 != iArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objJ instanceof double[]) {
            double[] dArr = (double[]) objJ;
            while (i7 < dArr.length) {
                sb2.append(dArr[i7]);
                i7++;
                if (i7 != dArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (!(objJ instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) objJ;
        while (i7 < eVarArr.length) {
            sb2.append(eVarArr[i7].f41362a);
            sb2.append('/');
            sb2.append(eVarArr[i7].f41363b);
            i7++;
            if (i7 != eVarArr.length) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r15v19, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.io.Serializable, q0.e[]] */
    /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, q0.e[]] */
    /* JADX WARN: Type inference failed for: r15v25, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [double[], java.io.Serializable] */
    public final Serializable j(ByteOrder byteOrder) throws Throwable {
        b bVar;
        byte b7;
        String string;
        int length = 0;
        byte[] bArr = this.f41357d;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    bVar.f41351b = byteOrder;
                    int i7 = this.f41354a;
                    int i10 = this.f41355b;
                    switch (i7) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b7 = bArr[0]) < 0 || b7 > 1) {
                                String str = new String(bArr, g.b0);
                                try {
                                    bVar.close();
                                    return str;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b7 + 48)});
                            try {
                                bVar.close();
                                return str2;
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i10 >= g.f41383T.length) {
                                int i11 = 0;
                                while (true) {
                                    byte[] bArr2 = g.f41383T;
                                    if (i11 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i11] == bArr2[i11]) {
                                        i11++;
                                    }
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            try {
                                while (length < i10) {
                                    byte b10 = bArr[length];
                                    if (b10 == 0) {
                                        string = sb2.toString();
                                        bVar.close();
                                        return string;
                                    }
                                    if (b10 >= 32) {
                                        sb2.append((char) b10);
                                    } else {
                                        sb2.append('?');
                                    }
                                    length++;
                                }
                                bVar.close();
                                return string;
                            } catch (IOException e12) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                return string;
                            }
                            string = sb2.toString();
                        case 3:
                            ?? r15 = new int[i10];
                            while (length < i10) {
                                r15[length] = bVar.readUnsignedShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                return r15;
                            } catch (IOException e13) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                return r15;
                            }
                        case 4:
                            ?? r16 = new long[i10];
                            while (length < i10) {
                                r16[length] = ((long) bVar.readInt()) & 4294967295L;
                                length++;
                            }
                            try {
                                bVar.close();
                                return r16;
                            } catch (IOException e14) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                return r16;
                            }
                        case 5:
                            ?? r17 = new e[i10];
                            while (length < i10) {
                                r17[length] = new e(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                                length++;
                            }
                            try {
                                bVar.close();
                                return r17;
                            } catch (IOException e15) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                return r17;
                            }
                        case 8:
                            ?? r18 = new int[i10];
                            while (length < i10) {
                                r18[length] = bVar.readShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                return r18;
                            } catch (IOException e16) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                                return r18;
                            }
                        case 9:
                            ?? r19 = new int[i10];
                            while (length < i10) {
                                r19[length] = bVar.readInt();
                                length++;
                            }
                            try {
                                bVar.close();
                                return r19;
                            } catch (IOException e17) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                                return r19;
                            }
                        case 10:
                            ?? r110 = new e[i10];
                            while (length < i10) {
                                r110[length] = new e(bVar.readInt(), bVar.readInt());
                                length++;
                            }
                            try {
                                bVar.close();
                                return r110;
                            } catch (IOException e18) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                                return r110;
                            }
                        case 11:
                            ?? r111 = new double[i10];
                            while (length < i10) {
                                r111[length] = bVar.readFloat();
                                length++;
                            }
                            try {
                                bVar.close();
                                return r111;
                            } catch (IOException e19) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                                return r111;
                            }
                        case 12:
                            ?? r112 = new double[i10];
                            while (length < i10) {
                                r112[length] = bVar.readDouble();
                                length++;
                            }
                            try {
                                bVar.close();
                                return r112;
                            } catch (IOException e20) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e20);
                                return r112;
                            }
                        default:
                            bVar.close();
                            return null;
                    }
                } catch (IOException unused) {
                    if (bVar != null) {
                        bVar.close();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        try {
                            bVar2.close();
                        } catch (IOException e21) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e21);
                        }
                    }
                    throw th;
                }
            } catch (IOException e22) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", e22);
                return null;
            }
        } catch (IOException unused2) {
            bVar = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(g.f41381R[this.f41354a]);
        sb2.append(", data length:");
        return G.n(this.f41357d.length, ")", sb2);
    }

    public c(long j6, byte[] bArr, int i7, int i10) {
        this.f41354a = i7;
        this.f41355b = i10;
        this.f41356c = j6;
        this.f41357d = bArr;
    }
}
