package S2;

import android.util.Log;
import com.facebook.fresco.ui.common.ControllerListener2;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8656b = new ArrayList(2);

    static {
        new f(null);
    }

    @Override // S2.b, com.facebook.fresco.ui.common.ControllerListener2
    public final void onEmptyEvent(Object obj) {
        ArrayList arrayList = this.f8656b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((ControllerListener2) arrayList.get(i7)).onEmptyEvent(obj);
                    Unit unit = Unit.f38893a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onEmptyEvent", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // S2.b, com.facebook.fresco.ui.common.ControllerListener2
    public final void onFailure(String id2, Throwable th, d dVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList arrayList = this.f8656b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((ControllerListener2) arrayList.get(i7)).onFailure(id2, th, dVar);
                    Unit unit = Unit.f38893a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // S2.b, com.facebook.fresco.ui.common.ControllerListener2
    public final void onFinalImageSet(String id2, Object obj, d dVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList arrayList = this.f8656b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((ControllerListener2) arrayList.get(i7)).onFinalImageSet(id2, obj, dVar);
                    Unit unit = Unit.f38893a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // S2.b, com.facebook.fresco.ui.common.ControllerListener2
    public final void onIntermediateImageFailed(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList arrayList = this.f8656b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((ControllerListener2) arrayList.get(i7)).onIntermediateImageFailed(id2);
                    Unit unit = Unit.f38893a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // S2.b, com.facebook.fresco.ui.common.ControllerListener2
    public final void onIntermediateImageSet(String id2, Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList arrayList = this.f8656b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((ControllerListener2) arrayList.get(i7)).onIntermediateImageSet(id2, obj);
                    Unit unit = Unit.f38893a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // S2.b, com.facebook.fresco.ui.common.ControllerListener2
    public final void onRelease(String id2, d dVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList arrayList = this.f8656b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((ControllerListener2) arrayList.get(i7)).onRelease(id2, dVar);
                    Unit unit = Unit.f38893a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // S2.b, com.facebook.fresco.ui.common.ControllerListener2
    public final void onSubmit(String id2, Object obj, d dVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList arrayList = this.f8656b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((ControllerListener2) arrayList.get(i7)).onSubmit(id2, obj, dVar);
                    Unit unit = Unit.f38893a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }
}
