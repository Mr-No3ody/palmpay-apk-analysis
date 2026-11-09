package com.growingio.android.database;

import Ab.r;
import android.content.Context;
import com.growingio.android.sdk.b;
import com.growingio.sdk.annotation.GIOLibraryModule;
import p216o5.a;
import p247q5.c;

/* JADX INFO: loaded from: classes3.dex */
@GIOLibraryModule
public class DatabaseLibraryModule extends b {
    @Override // com.growingio.android.sdk.b
    public final void registerComponents(Context context, c cVar) {
        cVar.b(a.class, p216o5.b.class, new r(context, 7));
    }
}
