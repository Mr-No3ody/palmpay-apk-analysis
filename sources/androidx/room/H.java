package androidx.room;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class H {
    public /* synthetic */ H(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean hasEmptySchema$room_runtime_release(@NotNull SupportSQLiteDatabase db2) throws IOException {
        Intrinsics.checkNotNullParameter(db2, "db");
        Cursor cursorQuery = db2.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z3 = false;
            if (cursorQuery.moveToFirst() && cursorQuery.getInt(0) == 0) {
                z3 = true;
            }
            cursorQuery.close();
            return z3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(cursorQuery, th);
                throw th2;
            }
        }
    }

    public final boolean hasRoomMasterTable$room_runtime_release(@NotNull SupportSQLiteDatabase db2) throws IOException {
        Intrinsics.checkNotNullParameter(db2, "db");
        Cursor cursorQuery = db2.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z3 = false;
            if (cursorQuery.moveToFirst() && cursorQuery.getInt(0) != 0) {
                z3 = true;
            }
            cursorQuery.close();
            return z3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(cursorQuery, th);
                throw th2;
            }
        }
    }

    private H() {
    }
}
