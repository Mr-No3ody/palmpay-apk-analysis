package com.transsnet.palmpay.util;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class NetworkUtils {
    private static final int NETWORK_TYPE_GSM = 16;
    private static final int NETWORK_TYPE_IWLAN = 18;
    private static final int NETWORK_TYPE_TD_SCDMA = 17;

    public enum NetworkType {
        NETWORK_WIFI,
        NETWORK_4G,
        NETWORK_3G,
        NETWORK_2G,
        NETWORK_UNKNOWN,
        NETWORK_NO
    }

    private NetworkUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    private static NetworkInfo getActiveNetworkInfo() {
        ConnectivityManager connectivityManager = (ConnectivityManager) Utils.getApp().getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public static String getBluetoothAddress() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                return defaultAdapter.getAddress();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String getBluetoothName() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                return defaultAdapter.getName();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static int getBluetoothState() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                return 10;
            }
            return defaultAdapter.getState();
        } catch (Throwable th) {
            th.printStackTrace();
            return 10;
        }
    }

    public static int getBluetoothType() {
        PackageManager packageManager = Utils.getApp().getPackageManager();
        if (packageManager == null) {
            return 0;
        }
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.bluetooth");
        boolean zHasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.bluetooth_le");
        if (zHasSystemFeature && zHasSystemFeature2) {
            return 3;
        }
        if (zHasSystemFeature2) {
            return 2;
        }
        return zHasSystemFeature ? 1 : 0;
    }

    public static String getConnectWifCapabilities() {
        try {
            WifiManager wifiManager = (WifiManager) Utils.getApp().getSystemService("wifi");
            if (wifiManager != null && wifiManager.isWifiEnabled()) {
                List<ScanResult> scanResults = wifiManager.getScanResults();
                String ssid = wifiManager.getConnectionInfo().getSSID();
                if (scanResults != null) {
                    for (ScanResult scanResult : scanResults) {
                        if (ssid.equals(scanResult.SSID)) {
                            return scanResult.capabilities;
                        }
                    }
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static WifiInfo getConnectWifiInfo() {
        try {
            WifiManager wifiManager = (WifiManager) Utils.getApp().getSystemService("wifi");
            if (wifiManager != null && wifiManager.isWifiEnabled()) {
                return wifiManager.getConnectionInfo();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String getConnectWifiSSID() {
        WifiInfo connectionInfo;
        try {
            WifiManager wifiManager = (WifiManager) Utils.getApp().getSystemService("wifi");
            if (wifiManager == null || !wifiManager.isWifiEnabled() || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
                return null;
            }
            return connectionInfo.getSSID();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public static String getDomainAddress(String str) {
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public static String getIPAddress(boolean z3) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return null;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.isUp()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress()) {
                            String hostAddress = inetAddressNextElement.getHostAddress();
                            boolean z8 = hostAddress.indexOf(58) < 0;
                            if (z3) {
                                if (z8) {
                                    return hostAddress;
                                }
                            } else if (!z8) {
                                int iIndexOf = hostAddress.indexOf(37);
                                return iIndexOf < 0 ? hostAddress.toUpperCase() : hostAddress.substring(0, iIndexOf).toUpperCase();
                            }
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static NetworkType getNetworkType() {
        NetworkType networkType = NetworkType.NETWORK_NO;
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return networkType;
        }
        if (activeNetworkInfo.getType() == 1) {
            return NetworkType.NETWORK_WIFI;
        }
        if (activeNetworkInfo.getType() != 0) {
            return NetworkType.NETWORK_UNKNOWN;
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkType.NETWORK_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkType.NETWORK_3G;
            case 13:
            case 18:
                return NetworkType.NETWORK_4G;
            default:
                String subtypeName = activeNetworkInfo.getSubtypeName();
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? NetworkType.NETWORK_3G : NetworkType.NETWORK_UNKNOWN;
        }
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    @Deprecated
    public static boolean isConnected() {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        if (Utils.getApp() == null || (connectivityManager = (ConnectivityManager) Utils.getApp().getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(4) || networkCapabilities.hasTransport(3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public static boolean isUsingProxy() {
        int i7;
        String property = null;
        try {
            property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            String str = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
            if (property2 == null) {
                property2 = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
            }
            i7 = Integer.parseInt(property2);
            try {
                if (TextUtils.isEmpty(property)) {
                    property = System.getProperty("https.proxyHost");
                    String property3 = System.getProperty("https.proxyPort");
                    if (property3 != null) {
                        str = property3;
                    }
                    i7 = Integer.parseInt(str);
                }
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
            }
        } catch (Exception e11) {
            e = e11;
            i7 = -1;
        }
        return (TextUtils.isEmpty(property) || i7 == -1) ? false : true;
    }

    public static boolean isUsingVPN() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if ("tun0".equalsIgnoreCase(networkInterface.getName()) || "ppp0".equalsIgnoreCase(networkInterface.getName())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isWifiConnected() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) Utils.getApp().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasTransport(1)) ? false : true;
    }
}
