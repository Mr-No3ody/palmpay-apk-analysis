package com.transsnet.palmpay.util;

import androidx.camera.video.u;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class OcCameraInfoBean {
    public List<String> control_af_available_modes;
    public List<String> control_available_video_stabilization_modes;
    public String flash_info_available;
    public float[] lens_info_available_apertures;
    public float[] lens_info_available_focal_lengths;
    public List<String> lens_info_available_optical_stabilization;
    public float lens_info_minimum_focus_distance;
    public String scaler_available_jpeg_sizes;
    public float scaler_available_max_digital_zoom;
    public String sensor_info_color_filter_arrangement;
    public List<Long> sensor_info_exposure_time_range;
    public String camera_focal_Lengths = null;
    public String camera_hardware_level;
    public String info_supported_hardware_level = this.camera_hardware_level;
    public int camera_count;
    public int request_available_capabilities_logical_multi_camera = this.camera_count;
    public String camera_sensor_physical_size;
    public String sensor_info_physical_size = this.camera_sensor_physical_size;
    public String camera_pixel_array_size;
    public String sensor_info_pixel_array_size = this.camera_pixel_array_size;
    public int camera_max_face_count;
    public int statistics_info_max_face_count = this.camera_max_face_count;

    public void setInfo_pixel_array_size(String str) {
        this.camera_pixel_array_size = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CameraInfoBean {camera_count='");
        sb2.append(this.camera_count);
        sb2.append("', sensor_physical_size='");
        sb2.append(this.camera_sensor_physical_size);
        sb2.append("', scale_ava_jpg_size='");
        sb2.append(this.scaler_available_jpeg_sizes);
        sb2.append("', lens_info_ava_apertures=");
        sb2.append(this.lens_info_available_apertures);
        sb2.append(", scaler_ava_max_zoom='");
        sb2.append(this.scaler_available_max_digital_zoom);
        sb2.append("', lens_info_ava_focal_Lengths='");
        sb2.append(this.lens_info_available_focal_lengths);
        sb2.append("', minimum_focus_distance='");
        sb2.append(this.lens_info_minimum_focus_distance);
        sb2.append("', af_ava_modes=");
        sb2.append(this.control_af_available_modes);
        sb2.append(", sensor_color_filter_arrangement=");
        sb2.append(this.sensor_info_color_filter_arrangement);
        sb2.append(", sensor_exposure_time_range=");
        sb2.append(this.sensor_info_exposure_time_range);
        sb2.append(", ava_optical_stabilization=");
        sb2.append(this.lens_info_available_optical_stabilization);
        sb2.append(", video_stabilization_modes=");
        sb2.append(this.control_available_video_stabilization_modes);
        sb2.append(", camera_flash_info=");
        sb2.append(this.flash_info_available);
        sb2.append(", max_face_count=");
        sb2.append(this.camera_max_face_count);
        sb2.append(",camera_hardware_level=");
        sb2.append(this.camera_hardware_level);
        sb2.append(",info_pixel_array_size=");
        return u.p(sb2, this.camera_pixel_array_size, '}');
    }
}
