package org.sufficientlysecure.htmltextview;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends LinkMovementMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static r f41145a;

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1 && action != 0) {
            return Touch.onTouchEvent(textView, spannable, motionEvent);
        }
        int x3 = (int) motionEvent.getX();
        int y8 = (int) motionEvent.getY();
        int totalPaddingLeft = x3 - textView.getTotalPaddingLeft();
        int totalPaddingTop = y8 - textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX() + totalPaddingLeft;
        int scrollY = textView.getScrollY() + totalPaddingTop;
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length == 0) {
            Selection.removeSelection(spannable);
            Touch.onTouchEvent(textView, spannable, motionEvent);
            return false;
        }
        if (action == 1) {
            clickableSpanArr[0].onClick(textView);
        } else if (action == 0) {
            Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
        }
        return true;
    }
}
