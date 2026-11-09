package androidx.camera.core.impl;

import E.AbstractC0198c;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface ImageOutputConfig extends ReadableConfig {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0971c f13899D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0971c f13900E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C0971c f13901F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final C0971c f13902G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C0971c f13903I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final C0971c f13904J;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0971c f13905u = new C0971c("camerax.core.imageOutput.targetAspectRatio", AbstractC0198c.class, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0971c f13906x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0971c f13907y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0971c f13908z;

    public interface Builder<B> {
        @NonNull
        B setCustomOrderedResolutions(@NonNull List<Size> list);

        @NonNull
        B setDefaultResolution(@NonNull Size size);

        @NonNull
        B setMaxResolution(@NonNull Size size);

        @NonNull
        B setMirrorMode(int i7);

        @NonNull
        B setResolutionSelector(@NonNull I.b bVar);

        @NonNull
        B setSupportedResolutions(@NonNull List<Pair<Integer, Size[]>> list);

        @NonNull
        B setTargetAspectRatio(int i7);

        @NonNull
        B setTargetResolution(@NonNull Size size);

        @NonNull
        B setTargetRotation(int i7);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OptionalRotationValue {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RotationDegreesValue {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RotationValue {
    }

    static {
        Class cls = Integer.TYPE;
        f13906x = new C0971c("camerax.core.imageOutput.targetRotation", cls, null);
        f13907y = new C0971c("camerax.core.imageOutput.appTargetRotation", cls, null);
        f13908z = new C0971c("camerax.core.imageOutput.mirrorMode", cls, null);
        f13899D = new C0971c("camerax.core.imageOutput.targetResolution", Size.class, null);
        f13900E = new C0971c("camerax.core.imageOutput.defaultResolution", Size.class, null);
        f13901F = new C0971c("camerax.core.imageOutput.maxResolution", Size.class, null);
        f13902G = new C0971c("camerax.core.imageOutput.supportedResolutions", List.class, null);
        f13903I = new C0971c("camerax.core.imageOutput.resolutionSelector", I.b.class, null);
        f13904J = new C0971c("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void validateConfig(@NonNull ImageOutputConfig imageOutputConfig) {
        boolean zHasTargetAspectRatio = imageOutputConfig.hasTargetAspectRatio();
        boolean z3 = imageOutputConfig.getTargetResolution(null) != null;
        if (zHasTargetAspectRatio && z3) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (imageOutputConfig.getResolutionSelector(null) != null) {
            if (zHasTargetAspectRatio || z3) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int getAppTargetRotation(int i7) {
        return ((Integer) retrieveOption(f13907y, Integer.valueOf(i7))).intValue();
    }

    @Nullable
    default List<Size> getCustomOrderedResolutions(@Nullable List<Size> list) {
        List list2 = (List) retrieveOption(f13904J, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    @Nullable
    default Size getDefaultResolution(@Nullable Size size) {
        return (Size) retrieveOption(f13900E, size);
    }

    @Nullable
    default Size getMaxResolution(@Nullable Size size) {
        return (Size) retrieveOption(f13901F, size);
    }

    default int getMirrorMode(int i7) {
        return ((Integer) retrieveOption(f13908z, Integer.valueOf(i7))).intValue();
    }

    @Nullable
    default I.b getResolutionSelector(@Nullable I.b bVar) {
        return (I.b) retrieveOption(f13903I, bVar);
    }

    @Nullable
    default List<Pair<Integer, Size[]>> getSupportedResolutions(@Nullable List<Pair<Integer, Size[]>> list) {
        return (List) retrieveOption(f13902G, list);
    }

    default int getTargetAspectRatio() {
        return ((Integer) retrieveOption(f13905u)).intValue();
    }

    @Nullable
    default Size getTargetResolution(@Nullable Size size) {
        return (Size) retrieveOption(f13899D, size);
    }

    default int getTargetRotation(int i7) {
        return ((Integer) retrieveOption(f13906x, Integer.valueOf(i7))).intValue();
    }

    default boolean hasTargetAspectRatio() {
        return containsOption(f13905u);
    }

    @NonNull
    default Size getDefaultResolution() {
        return (Size) retrieveOption(f13900E);
    }

    @NonNull
    default Size getMaxResolution() {
        return (Size) retrieveOption(f13901F);
    }

    @NonNull
    default I.b getResolutionSelector() {
        return (I.b) retrieveOption(f13903I);
    }

    @NonNull
    default List<Pair<Integer, Size[]>> getSupportedResolutions() {
        return (List) retrieveOption(f13902G);
    }

    @NonNull
    default Size getTargetResolution() {
        return (Size) retrieveOption(f13899D);
    }

    default int getTargetRotation() {
        return ((Integer) retrieveOption(f13906x)).intValue();
    }

    @NonNull
    default List<Size> getCustomOrderedResolutions() {
        List list = (List) retrieveOption(f13904J);
        Objects.requireNonNull(list);
        return new ArrayList(list);
    }
}
