package com.google.maps.android;

/* JADX INFO: loaded from: classes3.dex */
class MathUtil {
    static final double EARTH_RADIUS = 6371009.0d;

    public static double arcHav(double d2) {
        return Math.asin(Math.sqrt(d2)) * 2.0d;
    }

    public static double clamp(double d2, double d10, double d11) {
        if (d2 < d10) {
            return d10;
        }
        return d2 > d11 ? d11 : d2;
    }

    public static double hav(double d2) {
        double dSin = Math.sin(d2 * 0.5d);
        return dSin * dSin;
    }

    public static double havDistance(double d2, double d10, double d11) {
        return (Math.cos(d10) * Math.cos(d2) * hav(d11)) + hav(d2 - d10);
    }

    public static double havFromSin(double d2) {
        double d10 = d2 * d2;
        return (d10 / (Math.sqrt(1.0d - d10) + 1.0d)) * 0.5d;
    }

    public static double inverseMercator(double d2) {
        return (Math.atan(Math.exp(d2)) * 2.0d) - 1.5707963267948966d;
    }

    public static double mercator(double d2) {
        return Math.log(Math.tan((d2 * 0.5d) + 0.7853981633974483d));
    }

    public static double mod(double d2, double d10) {
        return ((d2 % d10) + d10) % d10;
    }

    public static double sinFromHav(double d2) {
        return Math.sqrt((1.0d - d2) * d2) * 2.0d;
    }

    public static double sinSumFromHav(double d2, double d10) {
        double dSqrt = Math.sqrt((1.0d - d2) * d2);
        double dSqrt2 = Math.sqrt((1.0d - d10) * d10);
        return ((dSqrt + dSqrt2) - (((dSqrt2 * d2) + (dSqrt * d10)) * 2.0d)) * 2.0d;
    }

    public static double wrap(double d2, double d10, double d11) {
        return (d2 < d10 || d2 >= d11) ? mod(d2 - d10, d11 - d10) + d10 : d2;
    }
}
