package com.transsnet.palmpay.teller.db;

import Ud.a;
import androidx.room.Database;
import androidx.room.G;
import com.transsnet.palmpay.teller.db.dao.BillerSearchRecordDao;

/* JADX INFO: loaded from: classes4.dex */
@Database(entities = {a.class}, exportSchema = false, version = 1)
public abstract class BillerSearchRecordDataBase extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile BillerSearchRecordDataBase f34137a;

    public abstract BillerSearchRecordDao c();
}
