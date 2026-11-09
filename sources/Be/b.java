package Be;

import M1.j;
import android.view.View;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.ui.dialog.reward.PalmZoneTaskListDialog;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements OnItemClickListener, OnItemChildClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PalmZoneTaskListDialog f903a;

    public /* synthetic */ b(PalmZoneTaskListDialog palmZoneTaskListDialog) {
        this.f903a = palmZoneTaskListDialog;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(j jVar, View view, int i7) {
        PalmZoneTaskListDialog.initViews$lambda$6(this.f903a, jVar, view, i7);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        PalmZoneTaskListDialog.initViews$lambda$3(this.f903a, jVar, view, i7);
    }
}
