package N0;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f6031a = new b();

    @DoNotInline
    public final void a(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String sql, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        Intrinsics.checkNotNullParameter(sql, "sql");
        sQLiteDatabase.execPerConnectionSQL(sql, objArr);
    }
}
