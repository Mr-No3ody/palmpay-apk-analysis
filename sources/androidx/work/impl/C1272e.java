package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.work.impl.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1272e extends J0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18542a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f18543b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1272e(Context mContext, int i7, int i10) {
        super(i7, i10);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f18543b = mContext;
    }

    @Override // J0.a
    public final void migrate(SupportSQLiteDatabase db2) {
        switch (this.f18542a) {
            case 0:
                Intrinsics.checkNotNullParameter(db2, "db");
                if (this.endVersion >= 10) {
                    ((N0.d) db2).execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f18543b.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(db2, "db");
                N0.d sqLiteDatabase = (N0.d) db2;
                sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f18543b;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j6 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j10 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    sqLiteDatabase.beginTransaction();
                    try {
                        sqLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j6)});
                        sqLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j10)});
                        sharedPreferences.edit().clear().apply();
                        sqLiteDatabase.setTransactionSuccessful();
                        sqLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                        sqLiteDatabase.endTransaction();
                        throw th;
                    }
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i7 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i10 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    sqLiteDatabase.beginTransaction();
                    try {
                        sqLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i7)});
                        sqLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i10)});
                        sharedPreferences2.edit().clear().apply();
                        sqLiteDatabase.setTransactionSuccessful();
                        return;
                    } finally {
                        sqLiteDatabase.endTransaction();
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1272e(Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f18543b = context;
    }
}
