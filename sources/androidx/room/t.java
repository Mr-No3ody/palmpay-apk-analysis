package androidx.room;

import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public /* synthetic */ t(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @VisibleForTesting
    public static /* synthetic */ void getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
    }

    public final void beginTransactionInternal$room_runtime_release(@NotNull SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.isWriteAheadLoggingEnabled()) {
            database.beginTransactionNonExclusive();
        } else {
            database.beginTransaction();
        }
    }

    @NotNull
    public final String getTriggerName$room_runtime_release(@NotNull String tableName, @NotNull String triggerType) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }

    private t() {
    }
}
