package com.growingio.android.sdk;

import android.content.Context;
import com.growingio.android.circler.CirclerLibraryGioModule;
import com.growingio.android.database.DatabaseLibraryModule;
import com.growingio.android.debugger.DebuggerLibraryGioModule;
import com.growingio.android.hybrid.HybridLibraryGioModule;
import com.growingio.android.json.JsonLibraryModule;
import com.growingio.android.okhttp3.OkhttpLibraryGioModule;
import com.growingio.android.sdk.autotrack.AutotrackerLibraryModule;
import com.growingio.android.sdk.autotrack.GrowingAppModule;

/* JADX INFO: loaded from: classes3.dex */
final class GeneratedGioModuleImpl extends GeneratedGioModule {
    private final GrowingAppModule appModule = new GrowingAppModule();

    public GeneratedGioModuleImpl(Context context) {
    }

    @Override // com.growingio.android.sdk.b
    public void registerComponents(Context context, p247q5.c registry) {
        new DebuggerLibraryGioModule().registerComponents(context, registry);
        new OkhttpLibraryGioModule().registerComponents(context, registry);
        new AutotrackerLibraryModule().registerComponents(context, registry);
        new CirclerLibraryGioModule().registerComponents(context, registry);
        new JsonLibraryModule().registerComponents(context, registry);
        new DatabaseLibraryModule().registerComponents(context, registry);
        new HybridLibraryGioModule().registerComponents(context, registry);
        this.appModule.registerComponents(context, registry);
    }
}
