package com.facebook.imageutils;

import Rf.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.G;
import p355xf.H;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/imageutils/WebpUtil;", "", "Ljava/io/InputStream;", "stream", "Lkotlin/Pair;", "", "getSize", "(Ljava/io/InputStream;)Lkotlin/Pair;", "get2BytesAsInt", "(Ljava/io/InputStream;)I", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebpUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebpUtil.kt\ncom/facebook/imageutils/WebpUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n2632#2,3:183\n*S KotlinDebug\n*F\n+ 1 WebpUtil.kt\ncom/facebook/imageutils/WebpUtil\n*L\n144#1:183,3\n*E\n"})
public final class WebpUtil {

    @NotNull
    public static final WebpUtil INSTANCE = new WebpUtil();

    public static boolean a(String str, byte[] bArr) {
        if (bArr.length == str.length()) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Iterable intRange = new IntRange(0, bArr.length - 1, 1);
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                Iterator it = intRange.iterator();
                while (((b) it).f8613c) {
                    int iA = ((C) it).a();
                    if (((byte) str.charAt(iA)) != bArr[iA]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (short s3 : bArr) {
            G g7 = H.f43952b;
            sb2.append((char) (s3 & 65535));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static void c(InputStream inputStream) throws IOException {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    public static Pair d(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        int i7 = inputStream.read() & 255;
        int i10 = inputStream.read() & 255;
        int i11 = inputStream.read() & 255;
        if (i7 == 157 && i10 == 1 && i11 == 42) {
            return new Pair(Integer.valueOf(get2BytesAsInt(inputStream)), Integer.valueOf(get2BytesAsInt(inputStream)));
        }
        return null;
    }

    public static Pair e(InputStream inputStream) throws IOException {
        c(inputStream);
        if ((inputStream.read() & 255) != 47) {
            return null;
        }
        int i7 = inputStream.read() & 255;
        int i10 = inputStream.read();
        return new Pair(Integer.valueOf((i7 | ((i10 & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & 255) << 2) | ((i10 & JfifUtil.MARKER_SOFn) >> 6)) + 1));
    }

    public static Pair f(InputStream inputStream) throws IOException {
        inputStream.skip(8L);
        return new Pair(Integer.valueOf(((inputStream.read() & 255) | ((inputStream.read() & 255) << 8) | ((inputStream.read() & 255) << 16)) + 1), Integer.valueOf((((inputStream.read() & 255) << 16) | ((inputStream.read() & 255) << 8) | (inputStream.read() & 255)) + 1));
    }

    @JvmStatic
    public static final int get2BytesAsInt(@NotNull InputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        INSTANCE.getClass();
        return ((stream.read() & 255) << 8) | (stream.read() & 255);
    }

    @JvmStatic
    @Nullable
    public static final Pair<Integer, Integer> getSize(@NotNull InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        byte[] bArr = new byte[4];
        try {
            try {
                try {
                    stream.read(bArr);
                    INSTANCE.getClass();
                    if (!a("RIFF", bArr)) {
                        stream.close();
                        return null;
                    }
                    c(stream);
                    stream.read(bArr);
                    if (!a("WEBP", bArr)) {
                        stream.close();
                        return null;
                    }
                    stream.read(bArr);
                    String strB = b(bArr);
                    int iHashCode = strB.hashCode();
                    if (iHashCode != 2640674) {
                        if (iHashCode != 2640718) {
                            if (iHashCode == 2640730 && strB.equals("VP8X")) {
                                Pair<Integer, Integer> pairF = f(stream);
                                try {
                                    stream.close();
                                    return pairF;
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                    return pairF;
                                }
                            }
                        } else if (strB.equals("VP8L")) {
                            Pair<Integer, Integer> pairE = e(stream);
                            try {
                                stream.close();
                                return pairE;
                            } catch (IOException e11) {
                                e11.printStackTrace();
                                return pairE;
                            }
                        }
                    } else if (strB.equals("VP8 ")) {
                        Pair<Integer, Integer> pairD = d(stream);
                        try {
                            stream.close();
                            return pairD;
                        } catch (IOException e12) {
                            e12.printStackTrace();
                            return pairD;
                        }
                    }
                    stream.close();
                    return null;
                } catch (IOException e13) {
                    e13.printStackTrace();
                    stream.close();
                }
            } catch (IOException e14) {
                e14.printStackTrace();
            }
        } catch (Throwable th) {
            try {
                stream.close();
            } catch (IOException e15) {
                e15.printStackTrace();
            }
            throw th;
        }
    }
}
