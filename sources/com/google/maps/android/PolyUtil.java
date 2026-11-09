package com.google.maps.android;

import N8.q0;
import androidx.camera.video.u;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public class PolyUtil {
    public static final double DEFAULT_TOLERANCE = 0.1d;

    private PolyUtil() {
    }

    public static boolean containsLocation(LatLng latLng, List<LatLng> list, boolean z3) {
        return containsLocation(latLng.latitude, latLng.longitude, list, z3);
    }

    public static List<LatLng> decode(String str) {
        int i7;
        int i10;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            int i14 = 1;
            int i15 = 0;
            int i16 = 1;
            while (true) {
                i7 = i11 + 1;
                int iCharAt = str.charAt(i11) - '@';
                i16 += iCharAt << i15;
                i15 += 5;
                if (iCharAt < 31) {
                    break;
                }
                i11 = i7;
            }
            int i17 = ((i16 & 1) != 0 ? ~(i16 >> 1) : i16 >> 1) + i12;
            int i18 = 0;
            while (true) {
                i10 = i7 + 1;
                int iCharAt2 = str.charAt(i7) - '@';
                i14 += iCharAt2 << i18;
                i18 += 5;
                if (iCharAt2 < 31) {
                    break;
                }
                i7 = i10;
            }
            i13 += (i14 & 1) != 0 ? ~(i14 >> 1) : i14 >> 1;
            arrayList.add(new LatLng(((double) i17) * 1.0E-5d, ((double) i13) * 1.0E-5d));
            i12 = i17;
            i11 = i10;
        }
        return arrayList;
    }

    public static double distanceToLine(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (latLng2.equals(latLng3)) {
            return SphericalUtil.computeDistanceBetween(latLng3, latLng);
        }
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        double radians5 = Math.toRadians(latLng3.latitude);
        double radians6 = Math.toRadians(latLng3.longitude);
        double dCos = Math.cos(radians3);
        double d2 = radians5 - radians3;
        double d10 = (radians6 - radians4) * dCos;
        double d11 = ((((radians2 - radians4) * dCos) * d10) + ((radians - radians3) * d2)) / ((d10 * d10) + (d2 * d2));
        if (d11 <= 0.0d) {
            return SphericalUtil.computeDistanceBetween(latLng, latLng2);
        }
        if (d11 >= 1.0d) {
            return SphericalUtil.computeDistanceBetween(latLng, latLng3);
        }
        double d12 = latLng2.latitude;
        double dA = q0.a(latLng3.latitude, d12, d11, d12);
        double d13 = latLng2.longitude;
        return SphericalUtil.computeDistanceBetween(latLng, new LatLng(dA, q0.a(latLng3.longitude, d13, d11, d13)));
    }

    public static String encode(List<LatLng> list) {
        StringBuffer stringBuffer = new StringBuffer();
        long j6 = 0;
        long j10 = 0;
        for (LatLng latLng : list) {
            long jRound = Math.round(latLng.latitude * 100000.0d);
            long jRound2 = Math.round(latLng.longitude * 100000.0d);
            encode(jRound - j6, stringBuffer);
            encode(jRound2 - j10, stringBuffer);
            j6 = jRound;
            j10 = jRound2;
        }
        return stringBuffer.toString();
    }

    private static boolean intersects(double d2, double d10, double d11, double d12, double d13, boolean z3) {
        if ((d13 >= 0.0d && d13 >= d11) || ((d13 < 0.0d && d13 < d11) || d12 <= -1.5707963267948966d || d2 <= -1.5707963267948966d || d10 <= -1.5707963267948966d || d2 >= 1.5707963267948966d || d10 >= 1.5707963267948966d || d11 <= -3.141592653589793d)) {
            return false;
        }
        double d14 = ((d10 * d13) + ((d11 - d13) * d2)) / d11;
        if (d2 >= 0.0d && d10 >= 0.0d && d12 < d14) {
            return false;
        }
        if ((d2 <= 0.0d && d10 <= 0.0d && d12 >= d14) || d12 >= 1.5707963267948966d) {
            return true;
        }
        if (z3) {
            return Math.tan(d12) >= tanLatGC(d2, d10, d11, d13);
        }
        return MathUtil.mercator(d12) >= mercatorLatRhumb(d2, d10, d11, d13);
    }

    public static boolean isClosedPolygon(List<LatLng> list) {
        return list.get(0).equals((LatLng) u.e(1, list));
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z3, double d2) {
        return isLocationOnEdgeOrPath(latLng, list, true, z3, d2);
    }

    private static boolean isLocationOnEdgeOrPath(LatLng latLng, List<LatLng> list, boolean z3, boolean z8, double d2) {
        return locationIndexOnEdgeOrPath(latLng, list, z3, z8, d2) >= 0;
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z3, double d2) {
        return isLocationOnEdgeOrPath(latLng, list, false, z3, d2);
    }

    private static boolean isOnSegmentGC(double d2, double d10, double d11, double d12, double d13, double d14, double d15) {
        double dHavDistance = MathUtil.havDistance(d2, d13, d10 - d14);
        if (dHavDistance <= d15) {
            return true;
        }
        double dHavDistance2 = MathUtil.havDistance(d11, d13, d12 - d14);
        if (dHavDistance2 <= d15) {
            return true;
        }
        double dHavFromSin = MathUtil.havFromSin(MathUtil.sinFromHav(dHavDistance) * sinDeltaBearing(d2, d10, d11, d12, d13, d14));
        if (dHavFromSin > d15) {
            return false;
        }
        double dHavDistance3 = MathUtil.havDistance(d2, d11, d10 - d12);
        double d16 = ((1.0d - (dHavDistance3 * 2.0d)) * dHavFromSin) + dHavDistance3;
        if (dHavDistance <= d16 && dHavDistance2 <= d16) {
            if (dHavDistance3 < 0.74d) {
                return true;
            }
            double d17 = 1.0d - (2.0d * dHavFromSin);
            if (MathUtil.sinSumFromHav((dHavDistance - dHavFromSin) / d17, (dHavDistance2 - dHavFromSin) / d17) > 0.0d) {
                return true;
            }
        }
        return false;
    }

    public static int locationIndexOnEdgeOrPath(LatLng latLng, List<LatLng> list, boolean z3, boolean z8, double d2) {
        int i7;
        double d10;
        int i10 = 0;
        char c6 = 1;
        int size = list.size();
        int i11 = -1;
        if (size == 0) {
            return -1;
        }
        double d11 = d2 / 6371009.0d;
        double dHav = MathUtil.hav(d11);
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        LatLng latLng2 = list.get(z3 ? size - 1 : 0);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        if (z8) {
            int i12 = 0;
            for (LatLng latLng3 : list) {
                double radians5 = Math.toRadians(latLng3.latitude);
                double radians6 = Math.toRadians(latLng3.longitude);
                if (isOnSegmentGC(radians3, radians4, radians5, radians6, radians, radians2, dHav)) {
                    return Math.max(0, i12 - 1);
                }
                i12++;
                radians3 = radians5;
                radians4 = radians6;
            }
        } else {
            double d12 = radians - d11;
            double d13 = radians + d11;
            double dMercator = MathUtil.mercator(radians3);
            double dMercator2 = MathUtil.mercator(radians);
            int i13 = 0;
            for (LatLng latLng4 : list) {
                char c10 = c6;
                int i14 = i11;
                double d14 = d13;
                double radians7 = Math.toRadians(latLng4.latitude);
                double dMercator3 = MathUtil.mercator(radians7);
                int i15 = i10;
                double radians8 = Math.toRadians(latLng4.longitude);
                if (Math.max(radians3, radians7) < d12 || Math.min(radians3, radians7) > d14) {
                    i7 = i15;
                    d10 = radians;
                } else {
                    double dWrap = MathUtil.wrap(radians8 - radians4, -3.141592653589793d, 3.141592653589793d);
                    double dWrap2 = MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
                    double[] dArr = new double[3];
                    dArr[i15] = dWrap2;
                    dArr[c10] = dWrap2 + 6.283185307179586d;
                    dArr[2] = dWrap2 - 6.283185307179586d;
                    int i16 = i15;
                    while (i16 < 3) {
                        double d15 = dArr[i16];
                        double d16 = dMercator3 - dMercator;
                        double d17 = (d16 * d16) + (dWrap * dWrap);
                        double dClamp = d17 > 0.0d ? MathUtil.clamp((((dMercator2 - dMercator) * d16) + (d15 * dWrap)) / d17, 0.0d, 1.0d) : 0.0d;
                        double d18 = radians;
                        if (MathUtil.havDistance(d18, MathUtil.inverseMercator((dClamp * d16) + dMercator), d15 - (dClamp * dWrap)) < dHav) {
                            return Math.max(i15, i13 - 1);
                        }
                        i16++;
                        radians = d18;
                    }
                    d10 = radians;
                    i7 = i15;
                }
                i13++;
                i10 = i7;
                radians4 = radians8;
                radians3 = radians7;
                i11 = i14;
                c6 = c10;
                d13 = d14;
                dMercator = dMercator3;
                radians = d10;
            }
        }
        return i11;
    }

    public static int locationIndexOnPath(LatLng latLng, List<LatLng> list, boolean z3, double d2) {
        return locationIndexOnEdgeOrPath(latLng, list, false, z3, d2);
    }

    private static double mercatorLatRhumb(double d2, double d10, double d11, double d12) {
        return ((MathUtil.mercator(d10) * d12) + ((d11 - d12) * MathUtil.mercator(d2))) / d11;
    }

    public static List<LatLng> simplify(List<LatLng> list, double d2) {
        LatLng latLng;
        int size = list.size();
        int i7 = 1;
        if (size < 1) {
            throw new IllegalArgumentException("Polyline must have at least 1 point");
        }
        if (d2 <= 0.0d) {
            throw new IllegalArgumentException("Tolerance must be greater than zero");
        }
        boolean zIsClosedPolygon = isClosedPolygon(list);
        if (zIsClosedPolygon) {
            latLng = (LatLng) u.e(1, list);
            list.remove(list.size() - 1);
            list.add(new LatLng(latLng.latitude + 1.0E-11d, latLng.longitude + 1.0E-11d));
        } else {
            latLng = null;
        }
        Stack stack = new Stack();
        double[] dArr = new double[size];
        int i10 = 0;
        dArr[0] = 1.0d;
        int i11 = size - 1;
        dArr[i11] = 1.0d;
        if (size > 2) {
            stack.push(new int[]{0, i11});
            int i12 = 0;
            while (stack.size() > 0) {
                int[] iArr = (int[]) stack.pop();
                int i13 = iArr[0] + i7;
                double d10 = 0.0d;
                while (i13 < iArr[i7]) {
                    int i14 = i7;
                    double dDistanceToLine = distanceToLine(list.get(i13), list.get(iArr[0]), list.get(iArr[i14]));
                    if (dDistanceToLine > d10) {
                        i12 = i13;
                        d10 = dDistanceToLine;
                    }
                    i13++;
                    i7 = i14;
                }
                int i15 = i7;
                if (d10 > d2) {
                    dArr[i12] = d10;
                    stack.push(new int[]{iArr[0], i12});
                    stack.push(new int[]{i12, iArr[i15]});
                }
                i7 = i15;
            }
        }
        if (zIsClosedPolygon) {
            list.remove(list.size() - 1);
            list.add(latLng);
        }
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng2 : list) {
            if (dArr[i10] != 0.0d) {
                arrayList.add(latLng2);
            }
            i10++;
        }
        return arrayList;
    }

    private static double sinDeltaBearing(double d2, double d10, double d11, double d12, double d13, double d14) {
        double dSin = Math.sin(d2);
        double dCos = Math.cos(d11);
        double dCos2 = Math.cos(d13);
        double d15 = d14 - d10;
        double d16 = d12 - d10;
        double dSin2 = Math.sin(d15) * dCos2;
        double dSin3 = Math.sin(d16) * dCos;
        double d17 = dSin * 2.0d;
        double dHav = (dCos2 * d17 * MathUtil.hav(d15)) + Math.sin(d13 - d2);
        double dHav2 = (d17 * dCos * MathUtil.hav(d16)) + Math.sin(d11 - d2);
        double d18 = ((dHav2 * dHav2) + (dSin3 * dSin3)) * ((dHav * dHav) + (dSin2 * dSin2));
        if (d18 <= 0.0d) {
            return 1.0d;
        }
        return ((dSin2 * dHav2) - (dHav * dSin3)) / Math.sqrt(d18);
    }

    private static double tanLatGC(double d2, double d10, double d11, double d12) {
        return ((Math.sin(d12) * Math.tan(d10)) + (Math.sin(d11 - d12) * Math.tan(d2))) / Math.sin(d11);
    }

    public static boolean containsLocation(double d2, double d10, List<LatLng> list, boolean z3) {
        int size = list.size();
        boolean z8 = false;
        if (size == 0) {
            return false;
        }
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(d10);
        LatLng latLng = list.get(size - 1);
        double radians3 = Math.toRadians(latLng.latitude);
        double radians4 = Math.toRadians(latLng.longitude);
        int i7 = 0;
        double d11 = radians3;
        for (LatLng latLng2 : list) {
            double dWrap = MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
            if (radians == d11 && dWrap == 0.0d) {
                return true;
            }
            boolean z10 = z8;
            double radians5 = Math.toRadians(latLng2.latitude);
            double radians6 = Math.toRadians(latLng2.longitude);
            if (intersects(d11, radians5, MathUtil.wrap(radians6 - radians4, -3.141592653589793d, 3.141592653589793d), radians, dWrap, z3)) {
                i7++;
            }
            d11 = radians5;
            z8 = z10;
            radians4 = radians6;
        }
        boolean z11 = z8;
        if ((i7 & 1) != 0) {
            return true;
        }
        return z11;
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z3) {
        return isLocationOnEdge(latLng, list, z3, 0.1d);
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z3) {
        return isLocationOnPath(latLng, list, z3, 0.1d);
    }

    public static int locationIndexOnPath(LatLng latLng, List<LatLng> list, boolean z3) {
        return locationIndexOnPath(latLng, list, z3, 0.1d);
    }

    private static void encode(long j6, StringBuffer stringBuffer) {
        long j10 = j6 << 1;
        if (j6 < 0) {
            j10 = ~j10;
        }
        while (j10 >= 32) {
            stringBuffer.append(Character.toChars((int) ((32 | (31 & j10)) + 63)));
            j10 >>= 5;
        }
        stringBuffer.append(Character.toChars((int) (j10 + 63)));
    }
}
