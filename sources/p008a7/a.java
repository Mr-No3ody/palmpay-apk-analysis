package p008a7;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f11828a;

    static {
        Locale locale = Locale.ENGLISH;
        new SimpleDateFormat("MMM d, yyyy, h:mm a", locale);
        f11828a = new SimpleDateFormat("MMM d, yyyy", locale);
        new SimpleDateFormat("MMM, yyyy", locale);
    }
}
