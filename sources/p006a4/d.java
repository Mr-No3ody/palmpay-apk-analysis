package p006a4;

import C0.G;
import W3.f;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La4/d;", "LW3/f;", "La4/d$a;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "La4/d$a;", "getData", "()La4/d$a;", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d extends f {

    @NotNull
    private final a data;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"La4/d$a;", "", "", "bankCode", "Ljava/lang/String;", "getBankCode", "()Ljava/lang/String;", "bankName", "getBankName", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a {

        @NotNull
        private final String bankCode;

        @NotNull
        private final String bankName;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.c(this.bankCode, aVar.bankCode) && Intrinsics.c(this.bankName, aVar.bankName);
        }

        public final int hashCode() {
            return this.bankName.hashCode() + (this.bankCode.hashCode() * 31);
        }

        public final String toString() {
            return G.q("Data(bankCode=", this.bankCode, ", bankName=", this.bankName, ")");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.c(this.data, ((d) obj).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    @Override // W3.f
    public final String toString() {
        return "FlexiBankCheckBankCardInfoRsp(data=" + this.data + ")";
    }
}
