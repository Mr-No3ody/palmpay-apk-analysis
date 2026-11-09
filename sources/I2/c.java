package I2;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.VisibilityAwareDrawable;
import com.facebook.drawee.drawable.VisibilityCallback;
import com.facebook.drawee.drawable.f;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f implements VisibilityAwareDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f3989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VisibilityCallback f3990b;

    @Override // com.facebook.drawee.drawable.f, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            VisibilityCallback visibilityCallback = this.f3990b;
            if (visibilityCallback != null) {
                visibilityCallback.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f3989a;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f3989a.draw(canvas);
            }
        }
    }

    @Override // com.facebook.drawee.drawable.f, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.f, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.VisibilityAwareDrawable
    public final void setVisibilityCallback(VisibilityCallback visibilityCallback) {
        this.f3990b = visibilityCallback;
    }

    @Override // com.facebook.drawee.drawable.f, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z8) {
        VisibilityCallback visibilityCallback = this.f3990b;
        if (visibilityCallback != null) {
            visibilityCallback.onVisibilityChange(z3);
        }
        return super.setVisible(z3, z8);
    }
}
