package p023b8;

import java.util.Collections;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18789b;

    public b(int i7) {
        this.f18789b = i7;
    }

    @Override // com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy
    public final void apply(List drawingOperations) {
        Intrinsics.checkNotNullParameter(drawingOperations, "drawingOperations");
        if (this.f18788a) {
            int i7 = this.f18789b;
            for (int iG = C1850q.g(drawingOperations); i7 < iG; iG--) {
                Collections.swap(drawingOperations, i7, iG);
                i7++;
            }
        }
    }
}
