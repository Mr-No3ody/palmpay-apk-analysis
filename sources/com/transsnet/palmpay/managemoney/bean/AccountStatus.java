package com.transsnet.palmpay.managemoney.bean;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p371yf.a;

/* JADX INFO: loaded from: classes4.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/AccountStatus;", "", "Companion", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Retention(a.f44341a)
public @interface AccountStatus {
    public static final int ACTIVE = 1;
    public static final int CAPPED = 4;
    public static final int CLOSED = 5;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int FROZEN = 3;
    public static final int REGISTERED = 0;
    public static final int SUSPENDED = 2;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/AccountStatus$Companion;", "", "<init>", "()V", "REGISTERED", "", "ACTIVE", "SUSPENDED", "FROZEN", "CAPPED", "CLOSED", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ACTIVE = 1;
        public static final int CAPPED = 4;
        public static final int CLOSED = 5;
        public static final int FROZEN = 3;
        public static final int REGISTERED = 0;
        public static final int SUSPENDED = 2;

        private Companion() {
        }
    }
}
