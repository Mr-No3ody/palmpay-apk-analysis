package com.palmpay.init.annotation;

import com.facebook.react.modules.appstate.AppStateModule;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p371yf.a;
import p371yf.b;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE})
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0087\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010BF\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nR\u000f\u0010\u0005\u001a\u00020\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\fR\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u000eR\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u000eR\u000f\u0010\u0007\u001a\u00020\b¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000fR\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0006\u001a\u0004\b\t\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/palmpay/init/annotation/InitTask;", "", "name", "", "group", AppStateModule.APP_STATE_BACKGROUND, "", "priority", "", "process", "", "depends", "()Z", "()[Ljava/lang/String;", "()Ljava/lang/String;", "()I", "Companion", "init-annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {b.f44347a})
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(a.f44343c)
public @interface InitTask {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int PRIORITY_HIGH = -1000;
    public static final int PRIORITY_LOW = 1000;
    public static final int PRIORITY_MAX = Integer.MIN_VALUE;
    public static final int PRIORITY_MIN = Integer.MAX_VALUE;
    public static final int PRIORITY_NORM = 0;

    @NotNull
    public static final String PROCESS_ALL = "PROCESS_ALL";

    @NotNull
    public static final String PROCESS_MAIN = "PROCESS_MAIN";

    @NotNull
    public static final String PROCESS_NOT_MAIN = "PROCESS_NOT_MAIN";

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/palmpay/init/annotation/InitTask$Companion;", "", "()V", "PRIORITY_HIGH", "", "PRIORITY_LOW", "PRIORITY_MAX", "PRIORITY_MIN", "PRIORITY_NORM", "PROCESS_ALL", "", "PROCESS_MAIN", "PROCESS_NOT_MAIN", "init-annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int PRIORITY_HIGH = -1000;
        public static final int PRIORITY_LOW = 1000;
        public static final int PRIORITY_MAX = Integer.MIN_VALUE;
        public static final int PRIORITY_MIN = Integer.MAX_VALUE;
        public static final int PRIORITY_NORM = 0;

        @NotNull
        public static final String PROCESS_ALL = "PROCESS_ALL";

        @NotNull
        public static final String PROCESS_MAIN = "PROCESS_MAIN";

        @NotNull
        public static final String PROCESS_NOT_MAIN = "PROCESS_NOT_MAIN";

        private Companion() {
        }
    }

    boolean background() default false;

    String[] depends() default {};

    String group() default "default";

    String name();

    int priority() default 0;

    String[] process() default {"PROCESS_ALL"};
}
