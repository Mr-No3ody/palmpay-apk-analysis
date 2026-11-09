package com.transsnet.palmpay.util;

import N8.q0;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import com.adjust.sdk.Constants;
import java.io.File;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes4.dex */
public final class DeviceUtils {
    private static final long MB = 1048576;
    private static String mDeviceModel;
    private static LEVEL sLevelCache;

    public enum LEVEL {
        BEST(5),
        HIGH(4),
        MIDDLE(3),
        LOW(2),
        BAD(1),
        UN_KNOW(-1);

        int value;

        LEVEL(int i7) {
            this.value = i7;
        }

        public int getValue() {
            return this.value;
        }
    }

    private DeviceUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @SuppressLint({"HardwareIds"})
    public static String getAndroidID() {
        return Settings.Secure.getString(Utils.getApp().getContentResolver(), "android_id");
    }

    private static String getCpuInfo() {
        try {
            ShellUtils.CommandResult commandResultExecCmd = ShellUtils.execCmd("cat /proc/cpuinfo", false);
            return commandResultExecCmd.result == 0 ? commandResultExecCmd.successMsg : "0";
        } catch (Throwable th) {
            th.printStackTrace();
            return "0";
        }
    }

    public static String getCpuModel() {
        return getCpuInfo("Hardware", "Unknown");
    }

    public static String getCpuSerial() {
        return getCpuInfo("Serial", "00000000000000");
    }

    public static String getCurCpuFreq() {
        try {
            ShellUtils.CommandResult commandResultExecCmd = ShellUtils.execCmd("cat /sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_cur_freq", false);
            return commandResultExecCmd.result == 0 ? commandResultExecCmd.successMsg : "0";
        } catch (Throwable th) {
            th.printStackTrace();
            return "0";
        }
    }

    public static LEVEL getDeviceLevel(Context context) {
        LEVEL level = sLevelCache;
        if (level != null) {
            return level;
        }
        long totalMemory = getTotalMemory(context);
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (totalMemory >= 8589934592L) {
            sLevelCache = LEVEL.BEST;
        } else if (totalMemory >= 6442450944L) {
            sLevelCache = LEVEL.HIGH;
        } else if (totalMemory >= 4294967296L) {
            sLevelCache = LEVEL.MIDDLE;
        } else if (totalMemory >= 2147483648L) {
            if (iAvailableProcessors >= 4) {
                sLevelCache = LEVEL.MIDDLE;
            } else if (iAvailableProcessors > 0) {
                sLevelCache = LEVEL.LOW;
            }
        } else if (totalMemory >= 0) {
            sLevelCache = LEVEL.BAD;
        } else {
            sLevelCache = LEVEL.UN_KNOW;
        }
        return sLevelCache;
    }

    private static InetAddress getInetAddress() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.isUp()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && inetAddressNextElement.getHostAddress().indexOf(58) < 0) {
                            return inetAddressNextElement;
                        }
                    }
                }
            }
            return null;
        } catch (SocketException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.INTERNET"})
    public static String getMacAddress() {
        try {
            String macAddressByWifiInfo = getMacAddressByWifiInfo();
            if (!"02:00:00:00:00:00".equals(macAddressByWifiInfo)) {
                return macAddressByWifiInfo;
            }
            String macAddressByNetworkInterface = getMacAddressByNetworkInterface();
            if (!"02:00:00:00:00:00".equals(macAddressByNetworkInterface)) {
                return macAddressByNetworkInterface;
            }
            String macAddressByInetAddress = getMacAddressByInetAddress();
            if (!"02:00:00:00:00:00".equals(macAddressByInetAddress)) {
                return macAddressByInetAddress;
            }
            String macAddressByFile = getMacAddressByFile();
            return !"02:00:00:00:00:00".equals(macAddressByFile) ? macAddressByFile : "please open wifi";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "please open wifi";
        }
    }

    private static String getMacAddressByFile() {
        String str;
        String str2;
        ShellUtils.CommandResult commandResultExecCmd = ShellUtils.execCmd("getprop wifi.interface", false);
        if (commandResultExecCmd.result != 0 || (str = commandResultExecCmd.successMsg) == null) {
            return "02:00:00:00:00:00";
        }
        ShellUtils.CommandResult commandResultExecCmd2 = ShellUtils.execCmd("cat /sys/class/net/" + str + "/address", false);
        return (commandResultExecCmd2.result != 0 || (str2 = commandResultExecCmd2.successMsg) == null || str2.length() <= 0) ? "02:00:00:00:00:00" : str2;
    }

    private static String getMacAddressByInetAddress() {
        NetworkInterface byInetAddress;
        byte[] hardwareAddress;
        try {
            InetAddress inetAddress = getInetAddress();
            if (inetAddress == null || (byInetAddress = NetworkInterface.getByInetAddress(inetAddress)) == null || (hardwareAddress = byInetAddress.getHardwareAddress()) == null || hardwareAddress.length <= 0) {
                return "02:00:00:00:00:00";
            }
            StringBuilder sb2 = new StringBuilder();
            for (byte b7 : hardwareAddress) {
                sb2.append(String.format("%02x:", Byte.valueOf(b7)));
            }
            return sb2.substring(0, sb2.length() - 1);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    private static String getMacAddressByNetworkInterface() {
        byte[] hardwareAddress;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement != null && networkInterfaceNextElement.getName().equalsIgnoreCase("wlan0") && (hardwareAddress = networkInterfaceNextElement.getHardwareAddress()) != null && hardwareAddress.length > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b7 : hardwareAddress) {
                        sb2.append(String.format("%02x:", Byte.valueOf(b7)));
                    }
                    return sb2.substring(0, sb2.length() - 1);
                }
            }
            return "02:00:00:00:00:00";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    private static String getMacAddressByWifiInfo() {
        WifiInfo connectionInfo;
        try {
            WifiManager wifiManager = (WifiManager) Utils.getApp().getApplicationContext().getSystemService("wifi");
            return (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) ? "02:00:00:00:00:00" : connectionInfo.getMacAddress();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getMaxCpuFreq() {
        try {
            ShellUtils.CommandResult commandResultExecCmd = ShellUtils.execCmd("cat /sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq", false);
            return commandResultExecCmd.result == 0 ? commandResultExecCmd.successMsg : "0";
        } catch (Throwable th) {
            th.printStackTrace();
            return "0";
        }
    }

    public static String getMinCpuFreq() {
        try {
            ShellUtils.CommandResult commandResultExecCmd = ShellUtils.execCmd("cat /sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq", false);
            return commandResultExecCmd.result == 0 ? commandResultExecCmd.successMsg : "0";
        } catch (Throwable th) {
            th.printStackTrace();
            return "0";
        }
    }

    public static String getModel() {
        if (mDeviceModel == null) {
            String str = Build.MODEL;
            mDeviceModel = str != null ? str.trim().replaceAll("\\s*", "") : "";
        }
        return mDeviceModel;
    }

    private static String getPropPrefix() {
        return "debug.palmpay.";
    }

    public static int getSDKVersionCode() {
        return Build.VERSION.SDK_INT;
    }

    public static String getSDKVersionName() {
        return Build.VERSION.RELEASE;
    }

    public static int getStatusBarHeight() {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return Utils.getApp().getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String getStringProp(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        ShellUtils.CommandResult commandResultExecCmd = ShellUtils.execCmd("getprop " + getPropPrefix() + str, false);
        if (commandResultExecCmd.result == 0) {
            String str2 = commandResultExecCmd.successMsg;
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return "";
    }

    public static long getTotalMemory(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static int getVmHeepSize() {
        ShellUtils.CommandResult commandResultExecCmd = ShellUtils.execCmd("getprop dalvik.vm.heapsize", false);
        if (commandResultExecCmd.result == 0) {
            String str = commandResultExecCmd.successMsg;
            if (!TextUtils.isEmpty(str)) {
                try {
                    return Integer.parseInt(str.substring(0, str.length() - 1));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        return 0;
    }

    public static boolean isDeviceRooted() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/sbin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/xbin/", "/data/local/bin/", "/data/local/"};
        for (int i7 = 0; i7 < 8; i7++) {
            if (new File(q0.j(strArr[i7], "su")).exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEmulator() {
        String str = Build.FINGERPRINT;
        if ((str.startsWith("google/sdk_gphone_") && str.endsWith(":user/release-keys") && "Google".equalsIgnoreCase(Build.MANUFACTURER) && Build.PRODUCT.startsWith("sdk_gphone_") && Constants.REFERRER_API_GOOGLE.equalsIgnoreCase(Build.BRAND) && Build.MODEL.startsWith("sdk_gphone_")) || str.startsWith("generic") || str.startsWith("unknown")) {
            return true;
        }
        String str2 = Build.MODEL;
        if (str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86")) {
            return true;
        }
        if (("QC_Reference_Phone".equalsIgnoreCase(Build.BOARD) && !"Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) || Build.MANUFACTURER.contains("Genymotion") || "Build2".equalsIgnoreCase(Build.HOST)) {
            return true;
        }
        return (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equalsIgnoreCase(Build.PRODUCT) || "1".equals(getStringProp("ro.kernel.qemu"));
    }

    public static boolean isInVPN() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if ("tun0".equalsIgnoreCase(networkInterface.getName()) || "ppp0".equalsIgnoreCase(networkInterface.getName())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static void shutdown() {
        ShellUtils.execCmd("reboot -p", true);
        Intent intent = new Intent("android.intent.action.ACTION_REQUEST_SHUTDOWN");
        intent.putExtra("android.intent.extra.KEY_CONFIRM", false);
        Utils.getApp().startActivity(intent.addFlags(268435456));
    }

    private static String getCpuInfo(String str, String str2) {
        String line;
        try {
            Process processExecCmd = ShellUtils.execCmd("cat /proc/cpuinfo");
            if (processExecCmd != null) {
                LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(processExecCmd.getInputStream()));
                for (int i7 = 1; i7 < 100 && (line = lineNumberReader.readLine()) != null; i7++) {
                    if (line.indexOf(str) > -1) {
                        return line.substring(line.indexOf(":") + 1, line.length()).trim();
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return str2;
    }
}
