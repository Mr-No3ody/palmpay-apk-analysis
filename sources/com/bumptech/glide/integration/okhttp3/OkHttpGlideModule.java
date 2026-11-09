package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import com.bumptech.glide.j;
import com.bumptech.glide.module.GlideModule;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class OkHttpGlideModule implements GlideModule {
    @Override // com.bumptech.glide.module.AppliesOptions
    public final void applyOptions(Context context, e eVar) {
    }

    @Override // com.bumptech.glide.module.GlideModule, com.bumptech.glide.module.RegistersComponents
    public final void registerComponents(Context context, b bVar, j jVar) {
        jVar.j(new p345x1.b());
    }
}
