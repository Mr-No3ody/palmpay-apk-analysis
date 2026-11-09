package mh;

import com.transsnet.mtn.sdk.ui.view.wheelview.widget.WheelView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements WheelView.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f39771b;

    public /* synthetic */ c(d dVar, int i7) {
        this.f39770a = i7;
        this.f39771b = dVar;
    }

    @Override // com.transsnet.mtn.sdk.ui.view.wheelview.widget.WheelView.f
    public final void a(int i7, Object obj) {
        String str = (String) obj;
        switch (this.f39770a) {
            case 0:
                d dVar = this.f39771b;
                dVar.getClass();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    String[] strArr = e.t;
                    if (i11 < strArr.length) {
                        if (strArr[i11].equals(str)) {
                            i10 = i11 + 1;
                        } else {
                            i11++;
                        }
                    }
                }
                dVar.f39773b = i10;
                dVar.a();
                break;
            case 1:
                d dVar2 = this.f39771b;
                dVar2.getClass();
                dVar2.f39774c = Integer.parseInt(str);
                break;
            default:
                d dVar3 = this.f39771b;
                dVar3.getClass();
                dVar3.f39772a = Integer.parseInt(str);
                dVar3.a();
                break;
        }
    }
}
