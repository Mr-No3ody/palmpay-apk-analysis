package J3;

import Ab.r;
import C0.G;
import E.AbstractC0198c;
import N8.q0;
import Pa.n0;
import Wf.AbstractC0780y;
import Wf.I;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.hardware.camera2.CameraCharacteristics;
import android.location.LocationManager;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.camera.camera2.internal.F;
import androidx.camera.camera2.internal.compat.l;
import androidx.core.app.AbstractC1032a;
import androidx.emoji2.text.n;
import androidx.lifecycle.AbstractC1207q;
import com.adjust.sdk.Constants;
import com.facebook.cache.common.CacheKey;
import com.flexibank.sdk.api.FlexiBankApiAccountService;
import com.flexibank.sdk.k;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.luck.picture.lib.config.PictureMimeType;
import com.palmpay.lib.apm.network.NQEManager;
import com.tencent.mmkv.MMKV;
import com.transsnet.palmpay.core.base.IBaseSubscription;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.util.FileIOUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.spec.PSSParameterSpec;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.C1847n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.AbstractC1865d;
import kotlin.text.D;
import kotlin.text.y;
import okhttp3.J;
import okhttp3.U;
import p015ag.o;
import p051d9.C1624v;
import p220oa.g;
import t0.s;
import t0.t;
import t0.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile FlexiBankApiAccountService f4489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f4490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f4491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f4492d;

    public static final boolean A(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService(FirebaseAnalytics.Param.LOCATION);
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    public static final void B(IBaseSubscription iBaseSubscription, IBaseView iBaseView, Function0 request, Function1 onRequestSuccess, Function1 onResultError, boolean z3, boolean z8) {
        AbstractC1207q coroutineScope;
        Intrinsics.checkNotNullParameter(iBaseSubscription, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(onRequestSuccess, "onRequestSuccess");
        Intrinsics.checkNotNullParameter(onResultError, "onResultError");
        if (!NQEManager.INSTANCE.isNetworkOffline()) {
            if (z8 && iBaseView != null) {
                iBaseView.showLoadingDialog(true);
            }
            ((df.d) request.invoke()).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new p220oa.d(z8, iBaseView, onRequestSuccess, z3, onResultError, iBaseSubscription));
            return;
        }
        if (iBaseView == null || (coroutineScope = iBaseView.getCoroutineScope()) == null) {
            return;
        }
        p042cg.f fVar = I.f10809a;
        AbstractC0780y.m(coroutineScope, o.f11960a, null, new p220oa.c(onResultError, null), 2);
    }

    public static /* synthetic */ void C(j jVar, IBaseView iBaseView, Function0 function0, Function1 function1, C1624v c1624v, boolean z3, boolean z8, int i7) {
        Function1 d2 = c1624v;
        if ((i7 & 8) != 0) {
            d2 = new D(9);
        }
        Function1 function2 = d2;
        if ((i7 & 16) != 0) {
            z3 = true;
        }
        B(jVar, iBaseView, function0, function1, function2, z3, z8);
    }

    public static final void D(IBaseSubscription iBaseSubscription, IBaseView iBaseView, Function1 request, Function1 onRequestSuccess, Function1 onResultError, boolean z3, boolean z8) {
        AbstractC1207q coroutineScope;
        AbstractC1207q coroutineScope2;
        Intrinsics.checkNotNullParameter(iBaseSubscription, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(onRequestSuccess, "onRequestSuccess");
        Intrinsics.checkNotNullParameter(onResultError, "onResultError");
        if (NQEManager.INSTANCE.isNetworkOffline()) {
            if (iBaseView == null || (coroutineScope2 = iBaseView.getCoroutineScope()) == null) {
                return;
            }
            p042cg.f fVar = I.f10809a;
            AbstractC0780y.m(coroutineScope2, o.f11960a, null, new p220oa.e(onResultError, null), 2);
            return;
        }
        if (iBaseView == null || (coroutineScope = iBaseView.getCoroutineScope()) == null) {
            return;
        }
        p042cg.f fVar2 = I.f10809a;
        AbstractC0780y.m(coroutineScope, o.f11960a, null, new g(z8, iBaseView, onRequestSuccess, z3, onResultError, request, null), 2);
    }

    public static /* synthetic */ void E(IBaseSubscription iBaseSubscription, IBaseView iBaseView, Function1 function1, Function1 function2, Function1 function3, boolean z3, boolean z8, int i7) {
        if ((i7 & 8) != 0) {
            function3 = new D(8);
        }
        Function1 function4 = function3;
        if ((i7 & 16) != 0) {
            z3 = true;
        }
        boolean z10 = z3;
        if ((i7 & 32) != 0) {
            z8 = false;
        }
        D(iBaseSubscription, iBaseView, function1, function2, function4, z10, z8);
    }

    public static J J(String str) {
        J j6 = J.f40577k.parse(str);
        if (j6 != null) {
            return j6;
        }
        throw new NullPointerException("unable to parse url");
    }

    public static ArrayList K(U client, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(client, "client");
        if (arrayList.isEmpty()) {
            Intrinsics.checkNotNullParameter(client, "client");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(d(client));
            arrayList2.add(c(client));
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        CollectionsKt.B(arrayList);
        arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            switch (((Number) it.next()).intValue()) {
                case 0:
                    arrayList3.add(d(client));
                    break;
                case 1:
                    arrayList3.add(c(client));
                    break;
                case 2:
                    Cg.b bVar = new Cg.b();
                    Intrinsics.checkNotNullParameter(client, "client");
                    bVar.f1554a = client;
                    J url = J("https://dns.alidns.com/dns-query");
                    Intrinsics.checkNotNullParameter(url, "url");
                    bVar.f1555b = url;
                    bVar.f1556c = false;
                    bVar.f1557d = false;
                    arrayList3.add(bVar.a());
                    break;
                case 3:
                    Cg.b bVar2 = new Cg.b();
                    Intrinsics.checkNotNullParameter(client, "client");
                    bVar2.f1554a = client;
                    J url2 = J("https://dns.google/dns-query");
                    Intrinsics.checkNotNullParameter(url2, "url");
                    bVar2.f1555b = url2;
                    InetAddress[] bootstrapDnsHosts = {k("8.8.4.4"), k("8.8.8.8")};
                    Intrinsics.checkNotNullParameter(bootstrapDnsHosts, "bootstrapDnsHosts");
                    bVar2.f1559f = C1847n.y(bootstrapDnsHosts);
                    bVar2.f1557d = true;
                    arrayList3.add(bVar2.a());
                    break;
                case 4:
                    Cg.b bVar3 = new Cg.b();
                    Intrinsics.checkNotNullParameter(client, "client");
                    bVar3.f1554a = client;
                    J url3 = J("https://doh.cleanbrowsing.org/doh/family-filter");
                    Intrinsics.checkNotNullParameter(url3, "url");
                    bVar3.f1555b = url3;
                    bVar3.f1556c = false;
                    arrayList3.add(bVar3.a());
                    break;
                case 5:
                    Cg.b bVar4 = new Cg.b();
                    Intrinsics.checkNotNullParameter(client, "client");
                    bVar4.f1554a = client;
                    J url4 = J("https://dns.cloudflare.com/.well-known/dns-query");
                    Intrinsics.checkNotNullParameter(url4, "url");
                    bVar4.f1555b = url4;
                    bVar4.f1556c = false;
                    bVar4.f1557d = true;
                    arrayList3.add(bVar4.a());
                    break;
                case 6:
                    Cg.b bVar5 = new Cg.b();
                    Intrinsics.checkNotNullParameter(client, "client");
                    bVar5.f1554a = client;
                    J url5 = J("https://doh.opendns.com/dns-query");
                    Intrinsics.checkNotNullParameter(url5, "url");
                    bVar5.f1555b = url5;
                    bVar5.f1556c = false;
                    bVar5.f1557d = false;
                    arrayList3.add(bVar5.a());
                    break;
                case 7:
                    Cg.b bVar6 = new Cg.b();
                    Intrinsics.checkNotNullParameter(client, "client");
                    bVar6.f1554a = client;
                    J url6 = J("https://dns.pub/dns-query");
                    Intrinsics.checkNotNullParameter(url6, "url");
                    bVar6.f1555b = url6;
                    bVar6.f1556c = false;
                    bVar6.f1557d = false;
                    arrayList3.add(bVar6.a());
                    break;
            }
        }
        arrayList3.size();
        return arrayList3;
    }

    public static final void L(Activity activity, p039cb.c cVar) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        F6.d.h("LocationServiceHelper", 3, "Quick check location service");
        if (y(activity) && A(activity)) {
            F6.d.h("LocationServiceHelper", 3, "Location service is ready");
            cVar.onLocationReady();
            return;
        }
        p367ya.a aVarD = p367ya.a.d();
        long j6 = aVarD.f44149a.getLong("last_location_dialog_show_time", 0L);
        int i7 = aVarD.f44149a.getInt("location_dialog_show_count", 0);
        if (System.currentTimeMillis() - j6 < 300000 || i7 >= 3) {
            F6.d.h("LocationServiceHelper", 3, "Should not show location dialog due to frequency limit");
            cVar.onLocationDenied();
            return;
        }
        if (!y(activity)) {
            F6.d.h("LocationServiceHelper", 3, "No location permission, requesting...");
            Intrinsics.checkNotNullParameter(activity, "activity");
            AbstractC1032a.g(activity, new String[]{"android.permission.ACCESS_COARSE_LOCATION", com.transsnet.palmpay.core.config.d.j()}, 1001);
            p367ya.a aVarD2 = p367ya.a.d();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i10 = aVarD2.f44149a.getInt("location_dialog_show_count", 0);
            MMKV mmkv = aVarD2.f44149a;
            mmkv.g(jCurrentTimeMillis, "last_location_dialog_show_time");
            mmkv.f(i10 + 1, "location_dialog_show_count");
            return;
        }
        if (A(activity)) {
            return;
        }
        F6.d.h("LocationServiceHelper", 3, "Location service disabled, guiding to settings...");
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            activity.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1002);
        } catch (Exception e10) {
            F6.d.c("LocationServiceHelper", "Failed to open GPS settings", e10);
        }
        p367ya.a aVarD3 = p367ya.a.d();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        int i11 = aVarD3.f44149a.getInt("location_dialog_show_count", 0);
        MMKV mmkv2 = aVarD3.f44149a;
        mmkv2.g(jCurrentTimeMillis2, "last_location_dialog_show_time");
        mmkv2.f(i11 + 1, "location_dialog_show_count");
    }

    public static androidx.emoji2.text.flatbuffer.b M(MappedByteBuffer mappedByteBuffer) throws IOException {
        ByteBuffer byteBuffer;
        long unsignedInt;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        n nVar = new n(byteBufferDuplicate);
        nVar.skip(4);
        int unsignedShort = nVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        nVar.skip(6);
        int i7 = 0;
        while (true) {
            byteBuffer = (ByteBuffer) nVar.f16906a;
            if (i7 >= unsignedShort) {
                unsignedInt = -1;
                break;
            }
            int i10 = byteBuffer.getInt();
            nVar.skip(4);
            unsignedInt = nVar.readUnsignedInt();
            nVar.skip(4);
            if (1835365473 == i10) {
                break;
            }
            i7++;
        }
        if (unsignedInt != -1) {
            nVar.skip((int) (unsignedInt - nVar.getPosition()));
            nVar.skip(12);
            long unsignedInt2 = nVar.readUnsignedInt();
            for (int i11 = 0; i11 < unsignedInt2; i11++) {
                int i12 = byteBuffer.getInt();
                long unsignedInt3 = nVar.readUnsignedInt();
                nVar.readUnsignedInt();
                if (1164798569 == i12 || 1701669481 == i12) {
                    byteBufferDuplicate.position((int) (unsignedInt3 + unsignedInt));
                    androidx.emoji2.text.flatbuffer.b bVar = new androidx.emoji2.text.flatbuffer.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f348d = byteBufferDuplicate;
                    bVar.f345a = iPosition;
                    int i13 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f346b = i13;
                    bVar.f347c = ((ByteBuffer) bVar.f348d).getShort(i13);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final t N(s sVar, float f10, t0.c rounding, List list) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        float f11 = 2;
        float f12 = f10 / f11;
        float f13 = 0.0f - f12;
        float f14 = 1.0f / f11;
        float f15 = 0.0f - f14;
        float f16 = f12 + 0.0f;
        float f17 = f14 + 0.0f;
        return G8.a.b(new float[]{f16, f17, f13, f17, f13, f15, f16, f15}, rounding, list, 0.0f, 0.0f);
    }

    public static String O(Bitmap bitmap, File file) {
        String absolutePath;
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                return FileIOUtils.saveBmpToExternalStorage("qrcode_" + TimeUtils.millis2String(System.currentTimeMillis(), new SimpleDateFormat("yyyy-MM-dd_HH-mm_ss", Locale.ENGLISH)) + PictureMimeType.JPG, bitmap, false);
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            absolutePath = File.createTempFile("qrcode_" + new SimpleDateFormat("yyyy-MM-dd_HH-mm_ss", Locale.getDefault()).format(new Date()), PictureMimeType.JPG, file).getAbsolutePath();
        } catch (IOException e11) {
            Log.e("QRCodeUtil", "saveImage: 1 ", e11);
            absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/qrcode_picture.jpg";
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(absolutePath));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        } catch (Exception e12) {
            Log.e("QRCodeUtil", "saveImage: 2 ", e12);
        }
        return absolutePath;
    }

    public static String P(CacheKey cacheKey) {
        String uriString = cacheKey.getUriString();
        Intrinsics.checkNotNullExpressionValue(uriString, "getUriString(...)");
        Charset charsetForName = Charset.forName(Constants.ENCODING);
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        byte[] bytes = uriString.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "makeSHA1HashBase64(...)");
            return strEncodeToString;
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final t Q(s sVar, int i7, float f10, t0.c rounding) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Star radii must both be greater than 0");
        }
        if (f10 >= 1.0f) {
            throw new IllegalArgumentException("innerRadius must be less than radius");
        }
        float[] fArr = new float[i7 * 4];
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            float f11 = u.f42312b / i7;
            long jE = u.e(1.0f, 2 * f11 * i11);
            fArr[i10] = AbstractC0198c.F(jE) + 0.0f;
            fArr[i10 + 1] = AbstractC0198c.G(jE) + 0.0f;
            long jE2 = u.e(f10, f11 * ((i11 * 2) + 1));
            int i12 = i10 + 3;
            fArr[i10 + 2] = AbstractC0198c.F(jE2) + 0.0f;
            i10 += 4;
            fArr[i12] = AbstractC0198c.G(jE2) + 0.0f;
        }
        return G8.a.b(fArr, rounding, null, 0.0f, 0.0f);
    }

    public static final double R(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (1.5d * ((double) context.getResources().getDisplayMetrics().density)) + 0.5d;
    }

    public static final float S(int i7, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (i7 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static void T(String errorCode, String errorMsg) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        n0.g().r("loan_transfer_trial_error", new HashMap(g(new Pair("error_code", errorCode), new Pair("error_msg", errorMsg))));
    }

    public static final Uf.c U(String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        return Uf.c.f9766c.fromLongs(AbstractC1865d.b(0, 16, hexString), AbstractC1865d.b(16, 32, hexString));
    }

    public static final Uf.c V(String hexDashString) {
        Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
        Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
        long jB = AbstractC1865d.b(0, 8, hexDashString);
        e(8, hexDashString);
        long jB2 = AbstractC1865d.b(9, 13, hexDashString);
        e(13, hexDashString);
        long jB3 = AbstractC1865d.b(14, 18, hexDashString);
        e(18, hexDashString);
        long jB4 = AbstractC1865d.b(19, 23, hexDashString);
        e(23, hexDashString);
        return Uf.c.f9766c.fromLongs((jB << 32) | (jB2 << 16) | jB3, AbstractC1865d.b(24, 36, hexDashString) | (jB4 << 48));
    }

    public static final boolean a(int i7) {
        if (i7 == 0) {
            throw null;
        }
        int i10 = i7 - 1;
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5;
    }

    public static final String b(String str) {
        if (str.length() <= 64) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 64);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append("...");
        return sb2.toString();
    }

    public static Cg.d c(U client) {
        Cg.b bVar = new Cg.b();
        Intrinsics.checkNotNullParameter(client, "client");
        bVar.f1554a = client;
        J url = J("https://1.1.1.1/dns-query?ct=application/dns-udpwireformat");
        Intrinsics.checkNotNullParameter(url, "url");
        bVar.f1555b = url;
        InetAddress[] bootstrapDnsHosts = {k("1.1.1.1"), k("1.0.0.1")};
        Intrinsics.checkNotNullParameter(bootstrapDnsHosts, "bootstrapDnsHosts");
        bVar.f1559f = C1847n.y(bootstrapDnsHosts);
        bVar.f1556c = false;
        return bVar.a();
    }

    public static Cg.d d(U client) {
        Cg.b bVar = new Cg.b();
        Intrinsics.checkNotNullParameter(client, "client");
        bVar.f1554a = client;
        J url = J("https://dns.google/dns-query");
        Intrinsics.checkNotNullParameter(url, "url");
        bVar.f1555b = url;
        InetAddress[] bootstrapDnsHosts = {k("8.8.4.4"), k("8.8.8.8")};
        Intrinsics.checkNotNullParameter(bootstrapDnsHosts, "bootstrapDnsHosts");
        bVar.f1559f = C1847n.y(bootstrapDnsHosts);
        bVar.f1556c = false;
        return bVar.a();
    }

    public static final void e(int i7, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.charAt(i7) == '-') {
            return;
        }
        StringBuilder sbE = F.e(i7, "Expected '-' (hyphen) at index ", ", but was '");
        sbE.append(str.charAt(i7));
        sbE.append('\'');
        throw new IllegalArgumentException(sbE.toString().toString());
    }

    public static t f(s sVar, int i7) {
        int i10 = (i7 & 1) != 0 ? 8 : 10;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        if (i10 >= 3) {
            return G8.a.a(i10, 1.0f / ((float) Math.cos(u.f42312b / i10)), new t0.c(2), null);
        }
        throw new IllegalArgumentException("Circle must have at least three vertices");
    }

    public static LinkedHashMap g(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = f4490b;
        if (str != null) {
            linkedHashMap.put("trace_id", str);
        }
        String str2 = f4491c;
        if (str2 != null) {
            linkedHashMap.put("order_id", str2);
        }
        for (Pair pair : pairArr) {
            linkedHashMap.put((String) pair.f38891a, (String) pair.f38892b);
        }
        return linkedHashMap;
    }

    public static Integer h(Long l5) {
        if (l5 == null) {
            return null;
        }
        return Integer.valueOf((int) TimeUnit.MILLISECONDS.toDays(l5.longValue() - System.currentTimeMillis()));
    }

    public static Bitmap i(String str, int i7, int i10, Bitmap bitmap) {
        Bitmap bitmap2;
        int i11;
        int i12;
        int i13;
        int i14;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (bitmap == null) {
            bitmap2 = null;
        } else {
            try {
                Matrix matrix = new Matrix();
                float fMin = Math.min(((i7 * 1.0f) / 5.0f) / bitmap.getWidth(), ((i10 * 1.0f) / 5.0f) / bitmap.getHeight());
                matrix.postScale(fMin, fMin);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (Build.VERSION.SDK_INT >= 26 && bitmapCreateBitmap.getConfig() == Bitmap.Config.HARDWARE) {
                    bitmapCreateBitmap = bitmapCreateBitmap.copy(Bitmap.Config.ARGB_8888, true);
                }
                bitmap2 = bitmapCreateBitmap;
            } catch (Exception e10) {
                Log.e("QRCodeUtil", e10.getMessage());
                return null;
            }
        }
        int i15 = i7 / 2;
        int i16 = i10 / 2;
        int i17 = 0;
        if (bitmap2 != null) {
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            i13 = width;
            i14 = height;
            i11 = (i7 - width) / 2;
            i12 = (i10 - height) / 2;
        } else {
            i11 = i15;
            i12 = i16;
            i13 = 0;
            i14 = 0;
        }
        Hashtable hashtable = new Hashtable();
        hashtable.put(EncodeHintType.CHARACTER_SET, "utf-8");
        hashtable.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hashtable.put(EncodeHintType.MARGIN, 0);
        BitMatrix bitMatrixEncode = new QRCodeWriter().encode(str, BarcodeFormat.QR_CODE, i7, i10, hashtable);
        int[] iArr = new int[i7 * i10];
        int i18 = 0;
        while (i18 < i10) {
            for (int i19 = i17; i19 < i7; i19++) {
                int i20 = -1;
                if (i19 >= i11 && i19 < i11 + i13 && i18 >= i12 && i18 < i12 + i14) {
                    int pixel = bitmap2 != null ? bitmap2.getPixel(i19 - i11, i18 - i12) : 0;
                    if (pixel != 0) {
                        i20 = pixel;
                    } else if (bitMatrixEncode.get(i19, i18)) {
                        i20 = -16777216;
                    }
                    iArr[(i18 * i7) + i19] = i20;
                } else if (bitMatrixEncode.get(i19, i18)) {
                    iArr[(i18 * i7) + i19] = -16777216;
                } else {
                    iArr[(i18 * i7) + i19] = -1;
                }
            }
            i18++;
            i17 = 0;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap2.setPixels(iArr, 0, i7, 0, 0, i7, i10);
        return bitmapCreateBitmap2;
    }

    public static final void j(long j6, byte[] dst, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i12 = 7 - i10;
        int i13 = 8 - i11;
        if (i13 > i12) {
            return;
        }
        while (true) {
            int i14 = AbstractC1865d.f39011a[(int) ((j6 >> (i12 << 3)) & 255)];
            int i15 = i7 + 1;
            dst[i7] = (byte) (i14 >> 8);
            i7 += 2;
            dst[i15] = (byte) i14;
            if (i12 == i13) {
                return;
            } else {
                i12--;
            }
        }
    }

    public static InetAddress k(String str) {
        try {
            InetAddress byName = InetAddress.getByName(str);
            Intrinsics.checkNotNullExpressionValue(byName, "getByName(host)");
            return byName;
        } catch (UnknownHostException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final StateListDrawable l(Context ctx, Drawable drawable, Drawable drawable2, boolean z3) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, drawable2);
        stateListDrawable.addState(new int[]{-16842912}, drawable);
        if (z3) {
            int integer = ctx.getResources().getInteger(R.integer.config_shortAnimTime);
            stateListDrawable.setEnterFadeDuration(integer);
            stateListDrawable.setExitFadeDuration(integer);
        }
        return stateListDrawable;
    }

    public static final String m(CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!(key instanceof p121i2.c)) {
                return P(key);
            }
            ArrayList arrayList = ((p121i2.c) key).f37412a;
            Intrinsics.checkNotNullExpressionValue(arrayList, "getCacheKeys(...)");
            Object obj = arrayList.get(0);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return P((CacheKey) obj);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String n(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Intrinsics.e(str);
        if (str.length() <= 5) {
            return str;
        }
        String strSubstring = str.substring(str.length() - 5);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String o() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String p() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static final long q(int i7, byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (((long) bArr[i7 + 7]) & 255) | ((((long) bArr[i7]) & 255) << 56) | ((((long) bArr[i7 + 1]) & 255) << 48) | ((((long) bArr[i7 + 2]) & 255) << 40) | ((((long) bArr[i7 + 3]) & 255) << 32) | ((((long) bArr[i7 + 4]) & 255) << 24) | ((((long) bArr[i7 + 5]) & 255) << 16) | ((((long) bArr[i7 + 6]) & 255) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    public static String r(int i7, Context context) {
        if (i7 == -1) {
            return p381za.c.UNKNOWN_PROCESS_NAME;
        }
        try {
            i7 = context.getResources().getResourceEntryName(i7);
            return i7;
        } catch (Exception unused) {
            return G.m(i7, "?");
        }
    }

    public static String s(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return p381za.c.UNKNOWN_PROCESS_NAME;
        }
    }

    public static String t(File file) {
        FileChannel channel;
        RandomAccessFile randomAccessFile;
        LinkedHashMap linkedHashMapQ;
        ByteBuffer byteBuffer;
        byte[] bArrCopyOfRange;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    channel = randomAccessFile.getChannel();
                    try {
                        linkedHashMapQ = G8.a.q(G8.a.p(channel).f3021a);
                        try {
                            try {
                                channel.close();
                            } catch (IOException unused) {
                            }
                            randomAccessFile.close();
                        } catch (G5.b | IOException unused2) {
                        }
                    } catch (IOException unused3) {
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        linkedHashMapQ = null;
                    } catch (Throwable th) {
                        th = th;
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (randomAccessFile == null) {
                            throw th;
                        }
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (IOException unused6) {
                            throw th;
                        }
                    }
                } catch (IOException unused7) {
                    channel = null;
                } catch (Throwable th2) {
                    th = th2;
                    channel = null;
                }
            } catch (G5.b | IOException unused8) {
                linkedHashMapQ = null;
            }
        } catch (IOException unused9) {
            channel = null;
            randomAccessFile = null;
        } catch (Throwable th3) {
            th = th3;
            channel = null;
            randomAccessFile = null;
        }
        if (linkedHashMapQ == null || (byteBuffer = (ByteBuffer) linkedHashMapQ.get(1903654775)) == null) {
            bArrCopyOfRange = null;
        } else {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset();
            bArrCopyOfRange = Arrays.copyOfRange(bArrArray, byteBuffer.position() + iArrayOffset, byteBuffer.limit() + iArrayOffset);
        }
        if (bArrCopyOfRange == null) {
            return null;
        }
        try {
            return new String(bArrCopyOfRange, Constants.ENCODING);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static final ArrayList u(CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!(key instanceof p121i2.c)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(key.isResourceIdForDebugging() ? key.getUriString() : P(key));
                return arrayList;
            }
            ArrayList arrayList2 = ((p121i2.c) key).f37412a;
            Intrinsics.checkNotNullExpressionValue(arrayList2, "getCacheKeys(...)");
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                Object obj = arrayList2.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                arrayList3.add(P((CacheKey) obj));
            }
            return arrayList3;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String v(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return G.o("***** ", n(str2));
        }
        Intrinsics.e(str);
        if (str.length() <= 12) {
            return q0.l(str, "(***** ", n(str2), ")");
        }
        String strSubstring = str.substring(0, 12);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return q0.l(strSubstring, "... (***** ", n(str2), ")");
    }

    public static String w(String phone) {
        String strSubstring;
        if (TextUtils.isEmpty(phone)) {
            return phone;
        }
        Intrinsics.e(phone);
        if (phone.length() <= 6) {
            return phone;
        }
        String string = p110h4.b.f37294b.getInstance().f37296a.getString("last_phone_number", "");
        if (TextUtils.isEmpty(string)) {
            string = k.f22317a.i().f18771b;
        }
        if (TextUtils.isEmpty(string)) {
            strSubstring = "0234";
        } else {
            Intrinsics.e(string);
            strSubstring = string.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        if (y.m(phone, strSubstring, false)) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            if (TextUtils.isEmpty(phone) || phone.length() <= 4) {
                phone = "";
            } else {
                int length = phone.length();
                if (length > PhoneBaseNumberUtils.INSTANCE.getMobileNumberValidLength(k.f22325i)) {
                    if (y.m(phone, "0234", false) || y.m(phone, "0233", false) || y.m(phone, "0255", false) || y.m(phone, "0244", false)) {
                        phone = phone.substring(4, length);
                        Intrinsics.checkNotNullExpressionValue(phone, "substring(...)");
                    } else if (y.m(phone, "234", false) || y.m(phone, "233", false) || y.m(phone, "255", false) || y.m(phone, "244", false)) {
                        phone = phone.substring(3, length);
                        Intrinsics.checkNotNullExpressionValue(phone, "substring(...)");
                    }
                }
            }
        }
        if (TextUtils.isEmpty(phone)) {
            return phone;
        }
        Intrinsics.e(phone);
        if (phone.length() == 11) {
            StringBuilder sb2 = new StringBuilder();
            String strSubstring2 = phone.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            sb2.append(strSubstring2);
            sb2.append(" ");
            String strSubstring3 = phone.substring(3, 7);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            sb2.append(strSubstring3);
            sb2.append(" ");
            String strSubstring4 = phone.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
            sb2.append(strSubstring4);
            return sb2.toString();
        }
        if (phone.length() != 10 && phone.length() != 9) {
            return phone;
        }
        StringBuilder sb3 = new StringBuilder();
        String strSubstring5 = phone.substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
        sb3.append(strSubstring5);
        sb3.append(" ");
        String strSubstring6 = phone.substring(3, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
        sb3.append(strSubstring6);
        sb3.append(" ");
        String strSubstring7 = phone.substring(6);
        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
        sb3.append(strSubstring7);
        return sb3.toString();
    }

    public static Signature x(String str, Provider provider, PSSParameterSpec pSSParameterSpec) throws P5.d {
        try {
            Signature signature = provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
            if (pSSParameterSpec == null) {
                return signature;
            }
            try {
                signature.setParameter(pSSParameterSpec);
                return signature;
            } catch (InvalidAlgorithmParameterException e10) {
                throw new P5.d("Invalid RSASSA-PSS salt length parameter: " + e10.getMessage(), e10);
            }
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final boolean y(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return (androidx.core.content.d.a(activity, "android.permission.ACCESS_COARSE_LOCATION") == 0) || (androidx.core.content.d.a(activity, com.transsnet.palmpay.core.config.d.j()) == 0);
    }

    public static boolean z(l lVar, int i7) {
        int[] iArr = (int[]) lVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract void F(int i7, CharSequence charSequence);

    public abstract void G();

    public abstract void I(r rVar);

    public void H(CharSequence charSequence) {
    }
}
