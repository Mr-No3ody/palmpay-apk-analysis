package p061e3;

import android.content.Context;
import com.facebook.imagepipeline.debug.a;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import p019b3.e;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f36044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f36045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f36046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f36049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f36050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f36051i;

    public l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36044b = i.f36027b;
        this.f36047e = true;
        this.f36048f = -1;
        this.f36049g = new p(this);
        this.f36050h = true;
        this.f36051i = new a();
        this.f36043a = context;
    }
}
