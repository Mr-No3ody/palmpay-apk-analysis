package androidx.work.impl.model;

import C0.G;
import Ce.T;
import Pa.AbstractC0520q;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.EditText;
import androidx.room.L;
import androidx.work.impl.WorkDatabase_Impl;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.load.model.x;
import com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks;
import com.bumptech.glide.load.resource.bitmap.y;
import com.facebook.common.internal.Predicate;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.cache.MemoryCacheTracker;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.network.ReactCookieJarContainer;
import com.google.common.net.HttpHeaders;
import com.google.common.primitives.UnsignedBytes;
import com.google.gson.Gson;
import com.growingio.android.debugger.ThreadSafeTipView$OnExitListener;
import com.growingio.android.sdk.track.webservices.widget.TipView;
import com.imuxuan.floatingview.FloatingMagnetView;
import com.imuxuan.floatingview.MagnetViewListener;
import com.luck.picture.lib.permissions.PermissionConfig;
import com.nimbusds.jose.shaded.gson.InstanceCreator;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.palmpay.lib.apm.network.OkHttpEventListener;
import com.palmpay.lib.scanplus.bean.CodeBean;
import com.palmpay.lib.scanplus.callback.OnScanListener;
import com.palmpay.lib.scanplus.view.ScanView;
import com.palmpay.rn.scan.ReactScanManager;
import com.transsnet.mtn.sdk.config.Result;
import com.transsnet.mtn.sdk.util.MTNHandler;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.ui.widget.CustomFloatingView;
import com.transsnet.palmpay.credit.bean.req.OcSaveSmsTokenReq;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.ui.activity.LifeBillsHomeActivity;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.internal.operators.observable.K;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.Proxy;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import net.lingala.zip4j.crypto.Encrypter;
import okhttp3.C1929i;
import okhttp3.C1948p;
import okhttp3.Callback;
import okhttp3.S;
import okhttp3.W;
import okhttp3.e0;
import p143jb.t;
import retrofit2.C1990h;
import retrofit2.C2002u;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.U;

/* JADX INFO: loaded from: classes.dex */
public final class b implements DependencyDao, WorkNameDao, Downsampler$DecodeCallbacks, ObjectConstructor, MemoryCache, ResourceReleaser, MagnetViewListener, MTNHandler, OnScanListener, CallAdapter, Callback, Encrypter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f18576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f18577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p337w8.l f18578f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18581c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f18579a = i7;
        this.f18580b = obj;
        this.f18581c = obj2;
    }

    public static void b(p314uf.b bVar, Ye.a aVar) {
        Xe.d dVar = bVar.t;
        if (aVar == null) {
            dVar.j(HttpHeaders.IF_NONE_MATCH);
            dVar.j(HttpHeaders.IF_MODIFIED_SINCE);
            return;
        }
        Xe.d dVar2 = aVar.f11375c;
        String str = (String) dVar2.a(HttpHeaders.ETAG);
        if (str != null) {
            dVar.j(HttpHeaders.IF_NONE_MATCH);
            dVar.e(str, HttpHeaders.IF_NONE_MATCH);
        }
        long jX = dVar2.x(HttpHeaders.LAST_MODIFIED);
        if (jX > 0) {
            String str2 = p226og.b.f40542a;
            Date date = new Date(jX);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM y HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(p226og.b.f40543b);
            String str3 = simpleDateFormat.format(date);
            dVar.j(HttpHeaders.IF_MODIFIED_SINCE);
            dVar.e(str3, HttpHeaders.IF_MODIFIED_SINCE);
        }
    }

    public static String e() {
        if (TextUtils.isEmpty(f18576d)) {
            f18576d = PhoneUtils.getUniqueId();
        }
        return f18576d;
    }

    public static String f() {
        if (TextUtils.isEmpty(f18577e)) {
            f18577e = BaseApplication.get().getVersionName() + "&" + BaseApplication.get().getVersionCode();
        }
        return f18577e;
    }

    public static void j(ThreadSafeTipView$OnExitListener threadSafeTipView$OnExitListener) {
        Activity activityX = p279s5.a.f42018a.x();
        if (activityX == null) {
            p198n5.h.c("ThreadSafeTipView", "showQuitedDialog: ForegroundActivity is NULL", new Object[0]);
        } else {
            new AlertDialog.Builder(activityX).setTitle(com.growingio.android.debugger.h.growing_debugger_device_unconnected).setMessage(com.growingio.android.debugger.h.growing_debugger_unconnected).setPositiveButton(com.growingio.android.debugger.h.growing_debugger_exit, new androidx.preference.g(threadSafeTipView$OnExitListener, 4)).setOnDismissListener(new T(threadSafeTipView$OnExitListener, 8)).setCancelable(false).create().show();
        }
    }

    public Eg.g a(p314uf.b bVar) {
        InputStream inputStream;
        Eg.g gVar = new Eg.g(4);
        Xe.b bVarE = ((org.greenrobot.eventbus.f) this.f18581c).e(bVar);
        gVar.f2442c = bVarE.f11200b;
        Exception exc = bVarE.f11202d;
        gVar.f2444e = exc;
        if (exc == null && (inputStream = bVarE.f11201c) != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int i7 = inputStream.read(bArr);
                    if (i7 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i7);
                }
                byteArrayOutputStream.close();
                gVar.f2443d = byteArrayOutputStream.toByteArray();
            } catch (IOException e10) {
                gVar.f2444e = e10;
            }
        }
        try {
            bVarE.close();
        } catch (Exception unused) {
        }
        return gVar;
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call call) {
        Executor executor = (Executor) this.f18581c;
        return executor == null ? call : new C1990h(executor, call);
    }

    public void c(V3.d task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (((V3.d) this.f18580b) == null) {
            this.f18580b = task;
        }
        V3.d dVar = (V3.d) this.f18581c;
        if (dVar != null) {
            dVar.f9985b = task;
        }
        this.f18581c = task;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public CloseableReference cache(Object obj, CloseableReference closeableReference) {
        ((MemoryCacheTracker) this.f18581c).onCachePut(obj);
        return ((MemoryCache) this.f18580b).cache(obj, closeableReference);
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        return ((InstanceCreator) this.f18580b).createInstance((Type) this.f18581c);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public boolean contains(Predicate predicate) {
        return ((MemoryCache) this.f18580b).contains(predicate);
    }

    public byte d(byte b7) {
        p315ug.b bVar = (p315ug.b) this.f18580b;
        int i7 = bVar.f43017a[2] | 2;
        byte b10 = (byte) ((((byte) ((i7 * (i7 ^ 1)) >>> 8)) & UnsignedBytes.MAX_VALUE) ^ b7);
        bVar.b(b7);
        return b10;
    }

    @Override // com.transsnet.mtn.sdk.util.MTNHandler
    public String encrypt(String str) {
        byte[] bytes;
        byte[] bytes2;
        switch (this.f18579a) {
            case 12:
                if (TextUtils.isEmpty(str)) {
                    return str;
                }
                try {
                    String string = ((Activity) this.f18581c).getString(p025ba.k.core_one_loop_private_key);
                    if (str != null) {
                        bytes = str.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    } else {
                        bytes = null;
                    }
                    return Z4.e.L(string, bytes);
                } catch (GeneralSecurityException e10) {
                    e10.printStackTrace();
                    return null;
                }
            default:
                if (TextUtils.isEmpty(str)) {
                    return str;
                }
                try {
                    String string2 = ((Activity) this.f18581c).getString(p025ba.k.core_one_loop_private_key);
                    if (str != null) {
                        bytes2 = str.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                    } else {
                        bytes2 = null;
                    }
                    return Z4.e.L(string2, bytes2);
                } catch (GeneralSecurityException e11) {
                    e11.printStackTrace();
                    return null;
                }
        }
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] bArr) throws Kf.d {
        bArr.getClass();
        int length = bArr.length;
        encryptData(bArr, 0, length);
        return length;
    }

    public boolean equals(Object obj) {
        switch (this.f18579a) {
            case 15:
                if (!(obj instanceof p058e0.a)) {
                    return false;
                }
                p058e0.a aVar = (p058e0.a) obj;
                Object obj2 = aVar.f35983a;
                String str = (String) this.f18580b;
                if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
                    return false;
                }
                Object obj3 = aVar.f35984b;
                String str2 = (String) this.f18581c;
                return obj3 == str2 || (obj3 != null && obj3.equals(str2));
            default:
                return super.equals(obj);
        }
    }

    public void g() {
        if (((TipView) this.f18580b) == null) {
            TipView tipView = new TipView((Context) this.f18581c);
            this.f18580b = tipView;
            tipView.setContent(com.growingio.android.debugger.h.growing_debugger_connecting_to_web);
        }
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public CloseableReference get(Object obj) {
        CloseableReference closeableReference = ((MemoryCache) this.f18580b).get(obj);
        MemoryCacheTracker memoryCacheTracker = (MemoryCacheTracker) this.f18581c;
        if (closeableReference == null) {
            memoryCacheTracker.onCacheMiss(obj);
            return closeableReference;
        }
        memoryCacheTracker.onCacheHit(obj);
        return closeableReference;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public int getCount() {
        return ((MemoryCache) this.f18580b).getCount();
    }

    @Override // com.facebook.cache.common.HasDebugData
    public String getDebugData() {
        return ((MemoryCache) this.f18580b).getDebugData();
    }

    @Override // androidx.work.impl.model.DependencyDao
    public List getDependentWorkIds(String str) {
        L lAcquire = L.f17714j.acquire("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f18580b;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                arrayList.add(cursorK.getString(0));
            }
            cursorK.close();
            lAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorK.close();
            lAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public List getNamesForWorkSpecId(String str) {
        L lAcquire = L.f17714j.acquire("SELECT name FROM workname WHERE work_spec_id=?", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f18580b;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                arrayList.add(cursorK.getString(0));
            }
            cursorK.close();
            lAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorK.close();
            lAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public List getPrerequisites(String str) {
        L lAcquire = L.f17714j.acquire("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f18580b;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                arrayList.add(cursorK.getString(0));
            }
            cursorK.close();
            lAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorK.close();
            lAcquire.release();
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public int getSizeInBytes() {
        return ((MemoryCache) this.f18580b).getSizeInBytes();
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public List getWorkSpecIdsWithName(String str) {
        L lAcquire = L.f17714j.acquire("SELECT work_spec_id FROM workname WHERE name=?", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f18580b;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                arrayList.add(cursorK.getString(0));
            }
            cursorK.close();
            lAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorK.close();
            lAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public boolean hasCompletedAllPrerequisites(String str) {
        L lAcquire = L.f17714j.acquire("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f18580b;
        workDatabase_Impl.assertNotSuspendingTransaction();
        boolean z3 = false;
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            if (cursorK.moveToFirst()) {
                z3 = cursorK.getInt(0) != 0;
            }
            return z3;
        } finally {
            cursorK.close();
            lAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public boolean hasDependents(String str) {
        L lAcquire = L.f17714j.acquire("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f18580b;
        workDatabase_Impl.assertNotSuspendingTransaction();
        boolean z3 = false;
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            if (cursorK.moveToFirst()) {
                z3 = cursorK.getInt(0) != 0;
            }
            return z3;
        } finally {
            cursorK.close();
            lAcquire.release();
        }
    }

    public int hashCode() {
        switch (this.f18579a) {
            case 15:
                String str = (String) this.f18580b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = (String) this.f18581c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public void i(String str) {
        com.bumptech.glide.load.engine.cache.b bVar;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.f18580b).get(str);
                J1.g.c(obj, "Argument must not be null");
                bVar = (com.bumptech.glide.load.engine.cache.b) obj;
                int i7 = bVar.f20619b;
                if (i7 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f20619b);
                }
                int i10 = i7 - 1;
                bVar.f20619b = i10;
                if (i10 == 0) {
                    com.bumptech.glide.load.engine.cache.b bVar2 = (com.bumptech.glide.load.engine.cache.b) ((HashMap) this.f18580b).remove(str);
                    if (!bVar2.equals(bVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                    }
                    com.bumptech.glide.load.engine.cache.h hVar = (com.bumptech.glide.load.engine.cache.h) this.f18581c;
                    synchronized (((ArrayDeque) hVar.f20634b)) {
                        if (((ArrayDeque) hVar.f20634b).size() < 10) {
                            ((ArrayDeque) hVar.f20634b).offer(bVar2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bVar.f20618a.unlock();
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public void insert(f fVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f18580b;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            ((Td.a) this.f18581c).e(fVar);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public void insertDependency(a aVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f18580b;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            ((Td.a) this.f18581c).e(aVar);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public Object inspect(Object obj) {
        return ((MemoryCache) this.f18580b).inspect(obj);
    }

    @Override // com.imuxuan.floatingview.MagnetViewListener
    public void onClick(FloatingMagnetView magnetView) {
        switch (this.f18579a) {
            case 10:
                Intrinsics.checkNotNullParameter(magnetView, "magnetView");
                int i7 = LifeBillsHomeActivity.f34485A;
                if (((LifeBillsHomeActivity) this.f18580b).n().getCountDownFinished()) {
                    ARouter.getInstance().build((String) this.f18581c).navigation();
                }
                break;
            default:
                CustomFloatingView customFloatingView = ((ReferEarnHomePageActivity) this.f18580b).f31901v0;
                Intrinsics.e(customFloatingView);
                if (customFloatingView.getCountDownFinished()) {
                    com.palmpay.lib.apm.launchcounter.util.d.F((String) this.f18581c);
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks
    public void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) throws IOException {
        IOException iOException = ((J1.f) this.f18581c).f4460b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            bitmapPool.put(bitmap);
            throw iOException;
        }
    }

    @Override // okhttp3.Callback
    public void onFailure(okhttp3.Call call, IOException iOException) {
        try {
            ((retrofit2.Callback) this.f18580b).onFailure((C2002u) this.f18581c, iOException);
        } catch (Throwable th) {
            U.s(th);
            th.printStackTrace();
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks
    public void onObtainBounds() {
        y yVar = (y) this.f18580b;
        synchronized (yVar) {
            yVar.f20967c = yVar.f20965a.length;
        }
    }

    @Override // com.imuxuan.floatingview.MagnetViewListener
    public void onRemove(FloatingMagnetView magnetView) {
        switch (this.f18579a) {
            case 10:
                Intrinsics.checkNotNullParameter(magnetView, "magnetView");
                break;
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(okhttp3.Call call, e0 e0Var) {
        retrofit2.Callback callback = (retrofit2.Callback) this.f18580b;
        C2002u c2002u = (C2002u) this.f18581c;
        try {
            try {
                callback.onResponse(c2002u, c2002u.c(e0Var));
            } catch (Throwable th) {
                U.s(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            U.s(th2);
            try {
                callback.onFailure(c2002u, th2);
            } catch (Throwable th3) {
                U.s(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // com.palmpay.lib.scanplus.callback.OnScanListener
    public boolean onResult(List list) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("codes", new Gson().toJson(list));
        ScanView scanView = (ScanView) this.f18580b;
        ReactScanManager reactScanManager = (ReactScanManager) this.f18581c;
        reactScanManager.dispatchScanResult(scanView, writableMapCreateMap);
        return !reactScanManager.isContinuous;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public void probe(Object obj) {
        ((MemoryCache) this.f18580b).probe(obj);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0040  */
    @Override // com.facebook.common.references.ResourceReleaser
    public void release(Object obj) {
        boolean z3;
        CountingMemoryCache.EntryStateObserver entryStateObserver;
        com.facebook.imagepipeline.cache.f fVar = (com.facebook.imagepipeline.cache.f) this.f18581c;
        com.facebook.imagepipeline.cache.d dVar = (com.facebook.imagepipeline.cache.d) this.f18580b;
        fVar.getClass();
        synchronized (fVar) {
            synchronized (fVar) {
                z3 = false;
                p213o2.e.f(dVar.f21405c > 0);
                dVar.f21405c--;
            }
            CloseableReference.d(fVar.g(dVar));
            if (!z3) {
                dVar = null;
            }
            if (dVar != null && (entryStateObserver = dVar.f21407e) != null) {
                entryStateObserver.onExclusivityChanged(dVar.f21403a, true);
            }
            fVar.e();
            fVar.maybeEvictEntries();
        }
        synchronized (fVar) {
            try {
                if (!dVar.f21406d && dVar.f21405c == 0) {
                    fVar.f21410b.e(dVar.f21403a, dVar);
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        CloseableReference.d(fVar.g(dVar));
        if (!z3) {
            dVar = null;
        }
        if (dVar != null) {
            entryStateObserver.onExclusivityChanged(dVar.f21403a, true);
        }
        fVar.e();
        fVar.maybeEvictEntries();
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public int removeAll(Predicate predicate) {
        return ((MemoryCache) this.f18580b).removeAll(predicate);
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return (Type) this.f18580b;
    }

    @Override // com.transsnet.mtn.sdk.util.MTNHandler
    public void result(Result result) {
        switch (this.f18579a) {
            case 12:
                if (result != null) {
                    int i7 = result.resultCode;
                    p143jb.o oVar = (p143jb.o) this.f18580b;
                    if (i7 == 101) {
                        Integer numValueOf = Integer.valueOf(i7);
                        oVar.getClass();
                        df.d<CommonResult> dVarConfirmOneLoopData = G.h(p221ob.c.f40268a).confirmOneLoopData(new OcSaveSmsTokenReq(oVar.f38547e, String.valueOf(numValueOf)));
                        dVarConfirmOneLoopData.getClass();
                        df.i iVar = p298tf.f.f42629b;
                        new K(dVarConfirmOneLoopData.k(iVar), iVar, 1).i(p071ef.b.a()).subscribe(new p161kf.e(p147jf.a.f38600d, p147jf.a.f38601e, p147jf.a.f38599c));
                    } else if (i7 == 102) {
                        oVar.B();
                        String str = result.msg;
                        if (TextUtils.isEmpty(str)) {
                            str = null;
                        }
                        if (str != null) {
                            ToastUtils.showLong(result.msg, new Object[0]);
                        }
                    } else if (i7 == 886) {
                        oVar.B();
                    } else {
                        oVar.B();
                    }
                }
                break;
            default:
                if (result != null) {
                    int i10 = result.resultCode;
                    if (i10 == 101) {
                        Integer numValueOf2 = Integer.valueOf(i10);
                        t tVar = (t) this.f18580b;
                        tVar.getClass();
                        df.d<CommonResult> dVarConfirmOneLoopData2 = G.h(p221ob.c.f40268a).confirmOneLoopData(new OcSaveSmsTokenReq(tVar.f38577c, String.valueOf(numValueOf2)));
                        dVarConfirmOneLoopData2.getClass();
                        df.i iVar2 = p298tf.f.f42629b;
                        new K(dVarConfirmOneLoopData2.k(iVar2), iVar2, 1).i(p071ef.b.a()).subscribe(new p161kf.e(p147jf.a.f38600d, p147jf.a.f38601e, p147jf.a.f38599c));
                        break;
                    } else if (i10 == 102) {
                        String str2 = result.msg;
                        if (TextUtils.isEmpty(str2)) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            ToastUtils.showLong(result.msg, new Object[0]);
                        }
                        break;
                    }
                }
                break;
        }
    }

    public String toString() {
        switch (this.f18579a) {
            case 15:
                StringBuilder sb2 = new StringBuilder("Pair{");
                sb2.append(this.f18580b);
                sb2.append(" ");
                sb2.append(this.f18581c);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(p262r2.b bVar) {
        ((MemoryCache) this.f18580b).trim(bVar);
    }

    public /* synthetic */ b(int i7, boolean z3) {
        this.f18579a = i7;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public boolean contains(Object obj) {
        return ((MemoryCache) this.f18580b).contains(obj);
    }

    public /* synthetic */ b(Object obj, int i7, Object obj2, boolean z3) {
        this.f18579a = i7;
        this.f18581c = obj;
        this.f18580b = obj2;
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] bArr, int i7, int i10) throws Kf.d {
        if (i10 < 0) {
            throw new Kf.d("invalid length specified to decrpyt data");
        }
        for (int i11 = i7; i11 < i7 + i10; i11++) {
            bArr[i11] = d(bArr[i11]);
        }
        return i10;
    }

    public b(top.zibin.luban.io.a aVar, retrofit2.adapter.rxjava2.d dVar) {
        this.f18579a = 23;
        this.f18580b = aVar;
        this.f18581c = new org.greenrobot.eventbus.f(dVar, 7);
    }

    public b(int i7) {
        C1929i c1929i;
        int i10 = 0;
        this.f18579a = i7;
        switch (i7) {
            case 17:
                this.f18580b = new ArrayList();
                this.f18581c = new ArrayList();
                break;
            case 24:
                ArrayList arrayList = new ArrayList();
                arrayList.add(W.HTTP_2);
                arrayList.add(W.HTTP_1_1);
                S s3 = new S();
                if (PermissionUtils.isGranted(PermissionConfig.WRITE_EXTERNAL_STORAGE)) {
                    c1929i = new C1929i(new File(BaseApplication.getContext().getExternalCacheDir(), "httpcache"), 52428800L);
                } else {
                    c1929i = new C1929i(new File(BaseApplication.getContext().getCacheDir(), "httpcache"), 20971520L);
                }
                s3.f40625k = c1929i;
                s3.d(arrayList);
                TimeUnit timeUnit = TimeUnit.MINUTES;
                C1948p connectionPool = new C1948p(5, 5L);
                Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
                s3.f40616b = connectionPool;
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                s3.b(18L, timeUnit2);
                s3.e(15L, timeUnit2);
                s3.f(15L, timeUnit2);
                s3.a(new p350xa.i());
                s3.a(new p350xa.a());
                s3.a(new p350xa.h());
                s3.a(new p350xa.l());
                s3.a(new p350xa.k());
                s3.a(new p350xa.g());
                s3.a(new p350xa.b());
                Proxy proxy = Proxy.NO_PROXY;
                if (!Intrinsics.c(proxy, s3.f40627m)) {
                    s3.f40614C = null;
                }
                s3.f40627m = proxy;
                boolean zC = p059e1.a.C("key_http_dns", false);
                if (zC) {
                    if (f18578f == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(0);
                        arrayList2.add(1);
                        Context context = BaseApplication.getContext();
                        Intrinsics.checkNotNullParameter(context, "context");
                        okhttp3.U client = BaseApplication.get().getHttpClient();
                        Intrinsics.checkNotNullParameter(client, "client");
                        boolean zC2 = p059e1.a.C("key_http_dns_cache", false);
                        p337w8.l lVar = new p337w8.l(context);
                        lVar.f43329d = context;
                        lVar.f43328c = true;
                        lVar.f43330e = 300000L;
                        lVar.f43331f = 120000L;
                        if (client != null) {
                            if (arrayList2.isEmpty()) {
                                Intrinsics.checkNotNullParameter(client, "client");
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(J3.a.d(client));
                                arrayList3.add(J3.a.c(client));
                                lVar.f43327b = arrayList3;
                            } else {
                                lVar.f43327b = J3.a.K(client, arrayList2);
                            }
                        } else {
                            lVar.f43327b = new ArrayList();
                            lVar.f43328c = false;
                        }
                        lVar.f43333h = zC2;
                        lVar.e();
                        f18578f = lVar;
                    }
                    p337w8.l lVar2 = f18578f;
                    f18578f = lVar2;
                    s3.c(lVar2);
                }
                if (!AbstractC0520q.f7145k) {
                    try {
                        OkHttpEventListener okHttpEventListener = new OkHttpEventListener();
                        this.f18581c = okHttpEventListener;
                        okHttpEventListener.setDebug(false);
                        ((OkHttpEventListener) this.f18581c).setTraceName("NetworkTraceV6");
                        ((OkHttpEventListener) this.f18581c).setUseHttpDns(zC);
                        OkHttpEventListener eventListener = (OkHttpEventListener) this.f18581c;
                        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
                        byte[] bArr = Dg.c.f1879a;
                        Intrinsics.checkNotNullParameter(eventListener, "<this>");
                        s3.f40619e = new Dg.a(eventListener, i10);
                        if (p267r9.a.f41645a.a()) {
                            ReactCookieJarContainer cookieJar = new ReactCookieJarContainer();
                            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
                            s3.f40624j = cookieJar;
                        }
                        break;
                    } catch (Exception unused) {
                    }
                }
                s3.a(p350xa.f.f43721i.getInstance());
                okhttp3.U u6 = new okhttp3.U(s3);
                this.f18580b = u6;
                com.transsnet.palmpay.custom_view.dialog.y yVar = u6.f40653a;
                yVar.f(32);
                yVar.g(3);
                break;
            default:
                this.f18580b = new HashMap();
                this.f18581c = new com.bumptech.glide.load.engine.cache.h();
                break;
        }
    }

    @Override // com.palmpay.lib.scanplus.callback.OnScanListener
    public void onCancel() {
    }

    private final void h(FloatingMagnetView floatingMagnetView) {
    }

    @Override // com.palmpay.lib.scanplus.callback.OnScanListener
    public void onPointClick(CodeBean codeBean) {
    }

    public b(WorkDatabase_Impl database, int i7) {
        this.f18579a = i7;
        switch (i7) {
            case 1:
                this.f18580b = database;
                Intrinsics.checkNotNullParameter(database, "database");
                this.f18581c = new Td.a(database, 4);
                break;
            default:
                this.f18580b = database;
                Intrinsics.checkNotNullParameter(database, "database");
                this.f18581c = new Td.a(database, 1);
                break;
        }
    }

    public b(top.zibin.luban.io.a aVar) {
        this.f18579a = 4;
        x xVar = new x(aVar);
        this.f18581c = new s(1);
        this.f18580b = xVar;
    }

    public b(char[] cArr, long j6) throws Kf.d {
        this.f18579a = 22;
        p315ug.b bVar = new p315ug.b();
        this.f18580b = bVar;
        if (cArr != null && cArr.length > 0) {
            bVar.a(cArr);
            byte[] bArr = new byte[12];
            SecureRandom secureRandom = new SecureRandom();
            for (int i7 = 0; i7 < 12; i7++) {
                bArr[i7] = d((byte) secureRandom.nextInt(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER));
            }
            this.f18581c = bArr;
            bVar.a(cArr);
            byte[] bArr2 = (byte[]) this.f18581c;
            bArr2[11] = (byte) (j6 >>> 24);
            bArr2[10] = (byte) (j6 >>> 16);
            encryptData(bArr2, 0, bArr2.length);
            return;
        }
        throw new Kf.d("input password is null or empty, cannot initialize standard encrypter");
    }

    public b(Context context) {
        this.f18579a = 6;
        this.f18581c = context;
        p291t5.b.e(new com.growingio.android.debugger.j(this, 1));
    }

    public b(EditText editText) {
        this.f18579a = 18;
        this.f18580b = editText;
        p228p0.i iVar = new p228p0.i(editText);
        this.f18581c = iVar;
        editText.addTextChangedListener(iVar);
        if (p228p0.a.f41150b == null) {
            synchronized (p228p0.a.f41149a) {
                try {
                    if (p228p0.a.f41150b == null) {
                        p228p0.a aVar = new p228p0.a();
                        try {
                            p228p0.a.f41151c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, p228p0.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        p228p0.a.f41150b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(p228p0.a.f41150b);
    }
}
