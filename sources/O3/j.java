package O3;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"LO3/j;", "", "<init>", "()V", "", "LO3/j$a;", "detail", "Ljava/util/List;", "getDetail", "()Ljava/util/List;", "setDetail", "(Ljava/util/List;)V", "", "totalAmount", "J", "getTotalAmount", "()J", "setTotalAmount", "(J)V", "a", "b", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    @Nullable
    private List<a> detail;
    private long totalAmount;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"LO3/j$a;", "", "<init>", "()V", "", "fee", "J", "getFee", "()J", "setFee", "(J)V", "vat", "getVat", "setVat", "", "subTypeId", "Ljava/lang/String;", "getSubTypeId", "()Ljava/lang/String;", "setSubTypeId", "(Ljava/lang/String;)V", "subTypeName", "getSubTypeName", "setSubTypeName", "tariffName", "getTariffName", "setTariffName", "LO3/j$b;", "transferServiceFee", "LO3/j$b;", "getTransferServiceFee", "()LO3/j$b;", "setTransferServiceFee", "(LO3/j$b;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private long fee;

        @Nullable
        private String subTypeId;

        @Nullable
        private String subTypeName;

        @Nullable
        private String tariffName;

        @Nullable
        private b transferServiceFee;
        private long vat;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\"\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011¨\u0006%"}, d2 = {"LO3/j$b;", "", "<init>", "()V", "", "nextBillDate", "Ljava/lang/String;", "getNextBillDate", "()Ljava/lang/String;", "setNextBillDate", "(Ljava/lang/String;)V", "", "transferAmount", "J", "getTransferAmount", "()J", "setTransferAmount", "(J)V", "transferBorrowDays", "getTransferBorrowDays", "setTransferBorrowDays", "", "transferRatio", "D", "getTransferRatio", "()D", "setTransferRatio", "(D)V", "transferMinServiceFee", "getTransferMinServiceFee", "setTransferMinServiceFee", "transferServiceFee", "getTransferServiceFee", "setTransferServiceFee", "minAmount", "getMinAmount", "setMinAmount", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        private long minAmount;

        @Nullable
        private String nextBillDate;
        private long transferAmount;
        private long transferBorrowDays;
        private long transferMinServiceFee;
        private double transferRatio;
        private long transferServiceFee;
    }
}
