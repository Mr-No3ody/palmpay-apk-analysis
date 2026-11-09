package A4;

import G4.i;
import com.alibaba.android.arouter.utils.Consts;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4.a f36d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f37e = new float[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f38f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f39g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f40h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f41i = 0.0f;

    public a() {
        this.f44c = i.b(10.0f);
        this.f42a = i.b(5.0f);
        this.f43b = i.b(5.0f);
        new ArrayList();
    }

    public final String a() {
        String formattedValue;
        String str = "";
        int i7 = 0;
        while (true) {
            float[] fArr = this.f37e;
            if (i7 >= fArr.length) {
                return str;
            }
            if (i7 < 0 || i7 >= fArr.length) {
                formattedValue = "";
            } else {
                C4.a aVar = this.f36d;
                if (aVar == null || aVar.f1155b != 0) {
                    C4.a aVar2 = new C4.a(0, false);
                    aVar2.f1155b = 0;
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i10 = 0; i10 < 0; i10++) {
                        if (i10 == 0) {
                            stringBuffer.append(Consts.DOT);
                        }
                        stringBuffer.append("0");
                    }
                    aVar2.f1156c = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
                    this.f36d = aVar2;
                }
                formattedValue = this.f36d.getFormattedValue(this.f37e[i7], this);
            }
            if (formattedValue != null && str.length() < formattedValue.length()) {
                str = formattedValue;
            }
            i7++;
        }
    }
}
