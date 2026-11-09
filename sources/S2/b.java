package S2;

import com.facebook.fresco.ui.common.ControllerListener2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class b implements ControllerListener2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f8650a;

    static {
        new a(null);
        f8650a = new b();
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onFailure(String id2, Throwable th, d dVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onFinalImageSet(String id2, Object obj, d dVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onIntermediateImageFailed(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onIntermediateImageSet(String id2, Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onRelease(String id2, d dVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onSubmit(String id2, Object obj, d dVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onEmptyEvent(Object obj) {
    }
}
