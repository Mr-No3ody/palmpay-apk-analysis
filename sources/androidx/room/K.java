package androidx.room;

import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class K {
    public /* synthetic */ K(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @VisibleForTesting
    public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPOOL_LIMIT$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getQueryPool$annotations() {
    }

    @JvmStatic
    @NotNull
    public final L acquire(@NotNull String query, int i7) {
        Intrinsics.checkNotNullParameter(query, "query");
        TreeMap treeMap = L.f17715o;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i7));
            if (entryCeilingEntry == null) {
                Unit unit = Unit.f38893a;
                L l5 = new L(i7);
                Intrinsics.checkNotNullParameter(query, "query");
                l5.f17717b = query;
                l5.f17723i = i7;
                return l5;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            L sqliteQuery = (L) entryCeilingEntry.getValue();
            sqliteQuery.getClass();
            Intrinsics.checkNotNullParameter(query, "query");
            sqliteQuery.f17717b = query;
            sqliteQuery.f17723i = i7;
            Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
            return sqliteQuery;
        }
    }

    @JvmStatic
    @NotNull
    public final L copyFrom(@NotNull SupportSQLiteQuery supportSQLiteQuery) {
        Intrinsics.checkNotNullParameter(supportSQLiteQuery, "supportSQLiteQuery");
        L lAcquire = acquire(supportSQLiteQuery.getSql(), supportSQLiteQuery.getArgCount());
        supportSQLiteQuery.bindTo(new N0.n(lAcquire));
        return lAcquire;
    }

    public final void prunePoolLocked$room_runtime_release() {
        TreeMap treeMap = L.f17715o;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator it = treeMap.descendingKeySet().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
        while (true) {
            int i7 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i7;
        }
    }

    private K() {
    }
}
