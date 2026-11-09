package H3;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* JADX INFO: loaded from: classes.dex */
public final class l extends YogaNodeJNIBase {
    public final void finalize() throws Throwable {
        try {
            long j6 = this.f21918f;
            if (j6 != 0) {
                this.f21918f = 0L;
                YogaNative.jni_YGNodeFinalizeJNI(j6);
            }
        } finally {
            super.finalize();
        }
    }
}
