package com.transsnet.palmpay.cash_in.bean.request;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import p371yf.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/cash_in/bean/request/GetFundConfigReq;", "", "pageSource", "", "<init>", "(I)V", "PageSource", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetFundConfigReq {

    @JvmField
    public final int pageSource;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/transsnet/palmpay/cash_in/bean/request/GetFundConfigReq$PageSource;", "", "Companion", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(a.f44341a)
    public @interface PageSource {
        public static final int CASH_DEPOSIT = 12;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int TOPUP_CARD_ACCOUNT = 13;
        public static final int USSD = 14;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/cash_in/bean/request/GetFundConfigReq$PageSource$Companion;", "", "<init>", "()V", "CASH_DEPOSIT", "", "TOPUP_CARD_ACCOUNT", "USSD", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int CASH_DEPOSIT = 12;
            public static final int TOPUP_CARD_ACCOUNT = 13;
            public static final int USSD = 14;

            private Companion() {
            }
        }
    }

    public GetFundConfigReq(int i7) {
        this.pageSource = i7;
    }
}
