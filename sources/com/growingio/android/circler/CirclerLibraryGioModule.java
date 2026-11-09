package com.growingio.android.circler;

import android.content.Context;
import com.growingio.sdk.annotation.GIOLibraryModule;

/* JADX INFO: loaded from: classes3.dex */
@GIOLibraryModule
public class CirclerLibraryGioModule extends com.growingio.android.sdk.b {
    @Override // com.growingio.android.sdk.b
    public final void registerComponents(Context context, p247q5.c cVar) {
        cVar.b(p319v5.a.class, p319v5.d.class, new a(0));
    }
}
