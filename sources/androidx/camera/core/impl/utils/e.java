package androidx.camera.core.impl.utils;

import N8.q0;
import android.location.Location;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hg.c f14151b = new Hg.c(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Hg.c f14152c = new Hg.c(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Hg.c f14153d = new Hg.c(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f14154e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f14155f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p242q0.g f14156a;

    public e(p242q0.g gVar) {
        this.f14156a = gVar;
    }

    public final void a(e eVar) {
        ArrayList<String> arrayList = new ArrayList(f14154e);
        arrayList.removeAll(f14155f);
        for (String str : arrayList) {
            String strD = this.f14156a.d(str);
            p242q0.g gVar = eVar.f14156a;
            String strD2 = gVar.d(str);
            if (strD != null && !strD.equals(strD2)) {
                gVar.F(str, strD);
            }
        }
    }

    public final int b() {
        switch (this.f14156a.e(0, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Hg.c cVar = f14153d;
        String str = ((SimpleDateFormat) cVar.get()).format(new Date(jCurrentTimeMillis));
        p242q0.g gVar = this.f14156a;
        gVar.F("DateTime", str);
        try {
            gVar.F("SubSecTime", Long.toString(jCurrentTimeMillis - ((SimpleDateFormat) cVar.get()).parse(str).getTime()));
        } catch (ParseException unused) {
        }
        gVar.B();
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0186  */
    public final String toString() throws Throwable {
        char c6;
        double[] dArr;
        double dG;
        char c10;
        double d2;
        double dG2;
        double[] dArr2;
        long time;
        Location location;
        byte b7;
        double d10;
        long time2;
        int i7;
        Locale locale = Locale.ENGLISH;
        p242q0.g gVar = this.f14156a;
        Integer numValueOf = Integer.valueOf(gVar.e(0, "ImageWidth"));
        Integer numValueOf2 = Integer.valueOf(gVar.e(0, "ImageLength"));
        Integer numValueOf3 = Integer.valueOf(b());
        int iE = gVar.e(0, "Orientation");
        Boolean boolValueOf = Boolean.valueOf(iE == 4 || iE == 5 || iE == 7);
        Boolean boolValueOf2 = Boolean.valueOf(gVar.e(0, "Orientation") == 2);
        String strD = gVar.d("GPSProcessingMethod");
        String strD2 = gVar.d("GPSLatitude");
        String strD3 = gVar.d("GPSLatitudeRef");
        String strD4 = gVar.d("GPSLongitude");
        String strD5 = gVar.d("GPSLongitudeRef");
        if (strD2 == null || strD3 == null || strD4 == null || strD5 == null) {
            c6 = 0;
            dArr = null;
        } else {
            try {
                c6 = 0;
                try {
                    dArr = new double[]{p242q0.g.b(strD2, strD3), p242q0.g.b(strD4, strD5)};
                } catch (IllegalArgumentException unused) {
                    dArr = null;
                }
            } catch (IllegalArgumentException unused2) {
                c6 = 0;
            }
        }
        p242q0.c cVarF = gVar.f("GPSAltitude");
        if (cVarF == null) {
            dG = -1.0d;
        } else {
            try {
                dG = cVarF.g(gVar.f41407g);
            } catch (NumberFormatException unused3) {
                dG = -1.0d;
            }
        }
        int iE2 = gVar.e(-1, "GPSAltitudeRef");
        if (dG < 0.0d || iE2 < 0) {
            c10 = 1;
            d2 = 0.0d;
        } else {
            if (iE2 == 1) {
                c10 = 1;
                i7 = -1;
            } else {
                i7 = 1;
                c10 = 1;
            }
            d2 = dG * ((double) i7);
        }
        p242q0.c cVarF2 = gVar.f("GPSSpeed");
        if (cVarF2 == null) {
            dG2 = 0.0d;
        } else {
            try {
                dG2 = cVarF2.g(gVar.f41407g);
            } catch (NumberFormatException unused4) {
                dG2 = 0.0d;
            }
        }
        String strD6 = gVar.d("GPSSpeedRef");
        if (strD6 == null) {
            strD6 = "K";
        }
        double d11 = dG2;
        String strD7 = gVar.d("GPSDateStamp");
        String strD8 = gVar.d("GPSTimeStamp");
        Hg.c cVar = f14153d;
        long j6 = -1;
        if (strD7 == null && strD8 == null) {
            dArr2 = dArr;
            time = -1;
        } else {
            try {
                if (strD8 == null) {
                    time = ((SimpleDateFormat) f14151b.get()).parse(strD7).getTime();
                } else if (strD7 == null) {
                    time = ((SimpleDateFormat) f14152c.get()).parse(strD8).getTime();
                } else {
                    dArr2 = dArr;
                    String strY = q0.y(strD7, " ", strD8);
                    if (strY == null) {
                        time = -1;
                    } else {
                        try {
                            time = ((SimpleDateFormat) cVar.get()).parse(strY).getTime();
                        } catch (ParseException unused5) {
                            time = -1;
                        }
                    }
                }
                dArr2 = dArr;
            } catch (ParseException unused6) {
                dArr2 = dArr;
            }
        }
        if (dArr2 == null) {
            location = null;
        } else {
            if (strD == null) {
                strD = "e";
            }
            Location location2 = new Location(strD);
            location2.setLatitude(dArr2[c6]);
            location2.setLongitude(dArr2[c10]);
            if (d2 != 0.0d) {
                location2.setAltitude(d2);
            }
            if (d11 != 0.0d) {
                int iHashCode = strD6.hashCode();
                if (iHashCode != 75) {
                    if (iHashCode != 77) {
                        if (iHashCode == 78 && strD6.equals("N")) {
                            b7 = c10;
                        } else {
                            b7 = -1;
                        }
                    } else if (strD6.equals("M")) {
                        b7 = c6;
                    } else {
                        b7 = -1;
                    }
                } else if (strD6.equals("K")) {
                    b7 = 2;
                } else {
                    b7 = -1;
                }
                if (b7 != 0) {
                    d10 = ((b7 != c10 ? 0.621371d : 1.15078d) * d11) / 2.23694d;
                } else {
                    d10 = d11 / 2.23694d;
                }
                location2.setSpeed((float) d10);
            }
            if (time != -1) {
                location2.setTime(time);
            }
            location = location2;
        }
        String strD9 = gVar.d("DateTimeOriginal");
        if (strD9 == null) {
            time2 = -1;
        } else {
            try {
                time2 = ((SimpleDateFormat) cVar.get()).parse(strD9).getTime();
            } catch (ParseException unused7) {
                time2 = -1;
            }
        }
        if (time2 != -1) {
            String strD10 = gVar.d("SubSecTimeOriginal");
            if (strD10 != null) {
                try {
                    long j10 = Long.parseLong(strD10);
                    while (j10 > 1000) {
                        j10 /= 10;
                    }
                    j6 = time2 + j10;
                } catch (NumberFormatException unused8) {
                    j6 = time2;
                }
            } else {
                j6 = time2;
            }
        }
        return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", numValueOf, numValueOf2, numValueOf3, boolValueOf, boolValueOf2, location, Long.valueOf(j6), gVar.d("ImageDescription"));
    }
}
