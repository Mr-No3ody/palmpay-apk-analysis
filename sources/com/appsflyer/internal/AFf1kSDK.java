package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1kSDK {
    private static AFf1kSDK getRevenue;
    private final Map<String, String> AFAdRevenueData = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFf1kSDK.1
        {
            put(TransType.TRANS_TYPE_BUCKET_DATA, "ro.arch");
            put("ab", "ro.chipname");
            put("ac", "ro.dalvik.vm.native.bridge");
            put("ad", "persist.sys.nativebridge");
            put(TransType.TRANS_TYPE_PAY_CARD_H5, "ro.enable.native.bridge.exec");
            put("af", "dalvik.vm.isa.x86.features");
            put("ag", "dalvik.vm.isa.x86.variant");
            put(TransType.TRANS_TYPE_WITHDRAW_EARN, "ro.zygote");
            put(TransType.TRANS_TYPE_PURCHASE_EARN, "ro.allow.mock.location");
            put("aj", "ro.dalvik.vm.isa.arm");
            put("ak", "dalvik.vm.isa.arm.features");
            put("al", "dalvik.vm.isa.arm.variant");
            put("am", "dalvik.vm.isa.arm64.features");
            put("an", "dalvik.vm.isa.arm64.variant");
            put("ao", "vzw.os.rooted");
            put("ap", "ro.build.user");
            put("aq", "ro.kernel.qemu");
            put("ar", "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put(TransType.TRANS_TYPE_SCAN_TO_PAY, "ro.product.cpu.abilist");
            put(TransType.TRANS_TYPE_PALM_PRIZE, "ro.product.cpu.abilist32");
            put("av", "ro.product.cpu.abilist64");
        }
    };

    public enum AFa1tSDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String getRevenue;

        AFa1tSDK(String str) {
            this.getRevenue = str;
        }
    }

    public enum AFa1uSDK {
        XPOSED("xps"),
        FRIDA("frd");

        String getMonetizationNetwork;

        AFa1uSDK(String str) {
            this.getMonetizationNetwork = str;
        }
    }

    private AFf1kSDK() {
    }

    @WorkerThread
    public static AFf1kSDK getCurrencyIso4217Code() {
        if (getRevenue == null) {
            getRevenue = new AFf1kSDK();
        }
        return getRevenue;
    }

    private static boolean getMediationNetwork(String str) {
        return str.matches("\\d+");
    }

    private AFg1kSDK getMonetizationNetwork(Context context) {
        AFg1kSDK aFg1kSDK = new AFg1kSDK();
        try {
            aFg1kSDK.getMonetizationNetwork(AFa1tSDK.HOOKING.getRevenue, AFAdRevenueData());
            aFg1kSDK.getMonetizationNetwork(AFa1tSDK.DEBUGGABLE.getRevenue, Boolean.valueOf(getMediationNetwork(context)));
            return aFg1kSDK;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", th);
            return aFg1kSDK;
        }
    }

    private AFg1kSDK getRevenue() throws Throwable {
        AFg1kSDK aFg1kSDK = new AFg1kSDK();
        try {
            for (Map.Entry<String, String> entry : this.AFAdRevenueData.entrySet()) {
                String monetizationNetwork = getMonetizationNetwork(entry.getValue());
                if (monetizationNetwork != null && !monetizationNetwork.equals("")) {
                    aFg1kSDK.getMonetizationNetwork(entry.getKey(), monetizationNetwork);
                }
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e10);
        }
        return aFg1kSDK;
    }

    public final Object AFAdRevenueData(Context context, String str) throws Throwable {
        String str2 = null;
        if (str != null) {
            try {
                str2 = getMediationNetwork(str) ? null : "invalid timestamp";
            } catch (Exception e10) {
                AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", e10);
                return str2;
            }
        }
        AFg1kSDK aFg1kSDK = new AFg1kSDK();
        aFg1kSDK.getMonetizationNetwork("pr", getRevenue());
        aFg1kSDK.getMonetizationNetwork("an", getMonetizationNetwork(context));
        return aFg1kSDK;
    }

    private static boolean getMediationNetwork(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private static boolean getMediationNetwork(String str, String str2) throws Exception {
        String line;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            do {
                line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(line.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e10) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e10);
            throw new Exception("FNF");
        } catch (IOException e11) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e11);
            throw new Exception("IOF");
        } catch (Exception e12) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e12);
            throw new Exception("GF");
        }
    }

    private static String AFAdRevenueData() {
        StringBuilder sb2 = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i7 = 0;
            int i10 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i10 <= 2) {
                        i10++;
                        sb2.append(AFa1uSDK.XPOSED.getMonetizationNetwork);
                        if (stackTraceElement.getMethodName().equals("main")) {
                            sb2.append("+a");
                        }
                        if (stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                            sb2.append("+h");
                        }
                        sb2.append(";");
                    }
                    if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                        i7++;
                    }
                }
            }
            if (i7 > 1) {
                sb2.append("mz;");
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("hooking check error", th);
        }
        try {
            StringBuilder sb3 = new StringBuilder("/proc/");
            sb3.append(Process.myPid());
            sb3.append("/maps");
            if (getMediationNetwork(sb3.toString(), "frida")) {
                sb2.append(AFa1uSDK.FRIDA.getMonetizationNetwork);
                if (Build.VERSION.SDK_INT < 29 && getMediationNetwork("/proc/net/tcp", "69A2")) {
                    sb2.append("+prt");
                }
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("frida detection error", e10);
            sb2.append(e10.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb2.append(";");
        return sb2.toString();
    }

    @SuppressLint({"PrivateApi"})
    private static String getMonetizationNetwork(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e10);
            return null;
        }
    }
}
