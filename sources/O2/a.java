package O2;

import Ac.e;
import Ff.c;
import Gb.T;
import Pa.n0;
import Uc.t0;
import V0.C0695n;
import Wf.C0769m;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.ActionMode$Callback;
import androidx.appcompat.view.menu.q;
import androidx.appcompat.view.menu.u;
import androidx.camera.camera2.internal.compat.n;
import androidx.camera.core.impl.utils.executor.g;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.emoji2.text.t;
import androidx.emoji2.text.w;
import androidx.room.L;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkProgressDao;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.C1323a;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.m;
import com.bumptech.glide.load.engine.s;
import com.facebook.fresco.animation.bitmap.BitmapFrameRenderer;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.nativecode.b;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.main.export.bean.rsp.QuerySavingTaskModuleResp;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.sync.Mutex;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.e0;
import p1.d;
import p135j0.C1769b;
import p135j0.C1777j;
import p135j0.C1780m;
import p135j0.O;
import p135j0.o0;
import p140j8.f;
import p173ld.o;
import p220oa.h;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements BitmapFrameRenderer, Callback, SystemIdInfoDao, WorkProgressDao, SelectClause2, ActionMode$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6556d;

    public a(View view, int i7) {
        switch (i7) {
            case 10:
                this.f6556d = "com.transsnet.palmpay.action.notification.common";
                this.f6553a = view != null ? (ImageView) view.findViewById(e.ivIcon) : null;
                this.f6554b = view != null ? (TextView) view.findViewById(e.tvCount) : null;
                this.f6555c = view != null ? (TextView) view.findViewById(e.tvType) : null;
                if (view != null) {
                    view.setOnClickListener(new o(this, 7));
                }
                break;
            default:
                this.f6553a = view;
                this.f6554b = view != null ? (LottieAnimationView) view.findViewById(e.ivLion) : null;
                this.f6555c = view != null ? (ConstraintLayout) view.findViewById(e.cslTask) : null;
                this.f6556d = view != null ? (TextView) view.findViewById(e.tvTask) : null;
                break;
        }
    }

    public synchronized void a(Key key, s sVar) {
        C1323a c1323a = (C1323a) ((HashMap) this.f6554b).put(key, new C1323a(key, sVar, (ReferenceQueue) this.f6555c));
        if (c1323a != null) {
            c1323a.f20572c = null;
            c1323a.clear();
        }
    }

    public void b(C1323a c1323a) {
        Resource resource;
        synchronized (this) {
            ((HashMap) this.f6554b).remove(c1323a.f20570a);
            if (c1323a.f20571b && (resource = c1323a.f20572c) != null) {
                ((m) this.f6556d).onResourceReleased(c1323a.f20570a, new s(resource, true, false, c1323a.f20570a, (m) this.f6556d));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(c cVar) {
        C1777j c1777j;
        a aVar;
        C1769b c1769b;
        if (cVar instanceof C1777j) {
            c1777j = (C1777j) cVar;
            int i7 = c1777j.f38062d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c1777j.f38062d = i7 - Integer.MIN_VALUE;
            } else {
                c1777j = new C1777j(this, cVar);
            }
        } else {
            c1777j = new C1777j(this, cVar);
        }
        Object objE = c1777j.f38060b;
        Ef.a aVar2 = Ef.a.f2423a;
        int i10 = c1777j.f38062d;
        if (i10 == 0) {
            g.M(objE);
            List list = (List) this.f6555c;
            O o10 = (O) this.f6556d;
            if (list == null || list.isEmpty()) {
                c1777j.f38059a = this;
                c1777j.f38062d = 1;
                objE = O.e(o10, false, c1777j);
                if (objE != aVar2) {
                    aVar = this;
                    c1769b = (C1769b) objE;
                }
            } else {
                InterProcessCoordinator interProcessCoordinatorF = o10.f();
                C1780m c1780m = new C1780m(o10, this, null);
                c1777j.f38059a = this;
                c1777j.f38062d = 2;
                objE = interProcessCoordinatorF.lock(c1780m, c1777j);
                if (objE != aVar2) {
                    aVar = this;
                    c1769b = (C1769b) objE;
                }
            }
            return aVar2;
        }
        if (i10 == 1) {
            aVar = c1777j.f38059a;
            g.M(objE);
            c1769b = (C1769b) objE;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c1777j.f38059a;
            g.M(objE);
            c1769b = (C1769b) objE;
        }
        ((O) aVar.f6556d).f37968h.e(c1769b);
        return Unit.f38893a;
    }

    public void d(QuerySavingTaskModuleResp querySavingTaskModuleResp) {
        String string;
        View view = (View) this.f6553a;
        if (view != null) {
            h.s(view, querySavingTaskModuleResp != null);
        }
        if (querySavingTaskModuleResp != null) {
            n0 n0VarG = n0.g();
            ViewEvent viewEvent = new ViewEvent("FinanceTab_AI_View");
            Integer num = querySavingTaskModuleResp.id;
            if (num == null || (string = num.toString()) == null) {
                string = "";
            }
            n0VarG.u(viewEvent.add("element_name", string));
            TextView textView = (TextView) this.f6556d;
            if (textView != null) {
                textView.setText(querySavingTaskModuleResp.content);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f6555c;
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new T(7, querySavingTaskModuleResp, this));
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f6554b;
            if (lottieAnimationView != null) {
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.setRepeatMode(1);
                lottieAnimationView.setAnimation(Ac.g.main_saving_task_lion);
                lottieAnimationView.e();
            }
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void delete(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f6553a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = (Td.c) this.f6555c;
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

    @Override // androidx.work.impl.model.WorkProgressDao
    public void deleteAll() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f6553a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = (Td.c) this.f6556d;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
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

    public p343x.c e(p343x.a aVar) {
        ArrayList arrayList = (ArrayList) this.f6555c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            p343x.c cVar = (p343x.c) arrayList.get(i7);
            if (cVar != null && cVar.f43507b == aVar) {
                return cVar;
            }
        }
        p343x.c cVar2 = new p343x.c((Context) this.f6554b, aVar);
        arrayList.add(cVar2);
        return cVar2;
    }

    public Size[] f(int i7) {
        HashMap map = (HashMap) this.f6555c;
        if (map.containsKey(Integer.valueOf(i7))) {
            if (((Size[]) map.get(Integer.valueOf(i7))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i7))).clone();
        }
        Size[] outputSizes = ((StreamConfigurationMap) ((n) this.f6553a).f13411a).getOutputSizes(i7);
        if (outputSizes == null || outputSizes.length == 0) {
            f.G("StreamConfigurationMapCompat");
            return outputSizes;
        }
        Size[] sizeArrA = ((d) this.f6554b).a(outputSizes, i7);
        map.put(Integer.valueOf(i7), sizeArrA);
        return (Size[]) sizeArrA.clone();
    }

    public void g(int i7, int i10, int i11) {
        ImageView imageView = (ImageView) this.f6553a;
        if (imageView != null) {
            imageView.setImageResource(i7);
        }
        TextView textView = (TextView) this.f6555c;
        if (textView != null) {
            textView.setText(i10);
        }
        if (i11 == 1) {
            this.f6556d = "com.transsnet.palmpay.action.notification.payment";
        } else {
            if (i11 != 2) {
                return;
            }
            this.f6556d = "com.transsnet.palmpay.action.notification.common";
        }
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Object getClauseObject() {
        return this.f6553a;
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameRenderer
    public int getIntrinsicHeight() {
        return ((AnimatedDrawableBackend) this.f6554b).getHeight();
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameRenderer
    public int getIntrinsicWidth() {
        return ((AnimatedDrawableBackend) this.f6554b).getWidth();
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Function3 getOnCancellationConstructor() {
        return (t0) this.f6556d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.m] */
    @Override // kotlinx.coroutines.selects.SelectClause
    public Function3 getProcessResFunc() {
        return (kotlin.jvm.internal.m) this.f6555c;
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public C0695n getProgressForWorkSpecId(String str) {
        L lAcquire = L.f17714j.acquire("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f6553a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = b.K(workDatabase_Impl, lAcquire, false);
        try {
            C0695n c0695nFromByteArray = null;
            if (cursorK.moveToFirst()) {
                byte[] blob = cursorK.isNull(0) ? null : cursorK.getBlob(0);
                if (blob != null) {
                    c0695nFromByteArray = C0695n.f9956b.fromByteArray(blob);
                }
            }
            return c0695nFromByteArray;
        } finally {
            cursorK.close();
            lAcquire.release();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function3, kotlin.jvm.internal.m] */
    @Override // kotlinx.coroutines.selects.SelectClause
    public Function3 getRegFunc() {
        return (kotlin.jvm.internal.m) this.f6554b;
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public androidx.work.impl.model.d getSystemIdInfo(String str, int i7) {
        L lAcquire = L.f17714j.acquire("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        lAcquire.bindString(1, str);
        lAcquire.bindLong(2, i7);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f6553a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = b.K(workDatabase_Impl, lAcquire, false);
        try {
            return cursorK.moveToFirst() ? new androidx.work.impl.model.d(cursorK.getString(g.k(cursorK, "work_spec_id")), cursorK.getInt(g.k(cursorK, "generation")), cursorK.getInt(g.k(cursorK, "system_id"))) : null;
        } finally {
            cursorK.close();
            lAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public List getWorkSpecIds() {
        L lAcquire = L.f17714j.acquire("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f6553a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = b.K(workDatabase_Impl, lAcquire, false);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(c cVar) throws Throwable {
        o0 o0Var;
        Mutex mutex;
        a aVar;
        Mutex mutex2;
        Throwable th;
        a aVar2;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i7 = o0Var.f38114e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                o0Var.f38114e = i7 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(this, cVar);
            }
        } else {
            o0Var = new o0(this, cVar);
        }
        Object obj = o0Var.f38112c;
        Ef.a aVar3 = Ef.a.f2423a;
        int i10 = o0Var.f38114e;
        try {
            if (i10 == 0) {
                g.M(obj);
                if (((C0769m) this.f6554b).isCompleted()) {
                    return Unit.f38893a;
                }
                o0Var.f38110a = this;
                mutex = (p072eg.e) this.f6553a;
                o0Var.f38111b = mutex;
                o0Var.f38114e = 1;
                if (mutex.lock(null, o0Var) != aVar3) {
                    aVar = this;
                }
                return aVar3;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = o0Var.f38111b;
                aVar2 = o0Var.f38110a;
                try {
                    g.M(obj);
                    C0769m c0769m = (C0769m) aVar2.f6554b;
                    Unit unit = Unit.f38893a;
                    c0769m.v(unit);
                    mutex2.unlock(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = o0Var.f38111b;
            aVar = o0Var.f38110a;
            g.M(obj);
            mutex = mutex3;
            if (((C0769m) aVar.f6554b).isCompleted()) {
                Unit unit2 = Unit.f38893a;
                mutex.unlock(null);
                return unit2;
            }
            o0Var.f38110a = aVar;
            o0Var.f38111b = mutex;
            o0Var.f38114e = 2;
            if (aVar.c(o0Var) != aVar3) {
                mutex2 = mutex;
                aVar2 = aVar;
                C0769m c0769m2 = (C0769m) aVar2.f6554b;
                Unit unit3 = Unit.f38893a;
                c0769m2.v(unit3);
                mutex2.unlock(null);
                return unit3;
            }
            return aVar3;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }

    public void i(int i7) {
        TextView textView = (TextView) this.f6554b;
        if (i7 <= 0) {
            if (textView != null) {
                h.c(textView);
            }
        } else {
            if (i7 > 99) {
                if (textView != null) {
                    textView.setText("99+");
                }
                if (textView != null) {
                    h.C(textView);
                    return;
                }
                return;
            }
            if (textView != null) {
                textView.setText(String.valueOf(i7));
            }
            if (textView != null) {
                h.C(textView);
            }
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void insert(androidx.work.impl.model.g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f6553a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            ((Td.a) this.f6554b).e(gVar);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void insertSystemIdInfo(androidx.work.impl.model.d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f6553a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            ((Td.a) this.f6554b).e(dVar);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // androidx.appcompat.view.ActionMode$Callback
    public boolean onActionItemClicked(p343x.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f6553a).onActionItemClicked(e(aVar), new q((Context) this.f6554b, (SupportMenuItem) menuItem));
    }

    @Override // androidx.appcompat.view.ActionMode$Callback
    public boolean onCreateActionMode(p343x.a aVar, Menu menu) {
        p343x.c cVarE = e(aVar);
        M.n nVar = (M.n) this.f6556d;
        Menu uVar = (Menu) nVar.get(menu);
        if (uVar == null) {
            uVar = new u((Context) this.f6554b, (SupportMenu) menu);
            nVar.put(menu, uVar);
        }
        return ((ActionMode.Callback) this.f6553a).onCreateActionMode(cVarE, uVar);
    }

    @Override // androidx.appcompat.view.ActionMode$Callback
    public void onDestroyActionMode(p343x.a aVar) {
        ((ActionMode.Callback) this.f6553a).onDestroyActionMode(e(aVar));
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e10) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e10, "e");
        ArrayList arrayList = (ArrayList) this.f6553a;
        synchronized (arrayList) {
            arrayList.add(e10);
        }
        ((CountDownLatch) this.f6554b).countDown();
    }

    @Override // androidx.appcompat.view.ActionMode$Callback
    public boolean onPrepareActionMode(p343x.a aVar, Menu menu) {
        p343x.c cVarE = e(aVar);
        M.n nVar = (M.n) this.f6556d;
        Menu uVar = (Menu) nVar.get(menu);
        if (uVar == null) {
            uVar = new u((Context) this.f6554b, (SupportMenu) menu);
            nVar.put(menu, uVar);
        }
        return ((ActionMode.Callback) this.f6553a).onPrepareActionMode(cVarE, uVar);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, e0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        Cg.d.b(response, (String) this.f6555c, (ArrayList) this.f6556d, (ArrayList) this.f6553a);
        ((CountDownLatch) this.f6554b).countDown();
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(String str, int i7) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f6553a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = (Td.c) this.f6555c;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindString(1, str);
        supportSQLiteStatementA.bindLong(2, i7);
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

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameRenderer
    public boolean renderFrame(int i7, Bitmap bitmap) {
        try {
            C2085k0 c2085k0 = (C2085k0) this.f6555c;
            c2085k0.getClass();
            new Canvas(bitmap).drawColor(0, PorterDuff.Mode.SRC);
            AnimatedDrawableBackend animatedDrawableBackend = (AnimatedDrawableBackend) c2085k0.f42878b;
            if (i7 == 0) {
                animatedDrawableBackend.getFrameInfo(i7);
                throw null;
            }
            animatedDrawableBackend.getFrameInfo(i7);
            animatedDrawableBackend.getFrameInfo(i7 - 1);
            throw null;
        } catch (IllegalStateException e10) {
            p229p2.b bVar = p229p2.a.f41180a;
            if (bVar.isLoggable(6)) {
                bVar.e(a.class.getSimpleName(), "Rendering of frame unsuccessful. Frame number: " + i7, e10);
            }
            return false;
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.BitmapFrameRenderer
    public void setBounds(Rect rect) {
        AnimatedDrawableBackend animatedDrawableBackendForNewBounds = ((AnimatedDrawableBackend) this.f6554b).forNewBounds(rect);
        if (animatedDrawableBackendForNewBounds != ((AnimatedDrawableBackend) this.f6554b)) {
            this.f6554b = animatedDrawableBackendForNewBounds;
            this.f6555c = new C2085k0(animatedDrawableBackendForNewBounds, (Oe.a) this.f6556d);
        }
    }

    public a(WorkDatabase_Impl database, int i7) {
        switch (i7) {
            case 6:
                this.f6553a = database;
                Intrinsics.checkNotNullParameter(database, "database");
                this.f6554b = new Td.a(database, 5);
                this.f6555c = new Td.c(database, 4);
                this.f6556d = new Td.c(database, 5);
                break;
            default:
                this.f6553a = database;
                Intrinsics.checkNotNullParameter(database, "database");
                this.f6554b = new Td.a(database, 3);
                this.f6555c = new Td.c(database, 2);
                this.f6556d = new Td.c(database, 3);
                break;
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f6553a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = (Td.c) this.f6556d;
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

    public a(Typeface typeface, androidx.emoji2.text.flatbuffer.b bVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        this.f6556d = typeface;
        this.f6553a = bVar;
        this.f6555c = new t(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i13 = iA + bVar.f345a;
            i7 = ((ByteBuffer) bVar.f348d).getInt(((ByteBuffer) bVar.f348d).getInt(i13) + i13);
        } else {
            i7 = 0;
        }
        this.f6554b = new char[i7 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i14 = iA2 + bVar.f345a;
            i10 = ((ByteBuffer) bVar.f348d).getInt(((ByteBuffer) bVar.f348d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            w wVar = new w(this, i15);
            androidx.emoji2.text.flatbuffer.a aVarB = wVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f348d).getInt(iA3 + aVarB.f345a) : 0, (char[]) this.f6554b, i15 * 2);
            androidx.emoji2.text.flatbuffer.a aVarB2 = wVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i16 = iA4 + aVarB2.f345a;
                i11 = ((ByteBuffer) aVarB2.f348d).getInt(((ByteBuffer) aVarB2.f348d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            p118hf.a.g(i11 > 0, "invalid metadata codepoint length");
            androidx.emoji2.text.flatbuffer.a aVarB3 = wVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i17 = iA5 + aVarB3.f345a;
                i12 = ((ByteBuffer) aVarB3.f348d).getInt(((ByteBuffer) aVarB3.f348d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            ((t) this.f6555c).a(wVar, 0, i12 - 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Object obj, Function3 function3, Function3 function4, t0 t0Var) {
        this.f6553a = obj;
        this.f6554b = (kotlin.jvm.internal.m) function3;
        this.f6555c = (kotlin.jvm.internal.m) function4;
        this.f6556d = t0Var;
    }
}
