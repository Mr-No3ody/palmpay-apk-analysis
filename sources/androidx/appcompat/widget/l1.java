package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static l1 f12958p;
    public static l1 t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f12959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f12960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f12962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f12963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12965g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m1 f12966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12967j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12968o;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.k1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.k1] */
    public l1(View view, CharSequence charSequence) {
        final int i7 = 0;
        this.f12962d = new Runnable(this) { // from class: androidx.appcompat.widget.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f12941b;

            {
                this.f12941b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.f12941b.c(false);
                        break;
                    default:
                        this.f12941b.a();
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f12963e = new Runnable(this) { // from class: androidx.appcompat.widget.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f12941b;

            {
                this.f12941b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f12941b.c(false);
                        break;
                    default:
                        this.f12941b.a();
                        break;
                }
            }
        };
        this.f12959a = view;
        this.f12960b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = androidx.core.view.O.f16174a;
        this.f12961c = Build.VERSION.SDK_INT >= 28 ? X.a.l(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f12968o = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(l1 l1Var) {
        l1 l1Var2 = f12958p;
        if (l1Var2 != null) {
            l1Var2.f12959a.removeCallbacks(l1Var2.f12962d);
        }
        f12958p = l1Var;
        if (l1Var != null) {
            l1Var.f12959a.postDelayed(l1Var.f12962d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        l1 l1Var = t;
        View view = this.f12959a;
        if (l1Var == this) {
            t = null;
            m1 m1Var = this.f12966i;
            if (m1Var != null) {
                View view2 = (View) m1Var.f12972b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) m1Var.f12971a).getSystemService("window")).removeView(view2);
                }
                this.f12966i = null;
                this.f12968o = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f12958p == this) {
            b(null);
        }
        view.removeCallbacks(this.f12963e);
    }

    public final void c(boolean z3) {
        int height;
        int i7;
        int i10;
        int i11;
        long longPressTimeout;
        long j6;
        long j10;
        View view = this.f12959a;
        if (view.isAttachedToWindow()) {
            b(null);
            l1 l1Var = t;
            if (l1Var != null) {
                l1Var.a();
            }
            t = this;
            this.f12967j = z3;
            Context context = view.getContext();
            m1 m1Var = new m1();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            m1Var.f12974d = layoutParams;
            m1Var.f12975e = new Rect();
            m1Var.f12976f = new int[2];
            m1Var.f12977g = new int[2];
            m1Var.f12971a = context;
            View viewInflate = LayoutInflater.from(context).inflate(p241q.g.abc_tooltip, (ViewGroup) null);
            m1Var.f12972b = viewInflate;
            m1Var.f12973c = (TextView) viewInflate.findViewById(p241q.f.message);
            layoutParams.setTitle(m1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = p241q.i.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.f12966i = m1Var;
            int width = this.f12964f;
            int i12 = this.f12965g;
            boolean z8 = this.f12967j;
            View view2 = (View) m1Var.f12972b;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) m1Var.f12971a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) m1Var.f12973c).setText(this.f12960b);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) m1Var.f12974d;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(p241q.d.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(p241q.d.tooltip_precise_anchor_extra_offset);
                height = i12 + dimensionPixelOffset2;
                i7 = i12 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i7 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z8 ? p241q.d.tooltip_y_offset_touch : p241q.d.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i11 = 1;
            } else {
                Rect rect = (Rect) m1Var.f12975e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i10 = 0;
                    i11 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i11 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i10 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) m1Var.f12977g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) m1Var.f12976f;
                view.getLocationOnScreen(iArr2);
                int i13 = iArr2[i10] - iArr[i10];
                iArr2[i10] = i13;
                iArr2[i11] = iArr2[i11] - iArr[i11];
                layoutParams2.x = (i13 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, i10);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i14 = iArr2[i11];
                int i15 = ((i14 + i7) - dimensionPixelOffset3) - measuredHeight;
                int i16 = i14 + height + dimensionPixelOffset3;
                if (z8) {
                    if (i15 >= 0) {
                        layoutParams2.y = i15;
                    } else {
                        layoutParams2.y = i16;
                    }
                } else if (measuredHeight + i16 <= rect.height()) {
                    layoutParams2.y = i16;
                } else {
                    layoutParams2.y = i15;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f12967j) {
                j10 = 2500;
            } else {
                WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                if ((view.getWindowSystemUiVisibility() & 1) == i11) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = 15000;
                }
                j10 = j6 - longPressTimeout;
            }
            k1 k1Var = this.f12963e;
            view.removeCallbacks(k1Var);
            view.postDelayed(k1Var, j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f12966i == null || !this.f12967j) {
            View view2 = this.f12959a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f12968o = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f12966i == null) {
                    int x3 = (int) motionEvent.getX();
                    int y8 = (int) motionEvent.getY();
                    if (this.f12968o) {
                        this.f12964f = x3;
                        this.f12965g = y8;
                        this.f12968o = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x3 - this.f12964f);
                        int i7 = this.f12961c;
                        if (iAbs > i7 || Math.abs(y8 - this.f12965g) > i7) {
                            this.f12964f = x3;
                            this.f12965g = y8;
                            this.f12968o = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f12964f = view.getWidth() / 2;
        this.f12965g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
