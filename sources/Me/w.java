package Me;

import android.view.View;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.main.export.bean.PalmZoneTaskBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w implements OnItemClickListener, OnItemChildClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f6018a;

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j adapter, View view, int i7) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        A a3 = this.f6018a;
        a3.getClass();
        Object item = adapter.getItem(i7);
        if (item != null) {
            if (!(item instanceof PalmZoneTaskBean)) {
                item = null;
            }
            if (item != null) {
                a3.p((PalmZoneTaskBean) item);
            }
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j adapter, View view, int i7) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        A a3 = this.f6018a;
        a3.getClass();
        Object item = adapter.getItem(i7);
        if (item != null) {
            if (!(item instanceof PalmZoneTaskBean)) {
                item = null;
            }
            if (item != null) {
                a3.p((PalmZoneTaskBean) item);
            }
        }
    }
}
