package com.google.android.material.motion;

import C0.G;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.camera.video.u;
import androidx.core.graphics.o;
import androidx.dynamicanimation.animation.k;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes2.dex */
public class MotionUtils {
    private static final String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    private static final String EASING_TYPE_FORMAT_END = ")";
    private static final String EASING_TYPE_FORMAT_START = "(";
    private static final String EASING_TYPE_PATH = "path";

    private MotionUtils() {
    }

    private static float getLegacyControlPoint(String[] strArr, int i7) {
        float f10 = Float.parseFloat(strArr[i7]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    private static String getLegacyEasingContent(String str, String str2) {
        return u.f(1, str2.length() + 1, str);
    }

    private static TimeInterpolator getLegacyThemeInterpolator(String str) {
        if (!isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER)) {
            if (isLegacyEasingType(str, EASING_TYPE_PATH)) {
                return new PathInterpolator(o.l(getLegacyEasingContent(str, EASING_TYPE_PATH)));
            }
            throw new IllegalArgumentException(G.o("Invalid motion easing type: ", str));
        }
        String[] strArrSplit = getLegacyEasingContent(str, EASING_TYPE_CUBIC_BEZIER).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(getLegacyControlPoint(strArrSplit, 0), getLegacyControlPoint(strArrSplit, 1), getLegacyControlPoint(strArrSplit, 2), getLegacyControlPoint(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    private static boolean isLegacyEasingAttribute(String str) {
        return isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER) || isLegacyEasingType(str, EASING_TYPE_PATH);
    }

    private static boolean isLegacyEasingType(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(EASING_TYPE_FORMAT_START);
        return str.startsWith(sb2.toString()) && str.endsWith(EASING_TYPE_FORMAT_END);
    }

    public static int resolveThemeDuration(@NonNull Context context, @AttrRes int i7, int i10) {
        return MaterialAttributes.resolveInteger(context, i7, i10);
    }

    @NonNull
    public static TimeInterpolator resolveThemeInterpolator(@NonNull Context context, @AttrRes int i7, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return isLegacyEasingAttribute(strValueOf) ? getLegacyThemeInterpolator(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    @NonNull
    public static k resolveThemeSpringForce(@NonNull Context context, @AttrRes int i7, @StyleRes int i10) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i7);
        TypedArray typedArrayObtainStyledAttributes = typedValueResolve == null ? context.obtainStyledAttributes(null, R.styleable.MaterialSpring, 0, i10) : context.obtainStyledAttributes(typedValueResolve.resourceId, R.styleable.MaterialSpring);
        k kVar = new k();
        try {
            float f10 = typedArrayObtainStyledAttributes.getFloat(R.styleable.MaterialSpring_stiffness, Float.MIN_VALUE);
            if (f10 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f11 = typedArrayObtainStyledAttributes.getFloat(R.styleable.MaterialSpring_damping, Float.MIN_VALUE);
            if (f11 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            kVar.b(f10);
            kVar.a(f11);
            typedArrayObtainStyledAttributes.recycle();
            return kVar;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
