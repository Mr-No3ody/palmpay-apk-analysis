package com.adjust.sdk.sig;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f19466a = Charset.forName(Constants.ENCODING);

    static {
        Charset.forName("UTF-16");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
    }
}
