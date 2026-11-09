package com.growingio.android.hybrid;

import android.content.Context;
import com.growingio.android.sdk.b;
import com.growingio.sdk.annotation.GIOLibraryModule;
import org.sufficientlysecure.htmltextview.m;
import org.sufficientlysecure.htmltextview.o;
import p247q5.c;
import p264r5.a;

/* JADX INFO: loaded from: classes3.dex */
@GIOLibraryModule
public class HybridLibraryGioModule extends b {
    @Override // com.growingio.android.sdk.b
    public final void registerComponents(Context context, c cVar) {
        cVar.b(a.class, Boolean.class, new m(2));
        cVar.b(p264r5.b.class, p264r5.c.class, new o(2));
    }
}
