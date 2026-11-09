package p242q0;

import C0.G;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.camera.core.impl.utils.c;
import com.facebook.imageutils.TiffUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.common.base.Ascii;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final d f41384U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final d[][] f41385V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final d[] f41386W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final HashMap[] f41387X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final HashMap[] f41388Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final HashSet f41389Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final HashMap f41390a0;
    public static final Charset b0;
    public static final byte[] c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final byte[] f41391d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Pattern f41392e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Pattern f41393f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Pattern f41394g0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDescriptor f41402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AssetManager.AssetInputStream f41403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap[] f41405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f41406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteOrder f41407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f41412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f41413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41414n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41415o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f41416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f41417q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f41418r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f41419s;
    public static final boolean t = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final List f41395u = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final List f41396v = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f41397w = {8, 8, 8};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f41398x = {8};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f41399y = {-1, -40, -1};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f41400z = {102, 116, 121, 112};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final byte[] f41364A = {109, 105, 102, 49};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final byte[] f41365B = {104, 101, 105, 99};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final byte[] f41366C = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final byte[] f41367D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final byte[] f41368E = {-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final byte[] f41369F = {101, 88, 73, 102};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final byte[] f41370G = {73, 72, 68, 82};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final byte[] f41371H = {73, 69, 78, 68};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final byte[] f41372I = {82, 73, 70, 70};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final byte[] f41373J = {87, 69, 66, 80};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final byte[] f41374K = {69, 88, 73, 70};

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final byte[] f41375L = {-99, 1, 42};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final byte[] f41376M = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final byte[] f41377N = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final byte[] f41378O = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final byte[] f41379P = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final byte[] f41380Q = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String[] f41381R = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int[] f41382S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final byte[] f41383T = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(MessageEvent.EVENT_NOTIFICATION_ARRIVE, 3, 4, "StripOffsets"), new d("Orientation", TiffUtil.TIFF_TAG_ORIENTATION, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", MessageEvent.EVENT_REFRESH_BANK_CARD_LIST, 5), new d("YResolution", MessageEvent.EVENT_ADD_NEW_MOBILE_WALLET, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", MessageEvent.EVENT_FINISH_QUTELLER_PAY_PREVIEW_PAGE, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", MessageEvent.EVENT_USER_AGENT_UPDATE, 4), new d("JPEGInterchangeFormatLength", MessageEvent.EVENT_GO_TO_HOME_PALM_ZONE_TAB, 4), new d("YCbCrCoefficients", MessageEvent.EVENT_SET_AUTO_LOGOUT_COMPLETE, 5), new d("YCbCrSubSampling", MessageEvent.EVENT_CREATE_SAVINGS_BREAK, 3), new d("YCbCrPositioning", MessageEvent.EVENT_GENIEX_BUY_BUNDLE_SUCCESS, 3), new d("ReferenceBlackWhite", MessageEvent.EVENT_GENIEX_RECHARGE_BALANCE_SUCCESS, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(MessageEvent.EVENT_NOTIFICATION_ARRIVE, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", TiffUtil.TIFF_TAG_ORIENTATION, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", MessageEvent.EVENT_REFRESH_BANK_CARD_LIST, 5), new d("YResolution", MessageEvent.EVENT_ADD_NEW_MOBILE_WALLET, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", MessageEvent.EVENT_FINISH_QUTELLER_PAY_PREVIEW_PAGE, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", MessageEvent.EVENT_USER_AGENT_UPDATE, 4), new d("JPEGInterchangeFormatLength", MessageEvent.EVENT_GO_TO_HOME_PALM_ZONE_TAB, 4), new d("YCbCrCoefficients", MessageEvent.EVENT_SET_AUTO_LOGOUT_COMPLETE, 5), new d("YCbCrSubSampling", MessageEvent.EVENT_CREATE_SAVINGS_BREAK, 3), new d("YCbCrPositioning", MessageEvent.EVENT_GENIEX_BUY_BUNDLE_SUCCESS, 3), new d("ReferenceBlackWhite", MessageEvent.EVENT_GENIEX_RECHARGE_BALANCE_SUCCESS, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        f41384U = new d("StripOffsets", MessageEvent.EVENT_NOTIFICATION_ARRIVE, 3);
        f41385V = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f41386W = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f41387X = new HashMap[10];
        f41388Y = new HashMap[10];
        f41389Z = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f41390a0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        b0 = charsetForName;
        c0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f41391d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i7 = 0;
        while (true) {
            d[][] dVarArr6 = f41385V;
            if (i7 >= dVarArr6.length) {
                HashMap map = f41390a0;
                d[] dVarArr7 = f41386W;
                map.put(Integer.valueOf(dVarArr7[0].f41358a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f41358a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f41358a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f41358a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f41358a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f41358a), 8);
                Pattern.compile(".*[1-9].*");
                f41392e0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f41393f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f41394g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f41387X[i7] = new HashMap();
            f41388Y[i7] = new HashMap();
            for (d dVar : dVarArr6[i7]) {
                f41387X[i7].put(Integer.valueOf(dVar.f41358a), dVar);
                f41388Y[i7].put(dVar.f41359b, dVar);
            }
            i7++;
        }
    }

    public g(String str) throws Throwable {
        boolean z3;
        d[][] dVarArr = f41385V;
        this.f41405e = new HashMap[dVarArr.length];
        this.f41406f = new HashSet(dVarArr.length);
        this.f41407g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f41403c = null;
        this.f41401a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    h.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z3 = true;
                } catch (Exception unused) {
                    z3 = false;
                }
                if (z3) {
                    this.f41402b = fileInputStream2.getFD();
                } else {
                    this.f41402b = null;
                }
                t(fileInputStream2);
                d.h(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                d.h(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d10 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d11 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d10 / 60.0d) + d2;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d11;
            }
            return -d11;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = b0;
                sb2.append(new String(bArr, charset));
                sb2.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb2.toString());
            }
            int i7 = bVar.readInt();
            cVar.write(bArr3);
            cVar.b(i7);
            if (i7 % 2 == 1) {
                i7++;
            }
            d.k(bVar, cVar, i7);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static Pair q(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairQ = q(strArrSplit[0]);
            if (((Integer) pairQ.first).intValue() == 2) {
                return pairQ;
            }
            for (int i7 = 1; i7 < strArrSplit.length; i7++) {
                Pair pairQ2 = q(strArrSplit[i7]);
                int iIntValue = (((Integer) pairQ2.first).equals(pairQ.first) || ((Integer) pairQ2.second).equals(pairQ.first)) ? ((Integer) pairQ.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairQ.second).intValue() == -1 || !(((Integer) pairQ2.first).equals(pairQ.second) || ((Integer) pairQ2.second).equals(pairQ.second))) ? -1 : ((Integer) pairQ.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairQ = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairQ = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairQ;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j6 = Long.parseLong(str);
                    if (j6 < 0 || j6 > 65535) {
                        return j6 < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j10 = (long) Double.parseDouble(strArrSplit2[0]);
                long j11 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j10 >= 0 && j11 >= 0) {
                    if (j10 <= 2147483647L && j11 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static ByteOrder w(b bVar) throws IOException {
        short s3 = bVar.readShort();
        if (s3 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s3 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s3));
    }

    public final void A(int i7, String str, String str2) {
        HashMap[] mapArr = this.f41405e;
        if (mapArr[i7].isEmpty() || mapArr[i7].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i7];
        map.put(str2, map.get(str));
        mapArr[i7].remove(str);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0154  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[Catch: all -> 0x010c, Exception -> 0x010f, TryCatch #19 {Exception -> 0x010f, all -> 0x010c, blocks: (B:80:0x00f8, B:82:0x00fc, B:89:0x011a, B:88:0x0112), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0112 A[Catch: all -> 0x010c, Exception -> 0x010f, TryCatch #19 {Exception -> 0x010f, all -> 0x010c, blocks: (B:80:0x00f8, B:82:0x00fc, B:89:0x011a, B:88:0x0112), top: B:129:0x00f8 }] */
    public final void B() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream2;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream3;
        Object obj;
        int i7 = this.f41404d;
        if (i7 != 4 && i7 != 13 && i7 != 14) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f41402b == null && this.f41401a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f41408h && this.f41409i && !this.f41410j) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        int i10 = this.f41414n;
        Closeable closeable = null;
        this.f41413m = (i10 == 6 || i10 == 7) ? o() : null;
        try {
            File fileCreateTempFile = File.createTempFile(OfflineConstant.TEMP_DIR_NAME, "tmp");
            if (this.f41401a != null) {
                fileInputStream = new FileInputStream(this.f41401a);
            } else {
                h.c(this.f41402b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f41402b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    d.j(fileInputStream, fileOutputStream);
                    d.h(fileInputStream);
                    d.h(fileOutputStream);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.f41401a != null) {
                                        fileOutputStream2 = new FileOutputStream(this.f41401a);
                                    } else {
                                        h.c(this.f41402b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream2 = new FileOutputStream(this.f41402b);
                                    }
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                                            try {
                                                int i11 = this.f41404d;
                                                if (i11 == 4) {
                                                    C(bufferedInputStream, bufferedOutputStream);
                                                } else if (i11 == 13) {
                                                    D(bufferedInputStream, bufferedOutputStream);
                                                } else if (i11 == 14) {
                                                    E(bufferedInputStream, bufferedOutputStream);
                                                }
                                                d.h(bufferedInputStream);
                                                d.h(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.f41413m = null;
                                            } catch (Exception e10) {
                                                e = e10;
                                                closeable = fileInputStream3;
                                                try {
                                                    try {
                                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                        try {
                                                            if (this.f41401a == null) {
                                                                h.c(this.f41402b, 0L, OsConstants.SEEK_SET);
                                                                fileOutputStream3 = new FileOutputStream(this.f41402b);
                                                            } else {
                                                                fileOutputStream3 = new FileOutputStream(this.f41401a);
                                                            }
                                                            fileOutputStream2 = fileOutputStream3;
                                                            d.j(fileInputStream2, fileOutputStream2);
                                                            d.h(fileInputStream2);
                                                            d.h(fileOutputStream2);
                                                            throw new IOException("Failed to save new file", e);
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            closeable = fileInputStream2;
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            closeable = fileInputStream2;
                                                            d.h(closeable);
                                                            d.h(fileOutputStream2);
                                                            throw th;
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            closeable = bufferedInputStream;
                                            d.h(closeable);
                                            d.h(0);
                                            if (0 == 0) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e14) {
                                        e = e14;
                                        obj = null;
                                        closeable = fileInputStream3;
                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                        if (this.f41401a == null) {
                                            h.c(this.f41402b, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream3 = new FileOutputStream(this.f41402b);
                                        } else {
                                            fileOutputStream3 = new FileOutputStream(this.f41401a);
                                        }
                                        fileOutputStream2 = fileOutputStream3;
                                        d.j(fileInputStream2, fileOutputStream2);
                                        d.h(fileInputStream2);
                                        d.h(fileOutputStream2);
                                        throw new IOException("Failed to save new file", e);
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    fileOutputStream2 = null;
                                    obj = null;
                                }
                            } catch (Exception e16) {
                                e = e16;
                                fileOutputStream2 = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            d.h(closeable);
                            d.h(0);
                            if (0 == 0) {
                                fileCreateTempFile.delete();
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception e17) {
                    e = e17;
                    closeable = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th6) {
                        th = th6;
                        d.h(closeable);
                        d.h(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    closeable = fileInputStream;
                    d.h(closeable);
                    d.h(fileOutputStream);
                    throw th;
                }
            } catch (Exception e18) {
                e = e18;
                fileOutputStream = null;
            } catch (Throwable th8) {
                th = th8;
                fileOutputStream = null;
            }
        } catch (Exception e19) {
            e = e19;
            fileOutputStream = null;
        } catch (Throwable th9) {
            th = th9;
            fileOutputStream = null;
        }
    }

    public final void C(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-40);
        String strD = d("Xmp");
        HashMap[] mapArr = this.f41405e;
        c cVar2 = (strD == null || !this.f41419s) ? null : (c) mapArr[0].remove("Xmp");
        cVar.a(-1);
        cVar.a(-31);
        K(cVar);
        if (cVar2 != null) {
            mapArr[0].put("Xmp", cVar2);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b7 = bVar.readByte();
            if (b7 == -39 || b7 == -38) {
                cVar.a(-1);
                cVar.a(b7);
                d.j(bVar, cVar);
                return;
            }
            if (b7 != -31) {
                cVar.a(-1);
                cVar.a(b7);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.c((short) unsignedShort);
                int i7 = unsignedShort - 2;
                if (i7 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i7 > 0) {
                    int i10 = bVar.read(bArr, 0, Math.min(i7, 4096));
                    if (i10 < 0) {
                        break;
                    }
                    cVar.write(bArr, 0, i10);
                    i7 -= i10;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int i11 = unsignedShort2 - 2;
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i11 >= 6) {
                    if (bVar.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, c0)) {
                        bVar.a(unsignedShort2 - 8);
                    }
                }
                cVar.a(-1);
                cVar.a(b7);
                cVar.c((short) unsignedShort2);
                if (i11 >= 6) {
                    i11 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i11 > 0) {
                    int i12 = bVar.read(bArr, 0, Math.min(i11, 4096));
                    if (i12 < 0) {
                        break;
                    }
                    cVar.write(bArr, 0, i12);
                    i11 -= i12;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        b bVar = new b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(bufferedOutputStream, byteOrder);
        byte[] bArr = f41368E;
        d.k(bVar, cVar, bArr.length);
        int i7 = this.f41415o;
        if (i7 == 0) {
            int i10 = bVar.readInt();
            cVar.b(i10);
            d.k(bVar, cVar, i10 + 8);
        } else {
            d.k(bVar, cVar, (i7 - bArr.length) - 8);
            bVar.a(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                K(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f14148b).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.b((int) crc32.getValue());
                d.h(byteArrayOutputStream2);
                d.j(bVar, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                d.h(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        ?? r3;
        int i7;
        int i10;
        boolean z3;
        int i11;
        int i12;
        ByteArrayOutputStream byteArrayOutputStream;
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(bufferedInputStream, byteOrder);
        c cVar = new c(bufferedOutputStream, byteOrder);
        byte[] bArr = f41372I;
        d.k(bVar, cVar, bArr.length);
        byte[] bArr2 = f41373J;
        bVar.a(bArr2.length + 4);
        ?? r10 = 0;
        r10 = 0;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    r3 = this.f41415o;
                    try {
                        try {
                            if (r3 == 0) {
                                byte[] bArr3 = new byte[4];
                                if (bVar.read(bArr3) != 4) {
                                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                                }
                                byte[] bArr4 = f41376M;
                                boolean zEquals = Arrays.equals(bArr3, bArr4);
                                byte[] bArr5 = f41378O;
                                byte[] bArr6 = f41377N;
                                if (!zEquals) {
                                    if (Arrays.equals(bArr3, bArr5) || Arrays.equals(bArr3, bArr6)) {
                                        int i13 = bVar.readInt();
                                        int i14 = i13 % 2 == 1 ? i13 + 1 : i13;
                                        byte[] bArr7 = new byte[3];
                                        boolean zEquals2 = Arrays.equals(bArr3, bArr5);
                                        boolean z8 = true;
                                        byte[] bArr8 = f41375L;
                                        if (zEquals2) {
                                            bVar.read(bArr7);
                                            byte[] bArr9 = new byte[3];
                                            int i15 = i14;
                                            if (bVar.read(bArr9) != 3 || !Arrays.equals(bArr8, bArr9)) {
                                                throw new IOException("Encountered error while checking VP8 signature");
                                            }
                                            i7 = bVar.readInt();
                                            i10 = (i7 << 18) >> 18;
                                            i11 = i15 - 10;
                                            i12 = (i7 << 2) >> 18;
                                            z3 = false;
                                        } else {
                                            int i16 = i14;
                                            if (!Arrays.equals(bArr3, bArr6)) {
                                                i7 = 0;
                                                i10 = 0;
                                                z3 = false;
                                                i11 = i16;
                                                i12 = 0;
                                            } else {
                                                if (bVar.readByte() != 47) {
                                                    throw new IOException("Encountered error while checking VP8L signature");
                                                }
                                                i7 = bVar.readInt();
                                                int i17 = (i7 & 16383) + 1;
                                                int i18 = ((268419072 & i7) >>> 14) + 1;
                                                if ((i7 & 268435456) == 0) {
                                                    z8 = false;
                                                }
                                                i10 = i17;
                                                i11 = i16 - 5;
                                                i12 = i18;
                                                z3 = z8;
                                            }
                                        }
                                        cVar2.write(bArr4);
                                        cVar2.b(10);
                                        byte[] bArr10 = new byte[10];
                                        if (z3) {
                                            bArr10[0] = (byte) (bArr10[0] | Ascii.DLE);
                                        }
                                        bArr10[0] = (byte) (bArr10[0] | 8);
                                        int i19 = i10 - 1;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        int i20 = i12 - 1;
                                        try {
                                            bArr10[4] = (byte) i19;
                                            bArr10[5] = (byte) (i19 >> 8);
                                            bArr10[6] = (byte) (i19 >> 16);
                                            bArr10[7] = (byte) i20;
                                            bArr10[8] = (byte) (i20 >> 8);
                                            bArr10[9] = (byte) (i20 >> 16);
                                            cVar2.write(bArr10);
                                            cVar2.write(bArr3);
                                            cVar2.b(i13);
                                            try {
                                                if (Arrays.equals(bArr3, bArr5)) {
                                                    cVar2.write(bArr7);
                                                    cVar2.write(bArr8);
                                                    cVar2.b(i7);
                                                } else {
                                                    if (Arrays.equals(bArr3, bArr6)) {
                                                        cVar2.write(47);
                                                        cVar2.b(i7);
                                                    }
                                                    d.k(bVar, cVar2, i11);
                                                    K(cVar2);
                                                }
                                                d.k(bVar, cVar2, i11);
                                                K(cVar2);
                                            } catch (Exception e10) {
                                                e = e10;
                                                r10 = byteArrayOutputStream;
                                            } catch (Throwable th) {
                                                th = th;
                                                r10 = byteArrayOutputStream;
                                                d.h(r10);
                                                throw th;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            r3 = byteArrayOutputStream;
                                            r10 = r3;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r3 = byteArrayOutputStream;
                                            r10 = r3;
                                            d.h(r10);
                                            throw th;
                                        }
                                    }
                                    d.j(bVar, cVar2);
                                    cVar.b(byteArrayOutputStream.size() + bArr2.length);
                                    cVar.write(bArr2);
                                    ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
                                    byteArrayOutputStream3.writeTo(cVar);
                                    d.h(byteArrayOutputStream3);
                                }
                                int i21 = bVar.readInt();
                                byte[] bArr11 = new byte[i21 % 2 == 1 ? i21 + 1 : i21];
                                bVar.read(bArr11);
                                byte b7 = (byte) (bArr11[0] | 8);
                                bArr11[0] = b7;
                                boolean z10 = ((b7 >> 1) & 1) == 1;
                                cVar2.write(bArr4);
                                cVar2.b(i21);
                                cVar2.write(bArr11);
                                if (z10) {
                                    c(bVar, cVar2, f41379P, null);
                                    while (true) {
                                        byte[] bArr12 = new byte[4];
                                        bufferedInputStream.read(bArr12);
                                        if (!Arrays.equals(bArr12, f41380Q)) {
                                            break;
                                        }
                                        int i22 = bVar.readInt();
                                        cVar2.write(bArr12);
                                        cVar2.b(i22);
                                        if (i22 % 2 == 1) {
                                            i22++;
                                        }
                                        d.k(bVar, cVar2, i22);
                                    }
                                    K(cVar2);
                                } else {
                                    c(bVar, cVar2, bArr5, bArr6);
                                    K(cVar2);
                                }
                                r10 = r3;
                                throw new IOException("Failed to save WebP file", e);
                            }
                            d.k(bVar, cVar2, (r3 - ((bArr.length + 4) + bArr2.length)) - 8);
                            bVar.a(4);
                            int i23 = bVar.readInt();
                            if (i23 % 2 != 0) {
                                i23++;
                            }
                            bVar.a(i23);
                            K(cVar2);
                            byteArrayOutputStream = byteArrayOutputStream2;
                            d.j(bVar, cVar2);
                            cVar.b(byteArrayOutputStream.size() + bArr2.length);
                            cVar.write(bArr2);
                            ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
                            byteArrayOutputStream4.writeTo(cVar);
                            d.h(byteArrayOutputStream4);
                        } catch (Exception e12) {
                            e = e12;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        r10 = byteArrayOutputStream2;
                    } catch (Throwable th4) {
                        th = th4;
                        r10 = byteArrayOutputStream2;
                    }
                } catch (Exception e14) {
                    e = e14;
                    r3 = byteArrayOutputStream2;
                } catch (Throwable th5) {
                    th = th5;
                    r3 = byteArrayOutputStream2;
                }
            } catch (Exception e15) {
                e = e15;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0274  */
    /* JADX WARN: Code duplicated, block: B:104:0x0285 A[LOOP:7: B:102:0x0282->B:104:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c2 A[LOOP:8: B:107:0x02bf->B:109:0x02c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02da  */
    /* JADX WARN: Code duplicated, block: B:114:0x02eb A[LOOP:9: B:112:0x02e8->B:114:0x02eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0303  */
    /* JADX WARN: Code duplicated, block: B:117:0x0312  */
    /* JADX WARN: Code duplicated, block: B:119:0x0320  */
    /* JADX WARN: Code duplicated, block: B:124:0x0342  */
    /* JADX WARN: Code duplicated, block: B:76:0x0178  */
    /* JADX WARN: Code duplicated, block: B:79:0x0183 A[LOOP:1: B:77:0x0180->B:79:0x0183, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a2 A[LOOP:2: B:81:0x01a0->B:82:0x01a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c2 A[LOOP:3: B:85:0x01bf->B:87:0x01c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x020a A[LOOP:4: B:89:0x0208->B:90:0x020a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x022d  */
    /* JADX WARN: Code duplicated, block: B:96:0x023e A[LOOP:5: B:94:0x023b->B:96:0x023e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x025f A[LOOP:6: B:98:0x025d->B:99:0x025f, LOOP_END] */
    public final void F(String str, String str2) {
        d dVar;
        int[] iArr;
        int i7;
        int i10;
        int i11;
        c cVar;
        int i12;
        int i13;
        String[] strArrSplit;
        int[] iArr2;
        int i14;
        String[] strArrSplit2;
        long[] jArr;
        int i15;
        int i16;
        String[] strArrSplit3;
        e[] eVarArr;
        int i17;
        String[] strArrSplit4;
        int length;
        int[] iArr3;
        int i18;
        ByteBuffer byteBufferWrap;
        int i19;
        String[] strArrSplit5;
        int length2;
        e[] eVarArr2;
        int i20;
        e[] eVarArr3;
        ByteBuffer byteBufferWrap2;
        int i21;
        String[] strArrSplit6;
        int length3;
        double[] dArr;
        int i22;
        ByteBuffer byteBufferWrap3;
        int i23;
        String str3 = str;
        String strReplaceAll = str2;
        int i24 = 0;
        int i25 = 1;
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
            boolean zFind = f41393f0.matcher(strReplaceAll).find();
            boolean zFind2 = f41394g0.matcher(strReplaceAll).find();
            if (strReplaceAll.length() != 19) {
                return;
            }
            if (!zFind && !zFind2) {
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        int i26 = 2;
        if (strReplaceAll != null && f41389Z.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f41392e0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    long j6 = (long) (Double.parseDouble(strReplaceAll) * 10000.0d);
                    long j10 = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
                    if (DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM == 0) {
                        j10 = 1;
                        j6 = 0;
                    }
                    strReplaceAll = j6 + "/" + j10;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
        int i27 = 0;
        while (i27 < f41385V.length) {
            if ((i27 != 4 || this.f41408h) && (dVar = (d) f41388Y[i27].get(str3)) != null) {
                HashMap[] mapArr = this.f41405e;
                if (strReplaceAll != null) {
                    Pair pairQ = q(strReplaceAll);
                    int iIntValue = ((Integer) pairQ.first).intValue();
                    int i28 = -1;
                    int i29 = dVar.f41360c;
                    if (i29 != iIntValue && i29 != ((Integer) pairQ.second).intValue()) {
                        int i30 = dVar.f41361d;
                        if (i30 != -1 && (i30 == ((Integer) pairQ.first).intValue() || i30 == ((Integer) pairQ.second).intValue())) {
                            i29 = i30;
                        } else if (i29 != i25 && i29 != 7 && i29 != i26) {
                            if (t) {
                                String[] strArr = f41381R;
                                String str4 = strArr[i29];
                                if (i30 != -1) {
                                    String str5 = strArr[i30];
                                }
                                String str6 = strArr[((Integer) pairQ.first).intValue()];
                                if (((Integer) pairQ.second).intValue() != -1) {
                                    String str7 = strArr[((Integer) pairQ.second).intValue()];
                                }
                            }
                        }
                        iArr = f41382S;
                        switch (i29) {
                            case 1:
                                i7 = i24;
                                HashMap map = mapArr[i27];
                                i10 = i25;
                                if (strReplaceAll.length() == i10) {
                                    i11 = i7;
                                    if (strReplaceAll.charAt(i11) < '0') {
                                    }
                                    map.put(str3, cVar);
                                } else {
                                    i11 = i7;
                                }
                                byte[] bytes = strReplaceAll.getBytes(b0);
                                cVar = new c(i10, bytes.length, bytes);
                                map.put(str3, cVar);
                                break;
                            case 2:
                            case 7:
                                i12 = i24;
                                i13 = i25;
                                mapArr[i27].put(str3, c.a(strReplaceAll));
                                i11 = i12;
                                i10 = i13;
                                break;
                            case 3:
                                i12 = i24;
                                i13 = i25;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                for (i14 = i12; i14 < strArrSplit.length; i14++) {
                                    iArr2[i14] = Integer.parseInt(strArrSplit[i14]);
                                }
                                mapArr[i27].put(str3, c.f(iArr2, this.f41407g));
                                i11 = i12;
                                i10 = i13;
                                break;
                            case 4:
                                i12 = i24;
                                i13 = i25;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                for (i15 = i12; i15 < strArrSplit2.length; i15++) {
                                    jArr[i15] = Long.parseLong(strArrSplit2[i15]);
                                }
                                mapArr[i27].put(str3, c.c(jArr, this.f41407g));
                                i11 = i12;
                                i10 = i13;
                                break;
                            case 5:
                                i12 = i24;
                                i13 = i25;
                                i16 = -1;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                eVarArr = new e[strArrSplit3.length];
                                i17 = i12;
                                while (i17 < strArrSplit3.length) {
                                    String[] strArrSplit7 = strArrSplit3[i17].split("/", i16);
                                    eVarArr[i17] = new e((long) Double.parseDouble(strArrSplit7[i12]), (long) Double.parseDouble(strArrSplit7[i13]));
                                    i17++;
                                    i16 = -1;
                                }
                                mapArr[i27].put(str3, c.d(eVarArr, this.f41407g));
                                i11 = i12;
                                i10 = i13;
                                break;
                            case 9:
                                i12 = i24;
                                i13 = i25;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                for (i18 = i12; i18 < strArrSplit4.length; i18++) {
                                    iArr3[i18] = Integer.parseInt(strArrSplit4[i18]);
                                }
                                HashMap map2 = mapArr[i27];
                                ByteOrder byteOrder = this.f41407g;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder);
                                for (i19 = i12; i19 < length; i19++) {
                                    byteBufferWrap.putInt(iArr3[i19]);
                                }
                                map2.put(str3, new c(9, length, byteBufferWrap.array()));
                                i11 = i12;
                                i10 = i13;
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                eVarArr2 = new e[length2];
                                i20 = i24;
                                while (i20 < strArrSplit5.length) {
                                    String[] strArrSplit8 = strArrSplit5[i20].split("/", i28);
                                    int i31 = i25;
                                    e[] eVarArr4 = eVarArr2;
                                    eVarArr4[i20] = new e((long) Double.parseDouble(strArrSplit8[i24]), (long) Double.parseDouble(strArrSplit8[i31]));
                                    i20++;
                                    eVarArr2 = eVarArr4;
                                    i24 = i24;
                                    i25 = i31;
                                    i28 = -1;
                                }
                                i12 = i24;
                                i13 = i25;
                                eVarArr3 = eVarArr2;
                                HashMap map3 = mapArr[i27];
                                ByteOrder byteOrder2 = this.f41407g;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder2);
                                for (i21 = i12; i21 < length2; i21++) {
                                    e eVar = eVarArr3[i21];
                                    byteBufferWrap2.putInt((int) eVar.f41362a);
                                    byteBufferWrap2.putInt((int) eVar.f41363b);
                                }
                                map3.put(str3, new c(10, length2, byteBufferWrap2.array()));
                                i11 = i12;
                                i10 = i13;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                for (i22 = i24; i22 < strArrSplit6.length; i22 += i25) {
                                    dArr[i22] = Double.parseDouble(strArrSplit6[i22]);
                                }
                                HashMap map4 = mapArr[i27];
                                ByteOrder byteOrder3 = this.f41407g;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder3);
                                for (i23 = i24; i23 < length3; i23 += i25) {
                                    byteBufferWrap3.putDouble(dArr[i23]);
                                }
                                map4.put(str3, new c(12, length3, byteBufferWrap3.array()));
                                break;
                        }
                    } else {
                        iArr = f41382S;
                        switch (i29) {
                            case 1:
                                i7 = i24;
                                HashMap map5 = mapArr[i27];
                                i10 = i25;
                                if (strReplaceAll.length() == i10) {
                                    i11 = i7;
                                    if (strReplaceAll.charAt(i11) < '0' && strReplaceAll.charAt(i11) <= '1') {
                                        byte[] bArr = new byte[i10];
                                        bArr[i11] = (byte) (strReplaceAll.charAt(i11) - '0');
                                        cVar = new c(i10, i10, bArr);
                                    }
                                    map5.put(str3, cVar);
                                } else {
                                    i11 = i7;
                                }
                                byte[] bytes2 = strReplaceAll.getBytes(b0);
                                cVar = new c(i10, bytes2.length, bytes2);
                                map5.put(str3, cVar);
                                break;
                            case 2:
                            case 7:
                                i12 = i24;
                                i13 = i25;
                                mapArr[i27].put(str3, c.a(strReplaceAll));
                                i11 = i12;
                                i10 = i13;
                                break;
                            case 3:
                                i12 = i24;
                                i13 = i25;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i14 < strArrSplit.length) {
                                    iArr2[i14] = Integer.parseInt(strArrSplit[i14]);
                                }
                                mapArr[i27].put(str3, c.f(iArr2, this.f41407g));
                                i11 = i12;
                                i10 = i13;
                                break;
                            case 4:
                                i12 = i24;
                                i13 = i25;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i15 < strArrSplit2.length) {
                                    jArr[i15] = Long.parseLong(strArrSplit2[i15]);
                                }
                                mapArr[i27].put(str3, c.c(jArr, this.f41407g));
                                i11 = i12;
                                i10 = i13;
                                break;
                            case 5:
                                i12 = i24;
                                i13 = i25;
                                i16 = -1;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                eVarArr = new e[strArrSplit3.length];
                                i17 = i12;
                                while (i17 < strArrSplit3.length) {
                                    String[] strArrSplit9 = strArrSplit3[i17].split("/", i16);
                                    eVarArr[i17] = new e((long) Double.parseDouble(strArrSplit9[i12]), (long) Double.parseDouble(strArrSplit9[i13]));
                                    i17++;
                                    i16 = -1;
                                }
                                mapArr[i27].put(str3, c.d(eVarArr, this.f41407g));
                                i11 = i12;
                                i10 = i13;
                                break;
                            case 9:
                                i12 = i24;
                                i13 = i25;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i18 < strArrSplit4.length) {
                                    iArr3[i18] = Integer.parseInt(strArrSplit4[i18]);
                                }
                                HashMap map6 = mapArr[i27];
                                ByteOrder byteOrder4 = this.f41407g;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder4);
                                while (i19 < length) {
                                    byteBufferWrap.putInt(iArr3[i19]);
                                }
                                map6.put(str3, new c(9, length, byteBufferWrap.array()));
                                i11 = i12;
                                i10 = i13;
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                eVarArr2 = new e[length2];
                                i20 = i24;
                                while (i20 < strArrSplit5.length) {
                                    String[] strArrSplit10 = strArrSplit5[i20].split("/", i28);
                                    int i32 = i25;
                                    e[] eVarArr5 = eVarArr2;
                                    eVarArr5[i20] = new e((long) Double.parseDouble(strArrSplit10[i24]), (long) Double.parseDouble(strArrSplit10[i32]));
                                    i20++;
                                    eVarArr2 = eVarArr5;
                                    i24 = i24;
                                    i25 = i32;
                                    i28 = -1;
                                }
                                i12 = i24;
                                i13 = i25;
                                eVarArr3 = eVarArr2;
                                HashMap map7 = mapArr[i27];
                                ByteOrder byteOrder5 = this.f41407g;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder5);
                                while (i21 < length2) {
                                    e eVar2 = eVarArr3[i21];
                                    byteBufferWrap2.putInt((int) eVar2.f41362a);
                                    byteBufferWrap2.putInt((int) eVar2.f41363b);
                                }
                                map7.put(str3, new c(10, length2, byteBufferWrap2.array()));
                                i11 = i12;
                                i10 = i13;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i22 < strArrSplit6.length) {
                                    dArr[i22] = Double.parseDouble(strArrSplit6[i22]);
                                }
                                HashMap map8 = mapArr[i27];
                                ByteOrder byteOrder6 = this.f41407g;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder6);
                                while (i23 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i23]);
                                }
                                map8.put(str3, new c(12, length3, byteBufferWrap3.array()));
                                break;
                        }
                    }
                } else {
                    mapArr[i27].remove(str3);
                }
                i10 = i25;
                i11 = i24;
            } else {
                i10 = i25;
                i11 = i24;
            }
            i27 += i10;
            i24 = i11;
            i25 = i10;
            i26 = 2;
        }
    }

    public final void G(b bVar) throws Throwable {
        c cVar;
        HashMap map = this.f41405e[4];
        c cVar2 = (c) map.get("Compression");
        if (cVar2 == null) {
            this.f41414n = 6;
            r(bVar, map);
            return;
        }
        int iH = cVar2.h(this.f41407g);
        this.f41414n = iH;
        if (iH != 1) {
            if (iH == 6) {
                r(bVar, map);
                return;
            } else if (iH != 7) {
                return;
            }
        }
        c cVar3 = (c) map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.j(this.f41407g);
            int[] iArr2 = f41397w;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f41404d != 3 || (cVar = (c) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iH2 = cVar.h(this.f41407g);
                if ((iH2 != 1 || !Arrays.equals(iArr, f41398x)) && (iH2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            c cVar4 = (c) map.get("StripOffsets");
            c cVar5 = (c) map.get("StripByteCounts");
            if (cVar4 == null || cVar5 == null) {
                return;
            }
            long[] jArrI = d.i(cVar4.j(this.f41407g));
            long[] jArrI2 = d.i(cVar5.j(this.f41407g));
            if (jArrI == null || jArrI.length == 0 || jArrI2 == null || jArrI2.length == 0 || jArrI.length != jArrI2.length) {
                return;
            }
            long j6 = 0;
            for (long j10 : jArrI2) {
                j6 += j10;
            }
            int i7 = (int) j6;
            byte[] bArr = new byte[i7];
            this.f41410j = true;
            this.f41409i = true;
            this.f41408h = true;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < jArrI.length; i12++) {
                int i13 = (int) jArrI[i12];
                int i14 = (int) jArrI2[i12];
                if (i12 < jArrI.length - 1 && i13 + i14 != jArrI[i12 + 1]) {
                    this.f41410j = false;
                }
                int i15 = i13 - i10;
                if (i15 < 0) {
                    return;
                }
                long j11 = i15;
                if (bVar.skip(j11) != j11) {
                    return;
                }
                int i16 = i10 + i15;
                byte[] bArr2 = new byte[i14];
                if (bVar.read(bArr2) != i14) {
                    return;
                }
                i10 = i16 + i14;
                System.arraycopy(bArr2, 0, bArr, i11, i14);
                i11 += i14;
            }
            this.f41413m = bArr;
            if (this.f41410j) {
                this.f41411k = (int) jArrI[0];
                this.f41412l = i7;
            }
        }
    }

    public final void H(int i7, int i10) throws Throwable {
        HashMap[] mapArr = this.f41405e;
        if (mapArr[i7].isEmpty() || mapArr[i10].isEmpty()) {
            return;
        }
        c cVar = (c) mapArr[i7].get("ImageLength");
        c cVar2 = (c) mapArr[i7].get("ImageWidth");
        c cVar3 = (c) mapArr[i10].get("ImageLength");
        c cVar4 = (c) mapArr[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null || cVar3 == null || cVar4 == null) {
            return;
        }
        int iH = cVar.h(this.f41407g);
        int iH2 = cVar2.h(this.f41407g);
        int iH3 = cVar3.h(this.f41407g);
        int iH4 = cVar4.h(this.f41407g);
        if (iH >= iH3 || iH2 >= iH4) {
            return;
        }
        HashMap map = mapArr[i7];
        mapArr[i7] = mapArr[i10];
        mapArr[i10] = map;
    }

    public final void I(f fVar, int i7) throws Throwable {
        c cVarE;
        c cVarE2;
        HashMap[] mapArr = this.f41405e;
        c cVar = (c) mapArr[i7].get("DefaultCropSize");
        c cVar2 = (c) mapArr[i7].get("SensorTopBorder");
        c cVar3 = (c) mapArr[i7].get("SensorLeftBorder");
        c cVar4 = (c) mapArr[i7].get("SensorBottomBorder");
        c cVar5 = (c) mapArr[i7].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f41354a == 5) {
                e[] eVarArr = (e[]) cVar.j(this.f41407g);
                if (eVarArr == null || eVarArr.length != 2) {
                    Arrays.toString(eVarArr);
                    return;
                }
                cVarE = c.d(new e[]{eVarArr[0]}, this.f41407g);
                cVarE2 = c.d(new e[]{eVarArr[1]}, this.f41407g);
            } else {
                int[] iArr = (int[]) cVar.j(this.f41407g);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    cVarE = c.e(iArr[0], this.f41407g);
                    cVarE2 = c.e(iArr[1], this.f41407g);
                }
            }
            mapArr[i7].put("ImageWidth", cVarE);
            mapArr[i7].put("ImageLength", cVarE2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iH = cVar2.h(this.f41407g);
            int iH2 = cVar4.h(this.f41407g);
            int iH3 = cVar5.h(this.f41407g);
            int iH4 = cVar3.h(this.f41407g);
            if (iH2 <= iH || iH3 <= iH4) {
                return;
            }
            c cVarE3 = c.e(iH2 - iH, this.f41407g);
            c cVarE4 = c.e(iH3 - iH4, this.f41407g);
            mapArr[i7].put("ImageLength", cVarE3);
            mapArr[i7].put("ImageWidth", cVarE4);
            return;
        }
        c cVar6 = (c) mapArr[i7].get("ImageLength");
        c cVar7 = (c) mapArr[i7].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) mapArr[i7].get("JPEGInterchangeFormat");
            c cVar9 = (c) mapArr[i7].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iH5 = cVar8.h(this.f41407g);
            int iH6 = cVar8.h(this.f41407g);
            fVar.b(iH5);
            byte[] bArr = new byte[iH6];
            fVar.read(bArr);
            h(new b(bArr), iH5, i7);
        }
    }

    public final void J() throws Throwable {
        H(0, 5);
        H(0, 4);
        H(5, 4);
        HashMap[] mapArr = this.f41405e;
        c cVar = (c) mapArr[1].get("PixelXDimension");
        c cVar2 = (c) mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && s(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        s(mapArr[4]);
        A(0, "ThumbnailOrientation", "Orientation");
        A(0, "ThumbnailImageLength", "ImageLength");
        A(0, "ThumbnailImageWidth", "ImageWidth");
        A(5, "ThumbnailOrientation", "Orientation");
        A(5, "ThumbnailImageLength", "ImageLength");
        A(5, "ThumbnailImageWidth", "ImageWidth");
        A(4, "Orientation", "ThumbnailOrientation");
        A(4, "ImageLength", "ThumbnailImageLength");
        A(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void K(c cVar) throws IOException {
        HashMap[] mapArr;
        int[] iArr;
        d[][] dVarArr = f41385V;
        int[] iArr2 = new int[dVarArr.length];
        int[] iArr3 = new int[dVarArr.length];
        d[] dVarArr2 = f41386W;
        for (d dVar : dVarArr2) {
            z(dVar.f41359b);
        }
        if (this.f41408h) {
            if (this.f41409i) {
                z("StripOffsets");
                z("StripByteCounts");
            } else {
                z("JPEGInterchangeFormat");
                z("JPEGInterchangeFormatLength");
            }
        }
        int i7 = 0;
        while (true) {
            int length = dVarArr.length;
            mapArr = this.f41405e;
            if (i7 >= length) {
                break;
            }
            Object[] array = mapArr[i7].entrySet().toArray();
            int length2 = array.length;
            int i10 = 0;
            while (i10 < length2) {
                Map.Entry entry = (Map.Entry) array[i10];
                if (entry.getValue() == null) {
                    mapArr[i7].remove(entry.getKey());
                }
                i10++;
                iArr2 = iArr2;
            }
            i7++;
        }
        int[] iArr4 = iArr2;
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(dVarArr2[1].f41359b, c.b(0L, this.f41407g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(dVarArr2[2].f41359b, c.b(0L, this.f41407g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(dVarArr2[3].f41359b, c.b(0L, this.f41407g));
        }
        if (this.f41408h) {
            if (this.f41409i) {
                mapArr[4].put("StripOffsets", c.e(0, this.f41407g));
                mapArr[4].put("StripByteCounts", c.e(this.f41412l, this.f41407g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", c.b(0L, this.f41407g));
                mapArr[4].put("JPEGInterchangeFormatLength", c.b(this.f41412l, this.f41407g));
            }
        }
        int i11 = 0;
        while (true) {
            int length3 = dVarArr.length;
            iArr = f41382S;
            if (i11 >= length3) {
                break;
            }
            Iterator it = mapArr[i11].entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                c cVar2 = (c) ((Map.Entry) it.next()).getValue();
                cVar2.getClass();
                int i13 = iArr[cVar2.f41354a] * cVar2.f41355b;
                if (i13 > 4) {
                    i12 += i13;
                }
            }
            iArr3[i11] = iArr3[i11] + i12;
            i11++;
        }
        int size = 8;
        for (int i14 = 0; i14 < dVarArr.length; i14++) {
            if (!mapArr[i14].isEmpty()) {
                iArr4[i14] = size;
                size = (mapArr[i14].size() * 12) + 6 + iArr3[i14] + size;
            }
        }
        if (this.f41408h) {
            if (this.f41409i) {
                mapArr[4].put("StripOffsets", c.e(size, this.f41407g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", c.b(size, this.f41407g));
            }
            this.f41411k = size;
            size += this.f41412l;
        }
        if (this.f41404d == 4) {
            size += 8;
        }
        if (t) {
            for (int i15 = 0; i15 < dVarArr.length; i15++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i15), Integer.valueOf(iArr4[i15]), Integer.valueOf(mapArr[i15].size()), Integer.valueOf(iArr3[i15]), Integer.valueOf(size));
            }
        }
        if (!mapArr[r3].isEmpty()) {
            mapArr[0].put(dVarArr2[r3].f41359b, c.b(iArr4[r3], this.f41407g));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[0].put(dVarArr2[r6].f41359b, c.b(iArr4[2], this.f41407g));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[r3].put(dVarArr2[r6].f41359b, c.b(iArr4[3], this.f41407g));
        }
        int i16 = this.f41404d;
        if (i16 == 4) {
            cVar.c((short) size);
            cVar.write(c0);
        } else if (i16 == 13) {
            cVar.b(size);
            cVar.write(f41369F);
        } else if (i16 == 14) {
            cVar.write(f41374K);
            cVar.b(size);
        }
        cVar.c(this.f41407g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f14149c = this.f41407g;
        cVar.c((short) 42);
        cVar.b((int) 8);
        for (int i17 = 0; i17 < dVarArr.length; i17++) {
            if (!mapArr[i17].isEmpty()) {
                cVar.c((short) mapArr[i17].size());
                int size2 = (mapArr[i17].size() * 12) + iArr4[i17] + 2 + 4;
                for (Map.Entry entry2 : mapArr[i17].entrySet()) {
                    int i18 = ((d) f41388Y[i17].get(entry2.getKey())).f41358a;
                    c cVar3 = (c) entry2.getValue();
                    cVar3.getClass();
                    int i19 = cVar3.f41354a;
                    int i20 = iArr[i19];
                    int i21 = cVar3.f41355b;
                    int i22 = i20 * i21;
                    cVar.c((short) i18);
                    cVar.c((short) i19);
                    cVar.b(i21);
                    if (i22 > 4) {
                        cVar.b(size2);
                        size2 += i22;
                    } else {
                        cVar.write(cVar3.f41357d);
                        if (i22 < 4) {
                            while (i22 < 4) {
                                cVar.a(0);
                                i22++;
                            }
                        }
                    }
                }
                if (i17 != 0 || mapArr[4].isEmpty()) {
                    cVar.b((int) 0);
                } else {
                    cVar.b(iArr4[4]);
                }
                Iterator it2 = mapArr[i17].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((c) ((Map.Entry) it2.next()).getValue()).f41357d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f41408h) {
            cVar.write(o());
        }
        if (this.f41404d == 14 && size % 2 == 1) {
            cVar.a(0);
        }
        cVar.f14149c = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strD = d("DateTimeOriginal");
        HashMap[] mapArr = this.f41405e;
        if (strD != null && d("DateTime") == null) {
            mapArr[0].put("DateTime", c.a(strD));
        }
        if (d("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.b(0L, this.f41407g));
        }
        if (d("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.b(0L, this.f41407g));
        }
        if (d("Orientation") == null) {
            mapArr[0].put("Orientation", c.b(0L, this.f41407g));
        }
        if (d("LightSource") == null) {
            mapArr[1].put("LightSource", c.b(0L, this.f41407g));
        }
    }

    public final String d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarF = f(str);
        if (cVarF != null) {
            if (!f41389Z.contains(str)) {
                return cVarF.i(this.f41407g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i7 = cVarF.f41354a;
                if (i7 == 5 || i7 == 10) {
                    e[] eVarArr = (e[]) cVarF.j(this.f41407g);
                    if (eVarArr == null || eVarArr.length != 3) {
                        Arrays.toString(eVarArr);
                        return null;
                    }
                    e eVar = eVarArr[0];
                    Integer numValueOf = Integer.valueOf((int) (eVar.f41362a / eVar.f41363b));
                    e eVar2 = eVarArr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (eVar2.f41362a / eVar2.f41363b));
                    e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f41362a / eVar3.f41363b)));
                }
            } else {
                try {
                    return Double.toString(cVarF.g(this.f41407g));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public final int e(int i7, String str) {
        c cVarF = f(str);
        if (cVarF == null) {
            return i7;
        }
        try {
            return cVarF.h(this.f41407g);
        } catch (NumberFormatException unused) {
            return i7;
        }
    }

    public final c f(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i7 = 0; i7 < f41385V.length; i7++) {
            c cVar = (c) this.f41405e[i7].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void g(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i7;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f41405e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.e(Integer.parseInt(strExtractMetadata), this.f41407g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", c.e(Integer.parseInt(strExtractMetadata2), this.f41407g));
                }
                if (strExtractMetadata3 != null) {
                    int i10 = Integer.parseInt(strExtractMetadata3);
                    if (i10 == 90) {
                        i7 = 6;
                    } else if (i10 != 180) {
                        i7 = i10 != 270 ? 1 : 8;
                    } else {
                        i7 = 3;
                    }
                    mapArr[0].put("Orientation", c.e(i7, this.f41407g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata4);
                    int i12 = Integer.parseInt(strExtractMetadata5);
                    if (i12 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.b(i11);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i13 = i11 + 6;
                    int i14 = i12 - 6;
                    if (!Arrays.equals(bArr, c0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i14];
                    if (fVar.read(bArr2) != i14) {
                        throw new IOException("Can't read exif");
                    }
                    this.f41415o = i13;
                    x(0, bArr2);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x006a A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f8 A[LOOP:2: B:69:0x00ee->B:74:0x00f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x010a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0141 A[LOOP:0: B:10:0x0023->B:82:0x0141, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void h(p242q0.b r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p242q0.g.h(q0.b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0126 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:104:0x0129  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0137 A[LOOP:2: B:105:0x012a->B:110:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:115:0x0140  */
    /* JADX WARN: Code duplicated, block: B:118:0x0146  */
    /* JADX WARN: Code duplicated, block: B:121:0x014e A[LOOP:3: B:116:0x0141->B:121:0x014e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x0157  */
    /* JADX WARN: Code duplicated, block: B:128:0x0161 A[LOOP:4: B:123:0x0152->B:128:0x0161, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0167 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:146:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x014c A[EDGE_INSN: B:158:0x014c->B:120:0x014c BREAK  A[LOOP:3: B:116:0x0141->B:121:0x014e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x014c A[EDGE_INSN: B:160:0x014c->B:120:0x014c BREAK  A[LOOP:3: B:116:0x0141->B:121:0x014e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x0107  */
    /* JADX WARN: Code duplicated, block: B:87:0x0109  */
    public final int i(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        boolean z3;
        b bVar5;
        b bVar6;
        boolean z8;
        int i7;
        byte[] bArr;
        boolean z10;
        int i10;
        byte[] bArr2;
        int i11;
        byte[] bArr3;
        boolean z11;
        b bVar7;
        short s3;
        long j6;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i12 = 0;
        while (true) {
            byte[] bArr5 = f41399y;
            if (i12 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i12] != bArr5[i12]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i13 = 0; i13 < bytes.length; i13++) {
                    if (bArr4[i13] != bytes[i13]) {
                        try {
                            bVar2 = new b(bArr4);
                            try {
                                long j10 = bVar2.readInt();
                                byte[] bArr6 = new byte[4];
                                bVar2.read(bArr6);
                                if (Arrays.equals(bArr6, f41400z)) {
                                    if (j10 == 1) {
                                        j10 = bVar2.readLong();
                                        j6 = 16;
                                        if (j10 < 16) {
                                        }
                                    } else {
                                        j6 = 8;
                                    }
                                    long j11 = 5000;
                                    if (j10 > j11) {
                                        j10 = j11;
                                    }
                                    long j12 = j10 - j6;
                                    if (j12 >= 8) {
                                        byte[] bArr7 = new byte[4];
                                        boolean z12 = false;
                                        boolean z13 = false;
                                        for (long j13 = 0; j13 < j12 / 4 && bVar2.read(bArr7) == 4; j13++) {
                                            if (j13 != 1) {
                                                if (Arrays.equals(bArr7, f41364A)) {
                                                    z12 = true;
                                                } else if (Arrays.equals(bArr7, f41365B)) {
                                                    z13 = true;
                                                }
                                                if (z12 && z13) {
                                                    bVar2.close();
                                                    return 12;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                                if (bVar2 != null) {
                                }
                                bVar4 = new b(bArr4);
                                ByteOrder byteOrderW = w(bVar4);
                                this.f41407g = byteOrderW;
                                bVar4.f41351b = byteOrderW;
                                s3 = bVar4.readShort();
                                if (s3 != 20306) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                bVar4.close();
                                if (z3) {
                                    return 7;
                                }
                                try {
                                    bVar7 = new b(bArr4);
                                    try {
                                        ByteOrder byteOrderW2 = w(bVar7);
                                        this.f41407g = byteOrderW2;
                                        bVar7.f41351b = byteOrderW2;
                                        if (bVar7.readShort() == 85) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        bVar7.close();
                                    } catch (Exception unused2) {
                                        bVar6 = bVar7;
                                        if (bVar6 != null) {
                                            bVar6.close();
                                        }
                                        z8 = false;
                                    } catch (Throwable th) {
                                        th = th;
                                        bVar5 = bVar7;
                                        if (bVar5 != null) {
                                            bVar5.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused3) {
                                    bVar6 = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bVar5 = null;
                                }
                                if (z8) {
                                    return 10;
                                }
                                i7 = 0;
                                while (true) {
                                    bArr = f41368E;
                                    if (i7 < bArr.length) {
                                        z10 = true;
                                        break;
                                    }
                                    if (bArr4[i7] != bArr[i7]) {
                                        z10 = false;
                                        break;
                                    }
                                    i7++;
                                }
                                if (z10) {
                                    return 13;
                                }
                                i10 = 0;
                                while (true) {
                                    bArr2 = f41372I;
                                    if (i10 < bArr2.length) {
                                        i11 = 0;
                                        while (true) {
                                            bArr3 = f41373J;
                                            if (i11 < bArr3.length) {
                                                z11 = true;
                                                break;
                                            }
                                            if (bArr4[bArr2.length + i11 + 4] != bArr3[i11]) {
                                                break;
                                            }
                                            i11++;
                                        }
                                        if (z11) {
                                            return 14;
                                        }
                                        return 0;
                                    }
                                    if (bArr4[i10] != bArr2[i10]) {
                                        break;
                                    }
                                    i10++;
                                }
                                z11 = false;
                                if (z11) {
                                    return 14;
                                }
                                return 0;
                            } catch (Throwable th3) {
                                th = th3;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused4) {
                            bVar2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            bVar = null;
                        }
                        bVar2.close();
                        try {
                            bVar4 = new b(bArr4);
                            try {
                                ByteOrder byteOrderW3 = w(bVar4);
                                this.f41407g = byteOrderW3;
                                bVar4.f41351b = byteOrderW3;
                                s3 = bVar4.readShort();
                                if (s3 != 20306 || s3 == 21330) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                bVar4.close();
                            } catch (Exception unused5) {
                                if (bVar4 != null) {
                                    bVar4.close();
                                }
                                z3 = false;
                            } catch (Throwable th5) {
                                th = th5;
                                bVar3 = bVar4;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused6) {
                            bVar4 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            bVar3 = null;
                        }
                        if (z3) {
                            return 7;
                        }
                        bVar7 = new b(bArr4);
                        ByteOrder byteOrderW4 = w(bVar7);
                        this.f41407g = byteOrderW4;
                        bVar7.f41351b = byteOrderW4;
                        if (bVar7.readShort() == 85) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        bVar7.close();
                        if (z8) {
                            return 10;
                        }
                        i7 = 0;
                        while (true) {
                            bArr = f41368E;
                            if (i7 < bArr.length) {
                                z10 = true;
                                break;
                            }
                            if (bArr4[i7] != bArr[i7]) {
                                z10 = false;
                                break;
                            }
                            i7++;
                        }
                        if (z10) {
                            return 13;
                        }
                        i10 = 0;
                        while (true) {
                            bArr2 = f41372I;
                            if (i10 < bArr2.length) {
                                i11 = 0;
                                while (true) {
                                    bArr3 = f41373J;
                                    if (i11 < bArr3.length) {
                                        z11 = true;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i11 + 4] != bArr3[i11]) {
                                        break;
                                        break;
                                    }
                                    i11++;
                                }
                                if (z11) {
                                    return 14;
                                }
                                return 0;
                            }
                            if (bArr4[i10] != bArr2[i10]) {
                                break;
                                break;
                            }
                            i10++;
                        }
                        z11 = false;
                        if (z11) {
                            return 14;
                        }
                        return 0;
                    }
                }
                return 9;
            }
            i12++;
        }
    }

    public final void j(f fVar) throws Throwable {
        int i7;
        int i10;
        m(fVar);
        HashMap[] mapArr = this.f41405e;
        c cVar = (c) mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f41357d);
            fVar2.f41351b = this.f41407g;
            byte[] bArr = f41366C;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = f41367D;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            y(fVar2, 6);
            c cVar2 = (c) mapArr[7].get("PreviewImageStart");
            c cVar3 = (c) mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.j(this.f41407g);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i11 = iArr[2];
                int i12 = iArr[0];
                if (i11 <= i12 || (i7 = iArr[3]) <= (i10 = iArr[1])) {
                    return;
                }
                int i13 = (i11 - i12) + 1;
                int i14 = (i7 - i10) + 1;
                if (i13 < i14) {
                    int i15 = i13 + i14;
                    i14 = i15 - i14;
                    i13 = i15 - i14;
                }
                c cVarE = c.e(i13, this.f41407g);
                c cVarE2 = c.e(i14, this.f41407g);
                mapArr[0].put("ImageWidth", cVarE);
                mapArr[0].put("ImageLength", cVarE2);
            }
        }
    }

    public final void k(b bVar) throws Throwable {
        if (t) {
            Objects.toString(bVar);
        }
        bVar.f41351b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f41368E;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i7 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i10 = length + 8;
                if (i10 == 16 && !Arrays.equals(bArr2, f41370G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f41371H)) {
                    return;
                }
                if (Arrays.equals(bArr2, f41369F)) {
                    byte[] bArr3 = new byte[i7];
                    if (bVar.read(bArr3) != i7) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + d.c(bArr2));
                    }
                    int i11 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i11) {
                        this.f41415o = i10;
                        x(0, bArr3);
                        J();
                        G(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i11 + ", calculated CRC value: " + crc32.getValue());
                }
                int i12 = i7 + 4;
                bVar.a(i12);
                length = i10 + i12;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void l(b bVar) throws Throwable {
        if (t) {
            Objects.toString(bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i7 = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        bVar.a(i7 - bVar.f41352c);
        bVar.read(bArr4);
        h(new b(bArr4), i7, 5);
        bVar.a(i11 - bVar.f41352c);
        bVar.f41351b = ByteOrder.BIG_ENDIAN;
        int i12 = bVar.readInt();
        for (int i13 = 0; i13 < i12; i13++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f41384U.f41358a) {
                short s3 = bVar.readShort();
                short s8 = bVar.readShort();
                c cVarE = c.e(s3, this.f41407g);
                c cVarE2 = c.e(s8, this.f41407g);
                HashMap[] mapArr = this.f41405e;
                mapArr[0].put("ImageLength", cVarE);
                mapArr[0].put("ImageWidth", cVarE2);
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void m(f fVar) throws Throwable {
        u(fVar);
        y(fVar, 0);
        I(fVar, 0);
        I(fVar, 5);
        I(fVar, 4);
        J();
        if (this.f41404d == 8) {
            HashMap[] mapArr = this.f41405e;
            c cVar = (c) mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f41357d);
                fVar2.f41351b = this.f41407g;
                fVar2.a(6);
                y(fVar2, 9);
                c cVar2 = (c) mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void n(f fVar) throws Throwable {
        if (t) {
            Objects.toString(fVar);
        }
        m(fVar);
        HashMap[] mapArr = this.f41405e;
        c cVar = (c) mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            h(new b(cVar.f41357d), (int) cVar.f41356c, 5);
        }
        c cVar2 = (c) mapArr[0].get("ISO");
        c cVar3 = (c) mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[Catch: all -> 0x0080, Exception -> 0x00a1, TRY_ENTER, TryCatch #8 {Exception -> 0x00a1, all -> 0x0080, blocks: (B:28:0x0053, B:31:0x0069, B:33:0x0075, B:41:0x0085, B:42:0x008a, B:43:0x008b, B:44:0x0090), top: B:57:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[Catch: all -> 0x0080, Exception -> 0x00a1, TRY_LEAVE, TryCatch #8 {Exception -> 0x00a1, all -> 0x0080, blocks: (B:28:0x0053, B:31:0x0069, B:33:0x0075, B:41:0x0085, B:42:0x008a, B:43:0x008b, B:44:0x0090), top: B:57:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085 A[Catch: all -> 0x0080, Exception -> 0x00a1, TRY_ENTER, TryCatch #8 {Exception -> 0x00a1, all -> 0x0080, blocks: (B:28:0x0053, B:31:0x0069, B:33:0x0075, B:41:0x0085, B:42:0x008a, B:43:0x008b, B:44:0x0090), top: B:57:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x008b A[Catch: all -> 0x0080, Exception -> 0x00a1, TryCatch #8 {Exception -> 0x00a1, all -> 0x0080, blocks: (B:28:0x0053, B:31:0x0069, B:33:0x0075, B:41:0x0085, B:42:0x008a, B:43:0x008b, B:44:0x0090), top: B:57:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:? A[SYNTHETIC] */
    public final byte[] o() throws Throwable {
        Throwable th;
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        Throwable th2;
        byte[] bArr;
        InputStream inputStream = null;
        if (this.f41408h) {
            byte[] bArr2 = this.f41413m;
            if (bArr2 != null) {
                return bArr2;
            }
            try {
                fileInputStream = this.f41403c;
                if (fileInputStream != null) {
                    try {
                        if (!fileInputStream.markSupported()) {
                            d.h(fileInputStream);
                            return null;
                        }
                        fileInputStream.reset();
                        fileDescriptor = null;
                        try {
                            if (fileInputStream.skip(this.f41411k + this.f41415o) != this.f41411k + this.f41415o) {
                                throw new IOException("Corrupted image");
                            }
                            bArr = new byte[this.f41412l];
                            if (fileInputStream.read(bArr) != this.f41412l) {
                                throw new IOException("Corrupted image");
                            }
                            this.f41413m = bArr;
                            d.h(fileInputStream);
                            if (fileDescriptor != null) {
                                d.f(fileDescriptor);
                            }
                            return bArr;
                        } catch (Exception unused) {
                        } catch (Throwable th3) {
                            th2 = th3;
                            inputStream = fileInputStream;
                            th = th2;
                            d.h(inputStream);
                            if (fileDescriptor == null) {
                                throw th;
                            }
                            d.f(fileDescriptor);
                            throw th;
                        }
                    } catch (Exception unused2) {
                        fileDescriptor = null;
                    } catch (Throwable th4) {
                        inputStream = fileInputStream;
                        th = th4;
                        fileDescriptor = null;
                        d.h(inputStream);
                        if (fileDescriptor == null) {
                            throw th;
                        }
                        d.f(fileDescriptor);
                        throw th;
                    }
                    d.h(fileInputStream);
                    if (fileDescriptor != null) {
                        d.f(fileDescriptor);
                    }
                } else {
                    if (this.f41401a != null) {
                        fileInputStream = new FileInputStream(this.f41401a);
                        fileDescriptor = null;
                        if (fileInputStream.skip(this.f41411k + this.f41415o) != this.f41411k + this.f41415o) {
                            throw new IOException("Corrupted image");
                        }
                        bArr = new byte[this.f41412l];
                        if (fileInputStream.read(bArr) != this.f41412l) {
                            throw new IOException("Corrupted image");
                        }
                        this.f41413m = bArr;
                        d.h(fileInputStream);
                        if (fileDescriptor != null) {
                            d.f(fileDescriptor);
                        }
                        return bArr;
                    }
                    FileDescriptor fileDescriptorB = h.b(this.f41402b);
                    try {
                        h.c(fileDescriptorB, 0L, OsConstants.SEEK_SET);
                        fileDescriptor = fileDescriptorB;
                        fileInputStream = new FileInputStream(fileDescriptorB);
                        if (fileInputStream.skip(this.f41411k + this.f41415o) != this.f41411k + this.f41415o) {
                            throw new IOException("Corrupted image");
                        }
                        bArr = new byte[this.f41412l];
                        if (fileInputStream.read(bArr) != this.f41412l) {
                            throw new IOException("Corrupted image");
                        }
                        this.f41413m = bArr;
                        d.h(fileInputStream);
                        if (fileDescriptor != null) {
                            d.f(fileDescriptor);
                        }
                        return bArr;
                    } catch (Exception unused3) {
                        fileDescriptor = fileDescriptorB;
                        fileInputStream = null;
                    } catch (Throwable th5) {
                        th2 = th5;
                        fileDescriptor = fileDescriptorB;
                        th = th2;
                        d.h(inputStream);
                        if (fileDescriptor == null) {
                            throw th;
                        }
                        d.f(fileDescriptor);
                        throw th;
                    }
                }
            } catch (Exception unused4) {
                fileInputStream = null;
                fileDescriptor = null;
            } catch (Throwable th6) {
                th = th6;
                fileDescriptor = null;
            }
        }
        return null;
    }

    public final void p(b bVar) throws Throwable {
        if (t) {
            Objects.toString(bVar);
        }
        bVar.f41351b = ByteOrder.LITTLE_ENDIAN;
        bVar.a(f41372I.length);
        int i7 = bVar.readInt() + 8;
        byte[] bArr = f41373J;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i10 = bVar.readInt();
                int i11 = length + 8;
                if (Arrays.equals(f41374K, bArr2)) {
                    byte[] bArr3 = new byte[i10];
                    if (bVar.read(bArr3) == i10) {
                        this.f41415o = i11;
                        x(0, bArr3);
                        G(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + d.c(bArr2));
                    }
                }
                if (i10 % 2 == 1) {
                    i10++;
                }
                length = i11 + i10;
                if (length == i7) {
                    return;
                }
                if (length > i7) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i10);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void r(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iH = cVar.h(this.f41407g);
        int iH2 = cVar2.h(this.f41407g);
        if (this.f41404d == 7) {
            iH += this.f41416p;
        }
        if (iH <= 0 || iH2 <= 0) {
            return;
        }
        this.f41408h = true;
        if (this.f41401a == null && this.f41403c == null && this.f41402b == null) {
            byte[] bArr = new byte[iH2];
            bVar.skip(iH);
            bVar.read(bArr);
            this.f41413m = bArr;
        }
        this.f41411k = iH;
        this.f41412l = iH2;
    }

    public final boolean s(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.h(this.f41407g) <= 512 && cVar2.h(this.f41407g) <= 512;
    }

    public final void t(InputStream inputStream) throws Throwable {
        boolean z3 = t;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i7 = 0; i7 < f41385V.length; i7++) {
            try {
                this.f41405e[i7] = new HashMap();
            } catch (IOException | UnsupportedOperationException unused) {
                a();
                if (z3) {
                    v();
                    return;
                }
                return;
            } catch (Throwable th) {
                a();
                if (z3) {
                    v();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int i10 = i(bufferedInputStream);
        this.f41404d = i10;
        if (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) {
            b bVar = new b(bufferedInputStream);
            int i11 = this.f41404d;
            if (i11 == 4) {
                h(bVar, 0, 0);
            } else if (i11 == 13) {
                k(bVar);
            } else if (i11 == 9) {
                l(bVar);
            } else if (i11 == 14) {
                p(bVar);
            }
        } else {
            f fVar = new f(bufferedInputStream);
            int i12 = this.f41404d;
            if (i12 == 12) {
                g(fVar);
            } else if (i12 == 7) {
                j(fVar);
            } else if (i12 == 10) {
                n(fVar);
            } else {
                m(fVar);
            }
            fVar.b(this.f41415o);
            G(fVar);
        }
        a();
        if (z3) {
            v();
        }
    }

    public final void u(f fVar) throws IOException {
        ByteOrder byteOrderW = w(fVar);
        this.f41407g = byteOrderW;
        fVar.f41351b = byteOrderW;
        int unsignedShort = fVar.readUnsignedShort();
        int i7 = this.f41404d;
        if (i7 != 7 && i7 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i10 = fVar.readInt();
        if (i10 < 8) {
            throw new IOException(G.m(i10, "Invalid first Ifd offset: "));
        }
        int i11 = i10 - 8;
        if (i11 > 0) {
            fVar.a(i11);
        }
    }

    public final void v() throws Throwable {
        int i7 = 0;
        while (true) {
            HashMap[] mapArr = this.f41405e;
            if (i7 >= mapArr.length) {
                return;
            }
            mapArr[i7].size();
            for (Map.Entry entry : mapArr[i7].entrySet()) {
                c cVar = (c) entry.getValue();
                cVar.toString();
                cVar.i(this.f41407g);
            }
            i7++;
        }
    }

    public final void x(int i7, byte[] bArr) throws IOException {
        f fVar = new f(bArr);
        u(fVar);
        y(fVar, i7);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019f  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:98:0x018c  */
    public final void y(f fVar, int i7) throws IOException {
        HashMap[] mapArr;
        boolean z3;
        HashSet hashSet;
        long j6;
        int i10;
        boolean z8;
        HashSet hashSet2;
        int unsignedShort;
        long j10;
        Integer numValueOf = Integer.valueOf(fVar.f41352c);
        HashSet hashSet3 = this.f41406f;
        hashSet3.add(numValueOf);
        short s3 = fVar.readShort();
        if (s3 <= 0) {
            return;
        }
        short s8 = 0;
        while (true) {
            mapArr = this.f41405e;
            z3 = t;
            if (s8 >= s3) {
                break;
            }
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i11 = fVar.readInt();
            short s10 = s8;
            long j11 = ((long) fVar.f41352c) + 4;
            d dVar = (d) f41387X[i7].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i7), Integer.valueOf(unsignedShort2), dVar != null ? dVar.f41359b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i11));
            }
            if (dVar != null && unsignedShort3 > 0) {
                int[] iArr = f41382S;
                if (unsignedShort3 < iArr.length) {
                    int i12 = dVar.f41360c;
                    if (i12 == 7 || unsignedShort3 == 7 || i12 == unsignedShort3 || (i10 = dVar.f41361d) == unsignedShort3 || (((i12 == 4 || i10 == 4) && unsignedShort3 == 3) || (((i12 == 9 || i10 == 9) && unsignedShort3 == 8) || ((i12 == 12 || i10 == 12) && unsignedShort3 == 11)))) {
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i12;
                        }
                        hashSet = hashSet3;
                        j6 = ((long) i11) * ((long) iArr[unsignedShort3]);
                        z8 = j6 >= 0 && j6 <= 2147483647L;
                    } else {
                        if (z3) {
                            String str = f41381R[unsignedShort3];
                        }
                        hashSet = hashSet3;
                        j6 = 0;
                    }
                } else {
                    hashSet = hashSet3;
                    j6 = 0;
                }
            } else {
                hashSet = hashSet3;
                j6 = 0;
            }
            if (z8) {
                if (j6 > 4) {
                    int i13 = fVar.readInt();
                    if (this.f41404d == 7) {
                        if ("MakerNote".equals(dVar.f41359b)) {
                            this.f41416p = i13;
                        } else if (i7 == 6 && "ThumbnailImage".equals(dVar.f41359b)) {
                            this.f41417q = i13;
                            this.f41418r = i11;
                            c cVarE = c.e(6, this.f41407g);
                            c cVarB = c.b(this.f41417q, this.f41407g);
                            c cVarB2 = c.b(this.f41418r, this.f41407g);
                            mapArr[4].put("Compression", cVarE);
                            mapArr[4].put("JPEGInterchangeFormat", cVarB);
                            mapArr[4].put("JPEGInterchangeFormatLength", cVarB2);
                        }
                    }
                    fVar.b(i13);
                } else {
                    z3 = z3;
                    i11 = i11;
                }
                Integer num = (Integer) f41390a0.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j10 = ((long) fVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = fVar.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = fVar.readInt();
                        } else {
                            j10 = -1;
                        }
                        if (z3) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j10), dVar.f41359b);
                        }
                        if (j10 > 0) {
                            hashSet2 = hashSet;
                            if (!hashSet2.contains(Integer.valueOf((int) j10))) {
                                fVar.b(j10);
                                y(fVar, num.intValue());
                            }
                        } else {
                            hashSet2 = hashSet;
                        }
                        fVar.b(j11);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    j10 = unsignedShort;
                    if (z3) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j10), dVar.f41359b);
                    }
                    if (j10 > 0) {
                        hashSet2 = hashSet;
                        if (!hashSet2.contains(Integer.valueOf((int) j10))) {
                            fVar.b(j10);
                            y(fVar, num.intValue());
                        }
                    } else {
                        hashSet2 = hashSet;
                    }
                    fVar.b(j11);
                } else {
                    hashSet2 = hashSet;
                    int i14 = fVar.f41352c + this.f41415o;
                    byte[] bArr = new byte[(int) j6];
                    fVar.readFully(bArr);
                    c cVar = new c(i14, bArr, unsignedShort3, i11);
                    mapArr[i7].put(dVar.f41359b, cVar);
                    String str2 = dVar.f41359b;
                    if ("DNGVersion".equals(str2)) {
                        this.f41404d = 3;
                    }
                    if ((("Make".equals(str2) || "Model".equals(str2)) && cVar.i(this.f41407g).contains("PENTAX")) || ("Compression".equals(str2) && cVar.h(this.f41407g) == 65535)) {
                        this.f41404d = 8;
                    }
                    if (fVar.f41352c != j11) {
                        fVar.b(j11);
                    }
                }
            } else {
                fVar.b(j11);
                hashSet2 = hashSet;
            }
            s8 = (short) (s10 + 1);
            hashSet3 = hashSet2;
            s3 = s3;
        }
        HashSet hashSet4 = hashSet3;
        int i15 = fVar.readInt();
        if (z3) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i15));
        }
        long j12 = i15;
        if (j12 <= 0 || hashSet4.contains(Integer.valueOf(i15))) {
            return;
        }
        fVar.b(j12);
        if (mapArr[4].isEmpty()) {
            y(fVar, 4);
        } else if (mapArr[5].isEmpty()) {
            y(fVar, 5);
        }
    }

    public final void z(String str) {
        for (int i7 = 0; i7 < f41385V.length; i7++) {
            this.f41405e[i7].remove(str);
        }
    }

    public g(FileDescriptor fileDescriptor) throws Throwable {
        boolean z3;
        FileInputStream fileInputStream;
        Throwable th;
        d[][] dVarArr = f41385V;
        this.f41405e = new HashMap[dVarArr.length];
        this.f41406f = new HashSet(dVarArr.length);
        this.f41407g = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f41403c = null;
            this.f41401a = null;
            try {
                h.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                this.f41402b = fileDescriptor;
                try {
                    fileDescriptor = h.b(fileDescriptor);
                    z3 = true;
                } catch (Exception e10) {
                    throw new IOException("Failed to duplicate file descriptor", e10);
                }
            } catch (Exception unused) {
                this.f41402b = null;
                z3 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    t(fileInputStream);
                    d.h(fileInputStream);
                    if (z3) {
                        d.f(fileDescriptor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    d.h(fileInputStream);
                    if (z3) {
                        d.f(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    public g(InputStream inputStream) throws Throwable {
        d[][] dVarArr = f41385V;
        this.f41405e = new HashMap[dVarArr.length];
        this.f41406f = new HashSet(dVarArr.length);
        this.f41407g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f41401a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f41403c = (AssetManager.AssetInputStream) inputStream;
                this.f41402b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f41403c = null;
                    this.f41402b = fileInputStream.getFD();
                } catch (Exception unused) {
                    this.f41403c = null;
                    this.f41402b = null;
                }
            } else {
                this.f41403c = null;
                this.f41402b = null;
            }
            t(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
