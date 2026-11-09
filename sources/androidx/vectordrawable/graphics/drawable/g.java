package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h implements Animatable2Compat {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f18153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public G7.j f18154d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f18155e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f18156f = new d(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f18152b = new e();

    public g(Context context) {
        this.f18153c = context;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void clearAnimationCallbacks() {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        G7.j jVar = this.f18154d;
        if (jVar != null) {
            this.f18152b.f18147b.removeListener(jVar);
            this.f18154d = null;
        }
        ArrayList arrayList = this.f18155e;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        e eVar = this.f18152b;
        eVar.f18146a.draw(canvas);
        if (eVar.f18147b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.getAlpha() : this.f18152b.f18146a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f18152b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.getColorFilter() : this.f18152b.f18146a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f18157a != null) {
            return new f(this.f18157a.getConstantState(), 0);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f18152b.f18146a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f18152b.f18146a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.getOpacity() : this.f18152b.f18146a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        e eVar;
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            eVar = this.f18152b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayH = Y.a.h(resources, theme, attributeSet, a.f18142e);
                    int resourceId = typedArrayH.getResourceId(0, 0);
                    if (resourceId != 0) {
                        q qVarA = q.a(theme, resources, resourceId);
                        qVarA.f18217f = false;
                        qVarA.setCallback(this.f18156f);
                        q qVar = eVar.f18146a;
                        if (qVar != null) {
                            qVar.setCallback(null);
                        }
                        eVar.f18146a = qVarA;
                    }
                    typedArrayH.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.f18143f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f18153c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(eVar.f18146a.f18213b.f18200b.f18198o.get(string));
                        if (eVar.f18148c == null) {
                            eVar.f18148c = new ArrayList();
                            eVar.f18149d = new M.f(0);
                        }
                        eVar.f18148c.add(animatorLoadAnimator);
                        eVar.f18149d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (eVar.f18147b == null) {
            eVar.f18147b = new AnimatorSet();
        }
        eVar.f18147b.playTogether(eVar.f18148c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.isAutoMirrored() : this.f18152b.f18146a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f18157a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f18152b.f18147b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.isStateful() : this.f18152b.f18146a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f18152b.f18146a.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.setLevel(i7) : this.f18152b.f18146a.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.setState(iArr) : this.f18152b.f18146a.setState(iArr);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void registerAnimationCallback(c cVar) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(cVar.getPlatformCallback());
            return;
        }
        if (cVar == null) {
            return;
        }
        if (this.f18155e == null) {
            this.f18155e = new ArrayList();
        }
        if (this.f18155e.contains(cVar)) {
            return;
        }
        this.f18155e.add(cVar);
        if (this.f18154d == null) {
            this.f18154d = new G7.j(this, 6);
        }
        this.f18152b.f18147b.addListener(this.f18154d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f18152b.f18146a.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f18152b.f18146a.setAutoMirrored(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f18152b.f18146a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTint(int i7) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            org.chromium.support_lib_boundary.util.b.i0(drawable, i7);
        } else {
            this.f18152b.f18146a.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f18152b.f18146a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f18152b.f18146a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z8) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            return drawable.setVisible(z3, z8);
        }
        this.f18152b.f18146a.setVisible(z3, z8);
        return super.setVisible(z3, z8);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        e eVar = this.f18152b;
        if (eVar.f18147b.isStarted()) {
            return;
        }
        eVar.f18147b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f18152b.f18147b.end();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final boolean unregisterAnimationCallback(c cVar) {
        G7.j jVar;
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(cVar.getPlatformCallback());
        }
        ArrayList arrayList = this.f18155e;
        if (arrayList == null || cVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(cVar);
        if (this.f18155e.size() == 0 && (jVar = this.f18154d) != null) {
            this.f18152b.f18147b.removeListener(jVar);
            this.f18154d = null;
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
