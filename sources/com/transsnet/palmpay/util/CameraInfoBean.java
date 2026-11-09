package com.transsnet.palmpay.util;

import androidx.camera.video.u;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CameraInfoBean {
    private List<String> af_ava_modes;
    private List<String> ava_optical_stabilization;
    private int camera_count;
    private String camera_flash_info;
    private String camera_hardware_level;
    private String info_pixel_array_size;
    private float[] lens_info_ava_apertures;
    private float[] lens_info_ava_focal_Lengths;
    private int max_face_count;
    private float minimum_focus_distance;
    private String scale_ava_jpg_size;
    private float scaler_ava_max_zoom;
    private String sensor_color_filter_arrangement;
    private List<Long> sensor_exposure_time_range;
    private String sensor_physical_size;
    private List<String> video_stabilization_modes;

    public List<String> getAva_optical_stabilization() {
        return this.ava_optical_stabilization;
    }

    public int getCamera_count() {
        return this.camera_count;
    }

    public String getCamera_hardware_level() {
        return this.camera_hardware_level;
    }

    public String getInfo_pixel_array_size() {
        return this.info_pixel_array_size;
    }

    public float[] getLens_info_ava_apertures() {
        return this.lens_info_ava_apertures;
    }

    public float[] getLens_info_ava_focal_Lengths() {
        return this.lens_info_ava_focal_Lengths;
    }

    public int getMax_face_count() {
        return this.max_face_count;
    }

    public float getMinimum_focus_distance() {
        return this.minimum_focus_distance;
    }

    public String getScale_ava_jpg_size() {
        return this.scale_ava_jpg_size;
    }

    public float getScaler_ava_max_zoom() {
        return this.scaler_ava_max_zoom;
    }

    public String getSensor_color_filter_arrangement() {
        return this.sensor_color_filter_arrangement;
    }

    public List<Long> getSensor_exposure_time_range() {
        return this.sensor_exposure_time_range;
    }

    public String getSensor_physical_size() {
        return this.sensor_physical_size;
    }

    public List<String> getVideo_stabilization_modes() {
        return this.video_stabilization_modes;
    }

    public String isCamera_flash_info() {
        return this.camera_flash_info;
    }

    public void setAf_ava_modes(List<String> list) {
        this.af_ava_modes = list;
    }

    public void setAva_optical_stabilization(List<String> list) {
        this.ava_optical_stabilization = list;
    }

    public void setCamera_count(int i7) {
        this.camera_count = i7;
    }

    public void setCamera_flash_info(String str) {
        this.camera_flash_info = str;
    }

    public void setCamera_hardware_level(String str) {
        this.camera_hardware_level = str;
    }

    public void setInfo_pixel_array_size(String str) {
        this.info_pixel_array_size = str;
    }

    public void setLens_info_ava_apertures(float[] fArr) {
        this.lens_info_ava_apertures = fArr;
    }

    public void setLens_info_ava_focal_Lengths(float[] fArr) {
        this.lens_info_ava_focal_Lengths = fArr;
    }

    public void setMax_face_count(int i7) {
        this.max_face_count = i7;
    }

    public void setMinimum_focus_distance(float f10) {
        this.minimum_focus_distance = f10;
    }

    public void setScale_ava_jpg_size(String str) {
        this.scale_ava_jpg_size = str;
    }

    public void setScaler_ava_max_zoom(float f10) {
        this.scaler_ava_max_zoom = f10;
    }

    public void setSensor_color_filter_arrangement(String str) {
        this.sensor_color_filter_arrangement = str;
    }

    public void setSensor_exposure_time_range(List<Long> list) {
        this.sensor_exposure_time_range = list;
    }

    public void setSensor_physical_size(String str) {
        this.sensor_physical_size = str;
    }

    public void setVideo_stabilization_modes(List<String> list) {
        this.video_stabilization_modes = list;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CameraInfoBean {camera_count='");
        sb2.append(this.camera_count);
        sb2.append("', sensor_physical_size='");
        sb2.append(this.sensor_physical_size);
        sb2.append("', scale_ava_jpg_size='");
        sb2.append(this.scale_ava_jpg_size);
        sb2.append("', lens_info_ava_apertures=");
        sb2.append(this.lens_info_ava_apertures);
        sb2.append(", scaler_ava_max_zoom='");
        sb2.append(this.scaler_ava_max_zoom);
        sb2.append("', lens_info_ava_focal_Lengths='");
        sb2.append(this.lens_info_ava_focal_Lengths);
        sb2.append("', minimum_focus_distance='");
        sb2.append(this.minimum_focus_distance);
        sb2.append("', af_ava_modes=");
        sb2.append(this.af_ava_modes);
        sb2.append(", sensor_color_filter_arrangement=");
        sb2.append(this.sensor_color_filter_arrangement);
        sb2.append(", sensor_exposure_time_range=");
        sb2.append(this.sensor_exposure_time_range);
        sb2.append(", ava_optical_stabilization=");
        sb2.append(this.ava_optical_stabilization);
        sb2.append(", video_stabilization_modes=");
        sb2.append(this.video_stabilization_modes);
        sb2.append(", camera_flash_info=");
        sb2.append(this.camera_flash_info);
        sb2.append(", max_face_count=");
        sb2.append(this.max_face_count);
        sb2.append(",camera_hardware_level=");
        sb2.append(this.camera_hardware_level);
        sb2.append(",info_pixel_array_size=");
        return u.p(sb2, this.info_pixel_array_size, '}');
    }

    public List<String> va_modes() {
        return this.af_ava_modes;
    }
}
