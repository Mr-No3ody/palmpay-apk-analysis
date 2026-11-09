package androidx.appcompat.widget;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class V0 extends androidx.emoji2.text.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f12845a;

    public V0(SwitchCompat switchCompat) {
        this.f12845a = new WeakReference(switchCompat);
    }

    @Override // androidx.emoji2.text.g
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.f12845a.get();
        if (switchCompat != null) {
            switchCompat.onEmojiCompatInitializedForSwitchText();
        }
    }

    @Override // androidx.emoji2.text.g
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.f12845a.get();
        if (switchCompat != null) {
            switchCompat.onEmojiCompatInitializedForSwitchText();
        }
    }
}
