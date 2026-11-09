package androidx.customview.widget;

import Af.l;
import Bc.m;
import M.q;
import N8.m0;
import Pa.r0;
import Rd.C0605v;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import android.widget.Toast;
import androidx.camera.core.impl.utils.n;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.B;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.G;
import androidx.room.x;
import androidx.room.z;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.alibaba.android.alpha.AlphaConfig;
import com.alibaba.android.alpha.Task;
import com.alibaba.android.arouter.base.UniqueKeyTreeMap;
import com.alibaba.android.arouter.core.InterceptorServiceImpl;
import com.alibaba.android.arouter.exception.HandlerException;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.launcher.ARouter;
import com.alibaba.android.arouter.utils.MapUtils;
import com.bumptech.glide.load.engine.C1323a;
import com.didiglobal.booster.instrument.ShadowToast;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.producers.C1357w;
import com.facebook.imagepipeline.producers.c0;
import com.google.api.Service;
import com.gyf.immersionbar.OSUtils;
import com.gyf.immersionbar.i;
import com.gyf.immersionbar.j;
import com.gyf.immersionbar.k;
import com.rnmaps.maps.M;
import com.rnmaps.maps.MapMarker;
import com.rnmaps.maps.MapView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeTextView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpHomeActivity;
import com.transsnet.palmpay.airtime.viewmodel.ScheduleTopUpViewModel;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxCampaignMainActivity;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashLoginActivity;
import com.transsnet.palmpay.ui.activity.MyAssetsActivity;
import io.reactivex.internal.operators.observable.C1756h;
import io.reactivex.internal.operators.observable.O;
import java.io.File;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.N;
import kotlin.jvm.internal.AbstractC1859i;
import o9.d0;
import p198n5.h;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16389b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f16388a = i7;
        this.f16389b = obj;
    }

    private final void f() {
        CloseableReference closeableReference;
        int i7;
        boolean zM;
        synchronized (((c0) this.f16389b)) {
            c0 c0Var = (c0) this.f16389b;
            closeableReference = c0Var.f21542g;
            i7 = c0Var.f21543h;
            c0Var.f21542g = null;
            c0Var.f21544i = false;
        }
        if (CloseableReference.h(closeableReference)) {
            try {
                c0.i((c0) this.f16389b, closeableReference, i7);
                closeableReference.close();
            } catch (Throwable th) {
                CloseableReference.d(closeableReference);
                throw th;
            }
        }
        c0 c0Var2 = (c0) this.f16389b;
        synchronized (c0Var2) {
            c0Var2.f21545j = false;
            zM = c0Var2.m();
        }
        if (zM) {
            C1357w c1357w = c0Var2.f21546k;
            ((Executor) c1357w.f21641d).execute(new e(c0Var2, 12));
        }
    }

    public void a() {
        i iVar = (i) this.f16389b;
        if (iVar == null || !iVar.f23249v) {
            return;
        }
        iVar.f23245i.getClass();
    }

    public l b() throws IOException {
        z zVar = (z) this.f16389b;
        l lVar = new l();
        Cursor cursorQuery$default = G.query$default(zVar.f17804a, new M0.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
        while (cursorQuery$default.moveToNext()) {
            try {
                lVar.add(Integer.valueOf(cursorQuery$default.getInt(0)));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.o(cursorQuery$default, th);
                    throw th2;
                }
            }
        }
        Unit unit = Unit.f38893a;
        cursorQuery$default.close();
        l lVarA = N.a(lVar);
        if (lVarA.f354a.isEmpty()) {
            return lVarA;
        }
        if (((z) this.f16389b).f17811h == null) {
            throw new IllegalStateException("Required value was null.");
        }
        SupportSQLiteStatement supportSQLiteStatement = ((z) this.f16389b).f17811h;
        if (supportSQLiteStatement == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        supportSQLiteStatement.executeUpdateDelete();
        return lVarA;
    }

    public void c() {
        i iVar = (i) this.f16389b;
        if (iVar != null) {
            iVar.h();
            if (OSUtils.isEMUI3_x() && iVar.f23249v && !iVar.f23243f && iVar.f23245i.f23222i) {
                iVar.d();
            } else {
                iVar.c();
            }
            a();
        }
    }

    public void d() {
        i iVar;
        i iVar2 = (i) this.f16389b;
        if (iVar2 != null) {
            if (iVar2.f23238a != null) {
                int i7 = com.gyf.immersionbar.f.f23228d;
                ArrayList arrayList = com.gyf.immersionbar.e.f23227a.f23229a;
                if (arrayList != null) {
                    arrayList.remove(iVar2);
                }
                int i10 = k.f23251a;
                k kVar = j.f23250a;
                iVar2.f23245i.getClass();
                kVar.getClass();
            }
            if (iVar2.f23244g && (iVar = iVar2.f23242e) != null) {
                iVar.f23245i.getClass();
            }
            iVar2.f23249v = false;
            this.f16389b = null;
        }
    }

    public void e() {
        i iVar = (i) this.f16389b;
        if (iVar != null) {
            iVar.h();
            if (iVar.f23243f || !iVar.f23249v || iVar.f23245i == null) {
                return;
            }
            if (OSUtils.isEMUI3_x() && iVar.f23245i.f23223j) {
                iVar.d();
            } else {
                iVar.f23245i.getClass();
            }
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        View viewFindDrawerWithGravity;
        int width;
        Object obj;
        Set setB;
        Activity activity;
        TextView textView;
        TextView textView2;
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        int length = 0;
        switch (this.f16388a) {
            case 0:
                ((g) this.f16389b).s(0);
                return;
            case 1:
                androidx.drawerlayout.widget.f fVar = (androidx.drawerlayout.widget.f) this.f16389b;
                int i7 = fVar.f16830b.f16405o;
                int i10 = fVar.f16829a;
                boolean z3 = i10 == 3;
                DrawerLayout drawerLayout = fVar.f16832d;
                if (z3) {
                    viewFindDrawerWithGravity = drawerLayout.findDrawerWithGravity(3);
                    width = (viewFindDrawerWithGravity != null ? -viewFindDrawerWithGravity.getWidth() : 0) + i7;
                } else {
                    viewFindDrawerWithGravity = drawerLayout.findDrawerWithGravity(5);
                    width = drawerLayout.getWidth() - i7;
                }
                if (viewFindDrawerWithGravity != null) {
                    if (((!z3 || viewFindDrawerWithGravity.getLeft() >= width) && (z3 || viewFindDrawerWithGravity.getLeft() <= width)) || drawerLayout.getDrawerLockMode(viewFindDrawerWithGravity) != 0) {
                        return;
                    }
                    DrawerLayout.LayoutParams layoutParams = (DrawerLayout.LayoutParams) viewFindDrawerWithGravity.getLayoutParams();
                    fVar.f16830b.v(viewFindDrawerWithGravity, width, viewFindDrawerWithGravity.getTop());
                    layoutParams.f16820c = true;
                    drawerLayout.invalidate();
                    View viewFindDrawerWithGravity2 = drawerLayout.findDrawerWithGravity(i10 == 3 ? 5 : 3);
                    if (viewFindDrawerWithGravity2 != null) {
                        drawerLayout.closeDrawer(viewFindDrawerWithGravity2);
                    }
                    drawerLayout.cancelChildViewTouch();
                    return;
                }
                return;
            case 2:
                synchronized (((B) this.f16389b).f17328a) {
                    obj = ((B) this.f16389b).f17333f;
                    ((B) this.f16389b).f17333f = B.f17327k;
                    break;
                }
                ((B) this.f16389b).k(obj);
                return;
            case 3:
                RecyclerView recyclerView = ((PreferenceFragmentCompat) this.f16389b).f17586c;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case 4:
                ((p) this.f16389b).d();
                return;
            case 5:
                Lock closeLock$room_runtime_release = ((z) this.f16389b).f17804a.getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    try {
                        if (((z) this.f16389b).c() && ((z) this.f16389b).f17809f.compareAndSet(true, false) && !((z) this.f16389b).f17804a.inTransaction()) {
                            SupportSQLiteDatabase writableDatabase = ((z) this.f16389b).f17804a.getOpenHelper().getWritableDatabase();
                            writableDatabase.beginTransactionNonExclusive();
                            try {
                                setB = b();
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                                closeLock$room_runtime_release.unlock();
                                ((z) this.f16389b).getClass();
                                if (setB.isEmpty()) {
                                    return;
                                }
                                z zVar = (z) this.f16389b;
                                synchronized (zVar.f17814k) {
                                    try {
                                        Iterator it = zVar.f17814k.iterator();
                                        while (true) {
                                            A.b bVar = (A.b) it;
                                            if (bVar.hasNext()) {
                                                ((x) ((Map.Entry) bVar.next()).getValue()).a(setB);
                                            } else {
                                                Unit unit = Unit.f38893a;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                return;
                            } catch (Throwable th2) {
                                writableDatabase.endTransaction();
                                throw th2;
                            }
                        }
                        closeLock$room_runtime_release.unlock();
                        ((z) this.f16389b).getClass();
                        return;
                    } catch (Throwable th3) {
                        closeLock$room_runtime_release.unlock();
                        ((z) this.f16389b).getClass();
                        throw th3;
                    }
                } catch (SQLiteException e10) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                    setB = kotlin.collections.B.f38895a;
                } catch (IllegalStateException e11) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                    setB = kotlin.collections.B.f38895a;
                }
                break;
            case 6:
                androidx.viewpager2.adapter.f fVar2 = (androidx.viewpager2.adapter.f) this.f16389b;
                fVar2.f18283i = false;
                fVar2.d();
                return;
            case 7:
                ShadowToast.show(Toast.makeText(AlphaConfig.getContext(), String.format("AlphaTask %s run too long, cost time: %s", (Object[]) this.f16389b), 0));
                return;
            case 8:
                Task task = (Task) this.f16389b;
                Process.setThreadPriority(task.mThreadPriority);
                long jCurrentTimeMillis = System.currentTimeMillis();
                task.switchState(1);
                task.run();
                task.switchState(2);
                task.recordTime(System.currentTimeMillis() - jCurrentTimeMillis);
                task.notifyFinished();
                task.recycle();
                return;
            case 9:
                UniqueKeyTreeMap uniqueKeyTreeMap = com.alibaba.android.arouter.core.b.f20355e;
                if (MapUtils.isNotEmpty(uniqueKeyTreeMap)) {
                    Iterator it2 = uniqueKeyTreeMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        Class cls = (Class) ((Map.Entry) it2.next()).getValue();
                        try {
                            IInterceptor iInterceptor = (IInterceptor) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                            iInterceptor.init((Context) this.f16389b);
                            com.alibaba.android.arouter.core.b.f20356f.add(iInterceptor);
                        } catch (Exception e12) {
                            throw new HandlerException("ARouter::ARouter init interceptor error! name = [" + cls.getName() + "], reason = [" + e12.getMessage() + "]");
                        }
                    }
                    boolean unused = InterceptorServiceImpl.interceptorHasInit = true;
                    ARouter.logger.info("ARouter::", "ARouter interceptors init over.");
                    synchronized (InterceptorServiceImpl.interceptorInitLock) {
                        InterceptorServiceImpl.interceptorInitLock.notifyAll();
                        break;
                    }
                    return;
                }
                return;
            case 10:
                com.bumptech.glide.p pVar = (com.bumptech.glide.p) this.f16389b;
                pVar.f21069c.addListener(pVar);
                return;
            case 11:
                O2.a aVar = (O2.a) this.f16389b;
                aVar.getClass();
                while (true) {
                    try {
                        aVar.b((C1323a) ((ReferenceQueue) aVar.f6555c).remove());
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 12:
                f();
                return;
            case 13:
                U4.i iVar = (U4.i) this.f16389b;
                try {
                    iVar.y(n.p(iVar.f9248e), iVar.f9248e);
                    return;
                } catch (IOException e13) {
                    h.b("ScreenshotProvider", e13);
                    return;
                }
            case 14:
                i iVar2 = (i) this.f16389b;
                if (iVar2 == null || (activity = iVar2.f23238a) == null) {
                    return;
                }
                new com.gyf.immersionbar.a(activity);
                throw null;
            case 15:
                ((MapMarker) this.f16389b).g();
                return;
            case 16:
                MapView mapView = (MapView) this.f16389b;
                mapView.measure(View.MeasureSpec.makeMeasureSpec(mapView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(mapView.getHeight(), 1073741824));
                mapView.layout(mapView.getLeft(), mapView.getTop(), mapView.getRight(), mapView.getBottom());
                return;
            case 17:
                M m7 = (M) this.f16389b;
                LinkedList linkedList = (LinkedList) m7.f24720c;
                Iterator it3 = linkedList.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    LinkedList linkedList2 = (LinkedList) m7.f24721d;
                    if (!zHasNext) {
                        if (linkedList2.size() > 0) {
                            linkedList.removeAll(linkedList2);
                            linkedList2.clear();
                        }
                        if (((LinkedList) m7.f24720c).size() > 0) {
                            ((Handler) m7.f24719b).postDelayed((e) m7.f24722e, 40L);
                            return;
                        } else {
                            m7.f24718a = false;
                            return;
                        }
                    }
                    MapMarker mapMarker = (MapMarker) it3.next();
                    if (!mapMarker.f24784u0 || mapMarker.f24782s0 == 0) {
                        mapMarker.f24784u0 = false;
                        linkedList2.add(mapMarker);
                    } else {
                        mapMarker.g();
                        int i11 = mapMarker.f24782s0;
                        if (i11 > 0) {
                            mapMarker.f24782s0 = i11 - 1;
                        }
                    }
                }
                break;
            case 18:
                MarqueeTextView marqueeTextView = (MarqueeTextView) this.f16389b;
                marqueeTextView.resetMarqueeView();
                marqueeTextView.dealAnimation();
                return;
            case 19:
                ((BaseActivity) this.f16389b).loadingDismiss();
                return;
            case 20:
                BaseFragment baseFragment = (BaseFragment) this.f16389b;
                com.transsnet.palmpay.custom_view.dialog.b bVar2 = baseFragment.f27320d;
                if (bVar2 == null || !bVar2.isShowing()) {
                    return;
                }
                baseFragment.f27320d.dismiss();
                baseFragment.f27320d.setOnCancelListener(null);
                baseFragment.f27320d = null;
                return;
            case 21:
                CoreCashierPreviewActivity coreCashierPreviewActivity = (CoreCashierPreviewActivity) this.f16389b;
                Trace.beginSection("delayInit");
                try {
                    CoreCashierPreviewActivity.A(coreCashierPreviewActivity);
                    CoreCashierPreviewActivity.z(coreCashierPreviewActivity);
                    coreCashierPreviewActivity.X();
                    return;
                } finally {
                    Trace.endSection();
                }
            case 22:
                ((TitleEditView) this.f16389b).f31154C = "";
                return;
            case 23:
                Trace.beginSection("delayInit");
                try {
                    r0.D1((CashBoxCampaignMainActivity) this.f16389b, r0.y0("/mm_icon_win_lottery_prize.png"));
                    return;
                } finally {
                    Trace.endSection();
                }
            case 24:
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Recharge2CashLoginActivity recharge2CashLoginActivity = (Recharge2CashLoginActivity) this.f16389b;
                long j6 = recharge2CashLoginActivity.f33126g;
                if (j6 - jElapsedRealtime < 1000) {
                    Recharge2CashLoginActivity.n(recharge2CashLoginActivity);
                    return;
                }
                int i12 = (int) ((j6 - jElapsedRealtime) / 1000);
                C0605v c0605v = (C0605v) recharge2CashLoginActivity.f27334c;
                if (c0605v != null && (textView2 = c0605v.f8528d) != null) {
                    textView2.setText("Resend Code(" + i12 + ")");
                }
                C0605v c0605v2 = (C0605v) recharge2CashLoginActivity.f27334c;
                if (c0605v2 != null && (textView = c0605v2.f8528d) != null) {
                    textView.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorDisabled, recharge2CashLoginActivity));
                }
                recharge2CashLoginActivity.getUIHandler().postDelayed(this, 500L);
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                MyAssetsActivity myAssetsActivity = (MyAssetsActivity) this.f16389b;
                Trace.beginSection("delayInit");
                try {
                    m mVar = myAssetsActivity.f34503f;
                    if (mVar != null && (viewStub3 = mVar.f767b) != null) {
                        p220oa.h.s(viewStub3, true);
                    }
                    SingleAdView singleAdView = (SingleAdView) myAssetsActivity.findViewById(Ac.e.adView);
                    if (singleAdView != null) {
                        singleAdView.setSlotId(myAssetsActivity.getString(Ac.h.main_ad_assets_bottom_slot_id));
                        org.chromium.support_lib_boundary.util.b.c(singleAdView);
                    }
                    m mVar2 = myAssetsActivity.f34503f;
                    if (mVar2 != null && (viewStub2 = mVar2.f765Z) != null) {
                        p220oa.h.s(viewStub2, true);
                    }
                    SingleAdView singleAdView2 = (SingleAdView) myAssetsActivity.findViewById(Ac.e.adCompliance);
                    if (singleAdView2 != null) {
                        singleAdView2.setSlotId(myAssetsActivity.getString(Ac.h.main_ad_assets_bottom_compliance_slot_id));
                        org.chromium.support_lib_boundary.util.b.c(singleAdView2);
                    }
                    m mVar3 = myAssetsActivity.f34503f;
                    if (mVar3 != null && (viewStub = mVar3.f769d) != null) {
                        p220oa.h.s(viewStub, true);
                    }
                    m mVar4 = myAssetsActivity.f34503f;
                    r0.l1("", mVar4 != null ? mVar4.f768c : null);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 26:
                C1756h c1756h = (C1756h) this.f16389b;
                df.h hVar = c1756h.f37822d;
                try {
                    c1756h.f37819a.onComplete();
                    return;
                } finally {
                    hVar.dispose();
                }
            case 27:
                ((O) this.f16389b).f37783c.dispose();
                return;
            case 28:
                Pa.G g7 = (Pa.G) this.f16389b;
                File[] fileArrListFiles = g7.f7014a.listFiles();
                if (fileArrListFiles != null) {
                    q qVarA = AbstractC1859i.a(fileArrListFiles);
                    int i13 = 0;
                    while (qVarA.hasNext()) {
                        File file = (File) qVarA.next();
                        long jLastModified = 0;
                        length += (int) (file != null ? file.length() : 0L);
                        i13++;
                        if (file != null) {
                            jLastModified = file.lastModified();
                        }
                        g7.f7017d.put(file, Long.valueOf(jLastModified));
                    }
                    g7.f7015b.set(length);
                    g7.f7016c.set(i13);
                    return;
                }
                return;
            default:
                ScheduleTopUpHomeActivity scheduleTopUpHomeActivity = (ScheduleTopUpHomeActivity) this.f16389b;
                Trace.beginSection("delayInit");
                try {
                    m0 m0Var = new m0(scheduleTopUpHomeActivity, 6);
                    int i14 = ScheduleTopUpHomeActivity.f26471i;
                    scheduleTopUpHomeActivity.n(null, m0Var);
                    ((ScheduleTopUpViewModel) scheduleTopUpHomeActivity.l()).h();
                    ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) scheduleTopUpHomeActivity.l();
                    scheduleTopUpViewModel.getClass();
                    if (BaseApplication.hasLogin()) {
                        p140j8.f.s(scheduleTopUpViewModel, new d0(1, null), scheduleTopUpViewModel.f26646o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    public e(Activity activity) {
        this.f16388a = 14;
        if (activity == null || ((i) this.f16389b) != null) {
            return;
        }
        this.f16389b = new i(activity);
    }
}
