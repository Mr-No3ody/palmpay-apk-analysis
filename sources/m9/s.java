package m9;

import Ab.y;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.view.View;
import androidx.camera.camera2.internal.V;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.airtime.ui.EditNameDialog;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpTaskListFragment;
import com.transsnet.palmpay.airtime.viewmodel.ScheduleTopUpViewModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.D;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements OnItemClickListener, OnItemChildClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpTaskListFragment f39584a;

    public /* synthetic */ s(ScheduleTopUpTaskListFragment scheduleTopUpTaskListFragment) {
        this.f39584a = scheduleTopUpTaskListFragment;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        if (r0.U0()) {
            return;
        }
        if (view.getId() == Pd.c.tvTagName || view.getId() == Pd.c.ivEdit) {
            ScheduleTopUpTaskListFragment scheduleTopUpTaskListFragment = this.f39584a;
            ScheduleTopUpTaskBean scheduleTopUpTaskBean = (ScheduleTopUpTaskBean) scheduleTopUpTaskListFragment.v().getItem(i7);
            Context contextRequireContext = scheduleTopUpTaskListFragment.requireContext();
            String phone = scheduleTopUpTaskBean.getPhone();
            if (phone == null) {
                phone = "";
            }
            EditNameDialog editNameDialog = new EditNameDialog(contextRequireContext, phone);
            editNameDialog.setResultCallback(new V(i7, scheduleTopUpTaskListFragment, scheduleTopUpTaskBean));
            editNameDialog.show();
            ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) scheduleTopUpTaskListFragment.f27333i;
            io.fastkv.n.B(scheduleTopUpTaskListFragment, scheduleTopUpViewModel != null ? scheduleTopUpViewModel.f26634B : null, scheduleTopUpTaskListFragment, new y(26), new D(6), false, null, 240);
            n0.g().l("Schedule_Top_Up_Airtime_Homepage_Edit_Tag");
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j adapter, View view, int i7) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        if (r0.U0()) {
            return;
        }
        n0.g().l("Schedule_Top_Up_Airtime_Homepage_Top_Up_Task");
        d0.g(1, "/airtime/airtime_schedule_topup_task_manager", "extra_data").withString("extra_data_1", ((ScheduleTopUpTaskBean) this.f39584a.v().getItem(i7)).getId()).navigation();
    }
}
