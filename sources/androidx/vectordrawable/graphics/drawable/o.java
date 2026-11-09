package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f18200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f18201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f18202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f18204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f18205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f18206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f18210l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f18199a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}
