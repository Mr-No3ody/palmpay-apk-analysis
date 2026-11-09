package B6;

import com.palmpay.lib.liveness.task.IDetectionTask;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class I extends K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IDetectionTask f390a;

    public I(IDetectionTask task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f390a = task;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            return this.f390a.equals(((I) obj).f390a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f390a.hashCode() * 31;
    }

    public final String toString() {
        return "TaskCompleted(task=" + this.f390a + ", resultBitmap=null)";
    }
}
