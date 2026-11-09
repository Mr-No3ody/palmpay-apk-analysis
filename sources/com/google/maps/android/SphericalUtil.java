package com.google.maps.android;

import N8.q0;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SphericalUtil {
    private SphericalUtil() {
    }

    public static double computeAngleBetween(LatLng latLng, LatLng latLng2) {
        return distanceRadians(Math.toRadians(latLng.latitude), Math.toRadians(latLng.longitude), Math.toRadians(latLng2.latitude), Math.toRadians(latLng2.longitude));
    }

    public static double computeArea(List<LatLng> list) {
        return Math.abs(computeSignedArea(list));
    }

    public static double computeDistanceBetween(LatLng latLng, LatLng latLng2) {
        return computeAngleBetween(latLng, latLng2) * 6371009.0d;
    }

    public static double computeHeading(LatLng latLng, LatLng latLng2) {
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude) - radians2;
        return MathUtil.wrap(Math.toDegrees(Math.atan2(Math.cos(radians3) * Math.sin(radians4), (Math.sin(radians3) * Math.cos(radians)) - (Math.cos(radians4) * (Math.cos(radians3) * Math.sin(radians))))), -180.0d, 180.0d);
    }

    public static double computeLength(List<LatLng> list) {
        double dDistanceRadians = 0.0d;
        if (list.size() < 2) {
            return 0.0d;
        }
        LatLng latLng = null;
        for (LatLng latLng2 : list) {
            if (latLng != null) {
                dDistanceRadians += distanceRadians(Math.toRadians(latLng.latitude), Math.toRadians(latLng.longitude), Math.toRadians(latLng2.latitude), Math.toRadians(latLng2.longitude));
            }
            latLng = latLng2;
        }
        return dDistanceRadians * 6371009.0d;
    }

    public static LatLng computeOffset(LatLng latLng, double d2, double d10) {
        double d11 = d2 / 6371009.0d;
        double radians = Math.toRadians(d10);
        double radians2 = Math.toRadians(latLng.latitude);
        double radians3 = Math.toRadians(latLng.longitude);
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double dSin2 = Math.sin(radians2);
        double dCos2 = dSin * Math.cos(radians2);
        double dCos3 = (Math.cos(radians) * dCos2) + (dCos * dSin2);
        return new LatLng(Math.toDegrees(Math.asin(dCos3)), Math.toDegrees(radians3 + Math.atan2(Math.sin(radians) * dCos2, dCos - (dSin2 * dCos3))));
    }

    public static LatLng computeOffsetOrigin(LatLng latLng, double d2, double d10) {
        double radians = Math.toRadians(d10);
        double d11 = d2 / 6371009.0d;
        double dCos = Math.cos(d11);
        double dCos2 = Math.cos(radians) * Math.sin(d11);
        double dSin = Math.sin(radians) * Math.sin(d11);
        double dSin2 = Math.sin(Math.toRadians(latLng.latitude));
        double d12 = dCos * dCos;
        double d13 = dCos2 * dCos2;
        double d14 = ((d12 * d12) + (d13 * d12)) - ((d12 * dSin2) * dSin2);
        if (d14 < 0.0d) {
            return null;
        }
        double d15 = dCos2 * dSin2;
        double d16 = d12 + d13;
        double dSqrt = (Math.sqrt(d14) + d15) / d16;
        double d17 = (dSin2 - (dCos2 * dSqrt)) / dCos;
        double dAtan2 = Math.atan2(d17, dSqrt);
        if (dAtan2 < -1.5707963267948966d || dAtan2 > 1.5707963267948966d) {
            dAtan2 = Math.atan2(d17, (d15 - Math.sqrt(d14)) / d16);
        }
        if (dAtan2 < -1.5707963267948966d || dAtan2 > 1.5707963267948966d) {
            return null;
        }
        return new LatLng(Math.toDegrees(dAtan2), Math.toDegrees(Math.toRadians(latLng.longitude) - Math.atan2(dSin, (Math.cos(dAtan2) * dCos) - (Math.sin(dAtan2) * dCos2))));
    }

    public static double computeSignedArea(List<LatLng> list) {
        return computeSignedArea(list, 6371009.0d);
    }

    private static double distanceRadians(double d2, double d10, double d11, double d12) {
        return MathUtil.arcHav(MathUtil.havDistance(d2, d11, d10 - d12));
    }

    public static LatLng interpolate(LatLng latLng, LatLng latLng2, double d2) {
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        double dCos = Math.cos(radians);
        double dCos2 = Math.cos(radians3);
        double dComputeAngleBetween = computeAngleBetween(latLng, latLng2);
        double dSin = Math.sin(dComputeAngleBetween);
        if (dSin < 1.0E-6d) {
            double d10 = latLng.latitude;
            double dA = q0.a(latLng2.latitude, d10, d2, d10);
            double d11 = latLng.longitude;
            return new LatLng(dA, q0.a(latLng2.longitude, d11, d2, d11));
        }
        double dSin2 = Math.sin((1.0d - d2) * dComputeAngleBetween) / dSin;
        double dSin3 = Math.sin(dComputeAngleBetween * d2) / dSin;
        double d12 = dCos * dSin2;
        double d13 = dCos2 * dSin3;
        double dCos3 = (Math.cos(radians4) * d13) + (Math.cos(radians2) * d12);
        double dSin4 = (Math.sin(radians4) * d13) + (Math.sin(radians2) * d12);
        return new LatLng(Math.toDegrees(Math.atan2((Math.sin(radians3) * dSin3) + (Math.sin(radians) * dSin2), Math.sqrt((dSin4 * dSin4) + (dCos3 * dCos3)))), Math.toDegrees(Math.atan2(dSin4, dCos3)));
    }

    private static double polarTriangleArea(double d2, double d10, double d11, double d12) {
        double d13 = d10 - d12;
        double d14 = d2 * d11;
        return Math.atan2(Math.sin(d13) * d14, (Math.cos(d13) * d14) + 1.0d) * 2.0d;
    }

    public static double computeSignedArea(List<LatLng> list, double d2) {
        int size = list.size();
        double dPolarTriangleArea = 0.0d;
        if (size < 3) {
            return 0.0d;
        }
        LatLng latLng = list.get(size - 1);
        double dTan = Math.tan((1.5707963267948966d - Math.toRadians(latLng.latitude)) / 2.0d);
        double radians = Math.toRadians(latLng.longitude);
        double d10 = dTan;
        double d11 = radians;
        for (LatLng latLng2 : list) {
            double dTan2 = Math.tan((1.5707963267948966d - Math.toRadians(latLng2.latitude)) / 2.0d);
            double radians2 = Math.toRadians(latLng2.longitude);
            dPolarTriangleArea += polarTriangleArea(dTan2, radians2, d10, d11);
            d10 = dTan2;
            d11 = radians2;
        }
        return d2 * d2 * dPolarTriangleArea;
    }
}
