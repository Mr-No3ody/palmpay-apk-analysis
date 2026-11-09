package com.transsnet.palmpay.core.bean.cashier;

import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridgeV2;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/FlexiOneClickOpenReq;", "", CreditHandleRouterBridgeV2.ACTION_DEVICE_INFO, "Lcom/transsnet/palmpay/core/bean/cashier/FlexiOneClickOpenReq$Device;", "locationInfo", "Lcom/transsnet/palmpay/core/bean/cashier/FlexiOneClickOpenReq$LocationInfo;", "<init>", "(Lcom/transsnet/palmpay/core/bean/cashier/FlexiOneClickOpenReq$Device;Lcom/transsnet/palmpay/core/bean/cashier/FlexiOneClickOpenReq$LocationInfo;)V", "getDeviceInfo", "()Lcom/transsnet/palmpay/core/bean/cashier/FlexiOneClickOpenReq$Device;", "setDeviceInfo", "(Lcom/transsnet/palmpay/core/bean/cashier/FlexiOneClickOpenReq$Device;)V", "getLocationInfo", "()Lcom/transsnet/palmpay/core/bean/cashier/FlexiOneClickOpenReq$LocationInfo;", "setLocationInfo", "(Lcom/transsnet/palmpay/core/bean/cashier/FlexiOneClickOpenReq$LocationInfo;)V", "Device", "LocationInfo", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiOneClickOpenReq {

    @Nullable
    private Device deviceInfo;

    @Nullable
    private LocationInfo locationInfo;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0014\u0010!\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010#\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0014\u0010$\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010.\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00100R\u0016\u00101\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00100R\u0016\u00102\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u00064"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/FlexiOneClickOpenReq$Device;", "", "<init>", "()V", "os_version", "", "app_version", "", "Ljava/lang/Integer;", "cpu_architecture", "device_root", "deviceID", "imei", "is_gps_permission_opened", "is_gps_switch_opened", "is_phone_charge", "latitude", "", "Ljava/lang/Double;", "longitude", "phone_brand", "phone_electric_quantity", "phone_model", "phone_type", "screen_resolution", "sdcard_total_capacity", "", "Ljava/lang/Long;", "sdcard_used_capacity", "sim_card_status", "total_storage", "upload_node", "used_memory", "wifi", "wifi_conneted", "disk_free_total_space", "screen_brightness", "get_net_carrier", "is_it_breakout_equipment", "sim_cnt", "total_memory", "data_type", "deviceId1", "operationSystem", "uploadNode", "uploadNodeDetail", "isEquipmentBreakout", "", "Ljava/lang/Boolean;", "isMockLocation", "isSimulator", "Companion", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Device {
        public static final double DEFAULT_DOUBLE_VALUE = -1.0d;
        public static final int DEFAULT_INT_VALUE = -1;
        public static final long DEFAULT_LONG_VALUE = -1;

        @NotNull
        public static final String DEFAULT_STRING_VALUE = "-1";

        @JvmField
        @Nullable
        public String data_type;

        @JvmField
        @Nullable
        public String deviceId1;

        @JvmField
        @Nullable
        public Long disk_free_total_space;

        @JvmField
        @Nullable
        public String get_net_carrier;

        @JvmField
        @Nullable
        public Boolean isEquipmentBreakout;

        @JvmField
        @Nullable
        public Boolean isMockLocation;

        @JvmField
        @Nullable
        public Integer isSimulator;

        @JvmField
        @Nullable
        public String is_it_breakout_equipment;

        @JvmField
        @Nullable
        public Double latitude;

        @JvmField
        @Nullable
        public Double longitude;

        @JvmField
        @Nullable
        public String operationSystem;

        @JvmField
        @Nullable
        public String phone_brand;

        @JvmField
        @Nullable
        public String phone_electric_quantity;

        @JvmField
        @Nullable
        public String phone_model;

        @JvmField
        @Nullable
        public Integer phone_type;

        @JvmField
        @Nullable
        public String screen_brightness;

        @JvmField
        @Nullable
        public String screen_resolution;

        @JvmField
        @Nullable
        public Long sdcard_total_capacity;

        @JvmField
        @Nullable
        public Long sdcard_used_capacity;

        @JvmField
        @Nullable
        public Integer sim_card_status;

        @JvmField
        @Nullable
        public String sim_cnt;

        @JvmField
        @Nullable
        public String total_memory;

        @JvmField
        @Nullable
        public Long total_storage;

        @JvmField
        @Nullable
        public String uploadNode;

        @JvmField
        @Nullable
        public String uploadNodeDetail;

        @JvmField
        @Nullable
        public String upload_node;

        @JvmField
        @Nullable
        public Long used_memory;

        @JvmField
        @Nullable
        public String wifi;

        @JvmField
        @Nullable
        public Integer wifi_conneted;

        @JvmField
        @Nullable
        public String os_version = DEFAULT_STRING_VALUE;

        @JvmField
        @Nullable
        public Integer app_version = -1;

        @JvmField
        @Nullable
        public String cpu_architecture = DEFAULT_STRING_VALUE;

        @JvmField
        @Nullable
        public Integer device_root = -1;

        @JvmField
        @Nullable
        public String deviceID = DEFAULT_STRING_VALUE;

        @JvmField
        @Nullable
        public String imei = DEFAULT_STRING_VALUE;

        @JvmField
        @Nullable
        public Integer is_gps_permission_opened = -1;

        @JvmField
        @Nullable
        public Integer is_gps_switch_opened = -1;

        @JvmField
        @Nullable
        public Integer is_phone_charge = -1;

        public Device() {
            Double dValueOf = Double.valueOf(-1.0d);
            this.latitude = dValueOf;
            this.longitude = dValueOf;
            this.phone_brand = DEFAULT_STRING_VALUE;
            this.phone_electric_quantity = DEFAULT_STRING_VALUE;
            this.phone_model = DEFAULT_STRING_VALUE;
            this.phone_type = -1;
            this.screen_resolution = DEFAULT_STRING_VALUE;
            this.sdcard_total_capacity = -1L;
            this.sdcard_used_capacity = -1L;
            this.sim_card_status = -1;
            this.total_storage = -1L;
            this.upload_node = DEFAULT_STRING_VALUE;
            this.used_memory = -1L;
            this.wifi = DEFAULT_STRING_VALUE;
            this.wifi_conneted = -1;
            this.disk_free_total_space = -1L;
            this.screen_brightness = DEFAULT_STRING_VALUE;
            this.get_net_carrier = DEFAULT_STRING_VALUE;
            this.is_it_breakout_equipment = DEFAULT_STRING_VALUE;
            this.sim_cnt = DEFAULT_STRING_VALUE;
            this.total_memory = DEFAULT_STRING_VALUE;
            this.data_type = DEFAULT_STRING_VALUE;
            this.deviceId1 = DEFAULT_STRING_VALUE;
            this.operationSystem = DEFAULT_STRING_VALUE;
            this.uploadNode = DEFAULT_STRING_VALUE;
            this.uploadNodeDetail = DEFAULT_STRING_VALUE;
            this.isSimulator = -1;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/FlexiOneClickOpenReq$LocationInfo;", "", "<init>", "()V", "longitude", "", "latitude", "live", "", "Ljava/lang/Boolean;", "uploadNode", "uploadNodeDetail", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocationInfo {

        @JvmField
        @Nullable
        public String latitude;

        @JvmField
        @Nullable
        public Boolean live;

        @JvmField
        @Nullable
        public String longitude;

        @JvmField
        @Nullable
        public String uploadNode;

        @JvmField
        @Nullable
        public String uploadNodeDetail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlexiOneClickOpenReq() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Device getDeviceInfo() {
        return this.deviceInfo;
    }

    @Nullable
    public final LocationInfo getLocationInfo() {
        return this.locationInfo;
    }

    public final void setDeviceInfo(@Nullable Device device) {
        this.deviceInfo = device;
    }

    public final void setLocationInfo(@Nullable LocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    public FlexiOneClickOpenReq(@Nullable Device device, @Nullable LocationInfo locationInfo) {
        this.deviceInfo = device;
        this.locationInfo = locationInfo;
    }

    public /* synthetic */ FlexiOneClickOpenReq(Device device, LocationInfo locationInfo, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : device, (i7 & 2) != 0 ? null : locationInfo);
    }
}
