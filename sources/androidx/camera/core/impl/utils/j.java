package androidx.camera.core.impl.utils;

import androidx.camera.camera2.internal.F;
import com.facebook.imageutils.TiffUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l[] f14230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l[][] f14231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet f14232e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteOrder f14234b;

    static {
        l[] lVarArr = {new l(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 3, 4, "ImageWidth"), new l(257, 3, 4, "ImageLength"), new l("Make", 271, 2), new l("Model", 272, 2), new l("Orientation", TiffUtil.TIFF_TAG_ORIENTATION, 3), new l("XResolution", MessageEvent.EVENT_REFRESH_BANK_CARD_LIST, 5), new l("YResolution", MessageEvent.EVENT_ADD_NEW_MOBILE_WALLET, 5), new l("ResolutionUnit", 296, 3), new l("Software", 305, 2), new l("DateTime", MessageEvent.EVENT_FINISH_QUTELLER_PAY_PREVIEW_PAGE, 2), new l("YCbCrPositioning", MessageEvent.EVENT_GENIEX_BUY_BUNDLE_SUCCESS, 3), new l("SubIFDPointer", 330, 4), new l("ExifIFDPointer", 34665, 4), new l("GPSInfoIFDPointer", 34853, 4)};
        l[] lVarArr2 = {new l("ExposureTime", 33434, 5), new l("FNumber", 33437, 5), new l("ExposureProgram", 34850, 3), new l("PhotographicSensitivity", 34855, 3), new l("SensitivityType", 34864, 3), new l("ExifVersion", 36864, 2), new l("DateTimeOriginal", 36867, 2), new l("DateTimeDigitized", 36868, 2), new l("ComponentsConfiguration", 37121, 7), new l("ShutterSpeedValue", 37377, 10), new l("ApertureValue", 37378, 5), new l("BrightnessValue", 37379, 10), new l("ExposureBiasValue", 37380, 10), new l("MaxApertureValue", 37381, 5), new l("MeteringMode", 37383, 3), new l("LightSource", 37384, 3), new l("Flash", 37385, 3), new l("FocalLength", 37386, 5), new l("SubSecTime", 37520, 2), new l("SubSecTimeOriginal", 37521, 2), new l("SubSecTimeDigitized", 37522, 2), new l("FlashpixVersion", 40960, 7), new l("ColorSpace", 40961, 3), new l(40962, 3, 4, "PixelXDimension"), new l(40963, 3, 4, "PixelYDimension"), new l("InteroperabilityIFDPointer", 40965, 4), new l("FocalPlaneResolutionUnit", 41488, 3), new l("SensingMethod", 41495, 3), new l("FileSource", 41728, 7), new l("SceneType", 41729, 7), new l("CustomRendered", 41985, 3), new l("ExposureMode", 41986, 3), new l("WhiteBalance", 41987, 3), new l("SceneCaptureType", 41990, 3), new l("Contrast", 41992, 3), new l("Saturation", 41993, 3), new l("Sharpness", 41994, 3)};
        l[] lVarArr3 = {new l("GPSVersionID", 0, 1), new l("GPSLatitudeRef", 1, 2), new l(2, 5, 10, "GPSLatitude"), new l("GPSLongitudeRef", 3, 2), new l(4, 5, 10, "GPSLongitude"), new l("GPSAltitudeRef", 5, 1), new l("GPSAltitude", 6, 5), new l("GPSTimeStamp", 7, 5), new l("GPSSpeedRef", 12, 2), new l("GPSTrackRef", 14, 2), new l("GPSImgDirectionRef", 16, 2), new l("GPSDestBearingRef", 23, 2), new l("GPSDestDistanceRef", 25, 2)};
        f14230c = new l[]{new l("SubIFDPointer", 330, 4), new l("ExifIFDPointer", 34665, 4), new l("GPSInfoIFDPointer", 34853, 4), new l("InteroperabilityIFDPointer", 40965, 4)};
        f14231d = new l[][]{lVarArr, lVarArr2, lVarArr3, new l[]{new l("InteroperabilityIndex", 1, 2)}};
        f14232e = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public j(ByteOrder byteOrder, ArrayList arrayList) {
        p118hf.a.k(arrayList.size() == 4, "Malformed attributes list. Number of IFDs mismatch.");
        this.f14234b = byteOrder;
        this.f14233a = arrayList;
    }

    public final Map a(int i7) {
        p118hf.a.h(i7, 0, 4, F.c(i7, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.f14233a.get(i7);
    }
}
