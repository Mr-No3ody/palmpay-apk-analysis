package com.google.android.material.carousel;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.video.u;
import com.google.android.material.animation.AnimationUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public final class KeylineState {
    private final int carouselSize;
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final List<Keyline> keylines;
    private final int lastFocalKeylineIndex;
    private int totalVisibleFocalItems;

    public static final class Builder {
        private static final int NO_INDEX = -1;
        private static final float UNKNOWN_LOC = Float.MIN_VALUE;
        private final int carouselSize;
        private final float itemSize;
        private Keyline tmpFirstFocalKeyline;
        private Keyline tmpLastFocalKeyline;
        private final List<Keyline> tmpKeylines = new ArrayList();
        private int firstFocalKeylineIndex = -1;
        private int lastFocalKeylineIndex = -1;
        private float lastKeylineMaskedSize = 0.0f;
        private int latestAnchorKeylineIndex = -1;

        public Builder(float f10, int i7) {
            this.itemSize = f10;
            this.carouselSize = i7;
        }

        private static float calculateKeylineLocationForItemPosition(float f10, float f11, int i7, int i10) {
            return (i10 * f11) + (f10 - (i7 * f11));
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addAnchorKeyline(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12) {
            return addKeyline(f10, f11, f12, false, true);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12, boolean z3) {
            return addKeyline(f10, f11, f12, z3, false);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeylineRange(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12, int i7) {
            return addKeylineRange(f10, f11, f12, i7, false);
        }

        @NonNull
        public KeylineState build() {
            if (this.tmpFirstFocalKeyline == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < this.tmpKeylines.size(); i7++) {
                Keyline keyline = this.tmpKeylines.get(i7);
                arrayList.add(new Keyline(calculateKeylineLocationForItemPosition(this.tmpFirstFocalKeyline.locOffset, this.itemSize, this.firstFocalKeylineIndex, i7), keyline.locOffset, keyline.mask, keyline.maskedItemSize, keyline.isAnchor, keyline.cutoff, keyline.leftOrTopPaddingShift, keyline.rightOrBottomPaddingShift));
            }
            return new KeylineState(this.itemSize, arrayList, this.firstFocalKeylineIndex, this.lastFocalKeylineIndex, this.carouselSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12) {
            return addKeyline(f10, f11, f12, false);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeylineRange(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12, int i7, boolean z3) {
            if (i7 > 0 && f12 > 0.0f) {
                for (int i10 = 0; i10 < i7; i10++) {
                    addKeyline((i10 * f12) + f10, f11, f12, z3);
                }
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12, boolean z3, boolean z8, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z8) {
                if (!z3) {
                    int i7 = this.latestAnchorKeylineIndex;
                    if (i7 != -1 && i7 != 0) {
                        throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                    }
                    this.latestAnchorKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
            }
            Keyline keyline = new Keyline(UNKNOWN_LOC, f10, f11, f12, z8, f13, f14, f15);
            if (z3) {
                if (this.tmpFirstFocalKeyline == null) {
                    this.tmpFirstFocalKeyline = keyline;
                    this.firstFocalKeylineIndex = this.tmpKeylines.size();
                }
                if (this.lastFocalKeylineIndex != -1 && this.tmpKeylines.size() - this.lastFocalKeylineIndex > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 == this.tmpFirstFocalKeyline.maskedItemSize) {
                    this.tmpLastFocalKeyline = keyline;
                    this.lastFocalKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else {
                if (this.tmpFirstFocalKeyline == null && keyline.maskedItemSize < this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.tmpLastFocalKeyline != null && keyline.maskedItemSize > this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.lastKeylineMaskedSize = keyline.maskedItemSize;
            this.tmpKeylines.add(keyline);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12, boolean z3, boolean z8, float f13) {
            return addKeyline(f10, f11, f12, z3, z8, f13, 0.0f, 0.0f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12, boolean z3, boolean z8) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            int i7 = this.carouselSize;
            if (f15 > i7) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, i7));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return addKeyline(f10, f11, f12, z3, z8, fAbs);
        }
    }

    public static final class Keyline {
        final float cutoff;
        final boolean isAnchor;
        final float leftOrTopPaddingShift;
        final float loc;
        final float locOffset;
        final float mask;
        final float maskedItemSize;
        final float rightOrBottomPaddingShift;

        public Keyline(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        public static Keyline lerp(Keyline keyline, Keyline keyline2, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
            return new Keyline(AnimationUtils.lerp(keyline.loc, keyline2.loc, f10), AnimationUtils.lerp(keyline.locOffset, keyline2.locOffset, f10), AnimationUtils.lerp(keyline.mask, keyline2.mask, f10), AnimationUtils.lerp(keyline.maskedItemSize, keyline2.maskedItemSize, f10));
        }

        public Keyline(float f10, float f11, float f12, float f13, boolean z3, float f14, float f15, float f16) {
            this.loc = f10;
            this.locOffset = f11;
            this.mask = f12;
            this.maskedItemSize = f13;
            this.isAnchor = z3;
            this.cutoff = f14;
            this.leftOrTopPaddingShift = f15;
            this.rightOrBottomPaddingShift = f16;
        }
    }

    public static KeylineState lerp(KeylineState keylineState, KeylineState keylineState2, float f10) {
        if (keylineState.getItemSize() != keylineState2.getItemSize()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<Keyline> keylines = keylineState.getKeylines();
        List<Keyline> keylines2 = keylineState2.getKeylines();
        if (keylines.size() != keylines2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < keylineState.getKeylines().size(); i7++) {
            arrayList.add(Keyline.lerp(keylines.get(i7), keylines2.get(i7), f10));
        }
        return new KeylineState(keylineState.getItemSize(), arrayList, AnimationUtils.lerp(keylineState.getFirstFocalKeylineIndex(), keylineState2.getFirstFocalKeylineIndex(), f10), AnimationUtils.lerp(keylineState.getLastFocalKeylineIndex(), keylineState2.getLastFocalKeylineIndex(), f10), keylineState.carouselSize);
    }

    public static KeylineState reverse(KeylineState keylineState, int i7) {
        Builder builder = new Builder(keylineState.getItemSize(), i7);
        float f10 = (i7 - keylineState.getLastKeyline().locOffset) - (keylineState.getLastKeyline().maskedItemSize / 2.0f);
        int size = keylineState.getKeylines().size() - 1;
        while (size >= 0) {
            Keyline keyline = keylineState.getKeylines().get(size);
            builder.addKeyline((keyline.maskedItemSize / 2.0f) + f10, keyline.mask, keyline.maskedItemSize, size >= keylineState.getFirstFocalKeylineIndex() && size <= keylineState.getLastFocalKeylineIndex(), keyline.isAnchor);
            f10 += keyline.maskedItemSize;
            size--;
        }
        return builder.build();
    }

    public int getCarouselSize() {
        return this.carouselSize;
    }

    public Keyline getFirstFocalKeyline() {
        return this.keylines.get(this.firstFocalKeylineIndex);
    }

    public int getFirstFocalKeylineIndex() {
        return this.firstFocalKeylineIndex;
    }

    public Keyline getFirstKeyline() {
        return this.keylines.get(0);
    }

    @Nullable
    public Keyline getFirstNonAnchorKeyline() {
        for (int i7 = 0; i7 < this.keylines.size(); i7++) {
            Keyline keyline = this.keylines.get(i7);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    public List<Keyline> getFocalKeylines() {
        return this.keylines.subList(this.firstFocalKeylineIndex, this.lastFocalKeylineIndex + 1);
    }

    public float getItemSize() {
        return this.itemSize;
    }

    public List<Keyline> getKeylines() {
        return this.keylines;
    }

    public Keyline getLastFocalKeyline() {
        return this.keylines.get(this.lastFocalKeylineIndex);
    }

    public int getLastFocalKeylineIndex() {
        return this.lastFocalKeylineIndex;
    }

    public Keyline getLastKeyline() {
        return (Keyline) u.e(1, this.keylines);
    }

    @Nullable
    public Keyline getLastNonAnchorKeyline() {
        for (int size = this.keylines.size() - 1; size >= 0; size--) {
            Keyline keyline = this.keylines.get(size);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    public int getNumberOfNonAnchorKeylines() {
        Iterator<Keyline> it = this.keylines.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (it.next().isAnchor) {
                i7++;
            }
        }
        return this.keylines.size() - i7;
    }

    public int getTotalVisibleFocalItems() {
        return this.totalVisibleFocalItems;
    }

    private KeylineState(float f10, List<Keyline> list, int i7, int i10, int i11) {
        this.itemSize = f10;
        this.keylines = Collections.unmodifiableList(list);
        this.firstFocalKeylineIndex = i7;
        this.lastFocalKeylineIndex = i10;
        while (i7 <= i10) {
            if (list.get(i7).cutoff == 0.0f) {
                this.totalVisibleFocalItems++;
            }
            i7++;
        }
        this.carouselSize = i11;
    }
}
