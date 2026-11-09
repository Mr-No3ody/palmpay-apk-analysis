package io.fastkv;

import C0.G;
import E.C0197b;
import E.C0217w;
import E.C0218x;
import Gb.Q;
import V0.C;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.v0;
import Yf.u;
import Yf.v;
import Yf.x;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.media.ImageReader;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.camera.core.impl.SessionProcessor;
import androidx.lifecycle.LifecycleOwner;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.microsoft.codepush.react.CodePushConstants;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.liveness.result.LiveIDResult;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.ui.activity.C1488w;
import com.transsnet.palmpay.credit.init.LoanBusinessConfigTask;
import com.transsnet.palmpay.util.EncryptUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonEncoder;
import p051d9.C1624v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ExecutorService f37671a;

    public static void A(File file, File file2) {
        if (!file.exists() || file2.exists() || file.renameTo(file2)) {
            return;
        }
        byte[] bArrI = i(file);
        try {
            int length = bArrI.length;
            File file3 = new File(file2.getParent(), file2.getName() + ".tmp");
            if (y(file3)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
                try {
                    randomAccessFile.setLength(length);
                    randomAccessFile.write(bArrI, 0, length);
                    randomAccessFile.getFD().sync();
                    randomAccessFile.close();
                    if (!file3.renameTo(file2) && (!file2.exists() || file2.delete())) {
                        file3.renameTo(file2);
                    }
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                new Exception("create file failed");
            }
        } catch (Exception e10) {
            new Exception("save bytes failed", e10);
        }
        f(file);
    }

    public static void B(LifecycleOwner lifecycleOwner, com.transsnet.palmpay.core.base.l lVar, IBaseView view, Function2 onSuccess, Function1 function1, boolean z3, C1488w c1488w, int i7) {
        if ((i7 & 8) != 0) {
            function1 = new C1624v(19);
        }
        Function1 onError = function1;
        if ((i7 & 16) != 0) {
            z3 = true;
        }
        boolean z8 = z3;
        Function0 jVar = c1488w;
        if ((i7 & 32) != 0) {
            jVar = new G9.j(28);
        }
        Function0 checkLoading = jVar;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(checkLoading, "checkLoading");
        if (lVar != null) {
            lVar.e(lifecycleOwner, new T8.f(new p098ga.a(z8, checkLoading, view, onSuccess, lVar, onError)));
        }
    }

    public static String C(BaseApplication context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AssetManager assets = context.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        StringBuilder sb2 = new StringBuilder();
        try {
            InputStream inputStreamOpen = assets.open(LoanBusinessConfigTask.THEME_FILE_NAME);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            Unit unit = Unit.f38893a;
                            bufferedReader.close();
                            org.chromium.support_lib_boundary.util.b.o(inputStreamOpen, null);
                            return sb2.toString();
                        }
                        sb2.append(line);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            org.chromium.support_lib_boundary.util.b.o(bufferedReader, th);
                            throw th2;
                        }
                    }
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        org.chromium.support_lib_boundary.util.b.o(inputStreamOpen, th);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static void D(File file, byte[] bArr, int i7) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i10 = 0;
        while (i10 < i7) {
            try {
                int i11 = randomAccessFile.read(bArr, i10, i7 - i10);
                if (i11 < 0) {
                    break;
                } else {
                    i10 += i11;
                }
            } finally {
                d(randomAccessFile);
            }
        }
    }

    public static final List E(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(Constants.MessagePayloadKeys.FROM);
        int columnIndex4 = cursor.getColumnIndex("to");
        Af.d dVarB = C1849p.b();
        while (cursor.moveToNext()) {
            int i7 = cursor.getInt(columnIndex);
            int i10 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            dVarB.add(new K0.e(i7, string, i10, string2));
        }
        return CollectionsKt.S(C1849p.a(dVarB));
    }

    public static final K0.g F(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z3) throws IOException {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex("seqno");
            int columnIndex2 = cursorQuery.getColumnIndex("cid");
            int columnIndex3 = cursorQuery.getColumnIndex("name");
            int columnIndex4 = cursorQuery.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorQuery.moveToNext()) {
                    if (cursorQuery.getInt(columnIndex2) >= 0) {
                        int i7 = cursorQuery.getInt(columnIndex);
                        String columnName = cursorQuery.getString(columnIndex3);
                        String str2 = cursorQuery.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i7);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i7), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "columnsMap.values");
                List listY = CollectionsKt.Y(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues2, "ordersMap.values");
                K0.g gVar = new K0.g(str, z3, listY, CollectionsKt.Y(collectionValues2));
                cursorQuery.close();
                return gVar;
            }
            cursorQuery.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(cursorQuery, th);
                throw th2;
            }
        }
    }

    public static void G() {
        p145jd.a.b("check_auth_alias");
        try {
            p145jd.a.d("check_auth_alias", true);
        } catch (Exception e10) {
            e10.toString();
        }
    }

    public static final void H(LiveIDResult liveIDResult) {
        v0 v0VarC = AbstractC0780y.c();
        p042cg.f fVar = I.f10809a;
        AbstractC0780y.m(AbstractC0777v.a(kotlin.coroutines.e.c(v0VarC, p042cg.e.f19009c)), null, null, new p248q6.a(liveIDResult, null), 3);
    }

    public static void I(String str, String str2) {
        String strA = G.A();
        p059e1.a.W("main_sp_touch_id_login_vector" + strA, str);
        p059e1.a.W("main_sp_touch_id_login_encrypt_text" + strA, str2);
    }

    public static void J(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("_cipher_vector");
            String stringExtra2 = intent.getStringExtra("_encrypt_text");
            String strA = G.A();
            p059e1.a.W("main_sp_touch_id_pay_vector" + strA, stringExtra);
            p059e1.a.W("main_sp_touch_id_pay_encrypt_text" + strA, stringExtra2);
        }
    }

    public static void K(Window window, boolean z3) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            Z.b.f(window, z3);
        } else {
            if (i7 >= 30) {
                Z.b.e(window, z3);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void L(String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        p059e1.a.X(EncryptUtils.encryptMD5ToString(str + "key_touch_id_login_v4"), z3);
    }

    public static void M(boolean z3) {
        L(BaseApplication.get().getUser().getPhoneNumber(), z3);
    }

    public static void N(boolean z3) {
        String strA = G.A();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        p059e1.a.X(EncryptUtils.encryptMD5ToString(strA + "key_touch_id"), z3);
    }

    public static O6.d O(Context context, int i7, Integer num, String str, Integer num2, IconicsDrawable iconicsDrawable, Drawable drawable, CharSequence charSequence, Integer num3, String str2, View.OnClickListener onClickListener, Integer num4, String str3, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z3, int i10, int i11) {
        int i12 = (i11 & 1) != 0 ? 1 : i7;
        Integer num5 = (i11 & 2) != 0 ? null : num;
        String str4 = (i11 & 4) != 0 ? null : str;
        Integer num6 = (i11 & 8) != 0 ? null : num2;
        IconicsDrawable iconicsDrawable2 = (i11 & 32) != 0 ? null : iconicsDrawable;
        Drawable drawable2 = (i11 & 64) != 0 ? null : drawable;
        CharSequence charSequence2 = (i11 & 128) != 0 ? null : charSequence;
        Integer num7 = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : num3;
        String str5 = (i11 & 512) != 0 ? null : str2;
        View.OnClickListener onClickListener4 = (i11 & 1024) != 0 ? null : onClickListener;
        Integer num8 = (i11 & 2048) != 0 ? null : num4;
        String str6 = (i11 & 4096) != 0 ? null : str3;
        View.OnClickListener onClickListener5 = (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : onClickListener2;
        View.OnClickListener onClickListener6 = (i11 & 32768) == 0 ? onClickListener3 : null;
        boolean z8 = (i11 & 65536) != 0 ? false : z3;
        int i13 = (i11 & 131072) != 0 ? 0 : 8388611;
        int i14 = (i11 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? L6.i.ppDefaultDialogTheme : i10;
        Integer num9 = num7;
        Intrinsics.checkNotNullParameter(context, "<this>");
        O6.c cVar = new O6.c(context);
        cVar.f6614u = i12;
        if (num5 != 0) {
            cVar.e(num5.intValue());
        }
        if (str4 != null) {
            cVar.f(str4);
        }
        if (num6 != 0) {
            cVar.f6607m = num6.intValue();
        }
        if (iconicsDrawable2 != null) {
            cVar.f6608n = iconicsDrawable2;
        }
        if (drawable2 != null) {
            cVar.f6610p = drawable2;
        }
        cVar.f6598d = charSequence2;
        if (num9 != null) {
            cVar.d(num9.intValue(), onClickListener4);
        }
        if (str5 != null) {
            cVar.f6600f = str5;
            cVar.f6602h = onClickListener4;
        }
        if (num8 != null) {
            cVar.c(num8.intValue(), onClickListener5);
        }
        if (str6 != null) {
            cVar.f6601g = str6;
            cVar.f6603i = onClickListener5;
        }
        if (onClickListener6 != null) {
            cVar.f6604j = onClickListener6;
        }
        cVar.f6605k = z8;
        cVar.f6606l = i13;
        cVar.f6615v = i14;
        O6.d dVarG = cVar.g();
        dVarG.setCancelable(false);
        dVarG.setCanceledOnTouchOutside(false);
        return dVarG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void P(Activity activity, String str, Bundle bundle, int i7) {
        if ((i7 & 4) != 0) {
            bundle = null;
        }
        com.didi.drouter.router.d dVarL = com.didi.drouter.router.d.l(str);
        Intrinsics.checkNotNullExpressionValue(dVarL, "build(uri)");
        if (bundle != null) {
            ((Bundle) dVarL.f5949a).putBundle("BUNDLE", bundle);
        }
        if (activity instanceof LifecycleOwner) {
            dVarL.f21140e = ((LifecycleOwner) activity).getLifecycle();
        }
        dVarL.getClass();
        Context context = activity;
        if (activity == 0) {
            context = p092g2.c.f36839a;
        }
        dVarL.f21139d = context;
        com.didi.drouter.router.i iVar = new com.didi.drouter.router.i();
        iVar.f21155a = dVarL;
        Object[] objArr = new Object[0];
        if (p092g2.c.c()) {
            p092g2.c.a("Request start -------------------------------------------------------------", objArr);
        }
        com.didi.drouter.router.d dVar = iVar.f21155a;
        Object[] objArr2 = {dVar.f21142g, dVar.f21138c, false};
        if (p092g2.c.c()) {
            p092g2.c.a("primary request \"%s\", router uri \"%s\", need callback \"%s\"", objArr2);
        }
        iVar.f21155a.getClass();
        com.didi.drouter.router.d dVar2 = iVar.f21155a;
        com.didi.drouter.router.h hVar = new com.didi.drouter.router.h(iVar);
        Object[] objArr3 = {dVar2.f21142g};
        if (p092g2.c.c()) {
            p092g2.c.a(">> Enter request \"%s\" (global) interceptors", objArr3);
        }
        M.g gVar = com.didi.drouter.router.c.f21136c;
        M.g gVar2 = new M.g(0);
        if (gVar != null) {
            gVar2.addAll(gVar);
        }
        PriorityQueue priorityQueue = new PriorityQueue(5, new Q(10));
        M.b bVar = new M.b(gVar2);
        while (bVar.hasNext()) {
            priorityQueue.add(com.didi.drouter.router.c.a((Class) bVar.next()));
        }
        com.didi.drouter.router.b.a(priorityQueue, dVar2, hVar);
    }

    public static final void Q(SendChannel sendChannel, Object obj) {
        Object objMo64trySendJP2dKIU = sendChannel.mo64trySendJP2dKIU(obj);
        if (objMo64trySendJP2dKIU instanceof u) {
            Object obj2 = ((v) AbstractC0780y.p(new x(sendChannel, obj, null))).f11449a;
        } else {
            v.f11447b.m69successJP2dKIU(Unit.f38893a);
        }
    }

    public static final void a(Encoder encoder) {
        Intrinsics.checkNotNullParameter(encoder, "<this>");
        if ((encoder instanceof JsonEncoder ? (JsonEncoder) encoder : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + kotlin.jvm.internal.G.a(encoder.getClass()));
    }

    public static final JsonDecoder b(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "<this>");
        JsonDecoder jsonDecoder = decoder instanceof JsonDecoder ? (JsonDecoder) decoder : null;
        if (jsonDecoder != null) {
            return jsonDecoder;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + kotlin.jvm.internal.G.a(decoder.getClass()));
    }

    public static final boolean c(FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean, FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean2) {
        Intrinsics.checkNotNullParameter(flexiBankCashierPaymentMethodBean, "<this>");
        if (flexiBankCashierPaymentMethodBean2 != null && flexiBankCashierPaymentMethodBean.getSenderAccountType() == flexiBankCashierPaymentMethodBean2.getSenderAccountType() && flexiBankCashierPaymentMethodBean2 != null && flexiBankCashierPaymentMethodBean2.getSenderAccountType() == 1) {
            return true;
        }
        if (!TextUtils.isEmpty(flexiBankCashierPaymentMethodBean.getCardNo())) {
            if (Intrinsics.c(flexiBankCashierPaymentMethodBean.getCardNo(), flexiBankCashierPaymentMethodBean2 != null ? flexiBankCashierPaymentMethodBean2.getCardNo() : null)) {
                return true;
            }
        }
        if (!TextUtils.isEmpty(flexiBankCashierPaymentMethodBean.getAccountId())) {
            if (Intrinsics.c(flexiBankCashierPaymentMethodBean.getAccountId(), flexiBankCashierPaymentMethodBean2 != null ? flexiBankCashierPaymentMethodBean2.getAccountId() : null)) {
                return true;
            }
        }
        if (TextUtils.isEmpty(flexiBankCashierPaymentMethodBean.getBankAccountNo())) {
            return false;
        }
        return Intrinsics.c(flexiBankCashierPaymentMethodBean.getBankAccountNo(), flexiBankCashierPaymentMethodBean2 != null ? flexiBankCashierPaymentMethodBean2.getBankAccountNo() : null);
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static C0197b e(int i7, int i10, int i11, int i12) {
        return new C0197b(ImageReader.newInstance(i7, i10, i11, i12));
    }

    public static void f(File file) {
        try {
            if (file.exists()) {
                g(file);
            }
        } catch (Throwable unused) {
        }
    }

    public static void g(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                g(file2);
            }
        }
        file.delete();
    }

    public static TextView h(View view) {
        if (view instanceof TextView) {
            return (TextView) view;
        }
        if (view instanceof ViewGroup) {
            return h(((ViewGroup) view).getChildAt(0));
        }
        return null;
    }

    public static byte[] i(File file) {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            throw new IllegalArgumentException("file too large, path:" + file.getPath());
        }
        int i7 = (int) length;
        byte[] bArr = new byte[i7];
        D(file, bArr, i7);
        return bArr;
    }

    public static Executor j() {
        if (f37671a == null) {
            synchronized (n.class) {
                try {
                    if (f37671a == null) {
                        f37671a = ShadowExecutors.newOptimizedCachedThreadPool("\u200bio.fastkv.FastKVConfig");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37671a;
    }

    public static p047d5.b k(p021b5.b bVar, MenuItem menuItem) {
        String resourceEntryName;
        StringBuilder sb2 = new StringBuilder();
        if (bVar.f18774c) {
            sb2.append("/IgnorePage");
        } else {
            sb2.append("/Page");
        }
        Context applicationContext = com.growingio.android.sdk.d.a().getApplicationContext();
        sb2.append("/MenuView/MenuItem#");
        int itemId = menuItem.getItemId();
        if (itemId <= 2130706432) {
            resourceEntryName = null;
        } else {
            try {
                resourceEntryName = applicationContext.getResources().getResourceEntryName(itemId);
            } catch (Resources.NotFoundException e10) {
                p198n5.h.b("ViewHelper", e10);
                resourceEntryName = null;
            }
        }
        sb2.append(resourceEntryName);
        p047d5.a aVar = new p047d5.a();
        aVar.f35529i = false;
        aVar.f35528h = -1;
        aVar.f35525e = menuItem.getTitle() != null ? menuItem.getTitle().toString() : null;
        aVar.f35522b = sb2.toString();
        aVar.f35523c = sb2.toString();
        aVar.f35527g = sb2.toString();
        return aVar.a();
    }

    public static C0218x l(SessionProcessor sessionProcessor, C0218x c0218x) {
        boolean z3;
        if (sessionProcessor == null) {
            return c0218x;
        }
        C0217w c0217w = new C0217w(c0218x);
        boolean z8 = true;
        if (c0218x.f2134a.isEmpty() || u(sessionProcessor, 1, 2)) {
            z3 = false;
        } else {
            c0217w.b(1);
            z3 = true;
        }
        if (!c0218x.f2135b.isEmpty() && !u(sessionProcessor, 3)) {
            c0217w.b(2);
            z3 = true;
        }
        if (c0218x.f2136c.isEmpty() || u(sessionProcessor, 4)) {
            z8 = z3;
        } else {
            c0217w.b(4);
        }
        if (!z8) {
            return c0218x;
        }
        List listUnmodifiableList = Collections.unmodifiableList(c0217w.f2130a);
        List listUnmodifiableList2 = Collections.unmodifiableList(c0217w.f2131b);
        List listUnmodifiableList3 = Collections.unmodifiableList(c0217w.f2132c);
        if (listUnmodifiableList.isEmpty() && listUnmodifiableList2.isEmpty() && listUnmodifiableList3.isEmpty()) {
            return null;
        }
        return new C0218x(c0217w);
    }

    public static final String m(int i7, View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        String string = view.getResources().getString(i7);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static p047d5.b n(View view, ArrayList arrayList) {
        String string;
        if (arrayList == null) {
            arrayList = new ArrayList(8);
        }
        boolean z3 = false;
        do {
            if (p059e1.a.q(view) == null) {
                p021b5.b bVarK = p059e1.a.K(view);
                if (bVarK != null) {
                    arrayList.add(view);
                    if (!bVarK.f18774c) {
                        break;
                    }
                    z3 = true;
                } else if (!z3) {
                    arrayList.add(view);
                }
                if (!(view.getParent() instanceof View)) {
                    break;
                }
                view = (View) view.getParent();
            } else {
                arrayList.add(view);
                break;
            }
        } while (view instanceof ViewGroup);
        View view2 = (View) arrayList.get(arrayList.size() - 1);
        p021b5.b bVarK2 = p059e1.a.K(view2);
        if (p059e1.a.q(view2) != null) {
            string = "/" + p059e1.a.q(view2);
        } else if (bVarK2 != null) {
            string = com.palmpay.lib.apm.launchcounter.util.d.v(view2);
        } else {
            StringBuilder sbT = G.t(com.palmpay.lib.apm.launchcounter.util.d.v(view2), "/");
            String simpleName = view2.getClass().getSimpleName();
            if (TextUtils.isEmpty(simpleName)) {
                simpleName = "Anonymous";
            }
            sbT.append(simpleName);
            string = sbT.toString();
        }
        p047d5.a aVar = new p047d5.a();
        aVar.f35529i = false;
        aVar.f35521a = view2;
        aVar.f35528h = -1;
        aVar.f35525e = q(view2);
        aVar.f35522b = string;
        aVar.f35523c = string;
        if (bVarK2 == null) {
            string = "";
        }
        aVar.f35527g = string;
        return aVar.a();
    }

    public static String o(String str) {
        return p059e1.a.H("main_sp_touch_id_login_encrypt_text" + str);
    }

    public static String p(String str) {
        return p059e1.a.H("main_sp_touch_id_login_vector" + str);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00da  */
    public static String q(View view) {
        String string;
        int inputType;
        Editable text;
        Object tag = view.getTag(Z4.g.growing_tracker_view_content);
        String string2 = tag instanceof String ? (String) tag : null;
        if (string2 == null) {
            if (view instanceof EditText) {
                EditText editText = (EditText) view;
                Object tag2 = editText.getTag(Z4.g.growing_tracker_track_text);
                if ((tag2 instanceof Boolean ? (Boolean) tag2 : null) == null || (inputType = editText.getInputType() & 4095) == 129 || inputType == 225 || inputType == 18 || inputType == 145 || (text = editText.getText()) == null) {
                    string2 = "";
                } else {
                    string2 = text.toString();
                }
            } else if (view instanceof RatingBar) {
                string2 = String.valueOf(((RatingBar) view).getRating());
            } else if (view instanceof Spinner) {
                Spinner spinner = (Spinner) view;
                Object selectedItem = spinner.getSelectedItem();
                if (selectedItem instanceof String) {
                    string = (String) selectedItem;
                } else {
                    View selectedView = spinner.getSelectedView();
                    if (selectedView instanceof TextView) {
                        TextView textView = (TextView) selectedView;
                        if (textView.getText() != null) {
                            string = textView.getText().toString();
                        } else {
                            string = "";
                        }
                    } else {
                        string = "";
                    }
                }
                string2 = string;
            } else if (view instanceof SeekBar) {
                string2 = String.valueOf(((SeekBar) view).getProgress());
            } else if (view instanceof RadioGroup) {
                RadioGroup radioGroup = (RadioGroup) view;
                View viewFindViewById = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                if (viewFindViewById instanceof RadioButton) {
                    RadioButton radioButton = (RadioButton) viewFindViewById;
                    if (radioButton.getText() != null) {
                        string2 = radioButton.getText().toString();
                    } else {
                        string2 = "";
                    }
                } else {
                    string2 = "";
                }
            } else if (view instanceof TextView) {
                TextView textView2 = (TextView) view;
                if (textView2.getText() != null) {
                    string2 = textView2.getText().toString();
                } else {
                    string2 = "";
                }
            } else {
                string2 = "";
            }
            if (TextUtils.isEmpty(string2) && view.getContentDescription() != null) {
                string2 = view.getContentDescription().toString();
            }
        }
        if (string2 == null) {
            return "";
        }
        return (TextUtils.isEmpty(string2) || string2.length() <= 100) ? string2 : string2.substring(0, 100);
    }

    public static boolean r(View view) {
        Object parent = view.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view2 = (View) parent;
        Object tag = view2.getTag(Z4.g.growing_tracker_ignore_policy);
        Z4.f fVar = tag instanceof Z4.f ? (Z4.f) tag : null;
        if (fVar == Z4.f.f11519c || fVar == Z4.f.f11518b) {
            return true;
        }
        return r(view2);
    }

    public static final boolean s(int i7, int i10, com.facebook.imagepipeline.common.g gVar) {
        if (gVar == null) {
            return ((float) ((int) (((float) i7) * 1.3333334f))) >= 2048.0f && ((int) (((float) i10) * 1.3333334f)) >= 2048;
        }
        return ((int) (((float) i7) * 1.3333334f)) >= gVar.f21432a && ((int) (((float) i10) * 1.3333334f)) >= gVar.f21433b;
    }

    public static final boolean t(p109h3.e eVar, com.facebook.imagepipeline.common.g gVar) {
        if (eVar == null) {
            return false;
        }
        eVar.k();
        int i7 = eVar.f37276c;
        if (i7 == 90 || i7 == 270) {
            eVar.k();
            int i10 = eVar.f37279f;
            eVar.k();
            return s(i10, eVar.f37278e, gVar);
        }
        eVar.k();
        int i11 = eVar.f37278e;
        eVar.k();
        return s(i11, eVar.f37279f, gVar);
    }

    public static boolean u(SessionProcessor sessionProcessor, int... iArr) {
        if (sessionProcessor == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i7 : iArr) {
            arrayList.add(Integer.valueOf(i7));
        }
        return sessionProcessor.getSupportedCameraOperations().containsAll(arrayList);
    }

    public static boolean v() {
        return w(BaseApplication.get().getUser().getPhoneNumber());
    }

    public static boolean w(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("key_touch_id_login_v4");
        return (!p059e1.a.C(EncryptUtils.encryptMD5ToString(sb2.toString()), false) || TextUtils.isEmpty(o(str)) || TextUtils.isEmpty(p(str))) ? false : true;
    }

    public static boolean x() {
        String strA = G.A();
        if (!TextUtils.isEmpty(strA)) {
            if (p059e1.a.C(EncryptUtils.encryptMD5ToString(strA + "key_touch_id"), false)) {
                if (!TextUtils.isEmpty(p059e1.a.H("main_sp_touch_id_pay_encrypt_text" + strA))) {
                    return !TextUtils.isEmpty(p059e1.a.H("main_sp_touch_id_pay_vector" + strA));
                }
            }
        }
        return false;
    }

    public static boolean y(File file) {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    public static final void z(Context context) {
        Map mapB;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            C c6 = C.c();
            String[] strArr = androidx.work.impl.q.f18669a;
            c6.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            Intrinsics.checkNotNullExpressionValue(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
            File file = new File(noBackupFilesDir, "androidx.work.workdb");
            String[] strArr2 = androidx.work.impl.q.f18669a;
            int iA = F.a(strArr2.length);
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (String str : strArr2) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            Pair pair = new Pair(databasePath2, file);
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            Intrinsics.checkNotNullParameter(pair, "pair");
            if (linkedHashMap.isEmpty()) {
                mapB = F.b(pair);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, file);
                mapB = linkedHashMap2;
            }
            for (Map.Entry entry : mapB.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        C c10 = C.c();
                        String[] strArr3 = androidx.work.impl.q.f18669a;
                        file3.toString();
                        c10.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    C c11 = C.c();
                    String[] strArr4 = androidx.work.impl.q.f18669a;
                    c11.getClass();
                }
            }
        }
    }
}
