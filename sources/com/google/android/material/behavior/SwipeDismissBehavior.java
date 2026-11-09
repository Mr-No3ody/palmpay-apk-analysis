package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.N;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.f;
import androidx.customview.widget.g;
import java.util.WeakHashMap;
import p074f0.c;
import p074f0.h;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean requestingDisallowInterceptTouchEvent;
    private boolean sensitivitySet;
    g viewDragHelper;
    private float sensitivity = 0.0f;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = 0.0f;
    float alphaEndSwipeDistance = 0.5f;
    private final f dragCallback = new f() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        private boolean shouldDismiss(@NonNull View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.originalCapturedViewLeft) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
            boolean z3 = view.getLayoutDirection() == 1;
            int i7 = SwipeDismissBehavior.this.swipeDirection;
            if (i7 == 2) {
                return true;
            }
            if (i7 == 0) {
                if (z3) {
                    return f10 < 0.0f;
                }
                return f10 > 0.0f;
            }
            if (i7 == 1) {
                if (z3) {
                    return f10 > 0.0f;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.f
        public int clampViewPositionHorizontal(@NonNull View view, int i7, int i10) {
            int width;
            int width2;
            int width3;
            boolean z3 = view.getLayoutDirection() == 1;
            int i11 = SwipeDismissBehavior.this.swipeDirection;
            if (i11 == 0) {
                if (z3) {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i11 != 1) {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = view.getWidth() + this.originalCapturedViewLeft;
            } else if (z3) {
                width = this.originalCapturedViewLeft;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = this.originalCapturedViewLeft;
            }
            return SwipeDismissBehavior.clamp(width, i7, width2);
        }

        @Override // androidx.customview.widget.f
        public int clampViewPositionVertical(@NonNull View view, int i7, int i10) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.f
        public int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.f
        public void onViewCaptured(@NonNull View view, int i7) {
            this.activePointerId = i7;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = false;
            }
        }

        @Override // androidx.customview.widget.f
        public void onViewDragStateChanged(int i7) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i7);
            }
        }

        @Override // androidx.customview.widget.f
        public void onViewPositionChanged(@NonNull View view, int i7, int i10, int i11, int i12) {
            float width = view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance;
            float fAbs = Math.abs(i7 - this.originalCapturedViewLeft);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // androidx.customview.widget.f
        public void onViewReleased(@NonNull View view, float f10, float f11) {
            int i7;
            boolean z3;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f10)) {
                if (f10 >= 0.0f) {
                    int left = view.getLeft();
                    int i10 = this.originalCapturedViewLeft;
                    if (left < i10) {
                        i7 = this.originalCapturedViewLeft - width;
                    } else {
                        i7 = i10 + width;
                    }
                } else {
                    i7 = this.originalCapturedViewLeft - width;
                }
                z3 = true;
            } else {
                i7 = this.originalCapturedViewLeft;
                z3 = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.t(i7, view.getTop())) {
                view.postOnAnimation(new SettleRunnable(view, z3));
            } else {
                if (!z3 || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(view);
            }
        }

        @Override // androidx.customview.widget.f
        public boolean tryCaptureView(View view, int i7) {
            int i10 = this.activePointerId;
            return (i10 == -1 || i10 == i7) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    };

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i7);
    }

    public class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        public SettleRunnable(View view, boolean z3) {
            this.view = view;
            this.dismiss = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            g gVar = SwipeDismissBehavior.this.viewDragHelper;
            if (gVar != null && gVar.h()) {
                this.view.postOnAnimation(this);
            } else {
                if (!this.dismiss || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    public static float clamp(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        g gVar;
        if (this.viewDragHelper == null) {
            if (this.sensitivitySet) {
                gVar = g.i(viewGroup, this.sensitivity, this.dragCallback);
            } else {
                gVar = new g(viewGroup.getContext(), viewGroup, this.dragCallback);
            }
            this.viewDragHelper = gVar;
        }
    }

    public static float fraction(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void updateAccessibilityActions(View view) {
        N.n(1048576, view);
        N.k(0, view);
        if (canSwipeDismissView(view)) {
            N.o(view, c.f36351m, null, new AccessibilityViewCommand() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean perform(@NonNull View view2, @Nullable h hVar) {
                    if (!SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        return false;
                    }
                    boolean z3 = view2.getLayoutDirection() == 1;
                    int i7 = SwipeDismissBehavior.this.swipeDirection;
                    int width = (!(i7 == 0 && z3) && (i7 != 1 || z3)) ? view2.getWidth() : -view2.getWidth();
                    WeakHashMap weakHashMap = N.f16168a;
                    view2.offsetLeftAndRight(width);
                    view2.setAlpha(0.0f);
                    OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(view2);
                    }
                    return true;
                }
            });
        }
    }

    public boolean canSwipeDismissView(@NonNull View view) {
        return true;
    }

    public int getDragState() {
        g gVar = this.viewDragHelper;
        if (gVar != null) {
            return gVar.f16391a;
        }
        return 0;
    }

    @Nullable
    @VisibleForTesting
    public OnDismissListener getListener() {
        return this.listener;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v3, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (zIsPointInChildBounds) {
            ensureViewDragHelper(coordinatorLayout);
            if (!this.requestingDisallowInterceptTouchEvent && this.viewDragHelper.u(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i7) {
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, v3, i7);
        if (v3.getImportantForAccessibility() == 0) {
            v3.setImportantForAccessibility(1);
            updateAccessibilityActions(v3);
        }
        return zOnLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        if (this.viewDragHelper == null) {
            return false;
        }
        if (this.requestingDisallowInterceptTouchEvent && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.viewDragHelper.n(motionEvent);
        return true;
    }

    public void setDragDismissDistance(float f10) {
        this.dragDismissThreshold = clamp(0.0f, f10, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f10) {
        this.alphaEndSwipeDistance = clamp(0.0f, f10, 1.0f);
    }

    public void setListener(@Nullable OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f10) {
        this.sensitivity = f10;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f10) {
        this.alphaStartSwipeDistance = clamp(0.0f, f10, 1.0f);
    }

    public void setSwipeDirection(int i7) {
        this.swipeDirection = i7;
    }

    public static int clamp(int i7, int i10, int i11) {
        return Math.min(Math.max(i7, i10), i11);
    }
}
