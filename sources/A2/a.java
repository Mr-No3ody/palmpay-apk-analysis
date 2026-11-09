package A2;

import android.graphics.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p375z2.a f31a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p375z2.a f32b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p375z2.a f33c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p375z2.a f34d;

    static {
        Intrinsics.checkNotNullParameter("Performance", "name");
        Intrinsics.checkNotNullParameter("Markers for Performance", "description");
        Color.rgb(156, 39, 176);
        Intrinsics.checkNotNullParameter("Navigation", "name");
        Intrinsics.checkNotNullParameter("Tag for navigation", "description");
        f31a = new p375z2.a("RN Core", "Tag for React Native Core");
        f32b = new p375z2.a("Bridge Calls", "JS to Java calls (warning: this is spammy)");
        Color.rgb(128, 0, 128);
        f33c = new p375z2.a("Native Module", "Native Module init");
        f34d = new p375z2.a("UI Manager", "UI Manager View Operations (requires restart\nwarning: this is spammy)");
    }
}
