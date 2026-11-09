package com.transsnet.palmpay.core.bean.req;

import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridgeV2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u000eB\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq;", "", "batchNo", "", CreditHandleRouterBridgeV2.ACTION_DEVICE_INFO, "Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean;", "<init>", "(Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean;)V", "getBatchNo", "()Ljava/lang/String;", "getDeviceInfo", "()Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean;", "setDeviceInfo", "(Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean;)V", "DeviceInfoBean", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadDeviceInfoReq {

    @Nullable
    private final String batchNo;

    @NotNull
    private DeviceInfoBean deviceInfo;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\bG\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002lmB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010*\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010-\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010.\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010/\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00101\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u00102\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00103R\u0014\u00104\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u00105\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00103R\u0014\u00106\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010@\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010C\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010D\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010E\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010FR\u0014\u0010G\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010H\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010I\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010J\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010K\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010L\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010M\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010N\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010O\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010P\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010Q\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010R\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010S\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010T\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00103R\u0014\u0010U\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010V\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010W\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010X\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010Y\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010Z\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010[\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\\\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010]\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010^\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010_\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00103R\u0014\u0010`\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010c\u001a\u00020d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010g\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010h\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010i\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010k\u0018\u00010j8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006n"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean;", "", "<init>", "()V", "advertising_id", "", "android_id", "base_band", "base_station_no", "base_station_signal_strenth", "camera_parameters", "Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean$CameraParametersBean;", "cpu_cur_frequency", "cpu_max_frequency", "data_type", "device_language", "device_root", "", "device_sim", "external_ip", "gps_err_msg", "hours_since_last_launch", "", "imei", "is_gps_permission_opened", "is_gps_switch_opened", "is_phone_charge", "latitude", "", "Ljava/lang/Double;", "longitude", "mac", "meid", "new_imei", "os_version", "phone_brand", "phone_electric_quantity", "phone_model", "screen_density", "screen_resolution", "sdcard_total_capacity", "sdcard_used_capacity", "sim_card_status", "sim_code", "sn", "total_memory", "total_storage", "used_memory", "wifi", "wifi_conneted", "wifi_level", "Ljava/lang/Integer;", "base_station", "app_version", "build_board", "build_brand", "build_host", "build_id", "build_product", "build_tags", "build_type", "build_user", "carrier_mobile_country_code", "carrier_operator", "cpu_architecture", "cpu_hardware", "cpu_min_freq", "cpu_serial", "cpu_speed", "create_time", "Ljava/lang/Long;", "deviceID", "firebaseInstanceId", "geophysics", "gps_city", "gps_country", "gps_district", "gps_other", "gps_state", "imei2", "imsi", "login_time", "media_uuid", "phone_number", "phone_type", "sim1_phone_no", "sim2_phone_no", "sim_country_iso", "sim_lac", "sim_mcc", "sim_mnc", "sim_serial", "upload_node", "upload_node_detail", "sim_cnt", "slot_count", "applyId", "screen_brightness", "disk_free_total_space", "is_equipment_breakout", "", "deviceId1", "operationSystem", "uploadNode", "uploadNodeDetail", "appList", "", "Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean$AppInfoBean;", "CameraParametersBean", "AppInfoBean", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeviceInfoBean {

        @JvmField
        @Nullable
        public String advertising_id;

        @JvmField
        @Nullable
        public String android_id;

        @JvmField
        @Nullable
        public List<AppInfoBean> appList;

        @JvmField
        @Nullable
        public Integer app_version;

        @JvmField
        @Nullable
        public String applyId;

        @JvmField
        @Nullable
        public String base_band;

        @JvmField
        @Nullable
        public String base_station;

        @JvmField
        @Nullable
        public String base_station_no;

        @JvmField
        @Nullable
        public String base_station_signal_strenth;

        @JvmField
        @Nullable
        public String build_board;

        @JvmField
        @Nullable
        public String build_brand;

        @JvmField
        @Nullable
        public String build_host;

        @JvmField
        @Nullable
        public String build_id;

        @JvmField
        @Nullable
        public String build_product;

        @JvmField
        @Nullable
        public String build_tags;

        @JvmField
        @Nullable
        public String build_type;

        @JvmField
        @Nullable
        public String build_user;

        @JvmField
        @Nullable
        public CameraParametersBean camera_parameters;

        @JvmField
        @Nullable
        public String carrier_mobile_country_code;

        @JvmField
        @Nullable
        public String carrier_operator;

        @JvmField
        @Nullable
        public String cpu_architecture;

        @JvmField
        @Nullable
        public String cpu_cur_frequency;

        @JvmField
        @Nullable
        public String cpu_hardware;

        @JvmField
        @Nullable
        public String cpu_max_frequency;

        @JvmField
        @Nullable
        public String cpu_min_freq;

        @JvmField
        @Nullable
        public String cpu_serial;

        @JvmField
        @Nullable
        public String cpu_speed;

        @JvmField
        @Nullable
        public Long create_time;

        @JvmField
        @Nullable
        public String data_type;

        @JvmField
        @Nullable
        public String deviceID;

        @JvmField
        @Nullable
        public String deviceId1;

        @JvmField
        @Nullable
        public String device_language;

        @JvmField
        public int device_root;

        @JvmField
        public int device_sim;

        @JvmField
        @Nullable
        public String disk_free_total_space;

        @JvmField
        @Nullable
        public String external_ip;

        @JvmField
        @Nullable
        public String firebaseInstanceId;

        @JvmField
        @Nullable
        public String geophysics;

        @JvmField
        @Nullable
        public String gps_city;

        @JvmField
        @Nullable
        public String gps_country;

        @JvmField
        @Nullable
        public String gps_district;

        @JvmField
        @Nullable
        public String gps_err_msg;

        @JvmField
        @Nullable
        public String gps_other;

        @JvmField
        @Nullable
        public String gps_state;

        @JvmField
        public long hours_since_last_launch;

        @JvmField
        @Nullable
        public String imei;

        @JvmField
        @Nullable
        public String imei2;

        @JvmField
        @Nullable
        public String imsi;

        @JvmField
        public boolean is_equipment_breakout;

        @JvmField
        public int is_gps_permission_opened;

        @JvmField
        public int is_gps_switch_opened;

        @JvmField
        public int is_phone_charge;

        @JvmField
        @Nullable
        public Double latitude;

        @JvmField
        @Nullable
        public String login_time;

        @JvmField
        @Nullable
        public Double longitude;

        @JvmField
        @Nullable
        public String mac;

        @JvmField
        @Nullable
        public String media_uuid;

        @JvmField
        @Nullable
        public String meid;

        @JvmField
        @Nullable
        public String new_imei;

        @JvmField
        @Nullable
        public String os_version;

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
        public String phone_number;

        @JvmField
        @Nullable
        public Integer phone_type;

        @JvmField
        @Nullable
        public String screen_brightness;

        @JvmField
        @Nullable
        public String screen_density;

        @JvmField
        @Nullable
        public String screen_resolution;

        @JvmField
        public long sdcard_total_capacity;

        @JvmField
        public long sdcard_used_capacity;

        @JvmField
        @Nullable
        public String sim1_phone_no;

        @JvmField
        @Nullable
        public String sim2_phone_no;

        @JvmField
        public int sim_card_status;

        @JvmField
        @Nullable
        public String sim_cnt;

        @JvmField
        @Nullable
        public String sim_code;

        @JvmField
        @Nullable
        public String sim_country_iso;

        @JvmField
        @Nullable
        public String sim_lac;

        @JvmField
        @Nullable
        public String sim_mcc;

        @JvmField
        @Nullable
        public String sim_mnc;

        @JvmField
        @Nullable
        public String sim_serial;

        @JvmField
        @Nullable
        public Integer slot_count;

        @JvmField
        @Nullable
        public String sn;

        @JvmField
        public long total_memory;

        @JvmField
        public long total_storage;

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
        public String upload_node_detail;

        @JvmField
        public long used_memory;

        @JvmField
        @Nullable
        public String wifi;

        @JvmField
        public int wifi_conneted = -1;

        @JvmField
        @Nullable
        public Integer wifi_level = -1;

        @JvmField
        @Nullable
        public final String operationSystem = "Android";

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean$AppInfoBean;", "", "app_name", "", "app_version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AppInfoBean {

            @JvmField
            @Nullable
            public String app_name;

            @JvmField
            @Nullable
            public String app_version;

            /* JADX WARN: Multi-variable type inference failed */
            public AppInfoBean() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public AppInfoBean(@Nullable String str, @Nullable String str2) {
                this.app_name = str;
                this.app_version = str2;
            }

            public /* synthetic */ AppInfoBean(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
                this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/UploadDeviceInfoReq$DeviceInfoBean$CameraParametersBean;", "", "<init>", "()V", "camera_count", "", "camera_hardware_level", "", "info_pixel_array_size", "max_face_count", "scaler_ava_max_zoom", "", "sensor_physical_size", "lens_info_ava_focal_Lengths", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CameraParametersBean {

            @JvmField
            public int camera_count;

            @JvmField
            @Nullable
            public String camera_hardware_level;

            @JvmField
            @Nullable
            public String info_pixel_array_size;

            @JvmField
            @Nullable
            public List<Float> lens_info_ava_focal_Lengths;

            @JvmField
            public int max_face_count;

            @JvmField
            public float scaler_ava_max_zoom;

            @JvmField
            @Nullable
            public String sensor_physical_size;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UploadDeviceInfoReq() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final String getBatchNo() {
        return this.batchNo;
    }

    @NotNull
    public final DeviceInfoBean getDeviceInfo() {
        return this.deviceInfo;
    }

    public final void setDeviceInfo(@NotNull DeviceInfoBean deviceInfoBean) {
        Intrinsics.checkNotNullParameter(deviceInfoBean, "<set-?>");
        this.deviceInfo = deviceInfoBean;
    }

    public UploadDeviceInfoReq(@Nullable String str, @NotNull DeviceInfoBean deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.batchNo = str;
        this.deviceInfo = deviceInfo;
    }

    public /* synthetic */ UploadDeviceInfoReq(String str, DeviceInfoBean deviceInfoBean, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? new DeviceInfoBean() : deviceInfoBean);
    }
}
