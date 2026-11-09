package O3;

import com.flexibank.sdk.cashier.bean.FlexiBankCashierCouponItem;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LO3/d;", "LW3/f;", "<init>", "()V", "LO3/d$a;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "LO3/d$a;", "e", "()LO3/d$a;", "setData", "(LO3/d$a;)V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends W3.f {

    @Nullable
    private a data;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LO3/d$a;", "", "<init>", "()V", "", "curPage", "Ljava/lang/Integer;", "getCurPage", "()Ljava/lang/Integer;", "setCurPage", "(Ljava/lang/Integer;)V", "pageSize", "getPageSize", "setPageSize", "total", "getTotal", "setTotal", "totalPage", "getTotalPage", "setTotalPage", "", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierCouponItem;", "list", "Ljava/util/List;", "a", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Nullable
        private List<FlexiBankCashierCouponItem> list;

        @Nullable
        private Integer curPage = 0;

        @Nullable
        private Integer pageSize = 0;

        @Nullable
        private Integer total = 0;

        @Nullable
        private Integer totalPage = 0;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getList() {
            return this.list;
        }
    }

    public d() {
        super(0);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getData() {
        return this.data;
    }
}
