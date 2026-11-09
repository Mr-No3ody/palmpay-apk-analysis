package p319v5;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f43069b;

    public c(HashMap map) {
        this.f43068a = 0;
        this.f43069b = map;
    }

    public String toString() {
        switch (this.f43068a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                HashMap map = this.f43069b;
                if (!map.isEmpty()) {
                    for (String str : map.keySet()) {
                        sb2.append(str);
                        sb2.append("=");
                        sb2.append((String) map.get(str));
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    }
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public c() {
        this.f43068a = 1;
        this.f43069b = new HashMap();
    }
}
