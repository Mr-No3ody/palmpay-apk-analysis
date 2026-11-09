package W3;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\nR\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R$\u0010%\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\r\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R$\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\r\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R$\u0010+\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\r\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011R$\u0010.\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\r\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0011¨\u00061"}, d2 = {"LW3/d;", "", "<init>", "()V", "", "configId", "J", "getConfigId", "()J", "setConfigId", "(J)V", "", "title", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "message", "f", "setMessage", "showInterval", "h", "setShowInterval", "showCount", "g", "setShowCount", "", "strategy", "I", "i", "()I", "setStrategy", "(I)V", "ignoreBtnText", "c", "setIgnoreBtnText", "ignoreBtnAndroidLink", "b", "setIgnoreBtnAndroidLink", "jumpBtnText", "e", "setJumpBtnText", "jumpBtnAndroidLink", "d", "setJumpBtnAndroidLink", "androidForceJumpLink", "a", "setAndroidForceJumpLink", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Nullable
    private String androidForceJumpLink;
    private long configId;

    @Nullable
    private String ignoreBtnAndroidLink;

    @Nullable
    private String ignoreBtnText;

    @Nullable
    private String jumpBtnAndroidLink;

    @Nullable
    private String jumpBtnText;

    @Nullable
    private String message;
    private long showCount;
    private long showInterval;
    private int strategy;

    @Nullable
    private String title;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAndroidForceJumpLink() {
        return this.androidForceJumpLink;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIgnoreBtnAndroidLink() {
        return this.ignoreBtnAndroidLink;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIgnoreBtnText() {
        return this.ignoreBtnText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getJumpBtnAndroidLink() {
        return this.jumpBtnAndroidLink;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getJumpBtnText() {
        return this.jumpBtnText;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getShowCount() {
        return this.showCount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getShowInterval() {
        return this.showInterval;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getStrategy() {
        return this.strategy;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
