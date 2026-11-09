package com.yalantis.ucrop.util;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p242q0.g;

/* JADX INFO: loaded from: classes4.dex */
public class ImageHeaderParser {
    private static final int EXIF_MAGIC_NUMBER = 65496;
    private static final int EXIF_SEGMENT_TYPE = 225;
    private static final int INTEL_TIFF_MAGIC_NUMBER = 18761;
    private static final int MARKER_EOI = 217;
    private static final int MOTOROLA_TIFF_MAGIC_NUMBER = 19789;
    private static final int ORIENTATION_TAG_TYPE = 274;
    private static final int SEGMENT_SOS = 218;
    private static final int SEGMENT_START_ID = 255;
    private static final String TAG = "ImageHeaderParser";
    public static final int UNKNOWN_ORIENTATION = -1;
    private final Reader reader;
    private static final String JPEG_EXIF_SEGMENT_PREAMBLE = "Exif\u0000\u0000";
    private static final byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES = JPEG_EXIF_SEGMENT_PREAMBLE.getBytes(Charset.forName(Constants.ENCODING));
    private static final int[] BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static class RandomAccessReader {
        private final ByteBuffer data;

        public RandomAccessReader(byte[] bArr, int i7) {
            this.data = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i7);
        }

        public short getInt16(int i7) {
            return this.data.getShort(i7);
        }

        public int getInt32(int i7) {
            return this.data.getInt(i7);
        }

        public int length() {
            return this.data.remaining();
        }

        public void order(ByteOrder byteOrder) {
            this.data.order(byteOrder);
        }
    }

    public interface Reader {
        int getUInt16() throws IOException;

        short getUInt8() throws IOException;

        int read(byte[] bArr, int i7) throws IOException;

        long skip(long j6) throws IOException;
    }

    public static class StreamReader implements Reader {
        private final InputStream is;

        public StreamReader(InputStream inputStream) {
            this.is = inputStream;
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public int getUInt16() throws IOException {
            return ((this.is.read() << 8) & 65280) | (this.is.read() & 255);
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public short getUInt8() throws IOException {
            return (short) (this.is.read() & 255);
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public int read(byte[] bArr, int i7) throws IOException {
            int i10 = i7;
            while (i10 > 0) {
                int i11 = this.is.read(bArr, i7 - i10, i10);
                if (i11 == -1) {
                    break;
                }
                i10 -= i11;
            }
            return i7 - i10;
        }

        @Override // com.yalantis.ucrop.util.ImageHeaderParser.Reader
        public long skip(long j6) throws IOException {
            if (j6 < 0) {
                return 0L;
            }
            long j10 = j6;
            while (j10 > 0) {
                long jSkip = this.is.skip(j10);
                if (jSkip <= 0) {
                    if (this.is.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j10 -= jSkip;
            }
            return j6 - j10;
        }
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.reader = new StreamReader(inputStream);
    }

    private static int calcTagOffset(int i7, int i10) {
        return (i10 * 12) + i7 + 2;
    }

    public static void copyExif(g gVar, int i7, int i10, String str) throws Throwable {
        try {
            copyExifAttributes(gVar, new g(str), i7, i10);
        } catch (IOException e10) {
            e10.getMessage();
        }
    }

    private static void copyExifAttributes(g gVar, g gVar2, int i7, int i10) throws Throwable {
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        for (int i11 = 0; i11 < 22; i11++) {
            String str = strArr[i11];
            String strD = gVar.d(str);
            if (!TextUtils.isEmpty(strD)) {
                gVar2.F(str, strD);
            }
        }
        gVar2.F("ImageWidth", String.valueOf(i7));
        gVar2.F("ImageLength", String.valueOf(i10));
        gVar2.F("Orientation", "0");
        gVar2.B();
    }

    private static boolean handles(int i7) {
        return (i7 & EXIF_MAGIC_NUMBER) == EXIF_MAGIC_NUMBER || i7 == MOTOROLA_TIFF_MAGIC_NUMBER || i7 == INTEL_TIFF_MAGIC_NUMBER;
    }

    private boolean hasJpegExifPreamble(byte[] bArr, int i7) {
        boolean z3 = bArr != null && i7 > JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length;
        if (z3) {
            int i10 = 0;
            while (true) {
                byte[] bArr2 = JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
                if (i10 >= bArr2.length) {
                    break;
                }
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
        return z3;
    }

    private int moveToExifSegmentAndGetLength() throws IOException {
        short uInt8;
        while (this.reader.getUInt8() == 255 && (uInt8 = this.reader.getUInt8()) != 218 && uInt8 != 217) {
            int uInt16 = this.reader.getUInt16() - 2;
            if (uInt8 == 225) {
                return uInt16;
            }
            long j6 = uInt16;
            if (this.reader.skip(j6) != j6) {
                return -1;
            }
        }
        return -1;
    }

    private int parseExifSegment(byte[] bArr, int i7) throws IOException {
        if (this.reader.read(bArr, i7) == i7 && hasJpegExifPreamble(bArr, i7)) {
            return parseExifSegment(new RandomAccessReader(bArr, i7));
        }
        return -1;
    }

    public int getOrientation() throws IOException {
        int iMoveToExifSegmentAndGetLength;
        if (handles(this.reader.getUInt16()) && (iMoveToExifSegmentAndGetLength = moveToExifSegmentAndGetLength()) != -1) {
            return parseExifSegment(new byte[iMoveToExifSegmentAndGetLength], iMoveToExifSegmentAndGetLength);
        }
        return -1;
    }

    public static void copyExif(Context context, int i7, int i10, Uri uri, String str) {
        if (context == null) {
            return;
        }
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                try {
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    copyExifAttributes(new g(inputStreamOpenInputStream), new g(str), i7, i10);
                    inputStreamOpenInputStream.close();
                } catch (Throwable th) {
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e10) {
                            e10.getMessage();
                        }
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e11.getMessage();
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
            }
        } catch (IOException e12) {
            e12.getMessage();
        }
    }

    private static int parseExifSegment(RandomAccessReader randomAccessReader) {
        ByteOrder byteOrder;
        short int16;
        int int32;
        int i7;
        int i10;
        short int17 = randomAccessReader.getInt16(6);
        if (int17 != MOTOROLA_TIFF_MAGIC_NUMBER && int17 == INTEL_TIFF_MAGIC_NUMBER) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        randomAccessReader.order(byteOrder);
        int int33 = randomAccessReader.getInt32(10) + 6;
        short int18 = randomAccessReader.getInt16(int33);
        for (int i11 = 0; i11 < int18; i11++) {
            int iCalcTagOffset = calcTagOffset(int33, i11);
            if (randomAccessReader.getInt16(iCalcTagOffset) == 274 && (int16 = randomAccessReader.getInt16(iCalcTagOffset + 2)) >= 1 && int16 <= 12 && (int32 = randomAccessReader.getInt32(iCalcTagOffset + 4)) >= 0 && (i7 = int32 + BYTES_PER_FORMAT[int16]) <= 4 && (i10 = iCalcTagOffset + 8) >= 0 && i10 <= randomAccessReader.length() && i7 >= 0 && i7 + i10 <= randomAccessReader.length()) {
                return randomAccessReader.getInt16(i10);
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[SYNTHETIC] */
    @RequiresApi(21)
    public static void copyExif(Context context, int i7, int i10, Uri uri, Uri uri2) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptor;
        if (context == null) {
            return;
        }
        InputStream inputStream = null;
        parcelFileDescriptorOpenFileDescriptor = null;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = null;
        inputStream = null;
        try {
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    g gVar = new g(inputStreamOpenInputStream);
                    parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri2, "rw");
                    copyExifAttributes(gVar, new g(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), i7, i10);
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException e10) {
                        e10.getMessage();
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException e11) {
                    e = e11;
                    parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                    inputStream = inputStreamOpenInputStream;
                    try {
                        e.getMessage();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e12) {
                                e12.getMessage();
                            }
                        }
                        if (parcelFileDescriptor == null) {
                        } else {
                            parcelFileDescriptor.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e13) {
                                e13.getMessage();
                            }
                        }
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                                throw th;
                            } catch (IOException e14) {
                                e14.getMessage();
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                    inputStream = inputStreamOpenInputStream;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (IOException e15) {
                e15.getMessage();
            }
        } catch (IOException e16) {
            e = e16;
            parcelFileDescriptor = null;
        } catch (Throwable th3) {
            th = th3;
            parcelFileDescriptor = null;
        }
    }

    @RequiresApi(21)
    public static void copyExif(Context context, g gVar, int i7, int i10, Uri uri) {
        if (context == null) {
            return;
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = null;
        try {
            try {
                try {
                    parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
                    copyExifAttributes(gVar, new g(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), i7, i10);
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (IOException e10) {
                            e10.getMessage();
                        }
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e11.getMessage();
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
            }
        } catch (IOException e12) {
            e12.getMessage();
        }
    }
}
