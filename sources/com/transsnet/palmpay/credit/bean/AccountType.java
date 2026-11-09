package com.transsnet.palmpay.credit.bean;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p371yf.a;

/* JADX INFO: loaded from: classes4.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/AccountType;", "", "Companion", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Retention(a.f44341a)
public @interface AccountType {
    public static final int BUSINESS_LOAN = 14;
    public static final int CASH_LOAN = 7;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int FLEXI = 6;
    public static final int INSTALLMENT_LOAN = 9;
    public static final int MOBILE_INSTALLMENT = 11;
    public static final int PALMPAY_CARD = 13;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/AccountType$Companion;", "", "<init>", "()V", "FLEXI", "", "CASH_LOAN", "INSTALLMENT_LOAN", "MOBILE_INSTALLMENT", "PALMPAY_CARD", "BUSINESS_LOAN", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int BUSINESS_LOAN = 14;
        public static final int CASH_LOAN = 7;
        public static final int FLEXI = 6;
        public static final int INSTALLMENT_LOAN = 9;
        public static final int MOBILE_INSTALLMENT = 11;
        public static final int PALMPAY_CARD = 13;

        private Companion() {
        }
    }
}
