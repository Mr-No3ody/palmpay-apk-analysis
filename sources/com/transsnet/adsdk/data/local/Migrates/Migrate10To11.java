package com.transsnet.adsdk.data.local.Migrates;

import J0.a;
import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public class Migrate10To11 extends a {
    public Migrate10To11() {
        super(10, 11);
    }

    @Override // J0.a
    public void migrate(@NonNull SupportSQLiteDatabase database) {
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN show_close_button INTEGER NOT NULL DEFAULT 0");
    }
}
