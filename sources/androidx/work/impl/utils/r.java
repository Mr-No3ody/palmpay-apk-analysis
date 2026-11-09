package androidx.work.impl.utils;

import V0.AbstractC0703w;
import V0.C;
import V0.C0699s;
import android.content.Context;
import android.content.Intent;
import androidx.work.ForegroundUpdater;
import androidx.work.impl.C1271d;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.model.WorkSpecDao;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class r implements ForegroundUpdater {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.a f18722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1271d f18723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkSpecDao f18724c;

    static {
        C.d("WMFgUpdater");
    }

    public r(WorkDatabase workDatabase, C1271d c1271d, androidx.work.impl.utils.taskexecutor.a aVar) {
        this.f18723b = c1271d;
        this.f18722a = aVar;
        this.f18724c = workDatabase.h();
    }

    @Override // androidx.work.ForegroundUpdater
    public final ListenableFuture setForegroundAsync(final Context context, final UUID uuid, final C0699s c0699s) {
        androidx.work.impl.utils.taskexecutor.a aVar = this.f18722a;
        return AbstractC0703w.a(aVar.f18727a, "setForegroundAsync", new Function0() { // from class: androidx.work.impl.utils.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                r rVar = this.f18718a;
                String string = uuid.toString();
                androidx.work.impl.model.k workSpec = rVar.f18724c.getWorkSpec(string);
                if (workSpec == null || workSpec.f18613b.a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                C1271d c1271d = rVar.f18723b;
                C0699s c0699s2 = c0699s;
                c1271d.startForeground(string, c0699s2);
                androidx.work.impl.model.e eVarJ = p140j8.f.j(workSpec);
                String str = androidx.work.impl.foreground.a.f18552o;
                Context context2 = context;
                Intent intent = new Intent(context2, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_NOTIFY");
                intent.putExtra("KEY_NOTIFICATION_ID", c0699s2.f9969a);
                intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c0699s2.f9970b);
                intent.putExtra("KEY_NOTIFICATION", c0699s2.f9971c);
                intent.putExtra("KEY_WORKSPEC_ID", eVarJ.f18587a);
                intent.putExtra("KEY_GENERATION", eVarJ.f18588b);
                context2.startService(intent);
                return null;
            }
        });
    }
}
