package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import androidx.preference.B;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
@RestrictTo({c.f39802c})
public class PreferenceImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17635b;

    public PreferenceImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f17635b;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f17634a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i7);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i7 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i10 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i7) {
        this.f17635b = i7;
        super.setMaxHeight(i7);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i7) {
        this.f17634a = i7;
        super.setMaxWidth(i7);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17634a = Integer.MAX_VALUE;
        this.f17635b = Integer.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.PreferenceImageView, i7, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(B.PreferenceImageView_maxWidth, Integer.MAX_VALUE));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(B.PreferenceImageView_maxHeight, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }
}
