package com.transsnet.palmpay.credit.bean;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p371yf.a;

/* JADX INFO: loaded from: classes4.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/ProductStatus;", "", "Companion", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Retention(a.f44341a)
public @interface ProductStatus {

    @NotNull
    public static final String ASSESSMENT = "assessment";

    @NotNull
    public static final String BORROWED = "borrowed";

    @NotNull
    public static final String CALCULATING = "calculating";

    @NotNull
    public static final String CAN_BORROW = "canBorrow";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String DECLINED = "declined";

    @NotNull
    public static final String DISABLE = "disable";

    @NotNull
    public static final String FROZEN = "frozen";

    @NotNull
    public static final String NEED_APPLY = "needApply";

    @NotNull
    public static final String OVERDUE = "overdue";

    @NotNull
    public static final String UNDER_REVIEW = "underReview";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/ProductStatus$Companion;", "", "<init>", "()V", "NEED_APPLY", "", "CAN_BORROW", "FROZEN", "BORROWED", "UNDER_REVIEW", "DECLINED", "ASSESSMENT", "CALCULATING", "DISABLE", "OVERDUE", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String ASSESSMENT = "assessment";

        @NotNull
        public static final String BORROWED = "borrowed";

        @NotNull
        public static final String CALCULATING = "calculating";

        @NotNull
        public static final String CAN_BORROW = "canBorrow";

        @NotNull
        public static final String DECLINED = "declined";

        @NotNull
        public static final String DISABLE = "disable";

        @NotNull
        public static final String FROZEN = "frozen";

        @NotNull
        public static final String NEED_APPLY = "needApply";

        @NotNull
        public static final String OVERDUE = "overdue";

        @NotNull
        public static final String UNDER_REVIEW = "underReview";

        private Companion() {
        }
    }
}
