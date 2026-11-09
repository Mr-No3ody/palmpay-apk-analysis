package I4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.github.xiaofeidev.shadow.round.RoundStatus;
import com.github.xiaofeidev.shadow.shadow.ShadowDraw;
import com.github.xiaofeidev.shadow.shadow.ShadowStatus;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ShadowStatus, ShadowDraw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RoundStatus f4005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f4006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f4007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f4008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f4009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4010g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4011i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4012j = false;

    public b(View view, H4.a aVar, a aVar2) {
        this.f4004a = view;
        this.f4005b = aVar;
        this.f4006c = aVar2;
        Paint paint = new Paint(1);
        this.f4009f = paint;
        paint.setAntiAlias(true);
        this.f4009f.setStyle(Paint.Style.FILL);
        this.f4009f.setStrokeCap(Paint.Cap.ROUND);
        this.f4009f.setColor(-1);
        this.f4007d = new RectF();
        this.f4008e = new Path();
        this.f4005b.fillRadius();
        a();
    }

    public final void a() {
        Paint paint = this.f4009f;
        a aVar = this.f4006c;
        paint.setShadowLayer(aVar.f4000a / ((float) Math.sqrt(2.0d)), aVar.f4001b, aVar.f4002c, aVar.f4003d);
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public final int getBlurRadius() {
        return this.f4006c.f4000a;
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public final RoundStatus getRoundStatus() {
        return this.f4005b;
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public final int getShadowColor() {
        return this.f4006c.f4003d;
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public final int getShadowOffsetX() {
        return this.f4006c.f4001b;
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public final int getShadowOffsetY() {
        return this.f4006c.f4002c;
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowDraw
    public final void onDraw(Canvas canvas) {
        canvas.drawPath(this.f4008e, this.f4009f);
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowDraw
    public final void onMeasure() {
        View view = this.f4004a;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0 || this.f4012j) {
            return;
        }
        this.f4012j = true;
        if (this.f4010g == 0 && this.f4011i == 0) {
            this.f4010g = measuredWidth;
            this.f4011i = measuredHeight;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i7 = this.f4010g;
        a aVar = this.f4006c;
        layoutParams.width = i7 + (aVar.f4000a << 1) + (Math.abs(aVar.f4001b) << 1);
        layoutParams.height = this.f4011i + (aVar.f4000a << 1) + (Math.abs(aVar.f4002c) << 1);
        view.setLayoutParams(layoutParams);
        int iAbs = Math.abs(aVar.f4001b) + aVar.f4000a;
        int iAbs2 = Math.abs(aVar.f4002c) + aVar.f4000a;
        view.setPadding(iAbs, iAbs2, iAbs, iAbs2);
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowDraw
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (i7 > 0) {
            a aVar = this.f4006c;
            int iAbs = Math.abs(aVar.f4001b) + aVar.f4000a + 1;
            int iAbs2 = Math.abs(aVar.f4002c) + aVar.f4000a + 1;
            this.f4007d.set(iAbs, iAbs2, i7 - iAbs, i10 - iAbs2);
            this.f4008e.reset();
            this.f4008e.addRoundRect(this.f4007d, this.f4005b.getRadiusList(), Path.Direction.CW);
        }
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public final void setBlurRadius(int i7) {
        this.f4006c.f4000a = i7;
        a();
        this.f4012j = false;
        onMeasure();
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public final void setRadius(RoundStatus roundStatus) {
        this.f4005b = roundStatus;
        roundStatus.fillRadius();
        this.f4008e.reset();
        this.f4008e.addRoundRect(this.f4007d, this.f4005b.getRadiusList(), Path.Direction.CW);
        this.f4004a.invalidate();
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public final void setShadowColor(int i7) {
        this.f4006c.f4003d = i7;
        a();
        this.f4004a.invalidate();
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public final void setShadowOffsetX(int i7) {
        this.f4006c.f4001b = i7;
        a();
        this.f4012j = false;
        onMeasure();
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public final void setShadowOffsetY(int i7) {
        this.f4006c.f4002c = i7;
        a();
        this.f4012j = false;
        onMeasure();
    }
}
