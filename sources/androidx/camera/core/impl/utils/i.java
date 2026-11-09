package androidx.camera.core.impl.utils;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f14224c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f14225d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f14226e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ArrayList f14227f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteOrder f14229b;

    static {
        g gVar = new g(0);
        gVar.f14222b = 0;
        f14227f = Collections.list(gVar);
    }

    public i() {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        g gVar = new g(1);
        gVar.f14222b = 0;
        this.f14228a = Collections.list(gVar);
        this.f14229b = byteOrder;
    }

    public static Pair a(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairA = a(strArrSplit[0]);
            if (((Integer) pairA.first).intValue() == 2) {
                return pairA;
            }
            for (int i7 = 1; i7 < strArrSplit.length; i7++) {
                Pair pairA2 = a(strArrSplit[i7]);
                int iIntValue = (((Integer) pairA2.first).equals(pairA.first) || ((Integer) pairA2.second).equals(pairA.first)) ? ((Integer) pairA.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairA.second).intValue() == -1 || !(((Integer) pairA2.first).equals(pairA.second) || ((Integer) pairA2.second).equals(pairA.second))) ? -1 : ((Integer) pairA.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairA;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j6 = Long.parseLong(str);
                    if (j6 < 0 || j6 > 65535) {
                        return j6 < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j10 = (long) Double.parseDouble(strArrSplit2[0]);
                long j11 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j10 >= 0 && j11 >= 0) {
                    if (j10 <= 2147483647L && j11 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public final void b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        c(str, str2, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f4 A[LOOP:9: B:98:0x02f1->B:100:0x02f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:102:0x030e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0320 A[LOOP:10: B:103:0x031d->B:105:0x0320, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x0343 A[LOOP:11: B:107:0x0341->B:108:0x0343, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0360  */
    /* JADX WARN: Code duplicated, block: B:111:0x0387  */
    /* JADX WARN: Code duplicated, block: B:118:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:62:0x0154  */
    /* JADX WARN: Code duplicated, block: B:65:0x015f A[LOOP:1: B:63:0x015c->B:65:0x015f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0182 A[LOOP:2: B:67:0x0180->B:68:0x0182, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b2 A[LOOP:3: B:72:0x01af->B:74:0x01b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01fd A[LOOP:4: B:76:0x01fb->B:77:0x01fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x0223  */
    /* JADX WARN: Code duplicated, block: B:84:0x0235 A[LOOP:5: B:82:0x0232->B:84:0x0235, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x025a A[LOOP:6: B:86:0x0258->B:87:0x025a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x026f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0283 A[LOOP:7: B:90:0x0280->B:92:0x0283, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x02c3 A[LOOP:8: B:94:0x02c1->B:95:0x02c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x02e2  */
    public final void c(String str, String str2, List list) {
        int i7;
        int i10;
        String str3;
        ByteOrder byteOrder;
        f fVar;
        int i11;
        String[] strArrSplit;
        int length;
        int[] iArr;
        int i12;
        ByteBuffer byteBufferWrap;
        int i13;
        int i14;
        int i15;
        int i16;
        String[] strArrSplit2;
        long[] jArr;
        int i17;
        String str4;
        String[] strArrSplit3;
        int length2;
        m[] mVarArr;
        int i18;
        m[] mVarArr2;
        ByteBuffer byteBufferWrap2;
        int i19;
        String[] strArrSplit4;
        int length3;
        int[] iArr2;
        int i20;
        ByteBuffer byteBufferWrap3;
        int i21;
        int i22;
        String[] strArrSplit5;
        int length4;
        m[] mVarArr3;
        int i23;
        ByteBuffer byteBufferWrap4;
        int i24;
        String[] strArrSplit6;
        int length5;
        double[] dArr;
        int i25;
        ByteBuffer byteBufferWrap5;
        int i26;
        String str5 = str;
        String strReplaceAll = str2;
        int i27 = 1;
        if (("DateTime".equals(str5) || "DateTimeOriginal".equals(str5) || "DateTimeDigitized".equals(str5)) && strReplaceAll != null) {
            boolean zFind = f14225d.matcher(strReplaceAll).find();
            boolean zFind2 = f14226e.matcher(strReplaceAll).find();
            if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                p140j8.f.G("ExifData");
                return;
            } else if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str5)) {
            str5 = "PhotographicSensitivity";
        }
        int i28 = 3;
        int i29 = 2;
        if (strReplaceAll != null && j.f14232e.contains(str5)) {
            if (str5.equals("GPSTimeStamp")) {
                Matcher matcher = f14224c.matcher(strReplaceAll);
                if (!matcher.find()) {
                    p140j8.f.G("ExifData");
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                String strGroup = matcher.group(1);
                strGroup.getClass();
                sb2.append(Integer.parseInt(strGroup));
                sb2.append("/1,");
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                sb2.append(Integer.parseInt(strGroup2));
                sb2.append("/1,");
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                sb2.append(Integer.parseInt(strGroup3));
                sb2.append("/1");
                strReplaceAll = sb2.toString();
            } else {
                try {
                    strReplaceAll = ((long) (Double.parseDouble(strReplaceAll) * 10000.0d)) + "/10000";
                } catch (NumberFormatException unused) {
                    p140j8.f.G("ExifData");
                    return;
                }
            }
        }
        int i30 = 0;
        while (true) {
            l[] lVarArr = j.f14230c;
            if (i30 >= 4) {
                return;
            }
            l lVar = (l) ((HashMap) f14227f.get(i30)).get(str5);
            if (lVar == null) {
                i7 = i29;
                i28 = i28;
                i10 = i27;
            } else {
                if (strReplaceAll != null) {
                    Pair pairA = a(strReplaceAll);
                    int iIntValue = ((Integer) pairA.first).intValue();
                    int i31 = lVar.f14244c;
                    if (i31 != iIntValue && i31 != ((Integer) pairA.second).intValue()) {
                        int i32 = lVar.f14245d;
                        if (i32 != -1 && (i32 == ((Integer) pairA.first).intValue() || i32 == ((Integer) pairA.second).intValue())) {
                            i31 = i32;
                        } else if (i31 == i27 || i31 == 7 || i31 == i29) {
                        }
                        str3 = "/";
                        byteOrder = this.f14229b;
                        switch (i31) {
                            case 1:
                                int i33 = i27;
                                i7 = i29;
                                i28 = i28;
                                Map map = (Map) list.get(i30);
                                Charset charset = f.f14182d;
                                i10 = i33;
                                if (strReplaceAll.length() == i10) {
                                    byte[] bytes = strReplaceAll.getBytes(f.f14182d);
                                    fVar = new f(i10, bytes.length, bytes);
                                } else {
                                    byte[] bytes2 = strReplaceAll.getBytes(f.f14182d);
                                    fVar = new f(i10, bytes2.length, bytes2);
                                }
                                map.put(str5, fVar);
                                break;
                            case 2:
                            case 7:
                                i11 = i27;
                                Map map2 = (Map) list.get(i30);
                                Charset charset2 = f.f14182d;
                                byte[] bytes3 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(f.f14182d);
                                i7 = 2;
                                map2.put(str5, new f(2, bytes3.length, bytes3));
                                i10 = i11;
                                break;
                            case 3:
                                int i34 = i27;
                                int i35 = i28;
                                strArrSplit = strReplaceAll.split(",", -1);
                                length = strArrSplit.length;
                                iArr = new int[length];
                                for (i12 = 0; i12 < strArrSplit.length; i12++) {
                                    iArr[i12] = Integer.parseInt(strArrSplit[i12]);
                                }
                                Map map3 = (Map) list.get(i30);
                                byteBufferWrap = ByteBuffer.wrap(new byte[f.f14184f[i35] * length]);
                                byteBufferWrap.order(byteOrder);
                                for (i13 = 0; i13 < length; i13++) {
                                    byteBufferWrap.putShort((short) iArr[i13]);
                                }
                                i28 = i35;
                                map3.put(str5, new f(i28, length, byteBufferWrap.array()));
                                i10 = i34;
                                i7 = 2;
                                break;
                            case 4:
                                i14 = i27;
                                i15 = i28;
                                i16 = 0;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                for (i17 = 0; i17 < strArrSplit2.length; i17++) {
                                    jArr[i17] = Long.parseLong(strArrSplit2[i17]);
                                }
                                ((Map) list.get(i30)).put(str5, f.b(jArr, byteOrder));
                                i10 = i14;
                                i28 = i15;
                                i7 = 2;
                                break;
                            case 5:
                                i14 = i27;
                                i15 = i28;
                                str4 = "/";
                                i16 = 0;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit3.length;
                                mVarArr = new m[length2];
                                i18 = 0;
                                while (i18 < strArrSplit3.length) {
                                    String str6 = str4;
                                    String[] strArrSplit7 = strArrSplit3[i18].split(str6, -1);
                                    m[] mVarArr4 = mVarArr;
                                    int i36 = i18;
                                    mVarArr4[i36] = new m((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i14]));
                                    i18 = i36 + 1;
                                    str4 = str6;
                                    mVarArr = mVarArr4;
                                }
                                mVarArr2 = mVarArr;
                                Map map4 = (Map) list.get(i30);
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[f.f14184f[5] * length2]);
                                byteBufferWrap2.order(byteOrder);
                                for (i19 = 0; i19 < length2; i19++) {
                                    m mVar = mVarArr2[i19];
                                    byteBufferWrap2.putInt((int) mVar.f14247b);
                                    byteBufferWrap2.putInt((int) mVar.f14248c);
                                }
                                map4.put(str5, new f(5, length2, byteBufferWrap2.array()));
                                i10 = i14;
                                i28 = i15;
                                i7 = 2;
                                break;
                            case 9:
                                i14 = i27;
                                i15 = i28;
                                i16 = 0;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit4.length;
                                iArr2 = new int[length3];
                                for (i20 = 0; i20 < strArrSplit4.length; i20++) {
                                    iArr2[i20] = Integer.parseInt(strArrSplit4[i20]);
                                }
                                Map map5 = (Map) list.get(i30);
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[f.f14184f[9] * length3]);
                                byteBufferWrap3.order(byteOrder);
                                for (i21 = 0; i21 < length3; i21++) {
                                    byteBufferWrap3.putInt(iArr2[i21]);
                                }
                                map5.put(str5, new f(9, length3, byteBufferWrap3.array()));
                                i10 = i14;
                                i28 = i15;
                                i7 = 2;
                                break;
                            case 10:
                                i14 = i27;
                                i22 = 0;
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length4 = strArrSplit5.length;
                                mVarArr3 = new m[length4];
                                i23 = 0;
                                while (i23 < strArrSplit5.length) {
                                    String[] strArrSplit8 = strArrSplit5[i23].split(str3, -1);
                                    int i37 = i22;
                                    mVarArr3[i23] = new m((long) Double.parseDouble(strArrSplit8[i37]), (long) Double.parseDouble(strArrSplit8[i14]));
                                    i23++;
                                    i22 = i37;
                                    i28 = i28;
                                    str3 = str3;
                                }
                                i15 = i28;
                                i16 = i22;
                                Map map6 = (Map) list.get(i30);
                                byteBufferWrap4 = ByteBuffer.wrap(new byte[f.f14184f[10] * length4]);
                                byteBufferWrap4.order(byteOrder);
                                for (i24 = i16; i24 < length4; i24++) {
                                    m mVar2 = mVarArr3[i24];
                                    byteBufferWrap4.putInt((int) mVar2.f14247b);
                                    byteBufferWrap4.putInt((int) mVar2.f14248c);
                                }
                                map6.put(str5, new f(10, length4, byteBufferWrap4.array()));
                                i10 = i14;
                                i28 = i15;
                                i7 = 2;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length5 = strArrSplit6.length;
                                dArr = new double[length5];
                                for (i25 = 0; i25 < strArrSplit6.length; i25 += i27) {
                                    dArr[i25] = Double.parseDouble(strArrSplit6[i25]);
                                }
                                Map map7 = (Map) list.get(i30);
                                byteBufferWrap5 = ByteBuffer.wrap(new byte[f.f14184f[12] * length5]);
                                byteBufferWrap5.order(byteOrder);
                                i26 = 0;
                                while (i26 < length5) {
                                    byteBufferWrap5.putDouble(dArr[i26]);
                                    i26++;
                                    i27 = i27;
                                }
                                i11 = i27;
                                map7.put(str5, new f(12, length5, byteBufferWrap5.array()));
                                i7 = i29;
                                i10 = i11;
                                break;
                        }
                    } else {
                        str3 = "/";
                        byteOrder = this.f14229b;
                        switch (i31) {
                            case 1:
                                int i38 = i27;
                                i7 = i29;
                                i28 = i28;
                                Map map8 = (Map) list.get(i30);
                                Charset charset3 = f.f14182d;
                                i10 = i38;
                                if (strReplaceAll.length() == i10 || strReplaceAll.charAt(0) < '0' || strReplaceAll.charAt(0) > '1') {
                                    byte[] bytes4 = strReplaceAll.getBytes(f.f14182d);
                                    fVar = new f(i10, bytes4.length, bytes4);
                                } else {
                                    byte[] bArr = new byte[i10];
                                    bArr[0] = (byte) (strReplaceAll.charAt(0) - '0');
                                    fVar = new f(i10, i10, bArr);
                                }
                                map8.put(str5, fVar);
                                break;
                            case 2:
                            case 7:
                                i11 = i27;
                                Map map9 = (Map) list.get(i30);
                                Charset charset4 = f.f14182d;
                                byte[] bytes5 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(f.f14182d);
                                i7 = 2;
                                map9.put(str5, new f(2, bytes5.length, bytes5));
                                i10 = i11;
                                break;
                            case 3:
                                int i39 = i27;
                                int i310 = i28;
                                strArrSplit = strReplaceAll.split(",", -1);
                                length = strArrSplit.length;
                                iArr = new int[length];
                                while (i12 < strArrSplit.length) {
                                    iArr[i12] = Integer.parseInt(strArrSplit[i12]);
                                }
                                Map map10 = (Map) list.get(i30);
                                byteBufferWrap = ByteBuffer.wrap(new byte[f.f14184f[i310] * length]);
                                byteBufferWrap.order(byteOrder);
                                while (i13 < length) {
                                    byteBufferWrap.putShort((short) iArr[i13]);
                                }
                                i28 = i310;
                                map10.put(str5, new f(i28, length, byteBufferWrap.array()));
                                i10 = i39;
                                i7 = 2;
                                break;
                            case 4:
                                i14 = i27;
                                i15 = i28;
                                i16 = 0;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i17 < strArrSplit2.length) {
                                    jArr[i17] = Long.parseLong(strArrSplit2[i17]);
                                }
                                ((Map) list.get(i30)).put(str5, f.b(jArr, byteOrder));
                                i10 = i14;
                                i28 = i15;
                                i7 = 2;
                                break;
                            case 5:
                                i14 = i27;
                                i15 = i28;
                                str4 = "/";
                                i16 = 0;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit3.length;
                                mVarArr = new m[length2];
                                i18 = 0;
                                while (i18 < strArrSplit3.length) {
                                    String str7 = str4;
                                    String[] strArrSplit9 = strArrSplit3[i18].split(str7, -1);
                                    m[] mVarArr5 = mVarArr;
                                    int i311 = i18;
                                    mVarArr5[i311] = new m((long) Double.parseDouble(strArrSplit9[0]), (long) Double.parseDouble(strArrSplit9[i14]));
                                    i18 = i311 + 1;
                                    str4 = str7;
                                    mVarArr = mVarArr5;
                                }
                                mVarArr2 = mVarArr;
                                Map map11 = (Map) list.get(i30);
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[f.f14184f[5] * length2]);
                                byteBufferWrap2.order(byteOrder);
                                while (i19 < length2) {
                                    m mVar3 = mVarArr2[i19];
                                    byteBufferWrap2.putInt((int) mVar3.f14247b);
                                    byteBufferWrap2.putInt((int) mVar3.f14248c);
                                }
                                map11.put(str5, new f(5, length2, byteBufferWrap2.array()));
                                i10 = i14;
                                i28 = i15;
                                i7 = 2;
                                break;
                            case 9:
                                i14 = i27;
                                i15 = i28;
                                i16 = 0;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit4.length;
                                iArr2 = new int[length3];
                                while (i20 < strArrSplit4.length) {
                                    iArr2[i20] = Integer.parseInt(strArrSplit4[i20]);
                                }
                                Map map12 = (Map) list.get(i30);
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[f.f14184f[9] * length3]);
                                byteBufferWrap3.order(byteOrder);
                                while (i21 < length3) {
                                    byteBufferWrap3.putInt(iArr2[i21]);
                                }
                                map12.put(str5, new f(9, length3, byteBufferWrap3.array()));
                                i10 = i14;
                                i28 = i15;
                                i7 = 2;
                                break;
                            case 10:
                                i14 = i27;
                                i22 = 0;
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length4 = strArrSplit5.length;
                                mVarArr3 = new m[length4];
                                i23 = 0;
                                while (i23 < strArrSplit5.length) {
                                    String[] strArrSplit10 = strArrSplit5[i23].split(str3, -1);
                                    int i312 = i22;
                                    mVarArr3[i23] = new m((long) Double.parseDouble(strArrSplit10[i312]), (long) Double.parseDouble(strArrSplit10[i14]));
                                    i23++;
                                    i22 = i312;
                                    i28 = i28;
                                    str3 = str3;
                                }
                                i15 = i28;
                                i16 = i22;
                                Map map13 = (Map) list.get(i30);
                                byteBufferWrap4 = ByteBuffer.wrap(new byte[f.f14184f[10] * length4]);
                                byteBufferWrap4.order(byteOrder);
                                while (i24 < length4) {
                                    m mVar4 = mVarArr3[i24];
                                    byteBufferWrap4.putInt((int) mVar4.f14247b);
                                    byteBufferWrap4.putInt((int) mVar4.f14248c);
                                }
                                map13.put(str5, new f(10, length4, byteBufferWrap4.array()));
                                i10 = i14;
                                i28 = i15;
                                i7 = 2;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length5 = strArrSplit6.length;
                                dArr = new double[length5];
                                while (i25 < strArrSplit6.length) {
                                    dArr[i25] = Double.parseDouble(strArrSplit6[i25]);
                                }
                                Map map14 = (Map) list.get(i30);
                                byteBufferWrap5 = ByteBuffer.wrap(new byte[f.f14184f[12] * length5]);
                                byteBufferWrap5.order(byteOrder);
                                i26 = 0;
                                while (i26 < length5) {
                                    byteBufferWrap5.putDouble(dArr[i26]);
                                    i26++;
                                    i27 = i27;
                                }
                                i11 = i27;
                                map14.put(str5, new f(12, length5, byteBufferWrap5.array()));
                                i7 = i29;
                                i10 = i11;
                                break;
                        }
                    }
                } else {
                    ((Map) list.get(i30)).remove(str5);
                }
                i7 = i29;
                i28 = i28;
                i10 = i27;
            }
            i30 += i10;
            i27 = i10;
            i28 = i28;
            i29 = i7;
        }
    }

    public final void d(int i7) {
        int i10;
        if (i7 == 0) {
            i10 = 1;
        } else if (i7 == 90) {
            i10 = 6;
        } else if (i7 == 180) {
            i10 = 3;
        } else if (i7 != 270) {
            p140j8.f.G("ExifData");
            i10 = 0;
        } else {
            i10 = 8;
        }
        c("Orientation", String.valueOf(i10), this.f14228a);
    }
}
