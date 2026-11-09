package H4;

import com.github.xiaofeidev.shadow.round.RoundStatus;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements RoundStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f3691f;

    @Override // com.github.xiaofeidev.shadow.round.RoundStatus
    public final void fillRadius() {
        setRadius(this.f3686a);
        setTopLeftRadius(this.f3687b);
        setTopRightRadius(this.f3688c);
        setBottomRightRadius(this.f3690e);
        setBottomLeftRadius(this.f3689d);
    }

    @Override // com.github.xiaofeidev.shadow.round.RoundStatus
    public final float getBottomLeftRadius() {
        return this.f3689d;
    }

    @Override // com.github.xiaofeidev.shadow.round.RoundStatus
    public final float getBottomRightRadius() {
        return this.f3690e;
    }

    @Override // com.github.xiaofeidev.shadow.round.RoundStatus
    public final float getRadius() {
        return this.f3686a;
    }

    @Override // com.github.xiaofeidev.shadow.round.RoundStatus
    public final float[] getRadiusList() {
        return this.f3691f;
    }

    @Override // com.github.xiaofeidev.shadow.round.RoundStatus
    public final float getTopLeftRadius() {
        return this.f3687b;
    }

    @Override // com.github.xiaofeidev.shadow.round.RoundStatus
    public final float getTopRightRadius() {
        return this.f3688c;
    }

    @Override // com.github.xiaofeidev.shadow.round.RoundStatus
    public final void setBottomLeftRadius(float f10) {
        this.f3689d = f10;
        if (f10 >= 0.0f) {
            Arrays.fill(this.f3691f, 6, 8, f10);
        }
    }

    @Override // com.github.xiaofeidev.shadow.round.RoundStatus
    public final void setBottomRightRadius(float f10) {
        this.f3690e = f10;
        if (f10 >= 0.0f) {
            Arrays.fill(this.f3691f, 4, 6, f10);
        }
    }

    @Override // com.github.xiaofeidev.shadow.round.RoundStatus
    public final void setRadius(float f10) {
        this.f3686a = f10;
        Arrays.fill(this.f3691f, f10);
    }

    @Override // com.github.xiaofeidev.shadow.round.RoundStatus
    public final void setTopLeftRadius(float f10) {
        this.f3687b = f10;
        if (f10 >= 0.0f) {
            Arrays.fill(this.f3691f, 0, 2, f10);
        }
    }

    @Override // com.github.xiaofeidev.shadow.round.RoundStatus
    public final void setTopRightRadius(float f10) {
        this.f3688c = f10;
        if (f10 >= 0.0f) {
            Arrays.fill(this.f3691f, 2, 4, f10);
        }
    }
}
