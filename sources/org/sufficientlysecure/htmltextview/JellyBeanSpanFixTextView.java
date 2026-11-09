package org.sufficientlysecure.htmltextview;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class JellyBeanSpanFixTextView extends TextView {
    public JellyBeanSpanFixTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        He.a aVar;
        boolean z3;
        try {
            super.onMeasure(i7, i10);
        } catch (IndexOutOfBoundsException unused) {
            CharSequence text = getText();
            if (!(text instanceof Spanned)) {
                setText(getText().toString());
                super.onMeasure(i7, i10);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            System.currentTimeMillis();
            Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
            ArrayList arrayList = new ArrayList(spans.length);
            ArrayList arrayList2 = new ArrayList(spans.length);
            int length = spans.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    aVar = new He.a(false, (ArrayList) null, (ArrayList) null);
                    break;
                }
                Object obj = spans[i11];
                int spanStart = spannableStringBuilder.getSpanStart(obj);
                int i12 = spanStart - 1;
                if (i12 < 0 || i12 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i12) != ' ') {
                    spannableStringBuilder.insert(spanStart, (CharSequence) " ");
                    arrayList.add(obj);
                }
                int spanEnd = spannableStringBuilder.getSpanEnd(obj);
                if (spanEnd < 0 || spanEnd >= spannableStringBuilder.length() || spannableStringBuilder.charAt(spanEnd) != ' ') {
                    spannableStringBuilder.insert(spanEnd, (CharSequence) " ");
                    arrayList2.add(obj);
                }
                try {
                    continue;
                    setText(spannableStringBuilder);
                    super.onMeasure(i7, i10);
                    aVar = new He.a(true, arrayList, arrayList2);
                    break;
                } catch (IndexOutOfBoundsException unused2) {
                    i11++;
                }
            }
            if (aVar.f3864b) {
                Iterator it = ((ArrayList) aVar.f3866d).iterator();
                while (it.hasNext()) {
                    int spanEnd2 = spannableStringBuilder.getSpanEnd(it.next());
                    spannableStringBuilder.delete(spanEnd2, spanEnd2 + 1);
                    try {
                        setText(spannableStringBuilder);
                        super.onMeasure(i7, i10);
                    } catch (IndexOutOfBoundsException unused3) {
                        spannableStringBuilder.insert(spanEnd2, (CharSequence) " ");
                    }
                }
                Iterator it2 = ((ArrayList) aVar.f3865c).iterator();
                loop2: while (true) {
                    z3 = true;
                    while (it2.hasNext()) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(it2.next());
                        int i13 = spanStart2 - 1;
                        spannableStringBuilder.delete(i13, spanStart2);
                        try {
                            setText(spannableStringBuilder);
                            super.onMeasure(i7, i10);
                            z3 = false;
                        } catch (IndexOutOfBoundsException unused4) {
                            spannableStringBuilder.insert(i13, (CharSequence) " ");
                        }
                    }
                    break loop2;
                }
                if (z3) {
                    setText(spannableStringBuilder);
                    super.onMeasure(i7, i10);
                }
            } else {
                setText(getText().toString());
                super.onMeasure(i7, i10);
            }
            System.currentTimeMillis();
        }
    }

    public JellyBeanSpanFixTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JellyBeanSpanFixTextView(Context context) {
        super(context);
    }
}
