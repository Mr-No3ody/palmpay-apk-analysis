package com.google.android.material.transition.platform;

import C0.G;
import N8.q0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.o;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.horcrux.svg.d0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
class TransitionUtils {

    @AttrRes
    static final int NO_ATTR_RES_ID = 0;
    static final int NO_DURATION = -1;
    private static final int PATH_TYPE_ARC = 1;
    private static final int PATH_TYPE_LINEAR = 0;
    private static final RectF transformAlphaRectF = new RectF();

    public interface CornerSizeBinaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2);
    }

    private TransitionUtils() {
    }

    public static float calculateArea(@NonNull RectF rectF) {
        return rectF.height() * rectF.width();
    }

    public static ShapeAppearanceModel convertToRelativeCornerSizes(ShapeAppearanceModel shapeAppearanceModel, final RectF rectF) {
        return shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.transition.platform.a
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                return RelativeCornerSize.createFromCornerSize(rectF, cornerSize);
            }
        });
    }

    public static Shader createColorShader(@ColorInt int i7) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i7, i7, Shader.TileMode.CLAMP);
    }

    @NonNull
    public static <T> T defaultIfNull(@Nullable T t, @NonNull T t3) {
        return t != null ? t : t3;
    }

    public static View findAncestorById(View view, @IdRes int i7) {
        String resourceName = view.getResources().getResourceName(i7);
        while (view != null) {
            if (view.getId() != i7) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(q0.j(resourceName, " is not a valid ancestor"));
    }

    public static View findDescendantOrAncestorById(View view, @IdRes int i7) {
        View viewFindViewById = view.findViewById(i7);
        return viewFindViewById != null ? viewFindViewById : findAncestorById(view, i7);
    }

    public static RectF getLocationInWindow(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i7 = iArr[0];
        int i10 = iArr[1];
        return new RectF(i7, i10, view.getWidth() + i7, view.getHeight() + i10);
    }

    public static RectF getRelativeBounds(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static Rect getRelativeBoundsRect(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean isShapeAppearanceSignificant(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        return (shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) ? false : true;
    }

    public static float lerp(float f10, float f11, float f12) {
        return d0.e(f11, f10, f12, f10);
    }

    public static void maybeAddTransition(TransitionSet transitionSet, @Nullable Transition transition) {
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
    }

    public static boolean maybeApplyThemeDuration(Transition transition, Context context, @AttrRes int i7) {
        int iResolveThemeDuration;
        if (i7 == 0 || transition.getDuration() != -1 || (iResolveThemeDuration = MotionUtils.resolveThemeDuration(context, i7, -1)) == -1) {
            return false;
        }
        transition.setDuration(iResolveThemeDuration);
        return true;
    }

    public static boolean maybeApplyThemeInterpolator(Transition transition, Context context, @AttrRes int i7, TimeInterpolator timeInterpolator) {
        if (i7 == 0 || transition.getInterpolator() != null) {
            return false;
        }
        transition.setInterpolator(MotionUtils.resolveThemeInterpolator(context, i7, timeInterpolator));
        return true;
    }

    public static boolean maybeApplyThemePath(Transition transition, Context context, @AttrRes int i7) {
        PathMotion pathMotionResolveThemePath;
        if (i7 == 0 || (pathMotionResolveThemePath = resolveThemePath(context, i7)) == null) {
            return false;
        }
        transition.setPathMotion(pathMotionResolveThemePath);
        return true;
    }

    public static void maybeRemoveTransition(TransitionSet transitionSet, @Nullable Transition transition) {
        if (transition != null) {
            transitionSet.removeTransition(transition);
        }
    }

    @Nullable
    public static PathMotion resolveThemePath(Context context, @AttrRes int i7) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return null;
        }
        int i10 = typedValue.type;
        if (i10 != 16) {
            if (i10 == 3) {
                return new PatternPathMotion(o.l(String.valueOf(typedValue.string)));
            }
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
        int i11 = typedValue.data;
        if (i11 == 0) {
            return null;
        }
        if (i11 == 1) {
            return new MaterialArcMotion();
        }
        throw new IllegalArgumentException(G.m(i11, "Invalid motion path type: "));
    }

    private static int saveLayerAlphaCompat(Canvas canvas, Rect rect, int i7) {
        RectF rectF = transformAlphaRectF;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i7);
    }

    public static void transform(Canvas canvas, Rect rect, float f10, float f11, float f12, int i7, CanvasCompat.CanvasOperation canvasOperation) {
        if (i7 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        if (i7 < 255) {
            saveLayerAlphaCompat(canvas, rect, i7);
        }
        canvasOperation.run(canvas);
        canvas.restoreToCount(iSave);
    }

    public static ShapeAppearanceModel transformCornerSizes(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, CornerSizeBinaryOperator cornerSizeBinaryOperator) {
        return (isShapeAppearanceSignificant(shapeAppearanceModel, rectF) ? shapeAppearanceModel : shapeAppearanceModel2).toBuilder().setTopLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel2.getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel2.getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel2.getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomRightCornerSize(), shapeAppearanceModel2.getBottomRightCornerSize())).build();
    }

    public static float lerp(float f10, float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, @FloatRange(from = 0.0d, to = 1.0d) float f13, @FloatRange(from = 0.0d, to = 1.0d) float f14) {
        return lerp(f10, f11, f12, f13, f14, false);
    }

    public static float lerp(float f10, float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, @FloatRange(from = 0.0d, to = 1.0d) float f13, @FloatRange(from = 0.0d) float f14, boolean z3) {
        if (z3 && (f14 < 0.0f || f14 > 1.0f)) {
            return lerp(f10, f11, f14);
        }
        if (f14 < f12) {
            return f10;
        }
        return f14 > f13 ? f11 : lerp(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int lerp(int i7, int i10, @FloatRange(from = 0.0d, to = 1.0d) float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
        if (f12 < f10) {
            return i7;
        }
        return f12 > f11 ? i10 : (int) lerp(i7, i10, (f12 - f10) / (f11 - f10));
    }

    public static ShapeAppearanceModel lerp(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, final RectF rectF, final RectF rectF2, @FloatRange(from = 0.0d, to = 1.0d) final float f10, @FloatRange(from = 0.0d, to = 1.0d) final float f11, @FloatRange(from = 0.0d, to = 1.0d) final float f12) {
        if (f12 < f10) {
            return shapeAppearanceModel;
        }
        return f12 > f11 ? shapeAppearanceModel2 : transformCornerSizes(shapeAppearanceModel, shapeAppearanceModel2, rectF, new CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.platform.TransitionUtils.1
            @Override // com.google.android.material.transition.platform.TransitionUtils.CornerSizeBinaryOperator
            @NonNull
            public CornerSize apply(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2) {
                return new AbsoluteCornerSize(TransitionUtils.lerp(cornerSize.getCornerSize(rectF), cornerSize2.getCornerSize(rectF2), f10, f11, f12));
            }
        });
    }
}
