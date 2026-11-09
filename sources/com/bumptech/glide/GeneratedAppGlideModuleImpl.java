package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory;
import com.transsnet.palmpay.glidemodule.GlideModeConfig;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlideModeConfig f20430a = new GlideModeConfig();

    public GeneratedAppGlideModuleImpl(Context context) {
    }

    @Override // com.bumptech.glide.module.a, com.bumptech.glide.module.AppliesOptions
    public final void applyOptions(Context context, e eVar) {
        this.f20430a.applyOptions(context, eVar);
    }

    @Override // com.bumptech.glide.module.a
    public final boolean c() {
        this.f20430a.getClass();
        return false;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final Set d() {
        return Collections.EMPTY_SET;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final RequestManagerRetriever$RequestManagerFactory e() {
        return new p166l2.a(4);
    }

    @Override // com.bumptech.glide.module.b, com.bumptech.glide.module.RegistersComponents
    public final void registerComponents(Context context, b bVar, j jVar) {
        jVar.j(new p345x1.b());
        this.f20430a.registerComponents(context, bVar, jVar);
    }
}
