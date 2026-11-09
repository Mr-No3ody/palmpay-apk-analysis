package com.google.firebase.perf.session.gauges;

import N8.q0;
import android.app.ActivityManager;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Utils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
class GaugeMetadataManager {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final ActivityManager activityManager;
    private final Context appContext;
    private final ActivityManager.MemoryInfo memoryInfo;
    private final Runtime runtime;

    public GaugeMetadataManager(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public int getDeviceRamSizeKb() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.memoryInfo.totalMem));
    }

    public int getMaxAppJavaHeapMemoryKb() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.runtime.maxMemory()));
    }

    public int getMaxEncouragedAppJavaHeapMemoryKb() {
        return Utils.saturatedIntCast(StorageUnit.MEGABYTES.toKilobytes(this.activityManager.getMemoryClass()));
    }

    @VisibleForTesting
    public int readTotalRAM(String str) {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            do {
                try {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return 0;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } while (!line.startsWith("MemTotal"));
            Matcher matcher = Pattern.compile("\\d+").matcher(line);
            int i7 = matcher.find() ? Integer.parseInt(matcher.group()) : 0;
            bufferedReader.close();
            return i7;
        } catch (IOException e10) {
            AndroidLogger androidLogger = logger;
            StringBuilder sbQ = q0.q("Unable to read '", str, "' file: ");
            sbQ.append(e10.getMessage());
            androidLogger.warn(sbQ.toString());
        } catch (NumberFormatException e11) {
            AndroidLogger androidLogger2 = logger;
            StringBuilder sbQ2 = q0.q("Unable to parse '", str, "' file: ");
            sbQ2.append(e11.getMessage());
            androidLogger2.warn(sbQ2.toString());
        }
    }

    @VisibleForTesting
    public GaugeMetadataManager(Runtime runtime, Context context) {
        this.runtime = runtime;
        this.appContext = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.activityManager = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.memoryInfo = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
