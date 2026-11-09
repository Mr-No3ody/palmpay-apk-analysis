package androidx.core.view;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1058j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f16246a;

    public C1058j(DisplayCutout displayCutout) {
        this.f16246a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1058j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f16246a, ((C1058j) obj).f16246a);
    }

    public final int hashCode() {
        return this.f16246a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f16246a + "}";
    }
}
