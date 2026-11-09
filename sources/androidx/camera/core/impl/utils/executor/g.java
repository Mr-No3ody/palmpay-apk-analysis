package androidx.camera.core.impl.utils.executor;

import Af.l;
import C0.G;
import E.AbstractC0198c;
import E.C0216v;
import M7.q;
import N8.C0457a;
import N8.q0;
import Pa.C0505b;
import Pa.C0525w;
import Pa.H;
import Wf.B;
import Y.j;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.WithHint;
import androidx.camera.core.impl.L;
import androidx.core.util.Pools$Pool;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.utils.Consts;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.palmpay.lib.liveness.model.LiveBaseResponse;
import com.swmansion.rnscreens.Screen;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.main.export.bean.rsp.GetHomeCommonRsp;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.Utils;
import io.fastkv.interfaces.FastCipher;
import io.fastkv.interfaces.FastEncoder;
import io.fastkv.m;
import io.fastkv.p;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import kotlin.collections.C1847n;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137j3.w;
import p137j3.x;
import p355xf.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile d f14170a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f14171b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ReviewManager f14172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ReviewInfo f14173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Integer f14174e;

    public static final boolean A(LiveBaseResponse liveBaseResponse) {
        Intrinsics.checkNotNullParameter(liveBaseResponse, "<this>");
        return Intrinsics.c(liveBaseResponse.getRespCode(), "00000000");
    }

    public static boolean B(long j6, long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        calendar.set(11, 0);
        calendar.set(12, 0);
        long jC = q0.c(calendar, 13, 0, 14, 0);
        calendar.set(11, 23);
        calendar.set(12, 59);
        return j10 >= jC && j10 <= q0.c(calendar, 13, 59, 14, 999);
    }

    public static boolean C(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static void D(E e10) {
        Task<ReviewInfo> taskRequestReviewFlow;
        ReviewInfo reviewInfo;
        ReviewManager reviewManager = f14172c;
        if (reviewManager != null && (reviewInfo = f14173d) != null) {
            Intrinsics.e(reviewInfo);
            if (e10 != null) {
                reviewManager.launchReviewFlow(e10, reviewInfo).addOnCompleteListener(new B8.d(10));
                return;
            }
            return;
        }
        if (e10 != null) {
            try {
                F6.d.h("RateManager", 3, "init: true");
                ReviewManager reviewManagerCreate = ReviewManagerFactory.create(e10);
                f14172c = reviewManagerCreate;
                if (reviewManagerCreate == null || (taskRequestReviewFlow = reviewManagerCreate.requestReviewFlow()) == null) {
                    return;
                }
                taskRequestReviewFlow.addOnCompleteListener(new C0457a(e10, 19));
            } catch (Exception e11) {
                F6.d.c("RateManager", "init: " + e11);
            }
        }
    }

    public static Drawable E(Context context, int i7, Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return p264r5.a.q(i7, context);
    }

    public static String F(int i7, Object obj) {
        ArrayList arrayListA;
        if (obj.getClass().isArray()) {
            if (obj instanceof Object[]) {
                return Arrays.deepToString((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
        }
        if (obj instanceof Throwable) {
            String str = G6.d.f3047a;
            ArrayList arrayList = new ArrayList();
            for (Throwable cause = (Throwable) obj; cause != null && !arrayList.contains(cause); cause = cause.getCause()) {
                arrayList.add(cause);
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList();
            int i10 = size - 1;
            ArrayList arrayListA2 = G6.d.a((Throwable) arrayList.get(i10));
            while (true) {
                int i11 = size - 1;
                if (i11 < 0) {
                    break;
                }
                if (i11 != 0) {
                    arrayListA = G6.d.a((Throwable) arrayList.get(size - 2));
                    int size2 = arrayListA2.size() - 1;
                    for (int size3 = arrayListA.size() - 1; size2 >= 0 && size3 >= 0; size3--) {
                        if (((String) arrayListA2.get(size2)).equals((String) arrayListA.get(size3))) {
                            arrayListA2.remove(size2);
                        }
                        size2--;
                    }
                } else {
                    arrayListA = arrayListA2;
                }
                if (i11 == i10) {
                    arrayList2.add(((Throwable) arrayList.get(i11)).toString());
                } else {
                    arrayList2.add(" Caused by: " + ((Throwable) arrayList.get(i11)).toString());
                }
                arrayList2.addAll(arrayListA2);
                arrayListA2 = arrayListA;
                size = i11;
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append(G6.d.f3047a);
            }
            return sb2.toString();
        }
        if (obj instanceof Bundle) {
            return c((Bundle) obj);
        }
        if (obj instanceof Intent) {
            return w((Intent) obj);
        }
        if (i7 != 32) {
            if (i7 != 48) {
                return obj.toString();
            }
            String string = obj.toString();
            try {
                StreamSource streamSource = new StreamSource(new StringReader(string));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
                transformerNewTransformer.setOutputProperty("indent", "yes");
                transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                transformerNewTransformer.transform(streamSource, streamResult);
                return streamResult.getWriter().toString().replaceFirst(">", ">" + F6.d.f2603c);
            } catch (Exception e10) {
                e10.printStackTrace();
                return string;
            }
        }
        if (!(obj instanceof CharSequence)) {
            try {
                ConcurrentHashMap concurrentHashMap = G6.a.f3023a;
                Gson gsonCreate = (Gson) concurrentHashMap.get("logUtilsGson");
                if (gsonCreate == null) {
                    gsonCreate = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
                    concurrentHashMap.put("logUtilsGson", gsonCreate);
                }
                return gsonCreate.toJson(obj);
            } catch (Throwable unused) {
                return obj.toString();
            }
        }
        String string2 = obj.toString();
        try {
            int length = string2.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = string2.charAt(i12);
                if (cCharAt == '{') {
                    return new JSONObject(string2).toString(4);
                }
                if (cCharAt == '[') {
                    return new JSONArray(string2).toString(4);
                }
                if (!Character.isWhitespace(cCharAt)) {
                    return string2;
                }
            }
            return string2;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return string2;
        }
    }

    public static void G(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof WithHint) {
                editorInfo.hintText = ((WithHint) parent).getHint();
                return;
            }
        }
    }

    public static void H(m mVar, C0505b c0505b, FastCipher fastCipher, byte b7, String str, int i7) {
        if (b7 == 1) {
            HashMap map = mVar.f37652f;
            byte[] bArr = (byte[]) c0505b.f7074d;
            int i10 = c0505b.f7072b;
            c0505b.f7072b = i10 + 1;
            map.put(str, new io.fastkv.c(i7, bArr[i10] == 1));
            return;
        }
        if (b7 == 2) {
            HashMap map2 = mVar.f37652f;
            int iG = c0505b.g();
            if (fastCipher != null) {
                iG = fastCipher.decrypt(iG);
            }
            map2.put(str, new io.fastkv.f(i7, iG));
            return;
        }
        if (b7 == 3) {
            HashMap map3 = mVar.f37652f;
            int iG2 = c0505b.g();
            if (fastCipher != null) {
                iG2 = fastCipher.decrypt(iG2);
            }
            map3.put(str, new io.fastkv.e(i7, Float.intBitsToFloat(iG2)));
            return;
        }
        if (b7 != 4) {
            HashMap map4 = mVar.f37652f;
            long jH = c0505b.h(c0505b.f7072b);
            c0505b.f7072b += 8;
            if (fastCipher != null) {
                jH = fastCipher.decrypt(jH);
            }
            map4.put(str, new io.fastkv.d(i7, Double.longBitsToDouble(jH)));
            return;
        }
        HashMap map5 = mVar.f37652f;
        long jH2 = c0505b.h(c0505b.f7072b);
        c0505b.f7072b += 8;
        if (fastCipher != null) {
            jH2 = fastCipher.decrypt(jH2);
        }
        map5.put(str, new io.fastkv.g(i7, jH2));
    }

    public static void I(m mVar, C0505b c0505b, FastCipher fastCipher, byte b7, String str, int i7, int i10, byte b10) throws Exception {
        String strK;
        Object objDecrypt;
        int length;
        C0505b c0505b2;
        byte b11 = b7;
        boolean z3 = b11 == 9 || b11 == 10 || b11 == 11;
        int iG = z3 ? c0505b.g() : c0505b.j() & 65535;
        int i11 = z3 ? 4 : 2;
        boolean z8 = (b10 & SignedBytes.MAX_POWER_OF_TWO) != 0;
        if (z8 && iG != 32) {
            throw new IllegalStateException("name size not match");
        }
        switch (b11) {
            case 9:
                b11 = 6;
                break;
            case 10:
                b11 = 7;
                break;
            case 11:
                b11 = 8;
                break;
        }
        if (b11 == 6) {
            if (z8) {
                strK = c0505b.k(iG);
            } else {
                c0505b.getClass();
                if (fastCipher == null || iG <= 0) {
                    strK = c0505b.k(iG);
                } else {
                    byte[] bArr = (byte[]) c0505b.f7074d;
                    int i12 = c0505b.f7072b;
                    byte[] bArrDecrypt = fastCipher.decrypt(Arrays.copyOfRange(bArr, i12, i12 + iG));
                    if (bArrDecrypt == null) {
                        strK = null;
                    } else {
                        strK = bArrDecrypt.length > 2048 ? new String(bArrDecrypt, StandardCharsets.UTF_8) : c0505b.e(0, bArrDecrypt.length, bArrDecrypt);
                    }
                    c0505b.f7072b += iG;
                }
            }
            mVar.f37652f.put(str, new io.fastkv.i(i10, i7 + i11, strK, iG, z8));
            return;
        }
        if (b11 == 7) {
            if (z8) {
                objDecrypt = c0505b.k(iG);
            } else {
                c0505b.getClass();
                byte[] bArr2 = new byte[iG];
                System.arraycopy((byte[]) c0505b.f7074d, c0505b.f7072b, bArr2, 0, iG);
                c0505b.f7072b += iG;
                objDecrypt = fastCipher != null ? fastCipher.decrypt(bArr2) : bArr2;
            }
            mVar.f37652f.put(str, new io.fastkv.a(i10, i7 + i11, objDecrypt, iG, z8));
            return;
        }
        if (z8) {
            mVar.f37652f.put(str, new io.fastkv.h(i10, i7 + i11, c0505b.k(iG), iG, true));
            return;
        }
        if (fastCipher == null) {
            c0505b2 = mVar.f37654h;
            length = iG;
        } else {
            byte[] bArr3 = new byte[iG];
            C0505b c0505b3 = mVar.f37654h;
            System.arraycopy((byte[]) c0505b3.f7074d, c0505b3.f7072b, bArr3, 0, iG);
            byte[] bArrDecrypt2 = fastCipher.decrypt(bArr3);
            C0505b c0505b4 = new C0505b(bArrDecrypt2, 0);
            length = bArrDecrypt2.length;
            c0505b2 = c0505b4;
        }
        byte[] bArr4 = (byte[]) c0505b2.f7074d;
        int i13 = c0505b2.f7072b;
        c0505b2.f7072b = i13 + 1;
        int i14 = bArr4[i13] & UnsignedBytes.MAX_VALUE;
        String strK2 = c0505b2.k(i14);
        FastEncoder fastEncoder = (FastEncoder) mVar.f37649c.get(strK2);
        int i15 = length - (i14 + 1);
        if (i15 < 0) {
            throw new Exception("parse dara failed");
        }
        if (fastEncoder != null) {
            try {
                Object objDecode = fastEncoder.decode((byte[]) c0505b2.f7074d, c0505b2.f7072b, i15);
                if (objDecode != null) {
                    io.fastkv.h hVar = new io.fastkv.h(i10, i7 + 2, objDecode, iG, false);
                    hVar.f37634f = fastEncoder;
                    mVar.f37652f.put(str, hVar);
                }
            } catch (Exception e10) {
                Log.e("FastKV", mVar.f37648b, e10);
            }
        } else {
            p059e1.a.k(mVar, "object with tag: " + strK2 + " without encoder");
        }
        c0505b.f7072b = i7 + i11 + iG;
    }

    public static boolean J(m mVar, boolean z3) {
        int iG;
        if (z3) {
            mVar.getClass();
            p059e1.a.k(mVar, "miss cipher");
            return false;
        }
        if (z3) {
            mVar.getClass();
        }
        C0505b c0505b = mVar.f37654h;
        String str = mVar.f37648b;
        c0505b.f7072b = 12;
        while (true) {
            try {
                int i7 = c0505b.f7072b;
                int i10 = mVar.f37650d;
                boolean z8 = true;
                if (i7 >= i10) {
                    if (i7 != i10) {
                        Log.e("FastKV", str, new Exception("parse dara failed"));
                        return false;
                    }
                    mVar.f37658l = false;
                    return true;
                }
                byte[] bArr = (byte[]) c0505b.f7074d;
                int i11 = i7 + 1;
                c0505b.f7072b = i11;
                byte b7 = bArr[i7];
                byte b10 = (byte) (b7 & 63);
                if (b10 < 1 || b10 > 11) {
                    throw new Exception("parse dara failed");
                }
                int i12 = i7 + 2;
                c0505b.f7072b = i12;
                int i13 = bArr[i11] & UnsignedBytes.MAX_VALUE;
                if (i13 == 0) {
                    throw new IllegalStateException("invalid key size");
                }
                if (b7 < 0) {
                    c0505b.f7072b = i12 + i13;
                    if (b10 <= 5) {
                        iG = m.f37644A[b10];
                    } else {
                        if (b10 != 9 && b10 != 10 && b10 != 11) {
                            z8 = false;
                        }
                        iG = z8 ? c0505b.g() : c0505b.j() & 65535;
                    }
                    int i14 = c0505b.f7072b + iG;
                    c0505b.f7072b = i14;
                    mVar.f37661o = (i14 - i7) + mVar.f37661o;
                    ArrayList arrayList = mVar.f37662p;
                    p pVar = new p();
                    pVar.f37674a = i7;
                    pVar.f37675b = i14;
                    arrayList.add(pVar);
                } else {
                    String strK = c0505b.k(i13);
                    int i15 = c0505b.f7072b;
                    if (b10 <= 5) {
                        m mVar2 = mVar;
                        H(mVar2, c0505b, null, b10, strK, i15);
                        mVar = mVar2;
                    } else {
                        I(mVar, c0505b, null, b10, strK, i15, i7, b7);
                    }
                }
            } catch (Exception e10) {
                Log.e("FastKV", str, e10);
                return false;
            }
        }
    }

    public static ContentValues K(byte[] bArr, String str, Integer num) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_created", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("_modified", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("_data", bArr);
        contentValues.put("_event_type", str);
        contentValues.put("_policy", num);
        return contentValues;
    }

    public static void L(ArrayList arrayList) {
        String string;
        if (arrayList.isEmpty()) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            boolean z3 = true;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!z3) {
                    sb2.append("||");
                }
                sb2.append(str);
                z3 = false;
            }
            string = sb2.toString();
            Intrinsics.e(string);
        }
        SPUtils.getInstance("push_record").put("_key_push_message_history", string);
    }

    public static final void M(Object obj) {
        if (obj instanceof p355xf.p) {
            throw ((p355xf.p) obj).f43976a;
        }
    }

    public static final boolean N(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "<this>");
        return screen.getStackPresentation() == q.f5845d;
    }

    public static void a(AtomicLong atomicLong, long j6) {
        long j10;
        long j11;
        do {
            j10 = atomicLong.get();
            if (j10 == Long.MAX_VALUE) {
                return;
            } else {
                j11 = j10 + j6;
            }
        } while (!atomicLong.compareAndSet(j10, j11 >= 0 ? j11 : Long.MAX_VALUE));
    }

    public static androidx.concurrent.futures.m b(B b7) {
        Intrinsics.checkNotNullParameter(b7, "<this>");
        androidx.concurrent.futures.m mVarY = AbstractC0198c.y(new L(b7, 5));
        Intrinsics.checkNotNullExpressionValue(mVarY, "getFuture { completer ->…      }\n        tag\n    }");
        return mVarY;
    }

    public static String c(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        if (!it.hasNext()) {
            return "Bundle {}";
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Bundle { ");
        while (true) {
            String next = it.next();
            Object obj = bundle.get(next);
            sb2.append(next);
            sb2.append('=');
            if (obj instanceof Bundle) {
                sb2.append(obj == bundle ? "(this Bundle)" : c((Bundle) obj));
            } else {
                sb2.append(F6.d.d(obj));
            }
            if (!it.hasNext()) {
                sb2.append(" }");
                return sb2.toString();
            }
            sb2.append(", ");
        }
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

    public static void e(GetHomeCommonRsp getHomeCommonRsp) {
        if (BaseApplication.hasLogin()) {
            getHomeCommonRsp.markCacheTime();
        }
        H.c(BaseApplication.getInstance()).g(o(), ((Gson) C0525w.f().f7166b).toJson(getHomeCommonRsp));
    }

    public static final p355xf.p f(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new p355xf.p(exception);
    }

    public static final Pools$Pool g(w poolFactory) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        int i7 = ((x) poolFactory.f38269a.f38262e).f38280d;
        p058e0.b bVar = new p058e0.b(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            Hg.c cVar = p262r2.a.f41548a;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16384);
            Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
            bVar.release(byteBufferAllocate);
        }
        return bVar;
    }

    public static final l h(Set dynamicRangesToTest, Set fullySpecifiedDynamicRanges) {
        Intrinsics.checkNotNullParameter(dynamicRangesToTest, "dynamicRangesToTest");
        Intrinsics.checkNotNullParameter(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangesToTest.isEmpty()) {
            throw new IllegalArgumentException("Candidate dynamic range set must contain at least 1 candidate dynamic range.");
        }
        l lVar = new l();
        Iterator it = dynamicRangesToTest.iterator();
        while (it.hasNext()) {
            C0216v c0216v = (C0216v) it.next();
            if (!c0216v.b()) {
                Iterator it2 = fullySpecifiedDynamicRanges.iterator();
                while (it2.hasNext()) {
                    C0216v c0216v2 = (C0216v) it2.next();
                    p118hf.a.k(c0216v2.b(), "Fully specified range is not actually fully specified.");
                    int i7 = c0216v.f2129b;
                    if (i7 == 0 || i7 == c0216v2.f2129b) {
                        p118hf.a.k(c0216v2.b(), "Fully specified range is not actually fully specified.");
                        int i10 = c0216v.f2128a;
                        if (i10 != 0) {
                            int i11 = c0216v2.f2128a;
                            if ((i10 != 2 || i11 == 1) && i10 != i11) {
                            }
                        }
                        lVar.add(c0216v2);
                    }
                }
            } else if (fullySpecifiedDynamicRanges.contains(c0216v)) {
                lVar.add(c0216v);
            }
        }
        return N.a(lVar);
    }

    public static String i() {
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

    public static final int j(Cursor c6, String name) {
        Intrinsics.checkNotNullParameter(c6, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c6.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c6.getColumnIndex("`" + name + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT > 25 || name.length() == 0) {
            return -1;
        }
        String[] columnNames = c6.getColumnNames();
        Intrinsics.checkNotNullExpressionValue(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(name, "name");
        String strConcat = Consts.DOT.concat(name);
        String strL = G.l('`', Consts.DOT, name);
        int length = columnNames.length;
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            String str = columnNames[i7];
            int i11 = i10 + 1;
            if (str.length() >= name.length() + 2 && (y.g(str, strConcat, false) || (str.charAt(0) == '`' && y.g(str, strL, false)))) {
                return i10;
            }
            i7++;
            i10 = i11;
        }
        return -1;
    }

    public static final int k(Cursor c6, String name) {
        String strU;
        Intrinsics.checkNotNullParameter(c6, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int iJ = j(c6, name);
        if (iJ >= 0) {
            return iJ;
        }
        try {
            String[] columnNames = c6.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            strU = C1847n.u(63, columnNames);
        } catch (Exception unused) {
            strU = "unknown";
        }
        throw new IllegalArgumentException(G.p("column '", name, "' does not exist. Available columns: ", strU));
    }

    public static Uri l() {
        return Uri.parse("content://" + com.growingio.android.sdk.d.a().getPackageName() + ".EventDataContentProvider" + File.separator + "events");
    }

    public static String m(long j6, long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        calendar.add(6, -1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        long jC = q0.c(calendar, 13, 0, 14, 0);
        calendar.set(11, 23);
        calendar.set(12, 59);
        long jC2 = q0.c(calendar, 13, 59, 14, 999);
        if (j10 >= jC && j10 <= jC2) {
            return "Yesterday";
        }
        if (B(j6, j10)) {
            return "Today";
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j6);
        calendar2.add(6, 1);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        long jC3 = q0.c(calendar2, 13, 0, 14, 0);
        calendar2.set(11, 23);
        calendar2.set(12, 59);
        return (j10 < jC3 || j10 > q0.c(calendar2, 13, 59, 14, 999)) ? new SimpleDateFormat("E, MMM d,").format(new Date(j10)) : "Tomorrow";
    }

    public static Drawable n(Context context, Context context2, int i7, Resources.Theme theme) {
        try {
            if (f14171b) {
                return E(context2, i7, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return context2.getDrawable(i7);
        } catch (NoClassDefFoundError unused2) {
            f14171b = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = j.f11254a;
        return resources.getDrawable(i7, theme);
    }

    public static String o() {
        return "Pref_" + BaseApplication.getCountryLocale() + p367ya.a.d().i() + "_home_menu_info_v4";
    }

    public static int p() {
        if (f14174e == null) {
            f14174e = Integer.valueOf(p059e1.a.D(3, "main_sp_home_menu_corner_count"));
        }
        if (f14174e.intValue() > 0) {
            return f14174e.intValue();
        }
        return 3;
    }

    public static String q() {
        Enumeration<NetworkInterface> networkInterfaces;
        String str;
        String strSubstring;
        String upperCase = "02:00:00:00:00:00";
        if (x("02:00:00:00:00:00")) {
            Object systemService = Utils.getApp().getApplicationContext().getSystemService("wifi");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            upperCase = ((WifiManager) systemService).getConnectionInfo().getMacAddress();
        }
        String strD = null;
        if (x(upperCase)) {
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
        if (x(upperCase)) {
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
        if (!x(upperCase)) {
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

    public static String r() {
        return BaseApplication.getCountryLocale() + p367ya.a.d().i() + "_last_upload_app_version";
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

    public static String t() {
        String macAddress = DeviceUtils.getMacAddress();
        try {
            if (x(macAddress)) {
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
            if (x(macAddress)) {
                macAddress = q();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return x(macAddress) ? "02:00:00:00:00:00" : macAddress;
    }

    public static ArrayList u() {
        try {
            Utils.init(BaseApplication.getContext());
            String string = SPUtils.getInstance("push_record").getString("_key_push_message_history");
            if (TextUtils.isEmpty(string)) {
                return new ArrayList();
            }
            Intrinsics.e(string);
            return CollectionsKt.Z(StringsKt__StringsKt.split$default(string, new String[]{"||"}, false, 0, 6, null));
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static u v() {
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

    public static String w(Intent intent) {
        boolean z3;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Intent { ");
        String action = intent.getAction();
        boolean z8 = false;
        boolean z10 = true;
        if (action != null) {
            sb2.append("act=");
            sb2.append(action);
            z3 = false;
        } else {
            z3 = true;
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            if (!z3) {
                sb2.append(' ');
            }
            sb2.append("cat=[");
            for (String str : categories) {
                if (!z10) {
                    sb2.append(',');
                }
                sb2.append(str);
                z10 = false;
            }
            sb2.append("]");
            z3 = false;
        }
        Uri data = intent.getData();
        if (data != null) {
            if (!z3) {
                sb2.append(' ');
            }
            sb2.append("dat=");
            sb2.append(data);
            z3 = false;
        }
        String type = intent.getType();
        if (type != null) {
            if (!z3) {
                sb2.append(' ');
            }
            sb2.append("typ=");
            sb2.append(type);
            z3 = false;
        }
        int flags = intent.getFlags();
        if (flags != 0) {
            if (!z3) {
                sb2.append(' ');
            }
            sb2.append("flg=0x");
            sb2.append(Integer.toHexString(flags));
            z3 = false;
        }
        String str2 = intent.getPackage();
        if (str2 != null) {
            if (!z3) {
                sb2.append(' ');
            }
            sb2.append("pkg=");
            sb2.append(str2);
            z3 = false;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            if (!z3) {
                sb2.append(' ');
            }
            sb2.append("cmp=");
            sb2.append(component.flattenToShortString());
            z3 = false;
        }
        Rect sourceBounds = intent.getSourceBounds();
        if (sourceBounds != null) {
            if (!z3) {
                sb2.append(' ');
            }
            sb2.append("bnds=");
            sb2.append(sourceBounds.toShortString());
            z3 = false;
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            if (!z3) {
                sb2.append(' ');
            }
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null) {
                sb2.append("ClipData.Item {}");
            } else {
                sb2.append("ClipData.Item { ");
                String htmlText = itemAt.getHtmlText();
                if (htmlText != null) {
                    androidx.camera.video.u.w(sb2, "H:", htmlText, "}");
                } else {
                    CharSequence text = itemAt.getText();
                    if (text != null) {
                        sb2.append("T:");
                        sb2.append(text);
                        sb2.append("}");
                    } else {
                        Uri uri = itemAt.getUri();
                        if (uri != null) {
                            sb2.append("U:");
                            sb2.append(uri);
                            sb2.append("}");
                        } else {
                            Intent intent2 = itemAt.getIntent();
                            if (intent2 != null) {
                                sb2.append("I:");
                                sb2.append(w(intent2));
                                sb2.append("}");
                            } else {
                                sb2.append("NULL}");
                            }
                        }
                    }
                }
            }
            z3 = false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (!z3) {
                sb2.append(' ');
            }
            sb2.append("extras={");
            sb2.append(c(extras));
            sb2.append('}');
        } else {
            z8 = z3;
        }
        Intent selector = intent.getSelector();
        if (selector != null) {
            if (!z8) {
                sb2.append(' ');
            }
            sb2.append("sel={");
            sb2.append(selector == intent ? "(this Intent)" : w(selector));
            sb2.append("}");
        }
        sb2.append(" }");
        return sb2.toString();
    }

    public static boolean x(String str) {
        return TextUtils.isEmpty(str) || "please open wifi".equals(str) || "02:00:00:00:00:00".equals(str);
    }

    public static boolean y(Uri uri) {
        return uri != null && FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static final boolean z(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "<this>");
        return screen.getStackPresentation() == q.f5845d && screen.getSheetDetents().f6120a.size() == 1 && ((Number) CollectionsKt.F(screen.getSheetDetents().f6120a)).doubleValue() == -1.0d;
    }
}
