package W3;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LW3/c;", "T", "LW3/f;", "<init>", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c<T> extends f {

    @Nullable
    private T data;

    public c() {
        super(0);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Object getData() {
        return this.data;
    }
}
