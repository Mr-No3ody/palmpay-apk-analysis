package com.transsnet.palmpay.core.db;

import androidx.room.Database;
import androidx.room.G;
import com.transsnet.palmpay.core.db.dao.RequestContactDao;
import com.transsnet.palmpay.core.db.entity.RequestContact;

/* JADX INFO: loaded from: classes3.dex */
@Database(entities = {RequestContact.class}, exportSchema = false, version = 1)
public abstract class RequestContactDB extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile RequestContactDB f27373a;

    public abstract RequestContactDao c();
}
