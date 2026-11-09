package com.luck.picture.lib.basic;

import android.content.Context;
import android.content.ContextWrapper;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.language.PictureLanguageUtils;

/* JADX INFO: loaded from: classes3.dex */
public class PictureContextWrapper extends ContextWrapper {
    public PictureContextWrapper(Context context) {
        super(context);
    }

    public static ContextWrapper wrap(Context context, int i7, int i10) {
        if (i7 != -2) {
            PictureLanguageUtils.setAppLanguage(context, i7, i10);
        }
        return new PictureContextWrapper(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        return PictureMimeType.MIME_TYPE_PREFIX_AUDIO.equals(str) ? getApplicationContext().getSystemService(str) : super.getSystemService(str);
    }
}
