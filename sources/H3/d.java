package H3;

import com.facebook.yoga.YogaNative;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3623a;

    public final void finalize() throws Throwable {
        try {
            long j6 = this.f3623a;
            if (j6 != 0) {
                this.f3623a = 0L;
                YogaNative.jni_YGConfigFreeJNI(j6);
            }
        } finally {
            super.finalize();
        }
    }
}
