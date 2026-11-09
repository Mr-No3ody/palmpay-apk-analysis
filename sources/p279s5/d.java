package p279s5;

import C0.C0127t;
import E.AbstractC0210o;
import E.C0204i;
import E.Q;
import E.k0;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import V0.a0;
import android.app.Activity;
import android.app.Dialog;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteFullException;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.ViewGroup;
import androidx.appcompat.app.C0845x;
import androidx.appcompat.app.I;
import androidx.appcompat.view.ActionMode$Callback;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.imagecapture.v;
import androidx.camera.core.imagecapture.x;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.i;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.video.E;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.t;
import androidx.camera.video.s;
import androidx.camera.view.G;
import androidx.camera.view.H;
import androidx.core.provider.l;
import androidx.core.util.Consumer;
import androidx.core.view.C;
import androidx.core.view.N;
import androidx.core.view.U;
import androidx.dynamicanimation.animation.FrameCallbackScheduler;
import androidx.emoji2.text.j;
import androidx.lifecycle.B;
import androidx.room.L;
import androidx.work.impl.C1271d;
import androidx.work.impl.C1275h;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.m;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.growingio.android.sdk.a;
import com.growingio.android.sdk.track.modelloader.DataFetcher;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.contacts.ui.activity.AllContactsSearchActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.db.dao.RequestContactDao;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.manager.ShortUrlManager$ShortUrlCallback;
import com.transsnet.palmpay.core.web.WebJsCallback;
import com.transsnet.palmpay.ui.activity.CoinRainActivity;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.dialog.AcceptTurnOnSaveDialog;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p025ba.k;
import p140j8.f;
import p198n5.h;
import p216o5.b;
import p381za.c;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements AdShowCallback, FutureCallback, ReadWriteProperty, Argument2Callback, ObservableOnSubscribe, DataFetcher, ShortUrlManager$ShortUrlCallback, ActionMode$Callback, FrameCallbackScheduler, WorkLauncher, PreferenceDao {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static d f42023d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f42025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f42026c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f42024a = i7;
        this.f42025b = obj;
        this.f42026c = obj2;
    }

    public static d b() {
        if (f42023d == null) {
            h.c("ConfigurationProvider", "GrowingSDK doesn't have config yet, please initialized before use API", new Object[0]);
            return new d(new a(c.UNKNOWN_PROCESS_NAME, c.UNKNOWN_PROCESS_NAME), (HashMap) null);
        }
        synchronized (d.class) {
            try {
                d dVar = f42023d;
                if (dVar != null) {
                    return dVar;
                }
                h.c("ConfigurationProvider", "GrowingSDK doesn't have config yet, please initialized before use API", new Object[0]);
                return new d(new a(c.UNKNOWN_PROCESS_NAME, c.UNKNOWN_PROCESS_NAME), (HashMap) null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0279  */
    /* JADX WARN: Code duplicated, block: B:85:0x0154  */
    public b a(p216o5.a aVar) {
        int i7;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        byte[] bArr2;
        int i13;
        b bVar = new b();
        int i14 = aVar.f40028a;
        He.a aVar2 = (He.a) this.f42026c;
        if (i14 == 0) {
            ArrayList arrayList = aVar.f40029b;
            if (!((arrayList == null || arrayList.isEmpty()) ? false : true)) {
                throw new IllegalArgumentException("leak necessary event");
            }
            int iF = aVar2.f(aVar.f40029b);
            bVar.f40036c = iF;
            bVar.f40034a = iF == aVar.f40029b.size();
            return bVar;
        }
        Context context = (Context) aVar2.f3865c;
        if (i14 == 4) {
            if (aVar2.f3864b) {
                i13 = -1;
            } else {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis() - 604800000;
                    int iDelete = context.getContentResolver().delete(g.l(), "_created<=" + jCurrentTimeMillis, null);
                    h.c("EventDataManager", "removeOverdueEvents: deleteNum: %d", Integer.valueOf(iDelete));
                    i13 = iDelete;
                } catch (SQLiteFullException e10) {
                    aVar2.g(e10);
                    i13 = -1;
                } catch (Exception e11) {
                    h.d("EventDataManager", e11, "removeOverdueEvents failed", new Object[0]);
                    i13 = -1;
                }
            }
            bVar.f40036c = i13;
            bVar.f40034a = i13 >= 0;
        } else {
            String str = (String) aVar2.f3866d;
            if (i14 == 1) {
                int i15 = aVar.f40031d;
                if (i15 <= 0 || (i12 = aVar.f40030c) < 1 || i12 > 3) {
                    throw new IllegalArgumentException("leak necessary param");
                }
                if (aVar2.f3864b) {
                    bVar.f40034a = false;
                    return bVar;
                }
                ArrayList arrayList2 = new ArrayList();
                ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(str);
                try {
                    try {
                        Cursor cursorH = aVar2.h(contentProviderClientAcquireContentProviderClient, i12, i15);
                        int i16 = 0;
                        while (cursorH.moveToNext()) {
                            try {
                                i16++;
                                bVar.f40038e = cursorH.getString(cursorH.getColumnIndexOrThrow("_event_type"));
                                if (cursorH.isLast()) {
                                    bVar.f40035b = cursorH.getLong(cursorH.getColumnIndexOrThrow("_id"));
                                }
                                byte[] blob = cursorH.getBlob(cursorH.getColumnIndexOrThrow("_data"));
                                if (blob != null) {
                                    arrayList2.add(blob);
                                } else {
                                    aVar2.i(contentProviderClientAcquireContentProviderClient, cursorH.getLong(cursorH.getColumnIndexOrThrow("_id")));
                                }
                            } catch (Throwable th) {
                                if (cursorH == null) {
                                    throw th;
                                }
                                try {
                                    cursorH.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                        p231p5.b bVar2 = new p231p5.b();
                        bVar2.f41187c = arrayList2;
                        bVar2.f41185a = 1;
                        p231p5.a aVarE = He.a.e(bVar2);
                        if (aVarE != null && (bArr2 = aVarE.f41184a) != null) {
                            bVar.f40036c = i16;
                            bVar.f40034a = true;
                            bVar.f40037d = bArr2;
                            bVar.f40039f = "application/json";
                        }
                        cursorH.close();
                        if (contentProviderClientAcquireContentProviderClient != null) {
                            contentProviderClientAcquireContentProviderClient.release();
                            return bVar;
                        }
                    } catch (Throwable th3) {
                        if (contentProviderClientAcquireContentProviderClient != null) {
                            contentProviderClientAcquireContentProviderClient.release();
                        }
                        throw th3;
                    }
                } catch (SQLiteFullException e12) {
                    bVar.f40034a = false;
                    aVar2.g(e12);
                    if (contentProviderClientAcquireContentProviderClient != null) {
                        contentProviderClientAcquireContentProviderClient.release();
                    }
                    return bVar;
                } catch (Throwable th4) {
                    bVar.f40034a = false;
                    h.d("EventDataManager", th4, th4.getMessage(), new Object[0]);
                    if (contentProviderClientAcquireContentProviderClient != null) {
                        contentProviderClientAcquireContentProviderClient.release();
                    }
                    return bVar;
                }
            } else if (i14 == 3) {
                if (aVar.f40032e <= 0 || (i10 = aVar.f40030c) < 1 || i10 > 3 || TextUtils.isEmpty(aVar.f40033f)) {
                    throw new IllegalArgumentException("leak necessary param");
                }
                long j6 = aVar.f40032e;
                int i17 = aVar.f40030c;
                String str2 = aVar.f40033f;
                if (aVar2.f3864b) {
                    i11 = -1;
                } else {
                    try {
                        int iDelete2 = context.getContentResolver().delete(g.l(), "_id<=? AND _event_type=? AND _policy=?", new String[]{String.valueOf(j6), str2, String.valueOf(i17)});
                        h.a("EventDataManager", "removeEvents: deleteNum: %d", Integer.valueOf(iDelete2));
                        i11 = iDelete2;
                    } catch (SQLiteFullException e13) {
                        aVar2.g(e13);
                        i11 = -1;
                    } catch (Exception e14) {
                        h.d("EventDataManager", e14, "removeEvents failed", new Object[0]);
                        i11 = -1;
                    }
                }
                bVar.f40036c = i11;
                bVar.f40034a = i11 >= 0;
            } else if (i14 == 5) {
                int i18 = aVar.f40031d;
                if (i18 <= 0 || (i7 = aVar.f40030c) < 1 || i7 > 3) {
                    throw new IllegalArgumentException("leak necessary param");
                }
                if (aVar2.f3864b) {
                    bVar.f40034a = false;
                    return bVar;
                }
                ContentProviderClient contentProviderClientAcquireContentProviderClient2 = context.getContentResolver().acquireContentProviderClient(str);
                ArrayList arrayList3 = new ArrayList();
                try {
                    try {
                        Cursor cursorH2 = aVar2.h(contentProviderClientAcquireContentProviderClient2, i7, i18);
                        int i19 = 0;
                        while (cursorH2.moveToNext()) {
                            try {
                                i19++;
                                if (cursorH2.isLast()) {
                                    cursorH2.getLong(cursorH2.getColumnIndexOrThrow("_id"));
                                }
                                byte[] blob2 = cursorH2.getBlob(cursorH2.getColumnIndexOrThrow("_data"));
                                if (blob2 != null) {
                                    arrayList3.add(blob2);
                                }
                                aVar2.i(contentProviderClientAcquireContentProviderClient2, cursorH2.getLong(cursorH2.getColumnIndexOrThrow("_id")));
                            } catch (Throwable th5) {
                                if (cursorH2 == null) {
                                    throw th5;
                                }
                                try {
                                    cursorH2.close();
                                    throw th5;
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                    throw th5;
                                }
                            }
                        }
                        p231p5.b bVar3 = new p231p5.b();
                        bVar3.f41187c = arrayList3;
                        bVar3.f41185a = 1;
                        p231p5.a aVarE2 = He.a.e(bVar3);
                        if (aVarE2 != null && (bArr = aVarE2.f41184a) != null) {
                            bVar.f40036c = i19;
                            bVar.f40034a = true;
                            bVar.f40037d = bArr;
                            bVar.f40039f = "application/json";
                        }
                        cursorH2.close();
                        if (contentProviderClientAcquireContentProviderClient2 != null) {
                            contentProviderClientAcquireContentProviderClient2.release();
                            return bVar;
                        }
                    } catch (Throwable th7) {
                        if (contentProviderClientAcquireContentProviderClient2 != null) {
                            contentProviderClientAcquireContentProviderClient2.release();
                        }
                        throw th7;
                    }
                } catch (SQLiteFullException e15) {
                    aVar2.g(e15);
                    if (contentProviderClientAcquireContentProviderClient2 != null) {
                        contentProviderClientAcquireContentProviderClient2.release();
                    }
                } catch (Throwable th8) {
                    h.d("EventDataManager", th8, th8.getMessage(), new Object[0]);
                    if (contentProviderClientAcquireContentProviderClient2 != null) {
                        contentProviderClientAcquireContentProviderClient2.release();
                    }
                }
            } else {
                if (i14 != 6) {
                    bVar.f40034a = false;
                    return bVar;
                }
                if (!aVar2.f3864b) {
                    try {
                        context.getContentResolver().delete(g.l(), null, null);
                    } catch (SQLiteFullException e16) {
                        aVar2.g(e16);
                    } catch (Exception e17) {
                        h.d("EventDataManager", e17, "removeAllEvents failed", new Object[0]);
                    }
                }
                bVar.f40034a = true;
            }
        }
        return bVar;
    }

    public void c(androidx.core.provider.h hVar) {
        int i7 = hVar.f16123b;
        l lVar = (l) this.f42026c;
        p1.c cVar = (p1.c) this.f42025b;
        if (i7 != 0) {
            lVar.execute(new androidx.core.provider.a(cVar, i7, 0));
        } else {
            lVar.execute(new i(29, cVar, hVar.f16122a));
        }
    }

    @Override // com.growingio.android.sdk.track.modelloader.DataFetcher
    public Object executeData() {
        try {
            return a((p216o5.a) this.f42025b);
        } catch (IllegalArgumentException e10) {
            b bVar = new b();
            h.b("DatabaseDataFetcher", e10);
            return bVar;
        }
    }

    @Override // com.growingio.android.sdk.track.modelloader.DataFetcher
    public Class getDataClass() {
        return b.class;
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public Long getLongValue(String str) {
        L lAcquire = L.f17714j.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f42025b;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            Long lValueOf = null;
            if (cursorK.moveToFirst() && !cursorK.isNull(0)) {
                lValueOf = Long.valueOf(cursorK.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorK.close();
            lAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public B getObservableLongValue(String str) {
        L lAcquire = L.f17714j.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        lAcquire.bindString(1, str);
        return ((WorkDatabase_Impl) this.f42025b).getInvalidationTracker().b(new String[]{"Preference"}, false, new m(this, lAcquire, 9));
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public Object getValue(Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f42026c;
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public void insertPreference(androidx.work.impl.model.c cVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f42025b;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            ((Td.a) this.f42026c).e(cVar);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        if (((Integer) obj).intValue() != -1) {
            ToastUtils.showLong(k.core_operation_fail);
            return;
        }
        Context context = BaseApplication.getContext();
        Uri data = intent.getData();
        File file = (File) this.f42025b;
        p220oa.a.b(file, context, data);
        r0.x1((WeakReference) this.f42026c, file);
    }

    @Override // androidx.dynamicanimation.animation.FrameCallbackScheduler
    public boolean isCurrentThread() {
        return Thread.currentThread() == ((Looper) this.f42026c).getThread();
    }

    @Override // androidx.appcompat.view.ActionMode$Callback
    public boolean onActionItemClicked(p343x.a aVar, MenuItem menuItem) {
        return ((ActionMode$Callback) this.f42025b).onActionItemClicked(aVar, menuItem);
    }

    @Override // androidx.appcompat.view.ActionMode$Callback
    public boolean onCreateActionMode(p343x.a aVar, Menu menu) {
        return ((ActionMode$Callback) this.f42025b).onCreateActionMode(aVar, menu);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.appcompat.app.AppCompatCallback, java.lang.Object] */
    @Override // androidx.appcompat.view.ActionMode$Callback
    public void onDestroyActionMode(p343x.a aVar) {
        ((ActionMode$Callback) this.f42025b).onDestroyActionMode(aVar);
        I i7 = (I) this.f42026c;
        if (i7.f12140Y != null) {
            i7.t.getDecorView().removeCallbacks(i7.f12141Z);
        }
        if (i7.f12139X != null) {
            U u6 = i7.f12142k0;
            if (u6 != null) {
                u6.b();
            }
            U uA = N.a(i7.f12139X);
            uA.a(0.0f);
            i7.f12142k0 = uA;
            uA.d(new C0845x(this, 2));
        }
        i7.f12153w.onSupportActionModeFinished(i7.f12132Q);
        i7.f12132Q = null;
        ViewGroup viewGroup = i7.f12146q0;
        WeakHashMap weakHashMap = N.f16168a;
        C.c(viewGroup);
        i7.K();
    }

    @Override // com.transsnet.palmpay.core.manager.ShortUrlManager$ShortUrlCallback
    public void onFail(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i7 = WebJsCallback.t;
        WebJsCallback.g(((WebJsCallback) this.f42025b).b(), false);
        ToastUtils.showLong(msg, new Object[0]);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable t) {
        switch (this.f42024a) {
            case 3:
                p118hf.a.k(t instanceof k0, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + t);
                ((Consumer) this.f42025b).accept(new C0204i(1, (Surface) this.f42026c));
                return;
            case 4:
                int i7 = ((androidx.camera.core.processing.m) this.f42025b).f14431f;
                if (i7 == 2 && (t instanceof CancellationException)) {
                    f.G("DualSurfaceProcessorNode");
                    return;
                } else {
                    p377z5.l.i(i7);
                    f.G("DualSurfaceProcessorNode");
                    return;
                }
            case 21:
                d dVar = (d) this.f42025b;
                if (((v) dVar.f42026c).f13816g) {
                    return;
                }
                int iA = ((T) ((ArrayList) dVar.f42025b).get(0)).a();
                boolean z3 = t instanceof Q;
                x xVar = (x) this.f42026c;
                if (z3) {
                    E2.a aVar = xVar.f13823c;
                    androidx.camera.core.imagecapture.g gVar = new androidx.camera.core.imagecapture.g(iA, (Q) t);
                    aVar.getClass();
                    f.b();
                    ((androidx.camera.core.imagecapture.b) aVar.f2187f).f13744l.accept(gVar);
                } else {
                    E2.a aVar2 = xVar.f13823c;
                    androidx.camera.core.imagecapture.g gVar2 = new androidx.camera.core.imagecapture.g(iA, new Q(2, "Failed to submit capture request", t));
                    aVar2.getClass();
                    f.b();
                    ((androidx.camera.core.imagecapture.b) aVar2.f2187f).f13744l.accept(gVar2);
                }
                xVar.f13822b.unlockFlashMode();
                return;
            case 22:
                Intrinsics.checkNotNullParameter(t, "t");
                ((androidx.concurrent.futures.k) this.f42025b).d(t);
                return;
            case 23:
                Objects.toString(t);
                f.G("Recorder");
                return;
            case 24:
                t tVar = (t) this.f42026c;
                tVar.f14722k.f14747n.remove((androidx.camera.video.internal.encoder.h) this.f42025b);
                boolean z8 = t instanceof MediaCodec.CodecException;
                androidx.camera.video.internal.encoder.v vVar = tVar.f14722k;
                if (!z8) {
                    vVar.b(0, t.getMessage(), t);
                    return;
                }
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) t;
                vVar.getClass();
                vVar.b(1, codecException.getMessage(), codecException);
                return;
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", t);
        }
    }

    @Override // androidx.appcompat.view.ActionMode$Callback
    public boolean onPrepareActionMode(p343x.a aVar, Menu menu) {
        ViewGroup viewGroup = ((I) this.f42026c).f12146q0;
        WeakHashMap weakHashMap = N.f16168a;
        C.c(viewGroup);
        return ((ActionMode$Callback) this.f42025b).onPrepareActionMode(aVar, menu);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) throws AbstractC0210o {
        Encoder encoder;
        switch (this.f42024a) {
            case 3:
                ((Consumer) this.f42025b).accept(new C0204i(0, (Surface) this.f42026c));
                break;
            case 4:
                SurfaceOutput surfaceOutput = (SurfaceOutput) obj;
                surfaceOutput.getClass();
                ((SurfaceProcessorInternal) ((E2.a) this.f42026c).f2183b).onOutputSurface(surfaceOutput);
                break;
            case 21:
                ((x) this.f42026c).f13822b.unlockFlashMode();
                break;
            case 22:
                ((androidx.concurrent.futures.k) this.f42025b).b((androidx.camera.core.c) this.f42026c);
                break;
            case 23:
                Encoder encoder2 = (Encoder) obj;
                Objects.toString(encoder2);
                f.G("Recorder");
                if (encoder2 != null) {
                    s sVar = (s) this.f42026c;
                    ScheduledFuture scheduledFuture = sVar.f14861z;
                    if (scheduledFuture != null && scheduledFuture.cancel(false) && (encoder = sVar.f14855s) != null && encoder == encoder2) {
                        s.d(encoder);
                    }
                    sVar.f14834B = (E) this.f42025b;
                    sVar.g(null);
                    sVar.f();
                    break;
                }
                break;
            case 24:
                ((t) this.f42026c).f14722k.f14747n.remove((androidx.camera.video.internal.encoder.h) this.f42025b);
                break;
            default:
                p118hf.a.k(((C0204i) obj).f2039a != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                f.G("TextureViewImpl");
                ((SurfaceTexture) this.f42025b).release();
                H h7 = ((G) this.f42026c).f14889a;
                if (h7.f14895j != null) {
                    h7.f14895j = null;
                }
                break;
        }
    }

    @Override // androidx.dynamicanimation.animation.FrameCallbackScheduler
    public void postFrameCallback(final Runnable runnable) {
        ((Choreographer) this.f42025b).postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.dynamicanimation.animation.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j6) {
                runnable.run();
            }
        });
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object obj, KProperty property, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (Intrinsics.c(this.f42026c, obj2)) {
            return;
        }
        this.f42026c = obj2;
        ((C0127t) this.f42025b).invoke();
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.AdShowCallback
    public void showAppAd(AdEntity adEntity) {
        HomeActivity homeActivity;
        Intrinsics.checkNotNullParameter(adEntity, "adEntity");
        F6.d.h("debug_tag", 3, C0.G.o("adEntity.relativeUrl: ", adEntity.relativeUrl));
        boolean zEqualsIgnoreCase = "GOLD_RAIN".equalsIgnoreCase(adEntity.relativeUrl);
        HomeFragment homeFragment = (HomeFragment) this.f42025b;
        if (zEqualsIgnoreCase) {
            String zipName = adEntity.adId;
            String zipUrl = adEntity.imageUrl;
            homeFragment.getClass();
            n0.g().v("PalmPay_GiftRain_Match");
            if (i0.W(homeFragment.getActivity())) {
                CoinRainActivity.a aVar = CoinRainActivity.f34450i;
                String coinRainSpKey = aVar.getCoinRainSpKey();
                long jE = p059e1.a.E(0L, coinRainSpKey);
                if (0 != jE && TimeUtils.isToday(jE)) {
                    ((List) homeFragment.f35080A.getValue()).add(zipName);
                } else if (TextUtils.isEmpty(zipUrl)) {
                    if (ActivityUtils.getTopActivity() instanceof HomeActivity) {
                        if ((homeFragment.getActivity() instanceof HomeActivity) && (homeActivity = (HomeActivity) homeFragment.getActivity()) != null) {
                            homeActivity.p().dismissDialog();
                        }
                        CoinRainActivity.a.start$default(aVar, homeFragment.getContext(), coinRainSpKey, null, null, 12, null);
                        androidx.fragment.app.E activity = homeFragment.getActivity();
                        if (activity != null) {
                            activity.overridePendingTransition(0, 0);
                        }
                    }
                } else if (zipName != null) {
                    ExecutorService executorServiceB = Pa.T.b(-4);
                    Intrinsics.e(zipUrl);
                    Intrinsics.checkNotNullParameter(zipUrl, "zipUrl");
                    Intrinsics.checkNotNullParameter(zipName, "zipName");
                    Od.h hVar = new Od.h();
                    hVar.f6818a = zipUrl;
                    hVar.f6819b = zipName;
                    executorServiceB.submit(hVar);
                }
            }
        } else if ("TURN_ON_AUTO_SAVE".equalsIgnoreCase(adEntity.relativeUrl)) {
            String jumpParams = adEntity.jumpParams;
            Intrinsics.checkNotNullExpressionValue(jumpParams, "jumpParams");
            if (i0.W(homeFragment.getActivity())) {
                long jF = p059e1.a.F("main_sp_keyTurnOnSaveLastShowTime");
                if (0 == jF || !TimeUtils.isToday(jF)) {
                    Context contextRequireContext = homeFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    AcceptTurnOnSaveDialog acceptTurnOnSaveDialog = new AcceptTurnOnSaveDialog(contextRequireContext, jumpParams);
                    HomeActivity homeActivity2 = (HomeActivity) homeFragment.getActivity();
                    if (homeActivity2 != null) {
                        homeActivity2.p().showDialog(acceptTurnOnSaveDialog, HomeDialogState.PRIORITY_HIGHEST);
                    }
                    p059e1.a.Y(System.currentTimeMillis(), "main_sp_keyTurnOnSaveLastShowTime");
                }
            }
            ((List) homeFragment.f35080A.getValue()).add(adEntity.adId);
        }
        if (TextUtils.isEmpty(adEntity.adId)) {
            HomeFragment.v(homeFragment);
        }
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.AdShowCallback
    public void showCallback(Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        ((HomeFragment) this.f42025b).f35083H = System.currentTimeMillis();
        HomeActivity homeActivity = (HomeActivity) this.f42026c;
        if (homeActivity != null) {
            homeActivity.p().showDialog(dialog, HomeDialogState.PRIORITY_HIGHEST);
        }
    }

    @Override // androidx.work.impl.WorkLauncher
    public void startWork(C1275h workSpecId, a0 a0Var) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        ((TaskExecutor) this.f42026c).executeOnTaskThread(new j(this, 3, workSpecId, a0Var));
    }

    @Override // androidx.work.impl.WorkLauncher
    public void stopWork(C1275h workSpecId, int i7) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        ((TaskExecutor) this.f42026c).executeOnTaskThread(new androidx.work.impl.utils.l((C1271d) this.f42025b, workSpecId, false, i7));
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        switch (this.f42024a) {
            case 8:
                String strD = Pa.H.c(BaseApplication.getInstance()).d((String) this.f42025b);
                try {
                    if (!TextUtils.isEmpty(strD)) {
                        C0525w c0525wF = C0525w.f();
                        Class cls = (Class) this.f42026c;
                        c0525wF.getClass();
                        Object objD = C0525w.d(strD, cls);
                        if (objD instanceof CommonResult) {
                            ((CommonResult) objD).markParseFromCache(true);
                        }
                        if (objD != null) {
                            observableEmitter.onNext(objD);
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                observableEmitter.onComplete();
                break;
            case 9:
            default:
                ArrayList arrayList = new ArrayList();
                for (PalmPayContact palmPayContact : ((AllContactsSearchActivity) this.f42026c).f27161f) {
                    boolean zIsEmpty = TextUtils.isEmpty(palmPayContact.getAlias());
                    String str = (String) this.f42025b;
                    if (!zIsEmpty && palmPayContact.getAlias().toUpperCase().contains(str.toUpperCase())) {
                        arrayList.add(palmPayContact);
                    } else if (!TextUtils.isEmpty(palmPayContact.getPhone()) && palmPayContact.getPhone().toUpperCase().contains(str.toUpperCase())) {
                        arrayList.add(palmPayContact);
                    } else if (!TextUtils.isEmpty(palmPayContact.getFullName()) && palmPayContact.getFullName().toUpperCase().contains(str.toUpperCase())) {
                        arrayList.add(palmPayContact);
                    }
                }
                observableEmitter.onNext(arrayList);
                observableEmitter.onComplete();
                break;
            case 10:
                ArrayList arrayList2 = new ArrayList();
                for (PalmPayContact palmPayContact2 : (List) this.f42025b) {
                    boolean zIsEmpty2 = TextUtils.isEmpty(palmPayContact2.getAlias());
                    String str2 = (String) this.f42026c;
                    if (!zIsEmpty2 && palmPayContact2.getAlias().toUpperCase().contains(str2.toUpperCase())) {
                        arrayList2.add(palmPayContact2);
                    } else if (!TextUtils.isEmpty(palmPayContact2.getFullName()) && palmPayContact2.getFullName().toUpperCase().contains(str2.toUpperCase())) {
                        arrayList2.add(palmPayContact2);
                    } else if (!TextUtils.isEmpty(palmPayContact2.getPhone()) && palmPayContact2.getPhone().toUpperCase().contains(str2.toUpperCase())) {
                        arrayList2.add(palmPayContact2);
                    }
                }
                observableEmitter.onNext(arrayList2);
                observableEmitter.onComplete();
                break;
            case 11:
                p045d3.k kVar = ((U9.g) this.f42026c).f9298d;
                kVar.getClass();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                calendar.add(2, -3);
                observableEmitter.onNext(((RequestContactDao) kVar.f35518b).queryRequestContactList((String) this.f42025b, calendar.getTimeInMillis()));
                observableEmitter.onComplete();
                break;
            case 12:
                observableEmitter.onNext(Integer.valueOf(((RequestContactDao) ((U9.g) this.f42026c).f9298d.f35518b).update((RequestContact) this.f42025b)));
                observableEmitter.onComplete();
                break;
        }
    }

    public String toString() {
        switch (this.f42024a) {
            case 2:
                return "OutputFileOptions{mFile=" + ((File) this.f42025b) + ", mContentResolver=null, mSaveCollection=null, mContentValues=null, mOutputStream=null, mMetadata=" + ((E.N) this.f42026c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(int i7, boolean z3) {
        this.f42024a = i7;
    }

    public /* synthetic */ d(Object obj, int i7, Object obj2, boolean z3) {
        this.f42024a = i7;
        this.f42026c = obj;
        this.f42025b = obj2;
    }

    public d(int i7) {
        this.f42024a = i7;
        switch (i7) {
            case 27:
                this.f42025b = Choreographer.getInstance();
                this.f42026c = Looper.myLooper();
                break;
            default:
                this.f42025b = new ArrayList();
                this.f42026c = new ArrayList();
                break;
        }
    }

    public d(WorkDatabase_Impl database) {
        this.f42024a = 29;
        this.f42025b = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f42026c = new Td.a(database, 2);
    }

    public d(a aVar, HashMap map) {
        this.f42024a = 0;
        HashMap map2 = new HashMap();
        this.f42026c = map2;
        if (!TextUtils.isEmpty(aVar.f23183a)) {
            String str = aVar.f23184b;
            if (!TextUtils.isEmpty(str)) {
                if (!aVar.f23183a.equals(c.UNKNOWN_PROCESS_NAME) && !str.equals(c.UNKNOWN_PROCESS_NAME)) {
                    if (p291t5.b.d().getLooper() == Looper.myLooper()) {
                        this.f42025b = aVar;
                        map2.clear();
                        if (map != null) {
                            map2.putAll(map);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Growing Sdk 初始化必须在主线程中调用。");
                }
                h.c("ConfigurationProvider", "Growing Sdk 配置加载失败，请重新初始化", new Object[0]);
                this.f42025b = aVar;
                return;
            }
            throw new IllegalStateException("UrlScheme is NULL");
        }
        throw new IllegalStateException("ProjectId is NULL");
    }

    @Override // com.transsnet.palmpay.core.manager.ShortUrlManager$ShortUrlCallback
    public void onSuccess(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        int i7 = WebJsCallback.t;
        WebJsCallback.g(((WebJsCallback) this.f42025b).b(), false);
        n0.g().s("EVENT_SHARE_INVITE_CODE");
        Activity topActivity = ActivityUtils.getTopActivity();
        com.facebook.imagepipeline.nativecode.b.D(topActivity, topActivity.getString(Nd.c.share_invitation_info, ((User) this.f42026c).getNickName(), com.facebook.imagepipeline.nativecode.b.r(url, r0.K())));
    }

    public d(Object obj, C0127t invalidator) {
        this.f42024a = 5;
        Intrinsics.checkNotNullParameter(invalidator, "invalidator");
        this.f42025b = invalidator;
        this.f42026c = obj;
    }

    public d(C1271d processor, TaskExecutor workTaskExecutor) {
        this.f42024a = 28;
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        this.f42025b = processor;
        this.f42026c = workTaskExecutor;
    }

    public d(ArrayList arrayList, ArrayList arrayList2) {
        this.f42024a = 17;
        int size = arrayList.size();
        this.f42025b = new int[size];
        this.f42026c = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            ((int[]) this.f42025b)[i7] = ((Integer) arrayList.get(i7)).intValue();
            ((float[]) this.f42026c)[i7] = ((Float) arrayList2.get(i7)).floatValue();
        }
    }

    public d(int i7, int i10) {
        this.f42024a = 17;
        this.f42025b = new int[]{i7, i10};
        this.f42026c = new float[]{0.0f, 1.0f};
    }

    public d(int i7, int i10, int i11) {
        this.f42024a = 17;
        this.f42025b = new int[]{i7, i10, i11};
        this.f42026c = new float[]{0.0f, 0.5f, 1.0f};
    }
}
