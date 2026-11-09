package Ua;

import com.transsnet.palmpay.core.viewmodel.ModelMonthPick;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import java.util.ArrayList;

/* JADX INFO: renamed from: Ua.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0618b0 implements WheelView.OnWheelItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9383a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModelMonthPick f9385c;

    public C0618b0(ModelMonthPick modelMonthPick, ArrayList arrayList) {
        this.f9385c = modelMonthPick;
        this.f9384b = arrayList;
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.OnWheelItemSelectedListener
    public final void onItemSelected(int i7, Object obj) {
        String string = obj.toString();
        ModelMonthPick modelMonthPick = this.f9385c;
        modelMonthPick.f28381p = string;
        String str = modelMonthPick.t;
        modelMonthPick.e();
        ArrayList arrayList = this.f9384b;
        int i10 = 0;
        if (i7 == 0) {
            modelMonthPick.f28378i.removeAll(arrayList);
        } else if (this.f9383a > 0) {
            return;
        } else {
            modelMonthPick.f28378i.addAll(0, arrayList);
        }
        for (int i11 = 0; i11 < modelMonthPick.f28378i.size(); i11++) {
            if (str.equals(modelMonthPick.f28378i.get(i11))) {
                i10 = i11;
                break;
            }
        }
        modelMonthPick.f28374d.setSelection(i10);
        modelMonthPick.f28374d.f();
        modelMonthPick.t = (String) modelMonthPick.f28374d.getSelectionItem();
        modelMonthPick.e();
        this.f9383a = i7;
    }
}
