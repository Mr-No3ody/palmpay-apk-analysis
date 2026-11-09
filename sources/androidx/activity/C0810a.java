package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.activity.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0810a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0810a f12019a = new C0810a();

    @DoNotInline
    @NotNull
    public final BackEvent a(float f10, float f11, float f12, int i7) {
        return new BackEvent(f10, f11, f12, i7);
    }

    @DoNotInline
    public final float b(@NotNull BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    @DoNotInline
    public final int c(@NotNull BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    @DoNotInline
    public final float d(@NotNull BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    @DoNotInline
    public final float e(@NotNull BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
