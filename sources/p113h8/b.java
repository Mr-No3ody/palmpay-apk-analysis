package p113h8;

import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends PagerSnapHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OrientationHelper f37353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OrientationHelper f37354b;

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View targetView) {
        int decoratedStart;
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        int decoratedStart2 = 0;
        if (layoutManager.canScrollHorizontally()) {
            OrientationHelper orientationHelper = this.f37354b;
            if (orientationHelper == null || !Intrinsics.c(orientationHelper.getLayoutManager(), layoutManager)) {
                OrientationHelper orientationHelperCreateHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
                Intrinsics.checkNotNullExpressionValue(orientationHelperCreateHorizontalHelper, "OrientationHelper.create…ntalHelper(layoutManager)");
                this.f37354b = orientationHelperCreateHorizontalHelper;
            }
            OrientationHelper orientationHelper2 = this.f37354b;
            if (orientationHelper2 == null) {
                Intrinsics.n("horizontalHelper");
                throw null;
            }
            decoratedStart = orientationHelper2.getDecoratedStart(targetView) - orientationHelper2.getStartAfterPadding();
        } else {
            decoratedStart = 0;
        }
        if (layoutManager.canScrollVertically()) {
            OrientationHelper orientationHelper3 = this.f37353a;
            if (orientationHelper3 == null || !Intrinsics.c(orientationHelper3.getLayoutManager(), layoutManager)) {
                OrientationHelper orientationHelperCreateVerticalHelper = OrientationHelper.createVerticalHelper(layoutManager);
                Intrinsics.checkNotNullExpressionValue(orientationHelperCreateVerticalHelper, "OrientationHelper.create…icalHelper(layoutManager)");
                this.f37353a = orientationHelperCreateVerticalHelper;
            }
            OrientationHelper orientationHelper4 = this.f37353a;
            if (orientationHelper4 == null) {
                Intrinsics.n("verticalHelper");
                throw null;
            }
            decoratedStart2 = orientationHelper4.getDecoratedStart(targetView) - orientationHelper4.getStartAfterPadding();
        }
        return new int[]{decoratedStart, decoratedStart2};
    }
}
