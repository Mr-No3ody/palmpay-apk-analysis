package com.flexibank.sdk.core.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/flexibank/sdk/core/util/FlexiBankURLSpanNoUnderline;", "Landroid/text/style/URLSpan;", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankURLSpanNoUnderline extends URLSpan {
    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Uri uri = Uri.parse(getURL());
        Context context = widget.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            widget.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            intent.toString();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }
}
