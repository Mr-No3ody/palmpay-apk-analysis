package p052da;

import L6.b;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseApplication f35746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f35747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f35748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Rect f35749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35754i;

    public final void a(Canvas canvas, int i7, int i10, View view) {
        Paint paint = this.f35748c;
        BaseApplication baseApplication = this.f35746a;
        paint.setColor(baseApplication.getResources().getColor(b.ppColorBackgroundDark));
        canvas.drawRect(0.0f, view.getTop() - this.f35754i, this.f35750e, view.getTop(), this.f35748c);
        this.f35748c.setColor(baseApplication.getResources().getColor(b.ppColorTextDisable));
        Paint paint2 = this.f35748c;
        String[] strArr = this.f35747b;
        String str = strArr[i10];
        paint2.getTextBounds(str, 0, str.length(), this.f35749d);
        canvas.drawText(strArr[i10], i7, (this.f35751f * 9) + ((view.getTop() - this.f35749d.top) - this.f35754i), this.f35748c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0 || childAdapterPosition == this.f35753h) {
            rect.set(0, this.f35754i, 0, 0);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i7 = this.f35751f * 15;
        for (int i10 = 0; i10 < recyclerView.getChildCount(); i10++) {
            View childAt = recyclerView.getChildAt(i10);
            int viewAdapterPosition = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewAdapterPosition();
            if (viewAdapterPosition == this.f35752g) {
                a(canvas, i7, 0, childAt);
            } else if (viewAdapterPosition == this.f35753h) {
                a(canvas, i7, 1, childAt);
            }
        }
    }
}
