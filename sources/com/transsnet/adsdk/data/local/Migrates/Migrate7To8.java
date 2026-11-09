package com.transsnet.adsdk.data.local.Migrates;

import J0.a;
import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public class Migrate7To8 extends a {
    public Migrate7To8(int startVersion, int endVersion) {
        super(startVersion, endVersion);
    }

    @Override // J0.a
    public void migrate(@NonNull SupportSQLiteDatabase database) {
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN default_img_res INTEGER NOT NULL DEFAULT 1");
    }
}
