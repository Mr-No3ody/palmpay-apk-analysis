package com.transsnet.adsdk.data.local.Migrates;

import J0.a;
import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public class Migrate8To9 extends a {
    public Migrate8To9(int startVersion, int endVersion) {
        super(startVersion, endVersion);
    }

    @Override // J0.a
    public void migrate(@NonNull SupportSQLiteDatabase database) {
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN native_ad_title TEXT");
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN native_ad_content TEXT");
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN native_ad_photo TEXT");
    }
}
