package B7;

import android.content.Context;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreator;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.header.BezierRadarHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements DefaultRefreshHeaderCreator {
    @Override // com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreator
    @NonNull
    public RefreshHeader createRefreshHeader(@NonNull Context context, @NonNull RefreshLayout refreshLayout) {
        return new BezierRadarHeader(context);
    }
}
