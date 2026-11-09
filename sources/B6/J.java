package B6;

import com.palmpay.lib.liveness.task.IDetectionTask;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class J extends K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IDetectionTask f391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC0100w f393c;

    public J(IDetectionTask task, float f10, EnumC0100w enumC0100w) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f391a = task;
        this.f392b = f10;
        this.f393c = enumC0100w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j6 = (J) obj;
        return Intrinsics.c(this.f391a, j6.f391a) && Float.compare(this.f392b, j6.f392b) == 0 && this.f393c == j6.f393c;
    }

    public final int hashCode() {
        int iHashCode = (Float.hashCode(this.f392b) + (this.f391a.hashCode() * 31)) * 31;
        EnumC0100w enumC0100w = this.f393c;
        return iHashCode + (enumC0100w == null ? 0 : enumC0100w.hashCode());
    }

    public final String toString() {
        return "TaskRunning(task=" + this.f391a + ", progress=" + this.f392b + ", directive=" + this.f393c + ")";
    }
}
