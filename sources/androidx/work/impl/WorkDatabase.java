package androidx.work.impl;

import V0.C0695n;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.work.Clock;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@TypeConverters({C0695n.class, org.chromium.support_lib_boundary.util.b.class})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/G;", "<init>", "()V", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Database(autoMigrations = {@AutoMigration(from = 13, to = 14), @AutoMigration(from = 14, spec = p045d3.j.class, to = 15), @AutoMigration(from = 16, to = 17), @AutoMigration(from = 17, to = 18), @AutoMigration(from = 18, to = 19), @AutoMigration(from = 19, spec = p121i2.d.class, to = 20), @AutoMigration(from = 20, to = 21), @AutoMigration(from = 22, to = 23)}, entities = {androidx.work.impl.model.a.class, androidx.work.impl.model.k.class, androidx.work.impl.model.o.class, androidx.work.impl.model.d.class, androidx.work.impl.model.f.class, androidx.work.impl.model.g.class, androidx.work.impl.model.c.class}, version = 23)
@RestrictTo({p192n.c.f39801b})
public abstract class WorkDatabase extends androidx.room.G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18387a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SupportSQLiteOpenHelper create$lambda$0(Context context, M0.g configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            M0.e eVarBuilder = M0.g.f5714f.builder(context);
            eVarBuilder.f5710b = configuration.f5716b;
            M0.d callback = configuration.f5717c;
            Intrinsics.checkNotNullParameter(callback, "callback");
            eVarBuilder.f5711c = callback;
            eVarBuilder.f5712d = true;
            eVarBuilder.f5713e = true;
            M0.g configuration2 = eVarBuilder.a();
            Intrinsics.checkNotNullParameter(configuration2, "configuration");
            return new N0.l(configuration2.f5715a, configuration2.f5716b, configuration2.f5717c, configuration2.f5718d, configuration2.f5719e);
        }

        @JvmStatic
        @NotNull
        public final WorkDatabase create(@NotNull Context context, @NotNull Executor executor, @NotNull Clock clock, boolean z3) {
            androidx.room.C cL;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(executor, "queryExecutor");
            Intrinsics.checkNotNullParameter(clock, "clock");
            if (z3) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
                cL = new androidx.room.C(context, null, WorkDatabase.class);
                cL.f17692j = true;
            } else {
                cL = com.palmpay.lib.apm.launchcounter.util.d.l(context, "androidx.work.workdb", WorkDatabase.class);
                cL.f17691i = new o(context);
            }
            Intrinsics.checkNotNullParameter(executor, "executor");
            cL.f17689g = executor;
            C1268a callback = new C1268a(clock);
            Intrinsics.checkNotNullParameter(callback, "callback");
            cL.f17686d.add(callback);
            cL.a(C1269b.f18400f);
            cL.a(new C1272e(context, 2, 3));
            cL.a(C1269b.f18401g);
            cL.a(C1269b.f18402h);
            cL.a(new C1272e(context, 5, 6));
            cL.a(C1269b.f18403i);
            cL.a(C1269b.f18404j);
            cL.a(C1269b.f18405k);
            cL.a(new C1272e(context));
            cL.a(new C1272e(context, 10, 11));
            cL.a(C1269b.f18396b);
            cL.a(C1269b.f18397c);
            cL.a(C1269b.f18398d);
            cL.a(C1269b.f18399e);
            cL.a(new C1272e(context, 21, 22));
            cL.f17694l = false;
            cL.f17695m = true;
            return (WorkDatabase) cL.b();
        }

        private a() {
        }
    }

    public abstract DependencyDao c();

    public abstract PreferenceDao d();

    public abstract SystemIdInfoDao e();

    public abstract WorkNameDao f();

    public abstract WorkProgressDao g();

    public abstract WorkSpecDao h();

    public abstract WorkTagDao i();
}
