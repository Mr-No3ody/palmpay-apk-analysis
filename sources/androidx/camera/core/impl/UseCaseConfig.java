package androidx.camera.core.impl;

import E.n0;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.internal.TargetConfig;

/* JADX INFO: loaded from: classes.dex */
public interface UseCaseConfig<T extends E.n0> extends TargetConfig<T>, ImageInputConfig {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final C0971c f13982K = new C0971c("camerax.core.useCase.defaultSessionConfig", H0.class, null);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final C0971c f13983N = new C0971c("camerax.core.useCase.defaultCaptureConfig", T.class, null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0971c f13984O = new C0971c("camerax.core.useCase.sessionConfigUnpacker", SessionConfig$OptionUnpacker.class, null);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final C0971c f13985P = new C0971c("camerax.core.useCase.captureConfigUnpacker", CaptureConfig$OptionUnpacker.class, null);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final C0971c f13986R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final C0971c f13987S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final C0971c f13988T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final C0971c f13989U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final C0971c f13990V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final C0971c f13991W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final C0971c f13992a0;

    public interface Builder<T extends E.n0, C extends UseCaseConfig<T>, B> extends TargetConfig.Builder<T, B>, ExtendableBuilder<T> {
        @NonNull
        C getUseCaseConfig();

        @NonNull
        B setCaptureOptionUnpacker(@NonNull CaptureConfig$OptionUnpacker captureConfig$OptionUnpacker);

        @NonNull
        B setCaptureType(@NonNull T0 t1);

        @NonNull
        B setDefaultCaptureConfig(@NonNull T t);

        @NonNull
        B setDefaultSessionConfig(@NonNull H0 h7);

        @NonNull
        B setHighResolutionDisabled(boolean z3);

        @NonNull
        B setSessionOptionUnpacker(@NonNull SessionConfig$OptionUnpacker sessionConfig$OptionUnpacker);

        @NonNull
        B setSurfaceOccupancyPriority(int i7);

        @NonNull
        B setZslDisabled(boolean z3);
    }

    static {
        Class cls = Integer.TYPE;
        f13986R = new C0971c("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        f13987S = new C0971c("camerax.core.useCase.targetFrameRate", Range.class, null);
        Class cls2 = Boolean.TYPE;
        f13988T = new C0971c("camerax.core.useCase.zslDisabled", cls2, null);
        f13989U = new C0971c("camerax.core.useCase.highResolutionDisabled", cls2, null);
        f13990V = new C0971c("camerax.core.useCase.captureType", T0.class, null);
        f13991W = new C0971c("camerax.core.useCase.previewStabilizationMode", cls, null);
        f13992a0 = new C0971c("camerax.core.useCase.videoStabilizationMode", cls, null);
    }

    @Nullable
    default CaptureConfig$OptionUnpacker getCaptureOptionUnpacker(@Nullable CaptureConfig$OptionUnpacker captureConfig$OptionUnpacker) {
        return (CaptureConfig$OptionUnpacker) retrieveOption(f13985P, captureConfig$OptionUnpacker);
    }

    @NonNull
    default T0 getCaptureType() {
        return (T0) retrieveOption(f13990V);
    }

    @Nullable
    default T getDefaultCaptureConfig(@Nullable T t) {
        return (T) retrieveOption(f13983N, t);
    }

    @Nullable
    default H0 getDefaultSessionConfig(@Nullable H0 h7) {
        return (H0) retrieveOption(f13982K, h7);
    }

    default int getPreviewStabilizationMode() {
        return ((Integer) retrieveOption(f13991W, 0)).intValue();
    }

    @Nullable
    default SessionConfig$OptionUnpacker getSessionOptionUnpacker(@Nullable SessionConfig$OptionUnpacker sessionConfig$OptionUnpacker) {
        return (SessionConfig$OptionUnpacker) retrieveOption(f13984O, sessionConfig$OptionUnpacker);
    }

    default int getSurfaceOccupancyPriority(int i7) {
        return ((Integer) retrieveOption(f13986R, Integer.valueOf(i7))).intValue();
    }

    @Nullable
    default Range<Integer> getTargetFrameRate(@Nullable Range<Integer> range) {
        return (Range) retrieveOption(f13987S, range);
    }

    default int getVideoStabilizationMode() {
        return ((Integer) retrieveOption(f13992a0, 0)).intValue();
    }

    default boolean isHighResolutionDisabled(boolean z3) {
        return ((Boolean) retrieveOption(f13989U, Boolean.valueOf(z3))).booleanValue();
    }

    default boolean isZslDisabled(boolean z3) {
        return ((Boolean) retrieveOption(f13988T, Boolean.valueOf(z3))).booleanValue();
    }

    @NonNull
    default CaptureConfig$OptionUnpacker getCaptureOptionUnpacker() {
        return (CaptureConfig$OptionUnpacker) retrieveOption(f13985P);
    }

    @NonNull
    default T getDefaultCaptureConfig() {
        return (T) retrieveOption(f13983N);
    }

    @NonNull
    default H0 getDefaultSessionConfig() {
        return (H0) retrieveOption(f13982K);
    }

    @NonNull
    default SessionConfig$OptionUnpacker getSessionOptionUnpacker() {
        return (SessionConfig$OptionUnpacker) retrieveOption(f13984O);
    }

    default int getSurfaceOccupancyPriority() {
        return ((Integer) retrieveOption(f13986R)).intValue();
    }

    @NonNull
    default Range<Integer> getTargetFrameRate() {
        return (Range) retrieveOption(f13987S);
    }
}
