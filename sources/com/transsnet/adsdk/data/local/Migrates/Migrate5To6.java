package com.transsnet.adsdk.data.local.Migrates;

import J0.a;
import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public class Migrate5To6 extends a {
    public Migrate5To6(int startVersion, int endVersion) {
        super(startVersion, endVersion);
    }

    @Override // J0.a
    public void migrate(@NonNull SupportSQLiteDatabase database) {
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN text_content TEXT");
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN text_font_size TEXT");
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN text_font_color TEXT");
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN text_scroll_speed TEXT");
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN background_color TEXT");
    }
}
