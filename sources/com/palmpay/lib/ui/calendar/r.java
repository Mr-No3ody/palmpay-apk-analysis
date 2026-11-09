package com.palmpay.lib.ui.calendar;

import android.text.TextUtils;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String[] f24307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String[] f24308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String[] f24309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String[] f24310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f24311e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String[] f24312f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f24313g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f24314h = {19416, 19168, 42352, 21717, 53856, 55632, 91476, 22176, 39632, 21970, 19168, 42422, 42192, 53840, 119381, 46400, 54944, 44450, 38320, 84343, 18800, 42160, 46261, 27216, 27968, 109396, 11104, 38256, 21234, 18800, 25958, 54432, 59984, 28309, 23248, 11104, 100067, 37600, 116951, 51536, 54432, 120998, 46416, 22176, 107956, 9680, 37584, 53938, 43344, 46423, 27808, 46416, 86869, 19872, 42416, 83315, 21168, 43432, 59728, 27296, 44710, 43856, 19296, 43748, 42352, 21088, 62051, 55632, 23383, 22176, 38608, 19925, 19152, 42192, 54484, 53840, 54616, 46400, 46752, 103846, 38320, 18864, 43380, 42160, 45690, 27216, 27968, 44870, 43872, 38256, 19189, 18800, 25776, 29859, 59984, 27480, 21952, 43872, 38613, 37600, 51552, 55636, 54432, 55888, 30034, 22176, 43959, 9680, 37584, 51893, 43344, 46240, 47780, 44368, 21977, 19360, 42416, 86390, 21168, 43312, 31060, 27296, 44368, 23378, 19296, 42726, 42208, 53856, 60005, 54576, 23200, 30371, 38608, 19195, 19152, 42192, 118966, 53840, 54560, 56645, 46496, 22224, 21938, 18864, 42359, 42160, 43600, 111189, 27936, 44448, 84835, 37744, 18936, 18800, 25776, 92326, 59984, 27424, 108228, 43744, 41696, 53987, 51552, 54615, 54432, 55888, 23893, 22176, 42704, 21972, 21200, 43448, 43344, 46240, 46758, 44368, 21920, 43940, 42416, 21168, 45683, 26928, 29495, 27296, 44368, 84821, 19296, 42352, 21732, 53600, 59752, 54560, 55968, 92838, 22224, 19168, 43476, 41680, 53584, 62034, 54560};

    public static String a(int i7, int i10, int i11) {
        return i7 + b(i10, i11);
    }

    public static String b(int i7, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i7 >= 10 ? String.valueOf(i7) : C0.G.m(i7, "0"));
        sb2.append(i10 >= 10 ? Integer.valueOf(i10) : C0.G.m(i10, "0"));
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x022e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0238  */
    /* JADX WARN: Code duplicated, block: B:65:0x0245 A[LOOP:7: B:61:0x0236->B:65:0x0245, LOOP_END] */
    public static void c(C1435e c1435e) {
        int i7;
        int[] iArr;
        String strReplace;
        String strReplace2;
        String strReplace3;
        String strB;
        String[] strArr;
        int length;
        int i10;
        String strReplace4;
        String str;
        String str2;
        int i11;
        int i12;
        int i13 = c1435e.f24201a;
        int i14 = c1435e.f24202b;
        int i15 = c1435e.f24203c;
        Calendar calendar = Calendar.getInstance();
        int i16 = 1;
        calendar.set(c1435e.f24201a, c1435e.f24202b - 1, c1435e.f24203c);
        int i17 = calendar.get(7) - 1;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(c1435e.f24201a, c1435e.f24202b - 1, c1435e.f24203c);
        calendar2.get(7);
        int[] iArr2 = new int[4];
        int[] iArr3 = s.f24316b;
        int i18 = i13 - iArr3[0];
        if (iArr3[i18] > ((i13 << 9) | (i14 << 5) | i15)) {
            i18--;
        }
        int i19 = iArr3[i18];
        long jY = s.y(i13, i14, i15) - s.y(s.g(i19, 12, 9), s.g(i19, 4, 5), s.g(i19, 5, 0));
        int i20 = s.f24315a[i18];
        int i21 = 13;
        int iG = s.g(i20, 4, 13);
        int i22 = i18 + iArr3[0];
        int i23 = 1;
        int i24 = 0;
        long j6 = jY + 1;
        while (true) {
            if (i24 >= i21) {
                i7 = i16;
                iArr = iArr2;
                break;
            }
            i7 = i16;
            iArr = iArr2;
            long j10 = s.g(i20, i16, 12 - i24) == i16 ? 30 : 29;
            if (j6 <= j10) {
                break;
            }
            i23++;
            j6 -= j10;
            i24++;
            i16 = i7;
            iArr2 = iArr;
            i21 = 13;
        }
        int i25 = (int) j6;
        iArr[0] = i22;
        iArr[i7] = i23;
        iArr[3] = 0;
        if (iG != 0 && i23 > iG) {
            iArr[i7] = i23 - 1;
            if (i23 == iG + 1) {
                iArr[3] = i7;
            }
        }
        iArr[2] = i25;
        HashMap map = f24313g;
        if (!map.containsKey(Integer.valueOf(i13))) {
            Integer numValueOf = Integer.valueOf(i13);
            String[] strArr2 = new String[24];
            String[] strArr3 = new String[3];
            double d2 = ((double) (i13 - 2001)) * 365.2422d;
            int i26 = 21;
            for (int i27 = 24; i26 < i27; i27 = 24) {
                String[] strArr4 = strArr3;
                strArr4[i26 - 21] = s.x(s.p((((double) i26) * 15.2d) + d2, i26 * 15) + 2451545.0d + 0.3333333333333333d).toString() + s.f24317c[i26];
                i26++;
                strArr2 = strArr2;
                strArr3 = strArr4;
            }
            String[] strArr5 = strArr2;
            String[] strArr6 = strArr3;
            String[] strArr7 = new String[2];
            int i28 = 19;
            for (int i29 = 21; i28 < i29; i29 = 21) {
                strArr7[i28 - 19] = s.x(s.p((((double) i28) * 15.2d) + d2, i28 * 15) + 2451545.0d + 0.3333333333333333d).toString() + s.f24317c[i28];
                i28++;
            }
            System.arraycopy(strArr6, 0, strArr5, 0, 3);
            System.arraycopy(strArr7, 0, strArr5, 22, 2);
            double d10 = ((double) (i13 - 2000)) * 365.2422d;
            for (int i30 = 0; i30 < 19; i30++) {
                strArr5[i30 + 3] = s.x(s.p((((double) i30) * 15.2d) + d10, i30 * 15) + 2451545.0d + 0.3333333333333333d).toString() + s.f24317c[i30];
            }
            map.put(numValueOf, strArr5);
        }
        String[] strArr8 = (String[]) map.get(Integer.valueOf(i13));
        String str3 = i13 + b(i14, i15);
        int length2 = strArr8.length;
        int i31 = 0;
        while (true) {
            strReplace = "";
            if (i31 >= length2) {
                strReplace2 = "";
                break;
            }
            String str4 = strArr8[i31];
            if (str4.contains(str3)) {
                strReplace2 = str4.replace(str3, "");
                break;
            }
            i31++;
        }
        String strB2 = b(i14, i15);
        String[] strArr9 = f24312f;
        int length3 = strArr9.length;
        int i32 = 0;
        while (true) {
            if (i32 >= length3) {
                strReplace3 = "";
                break;
            }
            String str5 = strArr9[i32];
            if (str5.contains(strB2)) {
                strReplace3 = str5.replace(strB2, "");
                break;
            }
            i32++;
        }
        int i33 = iArr[0];
        int i34 = iArr[i7];
        int i35 = iArr[2];
        if (i34 != 12) {
            strB = b(i34, i35);
            strArr = f24308b;
            length = strArr.length;
            i10 = 0;
            while (true) {
                if (i10 < length) {
                    strReplace4 = "";
                    break;
                }
                str = strArr[i10];
                if (str.contains(strB)) {
                    strReplace4 = str.replace(strB, "");
                    break;
                }
                i10++;
            }
        } else if (i35 != ((f24314h[i33 + (-1900)] & (65536 >> i34)) == 0 ? 29 : 30)) {
            strB = b(i34, i35);
            strArr = f24308b;
            length = strArr.length;
            i10 = 0;
            while (true) {
                if (i10 < length) {
                    strReplace4 = "";
                    break;
                }
                str = strArr[i10];
                if (str.contains(strB)) {
                    strReplace4 = str.replace(strB, "");
                    break;
                }
                i10++;
            }
        } else {
            strReplace4 = f24308b[0];
        }
        int i36 = iArr[i7];
        int i37 = iArr[2];
        int i38 = iArr[3];
        int i39 = i7;
        if (i37 != i39) {
            str2 = f24309c[i37 - i39];
        } else if (i38 == i39) {
            str2 = "闰" + f24307a[i36 - i39];
        } else {
            str2 = f24307a[i36 - i39];
        }
        if (TextUtils.isEmpty(strReplace3)) {
            HashMap map2 = f24311e;
            if (map2.containsKey(Integer.valueOf(i13))) {
                i11 = 0;
            } else {
                Integer numValueOf2 = Integer.valueOf(i13);
                String[] strArr10 = new String[3];
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(i13, 4, 1);
                int i40 = calendar3.get(7);
                if (8 - i40 == 7) {
                    StringBuilder sb2 = new StringBuilder();
                    i12 = 5;
                    sb2.append(a(i13, 5, 9 - i40));
                    i11 = 0;
                    sb2.append(f24310d[0]);
                    strArr10[0] = sb2.toString();
                } else {
                    i12 = 5;
                    i11 = 0;
                    strArr10[0] = a(i13, 5, 16 - i40) + f24310d[0];
                }
                calendar3.set(i13, i12, 1);
                int i41 = calendar3.get(7);
                if (8 - i41 == 7) {
                    strArr10[1] = a(i13, 6, 16 - i41) + f24310d[1];
                } else {
                    strArr10[1] = a(i13, 6, 23 - i41) + f24310d[1];
                }
                calendar3.set(i13, 10, 1);
                int i42 = calendar3.get(7);
                if (8 - i42 <= 2) {
                    strArr10[2] = a(i13, 11, 34 - i42) + f24310d[2];
                } else {
                    strArr10[2] = a(i13, 11, 27 - i42) + f24310d[2];
                }
                map2.put(numValueOf2, strArr10);
            }
            String[] strArr11 = (String[]) map2.get(Integer.valueOf(i13));
            String str6 = i13 + b(i14, i15);
            int length4 = strArr11.length;
            for (int i43 = i11; i43 < length4; i43++) {
                String str7 = strArr11[i43];
                if (str7.contains(str6)) {
                    strReplace = str7.replace(str6, "");
                    break;
                }
            }
            strReplace3 = strReplace;
        }
        if (!TextUtils.isEmpty(strReplace2)) {
            c1435e.f24206f = strReplace2;
            return;
        }
        if (!TextUtils.isEmpty(strReplace3)) {
            c1435e.f24206f = strReplace3;
        } else if (TextUtils.isEmpty(strReplace4)) {
            c1435e.f24206f = str2;
        } else {
            c1435e.f24206f = strReplace4;
        }
    }
}
