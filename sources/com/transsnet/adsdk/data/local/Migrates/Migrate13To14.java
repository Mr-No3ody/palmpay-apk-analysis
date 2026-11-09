package com.transsnet.adsdk.data.local.Migrates;

import J0.a;
import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public class Migrate13To14 extends a {
    public Migrate13To14() {
        super(13, 14);
    }

    @Override // J0.a
    public void migrate(@NonNull SupportSQLiteDatabase database) {
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN image_url_dark TEXT");
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN text_font_color_dark TEXT");
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN background_color_dark TEXT");
        database.execSQL("ALTER TABLE ad_detail  ADD COLUMN text_icon_url_dark TEXT");
    }
}
