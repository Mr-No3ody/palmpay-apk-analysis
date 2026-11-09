package com.facebook.react.fabric.mounting;

import H3.j;
import android.view.View;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/facebook/react/fabric/mounting/LayoutMetricsConversions;", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface LayoutMetricsConversions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/fabric/mounting/LayoutMetricsConversions$Companion;", "", "<init>", "()V", "", "viewMeasureSpec", "", "getMinSize", "(I)F", "getMaxSize", "minSize", "maxSize", "getYogaSize", "(FF)F", "LH3/j;", "getYogaMeasureMode", "(FF)LH3/j;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @JvmStatic
        public final float getMaxSize(int viewMeasureSpec) {
            int mode = View.MeasureSpec.getMode(viewMeasureSpec);
            int size = View.MeasureSpec.getSize(viewMeasureSpec);
            if (mode == 0) {
                return Float.POSITIVE_INFINITY;
            }
            return size;
        }

        @JvmStatic
        public final float getMinSize(int viewMeasureSpec) {
            int mode = View.MeasureSpec.getMode(viewMeasureSpec);
            int size = View.MeasureSpec.getSize(viewMeasureSpec);
            if (mode == 1073741824) {
                return size;
            }
            return 0.0f;
        }

        @JvmStatic
        @NotNull
        public final j getYogaMeasureMode(float minSize, float maxSize) {
            if (minSize == maxSize) {
                return j.f3659b;
            }
            return Float.isInfinite(maxSize) ? j.f3658a : j.f3660c;
        }

        @JvmStatic
        public final float getYogaSize(float minSize, float maxSize) {
            if (minSize == maxSize) {
                return PixelUtil.INSTANCE.dpToPx(maxSize);
            }
            if (Float.isInfinite(maxSize)) {
                return Float.POSITIVE_INFINITY;
            }
            return PixelUtil.INSTANCE.dpToPx(maxSize);
        }
    }

    @JvmStatic
    static float getMaxSize(int i7) {
        return INSTANCE.getMaxSize(i7);
    }

    @JvmStatic
    static float getMinSize(int i7) {
        return INSTANCE.getMinSize(i7);
    }

    @JvmStatic
    @NotNull
    static j getYogaMeasureMode(float f10, float f11) {
        return INSTANCE.getYogaMeasureMode(f10, f11);
    }

    @JvmStatic
    static float getYogaSize(float f10, float f11) {
        return INSTANCE.getYogaSize(f10, f11);
    }
}
