package com.skydoves.balloon.overlay;

import J7.a;
import J7.b;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p279s5.d;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR/\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R;\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00142\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u001eR+\u0010#\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\u001eR+\u0010*\u001a\u00020$2\u0006\u0010\f\u001a\u00020$8G@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u000e\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R/\u00101\u001a\u0004\u0018\u00010+2\b\u0010\f\u001a\u0004\u0018\u00010+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R+\u00108\u001a\u0002022\u0006\u0010\f\u001a\u0002028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u000e\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getStatusBarHeight", "()I", "<set-?>", "a", "Ls5/d;", "getAnchorView", "()Landroid/view/View;", "setAnchorView", "(Landroid/view/View;)V", "anchorView", "", "b", "getAnchorViewList", "()Ljava/util/List;", "setAnchorViewList", "(Ljava/util/List;)V", "anchorViewList", "c", "getOverlayColor", "setOverlayColor", "(I)V", "overlayColor", "d", "getOverlayPaddingColor", "setOverlayPaddingColor", "overlayPaddingColor", "", "e", "getOverlayPadding", "()F", "setOverlayPadding", "(F)V", "overlayPadding", "Landroid/graphics/Point;", "f", "getOverlayPosition", "()Landroid/graphics/Point;", "setOverlayPosition", "(Landroid/graphics/Point;)V", "overlayPosition", "LJ7/b;", "g", "getBalloonOverlayShape", "()LJ7/b;", "setBalloonOverlayShape", "(LJ7/b;)V", "balloonOverlayShape", "lib_ballon_debug"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BalloonAnchorOverlayView extends View {
    public static final /* synthetic */ KProperty[] t;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final d anchorView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final d anchorViewList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final d overlayColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final d overlayPaddingColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final d overlayPadding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final d overlayPosition;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final d balloonOverlayShape;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bitmap f25239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f25240j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f25241o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25242p;

    static {
        r rVar = new r("anchorView", "getAnchorView()Landroid/view/View;", BalloonAnchorOverlayView.class);
        G.f38952a.getClass();
        t = new KProperty[]{rVar, new r("anchorViewList", "getAnchorViewList()Ljava/util/List;", BalloonAnchorOverlayView.class), new r("overlayColor", "getOverlayColor()I", BalloonAnchorOverlayView.class), new r("overlayPaddingColor", "getOverlayPaddingColor()I", BalloonAnchorOverlayView.class), new r("overlayPadding", "getOverlayPadding()F", BalloonAnchorOverlayView.class), new r("overlayPosition", "getOverlayPosition()Landroid/graphics/Point;", BalloonAnchorOverlayView.class), new r("balloonOverlayShape", "getBalloonOverlayShape()Lcom/skydoves/balloon/overlay/BalloonOverlayShape;", BalloonAnchorOverlayView.class)};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BalloonAnchorOverlayView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getStatusBarHeight() {
        Rect rect = new Rect();
        Context context = getContext();
        if (!(context instanceof Activity)) {
            return 0;
        }
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public final void a(View view, Canvas canvas) {
        RectF rectF;
        if (view == null) {
            return;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Point overlayPosition = getOverlayPosition();
        if (overlayPosition == null) {
            rectF = null;
        } else {
            rectF = new RectF(overlayPosition.x - getOverlayPadding(), (overlayPosition.y - getOverlayPadding()) + getStatusBarHeight(), getOverlayPadding() + view.getWidth() + overlayPosition.x, getOverlayPadding() + view.getHeight() + overlayPosition.y + getStatusBarHeight());
        }
        if (rectF == null) {
            rectF = new RectF(rect.left - getOverlayPadding(), rect.top - getOverlayPadding(), getOverlayPadding() + rect.right, getOverlayPadding() + rect.bottom);
        }
        float overlayPadding = getOverlayPadding() / 2;
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(overlayPadding, overlayPadding);
        if (!(getBalloonOverlayShape() instanceof a)) {
            throw new l();
        }
        canvas.drawOval(rectF, this.f25240j);
        canvas.drawOval(rectF2, this.f25241o);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View anchorView;
        View anchorView2;
        Bitmap bitmap;
        if ((this.f25242p || (bitmap = this.f25239i) == null || bitmap.isRecycled()) && getWidth() != 0 && getHeight() != 0 && (((anchorView = getAnchorView()) == null || anchorView.getWidth() != 0) && ((anchorView2 = getAnchorView()) == null || anchorView2.getHeight() != 0))) {
            Bitmap bitmap2 = this.f25239i;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.f25239i = bitmapCreateBitmap;
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            Paint paint = this.f25240j;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
            paint.setColor(getOverlayColor());
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setColor(0);
            Paint paint2 = this.f25241o;
            paint2.setColor(getOverlayPaddingColor());
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(getOverlayPadding());
            List<View> anchorViewList = getAnchorViewList();
            if (anchorViewList == null || anchorViewList.isEmpty()) {
                a(getAnchorView(), canvas2);
            } else {
                List<View> anchorViewList2 = getAnchorViewList();
                if (anchorViewList2 != null) {
                    Iterator<T> it = anchorViewList2.iterator();
                    while (it.hasNext()) {
                        a((View) it.next(), canvas2);
                    }
                }
            }
            this.f25242p = false;
        }
        Bitmap bitmap3 = this.f25239i;
        if (bitmap3 == null || bitmap3.isRecycled() || canvas == null) {
            return;
        }
        canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
    }

    @Nullable
    public final View getAnchorView() {
        return (View) this.anchorView.getValue(this, t[0]);
    }

    @Nullable
    public final List<View> getAnchorViewList() {
        return (List) this.anchorViewList.getValue(this, t[1]);
    }

    @NotNull
    public final b getBalloonOverlayShape() {
        return (b) this.balloonOverlayShape.getValue(this, t[6]);
    }

    @ColorInt
    public final int getOverlayColor() {
        return ((Number) this.overlayColor.getValue(this, t[2])).intValue();
    }

    @Px
    public final float getOverlayPadding() {
        return ((Number) this.overlayPadding.getValue(this, t[4])).floatValue();
    }

    @ColorInt
    public final int getOverlayPaddingColor() {
        return ((Number) this.overlayPaddingColor.getValue(this, t[3])).intValue();
    }

    @Nullable
    public final Point getOverlayPosition() {
        return (Point) this.overlayPosition.getValue(this, t[5]);
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        this.f25242p = true;
    }

    public final void setAnchorView(@Nullable View view) {
        this.anchorView.setValue(this, t[0], view);
    }

    public final void setAnchorViewList(@Nullable List<? extends View> list) {
        this.anchorViewList.setValue(this, t[1], list);
    }

    public final void setBalloonOverlayShape(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.balloonOverlayShape.setValue(this, t[6], bVar);
    }

    public final void setOverlayColor(int i7) {
        this.overlayColor.setValue(this, t[2], Integer.valueOf(i7));
    }

    public final void setOverlayPadding(float f10) {
        this.overlayPadding.setValue(this, t[4], Float.valueOf(f10));
    }

    public final void setOverlayPaddingColor(int i7) {
        this.overlayPaddingColor.setValue(this, t[3], Integer.valueOf(i7));
    }

    public final void setOverlayPosition(@Nullable Point point) {
        this.overlayPosition.setValue(this, t[5], point);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BalloonAnchorOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BalloonAnchorOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.anchorView = G8.a.K(this, null);
        this.anchorViewList = G8.a.K(this, null);
        this.overlayColor = G8.a.K(this, 0);
        this.overlayPaddingColor = G8.a.K(this, 0);
        this.overlayPadding = G8.a.K(this, Float.valueOf(0.0f));
        this.overlayPosition = G8.a.K(this, null);
        this.balloonOverlayShape = G8.a.K(this, a.f4540a);
        Paint paint = new Paint(1);
        this.f25240j = paint;
        Paint paint2 = new Paint(1);
        this.f25241o = paint2;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
    }
}
