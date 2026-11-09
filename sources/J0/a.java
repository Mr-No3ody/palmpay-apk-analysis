package J0;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    @JvmField
    public final int endVersion;

    @JvmField
    public final int startVersion;

    public a(int i7, int i10) {
        this.startVersion = i7;
        this.endVersion = i10;
    }

    public abstract void migrate(SupportSQLiteDatabase supportSQLiteDatabase);
}
