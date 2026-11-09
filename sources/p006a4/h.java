package p006a4;

import W3.f;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"La4/h;", "LW3/f;", "<init>", "()V", "La4/h$a;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "La4/h$a;", "getData", "()La4/h$a;", "setData", "(La4/h$a;)V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends f {

    @Nullable
    private a data;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010#\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R$\u0010&\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010\u0011R$\u0010)\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\r\u001a\u0004\b*\u0010\u000f\"\u0004\b+\u0010\u0011R,\u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\b\"\u0004\b5\u0010\n¨\u00066"}, d2 = {"La4/h$a;", "", "<init>", "()V", "", "okCardPreCreditAmount", "J", "getOkCardPreCreditAmount", "()J", "setOkCardPreCreditAmount", "(J)V", "", "okCardPreCreditDesc", "Ljava/lang/String;", "getOkCardPreCreditDesc", "()Ljava/lang/String;", "setOkCardPreCreditDesc", "(Ljava/lang/String;)V", "", "okCardPreCreditFlag", "Z", "getOkCardPreCreditFlag", "()Z", "setOkCardPreCreditFlag", "(Z)V", "", "okCardWhiteType", "I", "getOkCardWhiteType", "()I", "setOkCardWhiteType", "(I)V", "applyStatus", "getApplyStatus", "setApplyStatus", "targetWhiteFlag", "getTargetWhiteFlag", "setTargetWhiteFlag", "dueDate", "getDueDate", "setDueDate", "okcardTips", "getOkcardTips", "setOkcardTips", "", "okCardPreCreditTags", "Ljava/util/List;", "getOkCardPreCreditTags", "()Ljava/util/List;", "setOkCardPreCreditTags", "(Ljava/util/List;)V", "okCardPreCreditDiscountAmount", "getOkCardPreCreditDiscountAmount", "setOkCardPreCreditDiscountAmount", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private int applyStatus;

        @Nullable
        private String dueDate;
        private long okCardPreCreditAmount;

        @Nullable
        private String okCardPreCreditDesc;
        private long okCardPreCreditDiscountAmount;
        private boolean okCardPreCreditFlag;

        @Nullable
        private List<String> okCardPreCreditTags;
        private int okCardWhiteType;

        @Nullable
        private String okcardTips;
        private boolean targetWhiteFlag;
    }

    public h() {
        super(0);
    }
}
