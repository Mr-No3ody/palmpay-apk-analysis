package okhttp3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class N {
    public /* synthetic */ N(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void appendQuotedString$okhttp(@NotNull StringBuilder sb2, @NotNull String key) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sb2.append('\"');
        int length = key.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = key.charAt(i7);
            if (cCharAt == '\n') {
                sb2.append("%0A");
            } else if (cCharAt == '\r') {
                sb2.append("%0D");
            } else if (cCharAt == '\"') {
                sb2.append("%22");
            } else {
                sb2.append(cCharAt);
            }
        }
        sb2.append('\"');
    }

    private N() {
    }
}
