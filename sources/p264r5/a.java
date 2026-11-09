package p264r5;

import C0.C0127t;
import E.n0;
import E0.h;
import Ef.f;
import N8.q0;
import Pg.k;
import Wf.AbstractC0752a;
import Wf.E;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraDevice;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Rational;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.appcompat.widget.B0;
import androidx.camera.camera2.internal.C0947p0;
import androidx.camera.camera2.internal.C0949q0;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.utils.executor.g;
import androidx.core.widget.c;
import androidx.core.widget.d;
import com.facebook.react.bridge.ReadableArray;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.horcrux.svg.AbstractC1416m;
import com.horcrux.svg.C1420q;
import com.transsnet.mtn.sdk.util.NDKTools;
import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.RepaymentPlan;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.Utils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.chromium.support_lib_boundary.util.b;
import p135j0.AbstractC1775h;
import p135j0.O;
import p135j0.S;
import p135j0.U;
import p193n0.i;
import p355xf.o;
import p355xf.p;
import p355xf.q;
import p355xf.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static float C(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return d.c(edgeEffect, f10, f11);
        }
        c.a(edgeEffect, f10, f11);
        return f10;
    }

    public static void D(p150k1.a aVar, MediaCodec.BufferInfo bufferInfo, MediaExtractor mediaExtractor) {
        int iW = b.w(mediaExtractor, false);
        if (iW >= 0) {
            mediaExtractor.selectTrack(iW);
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(iW);
            Intrinsics.checkNotNullExpressionValue(trackFormat, "extractor.getTrackFormat(audioIndex)");
            int iA = aVar.a(trackFormat, true);
            int integer = trackFormat.getInteger("max-input-size");
            if (integer <= 0) {
                integer = 65536;
            }
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(integer);
            Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "allocateDirect(maxBufferSize)");
            if (Build.VERSION.SDK_INT >= 28) {
                long sampleSize = mediaExtractor.getSampleSize();
                if (sampleSize > integer) {
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) (sampleSize + ((long) 1024)));
                    Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "allocateDirect(maxBufferSize)");
                }
            }
            mediaExtractor.seekTo(0L, 0);
            boolean z3 = false;
            while (!z3) {
                int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
                if (sampleTrackIndex == iW) {
                    int sampleData = mediaExtractor.readSampleData(byteBufferAllocateDirect, 0);
                    bufferInfo.size = sampleData;
                    if (sampleData >= 0) {
                        bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                        bufferInfo.offset = 0;
                        bufferInfo.flags = 1;
                        aVar.g(iA, byteBufferAllocateDirect, bufferInfo, true);
                        mediaExtractor.advance();
                    } else {
                        bufferInfo.size = 0;
                        z3 = true;
                    }
                } else if (sampleTrackIndex == -1) {
                    z3 = true;
                }
            }
            mediaExtractor.unselectTrack(iW);
        }
    }

    public static final String E(Reader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter out = new StringWriter();
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        int i7 = reader.read(cArr);
        while (i7 >= 0) {
            out.write(cArr, 0, i7);
            i7 = reader.read(cArr);
        }
        String string = out.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static void F(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.wtf("StreamableVideo", "Failed to close file: ");
            }
        }
    }

    public static boolean G(File file, File out) throws Throwable {
        FileOutputStream fileOutputStream;
        Intrinsics.checkNotNullParameter(out, "out");
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                FileChannel infile = fileInputStream2.getChannel();
                fileOutputStream = new FileOutputStream(out);
                try {
                    FileChannel outfile = fileOutputStream.getChannel();
                    Intrinsics.checkNotNullExpressionValue(infile, "infile");
                    Intrinsics.checkNotNullExpressionValue(outfile, "outfile");
                    boolean zG = g(infile, outfile);
                    F(fileInputStream2);
                    F(fileOutputStream);
                    if (!zG) {
                        out.delete();
                    }
                    return zG;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    F(fileInputStream);
                    F(fileOutputStream);
                    out.delete();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static final void H(Function2 function2, AbstractC0752a abstractC0752a, AbstractC0752a abstractC0752a2) {
        try {
            Continuation continuationB = f.b(f.a(abstractC0752a, abstractC0752a2, function2));
            o oVar = q.f43977a;
            p015ag.a.g(Unit.f38893a, continuationB);
        } catch (Throwable th) {
            th = th;
            if (th instanceof E) {
                th = ((E) th).f10804a;
            }
            o oVar2 = q.f43977a;
            abstractC0752a2.resumeWith(g.f(th));
            throw th;
        }
    }

    public static Bitmap I(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i7 = bounds.left;
        int i10 = bounds.top;
        int i11 = bounds.right;
        int i12 = bounds.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i7, i10, i11, i12);
        return bitmapCreateBitmap;
    }

    public static int J(ReadableArray readableArray, float[] fArr, float f10) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f10;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f10;
        return 6;
    }

    public static String a(String str) {
        String encryptKey = NDKTools.getEncryptKey();
        try {
            Charset charset = StandardCharsets.UTF_8;
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(encryptKey.getBytes(charset)));
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            if (!TextUtils.isEmpty(null)) {
                throw null;
            }
            cipher.init(2, secretKeyGenerateSecret);
            return new String(cipher.doFinal(Base64.decode(str.getBytes(charset), 2)), charset);
        } catch (Exception unused) {
            throw new RuntimeException("3DES Error");
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String encryptKey = NDKTools.getEncryptKey();
        try {
            Charset charset = StandardCharsets.UTF_8;
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(encryptKey.getBytes(charset)));
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            if (!TextUtils.isEmpty(null)) {
                throw null;
            }
            cipher.init(1, secretKeyGenerateSecret);
            return new String(Base64.encode(cipher.doFinal(str.getBytes(charset)), 2));
        } catch (Exception unused) {
            throw new RuntimeException("3DES Error");
        }
    }

    public static LinkedHashMap c(TransferByLoanOpenParams params, String cardNo, CLRepaymentPlanData plan) {
        RepaymentPlan repaymentPlan;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(cardNo, "cardNo");
        Intrinsics.checkNotNullParameter(plan, "plan");
        List<RepaymentPlan> repaymentPlanList = plan.getRepaymentPlanList();
        LinkedHashMap linkedHashMapF = G.f(new Pair("loanAmount", Long.valueOf(params.getLoanAmount())), new Pair("accountType", 9), new Pair("cardNo", cardNo), new Pair("productSubId", plan.getProductSubId()), new Pair(FirebaseAnalytics.Param.TERM, plan.getTerm()), new Pair("loanTerm", plan.getLoanTerm()), new Pair("loanDays", plan.getLoanDays()), new Pair("termSpan", plan.getTermSpan()), new Pair("termSpanUnit", plan.getTermSpanUnit()), new Pair("repaymentDate", (repaymentPlanList == null || (repaymentPlan = (RepaymentPlan) CollectionsKt.L(repaymentPlanList)) == null) ? null : repaymentPlan.getRepaymentDate()), new Pair("repaymentPlanList", plan.getRepaymentPlanList()), new Pair("totalRepaymentAmount", plan.getOutstandingAmountSum()), new Pair("cashierContextId", params.getCashierContextId()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapF.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static String d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b7 : bArr) {
            String str = String.format("%02X:", Arrays.copyOf(new Object[]{Byte.valueOf(b7)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            sb2.append(str);
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public static HashMap e(Rect rect, boolean z3, Rational rational, int i7, int i10, int i11, HashMap map) {
        boolean z8 = false;
        p118hf.a.g(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((C0993n) entry.getValue()).f14108a.getWidth(), ((C0993n) entry.getValue()).f14108a.getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put((n0) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        Rational rationalB = androidx.camera.core.internal.utils.c.b(i7, rational);
        if (i10 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF5 = new RectF(0.0f, 0.0f, rationalB.getNumerator(), rationalB.getDenominator());
            if (i10 == 0) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.START);
            } else if (i10 == 1) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.CENTER);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException(C0.G.m(i10, "Unexpected scale type: "));
                }
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.END);
            }
            RectF rectF6 = new RectF();
            matrix2.mapRect(rectF6, rectF5);
            boolean z10 = z3 ^ (i11 == 1);
            boolean z11 = i7 == 0 && !z10;
            boolean z12 = i7 == 90 && z10;
            if (z11 || z12) {
                rectF2 = rectF6;
            } else {
                boolean z13 = i7 == 0 && z10;
                boolean z14 = i7 == 270 && !z10;
                if (z13 || z14) {
                    float fCenterX = rectF2.centerX();
                    float f10 = fCenterX + fCenterX;
                    rectF2 = new RectF(f10 - rectF6.right, rectF6.top, f10 - rectF6.left, rectF6.bottom);
                } else {
                    boolean z15 = i7 == 90 && !z10;
                    boolean z16 = i7 == 180 && z10;
                    if (z15 || z16) {
                        float fCenterY = rectF2.centerY();
                        float f11 = fCenterY + fCenterY;
                        rectF2 = new RectF(rectF6.left, f11 - rectF6.bottom, rectF6.right, f11 - rectF6.top);
                    } else {
                        boolean z17 = i7 == 180 && !z10;
                        if (i7 == 270 && z10) {
                            z8 = true;
                        }
                        if (!z17 && !z8) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z10 + " rotation " + i7);
                        }
                        float fCenterY2 = rectF2.centerY();
                        float f12 = fCenterY2 + fCenterY2;
                        RectF rectF7 = new RectF(rectF6.left, f12 - rectF6.bottom, rectF6.right, f12 - rectF6.top);
                        float fCenterX2 = rectF2.centerX();
                        float f13 = fCenterX2 + fCenterX2;
                        rectF2 = new RectF(f13 - rectF7.right, rectF7.top, f13 - rectF7.left, rectF7.bottom);
                    }
                }
            }
        }
        HashMap map3 = new HashMap();
        RectF rectF8 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF8, rectF2);
            Rect rect2 = new Rect();
            rectF8.round(rect2);
            map3.put((n0) entry2.getKey(), rect2);
        }
        return map3;
    }

    public static void f(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0121  */
    public static boolean g(FileChannel fileChannel, FileChannel fileChannel2) throws Exception {
        long j6;
        boolean z3;
        long j10;
        int i7 = 8;
        ByteBuffer atomBytes = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        long j11 = 0;
        ByteBuffer byteBuffer = null;
        long j12 = 0;
        long jPosition = 0;
        int i10 = 0;
        while (true) {
            Intrinsics.checkNotNullExpressionValue(atomBytes, "atomBytes");
            atomBytes.clear();
            int i11 = fileChannel.read(atomBytes);
            atomBytes.flip();
            if (i11 == atomBytes.capacity()) {
                j12 = atomBytes.getInt();
                i10 = atomBytes.getInt();
                int i12 = p120i1.a.f37402i;
                if (i10 == i12) {
                    if (j12 > 2147483647L || j12 < j11) {
                        throw new Exception("uInt32 value is too large");
                    }
                    int i13 = (int) j12;
                    j6 = j11;
                    ByteBuffer byteBufferOrder = ByteBuffer.allocate(i13).order(ByteOrder.BIG_ENDIAN);
                    atomBytes.rewind();
                    byteBufferOrder.put(atomBytes);
                    if (fileChannel.read(byteBufferOrder) >= i13 - i7) {
                        byteBufferOrder.flip();
                        jPosition = fileChannel.position();
                        byteBuffer = byteBufferOrder;
                        z3 = true;
                    } else {
                        byteBuffer = byteBufferOrder;
                        j10 = jPosition;
                        z3 = true;
                    }
                    if (i10 != p120i1.a.f37397d) {
                        Log.wtf("StreamableVideo", "last atom in file was not a moov atom");
                        return false;
                    }
                    if (j12 <= 2147483647L || j12 < j6) {
                        throw new Exception("uInt32 value is too large");
                    }
                    int i14 = (int) j12;
                    long j13 = i14;
                    long size = fileChannel.size() - j13;
                    ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(i14).order(ByteOrder.BIG_ENDIAN);
                    Intrinsics.checkNotNullExpressionValue(byteBufferOrder2, "allocate(moovAtomSize).order(ByteOrder.BIG_ENDIAN)");
                    byteBufferOrder2.clear();
                    int i15 = fileChannel.read(byteBufferOrder2, size);
                    byteBufferOrder2.flip();
                    if (i15 != byteBufferOrder2.capacity()) {
                        throw new Exception("failed to read moov atom");
                    }
                    if (byteBufferOrder2.getInt(12) == p120i1.a.f37404k) {
                        throw new Exception("this utility does not support compressed moov atoms yet");
                    }
                    while (byteBufferOrder2.remaining() >= 8) {
                        int iPosition = byteBufferOrder2.position();
                        int i16 = byteBufferOrder2.getInt(iPosition + 4);
                        int i17 = p120i1.a.f37405l;
                        i14 = i14;
                        if (i16 == i17 || i16 == p120i1.a.f37406m) {
                            long j14 = size;
                            if (byteBufferOrder2.getInt(iPosition) > byteBufferOrder2.remaining()) {
                                throw new Exception("bad atom size");
                            }
                            byteBufferOrder2.position(iPosition + 12);
                            if (byteBufferOrder2.remaining() < 4) {
                                throw new Exception("malformed atom");
                            }
                            int i18 = byteBufferOrder2.getInt();
                            if (i18 < 0) {
                                throw new Exception("uInt32 value is too large");
                            }
                            if (i16 == i17) {
                                if (byteBufferOrder2.remaining() < i18 * 4) {
                                    throw new Exception("bad atom size/element count");
                                }
                                for (int i19 = 0; i19 < i18; i19++) {
                                    int i20 = byteBufferOrder2.getInt(byteBufferOrder2.position());
                                    int i21 = i20 + i14;
                                    if (i20 < 0 && i21 >= 0) {
                                        throw new Exception("This is bug in original qt-faststart.c: stco atom should be extended to co64 atom as new offset value overflows uint32, but is not implemented.");
                                    }
                                    byteBufferOrder2.putInt(i21);
                                }
                            } else if (i16 == p120i1.a.f37406m) {
                                Log.wtf("StreamableVideo", "patching co64 atom...");
                                if (byteBufferOrder2.remaining() < i18 * 8) {
                                    throw new Exception("bad atom size/element count");
                                }
                                for (int i22 = 0; i22 < i18; i22++) {
                                    byteBufferOrder2.putLong(byteBufferOrder2.getLong(byteBufferOrder2.position()) + j13);
                                }
                            }
                            size = j14;
                        } else {
                            byteBufferOrder2.position(byteBufferOrder2.position() + 1);
                        }
                    }
                    long j15 = size;
                    fileChannel.position(j10);
                    if (byteBuffer != null) {
                        byteBuffer.rewind();
                        fileChannel2.write(byteBuffer);
                    }
                    byteBufferOrder2.rewind();
                    fileChannel2.write(byteBufferOrder2);
                    fileChannel.transferTo(j10, j15 - j10, fileChannel2);
                    return z3;
                }
                j6 = j11;
                if (j12 == 1) {
                    atomBytes.clear();
                    atomBytes.clear();
                    int i23 = fileChannel.read(atomBytes);
                    atomBytes.flip();
                    if (i23 == atomBytes.capacity()) {
                        long j16 = atomBytes.getLong();
                        if (j16 < j6) {
                            throw new Exception("uInt64 value is too large");
                        }
                        z3 = true;
                        fileChannel.position((fileChannel.position() + j16) - ((long) 16));
                        j12 = j16;
                    }
                } else {
                    z3 = true;
                    fileChannel.position((fileChannel.position() + j12) - ((long) 8));
                }
                if (i10 != p120i1.a.f37394a && i10 != p120i1.a.f37395b && i10 != p120i1.a.f37396c && i10 != p120i1.a.f37397d && i10 != p120i1.a.f37398e && i10 != p120i1.a.f37399f && i10 != p120i1.a.f37400g && i10 != p120i1.a.f37401h && i10 != p120i1.a.f37403j && i10 != i12) {
                    Log.wtf("StreamableVideo", "encountered non-QT top-level atom (is this a QuickTime file?)");
                } else if (j12 >= 8) {
                    j11 = j6;
                    atomBytes = atomBytes;
                    i7 = 8;
                }
                j10 = jPosition;
                if (i10 != p120i1.a.f37397d) {
                    Log.wtf("StreamableVideo", "last atom in file was not a moov atom");
                    return false;
                }
                if (j12 <= 2147483647L) {
                }
                throw new Exception("uInt32 value is too large");
            }
            j6 = j11;
            z3 = true;
            j10 = jPosition;
            if (i10 != p120i1.a.f37397d) {
                Log.wtf("StreamableVideo", "last atom in file was not a moov atom");
                return false;
            }
            if (j12 <= 2147483647L) {
            }
            throw new Exception("uInt32 value is too large");
        }
    }

    public static p193n0.d h(p149k0.a aVar, List migrations, p015ag.c scope, h produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        U storage = new U(i.f39815a, S.f37981a, new C0127t(produceFile, 18));
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new p193n0.d(new p193n0.d(new O(storage, C1849p.c(AbstractC1775h.f38045a.getInitializer(migrations)), aVar, scope)));
    }

    public static CameraDevice.StateCallback i(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return new C0949q0();
        }
        return arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new C0947p0(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double j(double d2, double d10, double d11, String str) {
        double dDoubleValue;
        byte b7 = 2;
        String strTrim = str.trim();
        int length = strTrim.length();
        int i7 = length - 1;
        if (length == 0 || strTrim.equals("normal")) {
            return 0.0d;
        }
        if (strTrim.codePointAt(i7) == 37) {
            return (Double.valueOf(strTrim.substring(0, i7)).doubleValue() / 100.0d) * d2;
        }
        int i10 = length - 2;
        if (i10 > 0) {
            String strSubstring = strTrim.substring(i10);
            strSubstring.getClass();
            switch (strSubstring.hashCode()) {
                case 3178:
                    b7 = !strSubstring.equals("cm") ? (byte) -1 : (byte) 0;
                    break;
                case 3240:
                    b7 = !strSubstring.equals("em") ? (byte) -1 : (byte) 1;
                    break;
                case 3365:
                    if (!strSubstring.equals("in")) {
                        b7 = -1;
                    }
                    break;
                case 3488:
                    b7 = !strSubstring.equals("mm") ? (byte) -1 : (byte) 3;
                    break;
                case 3571:
                    b7 = !strSubstring.equals("pc") ? (byte) -1 : (byte) 4;
                    break;
                case 3588:
                    b7 = !strSubstring.equals("pt") ? (byte) -1 : (byte) 5;
                    break;
                case 3592:
                    b7 = !strSubstring.equals("px") ? (byte) -1 : (byte) 6;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            switch (b7) {
                case 0:
                    d11 = 35.43307d;
                    length = i10;
                    break;
                case 1:
                    length = i10;
                    break;
                case 2:
                    d11 = 90.0d;
                    length = i10;
                    break;
                case 3:
                    d11 = 3.543307d;
                    length = i10;
                    break;
                case 4:
                    d11 = 15.0d;
                    length = i10;
                    break;
                case 5:
                    d11 = 1.25d;
                    length = i10;
                    break;
                case 6:
                    length = i10;
                    d11 = 1.0d;
                    break;
                default:
                    d11 = 1.0d;
                    break;
            }
            dDoubleValue = Double.valueOf(strTrim.substring(0, length)).doubleValue() * d11;
        } else {
            dDoubleValue = Double.valueOf(strTrim).doubleValue();
        }
        return dDoubleValue * d10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double k(C1420q c1420q, double d2, double d10, double d11) {
        double d12;
        if (c1420q == null) {
            return 0.0d;
        }
        int i7 = AbstractC1416m.f23531a[c1420q.f23544b.ordinal()];
        double d13 = c1420q.f23543a;
        switch (i7) {
            case 1:
            case 2:
                d11 = 1.0d;
                return q0.x(d13, d11, d10, 0.0d);
            case 3:
                d12 = (d13 / 100.0d) * d2;
                return d12 + 0.0d;
            case 4:
                return q0.x(d13, d11, d10, 0.0d);
            case 5:
                d11 /= 2.0d;
                return q0.x(d13, d11, d10, 0.0d);
            case 6:
                d11 = 35.43307d;
                return q0.x(d13, d11, d10, 0.0d);
            case 7:
                d11 = 3.543307d;
                return q0.x(d13, d11, d10, 0.0d);
            case 8:
                d11 = 90.0d;
                return q0.x(d13, d11, d10, 0.0d);
            case 9:
                d11 = 1.25d;
                return q0.x(d13, d11, d10, 0.0d);
            case 10:
                d11 = 15.0d;
                return q0.x(d13, d11, d10, 0.0d);
            default:
                d12 = d13 * d10;
                return d12 + 0.0d;
        }
    }

    public static String m() {
        String cid = PhoneUtils.getCID();
        if (TextUtils.isEmpty(cid)) {
            try {
                Object systemService = Utils.getApp().getSystemService("phone");
                Intrinsics.f(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                Iterator<CellInfo> it = ((TelephonyManager) systemService).getAllCellInfo().iterator();
                while (true) {
                    if (it.hasNext()) {
                        CellInfo next = it.next();
                        if (next instanceof CellInfoCdma) {
                            cid = String.valueOf(((CellInfoCdma) next).getCellIdentity().getBasestationId());
                        } else if (next instanceof CellInfoGsm) {
                            cid = String.valueOf(((CellInfoGsm) next).getCellIdentity().getCid());
                        } else if (next instanceof CellInfoLte) {
                            cid = String.valueOf(((CellInfoLte) next).getCellIdentity().getCi());
                        } else if (next instanceof CellInfoWcdma) {
                            cid = String.valueOf(((CellInfoWcdma) next).getCellIdentity().getCid());
                        }
                    } else {
                        cid = "0";
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        Intrinsics.e(cid);
        return cid;
    }

    public static final String o() {
        Object objF;
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        int iMyPid = Process.myPid();
        if (iMyPid <= 0) {
            return null;
        }
        try {
            o oVar = q.f43977a;
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + iMyPid + "/cmdline"));
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                String line = bufferedReader.readLine();
                Intrinsics.checkNotNullExpressionValue(line, "readLine(...)");
                int length = line.length() - 1;
                int i7 = 0;
                boolean z3 = false;
                while (i7 <= length) {
                    boolean z8 = Intrinsics.h(line.charAt(!z3 ? i7 : length), 32) <= 0;
                    if (z3) {
                        if (!z8) {
                            break;
                        }
                        length--;
                    } else if (z8) {
                        i7++;
                    } else {
                        z3 = true;
                    }
                }
                objF = line.subSequence(i7, length + 1).toString();
                try {
                    o oVar2 = q.f43977a;
                    bufferedReader.close();
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    o oVar3 = q.f43977a;
                    g.f(th);
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th2;
            }
        } catch (Throwable th3) {
            o oVar4 = q.f43977a;
            objF = g.f(th3);
        }
        return (String) (objF instanceof p ? null : objF);
    }

    public static float p(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return d.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable q(int i7, Context context) {
        return B0.b().d(i7, context);
    }

    public static String r() {
        Enumeration<NetworkInterface> networkInterfaces;
        String str;
        String strSubstring;
        String upperCase = "02:00:00:00:00:00";
        if (y("02:00:00:00:00:00")) {
            Object systemService = Utils.getApp().getApplicationContext().getSystemService("wifi");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            upperCase = ((WifiManager) systemService).getConnectionInfo().getMacAddress();
        }
        String strD = null;
        if (y(upperCase)) {
            try {
                byte[] hardwareAddress = NetworkInterface.getByInetAddress(s()).getHardwareAddress();
                StringBuffer stringBuffer = new StringBuffer();
                int length = hardwareAddress.length;
                for (int i7 = 0; i7 < length; i7++) {
                    if (i7 != 0) {
                        stringBuffer.append(':');
                    }
                    String hexString = Integer.toHexString(hardwareAddress[i7] & UnsignedBytes.MAX_VALUE);
                    if (hexString.length() == 1) {
                        hexString = "0" + hexString;
                    }
                    stringBuffer.append(hexString);
                }
                String string = stringBuffer.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                upperCase = string.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            } catch (Exception unused) {
                upperCase = null;
            }
        }
        if (y(upperCase)) {
            try {
                networkInterfaces = NetworkInterface.getNetworkInterfaces();
            } catch (SocketException e10) {
                e10.printStackTrace();
                networkInterfaces = null;
            }
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    try {
                        Intrinsics.e(networkInterfaceNextElement);
                        strD = d(networkInterfaceNextElement.getHardwareAddress());
                        if (strD != null) {
                            break;
                        }
                    } catch (SocketException e11) {
                        e11.printStackTrace();
                    }
                }
            }
            upperCase = strD;
        }
        if (!y(upperCase)) {
            return upperCase;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("busybox ifconfig").getInputStream()));
            str = "";
            while (true) {
                try {
                    strSubstring = bufferedReader.readLine();
                    Intrinsics.e(strSubstring);
                    if (StringsKt.A(strSubstring, "HWaddr", false)) {
                        break;
                    }
                    str = str + ((Object) strSubstring);
                } catch (Exception e12) {
                    e = e12;
                    e.printStackTrace();
                    strSubstring = str;
                }
            }
        } catch (Exception e13) {
            e = e13;
            str = "";
        }
        if (strSubstring == null) {
            return "";
        }
        if (strSubstring.length() > 0 && StringsKt.A(strSubstring, "HWaddr", false)) {
            strSubstring = strSubstring.substring(StringsKt.E(strSubstring, "HWaddr", 0, false, 6) + 6, strSubstring.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        return strSubstring;
    }

    public static InetAddress s() {
        InetAddress inetAddress;
        SocketException e10;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            inetAddress = null;
            while (networkInterfaces.hasMoreElements()) {
                try {
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    Intrinsics.f(networkInterfaceNextElement, "null cannot be cast to non-null type java.net.NetworkInterface");
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        try {
                            if (!inetAddressNextElement.isLoopbackAddress()) {
                                String hostAddress = inetAddressNextElement.getHostAddress();
                                Intrinsics.checkNotNullExpressionValue(hostAddress, "getHostAddress(...)");
                                if (StringsKt.E(hostAddress, ":", 0, false, 6) == -1) {
                                    inetAddress = inetAddressNextElement;
                                    break;
                                }
                            }
                            inetAddress = null;
                        } catch (SocketException e11) {
                            e10 = e11;
                            inetAddress = inetAddressNextElement;
                            e10.printStackTrace();
                            return inetAddress;
                        }
                    }
                    if (inetAddress != null) {
                        break;
                    }
                } catch (SocketException e12) {
                    e10 = e12;
                }
            }
            return inetAddress;
        } catch (SocketException e13) {
            inetAddress = null;
            e10 = e13;
        }
    }

    public static a t(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            cls.getSimpleName();
            return new T4.a();
        }
        String simpleName = cls.getSimpleName();
        T4.b bVar = new T4.b();
        bVar.f8940a = Logger.getLogger(simpleName);
        return bVar;
    }

    public static String u() {
        String macAddress = DeviceUtils.getMacAddress();
        try {
            if (y(macAddress)) {
                ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
                Intrinsics.checkNotNullExpressionValue(list, "list(...)");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] hardwareAddress = ((NetworkInterface) it.next()).getHardwareAddress();
                    if (hardwareAddress != null) {
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b7 : hardwareAddress) {
                            String str = String.format("%02X:", Arrays.copyOf(new Object[]{Byte.valueOf(b7)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            sb2.append(str);
                        }
                        if (sb2.length() > 0) {
                            sb2.deleteCharAt(sb2.length() - 1);
                        }
                        macAddress = sb2.toString();
                    }
                }
            }
            if (y(macAddress)) {
                macAddress = r();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return y(macAddress) ? "02:00:00:00:00:00" : macAddress;
    }

    public static final /* synthetic */ Point w(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static u x() {
        String bssid;
        u uVar;
        Integer num = -1;
        u uVar2 = null;
        String str = null;
        try {
            Object systemService = Utils.getApp().getSystemService("wifi");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            WifiManager wifiManager = (WifiManager) systemService;
            if (wifiManager.isWifiEnabled()) {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                String ssid = connectionInfo != null ? connectionInfo.getSSID() : null;
                if (TextUtils.isEmpty(ssid) || (ssid != null && StringsKt.A(ssid, "unknown ssid", true))) {
                    int networkId = wifiManager.getConnectionInfo().getNetworkId();
                    for (WifiConfiguration wifiConfiguration : wifiManager.getConfiguredNetworks()) {
                        if (wifiConfiguration.networkId == networkId) {
                            ssid = wifiConfiguration.SSID;
                            break;
                        }
                    }
                }
                WifiInfo connectionInfo2 = wifiManager.getConnectionInfo();
                Integer numValueOf = connectionInfo2 != null ? Integer.valueOf(connectionInfo2.getRssi()) : null;
                WifiInfo connectionInfo3 = wifiManager.getConnectionInfo();
                if ("02:00:00:00:00:00".equals(connectionInfo3 != null ? connectionInfo3.getBSSID() : null)) {
                    bssid = "";
                } else {
                    WifiInfo connectionInfo4 = wifiManager.getConnectionInfo();
                    bssid = connectionInfo4 != null ? connectionInfo4.getBSSID() : null;
                }
                uVar = new u(ssid, Integer.valueOf(numValueOf != null ? numValueOf.intValue() : -1), bssid);
                str = ssid;
                num = numValueOf;
            } else {
                bssid = null;
                uVar = null;
            }
            try {
                if (TextUtils.isEmpty(str) || (str != null && StringsKt.A(str, "unknown ssid", true))) {
                    Object systemService2 = Utils.getApp().getSystemService("connectivity");
                    Intrinsics.f(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService2).getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected()) {
                        return new u(activeNetworkInfo.getExtraInfo(), Integer.valueOf(num != null ? num.intValue() : -1), bssid);
                    }
                }
                return uVar;
            } catch (Throwable th) {
                th = th;
                uVar2 = uVar;
                th.printStackTrace();
                return uVar2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean y(String str) {
        return TextUtils.isEmpty(str) || "please open wifi".equals(str) || "02:00:00:00:00:00".equals(str);
    }

    public static final boolean z(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        try {
            k kVar2 = new k();
            long j6 = kVar.f7358b;
            long j10 = 64;
            if (j6 <= 64) {
                j10 = j6;
            }
            kVar.d(kVar2, 0L, j10);
            for (int i7 = 0; i7 < 16 && !kVar2.exhausted(); i7++) {
                int utf8CodePoint = kVar2.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
        }
    }

    public abstract boolean A(Class cls);

    public abstract void B(String str);

    public abstract Method l(Class cls, Field field);

    public abstract Constructor n(Class cls);

    public abstract String[] v(Class cls);
}
