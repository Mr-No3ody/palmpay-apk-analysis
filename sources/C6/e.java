package C6;

import com.palmpay.lib.liveness.video.VideoActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VideoActivity f1165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VideoActivity f1167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(VideoActivity videoActivity, Ff.c cVar) {
        super(cVar);
        this.f1167c = videoActivity;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f1166b = obj;
        this.f1168d |= Integer.MIN_VALUE;
        return VideoActivity.e(this.f1167c, this);
    }
}
