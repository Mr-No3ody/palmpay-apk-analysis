package androidx.room;

import Pa.C0525w;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.C1268a;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    @NotNull
    public static final D Companion = new D(null);

    @RestrictTo({p192n.c.f39802c})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @Nullable
    private C1223b autoCloser;

    @NotNull
    private final Map<String, Object> backingFieldMap;
    private SupportSQLiteOpenHelper internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;

    @JvmField
    @RestrictTo({p192n.c.f39802c})
    @Nullable
    protected List<? extends C1268a> mCallbacks;

    @JvmField
    @Nullable
    protected volatile SupportSQLiteDatabase mDatabase;

    @NotNull
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;

    @NotNull
    private final z invalidationTracker = createInvalidationTracker();

    @NotNull
    private Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs = new LinkedHashMap();

    @NotNull
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @NotNull
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    public G() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = mapSynchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    public static final void access$internalBeginTransaction(G g7) {
        g7.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = g7.getOpenHelper().getWritableDatabase();
        g7.getInvalidationTracker().h(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    public static Object b(Class cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof DelegatingOpenHelper) {
            return b(cls, ((DelegatingOpenHelper) supportSQLiteOpenHelper).getDelegate());
        }
        return null;
    }

    @Deprecated(message = "Will be hidden in a future release.")
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @Deprecated(message = "Will be hidden in the next release.")
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(G g7, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i7 & 2) != 0) {
            cancellationSignal = null;
        }
        return g7.query(supportSQLiteQuery, cancellationSignal);
    }

    public final void a() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        z invalidationTracker = getInvalidationTracker();
        if (invalidationTracker.f17809f.compareAndSet(false, true)) {
            invalidationTracker.f17804a.getQueryExecutor().execute(invalidationTracker.f17817n);
        }
    }

    @RestrictTo({p192n.c.f39802c})
    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @RestrictTo({p192n.c.f39801b})
    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw null;
     */
    @kotlin.Deprecated(message = "beginTransaction() is deprecated", replaceWith = @kotlin.ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void beginTransaction() {
        /*
            r2 = this;
            r2.assertNotMainThread()
            androidx.room.b r0 = r2.autoCloser
            if (r0 != 0) goto L27
            r2.assertNotMainThread()
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r2.getOpenHelper()
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            androidx.room.z r1 = r2.getInvalidationTracker()
            r1.h(r0)
            boolean r1 = r0.isWriteAheadLoggingEnabled()
            if (r1 == 0) goto L23
            r0.beginTransactionNonExclusive()
            return
        L23:
            r0.beginTransaction()
            return
        L27:
            androidx.room.F r0 = new androidx.room.F
            r1 = 0
            r0.<init>(r2, r1)
            java.lang.String r1 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L34
        L34:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.G.beginTransaction():void");
    }

    @WorkerThread
    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            Intrinsics.checkNotNullExpressionValue(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().getClass();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @NotNull
    public SupportSQLiteStatement compileStatement(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(sql);
    }

    @NotNull
    public abstract z createInvalidationTracker();

    @NotNull
    public abstract SupportSQLiteOpenHelper createOpenHelper(@NotNull C1234m c1234m);

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        throw null;
     */
    @kotlin.Deprecated(message = "endTransaction() is deprecated", replaceWith = @kotlin.ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void endTransaction() {
        /*
            r2 = this;
            androidx.room.b r0 = r2.autoCloser
            if (r0 != 0) goto L8
            r2.a()
            return
        L8:
            androidx.room.F r0 = new androidx.room.F
            r1 = 1
            r0.<init>(r2, r1)
            java.lang.String r1 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L15
        L15:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.G.endTransaction():void");
    }

    @RestrictTo({p192n.c.f39801b})
    @NotNull
    public final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    @RestrictTo({p192n.c.f39801b})
    @JvmSuppressWildcards
    @NotNull
    public List<J0.a> getAutoMigrations(@NotNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return kotlin.collections.z.f38935a;
    }

    @RestrictTo({p192n.c.f39801b})
    @NotNull
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    @NotNull
    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock lock = this.readWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        return lock;
    }

    @NotNull
    public z getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @NotNull
    public SupportSQLiteOpenHelper getOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.internalOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        Intrinsics.n("internalOpenHelper");
        throw null;
    }

    @NotNull
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.n("internalQueryExecutor");
        throw null;
    }

    @RestrictTo({p192n.c.f39801b})
    @NotNull
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return kotlin.collections.B.f38895a;
    }

    @RestrictTo({p192n.c.f39801b})
    @NotNull
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return kotlin.collections.G.c();
    }

    @RestrictTo({p192n.c.f39801b})
    @NotNull
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    @NotNull
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.n("internalTransactionExecutor");
        throw null;
    }

    @Nullable
    public <T> T getTypeConverter(@NotNull Class<T> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().inTransaction();
    }

    @CallSuper
    public void init(@NotNull C1234m configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<? extends AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends AutoMigrationSpec>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i7 = -1;
            if (it.hasNext()) {
                Class<? extends AutoMigrationSpec> next = it.next();
                int size = configuration.f17784n.size() - 1;
                ArrayList arrayList = configuration.f17784n;
                if (size >= 0) {
                    while (true) {
                        int i10 = size - 1;
                        if (next.isAssignableFrom(arrayList.get(size).getClass())) {
                            bitSet.set(size);
                            i7 = size;
                            break;
                        } else if (i10 < 0) {
                            break;
                        } else {
                            size = i10;
                        }
                    }
                }
                if (i7 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, (AutoMigrationSpec) arrayList.get(i7));
            } else {
                int size2 = configuration.f17784n.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i11 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i11 < 0) {
                            break;
                        } else {
                            size2 = i11;
                        }
                    }
                }
                Iterator<J0.a> it2 = getAutoMigrations(this.autoMigrationSpecs).iterator();
                while (true) {
                    boolean zContainsKey = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    J0.a next2 = it2.next();
                    int i12 = next2.startVersion;
                    int i13 = next2.endVersion;
                    C0525w c0525w = configuration.f17774d;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) c0525w.f7166b;
                    if (linkedHashMap.containsKey(Integer.valueOf(i12))) {
                        Map mapC = (Map) linkedHashMap.get(Integer.valueOf(i12));
                        if (mapC == null) {
                            mapC = kotlin.collections.G.c();
                        }
                        zContainsKey = mapC.containsKey(Integer.valueOf(i13));
                    }
                    if (!zContainsKey) {
                        c0525w.b(next2);
                    }
                }
                if (b(AbstractC1224c.class, getOpenHelper()) != null) {
                    throw new ClassCastException();
                }
                boolean z3 = configuration.f17777g == E.f17702c;
                getOpenHelper().setWriteAheadLoggingEnabled(z3);
                this.mCallbacks = configuration.f17775e;
                this.internalQueryExecutor = configuration.f17778h;
                this.internalTransactionExecutor = new androidx.appcompat.app.r(configuration.f17779i);
                this.allowMainThreadQueries = configuration.f17776f;
                this.writeAheadLoggingEnabled = z3;
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                Iterator<Map.Entry<Class<?>, List<Class<?>>>> it3 = requiredTypeConverters.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    ArrayList arrayList2 = configuration.f17783m;
                    if (zHasNext) {
                        Map.Entry<Class<?>, List<Class<?>>> next3 = it3.next();
                        Class<?> key = next3.getKey();
                        for (Class<?> cls : next3.getValue()) {
                            int size3 = arrayList2.size() - 1;
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            }
                            while (true) {
                                int i14 = size3 - 1;
                                if (cls.isAssignableFrom(arrayList2.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else {
                                    if (i14 < 0) {
                                        size3 = -1;
                                        break;
                                    }
                                    size3 = i14;
                                }
                            }
                            if (!(size3 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            this.typeConverters.put(cls, arrayList2.get(size3));
                        }
                    } else {
                        int size4 = arrayList2.size() - 1;
                        if (size4 < 0) {
                            return;
                        }
                        while (true) {
                            int i15 = size4 - 1;
                            if (!bitSet2.get(size4)) {
                                throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i15 < 0) {
                                return;
                            } else {
                                size4 = i15;
                            }
                        }
                    }
                }
            }
        }
    }

    public void internalInitInvalidationTracker(@NotNull SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "db");
        z invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (invalidationTracker.f17816m) {
            if (invalidationTracker.f17810g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.execSQL("PRAGMA temp_store = MEMORY;");
            database.execSQL("PRAGMA recursive_triggers='ON';");
            database.execSQL("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.h(database);
            invalidationTracker.f17811h = database.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            invalidationTracker.f17810g = true;
            Unit unit = Unit.f38893a;
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean boolValueOf;
        boolean zIsOpen;
        if (this.autoCloser == null) {
            SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
            if (supportSQLiteDatabase != null) {
                zIsOpen = supportSQLiteDatabase.isOpen();
            } else {
                boolValueOf = null;
            }
            return Intrinsics.c(boolValueOf, Boolean.TRUE);
        }
        zIsOpen = true;
        boolValueOf = Boolean.valueOf(zIsOpen);
        return Intrinsics.c(boolValueOf, Boolean.TRUE);
    }

    @RestrictTo({p192n.c.f39801b})
    public final boolean isOpenInternal() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    @JvmOverloads
    @NotNull
    public final Cursor query(@NotNull SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(@NotNull Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @RestrictTo({p192n.c.f39801b})
    public final void setAutoMigrationSpecs(@NotNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    @Deprecated(message = "setTransactionSuccessful() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    @NotNull
    public Cursor query(@NotNull String query, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        return getOpenHelper().getWritableDatabase().query(new M0.b(query, objArr));
    }

    @JvmOverloads
    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery query, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().getWritableDatabase().query(query, cancellationSignal);
        }
        return getOpenHelper().getWritableDatabase().query(query);
    }

    public <V> V runInTransaction(@NotNull Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            V vCall = body.call();
            setTransactionSuccessful();
            return vCall;
        } finally {
            endTransaction();
        }
    }
}
