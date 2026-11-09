package W3;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LW3/a;", "LW3/f;", "<init>", "()V", "LW3/a$a;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "LW3/a$a;", "getData", "()LW3/a$a;", "setData", "(LW3/a$a;)V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f {

    @Nullable
    private C0001a data;

    /* JADX INFO: renamed from: W3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0014R$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\nR$\u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\b\"\u0004\b#\u0010\n¨\u0006$"}, d2 = {"LW3/a$a;", "", "<init>", "()V", "", "accountId", "Ljava/lang/String;", "getAccountId", "()Ljava/lang/String;", "setAccountId", "(Ljava/lang/String;)V", "", "value", "availableBalance", "J", "getAvailableBalance", "()J", "frozenBalance", "getFrozenBalance", "setFrozenBalance", "(J)V", "reservedBalance", "getReservedBalance", "setReservedBalance", FirebaseAnalytics.Param.CURRENCY, "getCurrency", "setCurrency", "frozenAmountTips", "getFrozenAmountTips", "setFrozenAmountTips", "frozenAmountHighlightTips", "getFrozenAmountHighlightTips", "setFrozenAmountHighlightTips", "frozenAmountAndroidLink", "getFrozenAmountAndroidLink", "setFrozenAmountAndroidLink", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0001a {

        @Nullable
        private String accountId;
        private long availableBalance;

        @Nullable
        private String currency;

        @Nullable
        private String frozenAmountAndroidLink;

        @Nullable
        private String frozenAmountHighlightTips;

        @Nullable
        private String frozenAmountTips;
        private long frozenBalance;
        private long reservedBalance;
    }

    public a() {
        super(0);
    }
}
