package com.transsnet.palmpay.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresPermission;
import androidx.camera.video.u;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PhoneUtils {
    private static final String TAG = "PhoneUtils";
    private static String mAndroidID;
    private static String mDevicePrefix;
    private static String mDeviceSerial;

    private PhoneUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @RequiresPermission("android.permission.CALL_PHONE")
    public static void call(String str) {
        ActivityUtils.startActivity(IntentUtils.getCallIntent(str, true));
    }

    public static void dial(String str) {
        ActivityUtils.startActivity(IntentUtils.getDialIntent(str, true));
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static String getCID() {
        int baseStationId = 0;
        try {
            CellLocation cellLocation = ((TelephonyManager) Utils.getApp().getSystemService("phone")).getCellLocation();
            if (cellLocation != null) {
                baseStationId = cellLocation instanceof CdmaCellLocation ? ((CdmaCellLocation) cellLocation).getBaseStationId() : cellLocation instanceof GsmCellLocation ? ((GsmCellLocation) cellLocation).getCid() : 0;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return u.g(baseStationId, "");
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static int getCellSignalStrength() {
        TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
        if (telephonyManager != null) {
            try {
                if (telephonyManager.getAllCellInfo() != null && !telephonyManager.getAllCellInfo().isEmpty()) {
                    for (CellInfo cellInfo : telephonyManager.getAllCellInfo()) {
                        if (cellInfo.isRegistered()) {
                            if (cellInfo instanceof CellInfoGsm) {
                                return ((CellInfoGsm) cellInfo).getCellSignalStrength().getDbm();
                            }
                            if (cellInfo instanceof CellInfoCdma) {
                                return ((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm();
                            }
                            if (cellInfo instanceof CellInfoLte) {
                                return ((CellInfoLte) cellInfo).getCellSignalStrength().getDbm();
                            }
                            if (cellInfo instanceof CellInfoWcdma) {
                                return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return 0;
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    @SuppressLint({"HardwareIds"})
    public static String getDeviceId() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getDeviceId();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    @SuppressLint({"HardwareIds"})
    public static String getIMEI() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 <= 28) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
                if (i7 >= 26) {
                    if (telephonyManager != null) {
                        return telephonyManager.getImei();
                    }
                } else if (telephonyManager != null) {
                    return telephonyManager.getDeviceId();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    @SuppressLint({"HardwareIds"})
    public static String getIMEI2() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 > 28) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            if (i7 >= 30) {
                if (telephonyManager.getActiveModemCount() >= 2) {
                    return telephonyManager.getDeviceId(2);
                }
                return null;
            }
            try {
                return telephonyManager.getDeviceId(2);
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    @SuppressLint({"HardwareIds"})
    public static String getIMSI() {
        if (Build.VERSION.SDK_INT > 28) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getSubscriberId();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static String getLac() {
        String str;
        String str2 = "";
        try {
            CellLocation cellLocation = ((TelephonyManager) Utils.getApp().getSystemService("phone")).getCellLocation();
            if (cellLocation == null) {
                return "";
            }
            if (cellLocation instanceof GsmCellLocation) {
                str = ((GsmCellLocation) cellLocation).getLac() + "";
            } else {
                str = "";
            }
            try {
                if (!(cellLocation instanceof CdmaCellLocation)) {
                    return str;
                }
                return ((CdmaCellLocation) cellLocation).getNetworkId() + "";
            } catch (Throwable th) {
                th = th;
                str2 = str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        th.printStackTrace();
        return str2;
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    @SuppressLint({"HardwareIds"})
    public static String getMEID() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 <= 28) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
                if (i7 >= 26) {
                    if (telephonyManager != null) {
                        return telephonyManager.getMeid();
                    }
                } else if (telephonyManager != null) {
                    return telephonyManager.getDeviceId();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static int getPhoneType() {
        if (Build.VERSION.SDK_INT > 28) {
            return -1;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getPhoneType();
            }
            return -1;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static String getSimCountry() {
        return ((TelephonyManager) Utils.getApp().getSystemService("phone")).getSimCountryIso();
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static String getSimMSISDN() {
        if (Build.VERSION.SDK_INT > 28) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getLine1Number();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String getSimMcc() {
        StringBuilder sb2 = new StringBuilder();
        List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) Utils.getApp().getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList == null || activeSubscriptionInfoList.size() <= 0) {
            return null;
        }
        Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
        if (!it.hasNext()) {
            return sb2.toString();
        }
        sb2.append(it.next().getMcc());
        return sb2.toString();
    }

    public static String getSimMnc() {
        StringBuilder sb2 = new StringBuilder();
        List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) Utils.getApp().getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList == null || activeSubscriptionInfoList.size() <= 0) {
            return null;
        }
        Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
        if (!it.hasNext()) {
            return sb2.toString();
        }
        sb2.append(it.next().getMnc());
        return sb2.toString();
    }

    public static String getSimOperator() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getSimOperator();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String getSimOperatorByMnc() {
        TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
        String simOperator = telephonyManager != null ? telephonyManager.getSimOperator() : null;
        if (simOperator == null) {
            return null;
        }
        byte b7 = -1;
        switch (simOperator.hashCode()) {
            case 49679470:
                if (simOperator.equals("46000")) {
                    b7 = 0;
                }
                break;
            case 49679471:
                if (simOperator.equals("46001")) {
                    b7 = 1;
                }
                break;
            case 49679472:
                if (simOperator.equals("46002")) {
                    b7 = 2;
                }
                break;
            case 49679473:
                if (simOperator.equals("46003")) {
                    b7 = 3;
                }
                break;
            case 49679477:
                if (simOperator.equals("46007")) {
                    b7 = 4;
                }
                break;
        }
        switch (b7) {
            case 0:
            case 2:
            case 4:
                return "中国移动";
            case 1:
                return "中国联通";
            case 3:
                return "中国电信";
            default:
                return simOperator;
        }
    }

    public static String getSimOperatorCode() {
        TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperator();
        }
        return null;
    }

    public static String getSimOperatorName() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getSimOperatorName();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static String getSimSerialNumber() {
        if (Build.VERSION.SDK_INT > 28) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getSimSerialNumber();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static int getSimState() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getSimState();
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static int getSimType() {
        return ((TelephonyManager) Utils.getApp().getSystemService("phone")).getNetworkType();
    }

    public static String getUniqueId() {
        if (mDeviceSerial == null) {
            try {
                mDeviceSerial = SystemProperties.get("ro.boot.serialno", "012345");
            } catch (Exception e10) {
                Log.e(TAG, "getUniqueId: ", e10);
            }
        }
        if (mDevicePrefix == null) {
            try {
                String appPackageName = AppUtils.getAppPackageName();
                if (appPackageName.contains("infinix")) {
                    mDevicePrefix = "02";
                } else if (appPackageName.contains("tecno")) {
                    mDevicePrefix = "01";
                } else if (appPackageName.contains("itel")) {
                    mDevicePrefix = "03";
                } else if (appPackageName.contains(".gh")) {
                    mDevicePrefix = "04";
                } else if ("com.legend.cash".equals(appPackageName)) {
                    mDevicePrefix = "CASH_";
                } else if ("com.flexibank.pay".equals(appPackageName)) {
                    mDevicePrefix = "31_";
                } else {
                    mDevicePrefix = "";
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        if (mAndroidID == null) {
            mAndroidID = DeviceUtils.getAndroidID();
        }
        try {
            String str = mDevicePrefix + mAndroidID + mDeviceSerial;
            return TextUtils.isEmpty(str) ? mAndroidID : str;
        } catch (Exception e12) {
            e12.printStackTrace();
            return mAndroidID;
        }
    }

    public static boolean isPhone() {
        TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
        return (telephonyManager == null || telephonyManager.getPhoneType() == 0) ? false : true;
    }

    public static boolean isSimCardReady() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) Utils.getApp().getSystemService("phone");
            if (telephonyManager != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (telephonyManager.getSimState(0) == 5) {
                        return true;
                    }
                    if (telephonyManager.getSimState(1) == 5) {
                        return true;
                    }
                } else if (telephonyManager.getSimState() == 5) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static void sendEmail(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Utils.getApp().startActivity(IntentUtils.getSendEmailIntent(str, true));
    }

    public static void sendSms(String str, String str2) {
        ActivityUtils.startActivity(IntentUtils.getSendSmsIntent(str, str2, true));
    }

    @RequiresPermission("android.permission.SEND_SMS")
    public static void sendSmsSilent(String str, String str2) {
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        PendingIntent activity = Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(Utils.getApp(), 0, new Intent(), 67108864) : PendingIntent.getActivity(Utils.getApp(), 0, new Intent(), 0);
        SmsManager smsManager = SmsManager.getDefault();
        if (str2.length() < 70) {
            smsManager.sendTextMessage(str, null, str2, activity, null);
            return;
        }
        Iterator<String> it = smsManager.divideMessage(str2).iterator();
        while (it.hasNext()) {
            smsManager.sendTextMessage(str, null, it.next(), activity, null);
        }
    }

    public static void sendSms(Context context, String str, List<String> list) {
        Uri uri = Uri.parse("smsto:" + ((list == null || list.isEmpty()) ? "" : TextUtils.join("Samsung".equalsIgnoreCase(Build.MANUFACTURER) ? "," : ";", list)));
        Intent intent = new Intent();
        intent.setData(uri);
        intent.putExtra("sms_body", str);
        intent.setAction("android.intent.action.SENDTO");
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        if (defaultSmsPackage != null) {
            intent.setPackage(defaultSmsPackage);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
