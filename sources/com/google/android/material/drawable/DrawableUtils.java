package com.google.android.material.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import com.facebook.react.uimanager.b;
import com.transsnet.palmpay.core.config.BillBusinessType;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = -1;
    private static final int UNSPECIFIED_HEIGHT = -1;
    private static final int UNSPECIFIED_WIDTH = -1;

    public static class OutlineCompatL {
        private OutlineCompatL() {
        }

        @DoNotInline
        public static void setConvexPath(@NonNull Outline outline, @NonNull Path path) {
            outline.setConvexPath(path);
        }
    }

    @RequiresApi(BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS)
    public static class OutlineCompatR {
        private OutlineCompatR() {
        }

        @DoNotInline
        public static void setPath(@NonNull Outline outline, @NonNull Path path) {
            outline.setPath(path);
        }
    }

    private DrawableUtils() {
    }

    @Nullable
    public static Drawable compositeTwoLayeredDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        return compositeTwoLayeredDrawable(drawable, drawable2, -1, -1);
    }

    @Nullable
    public static Drawable createTintableDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    @Nullable
    public static Drawable createTintableMutatedDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    @NonNull
    public static int[] getCheckedState(@NonNull int[] iArr) {
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int i10 = iArr[i7];
            if (i10 == 16842912) {
                return iArr;
            }
            if (i10 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i7] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@Nullable Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !b.r(drawable)) {
            return null;
        }
        return b.f(drawable).getColorStateList();
    }

    private static int getTopLayerIntrinsicHeight(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    private static int getTopLayerIntrinsicWidth(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    @NonNull
    public static int[] getUncheckedState(@NonNull int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i7 = 0;
        for (int i10 : iArr) {
            if (i10 != 16842912) {
                iArr2[i7] = i10;
                i7++;
            }
        }
        return iArr2;
    }

    @NonNull
    public static AttributeSet parseDrawableXml(@NonNull Context context, @XmlRes int i7, @NonNull CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i7);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException e10) {
            e = e10;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i7));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e11) {
            e = e11;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i7));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    public static void setOutlineToPath(@NonNull Outline outline, @NonNull Path path) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            OutlineCompatR.setPath(outline, path);
            return;
        }
        if (i7 >= 29) {
            try {
                OutlineCompatL.setConvexPath(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            OutlineCompatL.setConvexPath(outline, path);
        }
    }

    public static void setRippleDrawableRadius(@Nullable RippleDrawable rippleDrawable, int i7) {
        rippleDrawable.setRadius(i7);
    }

    public static void setTint(@NonNull Drawable drawable, @ColorInt int i7) {
        if (i7 != 0) {
            drawable.setTint(i7);
        } else {
            drawable.setTintList(null);
        }
    }

    @Nullable
    public static PorterDuffColorFilter updateTintFilter(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    @Nullable
    public static Drawable compositeTwoLayeredDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Px int i7, @Px int i10) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i7 == -1) {
            i7 = getTopLayerIntrinsicWidth(drawable, drawable2);
        }
        if (i10 == -1) {
            i10 = getTopLayerIntrinsicHeight(drawable, drawable2);
        }
        if (i7 > drawable.getIntrinsicWidth() || i10 > drawable.getIntrinsicHeight()) {
            float f10 = i7 / i10;
            if (f10 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i10 = (int) (intrinsicWidth / f10);
                i7 = intrinsicWidth;
            } else {
                i10 = drawable.getIntrinsicHeight();
                i7 = (int) (f10 * i10);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i7, i10);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    @Nullable
    private static Drawable createTintableMutatedDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, boolean z3) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (z3) {
                drawable.mutate();
            }
            return drawable;
        }
        Drawable drawableMutate = drawable.mutate();
        if (mode != null) {
            drawableMutate.setTintMode(mode);
        }
        return drawableMutate;
    }
}
