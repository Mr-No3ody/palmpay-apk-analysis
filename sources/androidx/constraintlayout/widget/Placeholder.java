package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f15691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15692c;

    public Placeholder(Context context) {
        super(context);
        this.f15690a = -1;
        this.f15691b = null;
        this.f15692c = 4;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.f15692c);
        this.f15690a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.ConstraintLayout_placeholder);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.ConstraintLayout_placeholder_content) {
                    this.f15690a = typedArrayObtainStyledAttributes.getResourceId(index, this.f15690a);
                } else if (index == p.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f15692c = typedArrayObtainStyledAttributes.getInt(index, this.f15692c);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f15691b;
    }

    public int getEmptyVisibility() {
        return this.f15692c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int id2) {
        View viewFindViewById;
        if (this.f15690a == id2) {
            return;
        }
        View view = this.f15691b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f15691b.getLayoutParams()).f15645f0 = false;
            this.f15691b = null;
        }
        this.f15690a = id2;
        if (id2 == -1 || (viewFindViewById = ((View) getParent()).findViewById(id2)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int visibility) {
        this.f15692c = visibility;
    }

    public Placeholder(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f15690a = -1;
        this.f15691b = null;
        this.f15692c = 4;
        a(attrs);
    }

    public Placeholder(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15690a = -1;
        this.f15691b = null;
        this.f15692c = 4;
        a(attrs);
    }
}
