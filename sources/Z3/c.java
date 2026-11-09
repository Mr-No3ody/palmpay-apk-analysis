package Z3;

import C0.G;
import com.flexibank.sdk.base.FlexiBankSingleLiveData$Params;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"LZ3/c;", "Lcom/flexibank/sdk/base/FlexiBankSingleLiveData$Params;", "", "verifyType", "I", "getVerifyType", "()I", "", "bankCardNo", "Ljava/lang/String;", "getBankCardNo", "()Ljava/lang/String;", "bankCode", "getBankCode", "checkType", "getCheckType", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c implements FlexiBankSingleLiveData$Params {

    @NotNull
    private final String bankCardNo;

    @Nullable
    private final String bankCode;

    @NotNull
    private final String checkType;
    private final int verifyType;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"LZ3/c$a;", "", "<init>", "()V", "", "BANK_CARD", "Ljava/lang/String;", "BANK_ACCOUNT", "", "OTP_VERIFY", "I", "NEXT_VERIFY", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.verifyType == cVar.verifyType && Intrinsics.c(this.bankCardNo, cVar.bankCardNo) && Intrinsics.c(this.bankCode, cVar.bankCode) && Intrinsics.c(this.checkType, cVar.checkType);
    }

    public final int hashCode() {
        int iC = G.c(Integer.hashCode(this.verifyType) * 31, 31, this.bankCardNo);
        String str = this.bankCode;
        return this.checkType.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        int i7 = this.verifyType;
        String str = this.bankCardNo;
        String str2 = this.bankCode;
        String str3 = this.checkType;
        StringBuilder sb2 = new StringBuilder("FlexiBankCheckBankCardInfoReq(verifyType=");
        sb2.append(i7);
        sb2.append(", bankCardNo=");
        sb2.append(str);
        sb2.append(", bankCode=");
        return G.s(sb2, str2, ", checkType=", str3, ")");
    }
}
