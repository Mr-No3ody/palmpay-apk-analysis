package F4;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BarChart f2573g;

    public b(BarChart barChart, p362y4.a aVar, G4.j jVar) {
        super(aVar, jVar);
        new RectF();
        new RectF();
        this.f2573g = barChart;
        Paint paint = new Paint(1);
        this.f2578e = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f2578e.setColor(Color.rgb(0, 0, 0));
        this.f2578e.setAlpha(KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP);
        new Paint(1).setStyle(style);
        new Paint(1).setStyle(Paint.Style.STROKE);
    }

    @Override // F4.g
    public void D() {
        this.f2573g.getBarData();
        throw null;
    }
}
