package com.transsnet.adsdk.data.local.Migrates;

import J0.a;
import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public class Migrate6To7 extends a {
    public Migrate6To7(int startVersion, int endVersion) {
        super(startVersion, endVersion);
    }

    @Override // J0.a
    public void migrate(@NonNull SupportSQLiteDatabase database) {
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN ad_type INTEGER NOT NULL DEFAULT 1");
    }
}
