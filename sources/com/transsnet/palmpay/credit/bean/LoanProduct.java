package com.transsnet.palmpay.credit.bean;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p371yf.a;

/* JADX INFO: loaded from: classes4.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/LoanProduct;", "", "Companion", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Retention(a.f44341a)
public @interface LoanProduct {

    @NotNull
    public static final String AGENT_LOAN = "AGENT_LOAN";

    @NotNull
    public static final String CASH_INSTALLMENT_RAISE_AMOUNT = "CASH_INSTALLMENT_RAISE_AMOUNT";

    @NotNull
    public static final String CASH_INSTANT_LOAN = "CASH_INSTANT_LOAN";

    @NotNull
    public static final String CASH_LOAN = "CASH_LOAN";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HIRE_PURCHASE = "HIRE_PURCHASE";

    @NotNull
    public static final String INSTALLMENT_LOAN = "INSTALLMENT_LOAN";

    @NotNull
    public static final String INSTALLMENT_RAISE_AMOUNT = "INSTALLMENT_RAISE_AMOUNT";

    @NotNull
    public static final String LOAN_WITHDRAW = "LOAN_WITHDRAW";

    @NotNull
    public static final String OK_CARD = "OK_CARD";

    @NotNull
    public static final String PALMPAY_BUSINESS_LOAN = "PALMPAY_BUSINESS_LOAN";

    @NotNull
    public static final String PALMPAY_CARD = "PALMPAY_CARD";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/LoanProduct$Companion;", "", "<init>", "()V", "OK_CARD", "", "CASH_LOAN", "AGENT_LOAN", "INSTALLMENT_RAISE_AMOUNT", "CASH_INSTALLMENT_RAISE_AMOUNT", "CASH_INSTANT_LOAN", "LOAN_WITHDRAW", "INSTALLMENT_LOAN", "PALMPAY_CARD", "PALMPAY_BUSINESS_LOAN", "HIRE_PURCHASE", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String AGENT_LOAN = "AGENT_LOAN";

        @NotNull
        public static final String CASH_INSTALLMENT_RAISE_AMOUNT = "CASH_INSTALLMENT_RAISE_AMOUNT";

        @NotNull
        public static final String CASH_INSTANT_LOAN = "CASH_INSTANT_LOAN";

        @NotNull
        public static final String CASH_LOAN = "CASH_LOAN";

        @NotNull
        public static final String HIRE_PURCHASE = "HIRE_PURCHASE";

        @NotNull
        public static final String INSTALLMENT_LOAN = "INSTALLMENT_LOAN";

        @NotNull
        public static final String INSTALLMENT_RAISE_AMOUNT = "INSTALLMENT_RAISE_AMOUNT";

        @NotNull
        public static final String LOAN_WITHDRAW = "LOAN_WITHDRAW";

        @NotNull
        public static final String OK_CARD = "OK_CARD";

        @NotNull
        public static final String PALMPAY_BUSINESS_LOAN = "PALMPAY_BUSINESS_LOAN";

        @NotNull
        public static final String PALMPAY_CARD = "PALMPAY_CARD";

        private Companion() {
        }
    }
}
