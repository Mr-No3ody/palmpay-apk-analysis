package p170l9;

import M1.j;
import android.view.View;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.airtime.ui.dialog.WeekAndDaySelectDialog;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements WheelView.OnWheelItemSelectedListener, OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeekAndDaySelectDialog f39291a;

    public /* synthetic */ d(WeekAndDaySelectDialog weekAndDaySelectDialog) {
        this.f39291a = weekAndDaySelectDialog;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        WeekAndDaySelectDialog.initViews$lambda$8(this.f39291a, jVar, view, i7);
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.OnWheelItemSelectedListener
    public void onItemSelected(int i7, Object obj) {
        WeekAndDaySelectDialog.initViews$lambda$3(this.f39291a, i7, (String) obj);
    }
}
