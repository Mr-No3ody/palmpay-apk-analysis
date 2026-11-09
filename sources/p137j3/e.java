package p137j3;

import com.transsnet.palmpay.core.bean.message.MessageEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f38228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f38229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile d f38230c;

    static {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        f38228a = ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
        f38229b = MessageEvent.EVENT_GO_TO_PERSON_TRANSFER;
    }
}
