package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gg9q9qgg9gg9qg9q9ggq9 implements SensorEventListener {
    private static long gqg99q9q9q;
    private static long q99q99qq99q9g;
    private static long q9q999qgg99gq9qq9qqq9g;
    private static long qggqgq99q999g;
    private static long qq9gg99gqqqgqgq999gqg;
    private static long qqg999qq;
    private final DecimalFormat gq9gggq9gq9gg9q99g9q;
    private final DecimalFormatSymbols gqgqgq9qqqg999qggqqqg;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static final List f19136q999ggg99999qqggqqg9qg = new CopyOnWriteArrayList();
    private static final List qgq9qg99 = new CopyOnWriteArrayList();
    private static final List qqggggg9g9q99q9gq = new CopyOnWriteArrayList();
    private static final List gqgg9q99qg9 = new CopyOnWriteArrayList();
    private static final List qgqq999g = new CopyOnWriteArrayList();
    private static final List qg9gqgqqggg9q9qg = new CopyOnWriteArrayList();

    public gg9q9qgg9gg9qg9q9ggq9() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        this.gqgqgq9qqqg999qggqqqg = decimalFormatSymbols;
        this.gq9gggq9gq9gg9q99g9q = new DecimalFormat(q999ggg99999qqggqqg9qg("28676a6a747474", 100), decimalFormatSymbols);
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
            byte b7 = (byte) (i7 ^ 16);
            byte b10 = (byte) (bArr[0] ^ Ascii.VT);
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

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.values.length < 3) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                if (jCurrentTimeMillis - q9q999qgg99gq9qq9qqq9g > 40) {
                    float[] fArr = sensorEvent.values;
                    float f10 = fArr[0];
                    float f11 = fArr[1];
                    float f12 = fArr[2];
                    List list = qgq9qg99;
                    if (list.size() < 5) {
                        list.add(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_P2P_CASH_OUT, 109) + this.gq9gggq9gq9gg9q99g9q.format(f10) + q999ggg99999qqggqqg9qg("27", 106) + this.gq9gggq9gq9gg9q99g9q.format(f11) + q999ggg99999qqggqqg9qg("27", 54) + this.gq9gggq9gq9gg9q99g9q.format(f12) + q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_P2P_CASH_IN, 72));
                    }
                    q9q999qgg99gq9qq9qqq9g = System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (type == 2) {
                if (jCurrentTimeMillis - qggqgq99q999g > 80) {
                    float[] fArr2 = sensorEvent.values;
                    float f13 = fArr2[0];
                    float f14 = fArr2[1];
                    float f15 = fArr2[2];
                    List list2 = qqggggg9g9q99q9gq;
                    if (list2.size() < 5) {
                        list2.add(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_P2P_CASH_OUT, 54) + this.gq9gggq9gq9gg9q99g9q.format(f13) + q999ggg99999qqggqqg9qg("27", 62) + this.gq9gggq9gq9gg9q99g9q.format(f14) + q999ggg99999qqggqqg9qg("27", 73) + this.gq9gggq9gq9gg9q99g9q.format(f15) + q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_P2P_CASH_IN, 51));
                    }
                    qggqgq99q999g = System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (type == 3) {
                if (jCurrentTimeMillis - qq9gg99gqqqgqgq999gqg > 50) {
                    float[] fArr3 = sensorEvent.values;
                    double d2 = fArr3[0];
                    double d10 = fArr3[1];
                    double d11 = fArr3[2];
                    List list3 = qg9gqgqqggg9q9qg;
                    if (list3.size() < 5) {
                        list3.add(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_P2P_CASH_OUT, 89) + this.gq9gggq9gq9gg9q99g9q.format(d2) + q999ggg99999qqggqqg9qg("27", HomeDialogState.PRIORITY_HIGHEST) + this.gq9gggq9gq9gg9q99g9q.format(d10) + q999ggg99999qqggqqg9qg("27", 15) + this.gq9gggq9gq9gg9q99g9q.format(d11) + q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_P2P_CASH_IN, 115));
                    }
                    qq9gg99gqqqgqgq999gqg = System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (type == 4) {
                if (jCurrentTimeMillis - q99q99qq99q9g > 80) {
                    float[] fArr4 = sensorEvent.values;
                    double d12 = fArr4[0];
                    double d13 = fArr4[1];
                    double d14 = fArr4[2];
                    List list4 = gqgg9q99qg9;
                    if (list4.size() < 5) {
                        list4.add(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_P2P_CASH_OUT, 50) + this.gq9gggq9gq9gg9q99g9q.format(d12) + q999ggg99999qqggqqg9qg("27", 18) + this.gq9gggq9gq9gg9q99g9q.format(d13) + q999ggg99999qqggqqg9qg("27", 13) + this.gq9gggq9gq9gg9q99g9q.format(d14) + q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_P2P_CASH_IN, 119));
                    }
                    q99q99qq99q9g = System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (type == 5) {
                if (jCurrentTimeMillis - qqg999qq > 80) {
                    int i7 = (int) sensorEvent.values[0];
                    List list5 = qgqq999g;
                    if (list5.size() < 5) {
                        list5.add(String.valueOf(i7));
                    }
                    qqg999qq = System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (type == 9 && jCurrentTimeMillis - gqg99q9q9q > 80) {
                float[] fArr5 = sensorEvent.values;
                double d15 = fArr5[0];
                double d16 = fArr5[1];
                double d17 = fArr5[2];
                List list6 = f19136q999ggg99999qqggqqg9qg;
                if (list6.size() < 5) {
                    list6.add(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_P2P_CASH_OUT, 47) + this.gq9gggq9gq9gg9q99g9q.format(d15) + q999ggg99999qqggqqg9qg("27", 28) + this.gq9gggq9gq9gg9q99g9q.format(d16) + q999ggg99999qqggqqg9qg("27", 75) + this.gq9gggq9gq9gg9q99g9q.format(d17) + q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_P2P_CASH_IN, 86));
                }
                gqg99q9q9q = System.currentTimeMillis();
            }
        } catch (Throwable unused) {
        }
    }
}
