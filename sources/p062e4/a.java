package p062e4;

import Ed.ViewOnFocusChangeListenerC0235o;
import Ja.ViewOnTouchListenerC0333f;
import Wd.C0742p;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public static final void b(View view, Integer num, Integer num2, Integer num3, Integer num4) {
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
            layoutParams2.bottomMargin = num4.intValue();
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
            layoutParams3.bottomMargin = num4.intValue();
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
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = num4.intValue();
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
            layoutParams5.bottomMargin = num4.intValue();
            view.setLayoutParams(layoutParams5);
        }
    }

    public static void c(AppCompatEditText appCompatEditText, TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(appCompatEditText, "<this>");
        int iDp2px = SizeUtils.dp2px(2.0f);
        appCompatEditText.addTextChangedListener(new C0742p(2, appCompatEditText, textWatcher));
        appCompatEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(appCompatEditText, 16));
        appCompatEditText.setOnTouchListener(new ViewOnTouchListenerC0333f(appCompatEditText, iDp2px, 2));
    }

    public static final void d(View view, boolean z3) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z3 ? 0 : 8);
    }

    public static final void e(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }
}
