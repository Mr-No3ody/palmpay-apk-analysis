package com.transsnet.palmpay.credit.bean.req;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class OcUploadDeviceInfo {
    public String accelerometer_sensor_list;
    public List<AppInfo> appInfo;
    public String battery_charge_plug;
    public String battery_charge_status;
    public String battery_level;
    public String blue_tooth_address;
    public String blue_tooth_name;
    public int blue_tooth_type;
    public int bond_state;
    public long boot_times;
    public String carrier_mobile_country_code;
    public String code_name;
    public String cpu_architecture;
    public int cpu_cur_freq;
    public long cpu_max_freq;
    public long cpu_min_freq;
    public String cpu_serial;
    public long disk_free_space;
    public long disk_total_space;
    public String eth_ip;
    public String gravity_sensor_list;
    public String gyro_scope_sensor_list;
    public String has_aoa;
    public String has_bluetooth;
    public String has_cellular;
    public String has_gps;
    public String has_nfc;
    public String has_nfc_host;
    public String has_otg;
    public String has_telephony;
    public String has_wi_fi_direct;
    public String has_wifi;
    public String heap_size;
    public String imsi;
    public String incremental;
    public String internet_type;
    public int is_bounded;
    public int is_bounding;
    public String is_conn_vpn;
    public int is_current_wifi;
    public String is_emulator;
    public String is_open_gps;
    public String is_root;
    public String light_sensor_list;
    public String linear_acceleration_sensor_list;
    public String magnetic_sensor_list;
    public String memory_total;
    public int mobile_dbm;
    public String orientation_sensor_list;
    public int os_version_int;
    public String phone_number;
    public int phone_type;
    public String pressure_sensor_list;
    public String proximity_sensor_list;
    public String radio_version;
    public String screen_brightness;
    public String screen_manual_mode;
    public int sim_cid;
    public int sim_lac;
    public String sim_serial;
    public int sim_state;
    public int sim_strength;
    public String sim_timezone;
    public String total_photos;
    public String user;
    public String wifi_bssid;
    public String wifi_capabilities;
    public int wifi_frequency;
    public int wifi_level;
    public String wifi_ssid;

    public class AppInfo {
        public String app_name;
        public String app_version;

        public AppInfo(String str, String str2) {
            this.app_name = str;
            this.app_version = str2;
        }
    }
}
