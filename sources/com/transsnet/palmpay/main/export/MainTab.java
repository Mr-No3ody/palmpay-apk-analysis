package com.transsnet.palmpay.main.export;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0086\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/main/export/MainTab;", "", "<init>", "()V", "Companion", "a", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public @interface MainTab {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String FINANCE = "finance";

    @NotNull
    public static final String HOME = "home";

    @NotNull
    public static final String INVEST = "invest";

    @NotNull
    public static final String ME = "me";

    @NotNull
    public static final String PALMZONE = "palmzone";

    /* JADX INFO: renamed from: com.transsnet.palmpay.main.export.MainTab$a, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String FINANCE = "finance";

        @NotNull
        public static final String HOME = "home";

        @NotNull
        public static final String INVEST = "invest";

        @NotNull
        public static final String ME = "me";

        @NotNull
        public static final String PALMZONE = "palmzone";

        private Companion() {
        }
    }
}
