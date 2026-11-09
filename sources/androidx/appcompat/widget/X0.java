package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public abstract class X0 extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f12860a = null;

    public static void a(Context context) {
        if (context.getResources() instanceof Y0) {
            return;
        }
        context.getResources();
        int i7 = n1.f12981a;
    }
}
