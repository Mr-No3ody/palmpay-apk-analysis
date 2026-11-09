package Me;

import Pa.n0;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.main.export.bean.PalmZoneTaskBean;
import com.transsnet.palmpay.ui.dialog.reward.PalmZoneTaskListDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements PalmZoneTaskListDialog.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f6020a;

    public z(A a3) {
        this.f6020a = a3;
    }

    @Override // com.transsnet.palmpay.ui.dialog.reward.PalmZoneTaskListDialog.Callback
    public final void onItemViewOnClick(View view, PalmZoneTaskBean palmZoneTaskBean, RecyclerView.ViewHolder viewHolder) {
        n0.g().m(z.class.getSimpleName().concat("_element_click"), palmZoneTaskBean != null ? palmZoneTaskBean.taskName : null, "");
        this.f6020a.p(palmZoneTaskBean);
    }
}
