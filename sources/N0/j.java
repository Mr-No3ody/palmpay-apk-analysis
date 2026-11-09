package N0;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final d getWrappedDb(@NotNull f refHolder, @NotNull SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(refHolder, "refHolder");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        d dVar = refHolder.f6035a;
        if (dVar != null) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            if (Intrinsics.c(dVar.f6034a, sqLiteDatabase)) {
                return dVar;
            }
        }
        d dVar2 = new d(sqLiteDatabase);
        refHolder.f6035a = dVar2;
        return dVar2;
    }

    private j() {
    }
}
