package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.didiglobal.booster.instrument.ShadowHandlerThread;
import com.didiglobal.booster.instrument.ShadowThread;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1nSDK implements AFj1pSDK {
    private static final BitSet component2;
    final Object AFAdRevenueData;
    private final Map<AFj1oSDK, Map<String, Object>> areAllFieldsValid;
    private final Map<AFj1oSDK, AFj1oSDK> component1;
    private final SensorManager component3;
    private final ExecutorService component4;
    private boolean copydefault;
    private final Runnable equals;
    final Runnable getCurrencyIso4217Code;
    boolean getMediationNetwork;
    final Runnable getMonetizationNetwork;
    final Handler getRevenue;

    static {
        BitSet bitSet = new BitSet(6);
        component2 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    @VisibleForTesting
    private AFj1nSDK(@NonNull SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.AFAdRevenueData = new Object();
        BitSet bitSet = component2;
        this.component1 = new HashMap(bitSet.size());
        this.areAllFieldsValid = new ConcurrentHashMap(bitSet.size());
        this.getMonetizationNetwork = new Runnable() { // from class: com.appsflyer.internal.AFj1nSDK.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1nSDK.this.AFAdRevenueData) {
                    AFj1nSDK.this.getCurrencyIso4217Code();
                    AFj1nSDK aFj1nSDK = AFj1nSDK.this;
                    aFj1nSDK.getRevenue.postDelayed(aFj1nSDK.getCurrencyIso4217Code, 150L);
                    AFj1nSDK.this.getMediationNetwork = true;
                }
            }
        };
        this.getCurrencyIso4217Code = new l(this, 2);
        this.equals = new Runnable() { // from class: com.appsflyer.internal.AFj1nSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1nSDK.this.AFAdRevenueData) {
                    try {
                        AFj1nSDK aFj1nSDK = AFj1nSDK.this;
                        if (aFj1nSDK.getMediationNetwork) {
                            aFj1nSDK.getRevenue.removeCallbacks(aFj1nSDK.getMonetizationNetwork);
                            AFj1nSDK aFj1nSDK2 = AFj1nSDK.this;
                            aFj1nSDK2.getRevenue.removeCallbacks(aFj1nSDK2.getCurrencyIso4217Code);
                            AFj1nSDK.this.getRevenue();
                            AFj1nSDK.this.getMediationNetwork = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.component3 = sensorManager;
        this.getRevenue = handler;
        this.component4 = executorService;
    }

    @NonNull
    @VisibleForTesting
    private List<Map<String, Object>> areAllFieldsValid() {
        synchronized (this.AFAdRevenueData) {
            try {
                if (!this.component1.isEmpty() && this.copydefault) {
                    Iterator<AFj1oSDK> it = this.component1.values().iterator();
                    while (it.hasNext()) {
                        it.next().getMediationNetwork(this.areAllFieldsValid, false);
                    }
                }
                if (this.areAllFieldsValid.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.areAllFieldsValid.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    @VisibleForTesting
    private List<Map<String, Object>> component1() {
        synchronized (this.AFAdRevenueData) {
            try {
                Iterator<AFj1oSDK> it = this.component1.values().iterator();
                while (it.hasNext()) {
                    it.next().getMediationNetwork(this.areAllFieldsValid, true);
                }
                if (this.areAllFieldsValid.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.areAllFieldsValid.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component2() {
        try {
            if (!this.component1.isEmpty()) {
                for (AFj1oSDK aFj1oSDK : this.component1.values()) {
                    this.component3.unregisterListener(aFj1oSDK);
                    aFj1oSDK.getMediationNetwork(this.areAllFieldsValid, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.copydefault = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component3() {
        try {
            for (Sensor sensor : this.component3.getSensorList(-1)) {
                if (getMediationNetwork(sensor.getType())) {
                    AFj1oSDK aFj1oSDK = new AFj1oSDK(sensor, this.component4);
                    if (!this.component1.containsKey(aFj1oSDK)) {
                        this.component1.put(aFj1oSDK, aFj1oSDK);
                    }
                    this.component3.registerListener(this.component1.get(aFj1oSDK), sensor, 1, this.getRevenue);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.copydefault = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component4() {
        synchronized (this.AFAdRevenueData) {
            this.getRevenue.post(new l(this, 1));
        }
    }

    private static boolean getMediationNetwork(int i7) {
        return i7 >= 0 && component2.get(i7);
    }

    @Override // com.appsflyer.internal.AFj1pSDK
    @NonNull
    public final Map<String, Object> AFAdRevenueData() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listAreAllFieldsValid = areAllFieldsValid();
        if (!listAreAllFieldsValid.isEmpty()) {
            concurrentHashMap.put("sensors", listAreAllFieldsValid);
            return concurrentHashMap;
        }
        List<Map<String, Object>> listComponent1 = component1();
        if (!listComponent1.isEmpty()) {
            concurrentHashMap.put("sensors", listComponent1);
        }
        return concurrentHashMap;
    }

    @VisibleForTesting
    public final void getCurrencyIso4217Code() {
        this.getRevenue.post(new l(this, 0));
    }

    @Override // com.appsflyer.internal.AFj1pSDK
    public final void getMonetizationNetwork() {
        this.getRevenue.post(this.equals);
        this.getRevenue.post(this.getMonetizationNetwork);
    }

    public final void getRevenue() {
        this.getRevenue.post(new l(this, 1));
    }

    @Override // com.appsflyer.internal.AFj1pSDK
    public final synchronized void getMediationNetwork() {
        this.getRevenue.post(this.equals);
    }

    public AFj1nSDK(@NonNull Context context, ExecutorService executorService) {
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        ShadowHandlerThread shadowHandlerThread = new ShadowHandlerThread("internal", "\u200bcom.appsflyer.internal.AFj1nSDK");
        ShadowThread.setThreadName(shadowHandlerThread, "\u200bcom.appsflyer.internal.AFj1nSDK").start();
        this(sensorManager, new Handler(shadowHandlerThread.getLooper()), executorService);
    }
}
