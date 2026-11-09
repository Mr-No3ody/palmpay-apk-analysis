package androidx.camera.video.internal;

import E.C0216v;
import T4.e;
import Yf.AbstractC0790b;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.LogPrinter;
import android.util.Size;
import android.util.SparseArray;
import androidx.camera.camera2.internal.H;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.C0975e;
import androidx.camera.core.impl.C0977f;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.n;
import androidx.camera.core.impl.y0;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import androidx.camera.view.i;
import androidx.camera.view.v;
import androidx.gridlayout.widget.GridLayout;
import androidx.lifecycle.AbstractServiceC1213x;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.a0;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.room.L;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.webkit.WebViewStartUpResult;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.o;
import com.bumptech.glide.load.engine.q;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.horcrux.svg.d0;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTakePhotoActivity;
import com.transsnet.palmpay.managemoney.ui.activity.InsuranceTakePhotoActivity;
import com.transsnet.palmpay.util.StringUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.ObservableEmitter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;
import net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import p056dg.h;
import p279s5.j;
import p279s5.k;
import p372yg.f;
import p372yg.g;
import ta.p;
import top.zibin.luban.OnCompressListener;

/* JADX INFO: loaded from: classes.dex */
public final class c implements EncoderProfilesProvider, FutureCallback, WebViewStartUpResult, WorkTagDao, OnCompressListener, SelectClause0, SelectClause1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14623d;

    public /* synthetic */ c(int i7, boolean z3) {
        this.f14620a = i7;
    }

    public static f e(g gVar, int i7, long j6) {
        ArrayList arrayList;
        f fVar = new f();
        fVar.f17706a = 10;
        fVar.f44382b = 44L;
        F1.b bVar = gVar.f44392b;
        if (bVar != null && (arrayList = bVar.f2516a) != null && arrayList.size() > 0) {
            p372yg.d dVar = (p372yg.d) bVar.f2516a.get(0);
            fVar.f44383c = dVar.f44378n;
            fVar.f44384d = dVar.f44363b;
        }
        p372yg.c cVar = gVar.f44393c;
        fVar.f44385e = cVar.f44375b;
        fVar.f44386f = cVar.f44377d;
        long size = bVar.f2516a.size();
        fVar.f44387g = size;
        fVar.f44388h = size;
        fVar.f44389i = i7;
        fVar.f44390j = j6;
        return fVar;
    }

    public static Object[] f(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        LogPrinter logPrinter = GridLayout.f17266j;
        int iMax = -1;
        for (int i7 : iArr) {
            iMax = Math.max(iMax, i7);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, iMax + 1);
        for (int i10 = 0; i10 < length; i10++) {
            objArr2[iArr[i10]] = objArr[i10];
        }
        return objArr2;
    }

    public static c g() {
        k kVar = j.f42028a;
        E2.a aVar = p279s5.c.f42022a;
        String strC = aVar.c();
        if (TextUtils.isEmpty((String) aVar.f2187f)) {
            aVar.f2187f = ((com.growingio.android.sdk.a) p279s5.d.b().f42025b).f23185c;
        }
        String str = (String) aVar.f2187f;
        if (TextUtils.isEmpty(kVar.f42030b)) {
            String str2 = Build.VERSION.RELEASE;
            if (str2 == null) {
                str2 = p381za.c.UNKNOWN_PROCESS_NAME;
            }
            kVar.f42030b = str2;
        }
        String str3 = p381za.c.UNKNOWN_PROCESS_NAME;
        String str4 = kVar.f42030b;
        String strA = kVar.a();
        if (TextUtils.isEmpty(kVar.f42031c)) {
            String str5 = Build.BRAND;
            if (str5 == null) {
                str5 = str3;
            }
            kVar.f42031c = str5;
        }
        String str6 = kVar.f42031c;
        if (TextUtils.isEmpty(kVar.f42032d)) {
            String str7 = Build.MODEL;
            if (str7 != null) {
                str3 = str7;
            }
            kVar.f42032d = str3;
        }
        return new c(strC, str, str4, strA, str6, kVar.f42032d);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.m] */
    private final Function3 j() {
        return (m) this.f14622c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.m] */
    private final Function3 m() {
        return (m) this.f14623d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.m] */
    private final Function3 n() {
        return (m) this.f14623d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(g gVar, OutputStream outputStream) {
        int currentSplitFileCounter;
        if (outputStream instanceof OutputStreamWithSplitZipSupport) {
            OutputStreamWithSplitZipSupport outputStreamWithSplitZipSupport = (OutputStreamWithSplitZipSupport) outputStream;
            gVar.f44393c.f44376c = outputStreamWithSplitZipSupport.getFilePointer();
            currentSplitFileCounter = outputStreamWithSplitZipSupport.getCurrentSplitFileCounter();
        } else {
            currentSplitFileCounter = 0;
        }
        boolean z3 = gVar.f44396f;
        p372yg.c cVar = gVar.f44393c;
        if (z3) {
            if (gVar.f44395e == null) {
                gVar.f44395e = new f();
            }
            if (gVar.f44394d == null) {
                gVar.f44394d = new p372yg.c();
            }
            gVar.f44395e.f44390j = cVar.f44376c;
            p372yg.c cVar2 = gVar.f44394d;
            cVar2.f44375b = currentSplitFileCounter;
            cVar2.f44377d = currentSplitFileCounter + 1;
        }
        cVar.f44375b = currentSplitFileCounter;
        cVar.f44377d = currentSplitFileCounter;
    }

    public static void w(g gVar, int i7, long j6, ByteArrayOutputStream byteArrayOutputStream, top.zibin.luban.io.a aVar) throws IOException {
        byte[] bArr = new byte[8];
        aVar.z(byteArrayOutputStream, (int) 101010256);
        aVar.C(byteArrayOutputStream, gVar.f44393c.f44375b);
        aVar.C(byteArrayOutputStream, gVar.f44393c.f44377d);
        long size = gVar.f44392b.f2516a.size();
        aVar.C(byteArrayOutputStream, (int) (size > 65535 ? 65535L : size));
        if (size > 65535) {
            size = 65535;
        }
        aVar.C(byteArrayOutputStream, (int) size);
        aVar.z(byteArrayOutputStream, i7);
        if (j6 > 4294967295L) {
            top.zibin.luban.io.a.B(bArr, 4294967295L);
            byteArrayOutputStream.write(bArr, 0, 4);
        } else {
            top.zibin.luban.io.a.B(bArr, j6);
            byteArrayOutputStream.write(bArr, 0, 4);
        }
        if (!Ag.a.c("")) {
            aVar.C(byteArrayOutputStream, 0);
            return;
        }
        byte[] bArrM = n.m("", null);
        aVar.C(byteArrayOutputStream, bArrM.length);
        byteArrayOutputStream.write(bArrM);
    }

    public static void x(f fVar, ByteArrayOutputStream byteArrayOutputStream, top.zibin.luban.io.a aVar) {
        aVar.z(byteArrayOutputStream, (int) d0.c(fVar.f17706a));
        aVar.A(byteArrayOutputStream, fVar.f44382b);
        aVar.C(byteArrayOutputStream, fVar.f44383c);
        aVar.C(byteArrayOutputStream, fVar.f44384d);
        aVar.z(byteArrayOutputStream, fVar.f44385e);
        aVar.z(byteArrayOutputStream, fVar.f44386f);
        aVar.A(byteArrayOutputStream, fVar.f44387g);
        aVar.A(byteArrayOutputStream, fVar.f44388h);
        aVar.A(byteArrayOutputStream, fVar.f44389i);
        aVar.A(byteArrayOutputStream, fVar.f44390j);
    }

    public void a(int i7, String str) {
        c(String.valueOf(i7), str);
    }

    public void b(String str, boolean z3) {
        c(String.valueOf(z3), str);
    }

    public void c(Object obj, String str) {
        c cVar = new c(18, false);
        ((c) this.f14622c).f14622c = cVar;
        this.f14622c = cVar;
        cVar.f14623d = obj;
        cVar.f14621b = str;
    }

    public org.greenrobot.eventbus.f d() {
        if (((p) this.f14623d) == null && !StringUtils.isEmpty("")) {
            this.f14623d = new p("");
        }
        if (((V3.d) this.f14622c) == null) {
            String[] requiredPermissions = (String[]) this.f14621b;
            p pVar = (p) this.f14623d;
            Intrinsics.checkNotNullParameter(requiredPermissions, "requiredPermissions");
            ta.f fVar = new ta.f(requiredPermissions, pVar);
            fVar.f42374f = new org.sufficientlysecure.htmltextview.n(10);
            this.f14622c = fVar;
        }
        return new org.greenrobot.eventbus.f(this);
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public void deleteByWorkSpecId(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f14621b;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = (Td.c) this.f14622c;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindString(1, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i7) {
        switch (this.f14620a) {
            case 0:
                return k(i7);
            default:
                return l(i7);
        }
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Object getClauseObject() {
        switch (this.f14620a) {
            case 12:
                break;
        }
        return this.f14621b;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public Long getMaxTimePerTaskInUiThreadMillis() {
        return ((WebViewStartUpResultBoundaryInterface) this.f14622c).getMaxTimePerTaskInUiThreadMillis();
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public List getNonUiThreadBlockingStartUpLocations() {
        return (ArrayList) this.f14623d;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Function3 getOnCancellationConstructor() {
        switch (this.f14620a) {
        }
        return null;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Function3 getProcessResFunc() {
        switch (this.f14620a) {
            case 12:
                return (h) this.f14622c;
            default:
                return j();
        }
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Function3 getRegFunc() {
        switch (this.f14620a) {
            case 12:
                return m();
            default:
                return n();
        }
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public List getTagsForWorkSpecId(String str) {
        L lAcquire = L.f17714j.acquire("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f14621b;
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

    @Override // androidx.webkit.WebViewStartUpResult
    public Long getTotalTimeInUiThreadMillis() {
        return ((WebViewStartUpResultBoundaryInterface) this.f14622c).getTotalTimeInUiThreadMillis();
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public List getUiThreadBlockingStartUpLocations() {
        return (ArrayList) this.f14621b;
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public List getWorkSpecIdsWithTag(String str) {
        L lAcquire = L.f17714j.acquire("SELECT work_spec_id FROM worktag WHERE tag=?", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f14621b;
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

    public a0 h(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return i(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i7) {
        switch (this.f14620a) {
            case 0:
                return ((EncoderProfilesProvider) this.f14621b).hasProfile(i7) && k(i7) != null;
            default:
                return ((EncoderProfilesProvider) this.f14621b).hasProfile(i7) && l(i7) != null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a0 i(Class modelClass, String key) {
        a0 viewModel;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        i0 i0Var = (i0) this.f14621b;
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = i0Var.f17458a;
        a0 a0Var = (a0) linkedHashMap.get(key);
        boolean zIsInstance = modelClass.isInstance(a0Var);
        ViewModelProvider$Factory viewModelProvider$Factory = (ViewModelProvider$Factory) this.f14623d;
        if (zIsInstance) {
            h0 h0Var = viewModelProvider$Factory instanceof h0 ? (h0) viewModelProvider$Factory : null;
            if (h0Var != null) {
                Intrinsics.e(a0Var);
                h0Var.a(a0Var);
            }
            Intrinsics.f(a0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return a0Var;
        }
        z0.d dVar = new z0.d((z0.b) this.f14622c);
        dVar.b(g0.f17456d, key);
        try {
            viewModel = viewModelProvider$Factory.create(modelClass, dVar);
        } catch (AbstractMethodError unused) {
            viewModel = viewModelProvider$Factory.create(modelClass);
        }
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        a0 a0Var2 = (a0) linkedHashMap.put(key, viewModel);
        if (a0Var2 != null) {
            a0Var2.b();
        }
        return viewModel;
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public void insert(o oVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f14621b;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            ((Td.a) this.f14623d).e(oVar);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    public EncoderProfilesProxy k(int i7) {
        HashMap map = (HashMap) this.f14622c;
        if (map.containsKey(Integer.valueOf(i7))) {
            return (EncoderProfilesProxy) map.get(Integer.valueOf(i7));
        }
        EncoderProfilesProvider encoderProfilesProvider = (EncoderProfilesProvider) this.f14621b;
        C0975e c0975eA = null;
        if (encoderProfilesProvider.hasProfile(i7)) {
            EncoderProfilesProxy all = encoderProfilesProvider.getAll(i7);
            if (all != null) {
                ArrayList arrayList = new ArrayList();
                for (C0977f c0977f : all.getVideoProfiles()) {
                    if (androidx.camera.video.internal.utils.b.a(c0977f, (C0216v) this.f14623d)) {
                        arrayList.add(c0977f);
                    }
                }
                if (!arrayList.isEmpty()) {
                    c0975eA = C0975e.a(all.getDefaultDurationSeconds(), all.getRecommendedFileFormat(), all.getAudioProfiles(), arrayList);
                }
            }
            map.put(Integer.valueOf(i7), c0975eA);
        }
        return c0975eA;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
    public EncoderProfilesProxy l(int i7) {
        EncoderProfilesProxy encoderProfilesProxyA;
        Size size;
        HashMap map = (HashMap) this.f14622c;
        if (map.containsKey(Integer.valueOf(i7))) {
            return (EncoderProfilesProxy) map.get(Integer.valueOf(i7));
        }
        EncoderProfilesProvider encoderProfilesProvider = (EncoderProfilesProvider) this.f14621b;
        if (encoderProfilesProvider.hasProfile(i7)) {
            EncoderProfilesProxy all = encoderProfilesProvider.getAll(i7);
            Objects.requireNonNull(all);
            Iterator it = ((y0) this.f14623d).c(StretchedVideoResolutionQuirk.class).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((StretchedVideoResolutionQuirk) it.next()) != null) {
                        if (i7 == 4) {
                            size = new Size(640, 480);
                            break;
                        }
                        if (i7 == 5) {
                            size = new Size(960, 720);
                            break;
                        }
                        if (i7 == 6) {
                            size = new Size(1440, 1080);
                            break;
                        }
                        break;
                    }
                }
                size = null;
                break;
            }
            if (size == null) {
                encoderProfilesProxyA = all;
            } else {
                ArrayList arrayList = new ArrayList();
                for (C0977f c0977f : all.getVideoProfiles()) {
                    arrayList.add(new C0977f(c0977f.f14048a, c0977f.f14049b, c0977f.f14050c, c0977f.f14051d, size.getWidth(), size.getHeight(), c0977f.f14054g, c0977f.f14055h, c0977f.f14056i, c0977f.f14057j));
                }
                if (arrayList.isEmpty()) {
                    encoderProfilesProxyA = null;
                } else {
                    encoderProfilesProxyA = C0975e.a(all.getDefaultDurationSeconds(), all.getRecommendedFileFormat(), all.getAudioProfiles(), arrayList);
                }
            }
        } else {
            encoderProfilesProxyA = null;
        }
        map.put(Integer.valueOf(i7), encoderProfilesProxyA);
        return encoderProfilesProxyA;
    }

    @Override // top.zibin.luban.OnCompressListener
    public void onError(int i7, Throwable th) {
        switch (this.f14620a) {
            case 11:
                ToastUtils.showShort(th != null ? th.getMessage() : null, new Object[0]);
                ((ObservableEmitter) this.f14623d).onNext((String) this.f14622c);
                if (th != null) {
                    th.printStackTrace();
                }
                break;
            default:
                ToastUtils.showShort(th != null ? th.getMessage() : null, new Object[0]);
                ((ObservableEmitter) this.f14623d).onNext((String) this.f14622c);
                if (th != null) {
                    th.printStackTrace();
                }
                break;
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        ((i) this.f14622c).f14956e = null;
        ArrayList arrayList = (ArrayList) this.f14621b;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((CameraInfoInternal) ((CameraInfo) this.f14623d)).removeSessionCaptureCallback((AbstractC0999q) it.next());
        }
        arrayList.clear();
    }

    @Override // top.zibin.luban.OnCompressListener
    public void onStart() {
        int i7 = this.f14620a;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        ((i) this.f14622c).f14956e = null;
    }

    public void q(EnumC1203m enumC1203m) {
        H h7 = (H) this.f14622c;
        if (h7 != null) {
            h7.run();
        }
        H h10 = new H((C1212w) this.f14621b, enumC1203m);
        this.f14622c = h10;
        ((Handler) this.f14623d).postAtFrontOfQueue(h10);
    }

    public synchronized void s(p137j3.i iVar) {
        try {
            p137j3.i iVar2 = iVar.f38235a;
            p137j3.i iVar3 = iVar.f38238d;
            if (iVar2 != null) {
                iVar2.f38238d = iVar3;
            }
            if (iVar3 != null) {
                iVar3.f38235a = iVar2;
            }
            iVar.f38235a = null;
            iVar.f38238d = null;
            if (iVar == ((p137j3.i) this.f14623d)) {
                this.f14623d = iVar3;
            }
            if (iVar == ((p137j3.i) this.f14622c)) {
                this.f14622c = iVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void t() {
        ReentrantLock reentrantLock = (ReentrantLock) this.f14621b;
        reentrantLock.lock();
        try {
            this.f14622c = p123i4.a.f37421a;
            ((Condition) this.f14623d).signalAll();
            Unit unit = Unit.f38893a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        switch (this.f14620a) {
            case 19:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f14621b);
                sb2.append('{');
                c cVar = (c) ((c) this.f14623d).f14622c;
                String str = "";
                while (cVar != null) {
                    Object obj = cVar.f14623d;
                    sb2.append(str);
                    String str2 = (String) cVar.f14621b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    cVar = (c) cVar.f14622c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public JSONObject u() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msgType", (String) this.f14621b);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, (String) this.f14623d);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (JSONObject) this.f14622c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void v(g gVar, ByteArrayOutputStream byteArrayOutputStream, top.zibin.luban.io.a aVar) throws Kf.d {
        ArrayList arrayList;
        int i7;
        int i10 = 2;
        F1.b bVar = gVar.f44392b;
        if (bVar == null || (arrayList = bVar.f2516a) == null || arrayList.size() <= 0) {
            return;
        }
        for (p372yg.d dVar : gVar.f44392b.f2516a) {
            byte[] bArr = (byte[]) this.f14622c;
            byte[] bArr2 = (byte[]) this.f14623d;
            if (dVar == null) {
                throw new Kf.d("input parameters is null, cannot write local file header");
            }
            try {
                byte[] bArr3 = new byte[i10];
                // fill-array-data instruction
                bArr3[0] = 0;
                bArr3[1] = 0;
                boolean z3 = dVar.f44368g >= 4294967295L || dVar.f44369h >= 4294967295L || dVar.f44380p >= 4294967295L;
                aVar.z(byteArrayOutputStream, (int) d0.c(dVar.f17706a));
                aVar.C(byteArrayOutputStream, dVar.f44378n);
                aVar.C(byteArrayOutputStream, dVar.f44363b);
                byteArrayOutputStream.write(dVar.f44364c);
                aVar.C(byteArrayOutputStream, d0.a(dVar.f44365d));
                top.zibin.luban.io.a.B(bArr2, dVar.f44366e);
                byteArrayOutputStream.write(bArr2, 0, 4);
                top.zibin.luban.io.a.B(bArr2, dVar.f44367f);
                byteArrayOutputStream.write(bArr2, 0, 4);
                if (z3) {
                    top.zibin.luban.io.a.B(bArr2, 4294967295L);
                    byteArrayOutputStream.write(bArr2, 0, 4);
                    byteArrayOutputStream.write(bArr2, 0, 4);
                    gVar.f44396f = true;
                } else {
                    top.zibin.luban.io.a.B(bArr2, dVar.f44368g);
                    byteArrayOutputStream.write(bArr2, 0, 4);
                    top.zibin.luban.io.a.B(bArr2, dVar.f44369h);
                    byteArrayOutputStream.write(bArr2, 0, 4);
                }
                byte[] bArrM = new byte[0];
                if (Ag.a.c(dVar.f44370i)) {
                    bArrM = n.m(dVar.f44370i, null);
                }
                aVar.C(byteArrayOutputStream, bArrM.length);
                byte[] bArr4 = new byte[4];
                if (z3) {
                    top.zibin.luban.io.a.B(bArr2, 4294967295L);
                    System.arraycopy(bArr2, 0, bArr4, 0, 4);
                } else {
                    top.zibin.luban.io.a.B(bArr2, dVar.f44380p);
                    System.arraycopy(bArr2, 0, bArr4, 0, 4);
                }
                int i11 = z3 ? 32 : 0;
                if (dVar.f44374m != null) {
                    i11 += 11;
                }
                aVar.C(byteArrayOutputStream, i11);
                byte[] bArr5 = new byte[0];
                aVar.C(byteArrayOutputStream, bArr5.length);
                if (z3) {
                    top.zibin.luban.io.a.y(65535, bArr);
                    i7 = 2;
                    byteArrayOutputStream.write(bArr, 0, 2);
                } else {
                    i7 = 2;
                    aVar.C(byteArrayOutputStream, 0);
                }
                byteArrayOutputStream.write(bArr3);
                byteArrayOutputStream.write(dVar.f44379o);
                byteArrayOutputStream.write(bArr4);
                if (bArrM.length > 0) {
                    byteArrayOutputStream.write(bArrM);
                }
                if (z3) {
                    gVar.f44396f = true;
                    aVar.C(byteArrayOutputStream, (int) 1);
                    aVar.C(byteArrayOutputStream, 28);
                    aVar.A(byteArrayOutputStream, dVar.f44369h);
                    aVar.A(byteArrayOutputStream, dVar.f44368g);
                    aVar.A(byteArrayOutputStream, dVar.f44380p);
                    aVar.z(byteArrayOutputStream, 0);
                }
                p372yg.a aVar2 = dVar.f44374m;
                if (aVar2 != null) {
                    aVar.C(byteArrayOutputStream, (int) d0.c(aVar2.f17706a));
                    aVar.C(byteArrayOutputStream, 7);
                    aVar.C(byteArrayOutputStream, d0.d(aVar2.f44360b));
                    byteArrayOutputStream.write(n.m("AE", null));
                    byteArrayOutputStream.write(new byte[]{(byte) d0.b(aVar2.f44361c)});
                    aVar.C(byteArrayOutputStream, d0.a(aVar2.f44362d));
                }
                if (bArr5.length > 0) {
                    byteArrayOutputStream.write(bArr5);
                }
                i10 = i7;
            } catch (Exception e10) {
                throw new Kf.d(e10);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(i0 store, ViewModelProvider$Factory factory) {
        this(store, factory, 0);
        this.f14620a = 6;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    public /* synthetic */ c(Object obj, int i7, Object obj2, Object obj3) {
        this.f14620a = i7;
        this.f14622c = obj3;
        this.f14621b = obj;
        this.f14623d = obj2;
    }

    @Override // top.zibin.luban.OnCompressListener
    public void onSuccess(int i7, File file) {
        switch (this.f14620a) {
            case 11:
                if (file != null && file.exists()) {
                    ((InsuranceTakePhotoActivity) this.f14621b).f32122w = file;
                }
                ((ObservableEmitter) this.f14623d).onNext((String) this.f14622c);
                break;
            default:
                if (file != null && file.exists()) {
                    ((CLTakePhotoActivity) this.f14621b).f29136B0 = file;
                }
                ((ObservableEmitter) this.f14623d).onNext((String) this.f14622c);
                break;
        }
    }

    public c(int i7) {
        this.f14620a = i7;
        switch (i7) {
            case 16:
                this.f14621b = new SparseArray();
                break;
            case 17:
                this.f14621b = e.f8946j;
                this.f14623d = new ArrayList();
                break;
            case 20:
                this.f14621b = p268ra.c.f41664a;
                break;
            case 24:
                this.f14621b = new top.zibin.luban.io.a(1);
                this.f14623d = new byte[8];
                this.f14622c = new byte[4];
                break;
            default:
                ReentrantLock reentrantLock = new ReentrantLock();
                this.f14621b = reentrantLock;
                this.f14623d = reentrantLock.newCondition();
                this.f14622c = p123i4.a.f37421a;
                break;
        }
    }

    public c(List list) {
        this.f14620a = 9;
        this.f14622c = list;
        this.f14621b = new ArrayList(list.size());
        this.f14623d = new ArrayList(list.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((ArrayList) this.f14621b).add(new com.airbnb.lottie.animation.keyframe.m((List) ((com.airbnb.lottie.model.content.e) list.get(i7)).f19946b.f1592b));
            ((ArrayList) this.f14623d).add(((com.airbnb.lottie.model.content.e) list.get(i7)).f19947c.createAnimation());
        }
    }

    private final void o() {
    }

    private final void p() {
    }

    public c(AbstractServiceC1213x provider) {
        this.f14620a = 5;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f14621b = new C1212w(provider);
        this.f14623d = new Handler();
    }

    public c(WorkDatabase_Impl database) {
        this.f14620a = 8;
        this.f14621b = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f14623d = new Td.a(database, 7);
        this.f14622c = new Td.c(database, 21);
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f14620a = 25;
        JSONObject jSONObject = new JSONObject();
        this.f14622c = jSONObject;
        this.f14621b = "client_info";
        this.f14623d = "3.3.6";
        try {
            jSONObject.put(OfflineConstant.PARAM_OS, "Android");
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str);
            jSONObject.put("appChannel", str2);
            jSONObject.put("osVersion", str3);
            jSONObject.put("deviceType", str4);
            jSONObject.put("deviceBrand", str5);
            jSONObject.put("deviceModel", str6);
        } catch (JSONException unused) {
        }
    }

    public c(i0 store, ViewModelProvider$Factory factory, z0.b defaultCreationExtras) {
        this.f14620a = 6;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f14621b = store;
        this.f14623d = factory;
        this.f14622c = defaultCreationExtras;
    }

    public c(EncoderProfilesProvider encoderProfilesProvider, C0216v c0216v) {
        this.f14620a = 0;
        this.f14622c = new HashMap();
        this.f14621b = encoderProfilesProvider;
        this.f14623d = c0216v;
    }

    public c(EncoderProfilesProvider encoderProfilesProvider, y0 y0Var) {
        this.f14620a = 1;
        this.f14622c = new HashMap();
        this.f14621b = encoderProfilesProvider;
        this.f14623d = y0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(i0 i0Var, ViewModelProvider$Factory viewModelProvider$Factory, int i7) {
        this(i0Var, viewModelProvider$Factory, z0.a.f44407b);
        this.f14620a = 6;
    }

    public c(Context context, int i7) {
        this.f14620a = i7;
        switch (i7) {
            case 15:
                this.f14623d = new org.sufficientlysecure.htmltextview.m(9);
                this.f14622c = context;
                break;
            default:
                this.f14621b = new Object();
                this.f14622c = new HashMap();
                this.f14623d = new v(this, context);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(ViewModelStoreOwner owner) {
        z0.b defaultViewModelCreationExtras;
        this.f14620a = 6;
        Intrinsics.checkNotNullParameter(owner, "owner");
        i0 viewModelStore = owner.getViewModelStore();
        ViewModelProvider$Factory viewModelProvider$FactoryDefaultFactory$lifecycle_viewmodel_release = e0.f17446f.defaultFactory$lifecycle_viewmodel_release(owner);
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (owner instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = z0.a.f44407b;
        }
        this(viewModelStore, viewModelProvider$FactoryDefaultFactory$lifecycle_viewmodel_release, defaultViewModelCreationExtras);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(ViewModelStoreOwner owner, ViewModelProvider$Factory factory) {
        z0.b defaultViewModelCreationExtras;
        this.f14620a = 6;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        i0 viewModelStore = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (owner instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = z0.a.f44407b;
        }
        this(viewModelStore, factory, defaultViewModelCreationExtras);
    }

    public c(CameraInfo cameraInfo, i iVar, ArrayList arrayList) {
        this.f14620a = 2;
        this.f14622c = iVar;
        this.f14621b = arrayList;
        this.f14623d = cameraInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Object obj, Function3 function3) {
        this.f14620a = 12;
        this.f14621b = obj;
        this.f14623d = (m) function3;
        this.f14622c = h.f35961a;
    }

    public c(String str) {
        this.f14620a = 19;
        c cVar = new c(18, false);
        this.f14623d = cVar;
        this.f14622c = cVar;
        this.f14621b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Object obj, Function3 function3, Function3 function4, AbstractC0790b abstractC0790b) {
        this.f14620a = 13;
        this.f14621b = obj;
        this.f14623d = (m) function3;
        this.f14622c = (m) function4;
    }

    public c(com.bumptech.glide.load.engine.m mVar, G1.e eVar, q qVar) {
        this.f14620a = 10;
        this.f14622c = mVar;
        this.f14623d = eVar;
        this.f14621b = qVar;
    }

    public c(Object[] objArr, Object[] objArr2) {
        this.f14620a = 22;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap map = new HashMap();
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = objArr[i7];
            Integer numValueOf = (Integer) map.get(obj);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(map.size());
                map.put(obj, numValueOf);
            }
            iArr[i7] = numValueOf.intValue();
        }
        this.f14621b = iArr;
        this.f14623d = f(objArr, iArr);
        this.f14622c = f(objArr2, iArr);
    }
}
