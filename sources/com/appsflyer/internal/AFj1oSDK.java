package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1oSDK implements SensorEventListener {
    private double AFAdRevenueData;
    private long areAllFieldsValid;

    @NonNull
    private final Executor component1;

    @NonNull
    private final String getCurrencyIso4217Code;

    @NonNull
    private final String getMediationNetwork;
    private final int getMonetizationNetwork;
    private final int getRevenue;
    private final float[][] component4 = new float[2][];
    private final long[] component3 = new long[2];

    public AFj1oSDK(Sensor sensor, @NonNull ExecutorService executorService) {
        int type = sensor.getType();
        this.getRevenue = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.getMediationNetwork = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
        this.component1 = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: F_, reason: merged with bridge method [inline-methods] */
    public void G_(SensorEvent sensorEvent) {
        long j6 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component4;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.component3[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.component4[1] = fArrCopyOf;
            this.component3[1] = jCurrentTimeMillis;
            this.AFAdRevenueData = getMonetizationNetwork(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j6 - this.areAllFieldsValid) {
            this.areAllFieldsValid = j6;
            if (Arrays.equals(fArr4, fArr)) {
                this.component3[1] = jCurrentTimeMillis;
                return;
            }
            double monetizationNetwork = getMonetizationNetwork(fArr3, fArr);
            if (monetizationNetwork > this.AFAdRevenueData) {
                this.component4[1] = Arrays.copyOf(fArr, fArr.length);
                this.component3[1] = jCurrentTimeMillis;
                this.AFAdRevenueData = monetizationNetwork;
            }
        }
    }

    private static double getMonetizationNetwork(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i7 = 0; i7 < iMin; i7++) {
            dPow += StrictMath.pow(fArr[i7] - fArr2[i7], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    @NonNull
    private static List<Float> getRevenue(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1oSDK)) {
            return false;
        }
        AFj1oSDK aFj1oSDK = (AFj1oSDK) obj;
        return getMediationNetwork(aFj1oSDK.getRevenue, aFj1oSDK.getMediationNetwork, aFj1oSDK.getCurrencyIso4217Code);
    }

    public final void getMediationNetwork(@NonNull Map<AFj1oSDK, Map<String, Object>> map, boolean z3) {
        if (!getMonetizationNetwork()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, getMediationNetwork());
            return;
        }
        map.put(this, getMediationNetwork());
        if (z3) {
            int length = this.component4.length;
            for (int i7 = 0; i7 < length; i7++) {
                this.component4[i7] = null;
            }
            int length2 = this.component3.length;
            for (int i10 = 0; i10 < length2; i10++) {
                this.component3[i10] = 0;
            }
            this.AFAdRevenueData = 0.0d;
            this.areAllFieldsValid = 0L;
        }
    }

    public final int hashCode() {
        return this.getMonetizationNetwork;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component1.execute(new f(3, this, sensorEvent));
        } else {
            G_(sensorEvent);
        }
    }

    private boolean getMonetizationNetwork() {
        return this.component4[0] != null;
    }

    private boolean getMediationNetwork(int i7, @NonNull String str, @NonNull String str2) {
        return this.getRevenue == i7 && this.getMediationNetwork.equals(str) && this.getCurrencyIso4217Code.equals(str2);
    }

    @NonNull
    private Map<String, Object> getMediationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.getRevenue));
        concurrentHashMap.put("sN", this.getMediationNetwork);
        concurrentHashMap.put("sV", this.getCurrencyIso4217Code);
        float[] fArr = this.component4[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getRevenue(fArr));
        }
        float[] fArr2 = this.component4[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getRevenue(fArr2));
        }
        return concurrentHashMap;
    }
}
