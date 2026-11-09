package N0;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m implements SupportSQLiteOpenHelper.Factory {
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public final SupportSQLiteOpenHelper create(M0.g configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new l(configuration.f5715a, configuration.f5716b, configuration.f5717c, configuration.f5718d, configuration.f5719e);
    }
}
