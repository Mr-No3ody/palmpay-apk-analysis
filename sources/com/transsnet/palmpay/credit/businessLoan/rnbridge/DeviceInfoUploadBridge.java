package com.transsnet.palmpay.credit.businessLoan.rnbridge;

import F6.d;
import android.content.pm.Signature;
import android.net.wifi.WifiInfo;
import com.didi.drouter.annotation.Service;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.palmpay.lib.bridge.AsyncBridge;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.req.UploadDeviceInfoReq;
import com.transsnet.palmpay.credit.businessLoan.export.bean.req.a;
import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridgeV2;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.NetworkUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.x;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p053db.c;
import p083fb.b;

/* JADX INFO: loaded from: classes4.dex */
@Service(alias = {"/businessLoan/getDeviceInfo"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 82\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u00039:\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u0011\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u0019\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010\u0010J\u0017\u0010!\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\u0010J-\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020%0$2\b\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020(2\b\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010*J#\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020%0$2\u0006\u0010+\u001a\u00020\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\u0004\u0018\u00010\b2\b\u0010+\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b0\u00101J#\u00106\u001a\u0002052\b\u00102\u001a\u0004\u0018\u00010\u00022\b\u00104\u001a\u0004\u0018\u000103H\u0014¢\u0006\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/transsnet/palmpay/credit/businessLoan/rnbridge/DeviceInfoUploadBridge;", "Lcom/palmpay/lib/bridge/AsyncBridge;", "Lcom/transsnet/palmpay/credit/businessLoan/export/bean/req/a;", "<init>", "()V", "Ldb/c;", "buildDeviceInfo", "()Ldb/c;", "Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean;", "originalInfo", "convertToStandardDeviceInfo", "(Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean;)Ldb/c;", "", "generateDeviceUuid", "()Ljava/lang/String;", "getAppVersionString", "(Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean;)Ljava/lang/String;", "getVersionCodeString", "getAppPackageName", "", "determineNetworkType", "(Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean;)I", "getAppSignatures", "getInternalIp", "getExternalIp", "getWifiName", "getWifiMac", "getDefaultDeviceId", "getDefaultImei", "getDefaultDeviceBrand", "getDefaultDeviceModel", "getDefaultOsVersion", "getRealLatitude", "getRealLongitude", CreditHandleRouterBridgeV2.ACTION_DEVICE_INFO, "message", "", "", "createStandardizedResponse", "(Ldb/c;Ljava/lang/String;)Ljava/util/Map;", "Lbb/c;", "createSuccessResponse", "(Ldb/c;Ljava/lang/String;)Lbb/c;", "standardInfo", "convertToStandardizedMap", "(Ldb/c;)Ljava/util/Map;", "convertToOriginalDeviceInfo", "(Ldb/c;)Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean;", "getDeviceInfoFieldCount", "(Ldb/c;)I", "params", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "", "onHandle", "(Lcom/transsnet/palmpay/credit/businessLoan/export/bean/req/a;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Companion", "a", "db/b", "module_business_loan_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceInfoUploadBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoUploadBridge.kt\ncom/transsnet/palmpay/credit/businessLoan/rnbridge/DeviceInfoUploadBridge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,640:1\n1#2:641\n1563#3:642\n1634#3,3:643\n*S KotlinDebug\n*F\n+ 1 DeviceInfoUploadBridge.kt\ncom/transsnet/palmpay/credit/businessLoan/rnbridge/DeviceInfoUploadBridge\n*L\n517#1:642\n517#1:643,3\n*E\n"})
public final class DeviceInfoUploadBridge extends AsyncBridge<a> {

    @NotNull
    public static final String RESULT_ERROR = "error";

    @NotNull
    public static final String RESULT_SUCCESS = "success";

    @NotNull
    private static final String TAG = "DeviceInfoUploadBridge";

    private final c buildDeviceInfo() {
        try {
            com.transsnet.palmpay.credit.businessLoan.export.bean.req.c ocDeviceInfoWithAppList$default = b.getOcDeviceInfoWithAppList$default(p083fb.c.f36436a, null, null, null, 7, null);
            List<com.transsnet.palmpay.credit.businessLoan.export.bean.req.b> list = ocDeviceInfoWithAppList$default.appInfo;
            c cVarA = p083fb.a.a(ocDeviceInfoWithAppList$default);
            int size = list != null ? list.size() : 0;
            ArrayList arrayList = cVarA.f35859s;
            d.h(TAG, 3, "buildDeviceInfo - 设备信息构建完成，原始应用数: " + size + "，标准应用数: " + (arrayList != null ? arrayList.size() : 0));
            return cVarA;
        } catch (Exception e10) {
            d.c(TAG, "buildDeviceInfo - 获取设备信息失败，返回null", e10);
            return null;
        }
    }

    private final UploadDeviceInfoReq.DeviceInfoBean convertToOriginalDeviceInfo(c standardInfo) {
        if (standardInfo == null) {
            return null;
        }
        try {
            UploadDeviceInfoReq.DeviceInfoBean deviceInfoBean = new UploadDeviceInfoReq.DeviceInfoBean();
            deviceInfoBean.deviceId1 = standardInfo.f35841a;
            deviceInfoBean.deviceID = standardInfo.f35842b;
            deviceInfoBean.imei = standardInfo.f35843c;
            deviceInfoBean.phone_brand = standardInfo.f35844d;
            deviceInfoBean.phone_model = standardInfo.f35845e;
            int intOrNull = StringsKt.toIntOrNull(standardInfo.f35846f);
            if (intOrNull == null) {
                intOrNull = 0;
            }
            deviceInfoBean.app_version = intOrNull;
            deviceInfoBean.os_version = standardInfo.f35849i;
            Double dE = x.e(standardInfo.f35850j);
            if (dE == null) {
                dE = Double.valueOf(0.0d);
            }
            deviceInfoBean.latitude = dE;
            Double dE2 = x.e(standardInfo.f35851k);
            if (dE2 == null) {
                dE2 = Double.valueOf(0.0d);
            }
            deviceInfoBean.longitude = dE2;
            deviceInfoBean.device_root = standardInfo.f35856p.intValue();
            String str = standardInfo.f35857q;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            deviceInfoBean.wifi = str;
            String str3 = standardInfo.f35858r;
            if (str3 != null) {
                str2 = str3;
            }
            deviceInfoBean.mac = str2;
            deviceInfoBean.wifi_conneted = standardInfo.f35852l == 1 ? 1 : 0;
            deviceInfoBean.external_ip = standardInfo.f35855o;
            return deviceInfoBean;
        } catch (Exception e10) {
            d.c(TAG, "convertToOriginalDeviceInfo - 转换失败", e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0165  */
    /* JADX WARN: Code duplicated, block: B:128:0x0175 A[Catch: Exception -> 0x0184, TRY_LEAVE, TryCatch #6 {Exception -> 0x0184, blocks: (B:126:0x016f, B:128:0x0175), top: B:199:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0184  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a7 A[Catch: Exception -> 0x01b8, TryCatch #3 {Exception -> 0x01b8, blocks: (B:143:0x01a1, B:145:0x01a7, B:148:0x01ae), top: B:192:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:159:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:162:0x01df  */
    /* JADX WARN: Code duplicated, block: B:164:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:171:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:173:0x0200  */
    /* JADX WARN: Code duplicated, block: B:174:0x0205  */
    /* JADX WARN: Code duplicated, block: B:176:0x0218  */
    /* JADX WARN: Code duplicated, block: B:192:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    @Deprecated(message = "Use DeviceInfoMapper.toStandardDeviceInfo() instead")
    private final c convertToStandardDeviceInfo(UploadDeviceInfoReq.DeviceInfoBean originalInfo) {
        String strValueOf;
        String string;
        int i7;
        boolean z3;
        String string2;
        String iPAddress;
        String iPAddress2;
        String str;
        String str2;
        String str3;
        String strK;
        WifiInfo connectWifiInfo;
        String ssid;
        String str4;
        String str5;
        String macAddress;
        List<UploadDeviceInfoReq.DeviceInfoBean.AppInfoBean> list;
        List<UploadDeviceInfoReq.DeviceInfoBean.AppInfoBean> list2;
        ArrayList arrayList;
        Iterator it;
        UploadDeviceInfoReq.DeviceInfoBean.AppInfoBean appInfoBean;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Intrinsics.checkNotNullParameter(originalInfo, "<this>");
        String androidID = originalInfo.deviceId1;
        if (androidID == null && (androidID = originalInfo.deviceID) == null && (androidID = DeviceUtils.getAndroidID()) == null) {
            androidID = "unknown_device_id";
        }
        String str11 = androidID;
        String androidID2 = originalInfo.deviceID;
        if (androidID2 == null && (androidID2 = originalInfo.deviceId1) == null && (androidID2 = DeviceUtils.getAndroidID()) == null) {
            androidID2 = System.currentTimeMillis() + "-" + UUID.randomUUID();
        }
        String str12 = androidID2;
        String androidID3 = originalInfo.imei;
        if (androidID3 == null && (androidID3 = DeviceUtils.getAndroidID()) == null) {
            androidID3 = "unknown_imei";
        }
        String str13 = androidID3;
        String manufacturer = originalInfo.phone_brand;
        if (manufacturer == null && (manufacturer = DeviceUtils.getManufacturer()) == null) {
            manufacturer = "unknown_brand";
        }
        String str14 = manufacturer;
        String model = originalInfo.phone_model;
        if (model == null && (model = DeviceUtils.getModel()) == null) {
            model = "unknown_model";
        }
        String str15 = model;
        String strConcat = originalInfo.os_version;
        if (strConcat == null) {
            String sDKVersionName = DeviceUtils.getSDKVersionName();
            if (sDKVersionName == null) {
                sDKVersionName = "_unknown";
            }
            strConcat = "Android".concat(sDKVersionName);
        }
        String str16 = strConcat;
        Integer num = originalInfo.app_version;
        if ((num == null || (strValueOf = num.toString()) == null) && (strValueOf = String.valueOf(AppUtils.getAppVersionCode())) == null) {
            strValueOf = "1";
        }
        String str17 = strValueOf;
        String appVersionName = AppUtils.getAppVersionName();
        String str18 = appVersionName == null ? str17 : appVersionName;
        String appPackageName = AppUtils.getAppPackageName();
        if (appPackageName == null) {
            appPackageName = "com.palmpay.intl";
        }
        String str19 = appPackageName;
        Double d2 = originalInfo.latitude;
        String string3 = IdManager.DEFAULT_VERSION_NAME;
        if (d2 != null) {
            try {
                string = Intrinsics.b(d2) ? IdManager.DEFAULT_VERSION_NAME : d2.toString();
            } catch (Exception unused) {
            }
        }
        Double d10 = originalInfo.longitude;
        if (d10 != null) {
            try {
                if (!Intrinsics.b(d10)) {
                    string3 = d10.toString();
                }
            } catch (Exception unused2) {
            }
        }
        String str20 = string3;
        int i10 = originalInfo.wifi_conneted;
        try {
            if (NetworkUtils.isWifiConnected()) {
                i7 = 1;
            } else {
                if (NetworkUtils.isConnected() && !NetworkUtils.isWifiConnected()) {
                    String strName = NetworkUtils.getNetworkType().name();
                    int iHashCode = strName.hashCode();
                    if (iHashCode == -135077448) {
                        str10 = "TYPE_4G";
                    } else if (iHashCode != -135077417) {
                        if (iHashCode == 1683) {
                            str10 = "4G";
                        } else if (iHashCode != 1714) {
                            if (iHashCode == 75709) {
                                str10 = "LTE";
                            }
                        } else if (strName.equals("5G")) {
                            i7 = 3;
                        }
                    } else if (strName.equals("TYPE_5G")) {
                        i7 = 3;
                    }
                    strName.equals(str10);
                } else if (i10 == 1) {
                    i7 = 1;
                }
                i7 = 2;
            }
        } catch (Exception unused3) {
        }
        try {
            try {
                Signature[] appSignature = AppUtils.getAppSignature();
                if (appSignature != null) {
                    z3 = true;
                    try {
                        if (appSignature.length != 0) {
                            string2 = appSignature[0].toString();
                        }
                    } catch (Exception unused4) {
                    }
                    iPAddress = NetworkUtils.getIPAddress(z3);
                    iPAddress2 = originalInfo.external_ip;
                    if (iPAddress2 == null) {
                        try {
                            iPAddress2 = NetworkUtils.getIPAddress(false);
                        } catch (Exception unused5) {
                            iPAddress2 = null;
                        }
                    }
                    String str21 = string2;
                    str = originalInfo.wifi;
                    if (str != null || str.length() == 0) {
                        str2 = iPAddress;
                        try {
                            connectWifiInfo = NetworkUtils.getConnectWifiInfo();
                            if (connectWifiInfo != null || (ssid = connectWifiInfo.getSSID()) == null) {
                                str3 = str11;
                            } else {
                                str3 = str11;
                                try {
                                    strK = y.k(ssid, "\"", "");
                                } catch (Exception unused6) {
                                    strK = null;
                                }
                            }
                        } catch (Exception unused7) {
                        }
                        strK = null;
                    } else {
                        str2 = iPAddress;
                        strK = originalInfo.wifi;
                        str3 = str11;
                    }
                    str4 = originalInfo.mac;
                    if (str4 != null || str4.length() == 0 || Intrinsics.c(originalInfo.mac, "02:00:00:00:00:00")) {
                        try {
                            macAddress = DeviceUtils.getMacAddress();
                            if (macAddress != null || macAddress.length() == 0 || macAddress.equals("02:00:00:00:00:00")) {
                                macAddress = null;
                            }
                            str5 = macAddress;
                        } catch (Exception unused8) {
                            str5 = null;
                        }
                    } else {
                        str5 = originalInfo.mac;
                    }
                    list = originalInfo.appList;
                    if (list != null) {
                        list.size();
                    }
                    list2 = originalInfo.appList;
                    if (list2 != null) {
                        List<UploadDeviceInfoReq.DeviceInfoBean.AppInfoBean> list3 = list2;
                        arrayList = new ArrayList(r.l(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                            appInfoBean = (UploadDeviceInfoReq.DeviceInfoBean.AppInfoBean) it.next();
                            Iterator it2 = it;
                            if (appInfoBean != null) {
                                str6 = appInfoBean.app_name;
                            } else {
                                str6 = null;
                            }
                            if (appInfoBean != null || (str9 = appInfoBean.app_version) == null) {
                                str7 = "";
                            } else {
                                str7 = str9;
                            }
                            if (appInfoBean != null) {
                                str8 = appInfoBean.app_name;
                            } else {
                                str8 = null;
                            }
                            arrayList.add(new p053db.b(str6, str7, str8, 0L, 0L, 0));
                            it = it2;
                        }
                    } else {
                        arrayList = null;
                    }
                    return new c(str3, str12, str13, str14, str15, str18, str17, str19, str16, string, str20, i7, str21, str2, iPAddress2, Integer.valueOf(originalInfo.device_root), strK, str5, arrayList);
                }
                z3 = true;
            } catch (Exception unused9) {
            }
            iPAddress = NetworkUtils.getIPAddress(z3);
        } catch (Exception unused10) {
            iPAddress = null;
        }
        string2 = null;
        iPAddress2 = originalInfo.external_ip;
        if (iPAddress2 == null) {
            iPAddress2 = NetworkUtils.getIPAddress(false);
        }
        String str22 = string2;
        str = originalInfo.wifi;
        if (str != null) {
            str2 = iPAddress;
            connectWifiInfo = NetworkUtils.getConnectWifiInfo();
            if (connectWifiInfo != null) {
                str3 = str11;
                strK = null;
            } else {
                str3 = str11;
                strK = null;
            }
        } else {
            str2 = iPAddress;
            connectWifiInfo = NetworkUtils.getConnectWifiInfo();
            if (connectWifiInfo != null) {
                str3 = str11;
                strK = null;
            } else {
                str3 = str11;
                strK = null;
            }
        }
        str4 = originalInfo.mac;
        if (str4 != null) {
            macAddress = DeviceUtils.getMacAddress();
            if (macAddress != null) {
                macAddress = null;
            } else {
                macAddress = null;
            }
            str5 = macAddress;
        } else {
            macAddress = DeviceUtils.getMacAddress();
            if (macAddress != null) {
                macAddress = null;
            } else {
                macAddress = null;
            }
            str5 = macAddress;
        }
        list = originalInfo.appList;
        if (list != null) {
            list.size();
        }
        list2 = originalInfo.appList;
        if (list2 != null) {
            List<UploadDeviceInfoReq.DeviceInfoBean.AppInfoBean> list4 = list2;
            arrayList = new ArrayList(r.l(list4, 10));
            it = list4.iterator();
            while (it.hasNext()) {
                appInfoBean = (UploadDeviceInfoReq.DeviceInfoBean.AppInfoBean) it.next();
                Iterator it3 = it;
                if (appInfoBean != null) {
                    str6 = appInfoBean.app_name;
                } else {
                    str6 = null;
                }
                if (appInfoBean != null) {
                    str7 = "";
                } else {
                    str7 = "";
                }
                if (appInfoBean != null) {
                    str8 = appInfoBean.app_name;
                } else {
                    str8 = null;
                }
                arrayList.add(new p053db.b(str6, str7, str8, 0L, 0L, 0));
                it = it3;
            }
        } else {
            arrayList = null;
        }
        return new c(str3, str12, str13, str14, str15, str18, str17, str19, str16, string, str20, i7, str22, str2, iPAddress2, Integer.valueOf(originalInfo.device_root), strK, str5, arrayList);
    }

    private final Map<String, Object> convertToStandardizedMap(c standardInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        standardInfo.getClass();
        linkedHashMap.put("deviceType", 1);
        linkedHashMap.put("deviceId", standardInfo.f35841a);
        linkedHashMap.put("deviceUuid", standardInfo.f35842b);
        linkedHashMap.put("imei", standardInfo.f35843c);
        linkedHashMap.put("deviceBrand", standardInfo.f35844d);
        linkedHashMap.put("deviceModel", standardInfo.f35845e);
        linkedHashMap.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, standardInfo.f35846f);
        linkedHashMap.put("versionCode", standardInfo.f35847g);
        linkedHashMap.put("appPackageName", standardInfo.f35848h);
        linkedHashMap.put("osVersion", standardInfo.f35849i);
        linkedHashMap.put("latitude", standardInfo.f35850j);
        linkedHashMap.put("longitude", standardInfo.f35851k);
        linkedHashMap.put("networkType", Integer.valueOf(standardInfo.f35852l));
        String str = standardInfo.f35853m;
        if (str != null) {
            linkedHashMap.put("appSignatures", str);
        }
        String str2 = standardInfo.f35854n;
        if (str2 != null) {
            linkedHashMap.put("ethIp", str2);
        }
        String str3 = standardInfo.f35855o;
        if (str3 != null) {
            linkedHashMap.put("ip", str3);
        }
        linkedHashMap.put("isRooted", Integer.valueOf(standardInfo.f35856p.intValue()));
        String str4 = standardInfo.f35857q;
        if (str4 != null) {
            linkedHashMap.put("wifiName", str4);
        }
        String str5 = standardInfo.f35858r;
        if (str5 != null) {
            linkedHashMap.put("wifiMac", str5);
        }
        ArrayList<p053db.b> arrayList = standardInfo.f35859s;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(r.l(arrayList, 10));
            for (p053db.b bVar : arrayList) {
                arrayList2.add(G.g(new Pair("appName", bVar.f35835a), new Pair(RemoteConfigConstants.RequestFieldKey.APP_VERSION, bVar.f35836b), new Pair("appPackageName", bVar.f35837c), new Pair("appCreateTime", Long.valueOf(bVar.f35838d)), new Pair("appUpdateTime", Long.valueOf(bVar.f35839e)), new Pair("appType", Integer.valueOf(bVar.f35840f))));
            }
            linkedHashMap.put("appList", arrayList2);
        }
        return linkedHashMap;
    }

    private final Map<String, Object> createStandardizedResponse(c deviceInfo, String message) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("success", Boolean.TRUE);
        linkedHashMap.put("resultType", "success");
        linkedHashMap.put("respCode", "00000000");
        linkedHashMap.put("respMsg", message);
        linkedHashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("summary", "设备信息获取成功");
        if (deviceInfo != null) {
            linkedHashMap.put("nodeConfirmParam", convertToStandardizedMap(deviceInfo));
        }
        return linkedHashMap;
    }

    private final p026bb.c createSuccessResponse(c deviceInfo, String message) {
        return new p026bb.c(message, Long.valueOf(System.currentTimeMillis()), convertToOriginalDeviceInfo(deviceInfo));
    }

    private final int determineNetworkType(UploadDeviceInfoReq.DeviceInfoBean originalInfo) {
        String str;
        try {
            if (NetworkUtils.isWifiConnected()) {
                d.h(TAG, 3, "determineNetworkType - 当前连接WiFi");
                return 1;
            }
            if (!NetworkUtils.isConnected() || NetworkUtils.isWifiConnected()) {
                return originalInfo.wifi_conneted == 1 ? 1 : 2;
            }
            NetworkUtils.NetworkType networkType = NetworkUtils.getNetworkType();
            d.h(TAG, 3, "determineNetworkType - 移动网络类型: " + networkType);
            String strName = networkType.name();
            int iHashCode = strName.hashCode();
            if (iHashCode == -135077448) {
                str = "TYPE_4G";
            } else {
                if (iHashCode == -135077417) {
                    if (!strName.equals("TYPE_5G")) {
                        return 2;
                    }
                    return 3;
                }
                if (iHashCode != 1683) {
                    if (iHashCode == 1714) {
                        if (!strName.equals("5G")) {
                        }
                        return 3;
                    }
                    if (iHashCode == 75709) {
                        str = "LTE";
                    }
                    return 2;
                }
                str = "4G";
            }
            strName.equals(str);
            return 2;
        } catch (Exception e10) {
            d.h(TAG, 5, "determineNetworkType - 获取网络类型失败", e10);
            return 2;
        }
    }

    private final String generateDeviceUuid() {
        try {
            String androidID = DeviceUtils.getAndroidID();
            if (androidID != null) {
                return androidID;
            }
            return System.currentTimeMillis() + "-" + UUID.randomUUID();
        } catch (Exception e10) {
            d.h(TAG, 5, "generateDeviceUuid - 生成设备UUID失败", e10);
            return System.currentTimeMillis() + "-" + UUID.randomUUID();
        }
    }

    private final String getAppPackageName() {
        try {
            String appPackageName = AppUtils.getAppPackageName();
            return appPackageName == null ? "com.palmpay.intl" : appPackageName;
        } catch (Exception e10) {
            d.h(TAG, 5, "getAppPackageName - 获取包名失败", e10);
            return "unknown_package";
        }
    }

    private final String getAppSignatures() {
        try {
            Signature[] appSignature = AppUtils.getAppSignature();
            if (appSignature != null) {
                if (!(appSignature.length == 0)) {
                    return appSignature[0].toString();
                }
            }
            return null;
        } catch (Exception e10) {
            d.h(TAG, 5, "getAppSignatures - 获取APP签名失败", e10);
            return null;
        }
    }

    private final String getAppVersionString(UploadDeviceInfoReq.DeviceInfoBean originalInfo) {
        try {
            String appVersionName = AppUtils.getAppVersionName();
            if (appVersionName != null) {
                return appVersionName;
            }
            Integer num = originalInfo.app_version;
            String string = num != null ? num.toString() : null;
            return string == null ? "1.0.0" : string;
        } catch (Exception e10) {
            d.h(TAG, 5, "getAppVersionString - 获取APP版本失败", e10);
            return "1.0.0";
        }
    }

    private final String getDefaultDeviceBrand() {
        try {
            String manufacturer = DeviceUtils.getManufacturer();
            return manufacturer == null ? "unknown_brand" : manufacturer;
        } catch (Exception e10) {
            d.h(TAG, 5, "getDefaultDeviceBrand - 获取默认设备品牌失败", e10);
            return "unknown_brand";
        }
    }

    private final String getDefaultDeviceId() {
        try {
            String androidID = DeviceUtils.getAndroidID();
            return androidID == null ? "unknown_device_id" : androidID;
        } catch (Exception e10) {
            d.h(TAG, 5, "getDefaultDeviceId - 获取默认设备ID失败", e10);
            return "unknown_device_id";
        }
    }

    private final String getDefaultDeviceModel() {
        try {
            String model = DeviceUtils.getModel();
            return model == null ? "unknown_model" : model;
        } catch (Exception e10) {
            d.h(TAG, 5, "getDefaultDeviceModel - 获取默认设备型号失败", e10);
            return "unknown_model";
        }
    }

    private final String getDefaultImei() {
        try {
            String androidID = DeviceUtils.getAndroidID();
            return androidID == null ? "unknown_imei" : androidID;
        } catch (Exception e10) {
            d.h(TAG, 5, "getDefaultImei - 获取默认IMEI失败", e10);
            return "unknown_imei";
        }
    }

    private final String getDefaultOsVersion() {
        try {
            String str = "Android" + DeviceUtils.getSDKVersionName();
            return str == null ? "Android_unknown" : str;
        } catch (Exception e10) {
            d.h(TAG, 5, "getDefaultOsVersion - 获取默认OS版本失败", e10);
            return "Android_unknown";
        }
    }

    private final int getDeviceInfoFieldCount(c deviceInfo) {
        Field[] declaredFields;
        if (deviceInfo == null || (declaredFields = c.class.getDeclaredFields()) == null) {
            return 0;
        }
        return declaredFields.length;
    }

    private final String getExternalIp(UploadDeviceInfoReq.DeviceInfoBean originalInfo) {
        try {
            String str = originalInfo.external_ip;
            return str == null ? NetworkUtils.getIPAddress(false) : str;
        } catch (Exception e10) {
            d.h(TAG, 5, "getExternalIp - 获取外网IP失败", e10);
            return null;
        }
    }

    private final String getInternalIp() {
        try {
            return NetworkUtils.getIPAddress(true);
        } catch (Exception e10) {
            d.h(TAG, 5, "getInternalIp - 获取内网IP失败", e10);
            return null;
        }
    }

    private final String getRealLatitude(UploadDeviceInfoReq.DeviceInfoBean originalInfo) {
        try {
            LocationRecord locationRecordF = p367ya.a.d().f();
            if (locationRecordF != null && locationRecordF.getLatitude() != 9999.0d) {
                d.h(TAG, 3, "getRealLatitude - 使用Preferences中的纬度: " + locationRecordF.getLatitude());
                return String.valueOf(locationRecordF.getLatitude());
            }
            Double d2 = originalInfo.latitude;
            if (d2 == null || Intrinsics.b(d2)) {
                d.h(TAG, 3, "getRealLatitude - 没有有效的纬度信息，使用默认值");
                return IdManager.DEFAULT_VERSION_NAME;
            }
            d.h(TAG, 3, "getRealLatitude - 使用原始数据中的纬度: " + originalInfo.latitude);
            return String.valueOf(originalInfo.latitude);
        } catch (Exception e10) {
            d.h(TAG, 5, "getRealLatitude - 获取纬度失败", e10);
            return IdManager.DEFAULT_VERSION_NAME;
        }
    }

    private final String getRealLongitude(UploadDeviceInfoReq.DeviceInfoBean originalInfo) {
        try {
            LocationRecord locationRecordF = p367ya.a.d().f();
            if (locationRecordF != null && locationRecordF.getLongitude() != 9999.0d) {
                d.h(TAG, 3, "getRealLongitude - 使用Preferences中的经度: " + locationRecordF.getLongitude());
                return String.valueOf(locationRecordF.getLongitude());
            }
            Double d2 = originalInfo.longitude;
            if (d2 == null || Intrinsics.b(d2)) {
                d.h(TAG, 3, "getRealLongitude - 没有有效的经度信息，使用默认值");
                return IdManager.DEFAULT_VERSION_NAME;
            }
            d.h(TAG, 3, "getRealLongitude - 使用原始数据中的经度: " + originalInfo.longitude);
            return String.valueOf(originalInfo.longitude);
        } catch (Exception e10) {
            d.h(TAG, 5, "getRealLongitude - 获取经度失败", e10);
            return IdManager.DEFAULT_VERSION_NAME;
        }
    }

    private final String getVersionCodeString(UploadDeviceInfoReq.DeviceInfoBean originalInfo) {
        try {
            String strValueOf = String.valueOf(AppUtils.getAppVersionCode());
            if (strValueOf != null) {
                return strValueOf;
            }
            Integer num = originalInfo.app_version;
            return num != null ? num.toString() : "1";
        } catch (Exception e10) {
            d.h(TAG, 5, "getVersionCodeString - 获取版本号失败", e10);
            return "1";
        }
    }

    private final String getWifiMac(UploadDeviceInfoReq.DeviceInfoBean originalInfo) {
        try {
            String str = originalInfo.mac;
            if (str != null && str.length() != 0 && !Intrinsics.c(originalInfo.mac, "02:00:00:00:00:00")) {
                return originalInfo.mac;
            }
            String macAddress = DeviceUtils.getMacAddress();
            if (macAddress == null || macAddress.length() == 0 || Intrinsics.c(macAddress, "02:00:00:00:00:00")) {
                return null;
            }
            return macAddress;
        } catch (Exception e10) {
            d.h(TAG, 5, "getWifiMac - 获取WiFi MAC失败", e10);
            return null;
        }
    }

    private final String getWifiName(UploadDeviceInfoReq.DeviceInfoBean originalInfo) {
        WifiInfo connectWifiInfo;
        String ssid;
        try {
            String str = originalInfo.wifi;
            if (str != null && str.length() != 0) {
                return originalInfo.wifi;
            }
            if (!NetworkUtils.isWifiConnected() || (connectWifiInfo = NetworkUtils.getConnectWifiInfo()) == null || (ssid = connectWifiInfo.getSSID()) == null) {
                return null;
            }
            return y.k(ssid, "\"", "");
        } catch (Exception e10) {
            d.h(TAG, 5, "getWifiName - 获取WiFi名称失败", e10);
            return null;
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public /* synthetic */ void onHandle(Object obj, IBridgeCallback iBridgeCallback) {
        if (obj != null) {
            throw new ClassCastException();
        }
        onHandle((a) null, iBridgeCallback);
    }

    public void onHandle(@Nullable a params, @Nullable IBridgeCallback callback) {
        d.h(TAG, 4, "onHandle - 开始处理设备信息获取请求");
        try {
            c cVarBuildDeviceInfo = buildDeviceInfo();
            if (cVarBuildDeviceInfo != null) {
                d.h(TAG, 3, "onHandle - 标准化设备信息构建完成，符合API规范要求");
                BaseBridge.handleSuccess$default(this, convertToStandardizedMap(cVarBuildDeviceInfo), null, 2, null);
            } else {
                d.h(TAG, 5, "onHandle - 设备信息获取失败，返回空值");
                BaseBridge.handleSuccess$default(this, G.c(), null, 2, null);
            }
        } catch (Exception e10) {
            d.c(TAG, "onHandle - 处理设备信息获取请求时发生异常", e10);
            handleFail(e10);
        }
    }
}
