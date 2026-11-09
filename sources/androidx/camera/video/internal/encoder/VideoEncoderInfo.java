package androidx.camera.video.internal.encoder;

import android.util.Range;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface VideoEncoderInfo extends EncoderInfo {
    boolean canSwapWidthHeight();

    int getHeightAlignment();

    @NonNull
    Range<Integer> getSupportedBitrateRange();

    @NonNull
    Range<Integer> getSupportedHeights();

    @NonNull
    Range<Integer> getSupportedHeightsFor(int i7);

    @NonNull
    Range<Integer> getSupportedWidths();

    @NonNull
    Range<Integer> getSupportedWidthsFor(int i7);

    int getWidthAlignment();

    boolean isSizeSupported(int i7, int i10);

    default boolean isSizeSupportedAllowSwapping(int i7, int i10) {
        if (isSizeSupported(i7, i10)) {
            return true;
        }
        return canSwapWidthHeight() && isSizeSupported(i10, i7);
    }
}
