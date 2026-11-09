package B7;

import android.content.Context;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreator;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements DefaultRefreshFooterCreator {
    @Override // com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreator
    @NonNull
    public RefreshFooter createRefreshFooter(@NonNull Context context, @NonNull RefreshLayout refreshLayout) {
        return new BallPulseFooter(context);
    }
}
