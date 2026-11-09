package He;

import C0.G;
import E.C0216v;
import android.animation.AnimatorSet;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteFullException;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.C;
import androidx.core.view.N;
import androidx.core.view.U;
import com.bumptech.glide.request.Request;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import com.transsnet.palmpay.p2pcash.ui.atm.view.TimeCountView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements FutureCallback, ThreadHandoffProducerQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3866d;

    public static boolean a(C0216v c0216v, C0216v c0216v2) {
        p118hf.a.k(c0216v2.b(), "Fully specified range is not actually fully specified.");
        int i7 = c0216v.f2128a;
        int i10 = c0216v2.f2128a;
        if (i7 == 2 && i10 == 1) {
            return false;
        }
        if (i7 != 2 && i7 != 0 && i7 != i10) {
            return false;
        }
        int i11 = c0216v.f2129b;
        return i11 == 0 || i11 == c0216v2.f2129b;
    }

    public static boolean b(C0216v c0216v, C0216v c0216v2, HashSet hashSet) {
        if (hashSet.contains(c0216v2)) {
            return a(c0216v, c0216v2);
        }
        c0216v.toString();
        c0216v2.toString();
        p140j8.f.G("DynamicRangeResolver");
        return false;
    }

    public static C0216v d(C0216v c0216v, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (c0216v.f2128a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            C0216v c0216v2 = (C0216v) it.next();
            p118hf.a.j(c0216v2, "Fully specified DynamicRange cannot be null.");
            p118hf.a.k(c0216v2.b(), "Fully specified DynamicRange must have fully defined encoding.");
            if (c0216v2.f2128a != 1 && b(c0216v, c0216v2, hashSet)) {
                return c0216v2;
            }
        }
        return null;
    }

    public static p231p5.a e(p231p5.b bVar) {
        ModelLoader modelLoaderA = com.growingio.android.sdk.d.a().f23197a.a(p231p5.b.class);
        if (modelLoaderA != null) {
            return (p231p5.a) modelLoaderA.buildLoadData(bVar).f41455a.executeData();
        }
        p198n5.h.c("EventDataManager", "please register eventformat component first", new Object[0]);
        return null;
    }

    public static void k(HashSet hashSet, C0216v c0216v, androidx.camera.camera2.internal.compat.params.b bVar) {
        p118hf.a.k(!hashSet.isEmpty(), "Cannot update already-empty constraints.");
        Set setB = bVar.b(c0216v);
        if (setB.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setB);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + c0216v + "\nConstraints:\n  " + TextUtils.join("\n  ", setB) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public synchronized void addToQueueOrExecute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (this.f3864b) {
            ((ArrayDeque) this.f3866d).add(runnable);
        } else {
            ((Executor) this.f3865c).execute(runnable);
        }
    }

    public boolean c(Request request) {
        boolean z3 = true;
        if (request == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f3865c).remove(request);
        if (!((HashSet) this.f3866d).remove(request) && !zRemove) {
            z3 = false;
        }
        if (z3) {
            request.clear();
        }
        return z3;
    }

    public int f(ArrayList arrayList) {
        byte[] bArr;
        byte[] bArr2;
        if (this.f3864b) {
            return -1;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            Context context = (Context) this.f3865c;
            if (size == 1) {
                p216o5.d dVar = (p216o5.d) arrayList.get(0);
                Uri uriInsert = null;
                if (!this.f3864b) {
                    try {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriL = androidx.camera.core.impl.utils.executor.g.l();
                        p231p5.b bVar = new p231p5.b();
                        bVar.f41186b = dVar;
                        bVar.f41185a = 0;
                        p231p5.a aVarE = e(bVar);
                        if (aVarE != null && (bArr2 = aVarE.f41184a) != null) {
                            uriInsert = contentResolver.insert(uriL, androidx.camera.core.impl.utils.executor.g.K(bArr2, p111h5.d.b(((p111h5.d) dVar).f37339g), Integer.valueOf(dVar.a())));
                        }
                    } catch (SQLiteFullException e10) {
                        g(e10);
                    } catch (Exception e11) {
                        p198n5.h.d("EventDataManager", e11, "insertEvent failed", new Object[0]);
                    }
                }
                return uriInsert != null ? 1 : 0;
            }
            try {
                ContentResolver contentResolver2 = context.getContentResolver();
                Uri uriL2 = androidx.camera.core.impl.utils.executor.g.l();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    p216o5.d dVar2 = (p216o5.d) it.next();
                    p231p5.b bVar2 = new p231p5.b();
                    bVar2.f41186b = dVar2;
                    bVar2.f41185a = 0;
                    p231p5.a aVarE2 = e(bVar2);
                    if (aVarE2 != null && (bArr = aVarE2.f41184a) != null) {
                        arrayList2.add(androidx.camera.core.impl.utils.executor.g.K(bArr, p111h5.d.b(((p111h5.d) dVar2).f37339g), Integer.valueOf(dVar2.a())));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    return contentResolver2.bulkInsert(uriL2, (ContentValues[]) arrayList2.toArray(new ContentValues[0]));
                }
            } catch (SQLiteFullException e12) {
                g(e12);
            } catch (Exception e13) {
                p198n5.h.d("EventDataManager", e13, "insertEvents failed", new Object[0]);
            }
        }
        return 0;
    }

    public void g(SQLiteFullException sQLiteFullException) {
        p198n5.h.d("EventDataManager", sQLiteFullException, "Disk full, all operations will be ignored", new Object[0]);
        this.f3864b = true;
    }

    public Cursor h(ContentProviderClient contentProviderClient, int i7, int i10) {
        Uri uriL = androidx.camera.core.impl.utils.executor.g.l();
        String strC = F.c(i7, "SELECT _event_type FROM events WHERE _policy=", " LIMIT 1");
        StringBuilder sb2 = new StringBuilder("SELECT _id, _data, _event_type FROM events WHERE _event_type=(");
        sb2.append(strC);
        sb2.append(") AND _policy=");
        sb2.append(i7);
        sb2.append(" LIMIT ");
        String strN = G.n(i10, ";", sb2);
        return contentProviderClient == null ? ((Context) this.f3865c).getContentResolver().query(uriL, null, strN, null, "rawQuery") : contentProviderClient.query(uriL, null, strN, null, "rawQuery");
    }

    public void i(ContentProviderClient contentProviderClient, long j6) throws RemoteException {
        Uri uriL = androidx.camera.core.impl.utils.executor.g.l();
        if (contentProviderClient == null) {
            ((Context) this.f3865c).getContentResolver().delete(uriL, "_id=?", new String[]{String.valueOf(j6)});
        } else {
            contentProviderClient.delete(uriL, "_id=?", new String[]{String.valueOf(j6)});
        }
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public synchronized boolean isQueueing() {
        return this.f3864b;
    }

    public void j(View view) {
        F6.d.h("HomeScrollView", 3, "stop");
        if (((AnimatorSet) this.f3865c) != null) {
            F6.d.h("HomeScrollView", 3, "stop cancel animation");
            ((AnimatorSet) this.f3865c).cancel();
        }
        if (((U) this.f3866d) != null) {
            F6.d.h("HomeScrollView", 3, "stop animation ongoing");
            return;
        }
        U uA = N.a(view);
        WeakReference weakReference = uA.f16184a;
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.animate().translationX(0.0f);
        }
        uA.c(500L);
        View view3 = (View) weakReference.get();
        if (view3 != null) {
            view3.animate().setStartDelay(1500L);
        }
        View view4 = (View) weakReference.get();
        if (view4 != null) {
            view4.animate().scaleX(1.0f);
        }
        View view5 = (View) weakReference.get();
        if (view5 != null) {
            view5.animate().scaleY(1.0f);
        }
        uA.a(1.0f);
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        View view6 = (View) weakReference.get();
        if (view6 != null) {
            view6.animate().setInterpolator(decelerateInterpolator);
        }
        uA.d(new Oe.a(this, 5));
        this.f3866d = uA;
        F6.d.h("HomeScrollView", 3, "stop animation");
        View view7 = (View) ((U) this.f3866d).f16184a.get();
        if (view7 != null) {
            view7.animate().start();
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        p140j8.f.h("VideoCapture", "Surface update completed with unexpected exception", th);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        androidx.camera.video.F f10;
        C c6 = (C) this.f3866d;
        if (((androidx.concurrent.futures.m) this.f3865c) != c6.f14548s || (f10 = c6.f14549u) == androidx.camera.video.F.f14572c) {
            return;
        }
        androidx.camera.video.F f11 = this.f3864b ? androidx.camera.video.F.f14570a : androidx.camera.video.F.f14571b;
        if (f11 != f10) {
            c6.f14549u = f11;
            c6.J().onSourceStateChanged(f11);
        }
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public synchronized void remove(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ((ArrayDeque) this.f3866d).remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public synchronized void startQueueing() {
        this.f3864b = true;
    }

    @Override // com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue
    public synchronized void stopQueuing() {
        this.f3864b = false;
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) this.f3866d;
            if (arrayDeque.isEmpty()) {
                arrayDeque.clear();
            } else {
                ((Executor) this.f3865c).execute((Runnable) arrayDeque.pop());
            }
        }
    }

    public String toString() {
        switch (this.f3863a) {
            case 6:
                return super.toString() + "{numRequests=" + ((Set) this.f3865c).size() + ", isPaused=" + this.f3864b + "}";
            default:
                return super.toString();
        }
    }

    public a(Executor executor) {
        this.f3863a = 7;
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f3865c = executor;
        this.f3866d = new ArrayDeque();
    }

    public a(int i7) throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException {
        this.f3863a = i7;
        switch (i7) {
            case 9:
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                Method method = cls.getMethod("getInstance", new Class[0]);
                method.setAccessible(true);
                this.f3865c = method.invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mViews");
                this.f3866d = declaredField;
                declaredField.setAccessible(true);
                this.f3864b = declaredField.getType() == ArrayList.class;
                break;
            default:
                this.f3865c = Collections.newSetFromMap(new WeakHashMap());
                this.f3866d = new HashSet();
                break;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0104 */
    /* JADX WARN: Code duplicated, block: B:113:0x018a A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0178  */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0157, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.sqlite.SQLiteDatabase$CursorFactory, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: He.a.<init>(android.content.Context):void");
    }

    public a(androidx.camera.camera2.internal.compat.l lVar) {
        this.f3863a = 4;
        this.f3865c = lVar;
        this.f3866d = androidx.camera.camera2.internal.compat.params.b.a(lVar);
        int[] iArr = (int[]) lVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z3 = false;
        if (iArr != null) {
            for (int i7 : iArr) {
                if (i7 == 18) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f3864b = z3;
    }

    public a(boolean z3, ArrayList arrayList, ArrayList arrayList2) {
        this.f3863a = 8;
        this.f3864b = z3;
        this.f3865c = arrayList;
        this.f3866d = arrayList2;
    }

    public a(TimeCountView timeCountView) {
        this.f3863a = 3;
        this.f3866d = timeCountView;
        this.f3864b = false;
        this.f3865c = new Handler(Looper.getMainLooper());
    }

    public a(C c6, androidx.concurrent.futures.m mVar, boolean z3) {
        this.f3863a = 5;
        this.f3866d = c6;
        this.f3865c = mVar;
        this.f3864b = z3;
    }
}
