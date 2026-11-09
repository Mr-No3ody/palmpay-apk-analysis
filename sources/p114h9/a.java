package p114h9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37357c = CommonViewExtKt.getDp(10);

    public a(int i7, int i10) {
        this.f37355a = i7;
        this.f37356b = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        if (parent.getChildLayoutPosition(view) != 0) {
            outRect.left = CommonViewExtKt.getDp(10);
        }
        outRect.bottom = this.f37357c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas c6, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(c6, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c6, parent, state);
        int dp = CommonViewExtKt.getDp(3);
        int dp2 = CommonViewExtKt.getDp(28);
        int dp3 = CommonViewExtKt.getDp(10);
        float width = (parent.getWidth() / 2) - (dp2 / 2);
        float height = parent.getHeight() - dp;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.f37355a);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(dp);
        int iComputeHorizontalScrollExtent = parent.computeHorizontalScrollExtent();
        int iComputeHorizontalScrollRange = parent.computeHorizontalScrollRange();
        int iComputeHorizontalScrollOffset = parent.computeHorizontalScrollOffset();
        float f10 = iComputeHorizontalScrollRange - iComputeHorizontalScrollExtent;
        if (f10 > 0.0f) {
            c6.drawLine(width, height, width + dp2, height, paint);
            float f11 = (dp2 - dp3) * (iComputeHorizontalScrollOffset / f10);
            paint.setColor(this.f37356b);
            c6.drawLine(width + f11, height, width + dp3 + f11, height, paint);
        }
    }
}
