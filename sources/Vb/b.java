package Vb;

import com.transsnet.palmpay.custom_view.model.ModelDatePick;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements WheelView.OnWheelItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelDatePick f10284b;

    public /* synthetic */ b(ModelDatePick modelDatePick, int i7) {
        this.f10283a = i7;
        this.f10284b = modelDatePick;
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.OnWheelItemSelectedListener
    public final void onItemSelected(int i7, Object obj) {
        ModelDatePick modelDatePick = this.f10284b;
        switch (this.f10283a) {
            case 0:
                ModelDatePick.d(modelDatePick, i7);
                break;
            case 1:
                int i10 = ModelDatePick.f31499A;
                modelDatePick.getClass();
                try {
                    i7 = Integer.parseInt((String) modelDatePick.f31502e.getItemAtPosition(i7));
                } catch (NumberFormatException e10) {
                    F6.d.c("ModelDatePick", "convertIndexToMonth: ", e10);
                }
                modelDatePick.f31508p = i7;
                modelDatePick.e();
                modelDatePick.f31504g.setText(modelDatePick.getDateString());
                break;
            default:
                int i11 = ModelDatePick.f31499A;
                modelDatePick.getClass();
                try {
                    i7 = Integer.parseInt((String) modelDatePick.f31503f.getItemAtPosition(i7));
                } catch (NumberFormatException e11) {
                    F6.d.c("ModelDatePick", "convertIndexToDay: ", e11);
                }
                modelDatePick.t = i7;
                modelDatePick.f31504g.setText(modelDatePick.getDateString());
                break;
        }
    }
}
