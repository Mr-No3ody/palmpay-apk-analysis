package M0;

import androidx.sqlite.db.SupportSQLiteProgram;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public final void bind(@NotNull SupportSQLiteProgram statement, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i7 = 0;
        while (i7 < length) {
            Object obj = objArr[i7];
            i7++;
            bind(statement, i7, obj);
        }
    }

    private a() {
    }

    private final void bind(SupportSQLiteProgram supportSQLiteProgram, int i7, Object obj) {
        if (obj == null) {
            supportSQLiteProgram.bindNull(i7);
            return;
        }
        if (obj instanceof byte[]) {
            supportSQLiteProgram.bindBlob(i7, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            supportSQLiteProgram.bindDouble(i7, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            supportSQLiteProgram.bindDouble(i7, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            supportSQLiteProgram.bindLong(i7, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            supportSQLiteProgram.bindLong(i7, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            supportSQLiteProgram.bindLong(i7, ((Number) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            supportSQLiteProgram.bindLong(i7, ((Number) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            supportSQLiteProgram.bindString(i7, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            supportSQLiteProgram.bindLong(i7, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i7 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
    }
}
