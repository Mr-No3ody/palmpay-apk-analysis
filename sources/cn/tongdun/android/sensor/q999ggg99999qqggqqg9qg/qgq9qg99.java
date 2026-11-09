package cn.tongdun.android.sensor.q999ggg99999qqggqqg9qg;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import com.adjust.sdk.Constants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qgq9qg99 {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static q999ggg99999qqggqqg9qg f19266q999ggg99999qqggqqg9qg;

    public static String gqgg9q99qg9() {
        return f19266q999ggg99999qqggqqg9qg != null ? q999ggg99999qqggqqg9qg.qgqq999g() : q999ggg99999qqggqqg9qg("6b6b", 57);
    }

    public static String q999ggg99999qqggqqg9qg() {
        return f19266q999ggg99999qqggqqg9qg != null ? q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg() : q999ggg99999qqggqqg9qg("6b3e", 108);
    }

    public static String qgq9qg99() {
        return f19266q999ggg99999qqggqqg9qg != null ? q999ggg99999qqggqqg9qg.qgq9qg99() : q999ggg99999qqggqqg9qg("6b4b", 25);
    }

    public static String qgqq999g() {
        return f19266q999ggg99999qqggqqg9qg != null ? q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq() : q999ggg99999qqggqqg9qg("6b49", 27);
    }

    public static String qqggggg9g9q99q9gq() {
        return f19266q999ggg99999qqggqqg9qg != null ? q999ggg99999qqggqqg9qg.gqgg9q99qg9() : q999ggg99999qqggqqg9qg("6b5b", 9);
    }

    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 84);
            byte b10 = (byte) (bArr[0] ^ 48);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static void qgq9qg99(SensorManager sensorManager) {
        if (sensorManager != null) {
            sensorManager.unregisterListener(f19266q999ggg99999qqggqqg9qg);
        }
    }

    public static List qqggggg9g9q99q9gq(SensorManager sensorManager) {
        return sensorManager.getSensorList(-1);
    }

    public static void q999ggg99999qqggqqg9qg(SensorManager sensorManager) {
        q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg();
        f19266q999ggg99999qqggqqg9qg = new q999ggg99999qqggqqg9qg();
        if (sensorManager != null) {
            int i7 = Build.VERSION.SDK_INT > 30 ? 3 : 0;
            try {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                if (defaultSensor != null) {
                    sensorManager.registerListener(f19266q999ggg99999qqggqqg9qg, defaultSensor, i7);
                }
                Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
                if (defaultSensor2 != null) {
                    sensorManager.registerListener(f19266q999ggg99999qqggqqg9qg, defaultSensor2, i7);
                }
                Sensor defaultSensor3 = sensorManager.getDefaultSensor(5);
                if (defaultSensor3 != null) {
                    sensorManager.registerListener(f19266q999ggg99999qqggqqg9qg, defaultSensor3, i7);
                }
                Sensor defaultSensor4 = sensorManager.getDefaultSensor(2);
                if (defaultSensor4 != null) {
                    sensorManager.registerListener(f19266q999ggg99999qqggqqg9qg, defaultSensor4, i7);
                }
                Sensor defaultSensor5 = sensorManager.getDefaultSensor(4);
                if (defaultSensor5 != null) {
                    sensorManager.registerListener(f19266q999ggg99999qqggqqg9qg, defaultSensor5, i7);
                }
                Sensor defaultSensor6 = sensorManager.getDefaultSensor(3);
                if (defaultSensor6 != null) {
                    sensorManager.registerListener(f19266q999ggg99999qqggqqg9qg, defaultSensor6, i7);
                }
            } catch (Exception unused) {
            }
        }
    }
}
