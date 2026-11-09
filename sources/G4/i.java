package G4;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import com.alibaba.android.arouter.utils.Consts;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static DisplayMetrics f3002a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f3003b = 50;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f3004c = 8000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Rect f3005d;

    static {
        Double.longBitsToDouble(1L);
        Float.intBitsToFloat(1);
        f3005d = new Rect();
        new Paint.FontMetrics();
        new Rect();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i7 = 0; i7 < 1; i7++) {
            if (i7 == 0) {
                stringBuffer.append(Consts.DOT);
            }
            stringBuffer.append("0");
        }
        new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
        new Rect();
        new Rect();
        new Paint.FontMetrics();
    }

    public static int a(Paint paint, String str) {
        Rect rect = f3005d;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static float b(float f10) {
        DisplayMetrics displayMetrics = f3002a;
        if (displayMetrics != null) {
            return f10 * displayMetrics.density;
        }
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
        return f10;
    }
}
