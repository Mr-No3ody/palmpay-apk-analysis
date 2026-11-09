package com.google.android.material.internal;

import D.b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.q0;
import androidx.core.view.w0;
import com.google.android.material.drawable.DrawableUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class ViewUtils {
    public static final int EDGE_TO_EDGE_FLAGS = 768;

    public interface OnApplyWindowInsetsListener {
        q0 onApplyWindowInsets(View view, q0 q0Var, RelativePadding relativePadding);
    }

    private ViewUtils() {
    }

    public static void addOnGlobalLayoutListener(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @NonNull
    public static Rect calculateOffsetRectFromBounds(@NonNull View view, @NonNull View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i11 = i7 - iArr2[0];
        int i12 = i10 - iArr2[1];
        return new Rect(i11, i12, view2.getWidth() + i11, view2.getHeight() + i12);
    }

    @NonNull
    public static Rect calculateRectFromBounds(@NonNull View view) {
        return calculateRectFromBounds(view, 0);
    }

    public static void doOnApplyWindowInsets(@NonNull View view, @Nullable AttributeSet attributeSet, int i7, int i10) {
        doOnApplyWindowInsets(view, attributeSet, i7, i10, null);
    }

    public static float dpToPx(@NonNull Context context, @Dimension(unit = 0) int i7) {
        return TypedValue.applyDimension(1, i7, context.getResources().getDisplayMetrics());
    }

    @Nullable
    public static Integer getBackgroundColor(@NonNull View view) {
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(view.getBackground());
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    @NonNull
    public static List<View> getChildren(@Nullable View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                arrayList.add(viewGroup.getChildAt(i7));
            }
        }
        return arrayList;
    }

    @Nullable
    public static ViewGroup getContentView(@Nullable View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @Nullable
    @Deprecated
    public static ViewOverlayImpl getContentViewOverlay(@NonNull View view) {
        return getOverlay(getContentView(view));
    }

    @Nullable
    private static InputMethodManager getInputMethodManager(@NonNull View view) {
        return (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
    }

    @Nullable
    @Deprecated
    public static ViewOverlayImpl getOverlay(@Nullable final View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayImpl() { // from class: com.google.android.material.internal.ViewUtils.4
            @Override // com.google.android.material.internal.ViewOverlayImpl
            public void add(@NonNull Drawable drawable) {
                view.getOverlay().add(drawable);
            }

            @Override // com.google.android.material.internal.ViewOverlayImpl
            public void remove(@NonNull Drawable drawable) {
                view.getOverlay().remove(drawable);
            }
        };
    }

    public static float getParentAbsoluteElevation(@NonNull View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        return elevation;
    }

    public static void hideKeyboard(@NonNull View view) {
        hideKeyboard(view, true);
    }

    public static boolean isLayoutRtl(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode parseTintMode(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void removeOnGlobalLayoutListener(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void requestApplyInsetsWhenAttached(@NonNull View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.3
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NonNull View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    view2.requestApplyInsets();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    public static void requestFocusAndShowKeyboard(@NonNull View view) {
        requestFocusAndShowKeyboard(view, true);
    }

    public static void setBoundsFromRect(@NonNull View view, @NonNull Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    public static void showKeyboard(@NonNull View view) {
        showKeyboard(view, true);
    }

    @NonNull
    public static Rect calculateRectFromBounds(@NonNull View view, int i7) {
        return new Rect(view.getLeft(), view.getTop() + i7, view.getRight(), view.getBottom() + i7);
    }

    public static void doOnApplyWindowInsets(@NonNull View view, @Nullable AttributeSet attributeSet, int i7, int i10, @Nullable final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.Insets, i7, i10);
        final boolean z3 = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        final boolean z8 = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        final boolean z10 = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            public q0 onApplyWindowInsets(View view2, @NonNull q0 q0Var, @NonNull RelativePadding relativePadding) {
                if (z3) {
                    relativePadding.bottom = q0Var.a() + relativePadding.bottom;
                }
                boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view2);
                if (z8) {
                    if (zIsLayoutRtl) {
                        relativePadding.end = q0Var.b() + relativePadding.end;
                    } else {
                        relativePadding.start = q0Var.b() + relativePadding.start;
                    }
                }
                if (z10) {
                    if (zIsLayoutRtl) {
                        relativePadding.start = q0Var.c() + relativePadding.start;
                    } else {
                        relativePadding.end = q0Var.c() + relativePadding.end;
                    }
                }
                relativePadding.applyToView(view2);
                OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                return onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, q0Var, relativePadding) : q0Var;
            }
        });
    }

    public static void hideKeyboard(@NonNull View view, boolean z3) {
        w0 w0VarI;
        if (z3 && (w0VarI = N.i(view)) != null) {
            w0VarI.f16298a.G(8);
            return;
        }
        InputMethodManager inputMethodManager = getInputMethodManager(view);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void removeOnGlobalLayoutListener(@NonNull ViewTreeObserver viewTreeObserver, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void requestFocusAndShowKeyboard(@NonNull View view, boolean z3) {
        view.requestFocus();
        view.post(new b(view, z3, 14));
    }

    public static void showKeyboard(@NonNull View view, boolean z3) {
        w0 w0VarI;
        if (!z3 || (w0VarI = N.i(view)) == null) {
            getInputMethodManager(view).showSoftInput(view, 1);
        } else {
            w0VarI.f16298a.k0(8);
        }
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;

        /* JADX INFO: renamed from: top, reason: collision with root package name */
        public int f22536top;

        public RelativePadding(int i7, int i10, int i11, int i12) {
            this.start = i7;
            this.f22536top = i10;
            this.end = i11;
            this.bottom = i12;
        }

        public void applyToView(View view) {
            view.setPaddingRelative(this.start, this.f22536top, this.end, this.bottom);
        }

        public RelativePadding(@NonNull RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.f22536top = relativePadding.f22536top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }
    }

    public static void doOnApplyWindowInsets(@NonNull View view, @NonNull final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        final RelativePadding relativePadding = new RelativePadding(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        androidx.core.view.OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public q0 onApplyWindowInsets(View view2, q0 q0Var) {
                return onApplyWindowInsetsListener.onApplyWindowInsets(view2, q0Var, new RelativePadding(relativePadding));
            }
        };
        WeakHashMap weakHashMap = N.f16168a;
        E.n(view, onApplyWindowInsetsListener2);
        requestApplyInsetsWhenAttached(view);
    }
}
