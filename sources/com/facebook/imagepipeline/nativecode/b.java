package com.facebook.imagepipeline.nativecode;

import C0.G;
import N8.q0;
import Nd.c;
import Pa.C0505b;
import Wf.AbstractC0774s;
import Wf.AbstractC0780y;
import Wf.C0765i;
import Wf.V;
import Yd.u;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.l1;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.utils.executor.g;
import androidx.core.view.KeyEventDispatcher$Component;
import androidx.core.view.M;
import androidx.core.view.N;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.adjust.sdk.Constants;
import com.facebook.drawee.drawable.TransformAwareDrawable;
import com.facebook.drawee.drawable.TransformCallback;
import com.facebook.fresco.ui.common.ImagePerfNotifier;
import com.google.android.flexbox.FlexItem;
import com.google.android.gms.tasks.Task;
import com.google.common.primitives.UnsignedBytes;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import com.transsnet.palmpay.util.SpanUtils;
import io.fastkv.e;
import io.fastkv.f;
import io.fastkv.h;
import io.fastkv.i;
import io.fastkv.interfaces.FastEncoder;
import io.fastkv.m;
import io.fastkv.n;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.C1847n;
import kotlin.collections.C1849p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.json.JSONObject;
import p025ba.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements ImagePerfNotifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f21453a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f21454b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f21455c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f21456d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f21457e;

    public static boolean A(m mVar) {
        String str = mVar.f37647a;
        StringBuilder sb2 = new StringBuilder();
        String str2 = mVar.f37648b;
        File file = new File(str, G.r(sb2, str2, ".kvc"));
        String strJ = q0.j(str2, ".tmp");
        String str3 = mVar.f37647a;
        File file2 = new File(str3, strJ);
        boolean z3 = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!B(mVar, file)) {
                    N(mVar);
                    i(mVar);
                    return false;
                }
                if (mVar.f37669x == 0) {
                    if (!X(mVar, mVar.f37654h)) {
                        mVar.f37669x = 1;
                        return false;
                    }
                    try {
                        i(mVar);
                        return true;
                    } catch (Exception e10) {
                        e = e10;
                        z3 = true;
                        Log.e("FastKV", str2, e);
                        return z3;
                    }
                }
            } else if (mVar.f37669x != 0) {
                File file3 = new File(str3, str2 + ".kva");
                File file4 = new File(str3, str2 + ".kvb");
                if (file3.exists() && file4.exists()) {
                    try {
                        if (!B(mVar, file3)) {
                            N(mVar);
                            try {
                                if (!B(mVar, file4)) {
                                    N(mVar);
                                }
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException unused2) {
                    }
                }
            }
            return false;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static boolean B(m mVar, File file) {
        long length = file.length();
        if (length != 0 && length < 268435456) {
            int i7 = (int) length;
            int iS = s(m.f37645B, i7);
            C0505b c0505b = mVar.f37654h;
            if (c0505b == null || ((byte[]) c0505b.f7074d).length != iS) {
                c0505b = new C0505b(new byte[iS], 0);
                mVar.f37654h = c0505b;
            } else {
                c0505b.f7072b = 0;
            }
            n.D(file, (byte[]) c0505b.f7074d, i7);
            int iG = c0505b.g();
            if (iG >= 0) {
                int i10 = (-1073741825) & iG;
                boolean z3 = (iG & 1073741824) != 0;
                long jH = c0505b.h(c0505b.f7072b);
                c0505b.f7072b += 8;
                mVar.f37650d = i10 + 12;
                if (i10 >= 0 && i10 <= i7 - 12 && jH == c0505b.f(12, i10) && g.J(mVar, z3)) {
                    mVar.f37651e = jH;
                    return true;
                }
            }
        }
        return false;
    }

    public static final int C(int i7, int i10) {
        if (i10 == 255) {
            return i7;
        }
        if (i10 == 0) {
            return i7 & FlexItem.MAX_SIZE;
        }
        return (i7 & FlexItem.MAX_SIZE) | ((((i7 >>> 24) * (i10 + (i10 >> 7))) >> 8) << 24);
    }

    public static void D(Context context, String str) {
        if (str == null) {
            return;
        }
        E(context, context.getString(c.share_dialog_title), str);
    }

    public static void E(Context context, String str, String str2) {
        if (str2 == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.setType("text/plain");
        if (TextUtils.isEmpty(str)) {
            context.startActivity(Intent.createChooser(intent, context.getString(c.share_text)));
        } else {
            context.startActivity(Intent.createChooser(intent, str));
        }
    }

    public static void F(Context context, Uri uri) {
        if (uri == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType("image/jpeg");
        context.startActivity(Intent.createChooser(intent, context.getString(c.share_text)));
    }

    public static final boolean G(String str) {
        String str2 = null;
        String string = str != null ? StringsKt.V(str).toString() : null;
        if (string == null) {
            string = "";
        }
        Bundle bundle = new Bundle();
        if (string.length() > 0) {
            bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, string);
        }
        if (p059e1.a.C("_show_rn_new_loan_home", false)) {
            str2 = "LoanTabHome";
        } else if (p059e1.a.C("_show_rn_loan_home", false)) {
            str2 = "LoanHome";
        }
        if (str2 != null) {
            d.x(bundle, str2);
            return true;
        }
        if (!p059e1.a.C("_show_new_loan_home", false)) {
            return false;
        }
        if (string.length() > 0) {
            d.E(bundle, "/credit_score/loan_home_activity");
            return true;
        }
        d.F("/credit_score/loan_home_activity");
        return true;
    }

    public static void H(m mVar, long j6, long j10) {
        int i7 = mVar.f37666u.getInt();
        int i10 = i7 & (-1073741825);
        boolean z3 = (i7 & 1073741824) != 0;
        long j11 = mVar.f37666u.getLong();
        int i11 = mVar.f37667v.getInt();
        int i12 = (-1073741825) & i11;
        boolean z8 = (1073741824 & i11) != 0;
        long j12 = mVar.f37667v.getLong();
        if (i10 >= 0 && i10 <= j6 - 12) {
            mVar.f37650d = i10 + 12;
            mVar.f37666u.rewind();
            mVar.f37666u.get((byte[]) mVar.f37654h.f7074d, 0, mVar.f37650d);
            if (j11 == mVar.f37654h.f(12, i10) && g.J(mVar, z3)) {
                mVar.f37651e = j11;
                if (j6 == j10) {
                    byte[] bArr = new byte[mVar.f37650d];
                    mVar.f37667v.rewind();
                    mVar.f37667v.get(bArr, 0, mVar.f37650d);
                    byte[] bArr2 = (byte[]) mVar.f37654h.f7074d;
                    for (int i13 = 0; i13 < mVar.f37650d; i13++) {
                        if (bArr2[i13] == bArr[i13]) {
                        }
                    }
                    return;
                }
                new Exception("B file error");
                g(mVar, mVar.f37666u, mVar.f37667v, mVar.f37650d);
                return;
            }
        }
        if (i12 >= 0 && i12 <= j10 - 12) {
            mVar.f37652f.clear();
            mVar.f37661o = 0;
            mVar.f37662p.clear();
            mVar.f37650d = i12 + 12;
            if (((byte[]) mVar.f37654h.f7074d).length != mVar.f37667v.capacity()) {
                mVar.f37654h = new C0505b(mVar.f37667v.capacity());
            }
            mVar.f37667v.rewind();
            mVar.f37667v.get((byte[]) mVar.f37654h.f7074d, 0, mVar.f37650d);
            if (j12 == mVar.f37654h.f(12, i12) && g.J(mVar, z8)) {
                new Exception("A file error");
                g(mVar, mVar.f37667v, mVar.f37666u, mVar.f37650d);
                mVar.f37651e = j12;
                return;
            }
        }
        p059e1.a.k(mVar, "both files error");
        f(mVar);
    }

    public static String I(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 107);
            byte b10 = (byte) (bArr[0] ^ 52);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static JSONObject J(Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(I("462c3f29273a", 80), th.getLocalizedMessage());
            jSONObject.put(I("402e2a36", 72), th.getClass().getName());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (stackTraceElement.getClassName().contains(I("575d100a4b515953414b1013525d404b4a48", 59))) {
                    jSONObject.put(I("476e7c6b61", 2), stackTraceElement.toString());
                    return jSONObject;
                }
            }
            return jSONObject;
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static final Cursor K(androidx.room.G db2, SupportSQLiteQuery sqLiteQuery, boolean z3) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor c6 = db2.query(sqLiteQuery, (CancellationSignal) null);
        if (z3 && (c6 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) c6;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                Intrinsics.checkNotNullParameter(c6, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(c6.getColumnNames(), c6.getCount());
                    while (c6.moveToNext()) {
                        Object[] objArr = new Object[c6.getColumnCount()];
                        int columnCount = c6.getColumnCount();
                        for (int i7 = 0; i7 < columnCount; i7++) {
                            int type = c6.getType(i7);
                            if (type == 0) {
                                objArr[i7] = null;
                            } else if (type == 1) {
                                objArr[i7] = Long.valueOf(c6.getLong(i7));
                            } else if (type == 2) {
                                objArr[i7] = Double.valueOf(c6.getDouble(i7));
                            } else if (type == 3) {
                                objArr[i7] = c6.getString(i7);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i7] = c6.getBlob(i7);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    org.chromium.support_lib_boundary.util.b.o(c6, null);
                    return matrixCursor;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        org.chromium.support_lib_boundary.util.b.o(c6, th);
                        throw th2;
                    }
                }
            }
        }
        return c6;
    }

    public static MappedByteBuffer L(FileChannel fileChannel, int i7) {
        try {
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i7);
            map.order(ByteOrder.LITTLE_ENDIAN);
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    public static void M(m mVar, MappedByteBuffer mappedByteBuffer) throws IOException {
        MappedByteBuffer mappedByteBufferL;
        int iCapacity = mappedByteBuffer.capacity();
        int i7 = m.f37645B;
        if (iCapacity != i7) {
            FileChannel fileChannel = mappedByteBuffer == mVar.f37666u ? mVar.f37665s : mVar.t;
            try {
                fileChannel.truncate(i7);
                mappedByteBufferL = L(fileChannel, i7);
            } catch (IOException unused) {
                mappedByteBufferL = null;
            }
            if (mappedByteBufferL == null) {
                throw new IOException("Failed to truncate and remap buffer");
            }
            if (mappedByteBuffer == mVar.f37666u) {
                mVar.f37666u = mappedByteBufferL;
            } else {
                mVar.f37667v = mappedByteBufferL;
            }
            mappedByteBuffer = mappedByteBufferL;
        }
        mVar.getClass();
        mappedByteBuffer.putInt(0, 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    public static void N(m mVar) {
        mVar.f37650d = 12;
        mVar.f37651e = 0L;
        mVar.f37652f.clear();
        mVar.f37661o = 0;
        mVar.f37662p.clear();
        C0505b c0505b = mVar.f37654h;
        if (c0505b == null || ((byte[]) c0505b.f7074d).length != m.f37645B) {
            mVar.f37654h = new C0505b(m.f37645B);
        } else {
            c0505b.r(4, 0L);
        }
        mVar.f37654h.q(0, 0);
    }

    public static void O(m mVar) {
        File[] fileArrListFiles;
        MappedByteBuffer mappedByteBuffer;
        FastEncoder fastEncoder;
        FastEncoder[] fastEncoderArr = (FastEncoder[]) mVar.f37649c.values().toArray(new FastEncoder[mVar.f37649c.size()]);
        String str = "temp_" + mVar.f37648b;
        m mVar2 = new m(mVar.f37647a, str, fastEncoderArr, 2);
        synchronized (mVar2) {
            mVar2.f37670y = false;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mVar.f37652f.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof i) {
                i iVar = (i) value;
                if (iVar.f37638e) {
                    arrayList.add((String) iVar.f37635b);
                    String strW = w(mVar, iVar);
                    if (strW != null) {
                        mVar2.putString(str2, strW);
                    }
                } else {
                    mVar2.putString(str2, (String) iVar.f37635b);
                }
            } else if (value instanceof io.fastkv.c) {
                mVar2.putBoolean(str2, ((io.fastkv.c) value).f37629b);
            } else if (value instanceof f) {
                mVar2.putInt(str2, ((f) value).f37632b);
            } else if (value instanceof io.fastkv.g) {
                mVar2.putLong(str2, ((io.fastkv.g) value).f37633b);
            } else if (value instanceof e) {
                mVar2.putFloat(str2, ((e) value).f37631b);
            } else if (value instanceof io.fastkv.d) {
                mVar2.j(str2, ((io.fastkv.d) value).f37630b);
            } else if (value instanceof io.fastkv.a) {
                io.fastkv.a aVar = (io.fastkv.a) value;
                if (aVar.f37638e) {
                    arrayList.add((String) aVar.f37635b);
                    byte[] bArrP = p(mVar, aVar);
                    if (bArrP != null) {
                        mVar2.i(str2, bArrP);
                    }
                } else {
                    mVar2.i(str2, (byte[]) aVar.f37635b);
                }
            } else if (value instanceof h) {
                h hVar = (h) value;
                if (hVar.f37638e) {
                    arrayList.add((String) hVar.f37635b);
                    Object objT = t(mVar, hVar);
                    if (objT != null && (fastEncoder = hVar.f37634f) != null) {
                        mVar2.k(str2, objT, fastEncoder);
                    }
                } else {
                    FastEncoder fastEncoder2 = hVar.f37634f;
                    if (fastEncoder2 != null) {
                        mVar2.k(str2, hVar.f37635b, fastEncoder2);
                    }
                }
            }
        }
        mVar2.contains("");
        mVar.f37654h = mVar2.f37654h;
        mVar.f37651e = mVar2.f37651e;
        mVar.f37650d = mVar2.f37650d;
        mVar.f37661o = 0;
        mVar.f37662p.clear();
        mVar.f37652f.clear();
        mVar.f37652f.putAll(mVar2.f37652f);
        C0505b c0505b = mVar2.f37654h;
        if (mVar.f37669x == 0) {
            int length = ((byte[]) c0505b.f7074d).length;
            MappedByteBuffer mappedByteBuffer2 = mVar.f37666u;
            if (mappedByteBuffer2 != null && mappedByteBuffer2.capacity() == length && (mappedByteBuffer = mVar.f37667v) != null && mappedByteBuffer.capacity() == length) {
                mVar.f37666u.position(0);
                mVar.f37666u.put((byte[]) c0505b.f7074d, 0, mVar.f37650d);
                mVar.f37667v.position(0);
                mVar.f37667v.put((byte[]) c0505b.f7074d, 0, mVar.f37650d);
            } else if (!X(mVar, c0505b)) {
                mVar.f37669x = 1;
            }
        }
        if (mVar.f37669x != 0) {
            Y(mVar);
        }
        File file = new File(mVar.f37647a, str);
        String str3 = mVar.f37647a + mVar.f37648b;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    n.A(file2, new File(str3, file2.getName()));
                } catch (Exception unused) {
                }
            }
        }
        n.f(file);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n.f(new File(str3, (String) it.next()));
        }
        mVar.f37658l = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void P(Drawable drawable, Drawable.Callback callback, TransformCallback transformCallback) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        TransformAwareDrawable transformAwareDrawable = drawable instanceof TransformAwareDrawable ? (TransformAwareDrawable) drawable : null;
        if (transformAwareDrawable != null) {
            transformAwareDrawable.setTransformCallback(transformCallback);
        }
    }

    public static final void Q(Drawable drawable, com.facebook.drawee.drawable.d dVar) {
        if (drawable == null || dVar == null) {
            return;
        }
        int i7 = dVar.f21229a;
        if (i7 != -1) {
            drawable.setAlpha(i7);
        }
        if (dVar.f21230b) {
            drawable.setColorFilter(dVar.f21231c);
        }
        int i10 = dVar.f21232d;
        if (i10 != -1) {
            drawable.setDither(i10 != 0);
        }
        int i11 = dVar.f21233e;
        if (i11 != -1) {
            drawable.setFilterBitmap(i11 != 0);
        }
    }

    public static void S(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            j1.a(view, charSequence);
            return;
        }
        l1 l1Var = l1.f12958p;
        if (l1Var != null && l1Var.f12959a == view) {
            l1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new l1(view, charSequence);
            return;
        }
        l1 l1Var2 = l1.t;
        if (l1Var2 != null && l1Var2.f12959a == view) {
            l1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static long T(int i7, long j6) {
        int i10 = (i7 & 7) << 3;
        return (j6 >>> (64 - i10)) | (j6 << i10);
    }

    public static void U(Context context, String str, Function0 onConfirm) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        String mobileNumber = PhoneBaseNumberUtils.INSTANCE.formatMobileNumber(str, false);
        if (mobileNumber == null) {
            mobileNumber = "";
        }
        SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(context.getString(Pd.f.qt_delete_single_topup_number_message)).append(mobileNumber).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, context)).append(context.getString(Pd.f.qt_delete_single_topup_number_suffix)).create();
        O6.c cVar = new O6.c(context);
        cVar.f6598d = spannableStringBuilderCreate;
        cVar.c(k.core_cancel, null);
        cVar.d(k.core_confirm, new u(onConfirm, 1));
        cVar.g();
    }

    public static int V(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 1) {
            return 90;
        }
        if (i7 == 2) {
            return 180;
        }
        if (i7 == 3) {
            return 270;
        }
        throw new IllegalArgumentException(G.m(i7, "Unsupported surface rotation: "));
    }

    public static void W(m mVar) {
        mVar.f37669x = 1;
        n.d(mVar.f37665s);
        n.d(mVar.t);
        mVar.f37665s = null;
        mVar.t = null;
        mVar.f37666u = null;
        mVar.f37667v = null;
    }

    public static boolean X(m mVar, C0505b c0505b) {
        Exception exc;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        try {
            int length = ((byte[]) c0505b.f7074d).length;
            String str = mVar.f37647a;
            String str2 = mVar.f37648b;
            File file = new File(str, str2 + ".kva");
            File file2 = new File(mVar.f37647a, str2 + ".kvb");
            if (!n.y(file) || !n.y(file2)) {
                throw new Exception("open file failed");
            }
            randomAccessFile2 = new RandomAccessFile(file, "rw");
            long j6 = length;
            try {
                randomAccessFile2.setLength(j6);
                FileChannel channel = randomAccessFile2.getChannel();
                mVar.f37665s = channel;
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = channel.map(mapMode, 0L, j6);
                mVar.f37666u = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                mVar.f37666u.put((byte[]) c0505b.f7074d, 0, mVar.f37650d);
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    randomAccessFile.setLength(j6);
                    FileChannel channel2 = randomAccessFile.getChannel();
                    mVar.t = channel2;
                    MappedByteBuffer map2 = channel2.map(mapMode, 0L, j6);
                    mVar.f37667v = map2;
                    map2.order(byteOrder);
                    mVar.f37667v.put((byte[]) c0505b.f7074d, 0, mVar.f37650d);
                    return true;
                } catch (Exception e10) {
                    exc = e10;
                    n.d(randomAccessFile2);
                    n.d(randomAccessFile);
                    mVar.f37665s = null;
                    mVar.t = null;
                    mVar.f37666u = null;
                    mVar.f37667v = null;
                    Log.e("FastKV", mVar.f37648b, exc);
                    return false;
                }
            } catch (Exception e11) {
                exc = e11;
                randomAccessFile = null;
            }
        } catch (Exception e12) {
            exc = e12;
            randomAccessFile = null;
            randomAccessFile2 = null;
        }
    }

    public static boolean Y(m mVar) {
        try {
            String str = mVar.f37647a;
            String str2 = mVar.f37648b;
            File file = new File(str, str2 + ".tmp");
            if (n.y(file)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile.setLength(mVar.f37650d);
                    randomAccessFile.write((byte[]) mVar.f37654h.f7074d, 0, mVar.f37650d);
                    randomAccessFile.getFD().sync();
                    randomAccessFile.close();
                    File file2 = new File(mVar.f37647a, str2 + ".kvc");
                    if (!(file.renameTo(file2) || ((!file2.exists() || file2.delete()) && file.renameTo(file2)))) {
                        new Exception("rename failed");
                        return false;
                    }
                    ArrayList arrayList = mVar.f37657k;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            n.j().execute(new com.flexibank.sdk.g(20, mVar, (String) it.next()));
                        }
                        arrayList.clear();
                    }
                    return true;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Exception e10) {
            Log.e("FastKV", mVar.f37648b, e10);
        }
        return false;
    }

    public static final void a(int i7, String str) {
        String message = com.airbnb.lottie.model.layer.d.j("TabScreen [", i7, "] emits event: ", str);
        Intrinsics.checkNotNullParameter("TabScreenEventEmitter", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public static final Object b(Task task, Continuation frame) throws Exception {
        if (!task.isComplete()) {
            C0765i c0765i = new C0765i(1, Ef.f.b(frame));
            c0765i.initCancellability();
            task.addOnCompleteListener(p088fg.a.f36799a, new p1.c(c0765i, 22));
            Object objM = c0765i.m();
            if (objM == Ef.a.f2423a) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objM;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static final void c(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        Boolean bool5 = Boolean.TRUE;
        boolean zC = Intrinsics.c(bool, bool5);
        boolean zC2 = Intrinsics.c(bool2, bool5);
        boolean zC3 = Intrinsics.c(bool3, bool5);
        if (bool4 != null) {
            p059e1.a.X("_loan_use_new_domain", bool4.equals(bool5));
        }
        p059e1.a.X("_show_rn_loan_home", zC);
        p059e1.a.X("_show_rn_new_loan_home", zC2);
        p059e1.a.X("_show_new_loan_home", zC3);
    }

    public static void d() {
        V v3 = V.f10828a;
        AbstractC0780y.m(v3, null, null, new Fa.c(2, null), 3);
        AbstractC0780y.m(v3, null, null, new Fa.e(2, null), 3);
    }

    public static final void e(int i7, int i10) {
        String strC;
        if (i7 <= 0 || i10 <= 0) {
            if (i7 != i10) {
                strC = "Both size " + i7 + " and step " + i10 + " must be greater than zero.";
            } else {
                strC = F.c(i7, "size ", " must be greater than zero.");
            }
            throw new IllegalArgumentException(strC.toString());
        }
    }

    public static void f(m mVar) {
        if (mVar.f37669x == 0) {
            try {
                M(mVar, mVar.f37666u);
                M(mVar, mVar.f37667v);
            } catch (Exception unused) {
                W(mVar);
            }
        }
        N(mVar);
        n.f(new File(mVar.f37647a + mVar.f37648b));
    }

    public static void g(m mVar, MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i7) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            MappedByteBuffer mappedByteBufferL = L(mappedByteBuffer2 == mVar.f37667v ? mVar.t : mVar.f37665s, mappedByteBuffer.capacity());
            if (mappedByteBufferL == null) {
                Log.e("FastKV", mVar.f37648b, new Exception("map failed"));
                W(mVar);
                return;
            } else {
                if (mappedByteBuffer2 == mVar.f37667v) {
                    mVar.f37667v = mappedByteBufferL;
                } else {
                    mVar.f37666u = mappedByteBufferL;
                }
                mappedByteBuffer2 = mappedByteBufferL;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i7);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    public static final void h(Drawable drawable, Drawable drawable2) {
        if (drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static void i(m mVar) {
        try {
            String str = mVar.f37647a;
            String str2 = mVar.f37648b;
            n.f(new File(str, str2 + ".kvc"));
            n.f(new File(mVar.f37647a, str2 + ".tmp"));
        } catch (Exception e10) {
            Log.e("FastKV", mVar.f37648b, e10);
        }
    }

    public static boolean j(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        WeakHashMap weakHashMap = N.f16168a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = M.f16164d;
        M m7 = (M) view.getTag(W.c.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (m7 == null) {
            m7 = new M();
            m7.f16165a = null;
            m7.f16166b = null;
            m7.f16167c = null;
            view.setTag(W.c.tag_unhandled_key_event_manager, m7);
        }
        WeakReference weakReference2 = m7.f16167c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        m7.f16167c = new WeakReference(keyEvent);
        if (m7.f16166b == null) {
            m7.f16166b = new SparseArray();
        }
        SparseArray sparseArray = m7.f16166b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            M.b(view2, keyEvent);
        }
        return true;
    }

    public static boolean k(KeyEventDispatcher$Component keyEventDispatcher$Component, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (keyEventDispatcher$Component != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return keyEventDispatcher$Component.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f21454b) {
                            try {
                                f21455c = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f21454b = true;
                        }
                        Method method = f21455c;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (N.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f21456d) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f21457e = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f21456d = true;
                }
                Field field = f21457e;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (N.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && N.c(view, keyEvent)) || keyEventDispatcher$Component.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final void l(N0.d db2) throws IOException {
        Intrinsics.checkNotNullParameter(db2, "db");
        Af.d dVarB = C1849p.b();
        Cursor cursorQuery = db2.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorQuery.moveToNext()) {
            try {
                dVarB.add(cursorQuery.getString(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.o(cursorQuery, th);
                    throw th2;
                }
            }
        }
        Unit unit = Unit.f38893a;
        cursorQuery.close();
        ListIterator listIterator = C1849p.a(dVarB).listIterator(0);
        while (true) {
            Af.b bVar = (Af.b) listIterator;
            if (!bVar.hasNext()) {
                return;
            }
            String triggerName = (String) bVar.next();
            Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
            if (y.m(triggerName, "room_fts_content_sync_", false)) {
                db2.execSQL("DROP TRIGGER IF EXISTS ".concat(triggerName));
            }
        }
    }

    public static synchronized void m() {
        if (!f21453a) {
            D3.a.r("native-imagetranscoder");
            f21453a = true;
        }
    }

    public static final Gf.a n(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new Gf.a(entries);
    }

    public static final Activity o(String... moduleNames) {
        int size;
        Intrinsics.checkNotNullParameter(moduleNames, "moduleNames");
        Set setA = C1847n.A(moduleNames);
        List<Activity> activityList = ActivityUtils.getActivityList();
        if (activityList != null && (size = activityList.size() - 1) >= 0) {
            while (true) {
                int i7 = size - 1;
                Activity activity = activityList.get(size);
                if (activity != null && activity.getClass().getName().equals("com.transsnet.palmpay.core.ui.activity.PPRNActivity")) {
                    Intent intent = activity.getIntent();
                    String stringExtra = intent != null ? intent.getStringExtra("rn_module_name") : null;
                    if (stringExtra != null && setA.contains(stringExtra)) {
                        return activity;
                    }
                }
                if (i7 >= 0) {
                    size = i7;
                }
            }
        }
        return null;
    }

    public static byte[] p(m mVar, io.fastkv.a aVar) {
        try {
            byte[] bArrI = n.i(new File(mVar.f37647a + mVar.f37648b, (String) aVar.f37635b));
            if (bArrI != null) {
                return bArrI;
            }
            return null;
        } catch (Exception e10) {
            Log.e("FastKV", mVar.f37648b, e10);
            return null;
        }
    }

    public static String q(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                    cursorQuery.close();
                    return string;
                }
                if (cursorQuery == null) {
                    return "";
                }
                cursorQuery.close();
                return "";
            } catch (IllegalArgumentException e10) {
                Locale.getDefault();
                e10.getMessage();
                if (cursorQuery == null) {
                    return "";
                }
            }
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    public static String r(String str, String str2) {
        return G.q("h5/invitation?invitQrCode=", str, "&code=", str2, "&scene=PalmPay&channelName=referrer-normal-invitation");
    }

    public static int s(int i7, int i10) {
        if (i10 >= 268435456) {
            throw new IllegalStateException("data size out of limit");
        }
        int i11 = m.f37645B;
        if (i10 <= i11) {
            return i11;
        }
        while (i7 < i10) {
            i7 <<= 1;
        }
        return i7;
    }

    public static Object t(m mVar, h hVar) {
        try {
            byte[] bArrI = n.i(new File(mVar.f37647a + mVar.f37648b, (String) hVar.f37635b));
            if (bArrI == null) {
                new Exception("Read object data failed");
                return null;
            }
            int i7 = bArrI[0] & UnsignedBytes.MAX_VALUE;
            String strE = mVar.f37654h.e(1, i7, bArrI);
            FastEncoder fastEncoder = (FastEncoder) mVar.f37649c.get(strE);
            if (fastEncoder == null) {
                new Exception("No encoder for tag:".concat(strE));
                return null;
            }
            hVar.f37634f = fastEncoder;
            int i10 = i7 + 1;
            return fastEncoder.decode(bArrI, i10, bArrI.length - i10);
        } catch (Exception e10) {
            Log.e("FastKV", mVar.f37648b, e10);
            return null;
        }
    }

    public static final AbstractC0774s u(androidx.room.G g7) {
        Map<String, Object> backingFieldMap = g7.getBackingFieldMap();
        Object objH = backingFieldMap.get("QueryDispatcher");
        if (objH == null) {
            objH = AbstractC0780y.h(g7.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", objH);
        }
        return (AbstractC0774s) objH;
    }

    public static int v(int i7, int i10, boolean z3) {
        int i11 = z3 ? ((i10 - i7) + MessageEvent.EVENT_CL_REPAYMENT_FAILED) % MessageEvent.EVENT_CL_REPAYMENT_FAILED : (i10 + i7) % MessageEvent.EVENT_CL_REPAYMENT_FAILED;
        if (p140j8.f.p(2, p140j8.f.G("CameraOrientationUtil"))) {
            StringBuilder sbP = q0.p(i7, "getRelativeImageRotation: destRotationDegrees=", i10, ", sourceRotationDegrees=", ", isOppositeFacing=");
            sbP.append(z3);
            sbP.append(", result=");
            sbP.append(i11);
            p140j8.f.G("CameraOrientationUtil");
        }
        return i11;
    }

    public static String w(m mVar, i iVar) {
        try {
            byte[] bArrI = n.i(new File(mVar.f37647a + mVar.f37648b, (String) iVar.f37635b));
            if (bArrI != null) {
                return new String(bArrI, StandardCharsets.UTF_8);
            }
            return null;
        } catch (Exception e10) {
            Log.e("FastKV", mVar.f37648b, e10);
            return null;
        }
    }

    public static final AbstractC0774s x(androidx.room.G g7) {
        Map<String, Object> backingFieldMap = g7.getBackingFieldMap();
        Object objH = backingFieldMap.get("TransactionDispatcher");
        if (objH == null) {
            objH = AbstractC0780y.h(g7.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", objH);
        }
        return (AbstractC0774s) objH;
    }

    public static final boolean y() {
        return p059e1.a.C("_show_rn_loan_home", false) || p059e1.a.C("_show_rn_new_loan_home", false);
    }

    public static void z(m mVar) {
        long j6;
        String str = mVar.f37647a;
        StringBuilder sb2 = new StringBuilder();
        String str2 = mVar.f37648b;
        File file = new File(str, G.r(sb2, str2, ".kva"));
        File file2 = new File(mVar.f37647a, q0.j(str2, ".kvb"));
        try {
            if (n.y(file) && n.y(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                mVar.f37665s = randomAccessFile.getChannel();
                mVar.t = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = mVar.f37665s;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : m.f37645B);
                    mVar.f37666u = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    FileChannel fileChannel2 = mVar.t;
                    if (length2 > 0) {
                        j6 = length2;
                    } else {
                        j6 = m.f37645B;
                        fileChannel2 = fileChannel2;
                    }
                    MappedByteBuffer map2 = fileChannel2.map(mapMode, 0L, j6);
                    mVar.f37667v = map2;
                    map2.order(byteOrder);
                    mVar.f37654h = new C0505b(mVar.f37666u.capacity());
                    if (length == 0 && length2 == 0) {
                        mVar.f37650d = 12;
                        return;
                    } else {
                        H(mVar, length, length2);
                        return;
                    }
                } catch (IOException e10) {
                    Log.e("FastKV", str2, e10);
                    W(mVar);
                    try {
                        if (B(mVar, file)) {
                            return;
                        }
                    } catch (IOException unused) {
                    }
                    N(mVar);
                    try {
                        if (B(mVar, file2)) {
                            return;
                        }
                    } catch (IOException unused2) {
                    }
                    N(mVar);
                    return;
                }
            }
            Log.e("FastKV", str2, new Exception("open file failed"));
            W(mVar);
        } catch (Exception e11) {
            Log.e("FastKV", str2, e11);
            N(mVar);
            W(mVar);
        }
    }

    public abstract void R(boolean z3);
}
