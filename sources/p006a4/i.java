package p006a4;

import W3.f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"La4/i;", "LW3/f;", "<init>", "()V", "La4/i$a;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "La4/i$a;", "e", "()La4/i$a;", "setData", "(La4/i$a;)V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends f {

    @Nullable
    private a data;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"La4/i$a;", "", "<init>", "()V", "", "startTime", "J", "getStartTime", "()J", "setStartTime", "(J)V", "endTime", "getEndTime", "setEndTime", "", "picUrl", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setPicUrl", "(Ljava/lang/String;)V", FirebaseAnalytics.Param.CONTENT, "a", "setContent", "tips", "c", "setTips", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Nullable
        private String content;
        private long endTime;

        @Nullable
        private String picUrl;
        private long startTime;

        @Nullable
        private String tips;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPicUrl() {
            return this.picUrl;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTips() {
            return this.tips;
        }
    }

    public i() {
        super(0);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getData() {
        return this.data;
    }
}
