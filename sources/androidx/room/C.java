package androidx.room;

import Pa.C0525w;
import android.app.ActivityManager;
import android.content.Context;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f17684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f17687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f17688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f17689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f17690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.work.impl.o f17691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E f17693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f17696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0525w f17697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f17698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashSet f17699q;

    public C(Context context, String str, Class klass) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f17683a = context;
        this.f17684b = klass;
        this.f17685c = str;
        this.f17686d = new ArrayList();
        this.f17687e = new ArrayList();
        this.f17688f = new ArrayList();
        this.f17693k = E.f17700a;
        this.f17694l = true;
        this.f17696n = -1L;
        this.f17697o = new C0525w(15);
        this.f17698p = new LinkedHashSet();
    }

    public final void a(J0.a... migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        if (this.f17699q == null) {
            this.f17699q = new HashSet();
        }
        for (J0.a aVar : migrations) {
            HashSet hashSet = this.f17699q;
            Intrinsics.e(hashSet);
            hashSet.add(Integer.valueOf(aVar.startVersion));
            HashSet hashSet2 = this.f17699q;
            Intrinsics.e(hashSet2);
            hashSet2.add(Integer.valueOf(aVar.endVersion));
        }
        this.f17697o.b((J0.a[]) Arrays.copyOf(migrations, migrations.length));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    public final G b() {
        String str;
        Executor executor = this.f17689g;
        if (executor == null && this.f17690h == null) {
            G0.g gVar = p357y.a.f44018h;
            this.f17690h = gVar;
            this.f17689g = gVar;
        } else if (executor != null && this.f17690h == null) {
            this.f17690h = executor;
        } else if (executor == null) {
            this.f17689g = this.f17690h;
        }
        HashSet hashSet = this.f17699q;
        LinkedHashSet linkedHashSet = this.f17698p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(C0.G.m(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        SupportSQLiteOpenHelper.Factory mVar = this.f17691i;
        if (mVar == null) {
            mVar = new N0.m();
        }
        SupportSQLiteOpenHelper.Factory factory = mVar;
        if (this.f17696n > 0) {
            if (this.f17685c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        ArrayList arrayList = this.f17686d;
        boolean z3 = this.f17692j;
        E e10 = this.f17693k;
        e10.getClass();
        Context context = this.f17683a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (e10 == E.f17700a) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager != null) {
                Intrinsics.checkNotNullParameter(activityManager, "activityManager");
                if (activityManager.isLowRamDevice()) {
                    e10 = E.f17701b;
                } else {
                    e10 = E.f17702c;
                }
            } else {
                e10 = E.f17701b;
            }
        }
        E e11 = e10;
        Executor executor2 = this.f17689g;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.f17690h;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C1234m c1234m = new C1234m(context, this.f17685c, factory, this.f17697o, arrayList, z3, e11, executor2, executor3, this.f17694l, this.f17695m, linkedHashSet, this.f17687e, this.f17688f);
        Class klass = this.f17684b;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter("_Impl", "suffix");
        Package r10 = klass.getPackage();
        Intrinsics.e(r10);
        String fullPackage = r10.getName();
        String canonicalName = klass.getCanonicalName();
        Intrinsics.e(canonicalName);
        Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = kotlin.text.y.j(canonicalName, '.', '_') + "_Impl";
        try {
            if (fullPackage.length() == 0) {
                str = str2;
            } else {
                str = fullPackage + '.' + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            Intrinsics.f(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            G g7 = (G) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            g7.init(c1234m);
            return g7;
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
        }
    }
}
