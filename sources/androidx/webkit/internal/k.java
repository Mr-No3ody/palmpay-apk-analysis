package androidx.webkit.internal;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f18302d = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18305c;

    public k(String str, String str2, int i7) {
        this.f18305c = i7;
        this.f18303a = str;
        this.f18304b = str2;
        f18302d.add(this);
    }
}
