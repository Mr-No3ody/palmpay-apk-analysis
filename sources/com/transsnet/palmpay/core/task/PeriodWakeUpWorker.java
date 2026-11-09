package com.transsnet.palmpay.core.task;

import F6.d;
import V0.C0689h;
import V0.C0692k;
import V0.C0704x;
import V0.C0706z;
import V0.D;
import V0.E;
import V0.M;
import V0.T;
import V0.U;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.model.k;
import androidx.work.impl.utils.g;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.SPUtils;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/core/task/PeriodWakeUpWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PeriodWakeUpWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f27408g = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void scheduleTask() {
            try {
                d.h("PeriodWakeUpWorker", 3, "scheduleTask: ");
                T t = U.f9904a;
                Context context = BaseApplication.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                U t3 = t.getInstance(context);
                t3.a();
                g gVar = new g(null);
                D d2 = D.f9863a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                TimeUnit timeUnit = TimeUnit.MINUTES;
                E e10 = new E();
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                Intrinsics.checkNotNullParameter(timeUnit2, "timeUnit");
                ((k) e10.f9906b).f18618g = timeUnit2.toMillis(30L);
                if (Long.MAX_VALUE - System.currentTimeMillis() <= ((k) e10.f9906b).f18618g) {
                    throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                }
                C0689h constraints = new C0689h(gVar, d2, false, false, true, true, -1L, -1L, CollectionsKt.b0(linkedHashSet));
                Intrinsics.checkNotNullParameter(constraints, "constraints");
                ((k) e10.f9906b).f18621j = constraints;
                Intrinsics.checkNotNullParameter("PeriodWakeUpWorker", "tag");
                ((Set) e10.f9907c).add("PeriodWakeUpWorker");
                t3.c((M) e10.a());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        public final boolean shouldSchedulePeriodWakeUp() {
            if (Build.VERSION.SDK_INT < 31 || BaseApplication.get().isOldAndroidDevice()) {
                return false;
            }
            try {
                return new androidx.core.app.M(BaseApplication.getContext()).f15943b.areNotificationsEnabled();
            } catch (Exception e10) {
                d.c("PeriodWakeUpWorker", "shouldSchedulePeriodWakeUp: areNotificationsEnabled error", e10);
                return false;
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodWakeUpWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(C0692k c0692k) {
        if (!f27408g.shouldSchedulePeriodWakeUp()) {
            d.h("PeriodWakeUpWorker", 3, "doWork: gate off, cancel unique work");
            try {
                T t = U.f9904a;
                Context context = this.f9856a;
                Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
                t.getInstance(context).b();
            } catch (Exception e10) {
                d.c("PeriodWakeUpWorker", "doWork: cancel failed", e10);
            }
            C0704x c0704x = new C0704x();
            Intrinsics.checkNotNullExpressionValue(c0704x, "failure(...)");
            return c0704x;
        }
        d.h("PeriodWakeUpWorker", 3, "doWork: ");
        if (BaseApplication.isFirebaseInitialized()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i7 = calendar.get(11);
            if (7 > i7 || i7 >= 24) {
                d.h("SyncPushMessageTask", 3, "fetchMessage: daytime only");
            } else {
                String strI = p367ya.a.d().i();
                Intrinsics.checkNotNullParameter("push_record", "spName");
                Intrinsics.checkNotNullParameter("_key_sync_push_message", "key");
                long j6 = SPUtils.getInstance("push_record").getLong("_key_sync_push_message", 0L);
                if (TextUtils.isEmpty(strI) || System.currentTimeMillis() < j6 + 3600000 || !BaseApplication.hasLogin()) {
                    d.h("SyncPushMessageTask", 3, "fetchMessage: not right time");
                } else {
                    V v3 = V.f10828a;
                    f fVar = I.f10809a;
                    AbstractC0780y.m(v3, e.f19009c, null, new Ga.a(strI, null), 2);
                }
            }
        } else {
            d.h("SyncPushMessageTask", 3, "fetchMessage: firebase not ready");
        }
        C0706z c0706z = new C0706z();
        Intrinsics.checkNotNullExpressionValue(c0706z, "success(...)");
        return c0706z;
    }
}
