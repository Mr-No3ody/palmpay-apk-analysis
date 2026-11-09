package com.bumptech.glide.load.resource.bitmap;

import com.adjust.sdk.Constants;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ImageHeaderParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f20923a = "Exif\u0000\u0000".getBytes(Charset.forName(Constants.ENCODING));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f20924b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int a(DefaultImageHeaderParser$Reader defaultImageHeaderParser$Reader, ArrayPool arrayPool) throws IOException {
        int uInt16;
        short uInt8;
        try {
            int uInt17 = defaultImageHeaderParser$Reader.getUInt16();
            if ((uInt17 & 65496) != 65496 && uInt17 != 19789 && uInt17 != 18761) {
                return -1;
            }
            while (true) {
                if (defaultImageHeaderParser$Reader.getUInt8() == 255 && (uInt8 = defaultImageHeaderParser$Reader.getUInt8()) != 218 && uInt8 != 217) {
                    uInt16 = defaultImageHeaderParser$Reader.getUInt16() - 2;
                    if (uInt8 == 225) {
                        break;
                    }
                    long j6 = uInt16;
                    if (defaultImageHeaderParser$Reader.skip(j6) != j6) {
                        uInt16 = -1;
                        break;
                    }
                } else {
                    uInt16 = -1;
                    break;
                }
            }
            if (uInt16 == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) arrayPool.get(uInt16, byte[].class);
            try {
                return c(defaultImageHeaderParser$Reader, bArr, uInt16);
            } finally {
                arrayPool.put(bArr);
            }
        } catch (k unused) {
        }
    }

    public static ImageHeaderParser.ImageType b(DefaultImageHeaderParser$Reader defaultImageHeaderParser$Reader) throws IOException {
        try {
            int uInt16 = defaultImageHeaderParser$Reader.getUInt16();
            if (uInt16 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int uInt8 = (uInt16 << 8) | defaultImageHeaderParser$Reader.getUInt8();
            if (uInt8 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int uInt9 = (uInt8 << 8) | defaultImageHeaderParser$Reader.getUInt8();
            if (uInt9 == -1991225785) {
                defaultImageHeaderParser$Reader.skip(21L);
                try {
                    return defaultImageHeaderParser$Reader.getUInt8() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (k unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (uInt9 == 1380533830) {
                defaultImageHeaderParser$Reader.skip(4L);
                if (((defaultImageHeaderParser$Reader.getUInt16() << 16) | defaultImageHeaderParser$Reader.getUInt16()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int uInt17 = (defaultImageHeaderParser$Reader.getUInt16() << 16) | defaultImageHeaderParser$Reader.getUInt16();
                if ((uInt17 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i7 = uInt17 & 255;
                if (i7 != 88) {
                    if (i7 != 76) {
                        return ImageHeaderParser.ImageType.WEBP;
                    }
                    defaultImageHeaderParser$Reader.skip(4L);
                    return (defaultImageHeaderParser$Reader.getUInt8() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                defaultImageHeaderParser$Reader.skip(4L);
                short uInt10 = defaultImageHeaderParser$Reader.getUInt8();
                if ((uInt10 & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                return (uInt10 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((defaultImageHeaderParser$Reader.getUInt16() << 16) | defaultImageHeaderParser$Reader.getUInt16()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int uInt18 = (defaultImageHeaderParser$Reader.getUInt16() << 16) | defaultImageHeaderParser$Reader.getUInt16();
            if (uInt18 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i10 = 0;
            boolean z3 = uInt18 == 1635150182;
            defaultImageHeaderParser$Reader.skip(4L);
            int i11 = uInt9 - 16;
            if (i11 % 4 == 0) {
                while (i10 < 5 && i11 > 0) {
                    int uInt19 = (defaultImageHeaderParser$Reader.getUInt16() << 16) | defaultImageHeaderParser$Reader.getUInt16();
                    if (uInt19 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (uInt19 == 1635150182) {
                        z3 = true;
                    }
                    i10++;
                    i11 -= 4;
                }
            }
            return z3 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (k unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int c(DefaultImageHeaderParser$Reader defaultImageHeaderParser$Reader, byte[] bArr, int i7) {
        int i10;
        int i11;
        if (defaultImageHeaderParser$Reader.read(bArr, i7) == i7) {
            byte[] bArr2 = f20923a;
            boolean z3 = bArr != null && i7 > bArr2.length;
            if (z3) {
                for (int i12 = 0; i12 < bArr2.length; i12++) {
                    if (bArr[i12] != bArr2[i12]) {
                        z3 = false;
                        break;
                    }
                }
            }
            if (z3) {
                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i7);
                short s3 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
                byteBuffer.order(s3 != 18761 ? s3 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                int i13 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
                int i14 = i13 + 6;
                short s8 = byteBuffer.remaining() - i14 >= 2 ? byteBuffer.getShort(i14) : (short) -1;
                for (int i15 = 0; i15 < s8; i15++) {
                    int i16 = (i15 * 12) + i13 + 8;
                    if ((byteBuffer.remaining() - i16 >= 2 ? byteBuffer.getShort(i16) : (short) -1) == 274) {
                        int i17 = i16 + 2;
                        short s10 = byteBuffer.remaining() - i17 >= 2 ? byteBuffer.getShort(i17) : (short) -1;
                        if (s10 >= 1 && s10 <= 12) {
                            int i18 = i16 + 4;
                            int i19 = byteBuffer.remaining() - i18 >= 4 ? byteBuffer.getInt(i18) : -1;
                            if (i19 >= 0 && (i10 = i19 + f20924b[s10]) <= 4 && (i11 = i16 + 8) >= 0 && i11 <= byteBuffer.remaining() && i10 >= 0 && i10 + i11 <= byteBuffer.remaining()) {
                                if (byteBuffer.remaining() - i11 >= 2) {
                                    return byteBuffer.getShort(i11);
                                }
                                return -1;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int getOrientation(InputStream inputStream, ArrayPool arrayPool) {
        J1.g.c(inputStream, "Argument must not be null");
        j jVar = new j(inputStream);
        J1.g.c(arrayPool, "Argument must not be null");
        return a(jVar, arrayPool);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType getType(InputStream inputStream) {
        J1.g.c(inputStream, "Argument must not be null");
        return b(new j(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType getType(ByteBuffer byteBuffer) {
        J1.g.c(byteBuffer, "Argument must not be null");
        return b(new j(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int getOrientation(ByteBuffer byteBuffer, ArrayPool arrayPool) {
        J1.g.c(byteBuffer, "Argument must not be null");
        j jVar = new j(byteBuffer);
        J1.g.c(arrayPool, "Argument must not be null");
        return a(jVar, arrayPool);
    }
}
