package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public interface CameraConfig extends ReadableConfig {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0971c f13847h = new C0971c("camerax.core.camera.useCaseConfigFactory", UseCaseConfigFactory.class, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0971c f13848k = new C0971c("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0971c f13849l = new C0971c("camerax.core.camera.SessionProcessor", SessionProcessor.class, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0971c f13850m = new C0971c("camerax.core.camera.isPostviewSupported", Boolean.class, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0971c f13851n = new C0971c("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class, null);

    public interface Builder<B> {
        B setCaptureProcessProgressSupported(boolean z3);

        @NonNull
        B setCompatibilityId(@NonNull AbstractC0978f0 abstractC0978f0);

        B setPostviewSupported(boolean z3);

        @NonNull
        B setSessionProcessor(@NonNull SessionProcessor sessionProcessor);

        @NonNull
        B setUseCaseCombinationRequiredRule(int i7);

        @NonNull
        B setUseCaseConfigFactory(@NonNull UseCaseConfigFactory useCaseConfigFactory);

        @NonNull
        B setZslDisabled(boolean z3);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RequiredRule {
    }

    @NonNull
    AbstractC0978f0 getCompatibilityId();

    @Nullable
    default SessionProcessor getSessionProcessor(@Nullable SessionProcessor sessionProcessor) {
        return (SessionProcessor) retrieveOption(f13849l, sessionProcessor);
    }

    default int getUseCaseCombinationRequiredRule() {
        return ((Integer) retrieveOption(f13848k, 0)).intValue();
    }

    @NonNull
    default UseCaseConfigFactory getUseCaseConfigFactory() {
        return (UseCaseConfigFactory) retrieveOption(f13847h, UseCaseConfigFactory.f13993a);
    }

    default boolean isCaptureProcessProgressSupported() {
        return ((Boolean) retrieveOption(f13851n, Boolean.FALSE)).booleanValue();
    }

    default boolean isPostviewSupported() {
        return ((Boolean) retrieveOption(f13850m, Boolean.FALSE)).booleanValue();
    }

    @NonNull
    default SessionProcessor getSessionProcessor() {
        return (SessionProcessor) retrieveOption(f13849l);
    }
}
