package p220oa;

import Ab.ViewOnFocusChangeListenerC0052d;
import B6.ViewOnClickListenerC0087i;
import C0.G;
import G8.a;
import Gb.T;
import Ja.ViewOnTouchListenerC0333f;
import Ja.z;
import L6.g;
import O6.c;
import O6.d;
import O6.e;
import Pa.C0525w;
import Pa.n0;
import Pa.r0;
import Ub.b;
import Vb.j;
import Wd.C0742p;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.custom_view.dialog.ToastDialog;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import org.sufficientlysecure.htmltextview.HtmlTextView;
import p140j8.f;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static final void A(View view, boolean z3, int i7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z3) {
            if (view.getVisibility() == 0) {
                return;
            }
            view.setVisibility(0);
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), i7));
            return;
        }
        if (view.getVisibility() == 8 || view.getVisibility() == 4) {
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), i7);
        animationLoadAnimation.setAnimationListener(new b(view, 3));
        view.startAnimation(animationLoadAnimation);
    }

    public static SpannableStringBuilder B(String str, Context context, Integer num, Integer num2, Integer num3, String str2, Typeface typeface, int i7) {
        Boolean bool = Boolean.TRUE;
        if ((i7 & 1) != 0) {
            context = null;
        }
        if ((i7 & 2) != 0) {
            num = null;
        }
        if ((i7 & 4) != 0) {
            num2 = null;
        }
        if ((i7 & 8) != 0) {
            num3 = null;
        }
        if ((i7 & 16) != 0) {
            str2 = null;
        }
        Boolean bool2 = (i7 & 32) != 0 ? null : bool;
        Boolean bool3 = (i7 & 64) != 0 ? null : bool;
        if ((i7 & 128) != 0) {
            typeface = null;
        }
        Boolean bool4 = (i7 & 512) == 0 ? bool : null;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (context == null) {
            context = BaseApplication.getContext();
        }
        SpanUtils spanUtilsI = G.i(str);
        if (num != null) {
            spanUtilsI.setForegroundColor(num.intValue());
        }
        if (num2 != null) {
            spanUtilsI.setForegroundColor(context.getColor(num2.intValue()));
        }
        if (num3 != null) {
            spanUtilsI.setFontSize(num3.intValue(), true);
        }
        if (str2 != null) {
            spanUtilsI.setFontFamily(str2);
        }
        if (bool2 != null && bool2.booleanValue()) {
            spanUtilsI.setBold();
        }
        if (typeface != null) {
            spanUtilsI.setTypeface(typeface);
        }
        if (bool3 != null && bool3.booleanValue()) {
            if (Intrinsics.c(bool2, bool)) {
                spanUtilsI.setTypeface(r0.K0(context, "fonts/PalmPayNum-Bold.ttf"));
            } else {
                spanUtilsI.setTypeface(r0.K0(context, "fonts/PalmPayNum-Regular.ttf"));
            }
        }
        if (bool4 != null && bool4.booleanValue()) {
            spanUtilsI.setStrikethrough();
        }
        SpannableStringBuilder spannableStringBuilderCreate = spanUtilsI.create();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
        return spannableStringBuilderCreate;
    }

    public static final void C(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    public static final void a(Activity activity, int i7, int i10) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            activity.overrideActivityTransition(0, i7, i10);
        } else {
            activity.overridePendingTransition(i7, i10);
        }
    }

    public static final c b(Context context, String str, Function1 function1, Function1 function2) {
        View viewInflate;
        Object objF;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Function1 zVar = new z(context, 3);
        String strJ = C0525w.j(str, "type");
        String strJ2 = C0525w.j(str, FirebaseAnalytics.Param.CONTENT);
        Function1 function3 = function1 == null ? zVar : function1;
        if (function2 != null) {
            zVar = function2;
        }
        if (context == null || TextUtils.isEmpty(strJ2) || !"dialog_style_1".equals(strJ)) {
            return null;
        }
        Intrinsics.e(strJ2);
        JSONObject jSONObject = new JSONObject(strJ2);
        ArrayList contents = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("contents");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i7);
                if (jSONObjectOptJSONObject != null) {
                    contents.add(new e(f.x("leftText", jSONObjectOptJSONObject), f.x("rightText", jSONObjectOptJSONObject)));
                }
            }
        }
        boolean zW = f.w(jSONObject, "verticalButton", "vertical_button", false);
        boolean zW2 = f.w(jSONObject, "showAtBottom", "show_at_bottom", false);
        String strX = f.x("title", jSONObject);
        String strX2 = f.x("message", jSONObject);
        String strX3 = f.x("topHeaderBg", jSONObject);
        String strX4 = f.x("topHeaderIcon", jSONObject);
        String strX5 = f.x("topIcon", jSONObject);
        String strX6 = f.x("secondHeader", jSONObject);
        String strX7 = f.x("mainButtonText", jSONObject);
        String strX8 = f.x("mainButtonAndroidLink", jSONObject);
        String strX9 = f.x("secondaryButtonText", jSONObject);
        String strX10 = f.x("secondaryButtonAndroidLink", jSONObject);
        String strX11 = f.x("contentBg", jSONObject);
        String strX12 = f.x("contentImg", jSONObject);
        String strX13 = f.x("messageGravity", jSONObject);
        boolean zW3 = f.w(jSONObject, "cancellable", "cancelable", true);
        Intrinsics.checkNotNullParameter(contents, "contents");
        c cVar = new c(context);
        String strE = f.e(strX);
        if (strE != null && !StringsKt.F(strE)) {
            cVar.f6597c = strE;
        }
        String strE2 = f.e(strX2);
        if (strE2 != null && !StringsKt.F(strE2)) {
            cVar.f6599e = strE2;
        }
        String strE3 = f.e(strX3);
        String strE4 = f.e(strX4);
        String strE5 = f.e(strX5);
        String strE6 = f.e(strX6);
        String strE7 = f.e(strX12);
        if (strE3 != null && !StringsKt.F(strE3)) {
            cVar.t = strE3;
        } else if (strE4 != null && !StringsKt.F(strE4)) {
            cVar.f6613s = strE4;
        }
        if (strE5 != null && !StringsKt.F(strE5)) {
            cVar.f6609o = strE5;
        }
        if (strE6 != null && !StringsKt.F(strE6)) {
            cVar.f6612r = strE6;
        }
        if (strE7 != null && !StringsKt.F(strE7)) {
            cVar.f6611q = strE7;
        }
        if (!contents.isEmpty()) {
            if (contents.isEmpty()) {
                viewInflate = null;
            } else {
                viewInflate = LayoutInflater.from(context).inflate(g.lib_ui_dialog_dynamic_contents, (ViewGroup) null, false);
                ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(L6.f.layoutRows);
                viewGroup.removeAllViews();
                if (!TextUtils.isEmpty(strX11)) {
                    try {
                        o oVar = q.f43977a;
                        objF = Integer.valueOf(Color.parseColor(strX11));
                    } catch (Throwable th) {
                        o oVar2 = q.f43977a;
                        objF = androidx.camera.core.impl.utils.executor.g.f(th);
                    }
                    if (!(objF instanceof p)) {
                        int iIntValue = ((Number) objF).intValue();
                        Drawable background = viewGroup.getBackground();
                        if (background != null) {
                            background.setTint(iIntValue);
                        }
                    }
                }
                Iterator it = contents.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        C1850q.k();
                        throw null;
                    }
                    e eVar = (e) next;
                    View viewInflate2 = LayoutInflater.from(context).inflate(g.lib_ui_item_dialog_kv_row, viewGroup, false);
                    HtmlTextView htmlTextView = (HtmlTextView) viewInflate2.findViewById(L6.f.tvLeft);
                    HtmlTextView htmlTextView2 = (HtmlTextView) viewInflate2.findViewById(L6.f.tvRight);
                    Iterator it2 = it;
                    String strE8 = f.e(eVar.f6654a);
                    if (strE8 == null) {
                        strE8 = "";
                    }
                    htmlTextView.setHtml(strE8);
                    String strE9 = f.e(eVar.f6655b);
                    if (strE9 == null) {
                        strE9 = "";
                    }
                    htmlTextView2.setHtml(strE9);
                    viewGroup.addView(viewInflate2);
                    i10 = i11;
                    it = it2;
                }
            }
            cVar.f6616w = viewInflate;
        }
        String strE10 = f.e(strX8);
        String strE11 = f.e(strX10);
        if (strX7 != null && !StringsKt.F(strX7)) {
            T t = new T(25, strE10, function3);
            cVar.f6600f = strX7;
            cVar.f6602h = t;
        }
        if (strX9 != null && !StringsKt.F(strX9)) {
            ViewOnClickListenerC0087i viewOnClickListenerC0087i = new ViewOnClickListenerC0087i(strE10, 16, zVar, strE11);
            cVar.f6601g = strX9;
            cVar.f6603i = viewOnClickListenerC0087i;
        }
        if (strX13 != null && !StringsKt.F(strX13)) {
            Locale locale = Locale.ENGLISH;
            String strQ = u.q(locale, "ENGLISH", strX13, locale, "toLowerCase(...)");
            int iHashCode = strQ.hashCode();
            if (iHashCode != -1364013995) {
                if (iHashCode != 3317767) {
                    if (iHashCode == 108511772 && strQ.equals(ViewProps.RIGHT)) {
                        cVar.f6606l = 5;
                    }
                } else if (strQ.equals(ViewProps.LEFT)) {
                    cVar.f6606l = 3;
                }
            } else if (strQ.equals("center")) {
                cVar.f6606l = 17;
            }
        }
        if (zW && zW2) {
            cVar.f6614u = 4;
        } else {
            if (!zW) {
                if (zW2) {
                    cVar.f6614u = 3;
                } else {
                    cVar.f6614u = 1;
                }
                cVar.f6605k = !zW3;
                cVar.f6617x = zW3;
                return cVar;
            }
            cVar.f6614u = 2;
        }
        cVar.f6605k = !zW3;
        cVar.f6617x = zW3;
        return cVar;
    }

    public static final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public static final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(4);
    }

    public static final boolean e(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static final void f(TextView textView, String str) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        textView.setText(Html.fromHtml(str, 63));
    }

    public static final void g(Activity activity, String eventId) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        n0.g().l(eventId);
    }

    public static final void h(E e10, String eventId) {
        Intrinsics.checkNotNullParameter(e10, "<this>");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        n0.g().v(eventId);
    }

    public static final void i(AbstractActivityC0837o abstractActivityC0837o, int i7, Fragment fragment) {
        Intrinsics.checkNotNullParameter(abstractActivityC0837o, "<this>");
        if (fragment != null) {
            Z supportFragmentManager = abstractActivityC0837o.getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1161a c1161a = new C1161a(supportFragmentManager);
            c1161a.e(i7, fragment, null);
            c1161a.h(true);
        }
    }

    public static final void j(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (num != null) {
                layoutParams2.topMargin = num.intValue();
            }
            if (num2 != null) {
                layoutParams2.leftMargin = num2.intValue();
            }
            if (num3 != null) {
                layoutParams2.rightMargin = num3.intValue();
            }
            if (num4 != null) {
                layoutParams2.bottomMargin = num4.intValue();
            }
            view.setLayoutParams(layoutParams2);
            return;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
            if (num != null) {
                layoutParams3.topMargin = num.intValue();
            }
            if (num2 != null) {
                layoutParams3.leftMargin = num2.intValue();
            }
            if (num3 != null) {
                layoutParams3.rightMargin = num3.intValue();
            }
            if (num4 != null) {
                layoutParams3.bottomMargin = num4.intValue();
            }
            view.setLayoutParams(layoutParams3);
            return;
        }
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams;
            if (num != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = num.intValue();
            }
            if (num2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = num2.intValue();
            }
            if (num3 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = num3.intValue();
            }
            if (num4 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = num4.intValue();
            }
            view.setLayoutParams(layoutParams4);
            return;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams;
            if (num != null) {
                layoutParams5.topMargin = num.intValue();
            }
            if (num2 != null) {
                layoutParams5.leftMargin = num2.intValue();
            }
            if (num3 != null) {
                layoutParams5.rightMargin = num3.intValue();
            }
            if (num4 != null) {
                layoutParams5.bottomMargin = num4.intValue();
            }
            view.setLayoutParams(layoutParams5);
            return;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (num != null) {
                marginLayoutParams.topMargin = num.intValue();
            }
            if (num2 != null) {
                marginLayoutParams.leftMargin = num2.intValue();
            }
            if (num3 != null) {
                marginLayoutParams.rightMargin = num3.intValue();
            }
            if (num4 != null) {
                marginLayoutParams.bottomMargin = num4.intValue();
            }
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static /* synthetic */ void k(View view, Integer num, Integer num2, Integer num3, Integer num4, int i7) {
        if ((i7 & 1) != 0) {
            num = null;
        }
        if ((i7 & 2) != 0) {
            num2 = null;
        }
        if ((i7 & 4) != 0) {
            num3 = null;
        }
        if ((i7 & 8) != 0) {
            num4 = null;
        }
        j(view, num, num2, num3, num4);
    }

    public static final void l(View.OnClickListener onClickListener, View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnClickListener(new j(2, onClickListener));
    }

    public static void m(TextView textView, Integer num) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setPadding(textView.getPaddingLeft(), num.intValue(), textView.getPaddingRight(), textView.getPaddingBottom());
    }

    public static void n(View view, int i7, float f10, float[] fArr, Integer num, int i10) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            fArr = null;
        }
        Integer num2 = (i10 & 8) != 0 ? null : 1;
        if ((i10 & 16) != 0) {
            num = null;
        }
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i7);
        if (num != null) {
            gradientDrawable.setStroke(num2 != null ? num2.intValue() : 1, num.intValue());
        }
        if (fArr != null) {
            gradientDrawable.setCornerRadii(fArr);
        } else {
            gradientDrawable.setCornerRadius(f10);
        }
        view.setBackground(gradientDrawable);
    }

    public static final void o(AppCompatTextView appCompatTextView, boolean z3) {
        Intrinsics.checkNotNullParameter(appCompatTextView, "<this>");
        if (z3) {
            appCompatTextView.setPaintFlags(appCompatTextView.getPaintFlags() | 16);
        } else {
            appCompatTextView.setPaintFlags(appCompatTextView.getPaintFlags() & (-17));
        }
    }

    public static final void p(TextView textView, boolean z3) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (z3) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        } else {
            textView.setPaintFlags(textView.getPaintFlags() & (-9));
        }
    }

    public static final void q(View.OnClickListener listener, View... views) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(views, "views");
        for (View view : views) {
            if (view != null) {
                view.setOnClickListener(listener);
            }
        }
    }

    public static final void r(EditText editText, TextWatcher textWatcher, View.OnFocusChangeListener onFocusChangeListener) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        int iDp2px = SizeUtils.dp2px(2.0f);
        editText.addTextChangedListener(new C0742p(3, editText, textWatcher));
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0052d(2, onFocusChangeListener, editText));
        editText.setOnTouchListener(new ViewOnTouchListenerC0333f(editText, iDp2px, 3));
    }

    public static final void s(View view, boolean z3) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z3 ? 0 : 8);
    }

    public static void t(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        IconicsDrawable iconicsDrawableX = a.x(context, S6.a.pay_InformationOutline, null, Integer.valueOf(L6.b.ppColorBackgroundLight), 32.0f, 114);
        ToastDialog toastDialog = new ToastDialog(context, t.cv_toast_dialog);
        toastDialog.setMessage(message);
        toastDialog.setTitle((String) null);
        toastDialog.setIcon(0);
        toastDialog.setIcon(iconicsDrawableX);
        toastDialog.setBackground(0);
        toastDialog.show(2000L);
    }

    public static final d u(Context context, String str, Function1 function1, Function1 function2, boolean z3) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        c cVarB = b(context, str, function1, function2);
        if (cVarB != null) {
            return z3 ? cVarB.g() : cVarB.a();
        }
        return null;
    }

    public static /* synthetic */ d v(Context context, String str, Function1 function1, Function1 function2, int i7) {
        if ((i7 & 2) != 0) {
            function1 = null;
        }
        if ((i7 & 4) != 0) {
            function2 = null;
        }
        return u(context, str, function1, function2, (i7 & 8) != 0);
    }

    public static final void w(Context context, CommonResult result) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        ToastUtils.showLong(result.getRespMsg(), new Object[0]);
    }

    public static final void x(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ToastUtils.showLong(str, new Object[0]);
    }

    public static final void y(Fragment fragment, String str) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        ToastUtils.showLong(str, new Object[0]);
    }

    public static void z(Context context, String message, S6.a aVar, DialogInterface.OnDismissListener onDismissListener, int i7) {
        Context context2;
        IconicsDrawable iconicsDrawableX;
        if ((i7 & 8) != 0) {
            aVar = S6.a.pay_SelectedOutline;
        }
        S6.a aVar2 = aVar;
        long j6 = (i7 & 16) != 0 ? 2000L : 3000L;
        if ((i7 & 32) != 0) {
            onDismissListener = null;
        }
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        if (aVar2 != null) {
            context2 = context;
            iconicsDrawableX = a.x(context2, aVar2, null, Integer.valueOf(L6.b.ppColorBackgroundLight), 32.0f, 114);
        } else {
            context2 = context;
            iconicsDrawableX = null;
        }
        ToastDialog toastDialog = new ToastDialog(context2, t.cv_toast_dialog);
        toastDialog.setMessage(message);
        toastDialog.setTitle((String) null);
        toastDialog.setIcon(0);
        toastDialog.setIcon(iconicsDrawableX);
        toastDialog.setBackground(0);
        toastDialog.show(j6);
        toastDialog.setOnDismissListener(onDismissListener);
    }
}
