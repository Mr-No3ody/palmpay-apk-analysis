package androidx.constraintlayout.utils.widget;

import U.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.p;

/* JADX INFO: loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f15543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Path f15545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewOutlineProvider f15546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f15547e;

    public MotionButton(Context context) {
        super(context);
        this.f15543a = 0.0f;
        this.f15544b = Float.NaN;
        setPadding(0, 0, 0, 0);
    }

    public final void a(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == p.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public float getRound() {
        return this.f15544b;
    }

    public float getRoundPercent() {
        return this.f15543a;
    }

    @RequiresApi(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.f15544b = round;
            float f10 = this.f15543a;
            this.f15543a = -1.0f;
            setRoundPercent(f10);
            return;
        }
        boolean z3 = this.f15544b != round;
        this.f15544b = round;
        if (round != 0.0f) {
            if (this.f15545c == null) {
                this.f15545c = new Path();
            }
            if (this.f15547e == null) {
                this.f15547e = new RectF();
            }
            if (this.f15546d == null) {
                d dVar = new d(this, 1);
                this.f15546d = dVar;
                setOutlineProvider(dVar);
            }
            setClipToOutline(true);
            this.f15547e.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f15545c.reset();
            Path path = this.f15545c;
            RectF rectF = this.f15547e;
            float f11 = this.f15544b;
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float round) {
        boolean z3 = this.f15543a != round;
        this.f15543a = round;
        if (round != 0.0f) {
            if (this.f15545c == null) {
                this.f15545c = new Path();
            }
            if (this.f15547e == null) {
                this.f15547e = new RectF();
            }
            if (this.f15546d == null) {
                d dVar = new d(this, 0);
                this.f15546d = dVar;
                setOutlineProvider(dVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f15543a) / 2.0f;
            this.f15547e.set(0.0f, 0.0f, width, height);
            this.f15545c.reset();
            this.f15545c.addRoundRect(this.f15547e, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f15543a = 0.0f;
        this.f15544b = Float.NaN;
        a(attrs);
    }

    public MotionButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15543a = 0.0f;
        this.f15544b = Float.NaN;
        a(attrs);
    }
}
