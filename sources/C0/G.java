package C0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.util.statistic.BaseTrackEvent;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class G {
    public static String A() {
        return BaseApplication.get().getUser().getPhoneNumber();
    }

    public static /* synthetic */ boolean a(int i7) {
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            return false;
        }
        if (i7 == 4 || i7 == 5) {
            return true;
        }
        throw null;
    }

    public static int b(int i7, float f10) {
        return Nf.b.b(TypedValue.applyDimension(i7, f10, Resources.getSystem().getDisplayMetrics()));
    }

    public static int c(int i7, int i10, String str) {
        return (str.hashCode() + i7) * i10;
    }

    public static ValueAnimator d(long j6, float[] fArr, int i7) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setDuration(j6);
        valueAnimatorOfFloat.setRepeatCount(i7);
        return valueAnimatorOfFloat;
    }

    public static Intent e(Context context, String str, Context context2, Class cls) {
        Intrinsics.checkNotNullParameter(context, str);
        return new Intent(context2, (Class<?>) cls);
    }

    public static BaseTrackEvent f(String str, String str2, String str3) {
        return new ClickEvent(str).add(str2, str3);
    }

    public static BaseTrackEvent g(String str, boolean z3) {
        return new ViewEvent(str).afEvt(z3);
    }

    public static IApiCreditService h(p221ob.a aVar) {
        aVar.getInstance().getClass();
        return p221ob.c.a();
    }

    public static SpanUtils i(String str) {
        return new SpanUtils().append(str);
    }

    public static Integer j(HashMap map, Integer num, String str, int i7, String str2) {
        map.put(num, str);
        Integer numValueOf = Integer.valueOf(i7);
        map.put(numValueOf, str2);
        return numValueOf;
    }

    public static String k() {
        return BaseApplication.get().getUser().getMemberId();
    }

    public static String l(char c6, String str, String str2) {
        return str + str2 + c6;
    }

    public static String m(int i7, String str) {
        return str + i7;
    }

    public static String n(int i7, String str, StringBuilder sb2) {
        sb2.append(i7);
        sb2.append(str);
        return sb2.toString();
    }

    public static String o(String str, String str2) {
        return str + str2;
    }

    public static String p(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String q(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String r(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String s(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static StringBuilder t(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static void u(int i7, org.greenrobot.eventbus.c cVar) {
        cVar.f(new MessageEvent(i7));
    }

    public static void v(O6.c cVar, boolean z3, boolean z8) {
        O6.d dVarG = cVar.g();
        dVarG.setCancelable(z3);
        dVarG.setCanceledOnTouchOutside(z8);
    }

    public static void w(Context context, int i7, SpanUtils spanUtils, TextView textView) {
        textView.setText(spanUtils.setForegroundColor(context.getColor(i7)).create());
    }

    public static void x(String str, String str2, TextView textView) {
        textView.setText(str + str2);
    }

    public static void y(String str, String str2, String str3, TextView textView) {
        textView.setText(str + str2 + str3);
    }

    public static void z(String str, String str2, String str3, String str4, String str5) {
        ARouter.getInstance().build(str).withString(str2, str3).withString(str4, str5).navigation();
    }
}
