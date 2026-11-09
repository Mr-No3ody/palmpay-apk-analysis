package T;

import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.common.base.Ascii;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends androidx.constraintlayout.core.motion.utils.a {
    public f() {
        this.f15123c = new ArrayList();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static f d(String str) {
        int i7 = 9;
        int i10 = 8;
        int i11 = 7;
        int i12 = 6;
        int i13 = 5;
        int i14 = 4;
        int i15 = 3;
        int i16 = 2;
        int i17 = 1;
        int i18 = 0;
        if (str.startsWith("CUSTOM")) {
            c cVar = new c();
            cVar.f8914d = new float[1];
            return cVar;
        }
        byte b7 = -1;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    b7 = 0;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b7 = 1;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b7 = 2;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b7 = 3;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b7 = 4;
                }
                break;
            case -1001078227:
                if (str.equals(ReactProgressBarViewManager.PROP_PROGRESS)) {
                    b7 = 5;
                }
                break;
            case -908189618:
                if (str.equals(ViewProps.SCALE_X)) {
                    b7 = 6;
                }
                break;
            case -908189617:
                if (str.equals(ViewProps.SCALE_Y)) {
                    b7 = 7;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    b7 = 8;
                }
                break;
            case -40300674:
                if (str.equals(ViewProps.ROTATION)) {
                    b7 = 9;
                }
                break;
            case -4379043:
                if (str.equals(ViewProps.ELEVATION)) {
                    b7 = 10;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b7 = Ascii.VT;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b7 = Ascii.FF;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b7 = Ascii.CR;
                }
                break;
        }
        switch (b7) {
            case 0:
                return new b(i15);
            case 1:
                return new b(i14);
            case 2:
                return new b(i11);
            case 3:
                return new b(i10);
            case 4:
                return new b(i7);
            case 5:
                e eVar = new e();
                eVar.f8915d = false;
                return eVar;
            case 6:
                return new b(i13);
            case 7:
                return new b(i12);
            case 8:
                return new b(i18);
            case 9:
                return new b(i16);
            case 10:
                return new b(i17);
            case 11:
                return new d();
            case 12:
                return new b(i18);
            case 13:
                return new b(i18);
            default:
                return null;
        }
    }

    public abstract void e(View view, float f10);
}
