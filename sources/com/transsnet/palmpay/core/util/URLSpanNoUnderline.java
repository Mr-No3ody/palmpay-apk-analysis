package com.transsnet.palmpay.core.util;

import F6.d;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class URLSpanNoUnderline extends URLSpan {
    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        Uri uri = Uri.parse(getURL());
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            view.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            d.h("URLSpan", 5, "Actvity was not found for intent, " + intent.toString());
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
