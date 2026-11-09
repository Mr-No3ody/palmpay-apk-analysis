package com.imuxuan.floatingview;

import B5.a;
import B5.b;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingMagnetView extends FrameLayout {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f23546v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f23547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f23548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f23550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MagnetViewListener f23551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f23553g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23554i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23555j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f23556o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23557p;
    public float t;

    public FloatingMagnetView(Context context) {
        this(context, null);
    }

    public final void a(boolean z3, boolean z8) {
        float f10 = z3 ? 13.0f : this.f23554i - 13;
        float y8 = getY();
        if (!z8) {
            float f11 = this.t;
            if (f11 != 0.0f) {
                this.t = 0.0f;
                y8 = f11;
            }
        }
        b bVar = this.f23553g;
        float fMin = Math.min(Math.max(0.0f, y8), this.f23555j - getHeight());
        bVar.f371b = f10;
        bVar.f372c = fMin;
        bVar.f373d = System.currentTimeMillis();
        bVar.f370a.post(bVar);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getParent() != null) {
            boolean z3 = configuration.orientation == 2;
            if (z3) {
                this.t = getY();
            }
            ((ViewGroup) getParent()).post(new a(this, z3, 0));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MagnetViewListener magnetViewListener;
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23549c = getX();
            this.f23550d = getY();
            this.f23547a = motionEvent.getRawX();
            this.f23548b = motionEvent.getRawY();
            this.f23552f = System.currentTimeMillis();
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                this.f23554i = viewGroup.getWidth() - getWidth();
                this.f23555j = viewGroup.getHeight();
            }
            b bVar = this.f23553g;
            bVar.f370a.removeCallbacks(bVar);
            return true;
        }
        if (action == 1) {
            this.t = 0.0f;
            boolean z3 = getX() < ((float) (this.f23554i / 2));
            this.f23557p = z3;
            a(z3, false);
            if (System.currentTimeMillis() - this.f23552f < 150 && (magnetViewListener = this.f23551e) != null) {
                magnetViewListener.onClick(this);
            }
        } else if (action == 2) {
            setX((motionEvent.getRawX() + this.f23549c) - this.f23547a);
            float rawY = (motionEvent.getRawY() + this.f23550d) - this.f23548b;
            float f10 = this.f23556o;
            if (rawY < f10) {
                rawY = f10;
            }
            if (rawY > this.f23555j - getHeight()) {
                rawY = this.f23555j - getHeight();
            }
            setY(rawY);
            return true;
        }
        return true;
    }

    public void setMagnetViewListener(MagnetViewListener magnetViewListener) {
        this.f23551e = magnetViewListener;
    }

    public FloatingMagnetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingMagnetView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f23557p = true;
        this.f23553g = new b(this);
        Context context2 = getContext();
        int identifier = context2.getResources().getIdentifier("status_bar_height", "dimen", "android");
        this.f23556o = identifier > 0 ? context2.getResources().getDimensionPixelSize(identifier) : 0;
        setClickable(true);
    }
}
