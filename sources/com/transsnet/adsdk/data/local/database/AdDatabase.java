package com.transsnet.adsdk.data.local.database;

import android.content.Context;
import androidx.room.C;
import androidx.room.Database;
import androidx.room.G;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.data.local.Migrates.Migrate10To11;
import com.transsnet.adsdk.data.local.Migrates.Migrate11To12;
import com.transsnet.adsdk.data.local.Migrates.Migrate12To13;
import com.transsnet.adsdk.data.local.Migrates.Migrate13To14;
import com.transsnet.adsdk.data.local.Migrates.Migrate14To15;
import com.transsnet.adsdk.data.local.Migrates.Migrate15To16;
import com.transsnet.adsdk.data.local.Migrates.Migrate16To17;
import com.transsnet.adsdk.data.local.Migrates.Migrate1To2;
import com.transsnet.adsdk.data.local.Migrates.Migrate2To3;
import com.transsnet.adsdk.data.local.Migrates.Migrate3To4;
import com.transsnet.adsdk.data.local.Migrates.Migrate4To5;
import com.transsnet.adsdk.data.local.Migrates.Migrate5To6;
import com.transsnet.adsdk.data.local.Migrates.Migrate6To7;
import com.transsnet.adsdk.data.local.Migrates.Migrate7To8;
import com.transsnet.adsdk.data.local.Migrates.Migrate8To9;
import com.transsnet.adsdk.data.local.Migrates.Migrate9To10;
import com.transsnet.adsdk.data.local.dao.AdDao;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Database(entities = {AdEntity.class}, exportSchema = false, version = 17)
public abstract class AdDatabase extends G {
    private static volatile AdDatabase INSTANCE;

    public static AdDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (AdDatabase.class) {
                try {
                    if (INSTANCE == null) {
                        C cL = d.l(context.getApplicationContext(), "transsnet_ad.db", AdDatabase.class);
                        cL.a(new Migrate1To2(1, 2));
                        cL.a(new Migrate2To3(2, 3));
                        cL.a(new Migrate3To4(3, 4));
                        cL.a(new Migrate4To5(4, 5));
                        cL.a(new Migrate5To6(5, 6));
                        cL.a(new Migrate6To7(6, 7));
                        cL.a(new Migrate7To8(7, 8));
                        cL.a(new Migrate8To9(8, 9));
                        cL.a(new Migrate9To10());
                        cL.a(new Migrate10To11());
                        cL.a(new Migrate11To12());
                        cL.a(new Migrate12To13());
                        cL.a(new Migrate13To14());
                        cL.a(new Migrate14To15());
                        cL.a(new Migrate15To16());
                        cL.a(new Migrate16To17());
                        ExecutorService executor = AdManager.get().getExecutor();
                        if (executor != null) {
                            Intrinsics.checkNotNullParameter(executor, "executor");
                            cL.f17690h = executor;
                            Intrinsics.checkNotNullParameter(executor, "executor");
                            cL.f17689g = executor;
                        }
                        INSTANCE = (AdDatabase) cL.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return INSTANCE;
    }

    public abstract AdDao adDao();
}
