package com.transsnet.adsdk.data.local.Migrates;

import J0.a;
import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public class Migrate9To10 extends a {
    public Migrate9To10() {
        super(9, 10);
    }

    @Override // J0.a
    public void migrate(@NonNull SupportSQLiteDatabase database) {
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN close_time INTEGER NOT NULL DEFAULT 0");
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN max_close_count INTEGER NOT NULL DEFAULT 0");
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN close_count INTEGER NOT NULL DEFAULT 0");
    }
}
