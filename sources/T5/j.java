package T5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f9006a;

    static {
        HashMap map = new HashMap();
        map.put(i.f9003b, new HashSet(Arrays.asList(g.SIGN, g.VERIFY)));
        map.put(i.f9004c, new HashSet(Arrays.asList(g.ENCRYPT, g.DECRYPT, g.WRAP_KEY, g.UNWRAP_KEY)));
        f9006a = Collections.unmodifiableMap(map);
    }
}
