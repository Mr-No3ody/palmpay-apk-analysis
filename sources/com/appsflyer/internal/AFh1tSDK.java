package com.appsflyer.internal;

import com.appsflyer.migration.AppsFlyerMigrationHelper;
import kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "BranchMigrationManagerUtil")
public final class AFh1tSDK {
    public static final boolean getCurrencyIso4217Code() {
        try {
            AppsFlyerMigrationHelper appsFlyerMigrationHelper = AppsFlyerMigrationHelper.INSTANCE;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
