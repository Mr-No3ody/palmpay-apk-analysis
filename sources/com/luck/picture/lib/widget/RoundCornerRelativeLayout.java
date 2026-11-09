package com.luck.picture.lib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.luck.picture.lib.R;

/* JADX INFO: loaded from: classes3.dex */
public class RoundCornerRelativeLayout extends RelativeLayout {
    private final float cornerSize;
    private final boolean isBottomNormal;
    private final boolean isTopNormal;
    private final RectF mRect;
    private final Path path;

    public RoundCornerRelativeLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.path.reset();
        RectF rectF = this.mRect;
        rectF.right = i7;
        rectF.bottom = i10;
        boolean z3 = this.isTopNormal;
        if (!z3 && !this.isBottomNormal) {
            Path path = this.path;
            float f10 = this.cornerSize;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            return;
        }
        if (z3) {
            float f11 = this.cornerSize;
            this.path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f11, f11, f11, f11}, Path.Direction.CW);
        }
        if (this.isBottomNormal) {
            float f12 = this.cornerSize;
            this.path.addRoundRect(this.mRect, new float[]{f12, f12, f12, f12, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        }
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mRect = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.PictureRoundCornerRelativeLayout, i7, 0);
        this.cornerSize = typedArrayObtainStyledAttributes.getDimension(R.styleable.PictureRoundCornerRelativeLayout_psCorners, 0.0f);
        this.isTopNormal = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PictureRoundCornerRelativeLayout_psTopNormal, false);
        this.isBottomNormal = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PictureRoundCornerRelativeLayout_psBottomNormal, false);
        typedArrayObtainStyledAttributes.recycle();
        this.path = new Path();
    }
}
