package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.p;

/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f15532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f15533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f15534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f15538g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15540j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15541o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15542p;

    public MockView(Context context) {
        super(context);
        this.f15532a = new Paint();
        this.f15533b = new Paint();
        this.f15534c = new Paint();
        this.f15535d = true;
        this.f15536e = true;
        this.f15537f = null;
        this.f15538g = new Rect();
        this.f15539i = Color.argb(255, 0, 0, 0);
        this.f15540j = Color.argb(255, 200, 200, 200);
        this.f15541o = Color.argb(255, 50, 50, 50);
        this.f15542p = 4;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.MockView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.MockView_mock_label) {
                    this.f15537f = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == p.MockView_mock_showDiagonals) {
                    this.f15535d = typedArrayObtainStyledAttributes.getBoolean(index, this.f15535d);
                } else if (index == p.MockView_mock_diagonalsColor) {
                    this.f15539i = typedArrayObtainStyledAttributes.getColor(index, this.f15539i);
                } else if (index == p.MockView_mock_labelBackgroundColor) {
                    this.f15541o = typedArrayObtainStyledAttributes.getColor(index, this.f15541o);
                } else if (index == p.MockView_mock_labelColor) {
                    this.f15540j = typedArrayObtainStyledAttributes.getColor(index, this.f15540j);
                } else if (index == p.MockView_mock_showLabel) {
                    this.f15536e = typedArrayObtainStyledAttributes.getBoolean(index, this.f15536e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f15537f == null) {
            try {
                this.f15537f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i10 = this.f15539i;
        Paint paint = this.f15532a;
        paint.setColor(i10);
        paint.setAntiAlias(true);
        int i11 = this.f15540j;
        Paint paint2 = this.f15533b;
        paint2.setColor(i11);
        paint2.setAntiAlias(true);
        this.f15534c.setColor(this.f15541o);
        this.f15542p = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f15542p);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f15535d) {
            width--;
            height--;
            float f10 = width;
            float f11 = height;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, f10, f11, this.f15532a);
            canvas2.drawLine(0.0f, f11, f10, 0.0f, this.f15532a);
            canvas2.drawLine(0.0f, 0.0f, f10, 0.0f, this.f15532a);
            canvas2.drawLine(f10, 0.0f, f10, f11, this.f15532a);
            canvas2.drawLine(f10, f11, 0.0f, f11, this.f15532a);
            canvas2.drawLine(0.0f, f11, 0.0f, 0.0f, this.f15532a);
        } else {
            canvas2 = canvas;
        }
        String str = this.f15537f;
        if (str == null || !this.f15536e) {
            return;
        }
        int length = str.length();
        Paint paint = this.f15533b;
        Rect rect = this.f15538g;
        paint.getTextBounds(str, 0, length, rect);
        float fWidth = (width - rect.width()) / 2.0f;
        float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) fWidth, (int) fHeight);
        int i7 = rect.left;
        int i10 = this.f15542p;
        rect.set(i7 - i10, rect.top - i10, rect.right + i10, rect.bottom + i10);
        canvas2.drawRect(rect, this.f15534c);
        canvas2.drawText(this.f15537f, fWidth, fHeight, paint);
    }

    public MockView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f15532a = new Paint();
        this.f15533b = new Paint();
        this.f15534c = new Paint();
        this.f15535d = true;
        this.f15536e = true;
        this.f15537f = null;
        this.f15538g = new Rect();
        this.f15539i = Color.argb(255, 0, 0, 0);
        this.f15540j = Color.argb(255, 200, 200, 200);
        this.f15541o = Color.argb(255, 50, 50, 50);
        this.f15542p = 4;
        a(context, attrs);
    }

    public MockView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15532a = new Paint();
        this.f15533b = new Paint();
        this.f15534c = new Paint();
        this.f15535d = true;
        this.f15536e = true;
        this.f15537f = null;
        this.f15538g = new Rect();
        this.f15539i = Color.argb(255, 0, 0, 0);
        this.f15540j = Color.argb(255, 200, 200, 200);
        this.f15541o = Color.argb(255, 50, 50, 50);
        this.f15542p = 4;
        a(context, attrs);
    }
}
