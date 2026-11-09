package com.palmpay.lib.apm.launchcounter.util;

import N8.q0;
import Pa.n0;
import Pa.r0;
import Pg.h;
import Pg.k;
import Yf.C0791c;
import Yf.r;
import Yf.y;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.imagecapture.i;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.video.u;
import androidx.room.C;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.alibaba.android.arouter.utils.Consts;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.webview.container.PPWebActivity;
import com.tencent.mmkv.MMKV;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.TransferByLoanResult;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import io.fastkv.j;
import io.fastkv.m;
import io.fastkv.p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.ChannelIterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Long f23793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f23794b;

    public static boolean A(int i7) {
        return (i7 & 32768) != 0;
    }

    public static boolean B(int i7) {
        if (i7 == 15 || i7 == 255) {
            return true;
        }
        if (i7 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i7 != 32783) {
            return i7 == 33023 || i7 == 0;
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 < 28 || i10 > 29;
    }

    public static boolean C(float f10) {
        return Float.compare(f10, Float.NaN) == 0;
    }

    public static void D(int i7, String str, String str2) {
        try {
            n();
            ARouter.getInstance().build(str).withInt(str2, i7).navigation();
        } catch (Exception e10) {
            F6.d.c("RouterManager", "jumpToPath: ", e10);
        }
    }

    public static void E(Bundle bundle, String str) {
        try {
            n();
            ARouter.getInstance().build(str).with(bundle).addFlags(268435456).navigation();
        } catch (Exception e10) {
            F6.d.c("RouterManager", "jumpToPath: ", e10);
        }
    }

    public static void F(String str) {
        try {
            n();
            ARouter.getInstance().build(str).navigation();
        } catch (Exception e10) {
            F6.d.c("RouterManager", "jumpToPath: ", e10);
        }
    }

    public static void G(String str, String str2) {
        try {
            n();
            ARouter.getInstance().build(str).withString("extra_data", str2).navigation();
        } catch (Exception e10) {
            F6.d.c("RouterManager", "jumpToPath: ", e10);
        }
    }

    public static void H(String str, String str2, String str3) {
        try {
            n();
            ARouter.getInstance().build(str).withString(str2, str3).navigation();
        } catch (Exception e10) {
            F6.d.c("RouterManager", "jumpToPath: ", e10);
        }
    }

    public static void I(int i7, String str) {
        try {
            n();
            ARouter.getInstance().build(str).withFlags(i7).navigation();
        } catch (Exception e10) {
            F6.d.c("RouterManager", "jumpToPathWithFlag: ", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object J(C0791c c0791c, Continuation continuation) {
        r rVar;
        ChannelIterator channelIterator;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i7 = rVar.f11445c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                rVar.f11445c = i7 - Integer.MIN_VALUE;
            } else {
                rVar = new r(continuation);
            }
        } else {
            rVar = new r(continuation);
        }
        Object objHasNext = rVar.f11444b;
        Object obj = Ef.a.f2423a;
        int i10 = rVar.f11445c;
        if (i10 == 0) {
            g.M(objHasNext);
            rVar.f11443a = c0791c;
            rVar.f11445c = 1;
            objHasNext = c0791c.hasNext(rVar);
            if (objHasNext == obj) {
                channelIterator = c0791c;
                return obj;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChannelIterator channelIterator2 = rVar.f11443a;
            g.M(objHasNext);
            channelIterator = channelIterator2;
        }
        channelIterator = c0791c;
        if (((Boolean) objHasNext).booleanValue()) {
            return channelIterator.next();
        }
        throw new y("Channel was closed");
    }

    public static final IconicsDrawable K(Context context, float f10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context, S6.a.pay_Schedule, L6.b.ppColorWarning, f10);
    }

    public static final void L(HashMap map, Function1 fetchBlock) {
        int i7;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        HashMap map2 = new HashMap(999);
        Iterator it = map.keySet().iterator();
        loop0: while (true) {
            i7 = 0;
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                Object key = it.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                map2.put(key, map.get(key));
                i7++;
            } while (i7 != 999);
            fetchBlock.invoke(map2);
            map2.clear();
        }
        if (i7 > 0) {
            fetchBlock.invoke(map2);
        }
    }

    public static final IconicsDrawable M(Context context, float f10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context, S6.a.pay_CloseFill, L6.b.ppColorError, f10);
    }

    public static final void N(MMKV mmkv, String key, Object obj) {
        Intrinsics.checkNotNullParameter(mmkv, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj == null) {
            mmkv.remove(key);
            return;
        }
        if (obj instanceof Parcelable) {
            mmkv.h(key, (Parcelable) obj);
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(obj);
                    mmkv.l(key, byteArrayOutputStream.toByteArray());
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        org.chromium.support_lib_boundary.util.b.o(objectOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    org.chromium.support_lib_boundary.util.b.o(byteArrayOutputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void O(androidx.constraintlayout.widget.a aVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + aVar.f15700b;
        try {
            int i7 = F.i(aVar.f15701c);
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z3 = true;
            switch (i7) {
                case 0:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((e((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (e((int) (fArr[3] * 255.0f)) << 24) | (e((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | e((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iE = (e((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (e((int) (fArr[3] * 255.0f)) << 24) | (e((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | e((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iE);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + aVar.f15700b);
                case 5:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z3 = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z3));
                    return;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e10) {
            StringBuilder sbQ = q0.q("cannot access method ", str, " on View \"");
            sbQ.append(J3.a.s(view));
            sbQ.append("\"");
            Log.e("CustomSupport", sbQ.toString());
            e10.printStackTrace();
        } catch (NoSuchMethodException e11) {
            StringBuilder sbQ2 = q0.q("no method ", str, " on View \"");
            sbQ2.append(J3.a.s(view));
            sbQ2.append("\"");
            Log.e("CustomSupport", sbQ2.toString());
            e11.printStackTrace();
        } catch (InvocationTargetException e12) {
            e12.printStackTrace();
        }
    }

    public static void P(Bundle bundle, String str) {
        try {
            n();
            String string = bundle.getString("extra_title");
            Postcard postcardWithString = ARouter.getInstance().build("/common/webview").with(bundle).withString("url", str);
            if (!TextUtils.isEmpty(string)) {
                postcardWithString.withString("title", string);
                postcardWithString.withString(PPWebActivity.KEY_WEB_NAV_BAR, "false");
            }
            postcardWithString.navigation();
        } catch (Exception e10) {
            F6.d.c("RouterManager", "jumpToPath: ", e10);
        }
    }

    public static void Q(String str) {
        H("/common/webview", "url", str);
    }

    public static void R(String str, String str2) {
        try {
            n();
            ARouter.getInstance().build("/common/webview").withString("url", str).withString(PPWebActivity.KEY_WEB_NAV_BAR, "false").withString("title", str2).navigation();
        } catch (Exception unused) {
            Z4.c cVar = n0.f7107i;
        }
    }

    public static final IconicsDrawable S(Context context, float f10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context, S6.a.pay_SelectedFill, L6.b.ppColorSuccess, f10);
    }

    public static void T(h cursor, byte[] key) {
        long j6;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i7 = 0;
        do {
            byte[] bArr = cursor.f7350e;
            int i10 = cursor.f7351f;
            int i11 = cursor.f7352g;
            if (bArr != null) {
                while (i10 < i11) {
                    int i12 = i7 % length;
                    bArr[i10] = (byte) (bArr[i10] ^ key[i12]);
                    i10++;
                    i7 = i12 + 1;
                }
            }
            long j10 = cursor.f7349d;
            k kVar = cursor.f7346a;
            Intrinsics.e(kVar);
            if (j10 == kVar.f7358b) {
                throw new IllegalStateException("no more bytes");
            }
            j6 = cursor.f7349d;
        } while (cursor.b(j6 == -1 ? 0L : j6 + ((long) (cursor.f7352g - cursor.f7351f))) != -1);
    }

    public static final String a(Long l5) {
        String strB = r0.B(l5 != null ? l5.longValue() : 0L, true);
        Intrinsics.checkNotNullExpressionValue(strB, "getAmountStringWithCurrency(...)");
        return strB;
    }

    public static IconicsDrawable b(final Context context, S6.a aVar, final int i7, final float f10) {
        IconicsDrawable iconicsDrawable = new IconicsDrawable(context, aVar);
        iconicsDrawable.a(new Function1() { // from class: Vb.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IconicsDrawable apply = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, (int) f10);
                apply.g(ColorStateList.valueOf(CommonViewExtKt.colorInt(i7, context)));
                return Unit.f38893a;
            }
        });
        return iconicsDrawable;
    }

    public static String c(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b7 : bArr) {
            sb2.append(String.format("%02x", Byte.valueOf(b7)));
        }
        return sb2.toString();
    }

    public static final p045d3.d d(com.facebook.imagepipeline.request.d imageRequest, p045d3.d dVar, p045d3.d dVar2, p213o2.d dVar3) {
        String diskCacheId;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        if (imageRequest.getCacheChoice() == com.facebook.imagepipeline.request.b.f21655a) {
            return dVar;
        }
        if (imageRequest.getCacheChoice() == com.facebook.imagepipeline.request.b.f21656b) {
            return dVar2;
        }
        if (imageRequest.getCacheChoice() != com.facebook.imagepipeline.request.b.f21657c || dVar3 == null || (diskCacheId = imageRequest.getDiskCacheId()) == null) {
            return null;
        }
        return (p045d3.d) dVar3.get(diskCacheId);
    }

    public static int e(int i7) {
        int i10 = (i7 & (~(i7 >> 31))) - 255;
        return (i10 & (i10 >> 31)) + 255;
    }

    public static void f(FileDescriptor fileDescriptor) {
        try {
            p242q0.h.a(fileDescriptor);
        } catch (Exception unused) {
            Log.e("ExifInterfaceUtils", "Error closing fd.");
        }
    }

    public static final IconicsDrawable g(Context context, float f10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context, S6.a.pay_CloseFill, L6.b.ppColorError, f10);
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] i(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            jArr[i7] = iArr[i7];
        }
        return jArr;
    }

    public static void j(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i7);
            }
        }
    }

    public static void k(p242q0.b bVar, androidx.camera.core.impl.utils.c cVar, int i7) throws IOException {
        byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        while (i7 > 0) {
            int iMin = Math.min(i7, UserMetadata.MAX_INTERNAL_KEY_SIZE);
            int i10 = bVar.read(bArr, 0, iMin);
            if (i10 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i7 -= i10;
            cVar.write(bArr, 0, i10);
        }
    }

    public static final C l(Context context, String str, Class klass) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (StringsKt.F(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new C(context, str, klass);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0020  */
    public static final Object m(MMKV mmkv, String name) {
        Object objC;
        Intrinsics.checkNotNullParameter(mmkv, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(Object.class, "clazz");
        if (Parcelable.class.isAssignableFrom(Object.class)) {
            objC = mmkv.c(name);
            if (objC == null) {
                objC = null;
            }
        } else {
            byte[] bArrB = mmkv.b(name);
            if (bArrB == null) {
                objC = null;
            } else {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrB);
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        try {
                            Object object = objectInputStream.readObject();
                            Unit unit = Unit.f38893a;
                            objectInputStream.close();
                            byteArrayInputStream.close();
                            if (object == null) {
                                objC = null;
                            } else {
                                objC = object;
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                org.chromium.support_lib_boundary.util.b.o(objectInputStream, th);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            org.chromium.support_lib_boundary.util.b.o(byteArrayInputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        if (objC == null) {
            return null;
        }
        return objC;
    }

    public static void n() {
        Ea.a.a(BaseApplication.getContext());
    }

    public static final IconicsDrawable o(Context context, float f10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context, S6.a.pay_CloseFill, L6.b.ppColorError, f10);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0162  */
    public static void p(m mVar, int i7) {
        int i10;
        MappedByteBuffer mappedByteBufferL;
        ArrayList arrayList = mVar.f37662p;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            p pVar = (p) arrayList.get(0);
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 1; i12 < size; i12++) {
                p pVar2 = (p) arrayList.get(i12);
                if (pVar2.f37674a == pVar.f37675b) {
                    pVar.f37675b = pVar2.f37675b;
                } else {
                    i11++;
                    if (i11 != i12) {
                        arrayList.set(i11, pVar2);
                    }
                    pVar = pVar2;
                }
            }
            int i13 = i11 + 1;
            if (size > i13) {
                arrayList.subList(i13, size).clear();
            }
        }
        ArrayList arrayList2 = mVar.f37662p;
        p pVar3 = (p) arrayList2.get(0);
        int i14 = pVar3.f37674a;
        int i15 = mVar.f37650d;
        int i16 = i15 - mVar.f37661o;
        int i17 = i16 - 12;
        int i18 = i16 - i14;
        int i19 = i15 - i14;
        boolean z3 = i17 < i19 + i18;
        if (!z3) {
            mVar.f37651e ^= mVar.f37654h.f(i14, i19);
        }
        int size2 = arrayList2.size();
        int i20 = size2 - 1;
        int i21 = mVar.f37650d - ((p) arrayList2.get(i20)).f37675b;
        int i22 = i21 > 0 ? size2 : i20;
        int[] iArr = new int[i22];
        int[] iArr2 = new int[i22];
        int i23 = pVar3.f37675b;
        int i24 = pVar3.f37674a;
        int i25 = 1;
        while (i25 < size2) {
            ArrayList arrayList3 = arrayList2;
            p pVar4 = (p) arrayList2.get(i25);
            int i26 = i25;
            int i27 = pVar4.f37674a - i23;
            int i28 = size2;
            byte[] bArr = (byte[]) mVar.f37654h.f7074d;
            System.arraycopy(bArr, i23, bArr, i24, i27);
            int i29 = i26 - 1;
            iArr[i29] = i23;
            iArr2[i29] = i23 - i24;
            i24 += i27;
            i23 = pVar4.f37675b;
            i25 = i26 + 1;
            arrayList2 = arrayList3;
            size2 = i28;
        }
        ArrayList arrayList4 = arrayList2;
        if (i21 > 0) {
            byte[] bArr2 = (byte[]) mVar.f37654h.f7074d;
            System.arraycopy(bArr2, i23, bArr2, i24, i21);
            iArr[i20] = i23;
            iArr2[i20] = i23 - i24;
        }
        mVar.f37661o = 0;
        arrayList4.clear();
        if (z3) {
            mVar.f37651e = mVar.f37654h.f(12, i17);
        } else {
            mVar.f37651e ^= mVar.f37654h.f(i14, i18);
        }
        mVar.f37650d = i16;
        if (mVar.f37669x == 0) {
            mVar.f37666u.putInt(0, -1);
            mVar.f37666u.putLong(4, mVar.f37651e);
            mVar.f37666u.position(i14);
            mVar.f37666u.put((byte[]) mVar.f37654h.f7074d, i14, i18);
            mVar.f37666u.putInt(0, i17);
            mVar.f37667v.putInt(0, i17);
            mVar.f37667v.putLong(4, mVar.f37651e);
            mVar.f37667v.position(i14);
            mVar.f37667v.put((byte[]) mVar.f37654h.f7074d, i14, i18);
        } else {
            mVar.f37654h.q(0, i17);
            mVar.f37654h.r(4, mVar.f37651e);
        }
        int i30 = mVar.f37650d + i7;
        if (((byte[]) mVar.f37654h.f7074d).length - i30 > 32768) {
            int i31 = m.f37645B;
            int iS = com.facebook.imagepipeline.nativecode.b.s(i31, i30 + i31);
            byte[] bArr3 = (byte[]) mVar.f37654h.f7074d;
            if (iS >= bArr3.length) {
                i10 = 0;
            } else {
                byte[] bArr4 = new byte[iS];
                i10 = 0;
                System.arraycopy(bArr3, 0, bArr4, 0, mVar.f37650d);
                mVar.f37654h.f7074d = bArr4;
                if (mVar.f37669x == 0) {
                    FileChannel fileChannel = mVar.f37665s;
                    long j6 = iS;
                    MappedByteBuffer mappedByteBufferL2 = null;
                    try {
                        fileChannel.truncate(j6);
                        mappedByteBufferL = com.facebook.imagepipeline.nativecode.b.L(fileChannel, iS);
                    } catch (IOException unused) {
                        mappedByteBufferL = null;
                    }
                    FileChannel fileChannel2 = mVar.t;
                    try {
                        fileChannel2.truncate(j6);
                        mappedByteBufferL2 = com.facebook.imagepipeline.nativecode.b.L(fileChannel2, iS);
                    } catch (IOException unused2) {
                    }
                    if (mappedByteBufferL == null || mappedByteBufferL2 == null) {
                        Log.e("FastKV", mVar.f37648b, new Exception("map failed"));
                        com.facebook.imagepipeline.nativecode.b.W(mVar);
                    } else {
                        mVar.f37666u = mappedByteBufferL;
                        mVar.f37667v = mappedByteBufferL2;
                    }
                }
            }
        } else {
            i10 = 0;
        }
        for (io.fastkv.b bVar : mVar.f37652f.values()) {
            int i32 = bVar.f37628a;
            if (i32 > i14) {
                int i33 = i22 - 1;
                int i34 = i10;
                while (i34 <= i33) {
                    int i35 = (i34 + i33) >>> 1;
                    int i36 = iArr[i35];
                    if (i36 >= i32) {
                        if (i36 <= i32) {
                            i33 = i35;
                            break;
                        }
                        i33 = i35 - 1;
                    } else {
                        i34 = i35 + 1;
                    }
                }
                int i37 = iArr2[i33];
                bVar.f37628a -= i37;
                if (bVar.a() >= 6) {
                    ((j) bVar).f37636c -= i37;
                }
            }
        }
    }

    public static final View q(ViewGroup viewGroup, int i7) {
        View childAt = viewGroup.getChildAt(i7);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder sbE = F.e(i7, "Index: ", ", Size: ");
        sbE.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(sbE.toString());
    }

    public static Context r(Context context) {
        int iG;
        Context applicationContext = context.getApplicationContext();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34 && (iG = i.g(context)) != i.g(applicationContext)) {
            applicationContext = i.a(iG, applicationContext);
        }
        if (i7 >= 30) {
            String strC = Z.b.c(context);
            if (!Objects.equals(strC, Z.b.c(applicationContext))) {
                return Z.b.a(applicationContext, strC);
            }
        }
        return applicationContext;
    }

    public static String s(Context context) {
        return "pt".equalsIgnoreCase(context.getResources().getConfiguration().getLocales().get(0).getLanguage()) ? "," : Consts.DOT;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    public static String t(Context context, String str) {
        String str2;
        String strSubstring;
        String str3;
        if (TextUtils.isEmpty(str)) {
            str2 = "0";
        } else {
            String strS = s(context);
            if (str.contains(strS)) {
                String[] strArrSplit = str.split(s(context));
                if (Consts.DOT.equalsIgnoreCase(strS)) {
                    strArrSplit = str.split("\\.");
                }
                if (strArrSplit.length > 0) {
                    str2 = strArrSplit[0];
                } else {
                    str2 = str;
                }
            } else {
                str2 = str;
            }
        }
        if (TextUtils.isEmpty(str)) {
            strSubstring = "0";
        } else {
            String strS2 = s(context);
            if (str.contains(strS2)) {
                String[] strArrSplit2 = str.split(s(context));
                if (Consts.DOT.equalsIgnoreCase(strS2)) {
                    strArrSplit2 = str.split("\\.");
                }
                if (strArrSplit2.length > 1) {
                    strSubstring = strArrSplit2[1];
                } else {
                    strSubstring = null;
                }
            } else {
                strSubstring = null;
            }
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(str2);
            try {
                String str4 = new DecimalFormat(",###,###").format(BigDecimal.valueOf(5000L));
                str3 = (TextUtils.isEmpty(str4) || !str4.contains(",")) ? new DecimalFormat("0", DecimalFormatSymbols.getInstance(context.getResources().getConfiguration().getLocales().get(0))).format(bigDecimal) : new DecimalFormat(",###,###", DecimalFormatSymbols.getInstance(context.getResources().getConfiguration().getLocales().get(0))).format(bigDecimal);
            } catch (Exception unused) {
            }
        } catch (NumberFormatException e10) {
            Log.e("LibAmountUtils", "getAmountStringFromInput: ", e10);
            str3 = "";
        }
        String strS3 = s(context);
        if (TextUtils.isEmpty(strSubstring)) {
            StringBuilder sbS = u.s(str3);
            sbS.append(str.contains(strS3) ? strS3 : "");
            return sbS.toString();
        }
        if (strSubstring.length() > 2) {
            strSubstring = strSubstring.substring(0, 2);
        }
        return q0.y(str3, strS3, strSubstring);
    }

    public static final IconicsDrawable u(Context context, String str, float f10) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null) {
            return S(context, f10);
        }
        if (StringsKt.A(str, "refunded", true)) {
            return M(context, f10);
        }
        if (StringsKt.A(str, "success", true) || StringsKt.A(str, "complete", true)) {
            return S(context, f10);
        }
        if (StringsKt.A(str, "processing", true) || StringsKt.A(str, "pending", true)) {
            return K(context, f10);
        }
        if (StringsKt.A(str, TransferByLoanResult.STATUS_FAILED, true)) {
            return o(context, f10);
        }
        if (StringsKt.A(str, "close", true)) {
            return g(context, f10);
        }
        if (StringsKt.A(str, TransferByLoanResult.STATUS_CANCELLED, true)) {
            return o(context, f10);
        }
        if (StringsKt.A(str, "waiting to pay", true)) {
            return K(context, f10);
        }
        if (StringsKt.A(str, "waiting to receive", true)) {
            return K(context, f10);
        }
        if (StringsKt.A(str, "declined", true)) {
            return o(context, f10);
        }
        if (StringsKt.A(str, "expired", true)) {
            return o(context, f10);
        }
        if (StringsKt.A(str, "book", true)) {
            return K(context, f10);
        }
        if (StringsKt.A(str, "to be awarded", true)) {
            return K(context, f10);
        }
        return StringsKt.A(str, "risk rejection", true) ? o(context, f10) : S(context, f10);
    }

    public static String v(View view) {
        WeakReference weakReference;
        p021b5.b bVarK = p059e1.a.K(view);
        if (bVarK != null) {
            return bVarK.f18774c ? "/IgnorePage" : "/Page";
        }
        int iHashCode = view.hashCode();
        p279s5.b bVar = p279s5.a.f42018a;
        if (bVar.f42021e == -1 && (weakReference = bVar.f42020d) != null && weakReference.get() != null) {
            bVar.f42021e = ((Activity) bVar.f42020d.get()).getWindow().getDecorView().hashCode();
        }
        if (iHashCode == bVar.f42021e) {
            return "/MainWindow";
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams)) {
            return "/CustomWindow";
        }
        int i7 = ((WindowManager.LayoutParams) layoutParams).type;
        if (i7 == 1) {
            return "/MainWindow";
        }
        if (i7 < 99) {
            return "/DialogWindow";
        }
        return i7 < 1999 ? "/PopupWindow" : "/CustomWindow";
    }

    public static void w(String str) {
        try {
            n();
            ARouter.getInstance().build("/main/echat").withString("extra_type", str).navigation();
        } catch (Exception e10) {
            F6.d.c("RouterManager", "goToCustomerServicePage: ", e10);
        }
    }

    public static void x(Bundle bundle, String str) {
        try {
            n();
            Postcard postcardWithString = ARouter.getInstance().build("/coreImpl/rn_host").withString("rn_module_name", str);
            if (bundle != null) {
                postcardWithString.withBundle("rn_key_params", bundle);
            }
            postcardWithString.navigation();
        } catch (Exception e10) {
            F6.d.c("RouterManager", "goToRnPage: ", e10);
        }
    }

    public static void y(String str, String str2, Object obj) {
        try {
            Bundle bundle = new Bundle();
            if (obj instanceof String) {
                bundle.putString(str2, (String) obj);
            }
            if (obj instanceof Long) {
                bundle.putLong(str2, ((Long) obj).longValue());
            }
            if (obj instanceof Integer) {
                bundle.putInt(str2, ((Integer) obj).intValue());
            }
            x(bundle, str);
        } catch (Exception e10) {
            F6.d.c("RouterManager", "goToRnPage: ", e10);
        }
    }

    public static p360y2.g z(Exception exc) {
        p360y2.g gVar = new p360y2.g();
        exc.getClass();
        gVar.c(exc, null);
        return gVar;
    }
}
