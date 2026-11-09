package W3;

import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R,\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LW3/e;", "T", "LW3/f;", "<init>", "()V", "LW3/e$a;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "LW3/e$a;", "getData", "()LW3/e$a;", "setData", "(LW3/e$a;)V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<T> extends f {

    @Nullable
    private a<T> data;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\"\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LW3/e$a;", "T", "", "<init>", "()V", "", "curPage", "I", "getCurPage", "()I", "setCurPage", "(I)V", "pageSize", "getPageSize", "setPageSize", "total", "getTotal", "setTotal", "totalPage", "getTotalPage", "setTotalPage", "", "list", "Ljava/util/List;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> {
        private int curPage;

        @Nullable
        private List<T> list;
        private int pageSize;
        private int total;
        private int totalPage;
    }

    public e() {
        super(0);
    }
}
