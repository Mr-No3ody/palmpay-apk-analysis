package O3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LO3/a;", "", "", "senderAccountType", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "setSenderAccountType", "(Ljava/lang/Integer;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    @Nullable
    private Integer senderAccountType = 0;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getSenderAccountType() {
        return this.senderAccountType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.c(this.senderAccountType, ((a) obj).senderAccountType);
    }

    public final int hashCode() {
        Integer num = this.senderAccountType;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "FlexiBankCashierAddablePaymentMethodsBean(senderAccountType=" + this.senderAccountType + ")";
    }
}
