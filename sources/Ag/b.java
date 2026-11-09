package Ag;

import com.adjust.sdk.Constants;
import java.io.File;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f358b;

    static {
        String str = File.separator;
        Charset charsetForName = Charset.forName(Constants.ENCODING);
        f357a = charsetForName;
        f358b = charsetForName;
    }
}
