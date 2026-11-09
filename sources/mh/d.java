package mh;

import android.graphics.Color;
import com.transsnet.mtn.sdk.ui.view.wheelview.widget.WheelView;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f39775d;

    public d(e eVar) {
        this.f39775d = eVar;
        c(Calendar.getInstance());
    }

    public final void a() {
        e eVar = this.f39775d;
        b(eVar.f39778e);
        int i7 = this.f39772a;
        int i10 = this.f39773b;
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(1, i7);
        calendar.set(2, i10 - 1);
        int actualMaximum = calendar.getActualMaximum(5);
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        while (i11 <= actualMaximum) {
            StringBuilder sb2 = i11 < 10 ? new StringBuilder("0") : new StringBuilder("");
            sb2.append(i11);
            arrayList.add(sb2.toString());
            i11++;
        }
        eVar.f39778e.setWheelData(arrayList);
        int i12 = this.f39774c;
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                i13 = -1;
                break;
            } else if (Integer.parseInt((String) arrayList.get(i13)) == i12) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 < 0) {
            eVar.f39778e.setSelection(arrayList.size() - 1);
            this.f39774c = Integer.parseInt((String) arrayList.get(arrayList.size() - 1));
        } else {
            eVar.f39778e.setSelection(i13);
        }
        eVar.f39778e.setOnWheelItemSelectedListener(new c(this, 1));
    }

    public final void b(WheelView wheelView) {
        wheelView.setWheelAdapter(new b(this.f39775d));
        wheelView.setWheelSize(3);
        wheelView.setSkin(D8.c.f1696c);
        D8.d dVar = new D8.d();
        dVar.f1698a = 0;
        dVar.f1699b = Color.parseColor("#4D000000");
        dVar.f1700c = Color.parseColor("#FF000000");
        dVar.f1701d = 18;
        dVar.f1702e = 1.3f;
        wheelView.setStyle(dVar);
    }

    public final void c(Calendar calendar) {
        this.f39772a = calendar.get(1);
        this.f39773b = calendar.get(2) + 1;
        this.f39774c = calendar.get(5);
        e eVar = this.f39775d;
        b(eVar.f39780g);
        ArrayList arrayList = new ArrayList();
        int i7 = Calendar.getInstance().get(1);
        for (int i10 = 99; i10 >= -99; i10 += -1) {
            arrayList.add("" + (i7 - i10));
        }
        eVar.f39780g.setWheelData(arrayList);
        WheelView wheelView = eVar.f39780g;
        int i11 = this.f39772a;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                i13 = 0;
                break;
            } else if (Integer.parseInt((String) arrayList.get(i13)) == i11) {
                break;
            } else {
                i13++;
            }
        }
        wheelView.setSelection(i13);
        eVar.f39780g.setOnWheelItemSelectedListener(new c(this, 2));
        b(eVar.f39779f);
        ArrayList arrayListB = org.chromium.support_lib_boundary.util.b.b(eVar.f39784p);
        eVar.f39779f.setWheelData(arrayListB);
        WheelView wheelView2 = eVar.f39779f;
        String str = e.t[this.f39773b - 1];
        for (int i14 = 0; i14 < arrayListB.size(); i14++) {
            if (((String) arrayListB.get(i14)).equals(str)) {
                i12 = i14;
                break;
            }
        }
        wheelView2.setSelection(i12);
        eVar.f39779f.setOnWheelItemSelectedListener(new c(this, 0));
        a();
    }
}
