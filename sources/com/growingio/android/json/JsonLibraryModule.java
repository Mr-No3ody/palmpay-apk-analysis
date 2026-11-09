package com.growingio.android.json;

import android.content.Context;
import com.growingio.android.sdk.b;
import com.growingio.sdk.annotation.GIOLibraryModule;
import p231p5.a;
import p247q5.c;

/* JADX INFO: loaded from: classes3.dex */
@GIOLibraryModule
public class JsonLibraryModule extends b {
    @Override // com.growingio.android.sdk.b
    public final void registerComponents(Context context, c cVar) {
        cVar.b(p231p5.b.class, a.class, new p262r2.c(2));
    }
}
