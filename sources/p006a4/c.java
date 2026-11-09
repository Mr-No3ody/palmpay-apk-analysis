package p006a4;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR$\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR$\u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\n¨\u0006#"}, d2 = {"La4/c;", "", "<init>", "()V", "", "batchno", "Ljava/lang/String;", "getBatchno", "()Ljava/lang/String;", "setBatchno", "(Ljava/lang/String;)V", "merchtransactionreference", "getMerchtransactionreference", "setMerchtransactionreference", "orderinfo", "getOrderinfo", "setOrderinfo", "receiptno", "getReceiptno", "setReceiptno", "transactionno", "d", "setTransactionno", "responsetoken", "c", "setResponsetoken", "responsecode", "a", "setResponsecode", "responsemessage", "b", "setResponsemessage", "responsehtml", "getResponsehtml", "setResponsehtml", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Nullable
    private String batchno;

    @Nullable
    private String merchtransactionreference;

    @Nullable
    private String orderinfo;

    @Nullable
    private String receiptno;

    @Nullable
    private String responsecode;

    @Nullable
    private String responsehtml;

    @Nullable
    private String responsemessage;

    @Nullable
    private String responsetoken;

    @Nullable
    private String transactionno;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getResponsecode() {
        return this.responsecode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getResponsemessage() {
        return this.responsemessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getResponsetoken() {
        return this.responsetoken;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTransactionno() {
        return this.transactionno;
    }
}
