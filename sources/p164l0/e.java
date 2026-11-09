package p164l0;

import android.content.SharedPreferences;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f39261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f39262b;

    public e(SharedPreferences prefs, LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.f39261a = prefs;
        this.f39262b = linkedHashSet;
    }
}
