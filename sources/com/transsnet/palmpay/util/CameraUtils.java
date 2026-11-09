package com.transsnet.palmpay.util;

import C0.G;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class CameraUtils {
    private static final String TAG = "CameraUtils";
    private static final String UNKNOWN = "UNKNOWN";

    private static String getAfAvailableModes(int i7) {
        if (i7 == 0) {
            return "OFF";
        }
        if (i7 == 1) {
            return "AUTO";
        }
        if (i7 == 2) {
            return "MACRO";
        }
        if (i7 == 3) {
            return "CONTINUOUS_VIDEO";
        }
        if (i7 != 4) {
            return i7 != 5 ? G.m(i7, "UNKNOWN-") : "EDOF";
        }
        return "CONTINUOUS_PICTURE";
    }

    private static String getAvailableOpticalStabilization(int i7) {
        if (i7 != 0) {
            return i7 != 1 ? G.m(i7, "UNKNOWN-") : "ON";
        }
        return "OFF";
    }

    public static CameraInfoBean getCameraInfo(Context context) {
        Size size;
        Integer num;
        Integer num2;
        Boolean bool;
        int[] iArr;
        int[] iArr2;
        Range range;
        Integer num3;
        int[] iArr3;
        Float f10;
        float[] fArr;
        Float f11;
        float[] fArr2;
        Rect rect;
        SizeF sizeF;
        CameraInfoBean cameraInfoBean = new CameraInfoBean();
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            int i7 = 0;
            for (String str : cameraManager.getCameraIdList()) {
                i7++;
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                Integer num4 = key != null ? (Integer) cameraCharacteristics.get(key) : null;
                if (num4 != null && num4.intValue() == 1) {
                    CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE;
                    if (key2 != null && (sizeF = (SizeF) cameraCharacteristics.get(key2)) != null) {
                        cameraInfoBean.setSensor_physical_size(sizeF.toString());
                    }
                    CameraCharacteristics.Key key3 = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
                    if (key3 != null && (rect = (Rect) cameraCharacteristics.get(key3)) != null) {
                        cameraInfoBean.setScale_ava_jpg_size(rect.toString());
                    }
                    CameraCharacteristics.Key key4 = CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES;
                    if (key4 != null && (fArr2 = (float[]) cameraCharacteristics.get(key4)) != null && fArr2.length != 0) {
                        cameraInfoBean.setLens_info_ava_apertures(fArr2);
                    }
                    CameraCharacteristics.Key key5 = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
                    if (key5 != null && (f11 = (Float) cameraCharacteristics.get(key5)) != null) {
                        cameraInfoBean.setScaler_ava_max_zoom(f11.floatValue());
                    }
                    CameraCharacteristics.Key key6 = CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS;
                    if (key6 != null && (fArr = (float[]) cameraCharacteristics.get(key6)) != null && fArr.length != 0) {
                        cameraInfoBean.setLens_info_ava_focal_Lengths(fArr);
                    }
                    CameraCharacteristics.Key key7 = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
                    if (key7 != null && (f10 = (Float) cameraCharacteristics.get(key7)) != null) {
                        cameraInfoBean.setMinimum_focus_distance(f10.floatValue());
                    }
                    CameraCharacteristics.Key key8 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
                    if (key8 != null && (iArr3 = (int[]) cameraCharacteristics.get(key8)) != null && iArr3.length != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int i10 : iArr3) {
                            arrayList.add(getAfAvailableModes(i10));
                        }
                        cameraInfoBean.setAf_ava_modes(arrayList);
                    }
                    CameraCharacteristics.Key key9 = CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT;
                    if (key9 != null && (num3 = (Integer) cameraCharacteristics.get(key9)) != null) {
                        cameraInfoBean.setSensor_color_filter_arrangement(getSensorInfoColorFilterArrangement(num3.intValue()));
                    }
                    CameraCharacteristics.Key key10 = CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE;
                    if (key10 != null && (range = (Range) cameraCharacteristics.get(key10)) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add((Long) range.getLower());
                        arrayList2.add((Long) range.getUpper());
                        cameraInfoBean.setSensor_exposure_time_range(arrayList2);
                    }
                    CameraCharacteristics.Key key11 = CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION;
                    if (key11 != null && (iArr2 = (int[]) cameraCharacteristics.get(key11)) != null && iArr2.length != 0) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i11 : iArr2) {
                            arrayList3.add(getAvailableOpticalStabilization(i11));
                        }
                        cameraInfoBean.setAva_optical_stabilization(arrayList3);
                    }
                    CameraCharacteristics.Key key12 = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
                    if (key12 != null && (iArr = (int[]) cameraCharacteristics.get(key12)) != null && iArr.length != 0) {
                        ArrayList arrayList4 = new ArrayList();
                        for (int i12 : iArr) {
                            arrayList4.add(getVideoStabilizationModes(i12));
                        }
                        cameraInfoBean.setVideo_stabilization_modes(arrayList4);
                    }
                    CameraCharacteristics.Key key13 = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                    if (key13 != null && (bool = (Boolean) cameraCharacteristics.get(key13)) != null) {
                        cameraInfoBean.setCamera_flash_info(bool.toString());
                    }
                    CameraCharacteristics.Key key14 = CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT;
                    if (key14 != null && (num2 = (Integer) cameraCharacteristics.get(key14)) != null) {
                        cameraInfoBean.setMax_face_count(num2.intValue());
                    }
                    CameraCharacteristics.Key key15 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
                    if (key15 != null && (num = (Integer) cameraCharacteristics.get(key15)) != null) {
                        cameraInfoBean.setCamera_hardware_level(getLevel(num));
                    }
                    CameraCharacteristics.Key key16 = CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE;
                    if (key16 != null && (size = (Size) cameraCharacteristics.get(key16)) != null) {
                        cameraInfoBean.setInfo_pixel_array_size(size.toString());
                    }
                }
            }
            cameraInfoBean.setCamera_count(i7);
            return cameraInfoBean;
        } catch (Throwable th) {
            th.getMessage();
            return cameraInfoBean;
        }
    }

    private static String getLevel(Integer num) {
        if (num == null) {
            return "UNKNOWN";
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return "LIMITED";
        }
        if (iIntValue == 1) {
            return WaiverInfo.TYPE_FULL;
        }
        if (iIntValue == 2) {
            return "LEGACY";
        }
        if (iIntValue == 3) {
            return "LEVEL_3";
        }
        if (iIntValue == 4) {
            return "EXTERNAL";
        }
        return "UNKNOWN-" + num;
    }

    public static OcCameraInfoBean getOcCameraInfo(Context context) {
        Size size;
        Integer num;
        Integer num2;
        Boolean bool;
        int[] iArr;
        int[] iArr2;
        Range range;
        Integer num3;
        int[] iArr3;
        Float f10;
        float[] fArr;
        Float f11;
        float[] fArr2;
        Rect rect;
        SizeF sizeF;
        OcCameraInfoBean ocCameraInfoBean = new OcCameraInfoBean();
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            int i7 = 0;
            for (String str : cameraManager.getCameraIdList()) {
                i7++;
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                Integer num4 = key != null ? (Integer) cameraCharacteristics.get(key) : null;
                if (num4 != null && num4.intValue() == 1) {
                    CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE;
                    if (key2 != null && (sizeF = (SizeF) cameraCharacteristics.get(key2)) != null) {
                        ocCameraInfoBean.camera_sensor_physical_size = sizeF.toString();
                    }
                    CameraCharacteristics.Key key3 = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
                    if (key3 != null && (rect = (Rect) cameraCharacteristics.get(key3)) != null) {
                        ocCameraInfoBean.scaler_available_jpeg_sizes = rect.toString();
                    }
                    CameraCharacteristics.Key key4 = CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES;
                    if (key4 != null && (fArr2 = (float[]) cameraCharacteristics.get(key4)) != null && fArr2.length != 0) {
                        ocCameraInfoBean.lens_info_available_apertures = fArr2;
                    }
                    CameraCharacteristics.Key key5 = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
                    if (key5 != null && (f11 = (Float) cameraCharacteristics.get(key5)) != null) {
                        ocCameraInfoBean.scaler_available_max_digital_zoom = f11.floatValue();
                    }
                    CameraCharacteristics.Key key6 = CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS;
                    if (key6 != null && (fArr = (float[]) cameraCharacteristics.get(key6)) != null && fArr.length != 0) {
                        ocCameraInfoBean.lens_info_available_focal_lengths = fArr;
                    }
                    CameraCharacteristics.Key key7 = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
                    if (key7 != null && (f10 = (Float) cameraCharacteristics.get(key7)) != null) {
                        ocCameraInfoBean.lens_info_minimum_focus_distance = f10.floatValue();
                    }
                    CameraCharacteristics.Key key8 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
                    if (key8 != null && (iArr3 = (int[]) cameraCharacteristics.get(key8)) != null && iArr3.length != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int i10 : iArr3) {
                            arrayList.add(getAfAvailableModes(i10));
                        }
                        ocCameraInfoBean.control_af_available_modes = arrayList;
                    }
                    CameraCharacteristics.Key key9 = CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT;
                    if (key9 != null && (num3 = (Integer) cameraCharacteristics.get(key9)) != null) {
                        ocCameraInfoBean.sensor_info_color_filter_arrangement = getSensorInfoColorFilterArrangement(num3.intValue());
                    }
                    CameraCharacteristics.Key key10 = CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE;
                    if (key10 != null && (range = (Range) cameraCharacteristics.get(key10)) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add((Long) range.getLower());
                        arrayList2.add((Long) range.getUpper());
                        ocCameraInfoBean.sensor_info_exposure_time_range = arrayList2;
                    }
                    CameraCharacteristics.Key key11 = CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION;
                    if (key11 != null && (iArr2 = (int[]) cameraCharacteristics.get(key11)) != null && iArr2.length != 0) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i11 : iArr2) {
                            arrayList3.add(getAvailableOpticalStabilization(i11));
                        }
                        ocCameraInfoBean.lens_info_available_optical_stabilization = arrayList3;
                    }
                    CameraCharacteristics.Key key12 = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
                    if (key12 != null && (iArr = (int[]) cameraCharacteristics.get(key12)) != null && iArr.length != 0) {
                        ArrayList arrayList4 = new ArrayList();
                        for (int i12 : iArr) {
                            arrayList4.add(getVideoStabilizationModes(i12));
                        }
                        ocCameraInfoBean.control_available_video_stabilization_modes = arrayList4;
                    }
                    CameraCharacteristics.Key key13 = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                    if (key13 != null && (bool = (Boolean) cameraCharacteristics.get(key13)) != null) {
                        ocCameraInfoBean.flash_info_available = bool.toString();
                    }
                    CameraCharacteristics.Key key14 = CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT;
                    if (key14 != null && (num2 = (Integer) cameraCharacteristics.get(key14)) != null) {
                        ocCameraInfoBean.camera_max_face_count = num2.intValue();
                    }
                    CameraCharacteristics.Key key15 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
                    if (key15 != null && (num = (Integer) cameraCharacteristics.get(key15)) != null) {
                        ocCameraInfoBean.camera_hardware_level = getLevel(num);
                    }
                    CameraCharacteristics.Key key16 = CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE;
                    if (key16 != null && (size = (Size) cameraCharacteristics.get(key16)) != null) {
                        ocCameraInfoBean.camera_pixel_array_size = size.toString();
                    }
                }
            }
            ocCameraInfoBean.camera_count = i7;
            return ocCameraInfoBean;
        } catch (Throwable th) {
            th.getMessage();
            return ocCameraInfoBean;
        }
    }

    private static String getSensorInfoColorFilterArrangement(int i7) {
        if (i7 == 0) {
            return "RGGB";
        }
        if (i7 == 1) {
            return "GRBG";
        }
        if (i7 == 2) {
            return "GBRG";
        }
        if (i7 != 3) {
            return i7 != 4 ? G.m(i7, "UNKNOWN-") : "RGB";
        }
        return "BGGR";
    }

    private static String getVideoStabilizationModes(int i7) {
        if (i7 != 0) {
            return i7 != 1 ? G.m(i7, "UNKNOWN-") : "ON";
        }
        return "OFF";
    }
}
